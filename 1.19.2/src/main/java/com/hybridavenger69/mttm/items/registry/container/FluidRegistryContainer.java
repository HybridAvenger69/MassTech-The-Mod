package com.hybridavenger69.mttm.items.registry.container;

import com.hybridavenger69.mttm.blocks.BlockRegistry;
import com.hybridavenger69.mttm.items.registry.FluidRegistry;
import com.hybridavenger69.mttm.items.registry.ItemRegistry;
import com.mojang.blaze3d.shaders.FogShape;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.math.Vector3f;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.RegistryObject;
import org.apache.commons.lang3.function.TriFunction;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FluidRegistryContainer {


    public final RegistryObject<FluidType> type;
    public final FluidType.Properties typeProperties;
    public final RegistryObject<LiquidBlock> block;
    public final RegistryObject<BucketItem> bucket;
    private ForgeFlowingFluid.Properties properties;
    public final RegistryObject<ForgeFlowingFluid.Source> source;
    public final RegistryObject<ForgeFlowingFluid.Flowing> flowing;

    public FluidRegistryContainer(String name, FluidType.Properties typeProperties,
                                  Supplier<IClientFluidTypeExtensions> clientExtensions, @Nullable AdditionalProperties additionalProperties,
                                  BlockBehaviour.Properties blockProperties, Item.Properties itemProperties) {
        this.typeProperties = typeProperties;
        this.type = FluidRegistry.FLUID_TYPES.register(name, () -> new FluidType(this.typeProperties) {
            @Override
            public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
                consumer.accept(clientExtensions.get());
            }
        });

        this.source = FluidRegistry.FLUIDS.register(name + "_source", () -> new ForgeFlowingFluid.Source(this.properties));
        this.flowing = FluidRegistry.FLUIDS.register(name + "_flowing",
                () -> new ForgeFlowingFluid.Flowing(this.properties));

        this.properties = new ForgeFlowingFluid.Properties(this.type, this.source, this.flowing);
        if (additionalProperties != null) {
            this.properties.explosionResistance(additionalProperties.explosionResistance)
                    .levelDecreasePerBlock(additionalProperties.levelDecreasePerBlock)
                    .slopeFindDistance(additionalProperties.slopeFindDistance).tickRate(additionalProperties.tickRate);
        }

        this.block = BlockRegistry.BLOCKS.register(name, () -> new LiquidBlock(this.source, blockProperties));
        this.properties.block(this.block);

        this.bucket = ItemRegistry.ITEMS.register(name + "_bucket", () -> new BucketItem(this.source, itemProperties));
        this.properties.bucket(this.bucket);
    }

    public FluidRegistryContainer(String name, FluidType.Properties typeProperties,
                                  Supplier<IClientFluidTypeExtensions> clientExtensions, BlockBehaviour.Properties blockProperties,
                                  Item.Properties itemProperties) {
        this(name, typeProperties, clientExtensions, null, blockProperties, itemProperties);
    }

    public ForgeFlowingFluid.Properties getProperties() {
        return this.properties;
    }

    public static IClientFluidTypeExtensions createExtension(ClientExtensions extensions) {
        return new IClientFluidTypeExtensions() {
            @Override
            public ResourceLocation getFlowingTexture() {
                return extensions.flowing;
            }

            @Nullable
            @Override
            public ResourceLocation getOverlayTexture() {
                return extensions.overlay;
            }

            @Override
            public ResourceLocation getRenderOverlayTexture(Minecraft minecraft) {
                return extensions.renderOverlay;
            }

            @Override
            public ResourceLocation getStillTexture() {
                return extensions.still;
            }

            @Override
            public int getTintColor(FluidState state, BlockAndTintGetter getter, BlockPos pos) {
                return extensions.tintFunction == null ? 0xFFFFFFFF : extensions.tintFunction.apply(state, getter, pos);
            }

            @Override
            public @NotNull Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level,
                                                    int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
                return extensions.fogColor == null
                        ? IClientFluidTypeExtensions.super.modifyFogColor(camera, partialTick, level, renderDistance,
                        darkenWorldAmount, fluidFogColor)
                        : extensions.fogColor;
            }

            @Override
            public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick,
                                        float nearDistance, float farDistance, FogShape shape) {
                RenderSystem.setShaderFogStart(1f);
                RenderSystem.setShaderFogEnd(6f);
            }
        };
    }

    public static class AdditionalProperties {
        private int levelDecreasePerBlock = 1;
        private float explosionResistance = 1;
        private int slopeFindDistance = 4;
        private int tickRate = 5;

        public AdditionalProperties explosionResistance(float resistance) {
            this.explosionResistance = resistance;
            return this;
        }

        public AdditionalProperties levelDecreasePerBlock(int decrease) {
            this.levelDecreasePerBlock = decrease;
            return this;
        }

        public AdditionalProperties slopeFindDistance(int distance) {
            this.slopeFindDistance = distance;
            return this;
        }

        public AdditionalProperties tickRate(int rate) {
            this.tickRate = rate;
            return this;
        }
    }

    public static class ClientExtensions {
        private ResourceLocation still;
        private ResourceLocation flowing;
        private ResourceLocation overlay;
        private ResourceLocation renderOverlay;
        private Vector3f fogColor;
        private TriFunction<FluidState, BlockAndTintGetter, BlockPos, Integer> tintFunction;

        private final String MOD_ID;

        public ClientExtensions(String MOD_ID, String fluidName) {
            this.MOD_ID = MOD_ID;
            still(fluidName);
            flowing(fluidName);
            overlay(fluidName);
        }

        public ClientExtensions flowing(String name) {
            return flowing(name, "block");
        }

        public ClientExtensions flowing(String name, String folder) {
            this.flowing = new ResourceLocation(this.MOD_ID, folder + "/" + name + "_flowing");
            return this;
        }

        public ClientExtensions fogColor(float red, float green, float blue) {
            this.fogColor = new Vector3f(red, green, blue);
            return this;
        }

        public ClientExtensions overlay(String name) {
            return overlay(name, "block");
        }

        public ClientExtensions overlay(String name, String folder) {
            this.overlay = new ResourceLocation(this.MOD_ID, folder + "/" + name + "_overlay");
            return renderOverlay(new ResourceLocation(this.MOD_ID, "textures/" + folder + "/" + name + "_overlay.png"));
        }

        public ClientExtensions renderOverlay(ResourceLocation path) {
            this.renderOverlay = path;
            return this;
        }

        public ClientExtensions still(String name) {
            return still(name, "block");
        }

        public ClientExtensions still(String name, String folder) {
            this.still = new ResourceLocation(this.MOD_ID, folder + "/" + name + "_still");
            return this;
        }

        public ClientExtensions tint(int tint) {
            this.tintFunction = ($0, $1, $2) -> tint;
            return this;
        }

        public ClientExtensions tint(TriFunction<FluidState, BlockAndTintGetter, BlockPos, Integer> tinter) {
            this.tintFunction = tinter;
            return this;
        }
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        LivingEntity player = event.player;
        if (player.isAlive() && isPlayerInColdFluid(player)) {
            player.hurt(DamageSource.FREEZE, 1.0F); // Inflict freezing damage
        }
    }

    private boolean isPlayerInColdFluid(LivingEntity player) {
        BlockState blockState = player.getLevel().getBlockState(player.getOnPos());
        FluidState fluidState = blockState.getFluidState();

        return fluidState.getFluidType().getTemperature() < 0; // Check if fluid is cold
    }
}


