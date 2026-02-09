package net.gecko.varandeco.block.nature.ice;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.Entity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.tag.EntityTypeTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class FragileIceBlock extends Block {
    public FragileIceBlock(Settings settings) {
        super(settings);
    }
    @Override
    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.DESTROY;
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
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        if (!entity.bypassesSteppingEffects()) {
            if (!entity.getType().isIn(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS))
                world.breakBlock(pos, true);
                entity.handleFallDamage(fallDistance, 1.5F, DamageSource.FALL);
        }
    }
}
