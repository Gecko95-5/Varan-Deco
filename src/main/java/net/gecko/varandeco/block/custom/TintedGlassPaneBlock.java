package net.gecko.varandeco.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class TintedGlassPaneBlock extends PaneBlock {
    public TintedGlassPaneBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected boolean isTransparent(BlockState state) {
        return false;
    }

    @Override
    protected int getOpacity(BlockState state) {
        return 15;
    }
}
