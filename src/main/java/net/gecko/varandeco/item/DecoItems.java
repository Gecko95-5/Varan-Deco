package net.gecko.varandeco.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.entity.DecoBoats;
import net.gecko.varandeco.item.projectile.SnowBrickItem;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SignItem;
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
    public static final Item STRIPPED_OAK_SIGN = registerItem("stripped_oak_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_STRIPPED_OAK_SIGN, DecoBlocks.WALL_STRIPPED_OAK_SIGN));
    public static final Item STRIPPED_SPRUCE_SIGN = registerItem("stripped_spruce_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_STRIPPED_SPRUCE_SIGN, DecoBlocks.WALL_STRIPPED_SPRUCE_SIGN));
    public static final Item STRIPPED_BIRCH_SIGN = registerItem("stripped_birch_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_STRIPPED_SPRUCE_SIGN, DecoBlocks.WALL_STRIPPED_SPRUCE_SIGN));
    public static final Item STRIPPED_JUNGLE_SIGN = registerItem("stripped_jungle_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_STRIPPED_JUNGLE_SIGN, DecoBlocks.WALL_STRIPPED_JUNGLE_SIGN));
    public static final Item STRIPPED_ACACIA_SIGN = registerItem("stripped_acacia_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_STRIPPED_ACACIA_SIGN, DecoBlocks.WALL_STRIPPED_ACACIA_SIGN));
    public static final Item STRIPPED_DARK_OAK_SIGN = registerItem("stripped_dark_oak_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_STRIPPED_DARK_OAK_SIGN, DecoBlocks.WALL_STRIPPED_DARK_OAK_SIGN));
    public static final Item STRIPPED_MANGROVE_SIGN = registerItem("stripped_mangrove_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_STRIPPED_MANGROVE_SIGN, DecoBlocks.WALL_STRIPPED_MANGROVE_SIGN));
    public static final Item STRIPPED_CHERRY_SIGN = registerItem("stripped_cherry_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_STRIPPED_CHERRY_SIGN, DecoBlocks.WALL_STRIPPED_CHERRY_SIGN));
    public static final Item STRIPPED_CRIMSON_SIGN = registerItem("stripped_crimson_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_STRIPPED_CRIMSON_SIGN, DecoBlocks.WALL_STRIPPED_CRIMSON_SIGN));
    public static final Item STRIPPED_WARPED_SIGN = registerItem("stripped_warped_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_STRIPPED_WARPED_SIGN, DecoBlocks.WALL_STRIPPED_WARPED_SIGN));
    public static final Item STRIPPED_WOODEN_SIGN = registerItem("stripped_wooden_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_STRIPPED_WOODEN_SIGN, DecoBlocks.WALL_STRIPPED_WOODEN_SIGN));

    public static final Item SNOW_BRICK = registerItem("snow_brick",
            new SnowBrickItem(new Item.Settings().maxCount(16)));

    public static final Item BUBBLE_ORB = registerItem("bubble_orb",
            new Item(new Item.Settings()));

    public static final Item WARPED_WART = registerItem("warped_wart",
            new AliasedBlockItem(DecoBlocks.WARPED_WART_PLANT,new Item.Settings()));

    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new Item.Settings()));

    public static final Item CACTUS_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CACTUS_BOAT_ID,
            DecoBoats.CACTUS_BOAT_KEY, false);
    public static final Item CACTUS_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CACTUS_CHEST_BOAT_ID,
            DecoBoats.CACTUS_BOAT_KEY, true);

    public static final Item WOODEN_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WOODEN_BOAT_ID,
            DecoBoats.WOODEN_BOAT_KEY, false);
    public static final Item WOODEN_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WOODEN_CHEST_BOAT_ID,
            DecoBoats.WOODEN_BOAT_KEY, true);

    public static final Item CRIMSON_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CRIMSON_BOAT_ID,
            DecoBoats.CRIMSON_BOAT_KEY, false);
    public static final Item CRIMSON_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CRIMSON_CHEST_BOAT_ID,
            DecoBoats.CRIMSON_BOAT_KEY, true);

    public static final Item WARPED_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WARPED_BOAT_ID,
            DecoBoats.WARPED_BOAT_KEY, false);
    public static final Item WARPED_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WARPED_CHEST_BOAT_ID,
            DecoBoats.WARPED_BOAT_KEY, true);

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(VaranDeco.MOD_ID, name),item);
    }

    public static void registerDecoItems() {
        VaranDeco.LOGGER.debug("Registering Items for" + VaranDeco.MOD_ID);
    }
}
