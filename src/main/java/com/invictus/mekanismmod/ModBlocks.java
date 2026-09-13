package com.invictus.mekanismmod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MekanismMod.MOD_ID);

    // Minérios
    public static final RegistryObject<Block> URANIUM_ORE = BLOCKS.register("uranium_ore",
            () -> new Block(Block.Properties.of()
                    .mapColor(MapColor.STONE)
                    .instrument(net.minecraft.world.level.block.state.properties.NoteBlockInstrument.BASEDRUM)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 3.0F)));

    // Máquinas do Reator
    public static final RegistryObject<Block> FISSION_REACTOR_CORE = BLOCKS.register("fission_reactor_core",
            () -> new Block(Block.Properties.of()
                    .mapColor(MapColor.METAL)
                    .instrument(net.minecraft.world.level.block.state.properties.NoteBlockInstrument.IRON_XYLOPHONE)
                    .requiresCorrectToolForDrops()
                    .strength(5.0F, 6.0F)));

    public static final RegistryObject<Block> FISSION_REACTOR_CASING = BLOCKS.register("fission_reactor_casing",
            () -> new Block(Block.Properties.of()
                    .mapColor(MapColor.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 5.0F)));

    public static final RegistryObject<Block> FISSION_FUEL_ASSEMBLY = BLOCKS.register("fission_fuel_assembly",
            () -> new Block(Block.Properties.of()
                    .mapColor(MapColor.METAL)
                    .requiresCorrectToolForDrops()
                    .strength(3.0F, 4.0F)));

    // Componentes de energia
    public static final RegistryObject<Block> ENERGY_CORE = BLOCKS.register("energy_core",
            () -> new Block(Block.Properties.of()
                    .mapColor(MapColor.DIAMOND)
                    .requiresCorrectToolForDrops()
                    .strength(4.0F, 5.0F)));

    // Armazenamento
    public static final RegistryObject<Block> UNIVERSAL_CABLE = BLOCKS.register("universal_cable",
            () -> new Block(Block.Properties.of()
                    .mapColor(MapColor.METAL)
                    .strength(2.0F, 3.0F)));
}
