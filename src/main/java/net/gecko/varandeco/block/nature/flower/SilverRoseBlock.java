package net.gecko.varandeco.block.nature.flower;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;

public class SilverRoseBlock extends FlowerBlock {
    public SilverRoseBlock(StatusEffect effect, Settings settings) {
        super(effect, 7, settings);
    }
    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return super.canPlantOnTop(floor, world, pos) || floor.isOf(Blocks.STONE) || floor.isOf(Blocks.GRAVEL);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        VoxelShape voxelShape = this.getOutlineShape(state, world, pos, ShapeContext.absent());
        Vec3d vec3d = voxelShape.getBoundingBox().getCenter();
        double d = pos.getX() + vec3d.x;
        double e = pos.getZ() + vec3d.z;

        for (int i = 0; i < 3; i++) {
            if (random.nextBoolean()) {
                world.addParticle(
                        ParticleTypes.PORTAL, d + random.nextDouble() / 5.0, pos.getY() + (0.5 - random.nextDouble()), e + random.nextDouble() / 5.0, 0.0, 0.0, 0.0
                );
            }
        }
    }
    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && world.getDifficulty() != Difficulty.PEACEFUL) {
            if (entity instanceof LivingEntity livingEntity &&
                    livingEntity.getType() != EntityType.FOX && entity.getType() != EntityType.BEE) {
                livingEntity.damage(DamageSource.SWEET_BERRY_BUSH,1);
            }
        }
    }
}
