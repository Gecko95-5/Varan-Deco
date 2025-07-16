package net.gecko.varandeco.block.ice;

import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class BlackIceBlock extends Block {
    public BlackIceBlock(Settings settings) {
        super(settings);
    }

    @Override
    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.BLOCK;
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        if (entity.isOnFire()) {
        entity.extinguish();
        entity.damage(world.getDamageSources().freeze(), 5.0F);
    }
        if (!entity.bypassesSteppingEffects()) {
            entity.damage(world.getDamageSources().freeze(), 1.0F);
        }
        super.onSteppedOn(world, pos, state, entity);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
        if (!player.bypassesSteppingEffects()) {
            player.damage(world.getDamageSources().freeze(), 0.5F);
        }
        return super.onUse(state, world, pos, player, hand, hit);
    }

    public void onBreak(World world, BlockPos pos, BlockState state, PlayerEntity player) {
        super.onBreak(world, pos, state, player);
        ItemStack stack = player.getMainHandStack();
        int i = stack.getMaxDamage();
        if (!stack.isSuitableFor(DecoBlocks.BLACK_ICE.getDefaultState())){
            stack.damage(i, player, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }
    }

    @Override
    public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack stack) {
        super.afterBreak(world, player, pos, state, blockEntity, stack);
        if (!stack.isSuitableFor(DecoBlocks.BLACK_ICE.getDefaultState())){
            if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
                Material material = world.getBlockState(pos.down()).getMaterial();
                if (material.blocksMovement() || material.isSolid()) {
                    world.setBlockState(pos, Blocks.PACKED_ICE.getDefaultState());
                }
            }

            Material material = world.getBlockState(pos.down()).getMaterial();
            if (material.blocksMovement() || material.isSolid()) {
                world.setBlockState(pos, Blocks.PACKED_ICE.getDefaultState());
            }
        }
        if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
            Material material = world.getBlockState(pos.down()).getMaterial();
            if (material.blocksMovement() || material.isSolid()) {
                world.setBlockState(pos, Blocks.PACKED_ICE.getDefaultState());
            }
        }
    }
}
