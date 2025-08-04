package net.gecko.varandeco.block.custom;

import net.minecraft.block.BarrelBlock;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class NonStationBarrelBlock extends BarrelBlock {
    private static final Formatting FORMATTING = Formatting.RED;
    private static final Text TEXT = Text.literal("This Block is not able to be used by Villagers").formatted(FORMATTING);
    public NonStationBarrelBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, net.minecraft.item.tooltip.TooltipType options) {
        tooltip.add(TEXT);
        super.appendTooltip(stack, context, tooltip, options);
    }
}
