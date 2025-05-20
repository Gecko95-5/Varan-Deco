package net.gecko.varandeco.block.magmabubbleblocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BubbleWallBlock extends WallBlock {
    public BubbleWallBlock(Settings settings) {
        super(settings);
    }
    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.bypassesSteppingEffects()) {
            entity.extinguish();
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
