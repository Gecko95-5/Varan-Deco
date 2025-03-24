package net.gecko.varandeco.block.entity;

import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DecoBlockEntities {

    public static BlockEntityType<DeepslateFurnaceBlockEntity> DEEPSLATE_FURNACE_BE;

    public static void registerBlockEntities(){
        DEEPSLATE_FURNACE_BE = Registry.register(Registry.BLOCK_ENTITY_TYPE,
                new Identifier(VaranDeco.MOD_ID, "deepslate_furnace_be"),
                FabricBlockEntityTypeBuilder.create(DeepslateFurnaceBlockEntity::new,
                        DecoBlocks.DEEPSLATE_FURNACE).build(null));
    }
}
