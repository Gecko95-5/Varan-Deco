package net.gecko.varandeco.item;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.projectile.SnowBrickItem;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SignItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DecoItems {
    public static final Item SNOW_BRICK = registerItem("snow_brick",
            new SnowBrickItem(new Item.Settings().group(DecoItemGroup.VARAN_DECO_ITEMS).maxCount(16)));

    public static final Item CACTUS_SIGN = registerItem("cactus_sign",
            new SignItem(new Item.Settings().maxCount(16).group(ItemGroup.DECORATIONS),
                    DecoBlocks.STANDING_CACTUS_SIGN, DecoBlocks.WALL_CACTUS_SIGN));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(VaranDeco.MOD_ID, name),item);
    }

    public static void registerDecoItems() {
        VaranDeco.LOGGER.debug("Registering Items for" + VaranDeco.MOD_ID);
    }
}
