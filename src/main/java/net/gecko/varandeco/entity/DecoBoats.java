package net.gecko.varandeco.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class DecoBoats {
    public static final Identifier CACTUS_BOAT_ID = new Identifier(VaranDeco.MOD_ID,"cactus_boat");
    public static final Identifier CACTUS_CHEST_BOAT_ID = new Identifier(VaranDeco.MOD_ID,"cactus_chest_boat");
    public static final Identifier WOODEN_BOAT_ID = new Identifier(VaranDeco.MOD_ID,"wooden_boat");
    public static final Identifier WOODEN_CHEST_BOAT_ID = new Identifier(VaranDeco.MOD_ID,"wooden_chest_boat");
    public static final Identifier CRIMSON_BOAT_ID = new Identifier(VaranDeco.MOD_ID,"crimson_boat");
    public static final Identifier CRIMSON_CHEST_BOAT_ID = new Identifier(VaranDeco.MOD_ID,"crimson_chest_boat");
    public static final Identifier WARPED_BOAT_ID = new Identifier(VaranDeco.MOD_ID,"warped_boat");
    public static final Identifier WARPED_CHEST_BOAT_ID = new Identifier(VaranDeco.MOD_ID,"warped_chest_boat");

    public static final RegistryKey<TerraformBoatType> CACTUS_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CACTUS_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> WOODEN_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WOODEN_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CRIMSON_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WARPED_BOAT_ID);

    public static void registerBoats(){
        TerraformBoatType cactusBoat = new TerraformBoatType.Builder()
                .item(DecoItems.CACTUS_BOAT)
                .chestItem(DecoItems.CACTUS_CHEST_BOAT)
                .planks(DecoBlocks.CACTUS_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CACTUS_BOAT_KEY, cactusBoat);
        TerraformBoatType woodenBoat = new TerraformBoatType.Builder()
                .item(DecoItems.WOODEN_BOAT)
                .chestItem(DecoItems.WOODEN_CHEST_BOAT)
                .planks(DecoBlocks.WOODEN_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, WOODEN_BOAT_KEY, woodenBoat);
        TerraformBoatType crimsonBoat = new TerraformBoatType.Builder()
                .item(DecoItems.CRIMSON_BOAT)
                .chestItem(DecoItems.CRIMSON_CHEST_BOAT)
                .planks(Blocks.CRIMSON_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CRIMSON_BOAT_KEY, crimsonBoat);
        TerraformBoatType warpedBoat = new TerraformBoatType.Builder()
                .item(DecoItems.WARPED_BOAT)
                .chestItem(DecoItems.WARPED_CHEST_BOAT)
                .planks(Blocks.WARPED_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, WARPED_BOAT_KEY, warpedBoat);
    }
}
