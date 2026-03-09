package net.gecko.varandeco.block.nature;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;

public class CoralStairBlock extends StairsBlock {
    private final Block deadCoralBlock;
    public CoralStairBlock(Block deadCoralBlock, BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
        this.deadCoralBlock = deadCoralBlock;
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (!isInWater(state, world, pos)) {
            world.setBlockState(pos, this.deadCoralBlock.getDefaultState().with(WATERLOGGED, false), Block.NOTIFY_LISTENERS);
        }
    }

    @Override
    public BlockState getStateForNeighborUpdate(
            BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos
    ) {
        if (direction == Direction.DOWN && !state.canPlaceAt(world, pos)) {
            return Blocks.AIR.getDefaultState();
        } else {
            this.checkLivingConditions(state, world, pos);
            if (state.get(WATERLOGGED)) {
                world.createAndScheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
            }

            return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
        }
    }
    protected static boolean isInWater(BlockState state, BlockView world, BlockPos pos) {
        if (state.get(WATERLOGGED)) {
            return true;
        } else {
            for (Direction direction : Direction.values()) {
                if (world.getFluidState(pos.offset(direction)).isIn(FluidTags.WATER)) {
                    return true;
                }
            }

            return false;
        }
    }
    public void checkLivingConditions(BlockState state, WorldAccess world, BlockPos pos) {
        if (!isInWater(state, world, pos)) {
            world.createAndScheduleBlockTick(pos, this, 60 + world.getRandom().nextInt(40));
        }
    }
}
