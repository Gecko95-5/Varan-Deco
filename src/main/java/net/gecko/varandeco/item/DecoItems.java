package net.gecko.varandeco.item;

import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.custom.BubbleItem;
import net.gecko.varandeco.item.custom.SnowBrickItem;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DecoItems {

    public static final Item CACTUS_SIGN = registerItem("cactus_sign",
            new SignItem(new Item.Settings().maxCount(16).group(DecoItemGroup.VARAN_DECO_BLOCKS),
                    DecoBlocks.STANDING_CACTUS_SIGN, DecoBlocks.WALL_CACTUS_SIGN));
    public static final Item MUSHROOM_SIGN = registerItem("mushroom_sign",
            new SignItem(new Item.Settings().maxCount(16).group(DecoItemGroup.VARAN_DECO_BLOCKS),
                    DecoBlocks.STANDING_MUSHROOM_SIGN, DecoBlocks.WALL_MUSHROOM_SIGN));
    public static final Item WOODEN_SIGN = registerItem("wooden_sign",
            new SignItem(new Item.Settings().maxCount(16).group(DecoItemGroup.VARAN_DECO_BLOCKS),
                    DecoBlocks.STANDING_WOODEN_SIGN, DecoBlocks.WALL_WOODEN_SIGN));

    public static final Item HYDRATED_TUBE_CORAL_FAN = registerItem("hydrated_tube_coral_fan",
            new WallStandingBlockItem(DecoBlocks.HYDRATED_TUBE_CORAL_FAN,DecoBlocks.HYDRATED_TUBE_CORAL_WALL_FAN,
                    new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));
    public static final Item HYDRATED_BRAIN_CORAL_FAN = registerItem("hydrated_brain_coral_fan",
            new WallStandingBlockItem(DecoBlocks.HYDRATED_BRAIN_CORAL_FAN,DecoBlocks.HYDRATED_BRAIN_CORAL_WALL_FAN,
                    new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));
    public static final Item HYDRATED_BUBBLE_CORAL_FAN = registerItem("hydrated_bubble_coral_fan",
            new WallStandingBlockItem(DecoBlocks.HYDRATED_BUBBLE_CORAL_FAN,DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL_FAN,
                    new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));
    public static final Item HYDRATED_FIRE_CORAL_FAN = registerItem("hydrated_fire_coral_fan",
            new WallStandingBlockItem(DecoBlocks.HYDRATED_FIRE_CORAL_FAN,DecoBlocks.HYDRATED_FIRE_CORAL_WALL_FAN,
                    new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));
    public static final Item HYDRATED_HORN_CORAL_FAN = registerItem("hydrated_horn_coral_fan",
            new WallStandingBlockItem(DecoBlocks.HYDRATED_HORN_CORAL_FAN,DecoBlocks.HYDRATED_HORN_CORAL_WALL_FAN,
                    new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));

    public static final Item SNOW_BRICK = registerItem("snow_brick",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS).maxCount(16)));

    public static final Item PASSTOL = registerItem("passtol",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));

    public static final Item SHADDOL = registerItem("shaddol",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));

    public static final Item BUBBLE_ORB = registerItem("bubble_orb",
            new BubbleItem(new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));

    public static final Item ICE_SHARD = registerItem("ice_shard",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));

    public static final Item WARPED_WART = registerItem("warped_wart",
            new AliasedBlockItem(DecoBlocks.WARPED_WART_PLANT,new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));

    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));

    public static final Item LILAC_FLOWER = registerItem("lilac_flower",
            new Item(new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));

    public static final Item LILAC_STEW = registerItem("lilac_stew",
            new StewItem(new Item.Settings().food(DecoFoodComponents.LILAC_STEW).group(DecoItemGroup.VARAN_DECO_BLOCKS)));

    public static final Item TALL_SEAGRASS = registerItem("tall_seagrass",
            new TallBlockItem(Blocks.TALL_SEAGRASS,new Item.Settings().group(DecoItemGroup.VARAN_DECO_BLOCKS)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(VaranDeco.MOD_ID, name),item);
    }

    public static void registerDecoItems() {
        VaranDeco.LOGGER.debug("Registering Items for" + VaranDeco.MOD_ID);
    }
}
