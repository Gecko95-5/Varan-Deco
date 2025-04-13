package net.gecko.varandeco.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class DecoItemGroup {
    public static ItemGroup VARAN_DECO;

    public static void registerItemGroup() {
        VARAN_DECO = FabricItemGroup.builder(new Identifier(VaranDeco.MOD_ID, "varan_deco"))
                .displayName(Text.literal("Varan Deco Blocks"))
                .icon(() -> new ItemStack(DecoBlocks.STONE_TILES)).build();

    }
}
