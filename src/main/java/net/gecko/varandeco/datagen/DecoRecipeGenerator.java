package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class DecoRecipeGenerator extends FabricRecipeProvider {
    public DecoRecipeGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        offerWallRecipe(exporter, DecoBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_ANDESITE_WALL, Blocks.ANDESITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);

        offerWallRecipe(exporter, DecoBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_DIORITE_WALL, Blocks.DIORITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);

        offerWallRecipe(exporter, DecoBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_GRANITE_WALL, Blocks.GRANITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);

        offerWallRecipe(exporter, DecoBlocks.STONE_WALL, Blocks.STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_WALL, Blocks.STONE);

        createStairsRecipe(DecoBlocks.SMOOTH_STONE_STAIRS, Ingredient.ofItems(Blocks.SMOOTH_STONE))
                .criterion(hasItem(Blocks.SMOOTH_STONE),conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);

        offerWallRecipe(exporter, DecoBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);

        createStairsRecipe(DecoBlocks.CALCITE_STAIRS, Ingredient.ofItems(Blocks.CALCITE))
                .criterion(hasItem(Blocks.CALCITE),conditionsFromItem(Blocks.CALCITE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CALCITE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CALCITE_STAIRS, Blocks.CALCITE);

        offerSlabRecipe(exporter, DecoBlocks.CALCITE_SLAB, Blocks.CALCITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CALCITE_SLAB, Blocks.CALCITE,2);

        offerWallRecipe(exporter, DecoBlocks.CALCITE_WALL, Blocks.CALCITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CALCITE_WALL, Blocks.CALCITE);

        createStairsRecipe(DecoBlocks.TUFF_STAIRS, Ingredient.ofItems(Blocks.TUFF))
                .criterion(hasItem(Blocks.TUFF),conditionsFromItem(Blocks.TUFF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.TUFF_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.TUFF_STAIRS, Blocks.TUFF);

        offerSlabRecipe(exporter, DecoBlocks.TUFF_SLAB, Blocks.TUFF);
        offerStonecuttingRecipe(exporter, DecoBlocks.TUFF_SLAB, Blocks.TUFF,2);

        offerWallRecipe(exporter, DecoBlocks.TUFF_WALL, Blocks.TUFF);
        offerStonecuttingRecipe(exporter, DecoBlocks.TUFF_WALL, Blocks.TUFF);

        createStairsRecipe(DecoBlocks.DRIPSTONE_STAIRS, Ingredient.ofItems(Blocks.DRIPSTONE_BLOCK))
                .criterion(hasItem(Blocks.DRIPSTONE_BLOCK),conditionsFromItem(Blocks.DRIPSTONE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DRIPSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);

        offerSlabRecipe(exporter, DecoBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK,2);

        offerWallRecipe(exporter, DecoBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);

        offerPolishedStoneRecipe(exporter, DecoBlocks.POLISHED_STONE, Blocks.COBBLESTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE, Blocks.COBBLESTONE);

        offerPolishedStoneRecipe(exporter, Blocks.STONE_BRICKS, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, Blocks.STONE_BRICKS, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, Blocks.STONE_BRICK_STAIRS, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, Blocks.STONE_BRICK_SLAB, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, Blocks.STONE_BRICK_WALL, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, Blocks.CHISELED_STONE_BRICKS, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, Blocks.STONE_BRICKS, Blocks.COBBLESTONE);
        offerStonecuttingRecipe(exporter, Blocks.STONE_BRICK_STAIRS, Blocks.COBBLESTONE);
        offerStonecuttingRecipe(exporter, Blocks.STONE_BRICK_SLAB, Blocks.COBBLESTONE);
        offerStonecuttingRecipe(exporter, Blocks.STONE_BRICK_WALL, Blocks.COBBLESTONE);
        offerStonecuttingRecipe(exporter, Blocks.CHISELED_STONE_BRICKS, Blocks.COBBLESTONE);

        createStairsRecipe(DecoBlocks.POLISHED_STONE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_STONE))
                .criterion(hasItem(DecoBlocks.POLISHED_STONE),conditionsFromItem(DecoBlocks.POLISHED_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_STAIRS, DecoBlocks.POLISHED_STONE);

        offerSlabRecipe(exporter, DecoBlocks.POLISHED_STONE_SLAB, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_SLAB, DecoBlocks.POLISHED_STONE,2);

        offerWallRecipe(exporter, DecoBlocks.POLISHED_STONE_WALL, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_WALL, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_STAIRS, Blocks.COBBLESTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_SLAB, Blocks.COBBLESTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_WALL, Blocks.COBBLESTONE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.STONE_TILES, Blocks.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, Blocks.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, Blocks.STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, Blocks.COBBLESTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, DecoBlocks.POLISHED_STONE);
    }
}
