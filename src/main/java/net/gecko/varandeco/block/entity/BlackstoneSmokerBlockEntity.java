package net.gecko.varandeco.block.entity;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.AbstractFurnaceBlockEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.RecipeType;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.SmokerScreenHandler;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class BlackstoneSmokerBlockEntity extends AbstractFurnaceBlockEntity {
	public BlackstoneSmokerBlockEntity(BlockPos pos, BlockState state) {
		super(DecoBlockEntities.BLACKSTONE_SMOKER_BE, pos, state, RecipeType.SMOKING);
	}

	@Override
	protected Text getContainerName() {
		return Text.translatable("container.smoker");
	}

	@Override
	protected int getFuelTime(ItemStack fuel) {
		return super.getFuelTime(fuel) / 2;
	}

	@Override
	protected ScreenHandler createScreenHandler(int syncId, PlayerInventory playerInventory) {
		return new SmokerScreenHandler(syncId, playerInventory, this, this.propertyDelegate);
	}
}
