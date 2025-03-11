package net.gecko.varandeco.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class DecoItemGroup {
    public static final ItemGroup VARAN_DECO_BLOCKS = FabricItemGroupBuilder.build(
            new Identifier(VaranDeco.MOD_ID,"varan_deco_blocks"), () -> new ItemStack(DecoBlocks.STONE_TILES));
    public static final ItemGroup VARAN_DECO_ITEMS = FabricItemGroupBuilder.build(
            new Identifier(VaranDeco.MOD_ID,"varan_deco_items"), () -> new ItemStack(DecoItems.SNOW_BRICK));
}
