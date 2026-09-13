package com.invictus.mekanismmod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

/**
 * BlockEntity para o Reator de Fissão Nuclear
 * Gerencia combustível, temperatura, geração de energia e segurança
 */
public class FissionReactorBlockEntity extends BlockEntity {
    
    // Capacidade de combustível (Pellets)
    private static final int MAX_FUEL = 64;
    private int fuelLevel = 0;
    
    // Temperatura do reator (em Kelvin)
    private static final int MAX_TEMPERATURE = 1273; // ~1000°C
    private static final int CRITICAL_TEMPERATURE = 1173; // ~900°C
    private int temperature = 20; // Room temperature
    
    // Energia gerada (RF - Redstone Flux)
    private static final int MAX_ENERGY = 100000;
    private int energyStored = 0;
    
    // Taxa de geração de energia por tick
    private static final int ENERGY_GENERATION_RATE = 80; // RF por tick
    
    // Coolant para refrigeração
    private static final int MAX_COOLANT = 64;
    private int coolantLevel = 0;
    
    // Status
    private boolean isActive = false;
    private boolean isCritical = false;
    private int ticksRunning = 0;

    public FissionReactorBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(BlockEntityType.FURNACE, pPos, pBlockState); // Placeholder
    }

    public void tick() {
        if (fuelLevel > 0 && coolantLevel > 0) {
            isActive = true;
            
            // Gera calor e energia
            temperature += 5;
            energyStored = Math.min(energyStored + ENERGY_GENERATION_RATE, MAX_ENERGY);
            fuelLevel--;
            coolantLevel--;
            ticksRunning++;
            
            // Verifica se atingiu temperatura crítica
            if (temperature >= CRITICAL_TEMPERATURE) {
                isCritical = true;
            }
            
            // Refrigeração
            temperature = Math.max(temperature - 3, 20);
        } else {
            isActive = false;
            temperature = Math.max(temperature - 5, 20);
        }
    }

    // Getters e Setters
    public int getFuelLevel() { return fuelLevel; }
    public void setFuelLevel(int level) { this.fuelLevel = Math.min(level, MAX_FUEL); }
    public int getMaxFuel() { return MAX_FUEL; }

    public int getTemperature() { return temperature; }
    public int getMaxTemperature() { return MAX_TEMPERATURE; }
    public int getCriticalTemperature() { return CRITICAL_TEMPERATURE; }

    public int getEnergyStored() { return energyStored; }
    public void setEnergyStored(int energy) { this.energyStored = Math.min(energy, MAX_ENERGY); }
    public int getMaxEnergy() { return MAX_ENERGY; }

    public int getCoolantLevel() { return coolantLevel; }
    public void setCoolantLevel(int level) { this.coolantLevel = Math.min(level, MAX_COOLANT); }
    public int getMaxCoolant() { return MAX_COOLANT; }

    public boolean isActive() { return isActive; }
    public boolean isCritical() { return isCritical; }
    public int getTicksRunning() { return ticksRunning; }

    @Override
    public void load(CompoundTag pTag) {
        super.load(pTag);
        this.fuelLevel = pTag.getInt("Fuel");
        this.temperature = pTag.getInt("Temperature");
        this.energyStored = pTag.getInt("Energy");
        this.coolantLevel = pTag.getInt("Coolant");
        this.ticksRunning = pTag.getInt("TicksRunning");
    }

    @Override
    protected void saveAdditional(CompoundTag pTag) {
        super.saveAdditional(pTag);
        pTag.putInt("Fuel", this.fuelLevel);
        pTag.putInt("Temperature", this.temperature);
        pTag.putInt("Energy", this.energyStored);
        pTag.putInt("Coolant", this.coolantLevel);
        pTag.putInt("TicksRunning", this.ticksRunning);
    }
}
