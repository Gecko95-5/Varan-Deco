package net.gecko.varandeco.block.custom;

import com.mojang.serialization.MapCodec;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.block.*;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldView;

public class WarpedWartBlock extends PlantBlock {
	public static final MapCodec<WarpedWartBlock> CODEC = createCodec(WarpedWartBlock::new);
	public static final int field_31199 = 3;
	public static final IntProperty AGE = Properties.AGE_3;
	private static final VoxelShape[] AGE_TO_SHAPE = new VoxelShape[]{
		Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
		Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
		Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
		Block.createCuboidShape(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
	};
	@Override
	public MapCodec<WarpedWartBlock> getCodec() {
		return CODEC;
	}

	public WarpedWartBlock(Settings settings) {
		super(settings);
		this.setDefaultState(this.stateManager.getDefaultState().with(AGE, 0));
	}

	@Override
	public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return AGE_TO_SHAPE[state.get(AGE)];
	}

	@Override
	protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
		return floor.isOf(Blocks.SOUL_SAND);
	}

	@Override
	public boolean hasRandomTicks(BlockState state) {
		return (Integer)state.get(AGE) < 3;
	}

	@Override
	public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		int i = (Integer)state.get(AGE);
		if (i < 3 && random.nextInt(10) == 0) {
			state = state.with(AGE, i + 1);
			world.setBlockState(pos, state, Block.NOTIFY_LISTENERS);
		}
	}

	@Override
	protected ItemStack getPickStack(WorldView world, BlockPos pos, BlockState state, boolean includeData) {
		return new ItemStack(DecoItems.WARPED_WART);
	}

	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(AGE);
	}
}
