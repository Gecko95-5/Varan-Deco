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
