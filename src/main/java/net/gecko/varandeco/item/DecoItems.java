package net.gecko.varandeco.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.entity.DecoBoats;
import net.gecko.varandeco.item.custom.BubbleItem;
import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DecoItems {

    public static final Item CACTUS_SIGN = registerItem("cactus_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_CACTUS_SIGN, DecoBlocks.WALL_CACTUS_SIGN));
    public static final Item MUSHROOM_SIGN = registerItem("mushroom_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_MUSHROOM_SIGN, DecoBlocks.WALL_MUSHROOM_SIGN));
    public static final Item IRON_CAP_SIGN = registerItem("iron_cap_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_IRON_CAP_SIGN, DecoBlocks.WALL_IRON_CAP_SIGN));
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
                    DecoBlocks.STANDING_STRIPPED_BIRCH_SIGN, DecoBlocks.WALL_STRIPPED_BIRCH_SIGN));
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
    public static final Item STRIPPED_CACTUS_SIGN = registerItem("stripped_cactus_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_STRIPPED_CACTUS_SIGN, DecoBlocks.WALL_STRIPPED_CACTUS_SIGN));
    public static final Item MUSHROOM_STEM_SIGN = registerItem("mushroom_stem_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_MUSHROOM_STEM_SIGN, DecoBlocks.WALL_MUSHROOM_STEM_SIGN));
    public static final Item STRIPPED_IRON_CAP_SIGN = registerItem("stripped_iron_cap_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_STRIPPED_IRON_CAP_SIGN, DecoBlocks.WALL_STRIPPED_IRON_CAP_SIGN));
    public static final Item STRIPPED_WOODEN_SIGN = registerItem("stripped_wooden_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_STRIPPED_WOODEN_SIGN, DecoBlocks.WALL_STRIPPED_WOODEN_SIGN));

    public static final Item OAK_MOSAIC_SIGN = registerItem("oak_mosaic_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_OAK_MOSAIC_SIGN, DecoBlocks.WALL_OAK_MOSAIC_SIGN));
    public static final Item SPRUCE_MOSAIC_SIGN = registerItem("spruce_mosaic_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_SPRUCE_MOSAIC_SIGN, DecoBlocks.WALL_SPRUCE_MOSAIC_SIGN));
    public static final Item BIRCH_MOSAIC_SIGN = registerItem("birch_mosaic_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_BIRCH_MOSAIC_SIGN, DecoBlocks.WALL_BIRCH_MOSAIC_SIGN));
    public static final Item JUNGLE_MOSAIC_SIGN = registerItem("jungle_mosaic_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_JUNGLE_MOSAIC_SIGN, DecoBlocks.WALL_JUNGLE_MOSAIC_SIGN));
    public static final Item ACACIA_MOSAIC_SIGN = registerItem("acacia_mosaic_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_ACACIA_MOSAIC_SIGN, DecoBlocks.WALL_ACACIA_MOSAIC_SIGN));
    public static final Item DARK_OAK_MOSAIC_SIGN = registerItem("dark_oak_mosaic_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_DARK_OAK_MOSAIC_SIGN, DecoBlocks.WALL_DARK_OAK_MOSAIC_SIGN));
    public static final Item MANGROVE_MOSAIC_SIGN = registerItem("mangrove_mosaic_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_MANGROVE_MOSAIC_SIGN, DecoBlocks.WALL_MANGROVE_MOSAIC_SIGN));
    public static final Item CHERRY_MOSAIC_SIGN = registerItem("cherry_mosaic_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_CHERRY_MOSAIC_SIGN, DecoBlocks.WALL_CHERRY_MOSAIC_SIGN));
    public static final Item BAMBOO_MOSAIC_SIGN = registerItem("bamboo_mosaic_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_BAMBOO_MOSAIC_SIGN, DecoBlocks.WALL_BAMBOO_MOSAIC_SIGN));
    public static final Item CRIMSON_MOSAIC_SIGN = registerItem("crimson_mosaic_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_CRIMSON_MOSAIC_SIGN, DecoBlocks.WALL_CRIMSON_MOSAIC_SIGN));
    public static final Item WARPED_MOSAIC_SIGN = registerItem("warped_mosaic_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_WARPED_MOSAIC_SIGN, DecoBlocks.WALL_WARPED_MOSAIC_SIGN));
    public static final Item CACTUS_MOSAIC_SIGN = registerItem("cactus_mosaic_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_CACTUS_MOSAIC_SIGN, DecoBlocks.WALL_CACTUS_MOSAIC_SIGN));
    public static final Item MUSHROOM_MOSAIC_SIGN = registerItem("mushroom_mosaic_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_MUSHROOM_MOSAIC_SIGN, DecoBlocks.WALL_MUSHROOM_MOSAIC_SIGN));
    public static final Item IRON_CAP_MOSAIC_SIGN = registerItem("iron_cap_mosaic_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_IRON_CAP_MOSAIC_SIGN, DecoBlocks.WALL_IRON_CAP_MOSAIC_SIGN));
    public static final Item WOODEN_MOSAIC_SIGN = registerItem("wooden_mosaic_sign",
            new SignItem(new Item.Settings().maxCount(16),
                    DecoBlocks.STANDING_WOODEN_MOSAIC_SIGN, DecoBlocks.WALL_WOODEN_MOSAIC_SIGN));

    public static final Item CACTUS_HANGING_SIGN = registerItem("cactus_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_CACTUS_SIGN, DecoBlocks.WALL_HANGING_CACTUS_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item MUSHROOM_HANGING_SIGN = registerItem("mushroom_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_MUSHROOM_SIGN, DecoBlocks.WALL_HANGING_MUSHROOM_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item IRON_CAP_HANGING_SIGN = registerItem("iron_cap_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_IRON_CAP_SIGN, DecoBlocks.WALL_HANGING_IRON_CAP_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item WOODEN_HANGING_SIGN = registerItem("wooden_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_WOODEN_SIGN, DecoBlocks.WALL_HANGING_WOODEN_SIGN,
                    new Item.Settings().maxCount(16)));

    public static final Item OAK_MOSAIC_HANGING_SIGN = registerItem("oak_mosaic_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_OAK_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_OAK_MOSAIC_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item SPRUCE_MOSAIC_HANGING_SIGN = registerItem("spruce_mosaic_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_SPRUCE_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_SPRUCE_MOSAIC_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item BIRCH_MOSAIC_HANGING_SIGN = registerItem("birch_mosaic_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_BIRCH_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_BIRCH_MOSAIC_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item JUNGLE_MOSAIC_HANGING_SIGN = registerItem("jungle_mosaic_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_JUNGLE_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_JUNGLE_MOSAIC_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item ACACIA_MOSAIC_HANGING_SIGN = registerItem("acacia_mosaic_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_ACACIA_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_ACACIA_MOSAIC_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item DARK_OAK_MOSAIC_HANGING_SIGN = registerItem("dark_oak_mosaic_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_DARK_OAK_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_DARK_OAK_MOSAIC_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item MANGROVE_MOSAIC_HANGING_SIGN = registerItem("mangrove_mosaic_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_MANGROVE_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_MANGROVE_MOSAIC_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item CHERRY_MOSAIC_HANGING_SIGN = registerItem("cherry_mosaic_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_CHERRY_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_CHERRY_MOSAIC_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item BAMBOO_MOSAIC_HANGING_SIGN = registerItem("bamboo_mosaic_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_BAMBOO_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_BAMBOO_MOSAIC_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item CRIMSON_MOSAIC_HANGING_SIGN = registerItem("crimson_mosaic_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_CRIMSON_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_CRIMSON_MOSAIC_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item WARPED_MOSAIC_HANGING_SIGN = registerItem("warped_mosaic_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_WARPED_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_WARPED_MOSAIC_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item CACTUS_MOSAIC_HANGING_SIGN = registerItem("cactus_mosaic_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_CACTUS_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_CACTUS_MOSAIC_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item MUSHROOM_MOSAIC_HANGING_SIGN = registerItem("mushroom_mosaic_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_MUSHROOM_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_MUSHROOM_MOSAIC_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item IRON_CAP_MOSAIC_HANGING_SIGN = registerItem("iron_cap_mosaic_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_IRON_CAP_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_IRON_CAP_MOSAIC_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item WOODEN_MOSAIC_HANGING_SIGN = registerItem("wooden_mosaic_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_WOODEN_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_WOODEN_MOSAIC_SIGN,
                    new Item.Settings().maxCount(16)));

    public static final Item OAK_PLANKS_HANGING_SIGN = registerItem("oak_planks_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_OAK_PLANKS_SIGN, DecoBlocks.WALL_HANGING_OAK_PLANKS_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item SPRUCE_PLANKS_HANGING_SIGN = registerItem("spruce_planks_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_SPRUCE_PLANKS_SIGN, DecoBlocks.WALL_HANGING_SPRUCE_PLANKS_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item BIRCH_PLANKS_HANGING_SIGN = registerItem("birch_planks_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_BIRCH_PLANKS_SIGN, DecoBlocks.WALL_HANGING_BIRCH_PLANKS_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item JUNGLE_PLANKS_HANGING_SIGN = registerItem("jungle_planks_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_JUNGLE_PLANKS_SIGN, DecoBlocks.WALL_HANGING_JUNGLE_PLANKS_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item ACACIA_PLANKS_HANGING_SIGN = registerItem("acacia_planks_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_ACACIA_PLANKS_SIGN, DecoBlocks.WALL_HANGING_ACACIA_PLANKS_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item DARK_OAK_PLANKS_HANGING_SIGN = registerItem("dark_oak_planks_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_DARK_OAK_PLANKS_SIGN, DecoBlocks.WALL_HANGING_DARK_OAK_PLANKS_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item MANGROVE_PLANKS_HANGING_SIGN = registerItem("mangrove_planks_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_MANGROVE_PLANKS_SIGN, DecoBlocks.WALL_HANGING_MANGROVE_PLANKS_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item CHERRY_PLANKS_HANGING_SIGN = registerItem("cherry_planks_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_CHERRY_PLANKS_SIGN, DecoBlocks.WALL_HANGING_CHERRY_PLANKS_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item CRIMSON_PLANKS_HANGING_SIGN = registerItem("crimson_planks_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_CRIMSON_PLANKS_SIGN, DecoBlocks.WALL_HANGING_CRIMSON_PLANKS_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item WARPED_PLANKS_HANGING_SIGN = registerItem("warped_planks_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_WARPED_PLANKS_SIGN, DecoBlocks.WALL_HANGING_WARPED_PLANKS_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item CACTUS_PLANKS_HANGING_SIGN = registerItem("cactus_planks_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_CACTUS_PLANKS_SIGN, DecoBlocks.WALL_HANGING_CACTUS_PLANKS_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item MUSHROOM_PLANKS_HANGING_SIGN = registerItem("mushroom_planks_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_MUSHROOM_PLANKS_SIGN, DecoBlocks.WALL_HANGING_MUSHROOM_PLANKS_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item IRON_CAP_PLANKS_HANGING_SIGN = registerItem("iron_cap_planks_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_IRON_CAP_PLANKS_SIGN, DecoBlocks.WALL_HANGING_IRON_CAP_PLANKS_SIGN,
                    new Item.Settings().maxCount(16)));
    public static final Item WOODEN_PLANKS_HANGING_SIGN = registerItem("wooden_planks_hanging_sign",
            new HangingSignItem(DecoBlocks.HANGING_WOODEN_PLANKS_SIGN, DecoBlocks.WALL_HANGING_WOODEN_PLANKS_SIGN,
                    new Item.Settings().maxCount(16)));

    public static final Item SNOW_BRICK = registerItem("snow_brick",
            new Item(new Item.Settings().maxCount(16)));

    public static final Item PASSTOL = registerItem("passtol",
            new Item(new Item.Settings()));

    public static final Item SHADDOL = registerItem("shaddol",
            new Item(new Item.Settings()));

    public static final Item BUBBLE_ORB = registerItem("bubble_orb",
            new BubbleItem(new Item.Settings()));

    public static final Item ICE_SHARD = registerItem("ice_shard",
            new Item(new Item.Settings()));

    public static final Item WARPED_WART = registerItem("warped_wart",
            new AliasedBlockItem(DecoBlocks.WARPED_WART_PLANT,new Item.Settings()));

    public static final Item ANCIENT_ROSE_SEEDS = registerItem("ancient_rose_seeds",
            new AliasedBlockItem(DecoBlocks.ANCIENT_ROSE_CROP,new Item.Settings()));

    public static final Item MIGHTY_LAVENDER_FLOWER = registerItem("mighty_lavender_flower",
            new AliasedBlockItem(DecoBlocks.MIGHTY_LAVENDER_CROP,new Item.Settings()));

    public static final Item COPPER_NUGGET = registerItem("copper_nugget",
            new Item(new Item.Settings()));

    public static final Item LILAC_FLOWER = registerItem("lilac_flower",
            new Item(new Item.Settings()));

    public static final Item LILAC_STEW = registerItem("lilac_stew",
            new StewItem(new Item.Settings().food(DecoFoodComponents.LILAC_STEW)));

    public static final Item MIGHTY_LAVENDER_STEW = registerItem("mighty_lavender_stew",
            new StewItem(new Item.Settings().food(DecoFoodComponents.MIGHTY_LAVENDER_STEW)));

    public static final Item PINK_PETALS_STEW = registerItem("pink_petals_stew",
            new StewItem(new Item.Settings().food(DecoFoodComponents.PINK_PETALS_STEW)));

    public static final Item CACTUS_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CACTUS_BOAT_ID,
            DecoBoats.CACTUS_BOAT_KEY, false);
    public static final Item CACTUS_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CACTUS_CHEST_BOAT_ID,
            DecoBoats.CACTUS_BOAT_KEY, true);

    public static final Item MUSHROOM_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.MUSHROOM_BOAT_ID,
            DecoBoats.MUSHROOM_BOAT_KEY, false);
    public static final Item MUSHROOM_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.MUSHROOM_CHEST_BOAT_ID,
            DecoBoats.MUSHROOM_BOAT_KEY, true);

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

    public static final Item BAMBOO_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.BAMBOO_BOAT_ID,
            DecoBoats.BAMBOO_BOAT_KEY, false);
    public static final Item BAMBOO_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.BAMBOO_CHEST_BOAT_ID,
            DecoBoats.BAMBOO_BOAT_KEY, true);

    public static final Item OAK_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.OAK_RAFT_ID,
            DecoBoats.OAK_RAFT_KEY, false);
    public static final Item OAK_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.OAK_CHEST_RAFT_ID,
            DecoBoats.OAK_RAFT_KEY, true);

    public static final Item SPRUCE_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.SPRUCE_RAFT_ID,
            DecoBoats.SPRUCE_RAFT_KEY, false);
    public static final Item SPRUCE_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.SPRUCE_CHEST_RAFT_ID,
            DecoBoats.SPRUCE_RAFT_KEY, true);

    public static final Item BIRCH_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.BIRCH_RAFT_ID,
            DecoBoats.BIRCH_RAFT_KEY, false);
    public static final Item BIRCH_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.BIRCH_CHEST_RAFT_ID,
            DecoBoats.BIRCH_RAFT_KEY, true);

    public static final Item JUNGLE_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.JUNGLE_RAFT_ID,
            DecoBoats.JUNGLE_RAFT_KEY, false);
    public static final Item JUNGLE_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.JUNGLE_CHEST_RAFT_ID,
            DecoBoats.JUNGLE_RAFT_KEY, true);

    public static final Item ACACIA_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.ACACIA_RAFT_ID,
            DecoBoats.ACACIA_RAFT_KEY, false);
    public static final Item ACACIA_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.ACACIA_CHEST_RAFT_ID,
            DecoBoats.ACACIA_RAFT_KEY, true);

    public static final Item DARK_OAK_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.DARK_OAK_RAFT_ID,
            DecoBoats.DARK_OAK_RAFT_KEY, false);
    public static final Item DARK_OAK_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.DARK_OAK_CHEST_RAFT_ID,
            DecoBoats.DARK_OAK_RAFT_KEY, true);

    public static final Item MANGROVE_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.MANGROVE_RAFT_ID,
            DecoBoats.MANGROVE_RAFT_KEY, false);
    public static final Item MANGROVE_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.MANGROVE_CHEST_RAFT_ID,
            DecoBoats.MANGROVE_RAFT_KEY, true);

    public static final Item CHERRY_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CHERRY_RAFT_ID,
            DecoBoats.CHERRY_RAFT_KEY, false);
    public static final Item CHERRY_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CHERRY_CHEST_RAFT_ID,
            DecoBoats.CHERRY_RAFT_KEY, true);

    public static final Item CRIMSON_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CRIMSON_RAFT_ID,
            DecoBoats.CRIMSON_RAFT_KEY, false);
    public static final Item CRIMSON_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CRIMSON_CHEST_RAFT_ID,
            DecoBoats.CRIMSON_RAFT_KEY, true);

    public static final Item WARPED_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WARPED_RAFT_ID,
            DecoBoats.WARPED_RAFT_KEY, false);
    public static final Item WARPED_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WARPED_CHEST_RAFT_ID,
            DecoBoats.WARPED_RAFT_KEY, true);

    public static final Item CACTUS_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CACTUS_RAFT_ID,
            DecoBoats.CACTUS_RAFT_KEY, false);
    public static final Item CACTUS_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CACTUS_CHEST_RAFT_ID,
            DecoBoats.CACTUS_RAFT_KEY, true);

    public static final Item MUSHROOM_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.MUSHROOM_RAFT_ID,
            DecoBoats.MUSHROOM_RAFT_KEY, false);
    public static final Item MUSHROOM_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.MUSHROOM_CHEST_RAFT_ID,
            DecoBoats.MUSHROOM_RAFT_KEY, true);

    public static final Item WOODEN_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WOODEN_RAFT_ID,
            DecoBoats.WOODEN_RAFT_KEY, false);
    public static final Item WOODEN_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WOODEN_CHEST_RAFT_ID,
            DecoBoats.WOODEN_RAFT_KEY, true);

    public static final Item IRON_CAP_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.IRON_CAP_BOAT_ID,
            DecoBoats.IRON_CAP_BOAT_KEY, false);
    public static final Item IRON_CAP_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.IRON_CAP_CHEST_BOAT_ID,
            DecoBoats.IRON_CAP_BOAT_KEY, true);

    public static final Item IRON_CAP_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.IRON_CAP_RAFT_ID,
            DecoBoats.IRON_CAP_RAFT_KEY, false);
    public static final Item IRON_CAP_CHEST_RAFT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.IRON_CAP_CHEST_RAFT_ID,
            DecoBoats.IRON_CAP_RAFT_KEY, true);

    public static final Item TALL_SEAGRASS = registerItem("tall_seagrass",
            new TallBlockItem(Blocks.TALL_SEAGRASS,new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(VaranDeco.MOD_ID, name),item);
    }

    public static void registerDecoItems() {
        VaranDeco.LOGGER.debug("Registering Items for" + VaranDeco.MOD_ID);
    }
}
