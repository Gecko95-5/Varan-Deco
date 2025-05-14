package net.gecko.varandeco.item;

import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.entity.DecoBoats;
import net.gecko.varandeco.item.projectile.SnowBrickItem;
import net.gecko.varandeco.util.interfaces.HangingSignRegisterFunction;
import net.gecko.varandeco.util.interfaces.SignRegisterFunction;
import net.minecraft.block.Block;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.BiFunction;
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

    public static final Item SNOW_BRICK = registerCooldownItem("snow_brick",16,15,
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
    public static final Item CACTUS_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CACTUS_CHEST_BOAT_ID,
            true, false);

    public static final Item WOODEN_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WOODEN_BOAT_ID,
            false, false);
    public static final Item WOODEN_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WOODEN_CHEST_BOAT_ID,
            true, false);

    public static final Item CRIMSON_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CRIMSON_BOAT_ID,
            false, false);
    public static final Item CRIMSON_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.CRIMSON_CHEST_BOAT_ID,
            true, false);

    public static final Item WARPED_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WARPED_BOAT_ID,
            false,false);
    public static final Item WARPED_CHEST_BOAT = TerraformBoatItemHelper.registerBoatItem(DecoBoats.WARPED_CHEST_BOAT_ID,
            true, false);

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

    private static Function<Item.Settings, Item> createBlockItemWithUniqueName(Block block) {
        return settings -> new BlockItem(block, settings.useItemPrefixedTranslationKey());
    }
    public static void registerDecoItems() {
        VaranDeco.LOGGER.debug("Registering Items for" + VaranDeco.MOD_ID);
    }
}
