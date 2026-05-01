package net.gecko.varandeco.block.nature.ice;

import net.gecko.varandeco.util.DecoEnchantmentHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Waterloggable;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.registry.tag.EntityTypeTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class  FragileIceBlock extends Block{
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
            if (!entity.getType().isIn(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS) &&
                    !DecoEnchantmentHelper.hasFeatherFalling((LivingEntity)entity))
                world.breakBlock(pos, true);
        }
    }

    @Override
    public void onLandedUpon(World world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        if (!entity.bypassesSteppingEffects()) {
            if (!entity.getType().isIn(EntityTypeTags.POWDER_SNOW_WALKABLE_MOBS) &&
                    !DecoEnchantmentHelper.hasFeatherFalling((LivingEntity)entity))
                world.breakBlock(pos, true);
                entity.handleFallDamage(fallDistance, 1.5F, DamageSource.FALL);
        }
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.getDimension().ultrawarm()) {
            world.removeBlock(pos, false);
        }
    }
}
