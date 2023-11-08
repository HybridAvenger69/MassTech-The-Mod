package com.hybridavenger69.mttm.items.tools.util;

import net.minecraft.nbt.Tag;
import net.minecraftforge.energy.IEnergyStorage;

public class ToolEnergy implements IEnergyStorage {
    private int energy;
    private int capacity;
    private int maxRecieve;
    private int maxExtract;

    public ToolEnergy(int capacity, int maxRecieve, int maxExtract){
        this.capacity = capacity;
        this.maxRecieve = maxRecieve;
        this.maxExtract = maxExtract;
    }

    @Override
    public int receiveEnergy(int maxReceive, boolean simulate) {
        int energyReceived = Math.min(capacity - energy, Math.min(this.maxRecieve, maxReceive));
        if (!simulate) {
            energy += energyReceived;
        }
        return energyReceived;
    }

    @Override
    public int extractEnergy(int maxExtract, boolean simulate) {
        int energyExtracted = Math.min(energy, Math.min(this.maxExtract, maxExtract));
        if (!simulate) {
            energy -= energyExtracted;
        }
        return energyExtracted;
    }

    @Override
    public int getEnergyStored() {
        return energy;
    }

    @Override
    public int getMaxEnergyStored() {
        return capacity;
    }

    @Override
    public boolean canExtract() {
        return true;
    }

    @Override
    public boolean canReceive() {
        return true;
    }

    public Tag serializeNBT() {
        return null;
    }
}
