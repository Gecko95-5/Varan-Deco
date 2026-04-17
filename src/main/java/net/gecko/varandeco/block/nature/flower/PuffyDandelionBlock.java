package net.gecko.varandeco.block.nature.flower;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.BiomeTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeKeys;

public class PuffyDandelionBlock extends FlowerBlock implements Fertilizable {

    public PuffyDandelionBlock(StatusEffect suspiciousStewEffect, int effectDuration, Settings settings) {
        super(suspiciousStewEffect, effectDuration, settings);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        if (world.getBiome(pos).matchesKey(BiomeKeys.TAIGA) && world.getBiome(pos).matchesKey(BiomeKeys.OLD_GROWTH_PINE_TAIGA) &&
                world.getBiome(pos).matchesKey(BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA) &&
                    world.getBiome(pos).matchesKey(BiomeKeys.WINDSWEPT_FOREST)) {
            world.setBlockState(pos, DecoBlocks.TAIGA_DANDELION.getDefaultState(), Block.NOTIFY_ALL);
        } else {
            world.setBlockState(pos, Blocks.DANDELION.getDefaultState(), Block.NOTIFY_ALL);
        }
    }
}
