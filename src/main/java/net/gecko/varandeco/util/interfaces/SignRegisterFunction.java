package net.gecko.varandeco.util.interfaces;

import net.minecraft.block.Block;

public interface SignRegisterFunction <T, S> {
    S apply(Block standingBlock, Block wallBlock, T settings);
}
