package net.gecko.varandeco.block.nature.ice;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.registry.tag.EntityTypeTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.attribute.EnvironmentAttributes;

public class  FragileIceBlock extends Block{
    public FragileIceBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        super.onSteppedOn(world, pos, state, entity);
        if (!entity.bypassesSteppingEffects()) {
            if (!entity.getType().isIn(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS))
                world.breakBlock(pos, true);
        }
    }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, double fallDistance) {
        if (!entity.bypassesSteppingEffects()) {
            if (!entity.getType().isIn(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS))
                world.breakBlock(pos, true);
            entity.handleFallDamage(fallDistance, 1.5F, world.getDamageSources().fall());
        }
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getEnvironmentAttributes().getAttributeValue(EnvironmentAttributes.WATER_EVAPORATES_GAMEPLAY, pos)) {
            world.removeBlock(pos, false);
        }
    }
}
