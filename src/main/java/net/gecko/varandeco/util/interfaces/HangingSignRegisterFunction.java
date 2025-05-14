package net.gecko.varandeco.util.interfaces;

import net.minecraft.block.Block;

public interface HangingSignRegisterFunction<T, H> {
    H apply(Block hangingSign, Block wallHangingSign, T settings);
}
