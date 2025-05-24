package net.gecko.varandeco.util;

import com.terraformersmc.terraform.leaves.ComposterRecipes;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;

public class DecoComposterRecipes {
    public static void registerCompostableBlocks(){
        ComposterRecipes.registerCompostableBlock(DecoBlocks.WOODEN_SAPLING);
        ComposterRecipes.registerCompostableBlock(DecoBlocks.WOODEN_LEAVES);

        ComposterRecipes.registerCompostableBlock(DecoBlocks.YELLOW_TULIP);
        ComposterRecipes.registerCompostableBlock(DecoBlocks.PURPLE_TULIP);
        ComposterRecipes.registerCompostableBlock(DecoBlocks.MAGENTA_TULIP);
        ComposterRecipes.registerCompostableBlock(DecoBlocks.BLACK_TULIP);
        ComposterRecipes.registerCompostableBlock(DecoBlocks.GREEN_TULIP);
        ComposterRecipes.registerCompostableBlock(DecoBlocks.BLUE_TULIP);
        ComposterRecipes.registerCompostableBlock(DecoBlocks.CYAN_TULIP);

        ComposterRecipes.registerCompostableBlock(DecoBlocks.BARBERTON_DAISY);
        ComposterRecipes.registerCompostableBlock(DecoBlocks.BLUE_EYED_DAISY);
        ComposterRecipes.registerCompostableBlock(DecoBlocks.GERBERA_DAISY);
        ComposterRecipes.registerCompostableBlock(DecoBlocks.MICHAELMAS_DAISY);

        ComposterRecipes.registerCompostableBlock(DecoBlocks.PUFFY_DANDELION);

        ComposterRecipes.registerCompostableBlock(DecoBlocks.CALIFORNIA_POPPY);
        ComposterRecipes.registerCompostableBlock(DecoBlocks.SALMON_POPPY);

        ComposterRecipes.registerCompostableBlock(DecoBlocks.YELLOW_ORCHID);
        ComposterRecipes.registerCompostableBlock(DecoBlocks.WHITE_ORCHID);
        ComposterRecipes.registerCompostableBlock(DecoBlocks.PINK_ORCHID);

        ComposterRecipes.registerCompostableBlock(DecoBlocks.ROSE);
        ComposterRecipes.registerCompostableBlock(DecoBlocks.ENDER_ROSE);

        ComposterRecipes.registerCompostableBlock(DecoBlocks.PAEONIA);
        ComposterRecipes.registerCompostableBlock(DecoBlocks.LAVENDER);

        ComposterRecipes.registerCompostableBlock(DecoBlocks.WARPED_WART_PLANT);
    }
    public static void registerCompostableItems(){
        ComposterItemsRecipes.registerCompostableItem(DecoItems.WARPED_WART,0.65F);
        ComposterItemsRecipes.registerCompostableItem(DecoBlocks.ENDER_ROSE_BUSH,0.65F);
        ComposterItemsRecipes.registerCompostableItem(DecoBlocks.WITHER_ROSE_BUSH,0.65F);
        ComposterItemsRecipes.registerCompostableItem(DecoBlocks.RED_SUNFLOWER,0.65F);
        ComposterItemsRecipes.registerCompostableItem(DecoBlocks.NOVA_STARFLOWER,0.65F);
    }
}
