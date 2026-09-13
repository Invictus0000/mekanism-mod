package com.invictus.mekanismmod.recipe;

import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import com.invictus.mekanismmod.MekanismMod;

public class ModRecipes {
    
    /**
     * Receitas para o mod Mekanism
     * 
     * Crafting Recipes:
     * - Steel Ingot: Iron Ingot + Coal = Steel Ingot
     * - Reinforced Alloy: Steel Ingot + Diamond = Reinforced Alloy
     * - Advanced Circuit: Redstone + Gold Ingot + Diamond = Advanced Circuit
     * - Fission Fuel Pellet: Enriched Uranium + Glowstone = Fission Fuel Pellet
     */
    
    public static final ResourceLocation STEEL_INGOT_ID = new ResourceLocation(MekanismMod.MOD_ID, "steel_ingot");
    public static final ResourceLocation REINFORCED_ALLOY_ID = new ResourceLocation(MekanismMod.MOD_ID, "reinforced_alloy");
    public static final ResourceLocation ADVANCED_CIRCUIT_ID = new ResourceLocation(MekanismMod.MOD_ID, "advanced_circuit");
    public static final ResourceLocation FISSION_FUEL_PELLET_ID = new ResourceLocation(MekanismMod.MOD_ID, "fission_fuel_pellet");
}
