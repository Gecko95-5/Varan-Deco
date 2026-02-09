package net.gecko.varandeco.block.nature;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Fertilizable;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.NetherConfiguredFeatures;

public class PackedWarpedNyliumBlock extends Block implements Fertilizable {
    public PackedWarpedNyliumBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isFertilizable(BlockView world, BlockPos pos, BlockState state, boolean isClient) {
        return world.getBlockState(pos.up()).isAir();
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        NetherConfiguredFeatures.WARPED_FOREST_VEGETATION_BONEMEAL.value()
                .generate(world, world.getChunkManager().getChunkGenerator(), random, pos.up());
    }
}
