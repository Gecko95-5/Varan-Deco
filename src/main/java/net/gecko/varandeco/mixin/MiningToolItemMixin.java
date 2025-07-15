package net.gecko.varandeco.mixin;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.block.BlockState;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MiningToolItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;


@Mixin(MiningToolItem.class)
public abstract class MiningToolItemMixin extends ToolItem {


    public MiningToolItemMixin(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    @Override
    public boolean postMine(ItemStack stack, World world, BlockState state, BlockPos pos, LivingEntity miner) {
        int i = this.getMaterial().getMiningLevel();
        int d = stack.getMaxDamage();
        if (!world.isClient && state.getHardness(world, pos) != 0.0F) {
            if (i < MiningLevels.IRON && state.isIn(BlockTags.NEEDS_DIAMOND_TOOL)) {
                stack.damage(d, miner, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
            }
            stack.damage(1, miner, e -> e.sendEquipmentBreakStatus(EquipmentSlot.MAINHAND));
        }

        return true;
    }
}