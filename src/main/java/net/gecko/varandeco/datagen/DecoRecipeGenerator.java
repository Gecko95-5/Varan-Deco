package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
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
        offerStonecuttingRecipe(exporter, Blocks.STONE_BRICK_SLAB, DecoBlocks.POLISHED_STONE,2);
        offerStonecuttingRecipe(exporter, Blocks.STONE_BRICK_WALL, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, Blocks.CHISELED_STONE_BRICKS, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, Blocks.STONE_BRICKS, Blocks.COBBLESTONE);
        offerStonecuttingRecipe(exporter, Blocks.STONE_BRICK_STAIRS, Blocks.COBBLESTONE);
        offerStonecuttingRecipe(exporter, Blocks.STONE_BRICK_SLAB, Blocks.COBBLESTONE,2);
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
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_SLAB, Blocks.COBBLESTONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_WALL, Blocks.COBBLESTONE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.STONE_TILES, Blocks.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, Blocks.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, Blocks.STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, Blocks.COBBLESTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, DecoBlocks.POLISHED_STONE);

        createStairsRecipe(DecoBlocks.STONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.STONE_TILES))
                .criterion(hasItem(DecoBlocks.STONE_TILES),conditionsFromItem(DecoBlocks.STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_STAIRS, DecoBlocks.STONE_TILES);

        offerSlabRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, DecoBlocks.STONE_TILES);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, DecoBlocks.STONE_TILES,2);

        offerWallRecipe(exporter, DecoBlocks.STONE_TILE_WALL, DecoBlocks.STONE_TILES);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_WALL, DecoBlocks.STONE_TILES);

        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_STAIRS, Blocks.COBBLESTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, Blocks.COBBLESTONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_WALL, Blocks.COBBLESTONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_STAIRS, Blocks.STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, Blocks.STONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_WALL, Blocks.STONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_STAIRS, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, DecoBlocks.POLISHED_STONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_WALL, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_STAIRS, Blocks.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, Blocks.STONE_BRICKS,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_WALL, Blocks.STONE_BRICKS);

        createStairsRecipe(DecoBlocks.PACKED_MUD_STAIRS, Ingredient.ofItems(Blocks.PACKED_MUD))
                .criterion(hasItem(Blocks.PACKED_MUD),conditionsFromItem(Blocks.PACKED_MUD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PACKED_MUD_STAIRS)));

        offerSlabRecipe(exporter, DecoBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD);
        offerWallRecipe(exporter, DecoBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);

        ShapedRecipeJsonBuilder.create(DecoBlocks.RED_NETHER_BRICK_FENCE)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.NETHER_BRICK)
                .input('#', Blocks.RED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .criterion(RecipeProvider.hasItem(Blocks.RED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Blocks.RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.RED_NETHER_BRICK_FENCE)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', Blocks.NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .criterion(RecipeProvider.hasItem(Blocks.NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Blocks.NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.NETHER_BRICK_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', Blocks.RED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .criterion(RecipeProvider.hasItem(Blocks.RED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Blocks.RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE)));

        createStairsRecipe(DecoBlocks.NETHERRACK_STAIRS, Ingredient.ofItems(Blocks.NETHERRACK))
                .criterion(hasItem(Blocks.NETHERRACK),conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.NETHERRACK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);

        offerSlabRecipe(exporter, DecoBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK);
        offerStonecuttingRecipe(exporter, DecoBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK,2);

        offerWallRecipe(exporter, DecoBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);
        offerStonecuttingRecipe(exporter, DecoBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);

        createStairsRecipe(DecoBlocks.MAGMA_STAIRS, Ingredient.ofItems(Blocks.MAGMA_BLOCK))
                .criterion(hasItem(Blocks.MAGMA_BLOCK),conditionsFromItem(Blocks.MAGMA_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGMA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_STAIRS, Blocks.MAGMA_BLOCK);

        offerSlabRecipe(exporter, DecoBlocks.MAGMA_SLAB, Blocks.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_SLAB, Blocks.MAGMA_BLOCK,2);

        offerWallRecipe(exporter, DecoBlocks.MAGMA_WALL, Blocks.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_WALL, Blocks.MAGMA_BLOCK);

        offerPolishedStoneRecipe(exporter, DecoBlocks.MAGMA_BRICKS, Blocks.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICKS, Blocks.MAGMA_BLOCK);

        createStairsRecipe(DecoBlocks.MAGMA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.MAGMA_BRICKS))
                .criterion(hasItem(DecoBlocks.MAGMA_BRICKS),conditionsFromItem(DecoBlocks.MAGMA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGMA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_STAIRS, Blocks.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_STAIRS, DecoBlocks.MAGMA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.MAGMA_BRICK_SLAB, DecoBlocks.MAGMA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_SLAB, Blocks.MAGMA_BLOCK,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_SLAB, DecoBlocks.MAGMA_BRICKS,2);

        offerWallRecipe(exporter, DecoBlocks.MAGMA_BRICK_WALL, DecoBlocks.MAGMA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_WALL, Blocks.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_WALL, DecoBlocks.MAGMA_BRICKS);

        offerChiseledBlockRecipe(exporter, DecoBlocks.CHISELED_MAGMA_BRICKS, DecoBlocks.MAGMA_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_MAGMA_BRICKS, Blocks.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_MAGMA_BRICKS, DecoBlocks.MAGMA_BRICKS);

        offerPolishedStoneRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILES, Blocks.BLACKSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILES, Blocks.POLISHED_BLACKSTONE);

        createStairsRecipe(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_BLACKSTONE_TILES))
                .criterion(hasItem(DecoBlocks.POLISHED_BLACKSTONE_TILES),conditionsFromItem(DecoBlocks.POLISHED_BLACKSTONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, DecoBlocks.POLISHED_BLACKSTONE_TILES);

        offerSlabRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.POLISHED_BLACKSTONE_TILES);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.POLISHED_BLACKSTONE_TILES,2);

        offerWallRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.POLISHED_BLACKSTONE_TILES);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.POLISHED_BLACKSTONE_TILES);

        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Blocks.BLACKSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Blocks.BLACKSTONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Blocks.BLACKSTONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Blocks.POLISHED_BLACKSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Blocks.POLISHED_BLACKSTONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Blocks.POLISHED_BLACKSTONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Blocks.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Blocks.POLISHED_BLACKSTONE_BRICKS,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Blocks.POLISHED_BLACKSTONE_BRICKS);

        ShapedRecipeJsonBuilder.create(DecoBlocks.POLISHED_GLIDED_BLACKSTONE,2)
                .pattern("P#")
                .pattern("#P")
                .input('P', Blocks.POLISHED_BLACKSTONE)
                .input('#', Blocks.GILDED_BLACKSTONE)
                .criterion(RecipeProvider.hasItem(Blocks.POLISHED_BLACKSTONE),
                        RecipeProvider.conditionsFromItem(Blocks.POLISHED_BLACKSTONE))
                .criterion(RecipeProvider.hasItem(Blocks.GILDED_BLACKSTONE),
                        RecipeProvider.conditionsFromItem(Blocks.GILDED_BLACKSTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.POLISHED_GLIDED_BLACKSTONE)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.CHISELED_GLIDED_BLACKSTONE)
                .pattern("###")
                .pattern("#C#")
                .pattern("###")
                .input('C', Blocks.CHISELED_POLISHED_BLACKSTONE)
                .input('#', DecoBlocks.POLISHED_GLIDED_BLACKSTONE)
                .criterion(RecipeProvider.hasItem(Blocks.CHISELED_POLISHED_BLACKSTONE),
                        RecipeProvider.conditionsFromItem(Blocks.CHISELED_POLISHED_BLACKSTONE))
                .criterion(RecipeProvider.hasItem(DecoBlocks.POLISHED_GLIDED_BLACKSTONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.POLISHED_GLIDED_BLACKSTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHISELED_GLIDED_BLACKSTONE)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.SNOW_STAIRS)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', Items.SNOWBALL)
                .criterion(RecipeProvider.hasItem(Items.SNOWBALL),
                        RecipeProvider.conditionsFromItem(Items.SNOWBALL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SNOW_STAIRS)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.SNOW_SLAB,2)
                .pattern("###")
                .input('#', Items.SNOWBALL)
                .criterion(RecipeProvider.hasItem(Items.SNOWBALL),
                        RecipeProvider.conditionsFromItem(Items.SNOWBALL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SNOW_SLAB)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.SNOW_WALL)
                .pattern("###")
                .pattern("###")
                .input('#', Items.SNOWBALL)
                .criterion(RecipeProvider.hasItem(Items.SNOWBALL),
                        RecipeProvider.conditionsFromItem(Items.SNOWBALL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SNOW_WALL)));
    }
}
