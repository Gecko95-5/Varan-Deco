package net.gecko.varandeco.item;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.projectile.SnowBrickItem;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DecoItems {

    public static final Item CACTUS_SIGN = registerItem("cactus_sign",
            new SignItem(new Item.Settings().maxCount(16).group(DecoItemGroup.VARAN_DECO_BLOCKS),
                    DecoBlocks.STANDING_CACTUS_SIGN, DecoBlocks.WALL_CACTUS_SIGN));
    public static final Item WOODEN_SIGN = registerItem("wooden_sign",
            new SignItem(new Item.Settings().maxCount(16).group(DecoItemGroup.VARAN_DECO_BLOCKS),
                    DecoBlocks.STANDING_WOODEN_SIGN, DecoBlocks.WALL_WOODEN_SIGN));

    public static final Item SNOW_BRICK = registerItem("snow_brick",
            new SnowBrickItem(new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS).maxCount(16)));

    public static final Item BUBBLE_ORB = registerItem("bubble_orb",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));

    public static final Item WARPED_WART = registerItem("warped_wart",
            new AliasedBlockItem(DecoBlocks.WARPED_WART_PLANT,new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));

    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(VaranDeco.MOD_ID, name),item);
    }

    public static void registerDecoItems() {
        VaranDeco.LOGGER.debug("Registering Items for" + VaranDeco.MOD_ID);
    }
}
