package net.gecko.varandeco.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class DecoItemGroup {
    public static final ItemGroup VARAN_DECO_BUILDING = FabricItemGroupBuilder.build(
            new Identifier(VaranDeco.MOD_ID,"varan_deco_blocks"), () -> new ItemStack(DecoBlocks.STONE_TILES));

    public static final ItemGroup VARAN_DECO_DECORATION = FabricItemGroupBuilder.build(
            new Identifier(VaranDeco.MOD_ID,"varan_deco_decoration"), () -> new ItemStack(DecoBlocks.YELLOW_TULIP));

    public static final ItemGroup VARAN_DECO_REDSTONE = FabricItemGroupBuilder.build(
            new Identifier(VaranDeco.MOD_ID,"varan_deco_redstone"), () -> new ItemStack(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE));

    public static final ItemGroup VARAN_DECO_ITEMS = FabricItemGroupBuilder.build(
            new Identifier(VaranDeco.MOD_ID,"varan_deco_items"), () -> new ItemStack(DecoItems.BUBBLE_ORB));
}
