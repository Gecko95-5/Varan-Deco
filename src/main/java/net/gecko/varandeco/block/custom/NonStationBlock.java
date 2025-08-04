package net.gecko.varandeco.block.custom;

import net.minecraft.block.Block;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class NonStationBlock extends Block {
    private static final Formatting FORMATTING = Formatting.RED;
    private static final Text TEXT = Text.literal("This Block is not able to be used by Villagers").formatted(FORMATTING);
    public NonStationBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        tooltip.add(TEXT);
        super.appendTooltip(stack, world, tooltip, options);
    }
}
