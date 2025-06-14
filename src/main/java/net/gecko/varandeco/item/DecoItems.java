package net.gecko.varandeco.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.custom.BubbleItem;
import net.gecko.varandeco.item.custom.SnowBrickItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DecoItems {

    public static final Item CACTUS_SIGN = registerItem("cactus_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_CACTUS_SIGN, DecoBlocks.WALL_CACTUS_SIGN));
    public static final Item WOODEN_SIGN = registerItem("wooden_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_WOODEN_SIGN, DecoBlocks.WALL_WOODEN_SIGN));

    public static final Item SNOW_BRICK = registerItem("snow_brick",
            new SnowBrickItem(new Item.Settings().maxCount(16)));

    public static final Item BUBBLE_ORB = registerItem("bubble_orb",
            new BubbleItem(new Item.Settings()));

    public static final Item WARPED_WART = registerItem("warped_wart",
            new AliasedBlockItem(DecoBlocks.WARPED_WART_PLANT,new Item.Settings()));

    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new Item.Settings()));

    public static final Item LILAC_FLOWER = registerItem("lilac_flower",
            new Item(new Item.Settings()));

    public static final Item LILAC_STEW = registerItem("lilac_stew",
            new StewItem(new Item.Settings().food(DecoFoodComponents.LILAC_STEW)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(VaranDeco.MOD_ID, name),item);
    }
    public static void addItemsToItemGroups() {
        addToItemGroup(DecoItemGroup.VARAN_DECO, CACTUS_SIGN);
        addToItemGroup(DecoItemGroup.VARAN_DECO, WOODEN_SIGN);
        addToItemGroup(DecoItemGroup.VARAN_DECO, SNOW_BRICK);
        addToItemGroup(DecoItemGroup.VARAN_DECO, BUBBLE_ORB);
        addToItemGroup(DecoItemGroup.VARAN_DECO, WARPED_WART);
        addToItemGroup(DecoItemGroup.VARAN_DECO, COPPER_NUGGET);
        addToItemGroup(DecoItemGroup.VARAN_DECO, LILAC_FLOWER);
    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerDecoItems() {
        VaranDeco.LOGGER.debug("Registering Items for" + VaranDeco.MOD_ID);
        addItemsToItemGroups();
    }
}
