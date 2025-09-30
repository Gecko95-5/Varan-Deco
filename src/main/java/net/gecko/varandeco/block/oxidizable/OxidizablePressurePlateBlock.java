package net.gecko.varandeco.block.oxidizable;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.WeightedPressurePlateBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class OxidizablePressurePlateBlock extends WeightedPressurePlateBlock implements Oxidizable {
    private final Oxidizable.OxidationLevel oxidationLevel;
    private final SoundEvent depressSound;
    private final SoundEvent pressSound;
    public OxidizablePressurePlateBlock(Oxidizable.OxidationLevel oxidationLevel, int weight, AbstractBlock.Settings settings, SoundEvent depressSound, SoundEvent pressSound) {
        super(weight, settings, depressSound, pressSound);
        this.oxidationLevel = oxidationLevel;
        this.depressSound = depressSound;
        this.pressSound = pressSound;
    }
    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        this.tickDegradation(state, world, pos, random);
    }

    @Override
    public boolean hasRandomTicks(BlockState state) {
        return Oxidizable.getIncreasedOxidationBlock(state.getBlock()).isPresent();
    }

    public Oxidizable.OxidationLevel getDegradationLevel() {
        return this.oxidationLevel;
    }
}
