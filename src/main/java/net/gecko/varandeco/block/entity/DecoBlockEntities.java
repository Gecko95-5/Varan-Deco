package net.gecko.varandeco.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class DecoBlockEntities {

    public static BlockEntityType<DeepslateFurnaceBlockEntity> DEEPSLATE_FURNACE_BE;

    public static BlockEntityType<BlackstoneFurnaceBlockEntity> BLACKSTONE_FURNACE_BE;

    public static BlockEntityType<TuffFurnaceBlockEntity> TUFF_FURNACE_BE;

    public static BlockEntityType<DeepslateBlastFurnaceBlockEntity> DEEPSLATE_BLAST_FURNACE_BE;

    public static BlockEntityType<BlackstoneBlastFurnaceBlockEntity> BLACKSTONE_BLAST_FURNACE_BE;

    public static BlockEntityType<TuffBlastFurnaceBlockEntity> TUFF_BLAST_FURNACE_BE;

    public static BlockEntityType<DeepslateSmokerBlockEntity> DEEPSLATE_SMOKER_BE;

    public static BlockEntityType<BlackstoneSmokerBlockEntity> BLACKSTONE_SMOKER_BE;

    public static BlockEntityType<TuffSmokerBlockEntity> TUFF_SMOKER_BE;

    public static void registerBlockEntities(){

        DEEPSLATE_FURNACE_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                Identifier.of(VaranDeco.MOD_ID, "deepslate_furnace_be"),
                FabricBlockEntityTypeBuilder.create(DeepslateFurnaceBlockEntity::new,
                        DecoBlocks.DEEPSLATE_FURNACE).build());

        BLACKSTONE_FURNACE_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                Identifier.of(VaranDeco.MOD_ID, "blackstone_furnace_be"),
                FabricBlockEntityTypeBuilder.create(BlackstoneFurnaceBlockEntity::new,
                        DecoBlocks.BLACKSTONE_FURNACE).build());

        TUFF_FURNACE_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                Identifier.of(VaranDeco.MOD_ID, "tuff_furnace_be"),
                FabricBlockEntityTypeBuilder.create(TuffFurnaceBlockEntity::new,
                        DecoBlocks.TUFF_FURNACE).build());

        DEEPSLATE_BLAST_FURNACE_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                Identifier.of(VaranDeco.MOD_ID, "deepslate_blast_furnace_be"),
                FabricBlockEntityTypeBuilder.create(DeepslateBlastFurnaceBlockEntity::new,
                        DecoBlocks.DEEPSLATE_BLAST_FURNACE).build());

        BLACKSTONE_BLAST_FURNACE_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                Identifier.of(VaranDeco.MOD_ID, "blackstone_blast_furnace_be"),
                FabricBlockEntityTypeBuilder.create(BlackstoneBlastFurnaceBlockEntity::new,
                        DecoBlocks.BLACKSTONE_BLAST_FURNACE).build());

        TUFF_BLAST_FURNACE_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                Identifier.of(VaranDeco.MOD_ID, "tuff_blast_furnace_be"),
                FabricBlockEntityTypeBuilder.create(TuffBlastFurnaceBlockEntity::new,
                        DecoBlocks.TUFF_BLAST_FURNACE).build());

        DEEPSLATE_SMOKER_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                Identifier.of(VaranDeco.MOD_ID, "deepslate_smoker_be"),
                FabricBlockEntityTypeBuilder.create(DeepslateSmokerBlockEntity::new,
                        DecoBlocks.DEEPSLATE_SMOKER).build());

        BLACKSTONE_SMOKER_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                Identifier.of(VaranDeco.MOD_ID, "blackstone_smoker_be"),
                FabricBlockEntityTypeBuilder.create(BlackstoneSmokerBlockEntity::new,
                        DecoBlocks.BLACKSTONE_SMOKER).build());

        TUFF_SMOKER_BE = Registry.register(Registries.BLOCK_ENTITY_TYPE,
                Identifier.of(VaranDeco.MOD_ID, "tuff_smoker_be"),
                FabricBlockEntityTypeBuilder.create(TuffSmokerBlockEntity::new,
                        DecoBlocks.TUFF_SMOKER).build());
    }
}
