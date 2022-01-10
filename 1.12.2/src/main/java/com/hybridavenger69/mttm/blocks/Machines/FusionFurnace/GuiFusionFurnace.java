package com.hybridavenger69.mttm.blocks.Machines.FusionFurnace;

import com.hybridavenger69.mttm.utils.Reference;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiFusionFurnace extends GuiContainer {

    private static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/gui/Fusion_Furnace.png");
    private final InventoryPlayer player;
    private final TileEntityFusionFurnace tileEntityFusionFurnace;

    public GuiFusionFurnace(InventoryPlayer player, TileEntityFusionFurnace tileEntityFusionFurnace) {
        super(new ContainerFusionFurnace(player, tileEntityFusionFurnace));
        this.player = player;
        this.tileEntityFusionFurnace = tileEntityFusionFurnace;
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        super.drawScreen(mouseX, mouseY, partialTicks);
        this.renderHoveredToolTip(mouseX, mouseY);
    }

    @Override
    protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
        String tileName = this.tileEntityFusionFurnace.getDisplayName().getUnformattedText();
        this.fontRenderer.drawString(tileName, (this.xSize / 2 - this.fontRenderer.getStringWidth(tileName) / 2), 5, 4210752);
        this.fontRenderer.drawString(this.player.getDisplayName().getUnformattedText(), 8, this.ySize - 96 + 2, 4210752);
    }

    @Override
    protected void drawGuiContainerBackgroundLayer(float partialTicks, int mouseX, int mouseY) {
        GlStateManager.color(1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(TEXTURES);
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);

        if (TileEntityFusionFurnace.isBurning(tileEntityFusionFurnace)) {
            int k = this.getBurnLeftScaled(13);
            this.drawTexturedModalRect(this.guiLeft + 18, this.guiTop + 48 - k, 176, 12 - k, 14, k + 1);
        }

        int l = this.getCookProgressScaled(62);
        this.drawTexturedModalRect(this.guiLeft + 40, this.guiTop + 35, 176, 14, l + 1, 16);
    }

    private int getBurnLeftScaled(int pixels) {
        int i = this.tileEntityFusionFurnace.getField(1);
        if (i == 0) i = 150;
        return this.tileEntityFusionFurnace.getField(0) * pixels / i;
    }

    private int getCookProgressScaled(int pixels) {
        int i = this.tileEntityFusionFurnace.getField(2);
        int j = this.tileEntityFusionFurnace.getField(3);
        return j != 0 && i != 0 ? i * pixels / j : 0;
    }
}

