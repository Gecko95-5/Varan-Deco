package net.gecko.varandeco.util;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.gecko.varandeco.block.DecoBlocks;

import static net.gecko.varandeco.block.DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE;

public class DecoOxidizableBlocks {
    public static void registerOxidizableBlocks(){
        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.HEAVY_COPPER_BARS, DecoBlocks.EXPOSED_HEAVY_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS, DecoBlocks.WEATHERED_HEAVY_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS, DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.COPPER_BARS, DecoBlocks.EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.EXPOSED_COPPER_BARS, DecoBlocks.WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.WEATHERED_COPPER_BARS, DecoBlocks.OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.LIGHT_COPPER_BARS, DecoBlocks.EXPOSED_LIGHT_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS, DecoBlocks.WEATHERED_LIGHT_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS, DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.COPPER_LANTERN, DecoBlocks.EXPOSED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.EXPOSED_COPPER_LANTERN, DecoBlocks.WEATHERED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.WEATHERED_COPPER_LANTERN, DecoBlocks.OXIDIZED_COPPER_LANTERN);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.COPPER_SOUL_LANTERN, DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN, DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN, DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.COPPER_CHAIN, DecoBlocks.EXPOSED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.EXPOSED_COPPER_CHAIN, DecoBlocks.WEATHERED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.WEATHERED_COPPER_CHAIN, DecoBlocks.OXIDIZED_COPPER_CHAIN);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE, EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE);

    }
    public static void registerWaxableBlocks(){
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.HEAVY_COPPER_BARS, DecoBlocks.WAXED_HEAVY_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS, DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS, DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS, DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS);

        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.COPPER_BARS, DecoBlocks.WAXED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.EXPOSED_COPPER_BARS, DecoBlocks.WAXED_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.WEATHERED_COPPER_BARS, DecoBlocks.WAXED_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.OXIDIZED_COPPER_BARS, DecoBlocks.WAXED_OXIDIZED_COPPER_BARS);

        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.LIGHT_COPPER_BARS, DecoBlocks.WAXED_LIGHT_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS, DecoBlocks.WAXED_EXPOSED_LIGHT_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS, DecoBlocks.WAXED_WEATHERED_LIGHT_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS, DecoBlocks.WAXED_OXIDIZED_LIGHT_COPPER_BARS);

        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.COPPER_LANTERN, DecoBlocks.WAXED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.EXPOSED_COPPER_LANTERN, DecoBlocks.WAXED_EXPOSED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.WEATHERED_COPPER_LANTERN, DecoBlocks.WAXED_WEATHERED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.OXIDIZED_COPPER_LANTERN, DecoBlocks.WAXED_OXIDIZED_COPPER_LANTERN);

        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.COPPER_SOUL_LANTERN, DecoBlocks.WAXED_COPPER_SOUL_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN, DecoBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN, DecoBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN, DecoBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN);

        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.COPPER_CHAIN, DecoBlocks.WAXED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.EXPOSED_COPPER_CHAIN, DecoBlocks.WAXED_EXPOSED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.WEATHERED_COPPER_CHAIN, DecoBlocks.WAXED_WEATHERED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.OXIDIZED_COPPER_CHAIN, DecoBlocks.WAXED_OXIDIZED_COPPER_CHAIN);

        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.WAXED_COPPER_WEIGHT_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE, DecoBlocks.WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE);
    }
}
