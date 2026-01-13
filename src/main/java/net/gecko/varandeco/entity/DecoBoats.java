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
    public static final Identifier CACTUS_BOAT_ID = Identifier.of(VaranDeco.MOD_ID,"cactus_boat");
    public static final Identifier CACTUS_CHEST_BOAT_ID = Identifier.of(VaranDeco.MOD_ID,"cactus_chest_boat");
    public static final Identifier MUSHROOM_BOAT_ID = Identifier.of(VaranDeco.MOD_ID,"mushroom_boat");
    public static final Identifier MUSHROOM_CHEST_BOAT_ID = Identifier.of(VaranDeco.MOD_ID,"mushroom_chest_boat");
    public static final Identifier WOODEN_BOAT_ID = Identifier.of(VaranDeco.MOD_ID,"wooden_boat");
    public static final Identifier WOODEN_CHEST_BOAT_ID = Identifier.of(VaranDeco.MOD_ID,"wooden_chest_boat");
    public static final Identifier CRIMSON_BOAT_ID = Identifier.of(VaranDeco.MOD_ID,"crimson_boat");
    public static final Identifier CRIMSON_CHEST_BOAT_ID = Identifier.of(VaranDeco.MOD_ID,"crimson_chest_boat");
    public static final Identifier WARPED_BOAT_ID = Identifier.of(VaranDeco.MOD_ID,"warped_boat");
    public static final Identifier WARPED_CHEST_BOAT_ID = Identifier.of(VaranDeco.MOD_ID,"warped_chest_boat");
    public static final Identifier BAMBOO_BOAT_ID = Identifier.of(VaranDeco.MOD_ID,"bamboo_boat");
    public static final Identifier BAMBOO_CHEST_BOAT_ID = Identifier.of(VaranDeco.MOD_ID,"bamboo_chest_boat");
    public static final Identifier IRON_CAP_BOAT_ID = Identifier.of(VaranDeco.MOD_ID,"iron_cap_boat");
    public static final Identifier IRON_CAP_CHEST_BOAT_ID = Identifier.of(VaranDeco.MOD_ID,"iron_cap_chest_boat");

    public static final Identifier OAK_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"oak_raft");
    public static final Identifier OAK_CHEST_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"oak_chest_raft");
    public static final Identifier SPRUCE_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"spruce_raft");
    public static final Identifier SPRUCE_CHEST_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"spruce_chest_raft");
    public static final Identifier BIRCH_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"birch_raft");
    public static final Identifier BIRCH_CHEST_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"birch_chest_raft");
    public static final Identifier JUNGLE_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"jungle_raft");
    public static final Identifier JUNGLE_CHEST_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"jungle_chest_raft");
    public static final Identifier ACACIA_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"acacia_raft");
    public static final Identifier ACACIA_CHEST_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"acacia_chest_raft");
    public static final Identifier DARK_OAK_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"dark_oak_raft");
    public static final Identifier DARK_OAK_CHEST_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"dark_oak_chest_raft");
    public static final Identifier MANGROVE_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"mangrove_raft");
    public static final Identifier MANGROVE_CHEST_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"mangrove_chest_raft");
    public static final Identifier CHERRY_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"cherry_raft");
    public static final Identifier CHERRY_CHEST_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"cherry_chest_raft");
    public static final Identifier CRIMSON_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"crimson_raft");
    public static final Identifier CRIMSON_CHEST_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"crimson_chest_raft");
    public static final Identifier WARPED_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"warped_raft");
    public static final Identifier WARPED_CHEST_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"warped_chest_raft");
    public static final Identifier CACTUS_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"cactus_raft");
    public static final Identifier CACTUS_CHEST_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"cactus_chest_raft");
    public static final Identifier MUSHROOM_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"mushroom_raft");
    public static final Identifier MUSHROOM_CHEST_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"mushroom_chest_raft");
    public static final Identifier WOODEN_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"wooden_raft");
    public static final Identifier WOODEN_CHEST_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"wooden_chest_raft");
    public static final Identifier IRON_CAP_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"iron_cap_raft");
    public static final Identifier IRON_CAP_CHEST_RAFT_ID = Identifier.of(VaranDeco.MOD_ID,"iron_cap_chest_raft");

    public static final RegistryKey<TerraformBoatType> CACTUS_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CACTUS_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> MUSHROOM_BOAT_KEY = TerraformBoatTypeRegistry.createKey(MUSHROOM_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> WOODEN_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WOODEN_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> CRIMSON_BOAT_KEY = TerraformBoatTypeRegistry.createKey(CRIMSON_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> WARPED_BOAT_KEY = TerraformBoatTypeRegistry.createKey(WARPED_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> BAMBOO_BOAT_KEY = TerraformBoatTypeRegistry.createKey(BAMBOO_BOAT_ID);
    public static final RegistryKey<TerraformBoatType> IRON_CAP_BOAT_KEY = TerraformBoatTypeRegistry.createKey(IRON_CAP_BOAT_ID);

    public static final RegistryKey<TerraformBoatType> OAK_RAFT_KEY = TerraformBoatTypeRegistry.createKey(OAK_RAFT_ID);
    public static final RegistryKey<TerraformBoatType> SPRUCE_RAFT_KEY = TerraformBoatTypeRegistry.createKey(SPRUCE_RAFT_ID);
    public static final RegistryKey<TerraformBoatType> BIRCH_RAFT_KEY = TerraformBoatTypeRegistry.createKey(BIRCH_RAFT_ID);
    public static final RegistryKey<TerraformBoatType> JUNGLE_RAFT_KEY = TerraformBoatTypeRegistry.createKey(JUNGLE_RAFT_ID);
    public static final RegistryKey<TerraformBoatType> ACACIA_RAFT_KEY = TerraformBoatTypeRegistry.createKey(ACACIA_RAFT_ID);
    public static final RegistryKey<TerraformBoatType> DARK_OAK_RAFT_KEY = TerraformBoatTypeRegistry.createKey(DARK_OAK_RAFT_ID);
    public static final RegistryKey<TerraformBoatType> MANGROVE_RAFT_KEY = TerraformBoatTypeRegistry.createKey(MANGROVE_RAFT_ID);
    public static final RegistryKey<TerraformBoatType> CHERRY_RAFT_KEY = TerraformBoatTypeRegistry.createKey(CHERRY_RAFT_ID);
    public static final RegistryKey<TerraformBoatType> CRIMSON_RAFT_KEY = TerraformBoatTypeRegistry.createKey(CRIMSON_RAFT_ID);
    public static final RegistryKey<TerraformBoatType> WARPED_RAFT_KEY = TerraformBoatTypeRegistry.createKey(WARPED_RAFT_ID);
    public static final RegistryKey<TerraformBoatType> CACTUS_RAFT_KEY = TerraformBoatTypeRegistry.createKey(CACTUS_RAFT_ID);
    public static final RegistryKey<TerraformBoatType> MUSHROOM_RAFT_KEY = TerraformBoatTypeRegistry.createKey(MUSHROOM_RAFT_ID);
    public static final RegistryKey<TerraformBoatType> WOODEN_RAFT_KEY = TerraformBoatTypeRegistry.createKey(WOODEN_RAFT_ID);
    public static final RegistryKey<TerraformBoatType> IRON_CAP_RAFT_KEY = TerraformBoatTypeRegistry.createKey(IRON_CAP_RAFT_ID);

    public static void registerBoats(){
        TerraformBoatType cactusBoat = new TerraformBoatType.Builder()
                .item(DecoItems.CACTUS_BOAT)
                .chestItem(DecoItems.CACTUS_CHEST_BOAT)
                .planks(DecoBlocks.CACTUS_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CACTUS_BOAT_KEY, cactusBoat);
        TerraformBoatType mushroomBoat = new TerraformBoatType.Builder()
                .item(DecoItems.MUSHROOM_BOAT)
                .chestItem(DecoItems.MUSHROOM_CHEST_BOAT)
                .planks(DecoBlocks.MUSHROOM_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MUSHROOM_BOAT_KEY, mushroomBoat);
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

        TerraformBoatType bambooBoat = new TerraformBoatType.Builder()
                .item(DecoItems.BAMBOO_BOAT)
                .chestItem(DecoItems.BAMBOO_CHEST_BOAT)
                .planks(Blocks.BAMBOO_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, BAMBOO_BOAT_KEY, bambooBoat);

        TerraformBoatType oakRaft = new TerraformBoatType.Builder()
                .raft()
                .item(DecoItems.OAK_RAFT)
                .chestItem(DecoItems.OAK_CHEST_RAFT)
                .planks(Blocks.OAK_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, OAK_RAFT_KEY, oakRaft);

        TerraformBoatType spruceRaft = new TerraformBoatType.Builder()
                .raft()
                .item(DecoItems.SPRUCE_RAFT)
                .chestItem(DecoItems.SPRUCE_CHEST_RAFT)
                .planks(Blocks.SPRUCE_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, SPRUCE_RAFT_KEY, spruceRaft);

        TerraformBoatType birchRaft = new TerraformBoatType.Builder()
                .raft()
                .item(DecoItems.BIRCH_RAFT)
                .chestItem(DecoItems.BIRCH_CHEST_RAFT)
                .planks(Blocks.BIRCH_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, BIRCH_RAFT_KEY, birchRaft);

        TerraformBoatType jungleRaft = new TerraformBoatType.Builder()
                .raft()
                .item(DecoItems.JUNGLE_RAFT)
                .chestItem(DecoItems.JUNGLE_CHEST_RAFT)
                .planks(Blocks.JUNGLE_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, JUNGLE_RAFT_KEY, jungleRaft);

        TerraformBoatType acaciaRaft = new TerraformBoatType.Builder()
                .raft()
                .item(DecoItems.ACACIA_RAFT)
                .chestItem(DecoItems.ACACIA_CHEST_RAFT)
                .planks(Blocks.ACACIA_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, ACACIA_RAFT_KEY, acaciaRaft);

        TerraformBoatType darkOakRaft = new TerraformBoatType.Builder()
                .raft()
                .item(DecoItems.DARK_OAK_RAFT)
                .chestItem(DecoItems.DARK_OAK_CHEST_RAFT)
                .planks(Blocks.DARK_OAK_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, DARK_OAK_RAFT_KEY, darkOakRaft);

        TerraformBoatType mangroveRaft = new TerraformBoatType.Builder()
                .raft()
                .item(DecoItems.MANGROVE_RAFT)
                .chestItem(DecoItems.MANGROVE_CHEST_RAFT)
                .planks(Blocks.MANGROVE_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MANGROVE_RAFT_KEY, mangroveRaft);

        TerraformBoatType cherryRaft = new TerraformBoatType.Builder()
                .raft()
                .item(DecoItems.CHERRY_RAFT)
                .chestItem(DecoItems.CHERRY_CHEST_RAFT)
                .planks(Blocks.CHERRY_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CHERRY_RAFT_KEY, cherryRaft);

        TerraformBoatType crimsonRaft = new TerraformBoatType.Builder()
                .raft()
                .item(DecoItems.CRIMSON_RAFT)
                .chestItem(DecoItems.CRIMSON_CHEST_RAFT)
                .planks(Blocks.CRIMSON_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CRIMSON_RAFT_KEY, crimsonRaft);

        TerraformBoatType warpedRaft = new TerraformBoatType.Builder()
                .raft()
                .item(DecoItems.WARPED_RAFT)
                .chestItem(DecoItems.WARPED_CHEST_RAFT)
                .planks(Blocks.WARPED_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, WARPED_RAFT_KEY, warpedRaft);

        TerraformBoatType cactusRaft = new TerraformBoatType.Builder()
                .raft()
                .item(DecoItems.CACTUS_RAFT)
                .chestItem(DecoItems.CACTUS_CHEST_RAFT)
                .planks(DecoBlocks.CACTUS_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, CACTUS_RAFT_KEY, cactusRaft);

        TerraformBoatType woodenRaft = new TerraformBoatType.Builder()
                .raft()
                .item(DecoItems.WOODEN_RAFT)
                .chestItem(DecoItems.WOODEN_CHEST_RAFT)
                .planks(DecoBlocks.WOODEN_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, WOODEN_RAFT_KEY, woodenRaft);

        TerraformBoatType mushroomRaft = new TerraformBoatType.Builder()
                .raft()
                .item(DecoItems.MUSHROOM_RAFT)
                .chestItem(DecoItems.MUSHROOM_CHEST_RAFT)
                .planks(DecoBlocks.MUSHROOM_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, MUSHROOM_RAFT_KEY, mushroomRaft);

        TerraformBoatType ironCapBoat = new TerraformBoatType.Builder()
                .item(DecoItems.IRON_CAP_BOAT)
                .chestItem(DecoItems.IRON_CAP_CHEST_BOAT)
                .planks(DecoBlocks.IRON_CAP_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, IRON_CAP_BOAT_KEY, ironCapBoat);

        TerraformBoatType ironCapRaft = new TerraformBoatType.Builder()
                .raft()
                .item(DecoItems.IRON_CAP_RAFT)
                .chestItem(DecoItems.IRON_CAP_CHEST_RAFT)
                .planks(DecoBlocks.IRON_CAP_PLANKS.asItem())
                .build();

        Registry.register(TerraformBoatTypeRegistry.INSTANCE, IRON_CAP_RAFT_KEY, ironCapRaft);
    }
}
