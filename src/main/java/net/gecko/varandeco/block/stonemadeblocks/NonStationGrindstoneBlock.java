package net.gecko.varandeco.block.stonemadeblocks;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.WallMountedBlock;
import net.minecraft.client.item.TooltipType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class NonStationGrindstoneBlock extends WallMountedBlock {
    public static final MapCodec<NonStationGrindstoneBlock> CODEC = createCodec(NonStationGrindstoneBlock::new);

    private static final Formatting FORMATTING = Formatting.RED;
    private static final Text TEXT = Text.literal("This Block is not able to be used by Villagers").formatted(FORMATTING);
    public NonStationGrindstoneBlock(Settings settings) {
        super(settings);
    }
    @Override
    public MapCodec<NonStationGrindstoneBlock> getCodec() {
        return CODEC;
    }

    @Override
    public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
        tooltip.add(TEXT);
        super.appendTooltip(stack, context, tooltip, options);
    }
}
