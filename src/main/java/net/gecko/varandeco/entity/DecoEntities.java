package net.gecko.varandeco.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.gecko.varandeco.VaranDeco;
import net.gecko.varandeco.entity.custom.SnowBrickProjectileEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class DecoEntities {

    public static final EntityType<SnowBrickProjectileEntity> SNOW_BRICK_PROJECTILE = Registry.register(Registry.ENTITY_TYPE,
            new Identifier(VaranDeco.MOD_ID,"snow_brick_projectile"),
            FabricEntityTypeBuilder.<SnowBrickProjectileEntity>create(SpawnGroup.MISC, SnowBrickProjectileEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25f, 0.25f)).build());
}
