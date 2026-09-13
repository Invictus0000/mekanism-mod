package com.invictus.mekanismmod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MekanismMod.MOD_ID);

    // Recursos
    public static final RegistryObject<Item> URANIUM_ORE = ITEMS.register("uranium_ore",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> ENRICHED_URANIUM = ITEMS.register("enriched_uranium",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> PLUTONIUM = ITEMS.register("plutonium",
            () -> new Item(new Item.Properties()));

    // Combustível do Reator
    public static final RegistryObject<Item> FISSION_FUEL_PELLET = ITEMS.register("fission_fuel_pellet",
            () -> new Item(new Item.Properties()));

    // Componentes de máquinas
    public static final RegistryObject<Item> ADVANCED_CIRCUIT = ITEMS.register("advanced_circuit",
            () -> new Item(new Item.Properties()));
    
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> REINFORCED_ALLOY = ITEMS.register("reinforced_alloy",
            () -> new Item(new Item.Properties()));
}
