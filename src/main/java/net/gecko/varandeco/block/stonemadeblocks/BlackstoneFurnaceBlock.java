package net.gecko.varandeco.block.stonemadeblocks;

import com.mojang.serialization.MapCodec;
import net.gecko.varandeco.block.entity.DecoBlockEntities;
import net.gecko.varandeco.block.entity.stone.BlackstoneFurnaceBlockEntity;
import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityTicker;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.screen.NamedScreenHandlerFactory;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BlackstoneFurnaceBlock extends AbstractFurnaceBlock {
	public static final MapCodec<BlackstoneFurnaceBlock> CODEC = createCodec(BlackstoneFurnaceBlock::new);

	@Override
	public MapCodec<BlackstoneFurnaceBlock> getCodec() {
		return CODEC;
	}
	public BlackstoneFurnaceBlock(Settings settings) {
		super(settings);
	}

	@Override
	public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
		return new BlackstoneFurnaceBlockEntity(pos, state);
	}

	@Nullable
	@Override
	public <T extends BlockEntity> BlockEntityTicker<T> getTicker(World world, BlockState state, BlockEntityType<T> type) {
		return validateTicker(world, type, DecoBlockEntities.BLACKSTONE_FURNACE_BE);
	}

	@Override
	protected void openScreen(World world, BlockPos pos, PlayerEntity player) {
		BlockEntity blockEntity = world.getBlockEntity(pos);
		if (blockEntity instanceof BlackstoneFurnaceBlockEntity) {
			player.openHandledScreen((NamedScreenHandlerFactory)blockEntity);
			player.incrementStat(Stats.INTERACT_WITH_FURNACE);
		}
	}

	@Override
	public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
		if ((Boolean)state.get(LIT)) {
			double d = pos.getX() + 0.5;
			double e = pos.getY();
			double f = pos.getZ() + 0.5;
			if (random.nextDouble() < 0.1) {
				world.playSoundClient(d, e, f, SoundEvents.BLOCK_FURNACE_FIRE_CRACKLE, SoundCategory.BLOCKS, 1.0F, 1.0F, false);
			}

			Direction direction = state.get(FACING);
			Direction.Axis axis = direction.getAxis();
			double g = 0.52;
			double h = random.nextDouble() * 0.6 - 0.3;
			double i = axis == Direction.Axis.X ? direction.getOffsetX() * 0.52 : h;
			double j = random.nextDouble() * 6.0 / 16.0;
			double k = axis == Direction.Axis.Z ? direction.getOffsetZ() * 0.52 : h;
			world.addParticleClient(ParticleTypes.SMOKE, d + i, e + j, f + k, 0.0, 0.0, 0.0);
			world.addParticleClient(ParticleTypes.FLAME, d + i, e + j, f + k, 0.0, 0.0, 0.0);
		}
	}
}
