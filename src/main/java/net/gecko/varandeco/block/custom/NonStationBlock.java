package net.gecko.varandeco.block.custom;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class NonStationBlock extends Block {
    private static final Formatting FORMATTING = Formatting.RED;
    private static final Text TEXT = Text.literal("This Block is not able to be used by Villagers").formatted(FORMATTING);
    public NonStationBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        tooltip.add(TEXT);
        super.appendTooltip(stack, context, tooltip, options);
    }
}
