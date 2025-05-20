package net.gecko.varandeco.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.entity.DecoBoats;
import net.gecko.varandeco.item.projectile.SnowBrickItem;
import net.gecko.varandeco.util.interfaces.HangingSignRegisterFunction;
import net.gecko.varandeco.util.interfaces.SignRegisterFunction;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class DecoItems {

    public static final Item CACTUS_SIGN = registerSignItem("cactus_sign", 
            DecoBlocks.STANDING_CACTUS_SIGN, DecoBlocks.WALL_CACTUS_SIGN, SignItem::new);
    public static final Item WOODEN_SIGN = registerSignItem("wooden_sign",
            DecoBlocks.STANDING_WOODEN_SIGN, DecoBlocks.WALL_WOODEN_SIGN, SignItem::new);

    public static final Item STRIPPED_OAK_SIGN = registerSignItem("stripped_oak_sign",
            DecoBlocks.STANDING_STRIPPED_OAK_SIGN, DecoBlocks.WALL_STRIPPED_OAK_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_SPRUCE_SIGN = registerSignItem("stripped_spruce_sign",
            DecoBlocks.STANDING_STRIPPED_SPRUCE_SIGN, DecoBlocks.WALL_STRIPPED_SPRUCE_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_BIRCH_SIGN = registerSignItem("stripped_birch_sign",
            DecoBlocks.STANDING_STRIPPED_BIRCH_SIGN, DecoBlocks.WALL_STRIPPED_BIRCH_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_JUNGLE_SIGN = registerSignItem("stripped_jungle_sign",
            DecoBlocks.STANDING_STRIPPED_JUNGLE_SIGN, DecoBlocks.WALL_STRIPPED_JUNGLE_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_ACACIA_SIGN = registerSignItem("stripped_acacia_sign",
            DecoBlocks.STANDING_STRIPPED_ACACIA_SIGN, DecoBlocks.WALL_STRIPPED_ACACIA_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_DARK_OAK_SIGN = registerSignItem("stripped_dark_oak_sign",
            DecoBlocks.STANDING_STRIPPED_DARK_OAK_SIGN, DecoBlocks.WALL_STRIPPED_DARK_OAK_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_MANGROVE_SIGN = registerSignItem("stripped_mangrove_sign",
            DecoBlocks.STANDING_STRIPPED_MANGROVE_SIGN, DecoBlocks.WALL_STRIPPED_MANGROVE_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_CHERRY_SIGN = registerSignItem("stripped_cherry_sign",
            DecoBlocks.STANDING_STRIPPED_CHERRY_SIGN, DecoBlocks.WALL_STRIPPED_CHERRY_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_CRIMSON_SIGN = registerSignItem("stripped_crimson_sign",
            DecoBlocks.STANDING_STRIPPED_CRIMSON_SIGN, DecoBlocks.WALL_STRIPPED_CRIMSON_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_WARPED_SIGN = registerSignItem("stripped_warped_sign",
            DecoBlocks.STANDING_STRIPPED_WARPED_SIGN, DecoBlocks.WALL_STRIPPED_WARPED_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_WOODEN_SIGN = registerSignItem("stripped_wooden_sign",
            DecoBlocks.STANDING_STRIPPED_WOODEN_SIGN, DecoBlocks.WALL_STRIPPED_WOODEN_SIGN,
                    SignItem::new);
    public static final Item STRIPPED_PALE_OAK_SIGN = registerSignItem("stripped_pale_oak_sign",
            DecoBlocks.STANDING_STRIPPED_PALE_OAK_SIGN, DecoBlocks.WALL_STRIPPED_PALE_OAK_SIGN,
                    SignItem::new);

    public static final Item OAK_MOSAIC_SIGN = registerSignItem("oak_mosaic_sign",
            DecoBlocks.STANDING_OAK_MOSAIC_SIGN, DecoBlocks.WALL_OAK_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item SPRUCE_MOSAIC_SIGN = registerSignItem("spruce_mosaic_sign",
            DecoBlocks.STANDING_SPRUCE_MOSAIC_SIGN, DecoBlocks.WALL_SPRUCE_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item BIRCH_MOSAIC_SIGN = registerSignItem("birch_mosaic_sign",
            DecoBlocks.STANDING_BIRCH_MOSAIC_SIGN, DecoBlocks.WALL_BIRCH_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item JUNGLE_MOSAIC_SIGN = registerSignItem("jungle_mosaic_sign",
            DecoBlocks.STANDING_JUNGLE_MOSAIC_SIGN, DecoBlocks.WALL_JUNGLE_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item ACACIA_MOSAIC_SIGN = registerSignItem("acacia_mosaic_sign",
            DecoBlocks.STANDING_ACACIA_MOSAIC_SIGN, DecoBlocks.WALL_ACACIA_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item DARK_OAK_MOSAIC_SIGN = registerSignItem("dark_oak_mosaic_sign",
            DecoBlocks.STANDING_DARK_OAK_MOSAIC_SIGN, DecoBlocks.WALL_DARK_OAK_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item MANGROVE_MOSAIC_SIGN = registerSignItem("mangrove_mosaic_sign",
            DecoBlocks.STANDING_MANGROVE_MOSAIC_SIGN, DecoBlocks.WALL_MANGROVE_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item CHERRY_MOSAIC_SIGN = registerSignItem("cherry_mosaic_sign",
            DecoBlocks.STANDING_CHERRY_MOSAIC_SIGN, DecoBlocks.WALL_CHERRY_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item BAMBOO_MOSAIC_SIGN = registerSignItem("bamboo_mosaic_sign",
            DecoBlocks.STANDING_BAMBOO_MOSAIC_SIGN, DecoBlocks.WALL_BAMBOO_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item CRIMSON_MOSAIC_SIGN = registerSignItem("crimson_mosaic_sign",
            DecoBlocks.STANDING_CRIMSON_MOSAIC_SIGN, DecoBlocks.WALL_CRIMSON_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item WARPED_MOSAIC_SIGN = registerSignItem("warped_mosaic_sign",
            DecoBlocks.STANDING_WARPED_MOSAIC_SIGN, DecoBlocks.WALL_WARPED_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item CACTUS_MOSAIC_SIGN = registerSignItem("cactus_mosaic_sign",
            DecoBlocks.STANDING_CACTUS_MOSAIC_SIGN, DecoBlocks.WALL_CACTUS_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item WOODEN_MOSAIC_SIGN = registerSignItem("wooden_mosaic_sign",
            DecoBlocks.STANDING_WOODEN_MOSAIC_SIGN, DecoBlocks.WALL_WOODEN_MOSAIC_SIGN,
                    SignItem::new);
    public static final Item PALE_OAK_MOSAIC_SIGN = registerSignItem("pale_oak_mosaic_sign",
            DecoBlocks.STANDING_PALE_OAK_MOSAIC_SIGN, DecoBlocks.WALL_PALE_OAK_MOSAIC_SIGN,
                    SignItem::new);

    public static final Item WOODEN_HANGING_SIGN = registerHangingSignItem("wooden_hanging_sign",
            DecoBlocks.WALL_HANGING_WOODEN_SIGN, DecoBlocks.HANGING_WOODEN_SIGN, HangingSignItem::new);

    public static final Item OAK_MOSAIC_HANGING_SIGN = registerHangingSignItem("oak_mosaic_hanging_sign",
            DecoBlocks.HANGING_OAK_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_OAK_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item SPRUCE_MOSAIC_HANGING_SIGN = registerHangingSignItem("spruce_mosaic_hanging_sign",
            DecoBlocks.HANGING_SPRUCE_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_SPRUCE_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item BIRCH_MOSAIC_HANGING_SIGN = registerHangingSignItem("birch_mosaic_hanging_sign",
            DecoBlocks.HANGING_BIRCH_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_BIRCH_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item JUNGLE_MOSAIC_HANGING_SIGN = registerHangingSignItem("jungle_mosaic_hanging_sign",
            DecoBlocks.HANGING_JUNGLE_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_JUNGLE_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item ACACIA_MOSAIC_HANGING_SIGN = registerHangingSignItem("acacia_mosaic_hanging_sign",
            DecoBlocks.HANGING_ACACIA_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_ACACIA_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item DARK_OAK_MOSAIC_HANGING_SIGN = registerHangingSignItem("dark_oak_mosaic_hanging_sign",
            DecoBlocks.HANGING_DARK_OAK_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_DARK_OAK_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item MANGROVE_MOSAIC_HANGING_SIGN = registerHangingSignItem("mangrove_mosaic_hanging_sign",
            DecoBlocks.HANGING_MANGROVE_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_MANGROVE_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item CHERRY_MOSAIC_HANGING_SIGN = registerHangingSignItem("cherry_mosaic_hanging_sign",
            DecoBlocks.HANGING_CHERRY_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_CHERRY_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item BAMBOO_MOSAIC_HANGING_SIGN = registerHangingSignItem("bamboo_mosaic_hanging_sign",
            DecoBlocks.HANGING_BAMBOO_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_BAMBOO_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item CRIMSON_MOSAIC_HANGING_SIGN = registerHangingSignItem("crimson_mosaic_hanging_sign",
            DecoBlocks.HANGING_CRIMSON_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_CRIMSON_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item WARPED_MOSAIC_HANGING_SIGN = registerHangingSignItem("warped_mosaic_hanging_sign",
            DecoBlocks.HANGING_WARPED_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_WARPED_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item CACTUS_MOSAIC_HANGING_SIGN = registerHangingSignItem("cactus_mosaic_hanging_sign",
            DecoBlocks.HANGING_CACTUS_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_CACTUS_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item WOODEN_MOSAIC_HANGING_SIGN = registerHangingSignItem("wooden_mosaic_hanging_sign",
            DecoBlocks.HANGING_WOODEN_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_WOODEN_MOSAIC_SIGN,
            HangingSignItem::new);
    public static final Item PALE_OAK_MOSAIC_HANGING_SIGN = registerHangingSignItem("pale_oak_mosaic_hanging_sign",
            DecoBlocks.HANGING_PALE_OAK_MOSAIC_SIGN, DecoBlocks.WALL_HANGING_PALE_OAK_MOSAIC_SIGN,
            HangingSignItem::new);

    public static final Item OAK_PLANKS_HANGING_SIGN = registerHangingSignItem("oak_planks_hanging_sign",
            DecoBlocks.HANGING_OAK_PLANKS_SIGN, DecoBlocks.WALL_HANGING_OAK_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item SPRUCE_PLANKS_HANGING_SIGN = registerHangingSignItem("spruce_planks_hanging_sign",
            DecoBlocks.HANGING_SPRUCE_PLANKS_SIGN, DecoBlocks.WALL_HANGING_SPRUCE_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item BIRCH_PLANKS_HANGING_SIGN = registerHangingSignItem("birch_planks_hanging_sign",
            DecoBlocks.HANGING_BIRCH_PLANKS_SIGN, DecoBlocks.WALL_HANGING_BIRCH_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item JUNGLE_PLANKS_HANGING_SIGN = registerHangingSignItem("jungle_planks_hanging_sign",
            DecoBlocks.HANGING_JUNGLE_PLANKS_SIGN, DecoBlocks.WALL_HANGING_JUNGLE_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item ACACIA_PLANKS_HANGING_SIGN = registerHangingSignItem("acacia_planks_hanging_sign",
            DecoBlocks.HANGING_ACACIA_PLANKS_SIGN, DecoBlocks.WALL_HANGING_ACACIA_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item DARK_OAK_PLANKS_HANGING_SIGN = registerHangingSignItem("dark_oak_planks_hanging_sign",
            DecoBlocks.HANGING_DARK_OAK_PLANKS_SIGN, DecoBlocks.WALL_HANGING_DARK_OAK_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item MANGROVE_PLANKS_HANGING_SIGN = registerHangingSignItem("mangrove_planks_hanging_sign",
            DecoBlocks.HANGING_MANGROVE_PLANKS_SIGN, DecoBlocks.WALL_HANGING_MANGROVE_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item CHERRY_PLANKS_HANGING_SIGN = registerHangingSignItem("cherry_planks_hanging_sign",
            DecoBlocks.HANGING_CHERRY_PLANKS_SIGN, DecoBlocks.WALL_HANGING_CHERRY_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item CRIMSON_PLANKS_HANGING_SIGN = registerHangingSignItem("crimson_planks_hanging_sign",
            DecoBlocks.HANGING_CRIMSON_PLANKS_SIGN, DecoBlocks.WALL_HANGING_CRIMSON_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item WARPED_PLANKS_HANGING_SIGN = registerHangingSignItem("warped_planks_hanging_sign",
            DecoBlocks.HANGING_WARPED_PLANKS_SIGN, DecoBlocks.WALL_HANGING_WARPED_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item CACTUS_PLANKS_HANGING_SIGN = registerHangingSignItem("cactus_planks_hanging_sign",
            DecoBlocks.HANGING_CACTUS_PLANKS_SIGN, DecoBlocks.WALL_HANGING_CACTUS_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item WOODEN_PLANKS_HANGING_SIGN = registerHangingSignItem("wooden_planks_hanging_sign",
            DecoBlocks.HANGING_WOODEN_PLANKS_SIGN, DecoBlocks.WALL_HANGING_WOODEN_PLANKS_SIGN,
            HangingSignItem::new);
    public static final Item PALE_OAK_PLANKS_HANGING_SIGN = registerHangingSignItem("pale_oak_planks_hanging_sign",
            DecoBlocks.HANGING_PALE_OAK_PLANKS_SIGN, DecoBlocks.WALL_HANGING_PALE_OAK_PLANKS_SIGN,
            HangingSignItem::new);

    public static final Item SNOW_BRICK = registerCooldownItem("snow_brick",16,1,
            SnowBrickItem::new);

    public static final Item BUBBLE_ORB = registerItem("bubble_orb",64, Item::new);

    public static final Item WARPED_WART = registerItem("warped_wart",
            64, createBlockItemWithUniqueName(DecoBlocks.WARPED_WART_PLANT));

    public static final Item ANCIENT_ROSE_SEEDS = registerItem("ancient_rose_seeds",
            64, createBlockItemWithUniqueName(DecoBlocks.ANCIENT_ROSE_CROP));

    public static final Item MIGHTY_LAVENDER_FLOWER = registerItem("mighty_lavender_flower", 64,
            createBlockItemWithUniqueName(DecoBlocks.MIGHTY_LAVENDER_CROP));

    public static final Item COPPER_NUGGET = registerItem("copper_nugget", 64, Item::new);

    public static final Item CACTUS_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CACTUS_BOAT_ID,
            false, false);
    public static final Item CACTUS_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CACTUS_BOAT_ID,
            true, false);

    public static final Item WOODEN_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WOODEN_BOAT_ID,
            false, false);
    public static final Item WOODEN_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WOODEN_BOAT_ID,
            true, false);

    public static final Item CRIMSON_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CRIMSON_BOAT_ID,
            false, false);
    public static final Item CRIMSON_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CRIMSON_BOAT_ID,
            true, false);

    public static final Item WARPED_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WARPED_BOAT_ID,
            false,false);
    public static final Item WARPED_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WARPED_BOAT_ID,
            true, false);

    public static final Block CACTUS_PLANKS = registerBlockItem (DecoBlocks.CACTUS_PLANKS);
    public static final Block CACTUS_PLANK_STAIRS = registerBlockItem (DecoBlocks.CACTUS_PLANK_STAIRS);
    public static final Block CACTUS_PLANK_SLAB = registerBlockItem (DecoBlocks.CACTUS_PLANK_SLAB);
    public static final Block CACTUS_PLANK_FENCE = registerBlockItem (DecoBlocks.CACTUS_PLANK_FENCE);
    public static final Block CACTUS_PLANK_FENCE_GATE = registerBlockItem (DecoBlocks.CACTUS_PLANK_FENCE_GATE);
    public static final Block CACTUS_DOOR = registerBlockItem (DecoBlocks.CACTUS_DOOR);
    public static final Block CACTUS_TRAPDOOR = registerBlockItem (DecoBlocks.CACTUS_TRAPDOOR);
    public static final Block CACTUS_PLANK_PRESSURE_PLATE = registerBlockItem (DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE);
    public static final Block CACTUS_PLANK_BUTTON = registerBlockItem (DecoBlocks.CACTUS_PLANK_BUTTON);
    public static final Block WOODEN_LOG = registerBlockItem (DecoBlocks.WOODEN_LOG);
    public static final Block STRIPPED_WOODEN_LOG = registerBlockItem (DecoBlocks.STRIPPED_WOODEN_LOG);
    public static final Block WOODEN_WOOD = registerBlockItem (DecoBlocks.WOODEN_WOOD);
    public static final Block STRIPPED_WOODEN_WOOD = registerBlockItem (DecoBlocks.STRIPPED_WOODEN_WOOD);
    public static final Block WOODEN_PLANKS = registerBlockItem (DecoBlocks.WOODEN_PLANKS);
    public static final Block WOODEN_STAIRS = registerBlockItem (DecoBlocks.WOODEN_STAIRS);
    public static final Block WOODEN_SLAB = registerBlockItem (DecoBlocks.WOODEN_SLAB);
    public static final Block WOODEN_FENCE = registerBlockItem (DecoBlocks.WOODEN_FENCE);
    public static final Block WOODEN_FENCE_GATE = registerBlockItem (DecoBlocks.WOODEN_FENCE_GATE);
    public static final Block WOODEN_DOOR = registerBlockItem (DecoBlocks.WOODEN_DOOR);
    public static final Block WOODEN_TRAPDOOR = registerBlockItem (DecoBlocks.WOODEN_TRAPDOOR);
    public static final Block WOODEN_PRESSURE_PLATE = registerBlockItem (DecoBlocks.WOODEN_PRESSURE_PLATE);
    public static final Block WOODEN_BUTTON = registerBlockItem (DecoBlocks.WOODEN_BUTTON);
    public static final Block OAK_MOSAIC = registerBlockItem (DecoBlocks.OAK_MOSAIC);
    public static final Block OAK_MOSAIC_STAIRS = registerBlockItem (DecoBlocks.OAK_MOSAIC_STAIRS);
    public static final Block OAK_MOSAIC_SLAB = registerBlockItem (DecoBlocks.OAK_MOSAIC_SLAB);
    public static final Block SPRUCE_MOSAIC = registerBlockItem (DecoBlocks.SPRUCE_MOSAIC);
    public static final Block SPRUCE_MOSAIC_STAIRS = registerBlockItem (DecoBlocks.SPRUCE_MOSAIC_STAIRS);
    public static final Block SPRUCE_MOSAIC_SLAB = registerBlockItem (DecoBlocks.SPRUCE_MOSAIC_SLAB);
    public static final Block BIRCH_MOSAIC = registerBlockItem (DecoBlocks.BIRCH_MOSAIC);
    public static final Block BIRCH_MOSAIC_STAIRS = registerBlockItem (DecoBlocks.BIRCH_MOSAIC_STAIRS);
    public static final Block BIRCH_MOSAIC_SLAB = registerBlockItem (DecoBlocks.BIRCH_MOSAIC_SLAB);
    public static final Block JUNGLE_MOSAIC = registerBlockItem (DecoBlocks.JUNGLE_MOSAIC);
    public static final Block JUNGLE_MOSAIC_STAIRS = registerBlockItem (DecoBlocks.JUNGLE_MOSAIC_STAIRS);
    public static final Block JUNGLE_MOSAIC_SLAB = registerBlockItem (DecoBlocks.JUNGLE_MOSAIC_SLAB);
    public static final Block ACACIA_MOSAIC = registerBlockItem (DecoBlocks.ACACIA_MOSAIC);
    public static final Block ACACIA_MOSAIC_STAIRS = registerBlockItem (DecoBlocks.ACACIA_MOSAIC_STAIRS);
    public static final Block ACACIA_MOSAIC_SLAB = registerBlockItem (DecoBlocks.ACACIA_MOSAIC_SLAB);
    public static final Block DARK_OAK_MOSAIC = registerBlockItem (DecoBlocks.DARK_OAK_MOSAIC);
    public static final Block DARK_OAK_MOSAIC_STAIRS = registerBlockItem (DecoBlocks.DARK_OAK_MOSAIC_STAIRS);
    public static final Block DARK_OAK_MOSAIC_SLAB = registerBlockItem (DecoBlocks.DARK_OAK_MOSAIC_SLAB);
    public static final Block MANGROVE_MOSAIC = registerBlockItem (DecoBlocks.MANGROVE_MOSAIC);
    public static final Block MANGROVE_MOSAIC_STAIRS = registerBlockItem (DecoBlocks.MANGROVE_MOSAIC_STAIRS);
    public static final Block MANGROVE_MOSAIC_SLAB = registerBlockItem (DecoBlocks.MANGROVE_MOSAIC_SLAB);
    public static final Block CHERRY_MOSAIC = registerBlockItem (DecoBlocks.CHERRY_MOSAIC);
    public static final Block CHERRY_MOSAIC_STAIRS = registerBlockItem (DecoBlocks.CHERRY_MOSAIC_STAIRS);
    public static final Block CHERRY_MOSAIC_SLAB = registerBlockItem (DecoBlocks.CHERRY_MOSAIC_SLAB);
    public static final Block CRIMSON_MOSAIC = registerBlockItem (DecoBlocks.CRIMSON_MOSAIC);
    public static final Block CRIMSON_MOSAIC_STAIRS = registerBlockItem (DecoBlocks.CRIMSON_MOSAIC_STAIRS);
    public static final Block CRIMSON_MOSAIC_SLAB = registerBlockItem (DecoBlocks.CRIMSON_MOSAIC_SLAB);
    public static final Block WARPED_MOSAIC = registerBlockItem (DecoBlocks.WARPED_MOSAIC);
    public static final Block WARPED_MOSAIC_STAIRS = registerBlockItem (DecoBlocks.WARPED_MOSAIC_STAIRS);
    public static final Block WARPED_MOSAIC_SLAB = registerBlockItem (DecoBlocks.WARPED_MOSAIC_SLAB);
    public static final Block CACTUS_MOSAIC = registerBlockItem (DecoBlocks.CACTUS_MOSAIC);
    public static final Block CACTUS_MOSAIC_STAIRS = registerBlockItem (DecoBlocks.CACTUS_MOSAIC_STAIRS);
    public static final Block CACTUS_MOSAIC_SLAB = registerBlockItem (DecoBlocks.CACTUS_MOSAIC_SLAB);
    public static final Block WOODEN_MOSAIC = registerBlockItem (DecoBlocks.WOODEN_MOSAIC);
    public static final Block WOODEN_MOSAIC_STAIRS = registerBlockItem (DecoBlocks.WOODEN_MOSAIC_STAIRS);
    public static final Block WOODEN_MOSAIC_SLAB = registerBlockItem (DecoBlocks.WOODEN_MOSAIC_SLAB);
    public static final Block PALE_OAK_MOSAIC = registerBlockItem (DecoBlocks.PALE_OAK_MOSAIC);
    public static final Block PALE_OAK_MOSAIC_STAIRS = registerBlockItem (DecoBlocks.PALE_OAK_MOSAIC_STAIRS);
    public static final Block PALE_OAK_MOSAIC_SLAB = registerBlockItem (DecoBlocks.PALE_OAK_MOSAIC_SLAB);
    public static final Block STONE_WALL = registerBlockItem (DecoBlocks.STONE_WALL);
    public static final Block COBBLESTONE_PRESSURE_PLATE = registerBlockItem (DecoBlocks.COBBLESTONE_PRESSURE_PLATE);
    public static final Block COBBLESTONE_BUTTON = registerBlockItem (DecoBlocks.COBBLESTONE_BUTTON);
    public static final Block POLISHED_STONE = registerBlockItem (DecoBlocks.POLISHED_STONE);
    public static final Block POLISHED_STONE_STAIRS = registerBlockItem (DecoBlocks.POLISHED_STONE_STAIRS);
    public static final Block POLISHED_STONE_SLAB = registerBlockItem (DecoBlocks.POLISHED_STONE_SLAB);
    public static final Block POLISHED_STONE_WALL = registerBlockItem (DecoBlocks.POLISHED_STONE_WALL);
    public static final Block POLISHED_STONE_BUTTON = registerBlockItem (DecoBlocks.POLISHED_STONE_BUTTON);
    public static final Block POLISHED_STONE_PRESSURE_PLATE = registerBlockItem (DecoBlocks.POLISHED_STONE_PRESSURE_PLATE);
    public static final Block CHISELED_STONE = registerBlockItem (DecoBlocks.CHISELED_STONE);
    public static final Block SMOOTH_STONE_STAIRS = registerBlockItem (DecoBlocks.SMOOTH_STONE_STAIRS);
    public static final Block SMOOTH_STONE_WALL = registerBlockItem (DecoBlocks.SMOOTH_STONE_WALL);
    public static final Block STONE_TILES = registerBlockItem (DecoBlocks.STONE_TILES);
    public static final Block STONE_TILE_STAIRS = registerBlockItem (DecoBlocks.STONE_TILE_STAIRS);
    public static final Block STONE_TILE_SLAB = registerBlockItem (DecoBlocks.STONE_TILE_SLAB);
    public static final Block STONE_TILE_WALL = registerBlockItem (DecoBlocks.STONE_TILE_WALL);
    public static final Block POLISHED_GRANITE_WALL = registerBlockItem (DecoBlocks.POLISHED_GRANITE_WALL);
    public static final Block POLISHED_DIORITE_WALL = registerBlockItem (DecoBlocks.POLISHED_DIORITE_WALL);
    public static final Block POLISHED_ANDESITE_WALL = registerBlockItem (DecoBlocks.POLISHED_ANDESITE_WALL);
    public static final Block DEEPSLATE_STAIRS = registerBlockItem (DecoBlocks.DEEPSLATE_STAIRS);
    public static final Block DEEPSLATE_SLAB = registerBlockItem (DecoBlocks.DEEPSLATE_SLAB);
    public static final Block DEEPSLATE_WALL = registerBlockItem (DecoBlocks.DEEPSLATE_WALL);
    public static final Block DEEPSLATE_BUTTON = registerBlockItem (DecoBlocks.DEEPSLATE_BUTTON);
    public static final Block DEEPSLATE_PRESSURE_PLATE = registerBlockItem (DecoBlocks.DEEPSLATE_PRESSURE_PLATE);
    public static final Block COBBLED_DEEPSLATE_BUTTON = registerBlockItem (DecoBlocks.COBBLED_DEEPSLATE_BUTTON);
    public static final Block COBBLED_DEEPSLATE_PRESSURE_PLATE = registerBlockItem (DecoBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE);
    public static final Block POLISHED_DEEPSLATE_BUTTON = registerBlockItem (DecoBlocks.POLISHED_DEEPSLATE_BUTTON);
    public static final Block POLISHED_DEEPSLATE_PRESSURE_PLATE = registerBlockItem (DecoBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE);
    public static final Block SMOOTH_DEEPSLATE = registerBlockItem (DecoBlocks.SMOOTH_DEEPSLATE);
    public static final Block SMOOTH_DEEPSLATE_STAIRS = registerBlockItem (DecoBlocks.SMOOTH_DEEPSLATE_STAIRS);
    public static final Block SMOOTH_DEEPSLATE_SLAB = registerBlockItem (DecoBlocks.SMOOTH_DEEPSLATE_SLAB);
    public static final Block SMOOTH_DEEPSLATE_WALL = registerBlockItem (DecoBlocks.SMOOTH_DEEPSLATE_WALL);
    public static final Block CHISELED_DEEPSLATE_BRICKS = registerBlockItem (DecoBlocks.CHISELED_DEEPSLATE_BRICKS);
    public static final Block TUFF_BUTTON = registerBlockItem (DecoBlocks.TUFF_BUTTON);
    public static final Block TUFF_PRESSURE_PLATE = registerBlockItem (DecoBlocks.TUFF_PRESSURE_PLATE);
    public static final Block POLISHED_TUFF_BUTTON = registerBlockItem (DecoBlocks.POLISHED_TUFF_BUTTON);
    public static final Block POLISHED_TUFF_PRESSURE_PLATE = registerBlockItem (DecoBlocks.POLISHED_TUFF_PRESSURE_PLATE);
    public static final Block SMOOTH_TUFF = registerBlockItem (DecoBlocks.SMOOTH_TUFF);
    public static final Block SMOOTH_TUFF_STAIRS = registerBlockItem (DecoBlocks.SMOOTH_TUFF_STAIRS);
    public static final Block SMOOTH_TUFF_SLAB = registerBlockItem (DecoBlocks.SMOOTH_TUFF_SLAB);
    public static final Block SMOOTH_TUFF_WALL = registerBlockItem (DecoBlocks.SMOOTH_TUFF_WALL);
    public static final Block TUFF_TILES = registerBlockItem (DecoBlocks.TUFF_TILES);
    public static final Block TUFF_TILE_STAIRS = registerBlockItem (DecoBlocks.TUFF_TILE_STAIRS);
    public static final Block TUFF_TILE_SLAB = registerBlockItem (DecoBlocks.TUFF_TILE_SLAB);
    public static final Block TUFF_TILE_WALL = registerBlockItem (DecoBlocks.TUFF_TILE_WALL);
    public static final Block CHISELED_BRICKS = registerBlockItem (DecoBlocks.CHISELED_BRICKS);
    public static final Block PACKED_MUD_STAIRS = registerBlockItem (DecoBlocks.PACKED_MUD_STAIRS);
    public static final Block PACKED_MUD_SLAB = registerBlockItem (DecoBlocks.PACKED_MUD_SLAB);
    public static final Block PACKED_MUD_WALL = registerBlockItem (DecoBlocks.PACKED_MUD_WALL);
    public static final Block SMOOTH_SANDSTONE_WALL = registerBlockItem (DecoBlocks.SMOOTH_SANDSTONE_WALL);
    public static final Block CUT_SANDSTONE_STAIRS = registerBlockItem (DecoBlocks.CUT_SANDSTONE_STAIRS);
    public static final Block CUT_SANDSTONE_WALL = registerBlockItem (DecoBlocks.CUT_SANDSTONE_WALL);
    public static final Block CUT_SANDSTONE_BRICKS = registerBlockItem (DecoBlocks.CUT_SANDSTONE_BRICKS);
    public static final Block CUT_SANDSTONE_BRICK_STAIRS = registerBlockItem (DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS);
    public static final Block CUT_SANDSTONE_BRICK_SLAB = registerBlockItem (DecoBlocks.CUT_SANDSTONE_BRICK_SLAB);
    public static final Block CUT_SANDSTONE_BRICK_WALL = registerBlockItem (DecoBlocks.CUT_SANDSTONE_BRICK_WALL);
    public static final Block SMOOTH_RED_SANDSTONE_WALL = registerBlockItem (DecoBlocks.SMOOTH_RED_SANDSTONE_WALL);
    public static final Block CUT_RED_SANDSTONE_STAIRS = registerBlockItem (DecoBlocks.CUT_RED_SANDSTONE_STAIRS);
    public static final Block CUT_RED_SANDSTONE_WALL = registerBlockItem (DecoBlocks.CUT_RED_SANDSTONE_WALL);
    public static final Block CUT_RED_SANDSTONE_BRICKS = registerBlockItem (DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
    public static final Block CUT_RED_SANDSTONE_BRICK_STAIRS = registerBlockItem (DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS);
    public static final Block CUT_RED_SANDSTONE_BRICK_SLAB = registerBlockItem (DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB);
    public static final Block CUT_RED_SANDSTONE_BRICK_WALL = registerBlockItem (DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL);
    public static final Block DARK_PRISMARINE_WALL = registerBlockItem (DecoBlocks.DARK_PRISMARINE_WALL);
    public static final Block PRISMARINE_BRICK_WALL = registerBlockItem (DecoBlocks.PRISMARINE_BRICK_WALL);
    public static final Block CHISELED_PRISMARINE_BRICKS = registerBlockItem (DecoBlocks.CHISELED_PRISMARINE_BRICKS);
    public static final Block CRYSTALLIZED_PRISMARINE = registerBlockItem (DecoBlocks.CRYSTALLIZED_PRISMARINE);
    public static final Block CRYSTALLIZED_PRISMARINE_STAIRS = registerBlockItem (DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS);
    public static final Block CRYSTALLIZED_PRISMARINE_SLAB = registerBlockItem (DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB);
    public static final Block CRYSTALLIZED_PRISMARINE_WALL = registerBlockItem (DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICKS = registerBlockItem (DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_STAIRS = registerBlockItem (DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_SLAB = registerBlockItem (DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB);
    public static final Block CRYSTALLIZED_PRISMARINE_BRICK_WALL = registerBlockItem (DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL);
    public static final Block CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS = registerBlockItem (DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS);
    public static final Block LIGHT_PRISMARINE = registerBlockItem (DecoBlocks.LIGHT_PRISMARINE);
    public static final Block LIGHT_PRISMARINE_STAIRS = registerBlockItem (DecoBlocks.LIGHT_PRISMARINE_STAIRS);
    public static final Block LIGHT_PRISMARINE_SLAB = registerBlockItem (DecoBlocks.LIGHT_PRISMARINE_SLAB);
    public static final Block LIGHT_PRISMARINE_WALL = registerBlockItem (DecoBlocks.LIGHT_PRISMARINE_WALL);
    public static final Block NETHERRACK_STAIRS = registerBlockItem (DecoBlocks.NETHERRACK_STAIRS);
    public static final Block NETHERRACK_SLAB = registerBlockItem (DecoBlocks.NETHERRACK_SLAB);
    public static final Block NETHERRACK_WALL = registerBlockItem (DecoBlocks.NETHERRACK_WALL);
    public static final Block NETHER_BRICK_FENCE_GATE = registerBlockItem (DecoBlocks.NETHER_BRICK_FENCE_GATE);
    public static final Block CRACKED_RED_NETHER_BRICKS = registerBlockItem (DecoBlocks.CRACKED_RED_NETHER_BRICKS);
    public static final Block RED_NETHER_BRICK_FENCE = registerBlockItem (DecoBlocks.RED_NETHER_BRICK_FENCE);
    public static final Block RED_NETHER_BRICK_FENCE_GATE = registerBlockItem (DecoBlocks.RED_NETHER_BRICK_FENCE_GATE);
    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlockItem (DecoBlocks.CHISELED_RED_NETHER_BRICKS);
    public static final Block BLUE_NETHER_BRICKS = registerBlockItem (DecoBlocks.BLUE_NETHER_BRICKS);
    public static final Block CRACKED_BLUE_NETHER_BRICKS = registerBlockItem (DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);
    public static final Block BLUE_NETHER_BRICK_STAIRS = registerBlockItem (DecoBlocks.BLUE_NETHER_BRICK_STAIRS);
    public static final Block BLUE_NETHER_BRICK_SLAB = registerBlockItem (DecoBlocks.BLUE_NETHER_BRICK_SLAB);
    public static final Block BLUE_NETHER_BRICK_WALL = registerBlockItem (DecoBlocks.BLUE_NETHER_BRICK_WALL);
    public static final Block BLUE_NETHER_BRICK_FENCE = registerBlockItem (DecoBlocks.BLUE_NETHER_BRICK_FENCE);
    public static final Block BLUE_NETHER_BRICK_FENCE_GATE = registerBlockItem (DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE);
    public static final Block CHISELED_BLUE_NETHER_BRICKS = registerBlockItem (DecoBlocks.CHISELED_BLUE_NETHER_BRICKS);
    public static final Block BLACKSTONE_BUTTON = registerBlockItem (DecoBlocks.BLACKSTONE_BUTTON);
    public static final Block BLACKSTONE_PRESSURE_PLATE = registerBlockItem (DecoBlocks.BLACKSTONE_PRESSURE_PLATE);
    public static final Block POLISHED_GLIDED_BLACKSTONE = registerBlockItem (DecoBlocks.POLISHED_GLIDED_BLACKSTONE);
    public static final Block CHISELED_GLIDED_BLACKSTONE = registerBlockItem (DecoBlocks.CHISELED_GLIDED_BLACKSTONE);
    public static final Block SMOOTH_BLACKSTONE = registerBlockItem (DecoBlocks.SMOOTH_BLACKSTONE);
    public static final Block SMOOTH_BLACKSTONE_STAIRS = registerBlockItem (DecoBlocks.SMOOTH_BLACKSTONE_STAIRS);
    public static final Block SMOOTH_BLACKSTONE_SLAB = registerBlockItem (DecoBlocks.SMOOTH_BLACKSTONE_SLAB);
    public static final Block SMOOTH_BLACKSTONE_WALL = registerBlockItem (DecoBlocks.SMOOTH_BLACKSTONE_WALL);
    public static final Block CHISELED_POLISHED_BLACKSTONE_BRICKS = registerBlockItem (DecoBlocks.CHISELED_POLISHED_BLACKSTONE_BRICKS);
    public static final Block POLISHED_BLACKSTONE_TILES = registerBlockItem (DecoBlocks.POLISHED_BLACKSTONE_TILES);
    public static final Block POLISHED_BLACKSTONE_TILE_STAIRS = registerBlockItem (DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS);
    public static final Block POLISHED_BLACKSTONE_TILE_SLAB = registerBlockItem (DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB);
    public static final Block POLISHED_BLACKSTONE_TILE_WALL = registerBlockItem (DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL);
    public static final Block END_STONE_STAIRS = registerBlockItem (DecoBlocks.END_STONE_STAIRS);
    public static final Block END_STONE_SLAB = registerBlockItem (DecoBlocks.END_STONE_SLAB);
    public static final Block END_STONE_WALL = registerBlockItem (DecoBlocks.END_STONE_WALL);
    public static final Block CHISELED_END_STONE = registerBlockItem (DecoBlocks.CHISELED_END_STONE);
    public static final Block VOID_STONE = registerBlockItem (DecoBlocks.VOID_STONE);
    public static final Block VOID_STONE_STAIRS = registerBlockItem (DecoBlocks.VOID_STONE_STAIRS);
    public static final Block VOID_STONE_SLAB = registerBlockItem (DecoBlocks.VOID_STONE_SLAB);
    public static final Block VOID_STONE_WALL = registerBlockItem (DecoBlocks.VOID_STONE_WALL);
    public static final Block CHISELED_VOID_STONE = registerBlockItem (DecoBlocks.CHISELED_VOID_STONE);
    public static final Block VOID_STONE_BRICKS = registerBlockItem (DecoBlocks.VOID_STONE_BRICKS);
    public static final Block VOID_STONE_BRICK_STAIRS = registerBlockItem (DecoBlocks.VOID_STONE_BRICK_STAIRS);
    public static final Block VOID_STONE_BRICK_SLAB = registerBlockItem (DecoBlocks.VOID_STONE_BRICK_SLAB);
    public static final Block VOID_STONE_BRICK_WALL = registerBlockItem (DecoBlocks.VOID_STONE_BRICK_WALL);
    public static final Block CHISELED_PURPUR = registerBlockItem (DecoBlocks.CHISELED_PURPUR);
    public static final Block PURPUR_BRICKS = registerBlockItem (DecoBlocks.PURPUR_BRICKS);
    public static final Block PURPUR_BRICK_STAIRS = registerBlockItem (DecoBlocks.PURPUR_BRICK_STAIRS);
    public static final Block PURPUR_BRICK_SLAB = registerBlockItem (DecoBlocks.PURPUR_BRICK_SLAB);
    public static final Block PURPUR_BRICK_WALL = registerBlockItem (DecoBlocks.PURPUR_BRICK_WALL);
    public static final Block SMOOTH_PURPUR = registerBlockItem (DecoBlocks.SMOOTH_PURPUR);
    public static final Block SMOOTH_PURPUR_STAIRS = registerBlockItem (DecoBlocks.SMOOTH_PURPUR_STAIRS);
    public static final Block SMOOTH_PURPUR_SLAB = registerBlockItem (DecoBlocks.SMOOTH_PURPUR_SLAB);
    public static final Block SMOOTH_PURPUR_WALL = registerBlockItem (DecoBlocks.SMOOTH_PURPUR_WALL);
    public static final Block CHARCOAL_BLOCK = registerBlockItem (DecoBlocks.CHARCOAL_BLOCK);
    public static final Block FLINT_BLOCK = registerBlockItem (DecoBlocks.FLINT_BLOCK);
    public static final Block CHISELED_IRON = registerBlockItem (DecoBlocks.CHISELED_IRON);
    public static final Block IRON_GRATE = registerBlockItem (DecoBlocks.IRON_GRATE);
    public static final Block CUT_IRON = registerBlockItem (DecoBlocks.CUT_IRON);
    public static final Block CUT_IRON_STAIRS = registerBlockItem (DecoBlocks.CUT_IRON_STAIRS);
    public static final Block CUT_IRON_SLAB = registerBlockItem (DecoBlocks.CUT_IRON_SLAB);
    public static final Block LIGHT_IRON_BARS = registerBlockItem (DecoBlocks.LIGHT_IRON_BARS);
    public static final Block HEAVY_IRON_BARS = registerBlockItem (DecoBlocks.HEAVY_IRON_BARS);
    public static final Block IRON_BUTTON = registerBlockItem (DecoBlocks.IRON_BUTTON);
    public static final Block GOLD_DOOR = registerBlockItem (DecoBlocks.GOLD_DOOR);
    public static final Block GOLD_TRAPDOOR = registerBlockItem (DecoBlocks.GOLD_TRAPDOOR);
    public static final Block GOLD_BUTTON = registerBlockItem (DecoBlocks.GOLD_BUTTON);
    public static final Block QUARTZ_WALL = registerBlockItem (DecoBlocks.QUARTZ_WALL);
    public static final Block QUARTZ_BRICK_STAIRS = registerBlockItem (DecoBlocks.QUARTZ_BRICK_STAIRS);
    public static final Block QUARTZ_BRICK_SLAB = registerBlockItem (DecoBlocks.QUARTZ_BRICK_SLAB);
    public static final Block QUARTZ_BRICK_WALL = registerBlockItem (DecoBlocks.QUARTZ_BRICK_WALL);
    public static final Block SMOOTH_QUARTZ_WALL = registerBlockItem (DecoBlocks.SMOOTH_QUARTZ_WALL);
    public static final Block CUT_QUARTZ = registerBlockItem (DecoBlocks.CUT_QUARTZ);
    public static final Block CUT_QUARTZ_STAIRS = registerBlockItem (DecoBlocks.CUT_QUARTZ_STAIRS);
    public static final Block CUT_QUARTZ_SLAB = registerBlockItem (DecoBlocks.CUT_QUARTZ_SLAB);
    public static final Block CUT_QUARTZ_WALL = registerBlockItem (DecoBlocks.CUT_QUARTZ_WALL);
    public static final Block ECHO_BLOCK = registerBlockItem (DecoBlocks.ECHO_BLOCK);
    public static final Block LIGHT_COPPER_BARS = registerBlockItem (DecoBlocks.LIGHT_COPPER_BARS);
    public static final Block WAXED_LIGHT_COPPER_BARS = registerBlockItem (DecoBlocks.WAXED_LIGHT_COPPER_BARS);
    public static final Block EXPOSED_LIGHT_COPPER_BARS = registerBlockItem (DecoBlocks.EXPOSED_LIGHT_COPPER_BARS);
    public static final Block WAXED_EXPOSED_LIGHT_COPPER_BARS = registerBlockItem (DecoBlocks.WAXED_EXPOSED_LIGHT_COPPER_BARS);
    public static final Block WEATHERED_LIGHT_COPPER_BARS = registerBlockItem (DecoBlocks.WEATHERED_LIGHT_COPPER_BARS);
    public static final Block WAXED_WEATHERED_LIGHT_COPPER_BARS = registerBlockItem (DecoBlocks.WAXED_WEATHERED_LIGHT_COPPER_BARS);
    public static final Block OXIDIZED_LIGHT_COPPER_BARS = registerBlockItem (DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS);
    public static final Block WAXED_OXIDIZED_LIGHT_COPPER_BARS = registerBlockItem (DecoBlocks.WAXED_OXIDIZED_LIGHT_COPPER_BARS);
    public static final Block COPPER_BARS = registerBlockItem (DecoBlocks.COPPER_BARS);
    public static final Block WAXED_COPPER_BARS = registerBlockItem (DecoBlocks.WAXED_COPPER_BARS);
    public static final Block EXPOSED_COPPER_BARS = registerBlockItem (DecoBlocks.EXPOSED_COPPER_BARS);
    public static final Block WAXED_EXPOSED_COPPER_BARS = registerBlockItem (DecoBlocks.WAXED_EXPOSED_COPPER_BARS);
    public static final Block WEATHERED_COPPER_BARS = registerBlockItem (DecoBlocks.WEATHERED_COPPER_BARS);
    public static final Block WAXED_WEATHERED_COPPER_BARS = registerBlockItem (DecoBlocks.WAXED_WEATHERED_COPPER_BARS);
    public static final Block OXIDIZED_COPPER_BARS = registerBlockItem (DecoBlocks.OXIDIZED_COPPER_BARS);
    public static final Block WAXED_OXIDIZED_COPPER_BARS = registerBlockItem (DecoBlocks.WAXED_OXIDIZED_COPPER_BARS);
    public static final Block HEAVY_COPPER_BARS = registerBlockItem (DecoBlocks.HEAVY_COPPER_BARS);
    public static final Block WAXED_HEAVY_COPPER_BARS = registerBlockItem (DecoBlocks.WAXED_HEAVY_COPPER_BARS);
    public static final Block EXPOSED_HEAVY_COPPER_BARS = registerBlockItem (DecoBlocks.EXPOSED_HEAVY_COPPER_BARS);
    public static final Block WAXED_EXPOSED_HEAVY_COPPER_BARS = registerBlockItem (DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS);
    public static final Block WEATHERED_HEAVY_COPPER_BARS = registerBlockItem (DecoBlocks.WEATHERED_HEAVY_COPPER_BARS);
    public static final Block WAXED_WEATHERED_HEAVY_COPPER_BARS = registerBlockItem (DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS);
    public static final Block OXIDIZED_HEAVY_COPPER_BARS = registerBlockItem (DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS);
    public static final Block WAXED_OXIDIZED_HEAVY_COPPER_BARS = registerBlockItem (DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS);
    public static final Block COPPER_CHAIN = registerBlockItem (DecoBlocks.COPPER_CHAIN);
    public static final Block WAXED_COPPER_CHAIN = registerBlockItem (DecoBlocks.WAXED_COPPER_CHAIN);
    public static final Block EXPOSED_COPPER_CHAIN = registerBlockItem (DecoBlocks.EXPOSED_COPPER_CHAIN);
    public static final Block WAXED_EXPOSED_COPPER_CHAIN = registerBlockItem (DecoBlocks.WAXED_EXPOSED_COPPER_CHAIN);
    public static final Block WEATHERED_COPPER_CHAIN = registerBlockItem (DecoBlocks.WEATHERED_COPPER_CHAIN);
    public static final Block WAXED_WEATHERED_COPPER_CHAIN = registerBlockItem (DecoBlocks.WAXED_WEATHERED_COPPER_CHAIN);
    public static final Block OXIDIZED_COPPER_CHAIN = registerBlockItem (DecoBlocks.OXIDIZED_COPPER_CHAIN);
    public static final Block WAXED_OXIDIZED_COPPER_CHAIN = registerBlockItem (DecoBlocks.WAXED_OXIDIZED_COPPER_CHAIN);
    public static final Block COPPER_WEIGHT_PRESSURE_PLATE = registerBlockItem (DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE);
    public static final Block WAXED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlockItem (DecoBlocks.WAXED_COPPER_WEIGHT_PRESSURE_PLATE);
    public static final Block EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlockItem (DecoBlocks.EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE);
    public static final Block WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlockItem (DecoBlocks.WAXED_EXPOSED_COPPER_WEIGHT_PRESSURE_PLATE);
    public static final Block WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlockItem (DecoBlocks.WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE);
    public static final Block WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlockItem (DecoBlocks.WAXED_WEATHERED_COPPER_WEIGHT_PRESSURE_PLATE);
    public static final Block OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlockItem (DecoBlocks.OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE);
    public static final Block WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE = registerBlockItem (DecoBlocks.WAXED_OXIDIZED_COPPER_WEIGHT_PRESSURE_PLATE);
    public static final Block COPPER_BUTTON = registerBlockItem (DecoBlocks.COPPER_BUTTON);
    public static final Block WAXED_COPPER_BUTTON = registerBlockItem (DecoBlocks.WAXED_COPPER_BUTTON);
    public static final Block EXPOSED_COPPER_BUTTON = registerBlockItem (DecoBlocks.EXPOSED_COPPER_BUTTON);
    public static final Block WAXED_EXPOSED_COPPER_BUTTON = registerBlockItem (DecoBlocks.WAXED_EXPOSED_COPPER_BUTTON);
    public static final Block WEATHERED_COPPER_BUTTON = registerBlockItem (DecoBlocks.WEATHERED_COPPER_BUTTON);
    public static final Block WAXED_WEATHERED_COPPER_BUTTON = registerBlockItem (DecoBlocks.WAXED_WEATHERED_COPPER_BUTTON);
    public static final Block OXIDIZED_COPPER_BUTTON = registerBlockItem (DecoBlocks.OXIDIZED_COPPER_BUTTON);
    public static final Block WAXED_OXIDIZED_COPPER_BUTTON = registerBlockItem (DecoBlocks.WAXED_OXIDIZED_COPPER_BUTTON);
    public static final Block PACKED_ICE_STAIRS = registerBlockItem (DecoBlocks.PACKED_ICE_STAIRS);
    public static final Block PACKED_ICE_SLAB = registerBlockItem (DecoBlocks.PACKED_ICE_SLAB);
    public static final Block PACKED_ICE_WALL = registerBlockItem (DecoBlocks.PACKED_ICE_WALL);
    public static final Block BLUE_ICE_STAIRS = registerBlockItem (DecoBlocks.BLUE_ICE_STAIRS);
    public static final Block BLUE_ICE_SLAB = registerBlockItem (DecoBlocks.BLUE_ICE_SLAB);
    public static final Block BLUE_ICE_WALL = registerBlockItem (DecoBlocks.BLUE_ICE_WALL);
    public static final Block ICE_BRICKS = registerBlockItem (DecoBlocks.ICE_BRICKS);
    public static final Block ICE_BRICK_STAIRS = registerBlockItem (DecoBlocks.ICE_BRICK_STAIRS);
    public static final Block ICE_BRICK_SLAB = registerBlockItem (DecoBlocks.ICE_BRICK_SLAB);
    public static final Block ICE_BRICK_WALL = registerBlockItem (DecoBlocks.ICE_BRICK_WALL);
    public static final Block BLACK_ICE = registerBlockItem (DecoBlocks.BLACK_ICE);;
    public static final Block SNOW_STAIRS = registerBlockItem (DecoBlocks.SNOW_STAIRS);
    public static final Block SNOW_SLAB = registerBlockItem (DecoBlocks.SNOW_SLAB);
    public static final Block SNOW_WALL = registerBlockItem (DecoBlocks.SNOW_WALL);
    public static final Block SNOW_BRICKS = registerBlockItem (DecoBlocks.SNOW_BRICKS);
    public static final Block SNOW_BRICK_STAIRS = registerBlockItem (DecoBlocks.SNOW_BRICK_STAIRS);
    public static final Block SNOW_BRICK_SLAB = registerBlockItem (DecoBlocks.SNOW_BRICK_SLAB);
    public static final Block SNOW_BRICK_WALL = registerBlockItem (DecoBlocks.SNOW_BRICK_WALL);
    public static final Block CHISELED_SNOW_BRICKS = registerBlockItem (DecoBlocks.CHISELED_SNOW_BRICKS);
    public static final Block CALCITE_STAIRS = registerBlockItem (DecoBlocks.CALCITE_STAIRS);
    public static final Block CALCITE_SLAB = registerBlockItem (DecoBlocks.CALCITE_SLAB);
    public static final Block CALCITE_WALL = registerBlockItem (DecoBlocks.CALCITE_WALL);
    public static final Block DRIPSTONE_STAIRS = registerBlockItem (DecoBlocks.DRIPSTONE_STAIRS);
    public static final Block DRIPSTONE_SLAB = registerBlockItem (DecoBlocks.DRIPSTONE_SLAB);
    public static final Block DRIPSTONE_WALL = registerBlockItem (DecoBlocks.DRIPSTONE_WALL);
    public static final Block BUBBLE_BLOCK = registerBlockItem (DecoBlocks.BUBBLE_BLOCK);
    public static final Block BUBBLE_STAIRS = registerBlockItem (DecoBlocks.BUBBLE_STAIRS);
    public static final Block BUBBLE_SLAB = registerBlockItem (DecoBlocks.BUBBLE_SLAB);
    public static final Block BUBBLE_WALL = registerBlockItem (DecoBlocks.BUBBLE_WALL);
    public static final Block BUBBLE_BRICKS = registerBlockItem (DecoBlocks.BUBBLE_BRICKS);
    public static final Block BUBBLE_BRICK_STAIRS = registerBlockItem (DecoBlocks.BUBBLE_BRICK_STAIRS);
    public static final Block BUBBLE_BRICK_SLAB = registerBlockItem (DecoBlocks.BUBBLE_BRICK_SLAB);
    public static final Block BUBBLE_BRICK_WALL = registerBlockItem (DecoBlocks.BUBBLE_BRICK_WALL);
    public static final Block CHISELED_BUBBLE_BRICKS = registerBlockItem (DecoBlocks.CHISELED_BUBBLE_BRICKS);
    public static final Block MAGMA_STAIRS = registerBlockItem (DecoBlocks.MAGMA_STAIRS);
    public static final Block MAGMA_SLAB = registerBlockItem (DecoBlocks.MAGMA_SLAB);
    public static final Block MAGMA_WALL = registerBlockItem (DecoBlocks.MAGMA_WALL);
    public static final Block MAGMA_BRICKS = registerBlockItem (DecoBlocks.MAGMA_BRICKS);
    public static final Block MAGMA_BRICK_STAIRS = registerBlockItem (DecoBlocks.MAGMA_BRICK_STAIRS);
    public static final Block MAGMA_BRICK_SLAB = registerBlockItem (DecoBlocks.MAGMA_BRICK_SLAB);
    public static final Block MAGMA_BRICK_WALL = registerBlockItem (DecoBlocks.MAGMA_BRICK_WALL);
    public static final Block CHISELED_MAGMA_BRICKS = registerBlockItem (DecoBlocks.CHISELED_MAGMA_BRICKS);
    public static final Block OBSIDIAN_STAIRS = registerBlockItem (DecoBlocks.OBSIDIAN_STAIRS);
    public static final Block OBSIDIAN_SLAB = registerBlockItem (DecoBlocks.OBSIDIAN_SLAB);
    public static final Block OBSIDIAN_WALL = registerBlockItem (DecoBlocks.OBSIDIAN_WALL);
    public static final Block CHISELED_OBSIDIAN = registerBlockItem (DecoBlocks.CHISELED_OBSIDIAN);
    public static final Block OBSIDIAN_BRICKS = registerBlockItem (DecoBlocks.OBSIDIAN_BRICKS);
    public static final Block OBSIDIAN_BRICK_STAIRS = registerBlockItem (DecoBlocks.OBSIDIAN_BRICK_STAIRS);
    public static final Block OBSIDIAN_BRICK_SLAB = registerBlockItem (DecoBlocks.OBSIDIAN_BRICK_SLAB);
    public static final Block OBSIDIAN_BRICK_WALL = registerBlockItem (DecoBlocks.OBSIDIAN_BRICK_WALL);
    public static final Block OBSIDIAN_PILLAR = registerBlockItem (DecoBlocks.OBSIDIAN_PILLAR);
    public static final Block SOUL_SOILSTONE = registerBlockItem (DecoBlocks.SOUL_SOILSTONE);
    public static final Block SOUL_SOILSTONE_STAIRS = registerBlockItem (DecoBlocks.SOUL_SOILSTONE_STAIRS);
    public static final Block SOUL_SOILSTONE_SLAB = registerBlockItem (DecoBlocks.SOUL_SOILSTONE_SLAB);
    public static final Block SOUL_SOILSTONE_WALL = registerBlockItem (DecoBlocks.SOUL_SOILSTONE_WALL);
    public static final Block CHISELED_SOUL_SOILSTONE = registerBlockItem (DecoBlocks.CHISELED_SOUL_SOILSTONE);
    public static final Block SMOOTH_SOUL_SOILSTONE = registerBlockItem (DecoBlocks.SMOOTH_SOUL_SOILSTONE);
    public static final Block SMOOTH_SOUL_SOILSTONE_STAIRS = registerBlockItem (DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS);
    public static final Block SMOOTH_SOUL_SOILSTONE_SLAB = registerBlockItem (DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB);
    public static final Block SMOOTH_SOUL_SOILSTONE_WALL = registerBlockItem (DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL);
    public static final Block CUT_SOUL_SOILSTONE = registerBlockItem (DecoBlocks.CUT_SOUL_SOILSTONE);
    public static final Block CUT_SOUL_SOILSTONE_STAIRS = registerBlockItem (DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS);
    public static final Block CUT_SOUL_SOILSTONE_SLAB = registerBlockItem (DecoBlocks.CUT_SOUL_SOILSTONE_SLAB);
    public static final Block CUT_SOUL_SOILSTONE_WALL = registerBlockItem (DecoBlocks.CUT_SOUL_SOILSTONE_WALL);
    public static final Block CUT_SOUL_SOILSTONE_BRICKS = registerBlockItem (DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
    public static final Block CUT_SOUL_SOILSTONE_BRICK_STAIRS = registerBlockItem (DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS);
    public static final Block CUT_SOUL_SOILSTONE_BRICK_SLAB = registerBlockItem (DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB);
    public static final Block CUT_SOUL_SOILSTONE_BRICK_WALL = registerBlockItem (DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL);
    public static final Block TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.TERRACOTTA_STAIRS);
    public static final Block TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.TERRACOTTA_SLAB);
    public static final Block TERRACOTTA_WALL = registerBlockItem (DecoBlocks.TERRACOTTA_WALL);
    public static final Block WHITE_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.WHITE_TERRACOTTA_STAIRS);
    public static final Block WHITE_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.WHITE_TERRACOTTA_SLAB);
    public static final Block WHITE_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.WHITE_TERRACOTTA_WALL);
    public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
    public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
    public static final Block LIGHT_GRAY_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
    public static final Block GRAY_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.GRAY_TERRACOTTA_STAIRS);
    public static final Block GRAY_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.GRAY_TERRACOTTA_SLAB);
    public static final Block GRAY_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.GRAY_TERRACOTTA_WALL);
    public static final Block BLACK_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.BLACK_TERRACOTTA_STAIRS);
    public static final Block BLACK_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.BLACK_TERRACOTTA_SLAB);
    public static final Block BLACK_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.BLACK_TERRACOTTA_WALL);
    public static final Block BROWN_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.BROWN_TERRACOTTA_STAIRS);
    public static final Block BROWN_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.BROWN_TERRACOTTA_SLAB);
    public static final Block BROWN_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.BROWN_TERRACOTTA_WALL);
    public static final Block RED_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.RED_TERRACOTTA_STAIRS);
    public static final Block RED_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.RED_TERRACOTTA_SLAB);
    public static final Block RED_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.RED_TERRACOTTA_WALL);
    public static final Block ORANGE_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.ORANGE_TERRACOTTA_STAIRS);
    public static final Block ORANGE_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.ORANGE_TERRACOTTA_SLAB);
    public static final Block ORANGE_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.ORANGE_TERRACOTTA_WALL);
    public static final Block YELLOW_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.YELLOW_TERRACOTTA_STAIRS);
    public static final Block YELLOW_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.YELLOW_TERRACOTTA_SLAB);
    public static final Block YELLOW_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.YELLOW_TERRACOTTA_WALL);
    public static final Block LIME_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.LIME_TERRACOTTA_STAIRS);
    public static final Block LIME_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.LIME_TERRACOTTA_SLAB);
    public static final Block LIME_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.LIME_TERRACOTTA_WALL);
    public static final Block GREEN_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.GREEN_TERRACOTTA_STAIRS);
    public static final Block GREEN_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.GREEN_TERRACOTTA_SLAB);
    public static final Block GREEN_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.GREEN_TERRACOTTA_WALL);
    public static final Block CYAN_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.CYAN_TERRACOTTA_STAIRS);
    public static final Block CYAN_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.CYAN_TERRACOTTA_SLAB);
    public static final Block CYAN_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.CYAN_TERRACOTTA_WALL);
    public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
    public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
    public static final Block LIGHT_BLUE_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
    public static final Block BLUE_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.BLUE_TERRACOTTA_STAIRS);
    public static final Block BLUE_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.BLUE_TERRACOTTA_SLAB);
    public static final Block BLUE_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.BLUE_TERRACOTTA_WALL);
    public static final Block PURPLE_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.PURPLE_TERRACOTTA_STAIRS);
    public static final Block PURPLE_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.PURPLE_TERRACOTTA_SLAB);
    public static final Block PURPLE_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.PURPLE_TERRACOTTA_WALL);
    public static final Block MAGENTA_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.MAGENTA_TERRACOTTA_STAIRS);
    public static final Block MAGENTA_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.MAGENTA_TERRACOTTA_SLAB);
    public static final Block MAGENTA_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.MAGENTA_TERRACOTTA_WALL);
    public static final Block PINK_TERRACOTTA_STAIRS = registerBlockItem (DecoBlocks.PINK_TERRACOTTA_STAIRS);
    public static final Block PINK_TERRACOTTA_SLAB = registerBlockItem (DecoBlocks.PINK_TERRACOTTA_SLAB);
    public static final Block PINK_TERRACOTTA_WALL = registerBlockItem (DecoBlocks.PINK_TERRACOTTA_WALL);
    public static final Block TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.TERRACOTTA_BRICKS);
    public static final Block TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.TERRACOTTA_BRICK_STAIRS);
    public static final Block TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.TERRACOTTA_BRICK_SLAB);
    public static final Block TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.TERRACOTTA_BRICK_WALL);
    public static final Block WHITE_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.WHITE_TERRACOTTA_BRICKS);
    public static final Block WHITE_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS);
    public static final Block WHITE_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB);
    public static final Block WHITE_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB);
    public static final Block LIGHT_GRAY_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL);
    public static final Block GRAY_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.GRAY_TERRACOTTA_BRICKS);
    public static final Block GRAY_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS);
    public static final Block GRAY_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB);
    public static final Block GRAY_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL);
    public static final Block BLACK_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.BLACK_TERRACOTTA_BRICKS);
    public static final Block BLACK_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS);
    public static final Block BLACK_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB);
    public static final Block BLACK_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL);
    public static final Block BROWN_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.BROWN_TERRACOTTA_BRICKS);
    public static final Block BROWN_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS);
    public static final Block BROWN_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB);
    public static final Block BROWN_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL);
    public static final Block RED_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.RED_TERRACOTTA_BRICKS);
    public static final Block RED_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS);
    public static final Block RED_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.RED_TERRACOTTA_BRICK_SLAB);
    public static final Block RED_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.RED_TERRACOTTA_BRICK_WALL);
    public static final Block ORANGE_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
    public static final Block ORANGE_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS);
    public static final Block ORANGE_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB);
    public static final Block ORANGE_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL);
    public static final Block YELLOW_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
    public static final Block YELLOW_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS);
    public static final Block YELLOW_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB);
    public static final Block YELLOW_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL);
    public static final Block LIME_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.LIME_TERRACOTTA_BRICKS);
    public static final Block LIME_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS);
    public static final Block LIME_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB);
    public static final Block LIME_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.LIME_TERRACOTTA_BRICK_WALL);
    public static final Block GREEN_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.GREEN_TERRACOTTA_BRICKS);
    public static final Block GREEN_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS);
    public static final Block GREEN_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB);
    public static final Block GREEN_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL);
    public static final Block CYAN_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.CYAN_TERRACOTTA_BRICKS);
    public static final Block CYAN_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS);
    public static final Block CYAN_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB);
    public static final Block CYAN_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB);
    public static final Block LIGHT_BLUE_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL);
    public static final Block BLUE_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.BLUE_TERRACOTTA_BRICKS);
    public static final Block BLUE_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS);
    public static final Block BLUE_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB);
    public static final Block BLUE_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL);
    public static final Block PURPLE_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
    public static final Block PURPLE_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS);
    public static final Block PURPLE_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB);
    public static final Block PURPLE_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL);
    public static final Block MAGENTA_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
    public static final Block MAGENTA_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS);
    public static final Block MAGENTA_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB);
    public static final Block MAGENTA_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL);
    public static final Block PINK_TERRACOTTA_BRICKS = registerBlockItem (DecoBlocks.PINK_TERRACOTTA_BRICKS);
    public static final Block PINK_TERRACOTTA_BRICK_STAIRS = registerBlockItem (DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS);
    public static final Block PINK_TERRACOTTA_BRICK_SLAB = registerBlockItem (DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB);
    public static final Block PINK_TERRACOTTA_BRICK_WALL = registerBlockItem (DecoBlocks.PINK_TERRACOTTA_BRICK_WALL);
    public static final Block WHITE_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.WHITE_CONCRETE_STAIRS);
    public static final Block WHITE_CONCRETE_SLAB = registerBlockItem (DecoBlocks.WHITE_CONCRETE_SLAB);
    public static final Block WHITE_CONCRETE_WALL = registerBlockItem (DecoBlocks.WHITE_CONCRETE_WALL);
    public static final Block LIGHT_GRAY_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
    public static final Block LIGHT_GRAY_CONCRETE_SLAB = registerBlockItem (DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB);
    public static final Block LIGHT_GRAY_CONCRETE_WALL = registerBlockItem (DecoBlocks.LIGHT_GRAY_CONCRETE_WALL);
    public static final Block GRAY_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.GRAY_CONCRETE_STAIRS);
    public static final Block GRAY_CONCRETE_SLAB = registerBlockItem (DecoBlocks.GRAY_CONCRETE_SLAB);
    public static final Block GRAY_CONCRETE_WALL = registerBlockItem (DecoBlocks.GRAY_CONCRETE_WALL);
    public static final Block BLACK_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.BLACK_CONCRETE_STAIRS);
    public static final Block BLACK_CONCRETE_SLAB = registerBlockItem (DecoBlocks.BLACK_CONCRETE_SLAB);
    public static final Block BLACK_CONCRETE_WALL = registerBlockItem (DecoBlocks.BLACK_CONCRETE_WALL);
    public static final Block BROWN_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.BROWN_CONCRETE_STAIRS);
    public static final Block BROWN_CONCRETE_SLAB = registerBlockItem (DecoBlocks.BROWN_CONCRETE_SLAB);
    public static final Block BROWN_CONCRETE_WALL = registerBlockItem (DecoBlocks.BROWN_CONCRETE_WALL);
    public static final Block RED_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.RED_CONCRETE_STAIRS);
    public static final Block RED_CONCRETE_SLAB = registerBlockItem (DecoBlocks.RED_CONCRETE_SLAB);
    public static final Block RED_CONCRETE_WALL = registerBlockItem (DecoBlocks.RED_CONCRETE_WALL);
    public static final Block ORANGE_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.ORANGE_CONCRETE_STAIRS);
    public static final Block ORANGE_CONCRETE_SLAB = registerBlockItem (DecoBlocks.ORANGE_CONCRETE_SLAB);
    public static final Block ORANGE_CONCRETE_WALL = registerBlockItem (DecoBlocks.ORANGE_CONCRETE_WALL);
    public static final Block YELLOW_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.YELLOW_CONCRETE_STAIRS);
    public static final Block YELLOW_CONCRETE_SLAB = registerBlockItem (DecoBlocks.YELLOW_CONCRETE_SLAB);
    public static final Block YELLOW_CONCRETE_WALL = registerBlockItem (DecoBlocks.YELLOW_CONCRETE_WALL);
    public static final Block LIME_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.LIME_CONCRETE_STAIRS);
    public static final Block LIME_CONCRETE_SLAB = registerBlockItem (DecoBlocks.LIME_CONCRETE_SLAB);
    public static final Block LIME_CONCRETE_WALL = registerBlockItem (DecoBlocks.LIME_CONCRETE_WALL);
    public static final Block GREEN_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.GREEN_CONCRETE_STAIRS);
    public static final Block GREEN_CONCRETE_SLAB = registerBlockItem (DecoBlocks.GREEN_CONCRETE_SLAB);
    public static final Block GREEN_CONCRETE_WALL = registerBlockItem (DecoBlocks.GREEN_CONCRETE_WALL);
    public static final Block CYAN_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CYAN_CONCRETE_STAIRS);
    public static final Block CYAN_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CYAN_CONCRETE_SLAB);
    public static final Block CYAN_CONCRETE_WALL = registerBlockItem (DecoBlocks.CYAN_CONCRETE_WALL);
    public static final Block LIGHT_BLUE_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
    public static final Block LIGHT_BLUE_CONCRETE_SLAB = registerBlockItem (DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB);
    public static final Block LIGHT_BLUE_CONCRETE_WALL = registerBlockItem (DecoBlocks.LIGHT_BLUE_CONCRETE_WALL);
    public static final Block BLUE_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.BLUE_CONCRETE_STAIRS);
    public static final Block BLUE_CONCRETE_SLAB = registerBlockItem (DecoBlocks.BLUE_CONCRETE_SLAB);
    public static final Block BLUE_CONCRETE_WALL = registerBlockItem (DecoBlocks.BLUE_CONCRETE_WALL);
    public static final Block PURPLE_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.PURPLE_CONCRETE_STAIRS);
    public static final Block PURPLE_CONCRETE_SLAB = registerBlockItem (DecoBlocks.PURPLE_CONCRETE_SLAB);
    public static final Block PURPLE_CONCRETE_WALL = registerBlockItem (DecoBlocks.PURPLE_CONCRETE_WALL);
    public static final Block PINK_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.PINK_CONCRETE_STAIRS);
    public static final Block PINK_CONCRETE_SLAB = registerBlockItem (DecoBlocks.PINK_CONCRETE_SLAB);
    public static final Block PINK_CONCRETE_WALL = registerBlockItem (DecoBlocks.PINK_CONCRETE_WALL);
    public static final Block MAGENTA_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.MAGENTA_CONCRETE_STAIRS);
    public static final Block MAGENTA_CONCRETE_SLAB = registerBlockItem (DecoBlocks.MAGENTA_CONCRETE_SLAB);
    public static final Block MAGENTA_CONCRETE_WALL = registerBlockItem (DecoBlocks.MAGENTA_CONCRETE_WALL);
    public static final Block CUT_WHITE_CONCRETE = registerBlockItem (DecoBlocks.CUT_WHITE_CONCRETE);
    public static final Block CUT_WHITE_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_WHITE_CONCRETE_STAIRS);
    public static final Block CUT_WHITE_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_WHITE_CONCRETE_SLAB);
    public static final Block CUT_WHITE_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_WHITE_CONCRETE_WALL);
    public static final Block CUT_LIGHT_GRAY_CONCRETE = registerBlockItem (DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
    public static final Block CUT_LIGHT_GRAY_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS);
    public static final Block CUT_LIGHT_GRAY_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB);
    public static final Block CUT_LIGHT_GRAY_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL);
    public static final Block CUT_GRAY_CONCRETE = registerBlockItem (DecoBlocks.CUT_GRAY_CONCRETE);
    public static final Block CUT_GRAY_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_GRAY_CONCRETE_STAIRS);
    public static final Block CUT_GRAY_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_GRAY_CONCRETE_SLAB);
    public static final Block CUT_GRAY_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_GRAY_CONCRETE_WALL);
    public static final Block CUT_BLACK_CONCRETE = registerBlockItem (DecoBlocks.CUT_BLACK_CONCRETE);
    public static final Block CUT_BLACK_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_BLACK_CONCRETE_STAIRS);
    public static final Block CUT_BLACK_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_BLACK_CONCRETE_SLAB);
    public static final Block CUT_BLACK_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_BLACK_CONCRETE_WALL);
    public static final Block CUT_BROWN_CONCRETE = registerBlockItem (DecoBlocks.CUT_BROWN_CONCRETE);
    public static final Block CUT_BROWN_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_BROWN_CONCRETE_SLAB);
    public static final Block CUT_BROWN_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_BROWN_CONCRETE_STAIRS);
    public static final Block CUT_BROWN_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_BROWN_CONCRETE_WALL);
    public static final Block CUT_RED_CONCRETE = registerBlockItem (DecoBlocks.CUT_RED_CONCRETE);
    public static final Block CUT_RED_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_RED_CONCRETE_STAIRS);
    public static final Block CUT_RED_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_RED_CONCRETE_SLAB);
    public static final Block CUT_RED_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_RED_CONCRETE_WALL);
    public static final Block CUT_ORANGE_CONCRETE = registerBlockItem (DecoBlocks.CUT_ORANGE_CONCRETE);
    public static final Block CUT_ORANGE_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS);
    public static final Block CUT_ORANGE_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_ORANGE_CONCRETE_SLAB);
    public static final Block CUT_ORANGE_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_ORANGE_CONCRETE_WALL);
    public static final Block CUT_YELLOW_CONCRETE = registerBlockItem (DecoBlocks.CUT_YELLOW_CONCRETE);
    public static final Block CUT_YELLOW_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS);
    public static final Block CUT_YELLOW_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_YELLOW_CONCRETE_SLAB);
    public static final Block CUT_YELLOW_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_YELLOW_CONCRETE_WALL);
    public static final Block CUT_LIME_CONCRETE = registerBlockItem (DecoBlocks.CUT_LIME_CONCRETE);
    public static final Block CUT_LIME_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_LIME_CONCRETE_STAIRS);
    public static final Block CUT_LIME_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_LIME_CONCRETE_SLAB);
    public static final Block CUT_LIME_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_LIME_CONCRETE_WALL);
    public static final Block CUT_GREEN_CONCRETE = registerBlockItem (DecoBlocks.CUT_GREEN_CONCRETE);
    public static final Block CUT_GREEN_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_GREEN_CONCRETE_STAIRS);
    public static final Block CUT_GREEN_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_GREEN_CONCRETE_SLAB);
    public static final Block CUT_GREEN_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_GREEN_CONCRETE_WALL);
    public static final Block CUT_CYAN_CONCRETE = registerBlockItem (DecoBlocks.CUT_CYAN_CONCRETE);
    public static final Block CUT_CYAN_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_CYAN_CONCRETE_STAIRS);
    public static final Block CUT_CYAN_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_CYAN_CONCRETE_SLAB);
    public static final Block CUT_CYAN_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_CYAN_CONCRETE_WALL);
    public static final Block CUT_LIGHT_BLUE_CONCRETE = registerBlockItem (DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
    public static final Block CUT_LIGHT_BLUE_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS);
    public static final Block CUT_LIGHT_BLUE_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB);
    public static final Block CUT_LIGHT_BLUE_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL);
    public static final Block CUT_BLUE_CONCRETE = registerBlockItem (DecoBlocks.CUT_BLUE_CONCRETE);
    public static final Block CUT_BLUE_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_BLUE_CONCRETE_STAIRS);
    public static final Block CUT_BLUE_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_BLUE_CONCRETE_SLAB);
    public static final Block CUT_BLUE_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_BLUE_CONCRETE_WALL);
    public static final Block CUT_PURPLE_CONCRETE = registerBlockItem (DecoBlocks.CUT_PURPLE_CONCRETE);
    public static final Block CUT_PURPLE_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS);
    public static final Block CUT_PURPLE_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_PURPLE_CONCRETE_SLAB);
    public static final Block CUT_PURPLE_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_PURPLE_CONCRETE_WALL);
    public static final Block CUT_MAGENTA_CONCRETE = registerBlockItem (DecoBlocks.CUT_MAGENTA_CONCRETE);
    public static final Block CUT_MAGENTA_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS);
    public static final Block CUT_MAGENTA_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB);
    public static final Block CUT_MAGENTA_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_MAGENTA_CONCRETE_WALL);
    public static final Block CUT_PINK_CONCRETE = registerBlockItem (DecoBlocks.CUT_PINK_CONCRETE);
    public static final Block CUT_PINK_CONCRETE_STAIRS = registerBlockItem (DecoBlocks.CUT_PINK_CONCRETE_STAIRS);
    public static final Block CUT_PINK_CONCRETE_SLAB = registerBlockItem (DecoBlocks.CUT_PINK_CONCRETE_SLAB);
    public static final Block CUT_PINK_CONCRETE_WALL = registerBlockItem (DecoBlocks.CUT_PINK_CONCRETE_WALL);
    public static final Block WHITE_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.WHITE_CONCRETE_PILLAR);
    public static final Block LIGHT_GRAY_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.LIGHT_GRAY_CONCRETE_PILLAR);
    public static final Block GRAY_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.GRAY_CONCRETE_PILLAR);
    public static final Block BLACK_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.BLACK_CONCRETE_PILLAR);
    public static final Block BROWN_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.BROWN_CONCRETE_PILLAR);
    public static final Block RED_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.RED_CONCRETE_PILLAR);
    public static final Block ORANGE_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.ORANGE_CONCRETE_PILLAR);
    public static final Block YELLOW_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.YELLOW_CONCRETE_PILLAR);
    public static final Block LIME_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.LIME_CONCRETE_PILLAR);
    public static final Block GREEN_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.GREEN_CONCRETE_PILLAR);
    public static final Block CYAN_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.CYAN_CONCRETE_PILLAR);
    public static final Block LIGHT_BLUE_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.LIGHT_BLUE_CONCRETE_PILLAR);
    public static final Block BLUE_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.BLUE_CONCRETE_PILLAR);
    public static final Block PURPLE_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.PURPLE_CONCRETE_PILLAR);
    public static final Block MAGENTA_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.MAGENTA_CONCRETE_PILLAR);
    public static final Block PINK_CONCRETE_PILLAR = registerBlockItem (DecoBlocks.PINK_CONCRETE_PILLAR);
    public static final Block HARDENED_GLASS = registerBlockItem (DecoBlocks.HARDENED_GLASS);
    public static final Block HARDENED_TINTED_GLASS = registerBlockItem (DecoBlocks.HARDENED_TINTED_GLASS);
    public static final Block HARDENED_WHITE_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_WHITE_STAINED_GLASS);
    public static final Block HARDENED_LIGHT_GRAY_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS);
    public static final Block HARDENED_GRAY_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_GRAY_STAINED_GLASS);
    public static final Block HARDENED_BLACK_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_BLACK_STAINED_GLASS);
    public static final Block HARDENED_BROWN_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_BROWN_STAINED_GLASS);
    public static final Block HARDENED_RED_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_RED_STAINED_GLASS);
    public static final Block HARDENED_ORANGE_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_ORANGE_STAINED_GLASS);
    public static final Block HARDENED_YELLOW_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_YELLOW_STAINED_GLASS);
    public static final Block HARDENED_LIME_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_LIME_STAINED_GLASS);
    public static final Block HARDENED_GREEN_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_GREEN_STAINED_GLASS);
    public static final Block HARDENED_CYAN_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_CYAN_STAINED_GLASS);
    public static final Block HARDENED_LIGHT_BLUE_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS);
    public static final Block HARDENED_BLUE_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_BLUE_STAINED_GLASS);
    public static final Block HARDENED_PURPLE_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_PURPLE_STAINED_GLASS);
    public static final Block HARDENED_MAGENTA_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS);
    public static final Block HARDENED_PINK_STAINED_GLASS = registerBlockItem (DecoBlocks.HARDENED_PINK_STAINED_GLASS);
    public static final Block TINTED_GLASS_PANE = registerBlockItem (DecoBlocks.TINTED_GLASS_PANE);
    public static final Block HARDENED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_GLASS_PANE);
    public static final Block HARDENED_TINTED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_TINTED_GLASS_PANE);
    public static final Block HARDENED_WHITE_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE);
    public static final Block HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE);
    public static final Block HARDENED_GRAY_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE);
    public static final Block HARDENED_BLACK_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE);
    public static final Block HARDENED_BROWN_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE);
    public static final Block HARDENED_RED_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE);
    public static final Block HARDENED_ORANGE_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE);
    public static final Block HARDENED_YELLOW_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE);
    public static final Block HARDENED_LIME_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE);
    public static final Block HARDENED_GREEN_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE);
    public static final Block HARDENED_CYAN_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE);
    public static final Block HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE);
    public static final Block HARDENED_BLUE_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE);
    public static final Block HARDENED_PURPLE_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE);
    public static final Block HARDENED_MAGENTA_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE);
    public static final Block HARDENED_PINK_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE);
    public static final Block MOSAIC_WHITE_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_WHITE_STAINED_GLASS);
    public static final Block MOSAIC_LIGHT_GRAY_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS);
    public static final Block MOSAIC_GRAY_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_GRAY_STAINED_GLASS);
    public static final Block MOSAIC_BLACK_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_BLACK_STAINED_GLASS);
    public static final Block MOSAIC_BROWN_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_BROWN_STAINED_GLASS);
    public static final Block MOSAIC_RED_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_RED_STAINED_GLASS);
    public static final Block MOSAIC_ORANGE_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS);
    public static final Block MOSAIC_YELLOW_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS);
    public static final Block MOSAIC_LIME_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_LIME_STAINED_GLASS);
    public static final Block MOSAIC_GREEN_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_GREEN_STAINED_GLASS);
    public static final Block MOSAIC_CYAN_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_CYAN_STAINED_GLASS);
    public static final Block MOSAIC_LIGHT_BLUE_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS);
    public static final Block MOSAIC_BLUE_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_BLUE_STAINED_GLASS);
    public static final Block MOSAIC_PURPLE_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS);
    public static final Block MOSAIC_MAGENTA_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS);
    public static final Block MOSAIC_PINK_STAINED_GLASS = registerBlockItem (DecoBlocks.MOSAIC_PINK_STAINED_GLASS);
    public static final Block MOSAIC_WHITE_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_WHITE_STAINED_GLASS_PANE);
    public static final Block MOSAIC_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS_PANE);
    public static final Block MOSAIC_GRAY_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_GRAY_STAINED_GLASS_PANE);
    public static final Block MOSAIC_BLACK_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_BLACK_STAINED_GLASS_PANE);
    public static final Block MOSAIC_BROWN_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_BROWN_STAINED_GLASS_PANE);
    public static final Block MOSAIC_RED_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_RED_STAINED_GLASS_PANE);
    public static final Block MOSAIC_ORANGE_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS_PANE);
    public static final Block MOSAIC_YELLOW_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS_PANE);
    public static final Block MOSAIC_LIME_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_LIME_STAINED_GLASS_PANE);
    public static final Block MOSAIC_GREEN_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_GREEN_STAINED_GLASS_PANE);
    public static final Block MOSAIC_CYAN_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_CYAN_STAINED_GLASS_PANE);
    public static final Block MOSAIC_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS_PANE);
    public static final Block MOSAIC_BLUE_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_BLUE_STAINED_GLASS_PANE);
    public static final Block MOSAIC_PURPLE_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS_PANE);
    public static final Block MOSAIC_MAGENTA_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS_PANE);
    public static final Block MOSAIC_PINK_STAINED_GLASS_PANE = registerBlockItem (DecoBlocks.MOSAIC_PINK_STAINED_GLASS_PANE);
    public static final Block WHITE_BLOCK = registerBlockItem (DecoBlocks.WHITE_BLOCK);
    public static final Block LIGHT_GRAY_BLOCK = registerBlockItem (DecoBlocks.LIGHT_GRAY_BLOCK);
    public static final Block GRAY_BLOCK = registerBlockItem (DecoBlocks.GRAY_BLOCK);
    public static final Block BLACK_BLOCK = registerBlockItem (DecoBlocks.BLACK_BLOCK);
    public static final Block BROWN_BLOCK = registerBlockItem (DecoBlocks.BROWN_BLOCK);
    public static final Block RED_BLOCK = registerBlockItem (DecoBlocks.RED_BLOCK);
    public static final Block ORANGE_BLOCK = registerBlockItem (DecoBlocks.ORANGE_BLOCK);
    public static final Block YELLOW_BLOCK = registerBlockItem (DecoBlocks.YELLOW_BLOCK);
    public static final Block LIME_BLOCK = registerBlockItem (DecoBlocks.LIME_BLOCK);
    public static final Block GREEN_BLOCK = registerBlockItem (DecoBlocks.GREEN_BLOCK);
    public static final Block CYAN_BLOCK = registerBlockItem (DecoBlocks.CYAN_BLOCK);
    public static final Block LIGHT_BLUE_BLOCK = registerBlockItem (DecoBlocks.LIGHT_BLUE_BLOCK);
    public static final Block BLUE_BLOCK = registerBlockItem (DecoBlocks.BLUE_BLOCK);
    public static final Block PURPLE_BLOCK = registerBlockItem (DecoBlocks.PURPLE_BLOCK);
    public static final Block MAGENTA_BLOCK = registerBlockItem (DecoBlocks.MAGENTA_BLOCK);
    public static final Block PINK_BLOCK = registerBlockItem (DecoBlocks.PINK_BLOCK);
    public static final Block WOODEN_LEAVES = registerBlockItem (DecoBlocks.WOODEN_LEAVES);
    public static final Block WOODEN_SAPLING = registerBlockItem (DecoBlocks.WOODEN_SAPLING);
    public static final Block PUFFY_DANDELION = registerBlockItem (DecoBlocks.PUFFY_DANDELION);
    public static final Block CALIFORNIA_POPPY = registerBlockItem (DecoBlocks.CALIFORNIA_POPPY);
    public static final Block SALMON_POPPY = registerBlockItem (DecoBlocks.SALMON_POPPY);
    public static final Block YELLOW_ORCHID = registerBlockItem (DecoBlocks.YELLOW_ORCHID);
    public static final Block WHITE_ORCHID = registerBlockItem (DecoBlocks.WHITE_ORCHID);
    public static final Block PINK_ORCHID = registerBlockItem (DecoBlocks.PINK_ORCHID);
    public static final Block YELLOW_TULIP = registerBlockItem (DecoBlocks.YELLOW_TULIP);
    public static final Block PURPLE_TULIP = registerBlockItem (DecoBlocks.PURPLE_TULIP);
    public static final Block MAGENTA_TULIP = registerBlockItem (DecoBlocks.MAGENTA_TULIP);
    public static final Block BLUE_TULIP = registerBlockItem (DecoBlocks.BLUE_TULIP);
    public static final Block BLACK_TULIP = registerBlockItem (DecoBlocks.BLACK_TULIP);
    public static final Block GREEN_TULIP = registerBlockItem (DecoBlocks.GREEN_TULIP);
    public static final Block CYAN_TULIP = registerBlockItem (DecoBlocks.CYAN_TULIP);
    public static final Block BARBERTON_DAISY = registerBlockItem (DecoBlocks.BARBERTON_DAISY);
    public static final Block BLUE_EYED_DAISY = registerBlockItem (DecoBlocks.BLUE_EYED_DAISY);
    public static final Block GERBERA_DAISY = registerBlockItem (DecoBlocks.GERBERA_DAISY);
    public static final Block MICHAELMAS_DAISY = registerBlockItem (DecoBlocks.MICHAELMAS_DAISY);
    public static final Block PAEONIA = registerBlockItem (DecoBlocks.PAEONIA);
    public static final Block LAVENDER = registerBlockItem (DecoBlocks.LAVENDER);
    public static final Block ROSE = registerBlockItem (DecoBlocks.ROSE);
    public static final Block ENDER_ROSE = registerBlockItem (DecoBlocks.ENDER_ROSE);
    public static final Block ANCIENT_ROSE = registerBlockItem (DecoBlocks.ANCIENT_ROSE);
    public static final Block RED_SUNFLOWER = registerBlockItem (DecoBlocks.RED_SUNFLOWER);
    public static final Block NOVA_STARFLOWER = registerBlockItem (DecoBlocks.NOVA_STARFLOWER);
    public static final Block WITHER_ROSE_BUSH = registerBlockItem (DecoBlocks.WITHER_ROSE_BUSH);
    public static final Block ENDER_ROSE_BUSH = registerBlockItem (DecoBlocks.ENDER_ROSE_BUSH);
    public static final Block MIGHTY_LAVENDER = registerBlockItem (DecoBlocks.MIGHTY_LAVENDER);
    public static final Block COPPER_LANTERN = registerBlockItem (DecoBlocks.COPPER_LANTERN);
    public static final Block WAXED_COPPER_LANTERN = registerBlockItem (DecoBlocks.WAXED_COPPER_LANTERN);
    public static final Block EXPOSED_COPPER_LANTERN = registerBlockItem (DecoBlocks.EXPOSED_COPPER_LANTERN);
    public static final Block WAXED_EXPOSED_COPPER_LANTERN = registerBlockItem (DecoBlocks.WAXED_EXPOSED_COPPER_LANTERN);
    public static final Block WEATHERED_COPPER_LANTERN = registerBlockItem (DecoBlocks.WEATHERED_COPPER_LANTERN);
    public static final Block WAXED_WEATHERED_COPPER_LANTERN = registerBlockItem (DecoBlocks.WAXED_WEATHERED_COPPER_LANTERN);
    public static final Block OXIDIZED_COPPER_LANTERN = registerBlockItem (DecoBlocks.OXIDIZED_COPPER_LANTERN);
    public static final Block WAXED_OXIDIZED_COPPER_LANTERN = registerBlockItem (DecoBlocks.WAXED_OXIDIZED_COPPER_LANTERN);
    public static final Block COPPER_SOUL_LANTERN = registerBlockItem (DecoBlocks.COPPER_SOUL_LANTERN);
    public static final Block WAXED_COPPER_SOUL_LANTERN = registerBlockItem (DecoBlocks.WAXED_COPPER_SOUL_LANTERN);
    public static final Block EXPOSED_COPPER_SOUL_LANTERN = registerBlockItem (DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN);
    public static final Block WAXED_EXPOSED_COPPER_SOUL_LANTERN = registerBlockItem (DecoBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN);
    public static final Block WEATHERED_COPPER_SOUL_LANTERN = registerBlockItem (DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN);
    public static final Block WAXED_WEATHERED_COPPER_SOUL_LANTERN = registerBlockItem (DecoBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN);
    public static final Block OXIDIZED_COPPER_SOUL_LANTERN = registerBlockItem (DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN);
    public static final Block WAXED_OXIDIZED_COPPER_SOUL_LANTERN = registerBlockItem (DecoBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN);
    public static final Block SPRUCE_CRAFTING_TABLE = registerBlockItem (DecoBlocks.SPRUCE_CRAFTING_TABLE);
    public static final Block BIRCH_CRAFTING_TABLE = registerBlockItem (DecoBlocks.BIRCH_CRAFTING_TABLE);
    public static final Block JUNGLE_CRAFTING_TABLE = registerBlockItem (DecoBlocks.JUNGLE_CRAFTING_TABLE);
    public static final Block ACACIA_CRAFTING_TABLE = registerBlockItem (DecoBlocks.ACACIA_CRAFTING_TABLE);
    public static final Block DARK_OAK_CRAFTING_TABLE = registerBlockItem (DecoBlocks.DARK_OAK_CRAFTING_TABLE);
    public static final Block MANGROVE_CRAFTING_TABLE = registerBlockItem (DecoBlocks.MANGROVE_CRAFTING_TABLE);
    public static final Block CHERRY_CRAFTING_TABLE = registerBlockItem (DecoBlocks.CHERRY_CRAFTING_TABLE);
    public static final Block PALE_OAK_CRAFTING_TABLE = registerBlockItem (DecoBlocks.PALE_OAK_CRAFTING_TABLE);
    public static final Block BAMBOO_CRAFTING_TABLE = registerBlockItem (DecoBlocks.BAMBOO_CRAFTING_TABLE);
    public static final Block CRIMSON_CRAFTING_TABLE = registerBlockItem (DecoBlocks.CRIMSON_CRAFTING_TABLE);
    public static final Block WARPED_CRAFTING_TABLE = registerBlockItem (DecoBlocks.WARPED_CRAFTING_TABLE);
    public static final Block CACTUS_CRAFTING_TABLE = registerBlockItem (DecoBlocks.CACTUS_CRAFTING_TABLE);
    public static final Block WOODEN_CRAFTING_TABLE = registerBlockItem (DecoBlocks.WOODEN_CRAFTING_TABLE);
    public static final Block DEEPSLATE_STONECUTTER = registerBlockItem (DecoBlocks.DEEPSLATE_STONECUTTER);
    public static final Block TUFF_STONECUTTER = registerBlockItem (DecoBlocks.TUFF_STONECUTTER);
    public static final Block BLACKSTONE_STONECUTTER = registerBlockItem (DecoBlocks.BLACKSTONE_STONECUTTER);
    public static final Block OAK_CARTOGRAPHY_TABLE = registerBlockItem (DecoBlocks.OAK_CARTOGRAPHY_TABLE);
    public static final Block SPRUCE_CARTOGRAPHY_TABLE = registerBlockItem (DecoBlocks.SPRUCE_CARTOGRAPHY_TABLE);
    public static final Block BIRCH_CARTOGRAPHY_TABLE = registerBlockItem (DecoBlocks.BIRCH_CARTOGRAPHY_TABLE);
    public static final Block JUNGLE_CARTOGRAPHY_TABLE = registerBlockItem (DecoBlocks.JUNGLE_CARTOGRAPHY_TABLE);
    public static final Block ACACIA_CARTOGRAPHY_TABLE = registerBlockItem (DecoBlocks.ACACIA_CARTOGRAPHY_TABLE);
    public static final Block DARK_OAK_CARTOGRAPHY_TABLE = registerBlockItem (DecoBlocks.DARK_OAK_CARTOGRAPHY_TABLE);
    public static final Block MANGROVE_CARTOGRAPHY_TABLE = registerBlockItem (DecoBlocks.MANGROVE_CARTOGRAPHY_TABLE);
    public static final Block CHERRY_CARTOGRAPHY_TABLE = registerBlockItem (DecoBlocks.CHERRY_CARTOGRAPHY_TABLE);
    public static final Block BAMBOO_CARTOGRAPHY_TABLE = registerBlockItem (DecoBlocks.BAMBOO_CARTOGRAPHY_TABLE);
    public static final Block PALE_OAK_CARTOGRAPHY_TABLE = registerBlockItem (DecoBlocks.PALE_OAK_CARTOGRAPHY_TABLE);
    public static final Block CRIMSON_CARTOGRAPHY_TABLE = registerBlockItem (DecoBlocks.CRIMSON_CARTOGRAPHY_TABLE);
    public static final Block WARPED_CARTOGRAPHY_TABLE = registerBlockItem (DecoBlocks.WARPED_CARTOGRAPHY_TABLE);
    public static final Block CACTUS_CARTOGRAPHY_TABLE = registerBlockItem (DecoBlocks.CACTUS_CARTOGRAPHY_TABLE);
    public static final Block OAK_SMITHING_TABLE = registerBlockItem (DecoBlocks.OAK_SMITHING_TABLE);
    public static final Block SPRUCE_SMITHING_TABLE = registerBlockItem (DecoBlocks.SPRUCE_SMITHING_TABLE);
    public static final Block BIRCH_SMITHING_TABLE = registerBlockItem (DecoBlocks.BIRCH_SMITHING_TABLE);
    public static final Block JUNGLE_SMITHING_TABLE = registerBlockItem (DecoBlocks.JUNGLE_SMITHING_TABLE);
    public static final Block ACACIA_SMITHING_TABLE = registerBlockItem (DecoBlocks.ACACIA_SMITHING_TABLE);
    public static final Block DARK_OAK_SMITHING_TABLE = registerBlockItem (DecoBlocks.DARK_OAK_SMITHING_TABLE);
    public static final Block MANGROVE_SMITHING_TABLE = registerBlockItem (DecoBlocks.MANGROVE_SMITHING_TABLE);
    public static final Block CHERRY_SMITHING_TABLE = registerBlockItem (DecoBlocks.CHERRY_SMITHING_TABLE);
    public static final Block PALE_OAK_SMITHING_TABLE = registerBlockItem (DecoBlocks.PALE_OAK_SMITHING_TABLE);
    public static final Block BAMBOO_SMITHING_TABLE = registerBlockItem (DecoBlocks.BAMBOO_SMITHING_TABLE);
    public static final Block CRIMSON_SMITHING_TABLE = registerBlockItem (DecoBlocks.CRIMSON_SMITHING_TABLE);
    public static final Block WARPED_SMITHING_TABLE = registerBlockItem (DecoBlocks.WARPED_SMITHING_TABLE);
    public static final Block CACTUS_SMITHING_TABLE = registerBlockItem (DecoBlocks.CACTUS_SMITHING_TABLE);
    public static final Block DEEPSLATE_FURNACE = registerBlockItem (DecoBlocks.DEEPSLATE_FURNACE);
    public static final Block TUFF_FURNACE = registerBlockItem (DecoBlocks.TUFF_FURNACE);
    public static final Block BLACKSTONE_FURNACE = registerBlockItem (DecoBlocks.BLACKSTONE_FURNACE);
    public static final Block DEEPSLATE_SMOKER = registerBlockItem (DecoBlocks.DEEPSLATE_SMOKER);
    public static final Block TUFF_SMOKER = registerBlockItem (DecoBlocks.TUFF_SMOKER);
    public static final Block BLACKSTONE_SMOKER = registerBlockItem (DecoBlocks.BLACKSTONE_SMOKER);
    public static final Block DEEPSLATE_BLAST_FURNACE = registerBlockItem (DecoBlocks.DEEPSLATE_BLAST_FURNACE);
    public static final Block TUFF_BLAST_FURNACE = registerBlockItem (DecoBlocks.TUFF_BLAST_FURNACE);
    public static final Block BLACKSTONE_BLAST_FURNACE = registerBlockItem (DecoBlocks.BLACKSTONE_BLAST_FURNACE);
    public static final Block SPRUCE_LADDER = registerBlockItem (DecoBlocks.SPRUCE_LADDER);
    public static final Block BIRCH_LADDER = registerBlockItem (DecoBlocks.BIRCH_LADDER);
    public static final Block JUNGLE_LADDER = registerBlockItem (DecoBlocks.JUNGLE_LADDER);
    public static final Block ACACIA_LADDER = registerBlockItem (DecoBlocks.ACACIA_LADDER);
    public static final Block DARK_OAK_LADDER = registerBlockItem (DecoBlocks.DARK_OAK_LADDER);
    public static final Block MANGROVE_LADDER = registerBlockItem (DecoBlocks.MANGROVE_LADDER);
    public static final Block CHERRY_LADDER = registerBlockItem (DecoBlocks.CHERRY_LADDER);
    public static final Block PALE_OAK_LADDER = registerBlockItem (DecoBlocks.PALE_OAK_LADDER);
    public static final Block BAMBOO_LADDER = registerBlockItem (DecoBlocks.BAMBOO_LADDER);
    public static final Block CRIMSON_LADDER = registerBlockItem (DecoBlocks.CRIMSON_LADDER);
    public static final Block WARPED_LADDER = registerBlockItem (DecoBlocks.WARPED_LADDER);
    public static final Block CACTUS_LADDER = registerBlockItem (DecoBlocks.CACTUS_LADDER);
    public static final Block WOODEN_LADDER = registerBlockItem (DecoBlocks.WOODEN_LADDER);
    public static final Block SPRUCE_BOOKSHELF = registerBlockItem (DecoBlocks.SPRUCE_BOOKSHELF);
    public static final Block BIRCH_BOOKSHELF = registerBlockItem (DecoBlocks.BIRCH_BOOKSHELF);
    public static final Block JUNGLE_BOOKSHELF = registerBlockItem (DecoBlocks.JUNGLE_BOOKSHELF);
    public static final Block ACACIA_BOOKSHELF = registerBlockItem (DecoBlocks.ACACIA_BOOKSHELF);
    public static final Block DARK_OAK_BOOKSHELF = registerBlockItem (DecoBlocks.DARK_OAK_BOOKSHELF);
    public static final Block MANGROVE_BOOKSHELF = registerBlockItem (DecoBlocks.MANGROVE_BOOKSHELF);
    public static final Block CHERRY_BOOKSHELF = registerBlockItem (DecoBlocks.CHERRY_BOOKSHELF);
    public static final Block PALE_OAK_BOOKSHELF = registerBlockItem (DecoBlocks.PALE_OAK_BOOKSHELF);
    public static final Block BAMBOO_BOOKSHELF = registerBlockItem (DecoBlocks.BAMBOO_BOOKSHELF);
    public static final Block CRIMSON_BOOKSHELF = registerBlockItem (DecoBlocks.CRIMSON_BOOKSHELF);
    public static final Block WARPED_BOOKSHELF = registerBlockItem (DecoBlocks.WARPED_BOOKSHELF);
    public static final Block CACTUS_BOOKSHELF = registerBlockItem (DecoBlocks.CACTUS_BOOKSHELF);
    public static final Block WOODEN_BOOKSHELF = registerBlockItem (DecoBlocks.WOODEN_BOOKSHELF);
    public static final Block OAK_BARREL = registerBlockItem (DecoBlocks.OAK_BARREL);
    public static final Block SPRUCE_BARREL = registerBlockItem (DecoBlocks.SPRUCE_BARREL);
    public static final Block BIRCH_BARREL = registerBlockItem (DecoBlocks.BIRCH_BARREL);
    public static final Block JUNGLE_BARREL = registerBlockItem (DecoBlocks.JUNGLE_BARREL);
    public static final Block ACACIA_BARREL = registerBlockItem (DecoBlocks.ACACIA_BARREL);
    public static final Block DARK_OAK_BARREL = registerBlockItem (DecoBlocks.DARK_OAK_BARREL);
    public static final Block MANGROVE_BARREL = registerBlockItem (DecoBlocks.MANGROVE_BARREL);
    public static final Block CHERRY_BARREL = registerBlockItem (DecoBlocks.CHERRY_BARREL);
    public static final Block PALE_OAK_BARREL = registerBlockItem (DecoBlocks.PALE_OAK_BARREL);
    public static final Block BAMBOO_BARREL = registerBlockItem (DecoBlocks.BAMBOO_BARREL);
    public static final Block CRIMSON_BARREL = registerBlockItem (DecoBlocks.CRIMSON_BARREL);
    public static final Block WARPED_BARREL = registerBlockItem (DecoBlocks.WARPED_BARREL);
    public static final Block CACTUS_BARREL = registerBlockItem (DecoBlocks.CACTUS_BARREL);
                        
    //I had some inspiration The Mentor CodeLab

    public static RegistryKey<Item> getItemKey(String name){
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(name));
    }
    public static <T extends Item> T registerItem(String name, int stackCount, Function<Item.Settings, T> factory){
        T item = factory.apply(new Item.Settings().registryKey(getItemKey(name)).maxCount(stackCount));
        return Registry.register(Registries.ITEM, getItemKey(name), item);
    }
    public static <T extends Item> T registerCooldownItem(String name, int stackCount, int cooldownUse,
                                                  Function<Item.Settings, T> factory){
        T item = factory.apply(new Item.Settings().registryKey(getItemKey(name)).maxCount(stackCount).useCooldown(cooldownUse));
        return Registry.register(Registries.ITEM, getItemKey(name), item);
    }
    public static <T extends Item> T registerSignItem(String name, Block standingBlock, Block wallBlock, 
                                                      SignRegisterFunction<Item.Settings, T> factory){
        T item = factory.apply(standingBlock, wallBlock, new Item.Settings().maxCount(16).registryKey(getItemKey(name)));
        return Registry.register(Registries.ITEM,getItemKey(name),item);
    }
    public static <T extends Item> T registerHangingSignItem(String name, Block hangingSign, Block wallHangingSign, 
                                                             HangingSignRegisterFunction<Item.Settings, T> factory){
        T item = factory.apply(hangingSign, wallHangingSign, new Item.Settings().maxCount(16).registryKey(getItemKey(name)));
        return Registry.register(Registries.ITEM,getItemKey(name),item);
    }

    public static Block registerBlockItem(Block block){
        String name = Registries.BLOCK.getId(block).getPath();
        return Block.getBlockFromItem(Registry.register(Registries.ITEM, getItemKey(name),
                new BlockItem(block, new Item.Settings().useBlockPrefixedTranslationKey().registryKey(getItemKey(name)))));
    }

    private static Function<Item.Settings, Item> createBlockItemWithUniqueName(Block block) {
        return settings -> new BlockItem(block, settings.useItemPrefixedTranslationKey());
    }
    public static void registerDecoItems() {
        VaranDeco.LOGGER.debug("Registering Items for" + VaranDeco.MOD_ID);
    }
}
