package net.gecko.varandeco.block.magmabubbleblocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BubbleStairBlock extends StairsBlock {
    public BubbleStairBlock(BlockState baseBlockState, Settings settings) {
        super(baseBlockState, settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (!entity.bypassesSteppingEffects()) {
            entity.extinguish();
        }

        super.onSteppedOn(world, pos, state, entity);
    }
}
