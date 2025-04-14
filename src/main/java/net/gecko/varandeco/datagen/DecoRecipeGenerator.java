package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class DecoRecipeGenerator extends FabricRecipeProvider {
    public DecoRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.POLISHED_ANDESITE_WALL, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_ANDESITE_WALL, Items.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_ANDESITE_WALL, Items.POLISHED_ANDESITE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_DIORITE_WALL, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_DIORITE_WALL, Items.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_DIORITE_WALL, Items.POLISHED_DIORITE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_GRANITE_WALL, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_GRANITE_WALL, Items.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_GRANITE_WALL, Items.POLISHED_GRANITE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.STONE_WALL, Items.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_WALL, Items.STONE);

        createStairsRecipe(DecoBlocks.SMOOTH_STONE_STAIRS, Ingredient.ofItems(Items.SMOOTH_STONE))
                .criterion(hasItem(Items.SMOOTH_STONE),conditionsFromItem(Items.SMOOTH_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_STONE_STAIRS, Items.SMOOTH_STONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_STONE_WALL, Items.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_STONE_WALL, Items.SMOOTH_STONE);

        createStairsRecipe(DecoBlocks.CALCITE_STAIRS, Ingredient.ofItems(Items.CALCITE))
                .criterion(hasItem(Items.CALCITE),conditionsFromItem(Items.CALCITE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CALCITE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CALCITE_STAIRS, Items.CALCITE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_SLAB, Items.CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CALCITE_SLAB, Items.CALCITE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CALCITE_WALL, Items.CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CALCITE_WALL, Items.CALCITE);

        createStairsRecipe(DecoBlocks.TUFF_STAIRS, Ingredient.ofItems(Items.TUFF))
                .criterion(hasItem(Items.TUFF),conditionsFromItem(Items.TUFF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.TUFF_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_STAIRS, Items.TUFF);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.TUFF_SLAB, Items.TUFF);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_SLAB, Items.TUFF,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.TUFF_WALL, Items.TUFF);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_WALL, Items.TUFF);

        createStairsRecipe(DecoBlocks.DRIPSTONE_STAIRS, Ingredient.ofItems(Items.DRIPSTONE_BLOCK))
                .criterion(hasItem(Items.DRIPSTONE_BLOCK),conditionsFromItem(Items.DRIPSTONE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DRIPSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIPSTONE_STAIRS, Items.DRIPSTONE_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_SLAB, Items.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIPSTONE_SLAB, Items.DRIPSTONE_BLOCK,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.DRIPSTONE_WALL, Items.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIPSTONE_WALL, Items.DRIPSTONE_BLOCK);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE, Items.COBBLESTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICKS, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICKS, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_STAIRS, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_SLAB, DecoBlocks.POLISHED_STONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_WALL, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,Items.CHISELED_STONE_BRICKS, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICKS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_STAIRS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_SLAB, Items.COBBLESTONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_WALL, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,Items.CHISELED_STONE_BRICKS, Items.COBBLESTONE);

        createStairsRecipe(DecoBlocks.POLISHED_STONE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_STONE))
                .criterion(hasItem(DecoBlocks.POLISHED_STONE),conditionsFromItem(DecoBlocks.POLISHED_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_STAIRS, DecoBlocks.POLISHED_STONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_STONE_SLAB, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_SLAB, DecoBlocks.POLISHED_STONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_STONE_WALL, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_WALL, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_STAIRS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_SLAB, Items.COBBLESTONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_WALL, Items.COBBLESTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILES, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILES, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILES, Items.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILES, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILES, DecoBlocks.POLISHED_STONE);

        createStairsRecipe(DecoBlocks.STONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.STONE_TILES))
                .criterion(hasItem(DecoBlocks.STONE_TILES),conditionsFromItem(DecoBlocks.STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_STAIRS, DecoBlocks.STONE_TILES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STONE_TILE_SLAB, DecoBlocks.STONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, DecoBlocks.STONE_TILES,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.STONE_TILE_WALL, DecoBlocks.STONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_WALL, DecoBlocks.STONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_STAIRS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, Items.COBBLESTONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_WALL, Items.COBBLESTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_STAIRS, Items.STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, Items.STONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_WALL, Items.STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_STAIRS, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, DecoBlocks.POLISHED_STONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_WALL, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_STAIRS, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, Items.STONE_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_WALL, Items.STONE_BRICKS);

        createStairsRecipe(DecoBlocks.PACKED_MUD_STAIRS, Ingredient.ofItems(Items.PACKED_MUD))
                .criterion(hasItem(Items.PACKED_MUD),conditionsFromItem(Items.PACKED_MUD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PACKED_MUD_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_MUD_SLAB, Items.PACKED_MUD);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PACKED_MUD_WALL, Items.PACKED_MUD);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.RED_NETHER_BRICK_FENCE)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.RED_NETHER_BRICKS)
                .criterion(hasItem(Items.NETHER_BRICK),
                        conditionsFromItem(Items.NETHER_BRICK))
                .criterion(hasItem(Items.RED_NETHER_BRICKS),
                        conditionsFromItem(Items.RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RED_NETHER_BRICK_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.NETHER_BRICKS)
                .criterion(hasItem(Items.NETHER_BRICK),
                        conditionsFromItem(Items.NETHER_BRICK))
                .criterion(hasItem(Items.NETHER_BRICKS),
                        conditionsFromItem(Items.NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.NETHER_BRICK_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.RED_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.RED_NETHER_BRICKS)
                .criterion(hasItem(Items.NETHER_BRICK),
                        conditionsFromItem(Items.NETHER_BRICK))
                .criterion(hasItem(Items.RED_NETHER_BRICKS),
                        conditionsFromItem(Items.RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE)));

        createStairsRecipe(DecoBlocks.NETHERRACK_STAIRS, Ingredient.ofItems(Items.NETHERRACK))
                .criterion(hasItem(Items.NETHERRACK),conditionsFromItem(Items.NETHERRACK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.NETHERRACK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.NETHERRACK_STAIRS, Items.NETHERRACK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.NETHERRACK_SLAB, Items.NETHERRACK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.NETHERRACK_SLAB, Items.NETHERRACK,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.NETHERRACK_WALL, Items.NETHERRACK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.NETHERRACK_WALL, Items.NETHERRACK);

        createStairsRecipe(DecoBlocks.MAGMA_STAIRS, Ingredient.ofItems(Items.MAGMA_BLOCK))
                .criterion(hasItem(Items.MAGMA_BLOCK),conditionsFromItem(Items.MAGMA_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGMA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_STAIRS, Items.MAGMA_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MAGMA_SLAB, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_SLAB, Items.MAGMA_BLOCK,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.MAGMA_WALL, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_WALL, Items.MAGMA_BLOCK);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICKS, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICKS, Items.MAGMA_BLOCK);

        createStairsRecipe(DecoBlocks.MAGMA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.MAGMA_BRICKS))
                .criterion(hasItem(DecoBlocks.MAGMA_BRICKS),conditionsFromItem(DecoBlocks.MAGMA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGMA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_STAIRS, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_STAIRS, DecoBlocks.MAGMA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MAGMA_BRICK_SLAB, DecoBlocks.MAGMA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_SLAB, Items.MAGMA_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_SLAB, DecoBlocks.MAGMA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.MAGMA_BRICK_WALL, DecoBlocks.MAGMA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_WALL, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_WALL, DecoBlocks.MAGMA_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_MAGMA_BRICKS, DecoBlocks.MAGMA_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_MAGMA_BRICKS, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_MAGMA_BRICKS, DecoBlocks.MAGMA_BRICKS);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.BLACKSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE);

        createStairsRecipe(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_BLACKSTONE_TILES))
                .criterion(hasItem(DecoBlocks.POLISHED_BLACKSTONE_TILES),conditionsFromItem(DecoBlocks.POLISHED_BLACKSTONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, DecoBlocks.POLISHED_BLACKSTONE_TILES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.POLISHED_BLACKSTONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.POLISHED_BLACKSTONE_TILES,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.POLISHED_BLACKSTONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.POLISHED_BLACKSTONE_TILES);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Items.BLACKSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Items.BLACKSTONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Items.BLACKSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Items.POLISHED_BLACKSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Items.POLISHED_BLACKSTONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Items.POLISHED_BLACKSTONE);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Items.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Items.POLISHED_BLACKSTONE_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Items.POLISHED_BLACKSTONE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_GLIDED_BLACKSTONE,2)
                .pattern("P#")
                .pattern("#P")
                .input('P', Items.POLISHED_BLACKSTONE)
                .input('#', Items.GILDED_BLACKSTONE)
                .criterion(hasItem(Items.POLISHED_BLACKSTONE),
                        conditionsFromItem(Items.POLISHED_BLACKSTONE))
                .criterion(hasItem(Items.GILDED_BLACKSTONE),
                        conditionsFromItem(Items.GILDED_BLACKSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_GLIDED_BLACKSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_GLIDED_BLACKSTONE)
                .pattern("###")
                .pattern("#C#")
                .pattern("###")
                .input('C', Items.CHISELED_POLISHED_BLACKSTONE)
                .input('#', DecoBlocks.POLISHED_GLIDED_BLACKSTONE)
                .criterion(hasItem(Items.CHISELED_POLISHED_BLACKSTONE),
                        conditionsFromItem(Items.CHISELED_POLISHED_BLACKSTONE))
                .criterion(hasItem(DecoBlocks.POLISHED_GLIDED_BLACKSTONE),
                        conditionsFromItem(DecoBlocks.POLISHED_GLIDED_BLACKSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CHISELED_GLIDED_BLACKSTONE)));

        createStairsRecipe(DecoBlocks.SNOW_STAIRS, Ingredient.ofItems(Items.SNOW_BLOCK))
                .criterion(hasItem(Items.SNOW_BLOCK),conditionsFromItem(Items.SNOW_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SNOW_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SNOW_SLAB, Items.SNOW_BLOCK);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.SNOW_WALL, Items.SNOW_BLOCK);

        createStairsRecipe(DecoBlocks.PACKED_ICE_STAIRS, Ingredient.ofItems(Items.PACKED_ICE))
                .criterion(hasItem(Items.PACKED_ICE),conditionsFromItem(Items.PACKED_ICE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PACKED_ICE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_ICE_STAIRS, Items.PACKED_ICE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_ICE_SLAB, Items.PACKED_ICE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_ICE_SLAB, Items.PACKED_ICE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PACKED_ICE_WALL, Items.PACKED_ICE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_ICE_WALL, Items.PACKED_ICE);

        createStairsRecipe(DecoBlocks.BLUE_ICE_STAIRS, Ingredient.ofItems(Items.BLUE_ICE))
                .criterion(hasItem(Items.BLUE_ICE),conditionsFromItem(Items.BLUE_ICE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_ICE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_ICE_STAIRS, Items.BLUE_ICE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLUE_ICE_SLAB, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_ICE_SLAB, Items.BLUE_ICE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLUE_ICE_WALL, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_ICE_WALL, Items.BLUE_ICE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,DecoItems.SNOW_BRICK,8)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', Items.ICE)
                .input('#', Items.SNOWBALL)
                .criterion(hasItem(Items.ICE),
                        conditionsFromItem(Items.ICE))
                .criterion(hasItem(Items.SNOWBALL),
                        conditionsFromItem(Items.SNOWBALL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoItems.SNOW_BRICK)));

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SNOW_BRICKS, DecoItems.SNOW_BRICK);


        createStairsRecipe(DecoBlocks.SNOW_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.SNOW_BRICKS))
                .criterion(hasItem(DecoBlocks.SNOW_BRICKS),conditionsFromItem(DecoBlocks.SNOW_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SNOW_BRICK_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SNOW_BRICK_SLAB, DecoBlocks.SNOW_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.SNOW_BRICK_WALL, DecoBlocks.SNOW_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_SNOW_BRICKS)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('S', Items.SNOWBALL)
                .input('#', DecoItems.SNOW_BRICK)
                .criterion(hasItem(Items.SNOWBALL),
                        conditionsFromItem(Items.SNOWBALL))
                .criterion(hasItem(DecoItems.SNOW_BRICK),
                        conditionsFromItem(DecoItems.SNOW_BRICK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CHISELED_SNOW_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICKS)
                .pattern("/#")
                .pattern("#/")
                .input('/', Items.BLUE_ICE)
                .input('#', Items.PACKED_ICE)
                .criterion(hasItem(Items.BLUE_ICE),
                        conditionsFromItem(Items.BLUE_ICE))
                .criterion(hasItem(Items.PACKED_ICE),
                        conditionsFromItem(Items.PACKED_ICE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ICE_BRICKS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICKS, Items.BLUE_ICE);

        createStairsRecipe(DecoBlocks.ICE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.ICE_BRICKS))
                .criterion(hasItem(DecoBlocks.ICE_BRICKS),conditionsFromItem(DecoBlocks.ICE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ICE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_STAIRS, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_STAIRS, DecoBlocks.ICE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ICE_BRICK_SLAB, DecoBlocks.ICE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_SLAB, Items.BLUE_ICE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_SLAB, DecoBlocks.ICE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.ICE_BRICK_WALL, DecoBlocks.ICE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_WALL, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_WALL, DecoBlocks.ICE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.BLACK_ICE)
                .pattern("/#/")
                .pattern("#/#")
                .pattern("/#/")
                .input('/', Items.BLUE_ICE)
                .input('#', Items.PACKED_ICE)
                .criterion(hasItem(Items.BLUE_ICE),
                        conditionsFromItem(Items.BLUE_ICE))
                .criterion(hasItem(Items.PACKED_ICE),
                        conditionsFromItem(Items.PACKED_ICE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACK_ICE)));

        createStairsRecipe(DecoBlocks.CUT_SANDSTONE_STAIRS, Ingredient.ofItems(Items.CUT_SANDSTONE))
                .criterion(hasItem(Items.CUT_SANDSTONE),conditionsFromItem(Items.CUT_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_STAIRS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_STAIRS, Items.CUT_SANDSTONE);

        createStairsRecipe(DecoBlocks.CUT_RED_SANDSTONE_STAIRS, Ingredient.ofItems(Items.CUT_RED_SANDSTONE))
                .criterion(hasItem(Items.CUT_RED_SANDSTONE),conditionsFromItem(Items.CUT_RED_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_RED_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_STAIRS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_STAIRS, Items.CUT_RED_SANDSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_SANDSTONE_WALL, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_WALL, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_WALL, Items.CUT_SANDSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_RED_SANDSTONE_WALL, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_WALL, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_WALL, Items.CUT_RED_SANDSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_SANDSTONE_WALL, Items.SMOOTH_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_SANDSTONE_WALL, Items.SMOOTH_SANDSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_RED_SANDSTONE_WALL, Items.SMOOTH_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_RED_SANDSTONE_WALL, Items.SMOOTH_RED_SANDSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICKS, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICKS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICKS, Items.CUT_SANDSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICKS, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICKS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICKS, Items.CUT_RED_SANDSTONE);

        createStairsRecipe(DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_SANDSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.CUT_SANDSTONE_BRICKS),conditionsFromItem(DecoBlocks.CUT_SANDSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, DecoBlocks.CUT_SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_SANDSTONE_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_WALL, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_WALL, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_SANDSTONE_BRICKS);

        createStairsRecipe(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_RED_SANDSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.CUT_RED_SANDSTONE_BRICKS),conditionsFromItem(DecoBlocks.CUT_RED_SANDSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_PLANKS,2)
                .input(Items.CACTUS)
                .criterion(hasItem(Items.CACTUS),
                        conditionsFromItem(Items.CACTUS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CACTUS_PLANKS)));

        createStairsRecipe(DecoBlocks.CACTUS_PLANK_STAIRS, Ingredient.ofItems(DecoBlocks.CACTUS_PLANKS))
                .criterion(hasItem(DecoBlocks.CACTUS_PLANKS),conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CACTUS_PLANK_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CACTUS_PLANK_SLAB, DecoBlocks.CACTUS_PLANKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.CACTUS_PLANK_FENCE)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .criterion(hasItem(DecoBlocks.CACTUS_PLANKS),
                        conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CACTUS_PLANK_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.CACTUS_PLANK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .criterion(hasItem(DecoBlocks.CACTUS_PLANKS),
                        conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CACTUS_PLANK_FENCE_GATE)));

        offerPressurePlateRecipe(exporter, DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE, DecoBlocks.CACTUS_PLANKS);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.CACTUS_PLANK_BUTTON)
                .input(DecoBlocks.CACTUS_PLANKS)
                .criterion(hasItem(DecoBlocks.CACTUS_PLANKS),
                        conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CACTUS_PLANK_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .criterion(hasItem(DecoBlocks.CACTUS_PLANKS),
                        conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CACTUS_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .criterion(hasItem(DecoBlocks.CACTUS_PLANKS),
                        conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CACTUS_TRAPDOOR)));

        createSignRecipe(DecoItems.CACTUS_SIGN, Ingredient.ofItems(DecoBlocks.CACTUS_PLANKS))
                .criterion(hasItem(DecoBlocks.CACTUS_PLANKS),conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoItems.CACTUS_SIGN)));

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE, Items.PRISMARINE_CRYSTALS);

        createStairsRecipe(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS, Ingredient.ofItems(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .criterion(hasItem(DecoBlocks.CRYSTALLIZED_PRISMARINE),conditionsFromItem(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.CRYSTALLIZED_PRISMARINE),RecipeCategory.BUILDING_BLOCKS, Items.SEA_LANTERN,
                        0.35f, 200).criterion(hasItem(DecoBlocks.CRYSTALLIZED_PRISMARINE), conditionsFromItem(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .offerTo(exporter, new Identifier("sea_lantern_from_smelting"));

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        createStairsRecipe(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS))
                .criterion(hasItem(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS),conditionsFromItem(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_PRISMARINE,8)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('#', DecoBlocks.CRYSTALLIZED_PRISMARINE)
                .input('I', Items.AMETHYST_SHARD)
                .criterion(hasItem(DecoBlocks.CRYSTALLIZED_PRISMARINE),
                        conditionsFromItem(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .criterion(hasItem(Items.AMETHYST_SHARD),
                        conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_PRISMARINE)));

        createStairsRecipe(DecoBlocks.LIGHT_PRISMARINE_STAIRS, Ingredient.ofItems(DecoBlocks.LIGHT_PRISMARINE))
                .criterion(hasItem(DecoBlocks.LIGHT_PRISMARINE),conditionsFromItem(DecoBlocks.LIGHT_PRISMARINE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_PRISMARINE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_PRISMARINE_STAIRS, DecoBlocks.LIGHT_PRISMARINE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIGHT_PRISMARINE_SLAB, DecoBlocks.LIGHT_PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_PRISMARINE_SLAB, DecoBlocks.LIGHT_PRISMARINE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_PRISMARINE_WALL, DecoBlocks.LIGHT_PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_PRISMARINE_WALL, DecoBlocks.LIGHT_PRISMARINE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_PRISMARINE_BRICKS)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('#', Items.PRISMARINE_SHARD)
                .input('I', Items.PRISMARINE_CRYSTALS)
                .criterion(hasItem(Items.PRISMARINE_SHARD),
                        conditionsFromItem(Items.PRISMARINE_SHARD))
                .criterion(hasItem(Items.PRISMARINE_CRYSTALS),
                        conditionsFromItem(Items.PRISMARINE_CRYSTALS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CHISELED_PRISMARINE_BRICKS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('#', Items.PRISMARINE_CRYSTALS)
                .input('I', Items.PRISMARINE_SHARD)
                .criterion(hasItem(Items.PRISMARINE_CRYSTALS),
                        conditionsFromItem(Items.PRISMARINE_CRYSTALS))
                .criterion(hasItem(Items.PRISMARINE_SHARD),
                        conditionsFromItem(Items.PRISMARINE_SHARD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BLOCK)
                .pattern("#I")
                .pattern("I#")
                .input('#', Items.PRISMARINE_SHARD)
                .input('I', DecoItems.BUBBLE_ORB)
                .criterion(hasItem(Items.PRISMARINE_SHARD),
                        conditionsFromItem(Items.PRISMARINE_SHARD))
                .criterion(hasItem(DecoItems.BUBBLE_ORB),
                        conditionsFromItem(DecoItems.BUBBLE_ORB))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BUBBLE_BLOCK)));

        createStairsRecipe(DecoBlocks.BUBBLE_STAIRS, Ingredient.ofItems(DecoBlocks.BUBBLE_BLOCK))
                .criterion(hasItem(DecoBlocks.BUBBLE_BLOCK),conditionsFromItem(DecoBlocks.BUBBLE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BUBBLE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_STAIRS, DecoBlocks.BUBBLE_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BUBBLE_SLAB, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_SLAB, DecoBlocks.BUBBLE_BLOCK);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BUBBLE_WALL, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_WALL, DecoBlocks.BUBBLE_BLOCK);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICKS, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICKS, DecoBlocks.BUBBLE_BLOCK);

        createStairsRecipe(DecoBlocks.BUBBLE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BUBBLE_BRICKS))
                .criterion(hasItem(DecoBlocks.BUBBLE_BRICKS),conditionsFromItem(DecoBlocks.BUBBLE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BUBBLE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_STAIRS, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_STAIRS, DecoBlocks.BUBBLE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BUBBLE_BRICK_SLAB, DecoBlocks.BUBBLE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_SLAB, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_SLAB, DecoBlocks.BUBBLE_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BUBBLE_BRICK_WALL, DecoBlocks.BUBBLE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_WALL, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_WALL, DecoBlocks.BUBBLE_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BUBBLE_BRICKS, DecoBlocks.BUBBLE_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BUBBLE_BRICKS, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BUBBLE_BRICKS, DecoBlocks.BUBBLE_BRICKS);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE, Items.SOUL_SOIL);

        createStairsRecipe(DecoBlocks.SOUL_SOILSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE))
                .criterion(hasItem(DecoBlocks.SOUL_SOILSTONE),conditionsFromItem(DecoBlocks.SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SOUL_SOILSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_STAIRS, DecoBlocks.SOUL_SOILSTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);

        createStairsRecipe(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_SOUL_SOILSTONE))
                .criterion(hasItem(DecoBlocks.CUT_SOUL_SOILSTONE),conditionsFromItem(DecoBlocks.CUT_SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS, DecoBlocks.CUT_SOUL_SOILSTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_SOUL_SOILSTONE_WALL, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_WALL, DecoBlocks.CUT_SOUL_SOILSTONE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE),RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_SOUL_SOILSTONE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.SOUL_SOILSTONE), conditionsFromItem(DecoBlocks.SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier("smooth_soul_soilstone_from_smelting"));

        createStairsRecipe(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_SOUL_SOILSTONE))
                .criterion(hasItem(DecoBlocks.SMOOTH_SOUL_SOILSTONE),conditionsFromItem(DecoBlocks.SMOOTH_SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS, DecoBlocks.SMOOTH_SOUL_SOILSTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB, DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB, DecoBlocks.SMOOTH_SOUL_SOILSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL, DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL, DecoBlocks.SMOOTH_SOUL_SOILSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS, DecoBlocks.CUT_SOUL_SOILSTONE);

        createStairsRecipe(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS),conditionsFromItem(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.QUARTZ_WALL, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_WALL, Items.QUARTZ_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_QUARTZ_WALL, Items.SMOOTH_QUARTZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_QUARTZ_WALL, Items.SMOOTH_QUARTZ);

        createStairsRecipe(DecoBlocks.QUARTZ_BRICK_STAIRS, Ingredient.ofItems(Items.QUARTZ_BRICKS))
                .criterion(hasItem(Items.QUARTZ_BRICKS),conditionsFromItem(Items.QUARTZ_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.QUARTZ_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_STAIRS, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_STAIRS, Items.QUARTZ_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.QUARTZ_BRICK_SLAB, Items.QUARTZ_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_SLAB, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_SLAB, Items.QUARTZ_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.QUARTZ_BRICK_WALL, Items.QUARTZ_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_WALL, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_WALL, Items.QUARTZ_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ)
                .pattern("#Q")
                .pattern("Q#")
                .input('#', Items.QUARTZ_BLOCK)
                .input('Q', Items.QUARTZ)
                .criterion(hasItem(Items.QUARTZ_BLOCK),
                        conditionsFromItem(Items.QUARTZ_BLOCK))
                .criterion(hasItem(Items.QUARTZ),
                        conditionsFromItem(Items.QUARTZ))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_QUARTZ)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ, Items.QUARTZ_BLOCK);

        createStairsRecipe(DecoBlocks.CUT_QUARTZ_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_QUARTZ))
                .criterion(hasItem(DecoBlocks.CUT_QUARTZ),conditionsFromItem(DecoBlocks.CUT_QUARTZ))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_QUARTZ_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_STAIRS, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_STAIRS, DecoBlocks.CUT_QUARTZ);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_QUARTZ_SLAB, DecoBlocks.CUT_QUARTZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_SLAB, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_SLAB, DecoBlocks.CUT_QUARTZ);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_QUARTZ_WALL, DecoBlocks.CUT_QUARTZ);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_WALL, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_WALL, DecoBlocks.CUT_QUARTZ);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,Items.WARPED_WART_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', DecoItems.WARPED_WART)
                .criterion(hasItem(DecoItems.WARPED_WART),
                        conditionsFromItem(DecoItems.WARPED_WART))
                .offerTo(exporter, new Identifier(getRecipeName(Items.WARPED_WART_BLOCK)));

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_RED_NETHER_BRICKS, Items.RED_NETHER_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_RED_NETHER_BRICKS, Items.RED_NETHER_BRICKS);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRACKED_RED_NETHER_BRICKS,
                        0.1f, 200).criterion(hasItem(Items.RED_NETHER_BRICKS), conditionsFromItem(Items.RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier("cracked_red_nether_bricks_from_smelting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_NETHER_BRICKS)
                .pattern("#N")
                .pattern("N#")
                .input('#', DecoItems.WARPED_WART)
                .input('N', Items.NETHER_BRICK)
                .criterion(hasItem(DecoItems.WARPED_WART),
                        conditionsFromItem(DecoItems.WARPED_WART))
                .criterion(hasItem(Items.NETHER_BRICK),
                        conditionsFromItem(Items.NETHER_BRICK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_NETHER_BRICKS)));

        createStairsRecipe(DecoBlocks.BLUE_NETHER_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICKS))
                .criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICKS),conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_NETHER_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_NETHER_BRICK_STAIRS, DecoBlocks.BLUE_NETHER_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLUE_NETHER_BRICK_SLAB, DecoBlocks.BLUE_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_NETHER_BRICK_SLAB, DecoBlocks.BLUE_NETHER_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLUE_NETHER_BRICK_WALL, DecoBlocks.BLUE_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_NETHER_BRICK_WALL, DecoBlocks.BLUE_NETHER_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.BLUE_NETHER_BRICK_FENCE)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.BLUE_NETHER_BRICKS)
                .criterion(hasItem(Items.NETHER_BRICK),
                        conditionsFromItem(Items.NETHER_BRICK))
                .criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICKS),
                        conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_NETHER_BRICK_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.BLUE_NETHER_BRICKS)
                .criterion(hasItem(Items.NETHER_BRICK),
                        conditionsFromItem(Items.NETHER_BRICK))
                .criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICKS),
                        conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE)));

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BLUE_NETHER_BRICKS, DecoBlocks.BLUE_NETHER_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BLUE_NETHER_BRICKS, DecoBlocks.BLUE_NETHER_BRICKS);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICKS), conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.ENDER_PEARL)
                .pattern(" # ")
                .pattern("#F#")
                .pattern(" # ")
                .input('#', DecoItems.WARPED_WART)
                .input('F', Items.CHORUS_FRUIT)
                .criterion(hasItem(DecoItems.WARPED_WART),
                        conditionsFromItem(DecoItems.WARPED_WART))
                .criterion(hasItem(Items.CHORUS_FRUIT),
                        conditionsFromItem(Items.CHORUS_FRUIT))
                .offerTo(exporter, new Identifier(getRecipeName(Items.ENDER_PEARL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.ENDER_EYE)
                .pattern(" # ")
                .pattern("#F#")
                .pattern(" #B")
                .input('#', DecoItems.WARPED_WART)
                .input('F', Items.CHORUS_FRUIT)
                .input('B', Items.BLAZE_POWDER)
                .criterion(hasItem(DecoItems.WARPED_WART),
                        conditionsFromItem(DecoItems.WARPED_WART))
                .criterion(hasItem(Items.CHORUS_FRUIT),
                        conditionsFromItem(Items.CHORUS_FRUIT))
                .criterion(hasItem(Items.BLAZE_POWDER),
                        conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(exporter, new Identifier("ender_eye_from_warped_wart"));

        createStairsRecipe(DecoBlocks.TERRACOTTA_STAIRS, Ingredient.ofItems(Items.TERRACOTTA))
                .criterion(hasItem(Items.TERRACOTTA),conditionsFromItem(Items.TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_STAIRS, Items.TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.TERRACOTTA_SLAB, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_SLAB, Items.TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.TERRACOTTA_WALL, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_WALL, Items.TERRACOTTA);

        createStairsRecipe(DecoBlocks.WHITE_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.WHITE_TERRACOTTA))
                .criterion(hasItem(Items.WHITE_TERRACOTTA),conditionsFromItem(Items.WHITE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WHITE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_STAIRS, Items.WHITE_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_TERRACOTTA_SLAB, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_SLAB, Items.WHITE_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.WHITE_TERRACOTTA_WALL, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_WALL, Items.WHITE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.BLACK_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.BLACK_TERRACOTTA))
                .criterion(hasItem(Items.BLACK_TERRACOTTA),conditionsFromItem(Items.BLACK_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACK_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_STAIRS, Items.BLACK_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_TERRACOTTA_SLAB, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_SLAB, Items.BLACK_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLACK_TERRACOTTA_WALL, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_WALL, Items.BLACK_TERRACOTTA);

        createStairsRecipe(DecoBlocks.GRAY_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.GRAY_TERRACOTTA))
                .criterion(hasItem(Items.GRAY_TERRACOTTA),conditionsFromItem(Items.GRAY_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GRAY_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_STAIRS, Items.GRAY_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRAY_TERRACOTTA_SLAB, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_SLAB, Items.GRAY_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.GRAY_TERRACOTTA_WALL, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_WALL, Items.GRAY_TERRACOTTA);

        createStairsRecipe(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.LIGHT_GRAY_TERRACOTTA))
                .criterion(hasItem(Items.LIGHT_GRAY_TERRACOTTA),conditionsFromItem(Items.LIGHT_GRAY_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Items.LIGHT_GRAY_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Items.LIGHT_GRAY_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Items.LIGHT_GRAY_TERRACOTTA);

        createStairsRecipe(DecoBlocks.BROWN_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.BROWN_TERRACOTTA))
                .criterion(hasItem(Items.BROWN_TERRACOTTA),conditionsFromItem(Items.BROWN_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BROWN_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_STAIRS, Items.BROWN_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BROWN_TERRACOTTA_SLAB, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_SLAB, Items.BROWN_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BROWN_TERRACOTTA_WALL, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_WALL, Items.BROWN_TERRACOTTA);

        createStairsRecipe(DecoBlocks.RED_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.RED_TERRACOTTA))
                .criterion(hasItem(Items.RED_TERRACOTTA),conditionsFromItem(Items.RED_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RED_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_STAIRS, Items.RED_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RED_TERRACOTTA_SLAB, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_SLAB, Items.RED_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.RED_TERRACOTTA_WALL, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_WALL, Items.RED_TERRACOTTA);

        createStairsRecipe(DecoBlocks.ORANGE_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.ORANGE_TERRACOTTA))
                .criterion(hasItem(Items.ORANGE_TERRACOTTA),conditionsFromItem(Items.ORANGE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ORANGE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_STAIRS, Items.ORANGE_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ORANGE_TERRACOTTA_SLAB, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_SLAB, Items.ORANGE_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.ORANGE_TERRACOTTA_WALL, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_WALL, Items.ORANGE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.YELLOW_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.YELLOW_TERRACOTTA))
                .criterion(hasItem(Items.YELLOW_TERRACOTTA),conditionsFromItem(Items.YELLOW_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.YELLOW_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_STAIRS, Items.YELLOW_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.YELLOW_TERRACOTTA_SLAB, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_SLAB, Items.YELLOW_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.YELLOW_TERRACOTTA_WALL, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_WALL, Items.YELLOW_TERRACOTTA);

        createStairsRecipe(DecoBlocks.LIME_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.LIME_TERRACOTTA))
                .criterion(hasItem(Items.LIME_TERRACOTTA),conditionsFromItem(Items.LIME_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIME_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_STAIRS, Items.LIME_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIME_TERRACOTTA_SLAB, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_SLAB, Items.LIME_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIME_TERRACOTTA_WALL, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_WALL, Items.LIME_TERRACOTTA);

        createStairsRecipe(DecoBlocks.GREEN_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.GREEN_TERRACOTTA))
                .criterion(hasItem(Items.GREEN_TERRACOTTA),conditionsFromItem(Items.GREEN_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GREEN_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_STAIRS, Items.GREEN_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GREEN_TERRACOTTA_SLAB, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_SLAB, Items.GREEN_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.GREEN_TERRACOTTA_WALL, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_WALL, Items.GREEN_TERRACOTTA);

        createStairsRecipe(DecoBlocks.CYAN_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.CYAN_TERRACOTTA))
                .criterion(hasItem(Items.CYAN_TERRACOTTA),conditionsFromItem(Items.CYAN_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CYAN_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_STAIRS, Items.CYAN_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CYAN_TERRACOTTA_SLAB, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_SLAB, Items.CYAN_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CYAN_TERRACOTTA_WALL, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_WALL, Items.CYAN_TERRACOTTA);

        createStairsRecipe(DecoBlocks.BLUE_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.BLUE_TERRACOTTA))
                .criterion(hasItem(Items.BLUE_TERRACOTTA),conditionsFromItem(Items.BLUE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_STAIRS, Items.BLUE_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLUE_TERRACOTTA_SLAB, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_SLAB, Items.BLUE_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLUE_TERRACOTTA_WALL, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_WALL, Items.BLUE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.LIGHT_BLUE_TERRACOTTA))
                .criterion(hasItem(Items.LIGHT_BLUE_TERRACOTTA),conditionsFromItem(Items.LIGHT_BLUE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Items.LIGHT_BLUE_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Items.LIGHT_BLUE_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Items.LIGHT_BLUE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.PURPLE_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.PURPLE_TERRACOTTA))
                .criterion(hasItem(Items.PURPLE_TERRACOTTA),conditionsFromItem(Items.PURPLE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PURPLE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_STAIRS, Items.PURPLE_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPLE_TERRACOTTA_SLAB, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_SLAB, Items.PURPLE_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PURPLE_TERRACOTTA_WALL, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_WALL, Items.PURPLE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.MAGENTA_TERRACOTTA))
                .criterion(hasItem(Items.MAGENTA_TERRACOTTA),conditionsFromItem(Items.MAGENTA_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_STAIRS, Items.MAGENTA_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MAGENTA_TERRACOTTA_SLAB, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_SLAB, Items.MAGENTA_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.MAGENTA_TERRACOTTA_WALL, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_WALL, Items.MAGENTA_TERRACOTTA);

        createStairsRecipe(DecoBlocks.PINK_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.PINK_TERRACOTTA))
                .criterion(hasItem(Items.PINK_TERRACOTTA),conditionsFromItem(Items.PINK_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PINK_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_STAIRS, Items.PINK_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PINK_TERRACOTTA_SLAB, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_SLAB, Items.PINK_TERRACOTTA);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PINK_TERRACOTTA_WALL, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_WALL, Items.PINK_TERRACOTTA);

        createStairsRecipe(DecoBlocks.WHITE_CONCRETE_STAIRS, Ingredient.ofItems(Items.WHITE_CONCRETE))
                .criterion(hasItem(Items.WHITE_CONCRETE),conditionsFromItem(Items.WHITE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WHITE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_STAIRS, Items.WHITE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_CONCRETE_SLAB, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_SLAB, Items.WHITE_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.WHITE_CONCRETE_WALL, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_WALL, Items.WHITE_CONCRETE);

        createStairsRecipe(DecoBlocks.BLACK_CONCRETE_STAIRS, Ingredient.ofItems(Items.BLACK_CONCRETE))
                .criterion(hasItem(Items.BLACK_CONCRETE),conditionsFromItem(Items.BLACK_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_STAIRS, Items.BLACK_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_CONCRETE_SLAB, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_SLAB, Items.BLACK_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLACK_CONCRETE_WALL, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_WALL, Items.BLACK_CONCRETE);

        createStairsRecipe(DecoBlocks.GRAY_CONCRETE_STAIRS, Ingredient.ofItems(Items.GRAY_CONCRETE))
                .criterion(hasItem(Items.GRAY_CONCRETE),conditionsFromItem(Items.GRAY_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_STAIRS, Items.GRAY_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRAY_CONCRETE_SLAB, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_SLAB, Items.GRAY_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.GRAY_CONCRETE_WALL, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_WALL, Items.GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.ofItems(Items.LIGHT_GRAY_CONCRETE))
                .criterion(hasItem(Items.LIGHT_GRAY_CONCRETE),conditionsFromItem(Items.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Items.LIGHT_GRAY_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB, Items.LIGHT_GRAY_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_GRAY_CONCRETE_WALL, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_WALL, Items.LIGHT_GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.BROWN_CONCRETE_STAIRS, Ingredient.ofItems(Items.BROWN_CONCRETE))
                .criterion(hasItem(Items.BROWN_CONCRETE),conditionsFromItem(Items.BROWN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BROWN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_STAIRS, Items.BROWN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BROWN_CONCRETE_SLAB, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_SLAB, Items.BROWN_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BROWN_CONCRETE_WALL, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_WALL, Items.BROWN_CONCRETE);

        createStairsRecipe(DecoBlocks.RED_CONCRETE_STAIRS, Ingredient.ofItems(Items.RED_CONCRETE))
                .criterion(hasItem(Items.RED_CONCRETE),conditionsFromItem(Items.RED_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RED_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_STAIRS, Items.RED_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RED_CONCRETE_SLAB, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_SLAB, Items.RED_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.RED_CONCRETE_WALL, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_WALL, Items.RED_CONCRETE);

        createStairsRecipe(DecoBlocks.ORANGE_CONCRETE_STAIRS, Ingredient.ofItems(Items.ORANGE_CONCRETE))
                .criterion(hasItem(Items.ORANGE_CONCRETE),conditionsFromItem(Items.ORANGE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ORANGE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_STAIRS, Items.ORANGE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ORANGE_CONCRETE_SLAB, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_SLAB, Items.ORANGE_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.ORANGE_CONCRETE_WALL, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_WALL, Items.ORANGE_CONCRETE);

        createStairsRecipe(DecoBlocks.YELLOW_CONCRETE_STAIRS, Ingredient.ofItems(Items.YELLOW_CONCRETE))
                .criterion(hasItem(Items.YELLOW_CONCRETE),conditionsFromItem(Items.YELLOW_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.YELLOW_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_STAIRS, Items.YELLOW_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.YELLOW_CONCRETE_SLAB, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_SLAB, Items.YELLOW_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.YELLOW_CONCRETE_WALL, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_WALL, Items.YELLOW_CONCRETE);

        createStairsRecipe(DecoBlocks.LIME_CONCRETE_STAIRS, Ingredient.ofItems(Items.LIME_CONCRETE))
                .criterion(hasItem(Items.LIME_CONCRETE),conditionsFromItem(Items.LIME_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIME_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_STAIRS, Items.LIME_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIME_CONCRETE_SLAB, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_SLAB, Items.LIME_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIME_CONCRETE_WALL, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_WALL, Items.LIME_CONCRETE);

        createStairsRecipe(DecoBlocks.GREEN_CONCRETE_STAIRS, Ingredient.ofItems(Items.GREEN_CONCRETE))
                .criterion(hasItem(Items.GREEN_CONCRETE),conditionsFromItem(Items.GREEN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GREEN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_STAIRS, Items.GREEN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GREEN_CONCRETE_SLAB, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_SLAB, Items.GREEN_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.GREEN_CONCRETE_WALL, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_WALL, Items.GREEN_CONCRETE);

        createStairsRecipe(DecoBlocks.CYAN_CONCRETE_STAIRS, Ingredient.ofItems(Items.CYAN_CONCRETE))
                .criterion(hasItem(Items.CYAN_CONCRETE),conditionsFromItem(Items.CYAN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CYAN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_STAIRS, Items.CYAN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CYAN_CONCRETE_SLAB, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_SLAB, Items.CYAN_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CYAN_CONCRETE_WALL, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_WALL, Items.CYAN_CONCRETE);

        createStairsRecipe(DecoBlocks.BLUE_CONCRETE_STAIRS, Ingredient.ofItems(Items.BLUE_CONCRETE))
                .criterion(hasItem(Items.BLUE_CONCRETE),conditionsFromItem(Items.BLUE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_STAIRS, Items.BLUE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLUE_CONCRETE_SLAB, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_SLAB, Items.BLUE_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLUE_CONCRETE_WALL, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_WALL, Items.BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.ofItems(Items.LIGHT_BLUE_CONCRETE))
                .criterion(hasItem(Items.LIGHT_BLUE_CONCRETE),conditionsFromItem(Items.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Items.LIGHT_BLUE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB, Items.LIGHT_BLUE_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_BLUE_CONCRETE_WALL, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_WALL, Items.LIGHT_BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.PURPLE_CONCRETE_STAIRS, Ingredient.ofItems(Items.PURPLE_CONCRETE))
                .criterion(hasItem(Items.PURPLE_CONCRETE),conditionsFromItem(Items.PURPLE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PURPLE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_STAIRS, Items.PURPLE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPLE_CONCRETE_SLAB, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_SLAB, Items.PURPLE_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PURPLE_CONCRETE_WALL, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_WALL, Items.PURPLE_CONCRETE);

        createStairsRecipe(DecoBlocks.MAGENTA_CONCRETE_STAIRS, Ingredient.ofItems(Items.MAGENTA_CONCRETE))
                .criterion(hasItem(Items.MAGENTA_CONCRETE),conditionsFromItem(Items.MAGENTA_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGENTA_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_STAIRS, Items.MAGENTA_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MAGENTA_CONCRETE_SLAB, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_SLAB, Items.MAGENTA_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.MAGENTA_CONCRETE_WALL, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_WALL, Items.MAGENTA_CONCRETE);

        createStairsRecipe(DecoBlocks.PINK_CONCRETE_STAIRS, Ingredient.ofItems(Items.PINK_CONCRETE))
                .criterion(hasItem(Items.PINK_CONCRETE),conditionsFromItem(Items.PINK_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PINK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_STAIRS, Items.PINK_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PINK_CONCRETE_SLAB, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_SLAB, Items.PINK_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PINK_CONCRETE_WALL, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_WALL, Items.PINK_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICKS, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICKS, Items.TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.WHITE_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.WHITE_DYE),
                        conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier("dye_white_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICKS, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICKS, Items.WHITE_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.LIGHT_GRAY_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.LIGHT_GRAY_DYE),
                        conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .offerTo(exporter, new Identifier("dye_light_gray_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, Items.LIGHT_GRAY_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.GRAY_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.GRAY_DYE),
                        conditionsFromItem(Items.GRAY_DYE))
                .offerTo(exporter, new Identifier("dye_gray_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICKS, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICKS, Items.GRAY_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.BLACK_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.BLACK_DYE),
                        conditionsFromItem(Items.BLACK_DYE))
                .offerTo(exporter, new Identifier("dye_black_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICKS, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICKS, Items.BLACK_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.BROWN_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.BROWN_DYE),
                        conditionsFromItem(Items.BROWN_DYE))
                .offerTo(exporter, new Identifier("dye_brown_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICKS, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICKS, Items.BROWN_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.RED_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.RED_DYE),
                        conditionsFromItem(Items.RED_DYE))
                .offerTo(exporter, new Identifier("dye_red_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICKS, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICKS, Items.RED_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.ORANGE_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.ORANGE_DYE),
                        conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, new Identifier("dye_orange_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICKS, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICKS, Items.ORANGE_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.YELLOW_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.YELLOW_DYE),
                        conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier("dye_yellow_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICKS, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICKS, Items.YELLOW_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.LIME_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.LIME_DYE),
                        conditionsFromItem(Items.LIME_DYE))
                .offerTo(exporter, new Identifier("dye_lime_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICKS, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICKS, Items.LIME_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.GREEN_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.GREEN_DYE),
                        conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier("dye_green_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICKS, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICKS, Items.GREEN_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.CYAN_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.CYAN_DYE),
                        conditionsFromItem(Items.CYAN_DYE))
                .offerTo(exporter, new Identifier("dye_cyan_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICKS, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICKS, Items.CYAN_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.LIGHT_BLUE_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.LIGHT_BLUE_DYE),
                        conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .offerTo(exporter, new Identifier("dye_light_blue_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, Items.LIGHT_BLUE_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.BLUE_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.BLUE_DYE),
                        conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier("dye_blue_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICKS, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICKS, Items.BLUE_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.PURPLE_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.PURPLE_DYE),
                        conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier("dye_purple_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICKS, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICKS, Items.PURPLE_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.MAGENTA_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.MAGENTA_DYE),
                        conditionsFromItem(Items.MAGENTA_DYE))
                .offerTo(exporter, new Identifier("dye_magenta_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICKS, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICKS, Items.MAGENTA_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.PINK_DYE)
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(Items.PINK_DYE),
                        conditionsFromItem(Items.PINK_DYE))
                .offerTo(exporter, new Identifier("dye_pink_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICKS, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICKS, Items.PINK_TERRACOTTA);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE, Items.WHITE_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE, Items.LIGHT_GRAY_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE, Items.GRAY_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE, Items.BLACK_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE, Items.BROWN_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE, Items.RED_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE, Items.ORANGE_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE, Items.YELLOW_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE, Items.LIME_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE, Items.GREEN_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE, Items.CYAN_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE, Items.LIGHT_BLUE_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE, Items.BLUE_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE, Items.PURPLE_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE, Items.MAGENTA_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE, Items.PINK_CONCRETE);

        createStairsRecipe(DecoBlocks.TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_STAIRS, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_STAIRS, DecoBlocks.TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.TERRACOTTA_BRICK_SLAB, DecoBlocks.TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_SLAB, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_SLAB, DecoBlocks.TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.TERRACOTTA_BRICK_WALL, DecoBlocks.TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_WALL, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_WALL, DecoBlocks.TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.WHITE_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.WHITE_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.WHITE_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.WHITE_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB, DecoBlocks.WHITE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB, DecoBlocks.WHITE_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL, DecoBlocks.WHITE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL, DecoBlocks.WHITE_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BLACK_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.BLACK_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.BLACK_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS, DecoBlocks.BLACK_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLACK_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLACK_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL, DecoBlocks.BLACK_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL, DecoBlocks.BLACK_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.GRAY_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.GRAY_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.GRAY_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS, DecoBlocks.GRAY_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.GRAY_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.GRAY_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.GRAY_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.GRAY_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BROWN_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.BROWN_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.BROWN_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS, DecoBlocks.BROWN_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB, DecoBlocks.BROWN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB, DecoBlocks.BROWN_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL, DecoBlocks.BROWN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL, DecoBlocks.BROWN_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.RED_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.RED_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.RED_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS, DecoBlocks.RED_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RED_TERRACOTTA_BRICK_SLAB, DecoBlocks.RED_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_SLAB, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_SLAB, DecoBlocks.RED_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.RED_TERRACOTTA_BRICK_WALL, DecoBlocks.RED_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_WALL, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_WALL, DecoBlocks.RED_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.ORANGE_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.ORANGE_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.ORANGE_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.YELLOW_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.YELLOW_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.YELLOW_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.LIME_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.LIME_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.LIME_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS, DecoBlocks.LIME_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIME_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIME_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIME_TERRACOTTA_BRICK_WALL, DecoBlocks.LIME_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_WALL, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_WALL, DecoBlocks.LIME_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.GREEN_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.GREEN_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.GREEN_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS, DecoBlocks.GREEN_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB, DecoBlocks.GREEN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB, DecoBlocks.GREEN_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL, DecoBlocks.GREEN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL, DecoBlocks.GREEN_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CYAN_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.CYAN_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.CYAN_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS, DecoBlocks.CYAN_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB, DecoBlocks.CYAN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB, DecoBlocks.CYAN_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL, DecoBlocks.CYAN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL, DecoBlocks.CYAN_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BLUE_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.BLUE_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.BLUE_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.BLUE_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLUE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLUE_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.BLUE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.BLUE_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.PURPLE_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.PURPLE_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.PURPLE_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.PINK_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.PINK_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.PINK_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS, DecoBlocks.PINK_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB, DecoBlocks.PINK_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB, DecoBlocks.PINK_TERRACOTTA_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PINK_TERRACOTTA_BRICK_WALL, DecoBlocks.PINK_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_WALL, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_WALL, DecoBlocks.PINK_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.CUT_WHITE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_WHITE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_WHITE_CONCRETE),conditionsFromItem(DecoBlocks.CUT_WHITE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_WHITE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_STAIRS, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_STAIRS, DecoBlocks.CUT_WHITE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_WHITE_CONCRETE_SLAB, DecoBlocks.CUT_WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_SLAB, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_SLAB, DecoBlocks.CUT_WHITE_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_WHITE_CONCRETE_WALL, DecoBlocks.CUT_WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_WALL, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_WALL, DecoBlocks.CUT_WHITE_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_BLACK_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_BLACK_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_BLACK_CONCRETE),conditionsFromItem(DecoBlocks.CUT_BLACK_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_BLACK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_STAIRS, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_STAIRS, DecoBlocks.CUT_BLACK_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_BLACK_CONCRETE_SLAB, DecoBlocks.CUT_BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_SLAB, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_SLAB, DecoBlocks.CUT_BLACK_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_BLACK_CONCRETE_WALL, DecoBlocks.CUT_BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_WALL, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_WALL, DecoBlocks.CUT_BLACK_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_GRAY_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_GRAY_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_GRAY_CONCRETE),conditionsFromItem(DecoBlocks.CUT_GRAY_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_STAIRS, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_STAIRS, DecoBlocks.CUT_GRAY_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_SLAB, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_GRAY_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_WALL, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE),conditionsFromItem(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_BROWN_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_BROWN_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_BROWN_CONCRETE),conditionsFromItem(DecoBlocks.CUT_BROWN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_BROWN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_STAIRS, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_STAIRS, DecoBlocks.CUT_BROWN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_BROWN_CONCRETE_SLAB, DecoBlocks.CUT_BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_SLAB, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_SLAB, DecoBlocks.CUT_BROWN_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_BROWN_CONCRETE_WALL, DecoBlocks.CUT_BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_WALL, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_WALL, DecoBlocks.CUT_BROWN_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_RED_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_RED_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_RED_CONCRETE),conditionsFromItem(DecoBlocks.CUT_RED_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_RED_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_STAIRS, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_STAIRS, DecoBlocks.CUT_RED_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_RED_CONCRETE_SLAB, DecoBlocks.CUT_RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_SLAB, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_SLAB, DecoBlocks.CUT_RED_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_RED_CONCRETE_WALL, DecoBlocks.CUT_RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_WALL, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_WALL, DecoBlocks.CUT_RED_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_ORANGE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_ORANGE_CONCRETE),conditionsFromItem(DecoBlocks.CUT_ORANGE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS, DecoBlocks.CUT_ORANGE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ORANGE_CONCRETE_SLAB, DecoBlocks.CUT_ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_SLAB, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_SLAB, DecoBlocks.CUT_ORANGE_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_ORANGE_CONCRETE_WALL, DecoBlocks.CUT_ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_WALL, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_WALL, DecoBlocks.CUT_ORANGE_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_YELLOW_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_YELLOW_CONCRETE),conditionsFromItem(DecoBlocks.CUT_YELLOW_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS, DecoBlocks.CUT_YELLOW_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_YELLOW_CONCRETE_SLAB, DecoBlocks.CUT_YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_SLAB, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_SLAB, DecoBlocks.CUT_YELLOW_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_YELLOW_CONCRETE_WALL, DecoBlocks.CUT_YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_WALL, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_WALL, DecoBlocks.CUT_YELLOW_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_LIME_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_LIME_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_LIME_CONCRETE),conditionsFromItem(DecoBlocks.CUT_LIME_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_LIME_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_STAIRS, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_STAIRS, DecoBlocks.CUT_LIME_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LIME_CONCRETE_SLAB, DecoBlocks.CUT_LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_SLAB, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_SLAB, DecoBlocks.CUT_LIME_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_LIME_CONCRETE_WALL, DecoBlocks.CUT_LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_WALL, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_WALL, DecoBlocks.CUT_LIME_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_GREEN_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_GREEN_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_GREEN_CONCRETE),conditionsFromItem(DecoBlocks.CUT_GREEN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_GREEN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_STAIRS, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_STAIRS, DecoBlocks.CUT_GREEN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GREEN_CONCRETE_SLAB, DecoBlocks.CUT_GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_SLAB, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_SLAB, DecoBlocks.CUT_GREEN_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_GREEN_CONCRETE_WALL, DecoBlocks.CUT_GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_WALL, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_WALL, DecoBlocks.CUT_GREEN_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_CYAN_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_CYAN_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_CYAN_CONCRETE),conditionsFromItem(DecoBlocks.CUT_CYAN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_CYAN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_STAIRS, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_STAIRS, DecoBlocks.CUT_CYAN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CYAN_CONCRETE_SLAB, DecoBlocks.CUT_CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_SLAB, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_SLAB, DecoBlocks.CUT_CYAN_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_CYAN_CONCRETE_WALL, DecoBlocks.CUT_CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_WALL, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_WALL, DecoBlocks.CUT_CYAN_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_BLUE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_BLUE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_BLUE_CONCRETE),conditionsFromItem(DecoBlocks.CUT_BLUE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_STAIRS, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_STAIRS, DecoBlocks.CUT_BLUE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_SLAB, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_BLUE_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_WALL, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE),conditionsFromItem(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_PURPLE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_PURPLE_CONCRETE),conditionsFromItem(DecoBlocks.CUT_PURPLE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS, DecoBlocks.CUT_PURPLE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPLE_CONCRETE_SLAB, DecoBlocks.CUT_PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_SLAB, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_SLAB, DecoBlocks.CUT_PURPLE_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_PURPLE_CONCRETE_WALL, DecoBlocks.CUT_PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_WALL, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_WALL, DecoBlocks.CUT_PURPLE_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_MAGENTA_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_MAGENTA_CONCRETE),conditionsFromItem(DecoBlocks.CUT_MAGENTA_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS, DecoBlocks.CUT_MAGENTA_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB, DecoBlocks.CUT_MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB, DecoBlocks.CUT_MAGENTA_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_MAGENTA_CONCRETE_WALL, DecoBlocks.CUT_MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_WALL, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_WALL, DecoBlocks.CUT_MAGENTA_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_PINK_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_PINK_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_PINK_CONCRETE),conditionsFromItem(DecoBlocks.CUT_PINK_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_PINK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_STAIRS, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_STAIRS, DecoBlocks.CUT_PINK_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PINK_CONCRETE_SLAB, DecoBlocks.CUT_PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_SLAB, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_SLAB, DecoBlocks.CUT_PINK_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_PINK_CONCRETE_WALL, DecoBlocks.CUT_PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_WALL, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_WALL, DecoBlocks.CUT_PINK_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_PILLAR, DecoBlocks.WHITE_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_PILLAR, Items.WHITE_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_PILLAR, DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_PILLAR, Items.LIGHT_GRAY_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_PILLAR, DecoBlocks.GRAY_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_PILLAR, Items.GRAY_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_PILLAR, DecoBlocks.BLACK_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_PILLAR, Items.BLACK_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_PILLAR, DecoBlocks.BROWN_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_PILLAR, Items.BROWN_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_PILLAR, DecoBlocks.RED_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_PILLAR, Items.RED_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_PILLAR, DecoBlocks.ORANGE_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_PILLAR, Items.ORANGE_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_PILLAR, DecoBlocks.YELLOW_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_PILLAR, Items.YELLOW_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_PILLAR, DecoBlocks.LIME_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_PILLAR, Items.LIME_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_PILLAR, DecoBlocks.GREEN_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_PILLAR, Items.GREEN_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_PILLAR, DecoBlocks.CYAN_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_PILLAR, Items.CYAN_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_PILLAR, DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_PILLAR, Items.LIGHT_BLUE_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_PILLAR, DecoBlocks.BLUE_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_PILLAR, Items.BLUE_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_PILLAR, DecoBlocks.PURPLE_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_PILLAR, Items.PURPLE_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_PILLAR, DecoBlocks.MAGENTA_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_PILLAR, Items.MAGENTA_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_PILLAR, DecoBlocks.PINK_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_PILLAR, Items.PINK_CONCRETE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.TINTED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.AMETHYST_SHARD)
                .input('X', Items.GLASS_PANE)
                .criterion(hasItem(Items.AMETHYST_SHARD),
                        conditionsFromItem(Items.AMETHYST_SHARD))
                .criterion(hasItem(Items.GLASS_PANE),
                        conditionsFromItem(Items.GLASS_PANE))
                .offerTo(exporter, new Identifier("tinted_glass_pane_amethyst_shard"));
        offerStainedGlassPaneRecipe(exporter, DecoBlocks.TINTED_GLASS_PANE, Blocks.TINTED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.GLASS),
                        conditionsFromItem(Items.GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_GLASS)));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_GLASS_PANE, DecoBlocks.HARDENED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.GLASS_PANE),
                        conditionsFromItem(Items.GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_TINTED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.TINTED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.TINTED_GLASS),
                        conditionsFromItem(Items.TINTED_GLASS))
                .offerTo(exporter, new Identifier("hardened_tinted_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_TINTED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.AMETHYST_SHARD)
                .input('X', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.AMETHYST_SHARD),
                        conditionsFromItem(Items.AMETHYST_SHARD))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_TINTED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_TINTED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', DecoBlocks.TINTED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(DecoBlocks.TINTED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.TINTED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_tinted_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_TINTED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.AMETHYST_SHARD)
                .input('X', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.AMETHYST_SHARD),
                        conditionsFromItem(Items.AMETHYST_SHARD))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_tinted_glass_pane_amethyst_shard"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_TINTED_GLASS_PANE, DecoBlocks.HARDENED_TINTED_GLASS);


        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_WHITE_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.WHITE_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.WHITE_STAINED_GLASS),
                        conditionsFromItem(Items.WHITE_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_white_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_WHITE_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.WHITE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.WHITE_DYE),
                        conditionsFromItem(Items.WHITE_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_WHITE_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.WHITE_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.WHITE_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.WHITE_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_white_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.WHITE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.WHITE_DYE),
                        conditionsFromItem(Items.WHITE_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_white_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE, DecoBlocks.HARDENED_WHITE_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_ORANGE_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.ORANGE_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.ORANGE_STAINED_GLASS),
                        conditionsFromItem(Items.ORANGE_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_orange_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_ORANGE_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.ORANGE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.ORANGE_DYE),
                        conditionsFromItem(Items.ORANGE_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.ORANGE_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.ORANGE_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.ORANGE_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_orange_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.ORANGE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.ORANGE_DYE),
                        conditionsFromItem(Items.ORANGE_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_orange_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE, DecoBlocks.HARDENED_ORANGE_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.MAGENTA_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.MAGENTA_STAINED_GLASS),
                        conditionsFromItem(Items.MAGENTA_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_magenta_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.MAGENTA_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.MAGENTA_DYE),
                        conditionsFromItem(Items.MAGENTA_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.MAGENTA_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.MAGENTA_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.MAGENTA_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_magenta_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.MAGENTA_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.MAGENTA_DYE),
                        conditionsFromItem(Items.MAGENTA_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_magenta_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE, DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.LIGHT_BLUE_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.LIGHT_BLUE_STAINED_GLASS),
                        conditionsFromItem(Items.LIGHT_BLUE_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_light_blue_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.LIGHT_BLUE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.LIGHT_BLUE_DYE),
                        conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_light_blue_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.LIGHT_BLUE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.LIGHT_BLUE_DYE),
                        conditionsFromItem(Items.LIGHT_BLUE_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_light_blue_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE, DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_YELLOW_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.YELLOW_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.YELLOW_STAINED_GLASS),
                        conditionsFromItem(Items.YELLOW_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_yellow_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_YELLOW_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.YELLOW_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.YELLOW_DYE),
                        conditionsFromItem(Items.YELLOW_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.YELLOW_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.YELLOW_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.YELLOW_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_yellow_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.YELLOW_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.YELLOW_DYE),
                        conditionsFromItem(Items.YELLOW_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_yellow_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE, DecoBlocks.HARDENED_YELLOW_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIME_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.LIME_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.LIME_STAINED_GLASS),
                        conditionsFromItem(Items.LIME_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_lime_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIME_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.LIME_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.LIME_DYE),
                        conditionsFromItem(Items.LIME_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_LIME_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.LIME_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.LIME_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.LIME_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_lime_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.LIME_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.LIME_DYE),
                        conditionsFromItem(Items.LIME_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_lime_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE, DecoBlocks.HARDENED_LIME_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PINK_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.PINK_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.PINK_STAINED_GLASS),
                        conditionsFromItem(Items.PINK_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_pink_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PINK_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.PINK_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.PINK_DYE),
                        conditionsFromItem(Items.PINK_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_PINK_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.PINK_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.PINK_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.PINK_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_pink_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.PINK_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.PINK_DYE),
                        conditionsFromItem(Items.PINK_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_pink_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE, DecoBlocks.HARDENED_PINK_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GRAY_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.GRAY_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.GRAY_STAINED_GLASS),
                        conditionsFromItem(Items.GRAY_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_gray_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GRAY_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.GRAY_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.GRAY_DYE),
                        conditionsFromItem(Items.GRAY_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_GRAY_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.GRAY_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.GRAY_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.GRAY_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_gray_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.GRAY_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.GRAY_DYE),
                        conditionsFromItem(Items.GRAY_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_gray_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE, DecoBlocks.HARDENED_GRAY_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.LIGHT_GRAY_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.LIGHT_GRAY_STAINED_GLASS),
                        conditionsFromItem(Items.LIGHT_GRAY_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_light_gray_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.LIGHT_GRAY_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.LIGHT_GRAY_DYE),
                        conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_light_gray_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.LIGHT_GRAY_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.LIGHT_GRAY_DYE),
                        conditionsFromItem(Items.LIGHT_GRAY_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_light_gray_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE, DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_CYAN_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.CYAN_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.CYAN_STAINED_GLASS),
                        conditionsFromItem(Items.CYAN_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_cyan_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_CYAN_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.CYAN_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.CYAN_DYE),
                        conditionsFromItem(Items.CYAN_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_CYAN_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.CYAN_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.CYAN_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.CYAN_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_cyan_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.CYAN_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.CYAN_DYE),
                        conditionsFromItem(Items.CYAN_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_cyan_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE, DecoBlocks.HARDENED_CYAN_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PURPLE_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.PURPLE_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.PURPLE_STAINED_GLASS),
                        conditionsFromItem(Items.PURPLE_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_purple_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PURPLE_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.PURPLE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.PURPLE_DYE),
                        conditionsFromItem(Items.PURPLE_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.PURPLE_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.PURPLE_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.PURPLE_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_purple_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.PURPLE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.PURPLE_DYE),
                        conditionsFromItem(Items.PURPLE_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_purple_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE, DecoBlocks.HARDENED_PURPLE_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLUE_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.BLUE_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.BLUE_STAINED_GLASS),
                        conditionsFromItem(Items.BLUE_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_blue_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLUE_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.BLUE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.BLUE_DYE),
                        conditionsFromItem(Items.BLUE_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_BLUE_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.BLUE_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.BLUE_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.BLUE_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_blue_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.BLUE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.BLUE_DYE),
                        conditionsFromItem(Items.BLUE_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_blue_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE, DecoBlocks.HARDENED_BLUE_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BROWN_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.BROWN_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.BROWN_STAINED_GLASS),
                        conditionsFromItem(Items.BROWN_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_brown_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BROWN_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.BROWN_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.BROWN_DYE),
                        conditionsFromItem(Items.BROWN_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_BROWN_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.BROWN_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.BROWN_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.BROWN_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_brown_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.BROWN_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.BROWN_DYE),
                        conditionsFromItem(Items.BROWN_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_brown_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE, DecoBlocks.HARDENED_BROWN_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GREEN_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.GREEN_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.GREEN_STAINED_GLASS),
                        conditionsFromItem(Items.GREEN_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_green_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GREEN_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.GREEN_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.GREEN_DYE),
                        conditionsFromItem(Items.GREEN_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_GREEN_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.GREEN_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.GREEN_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.GREEN_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_green_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.GREEN_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.GREEN_DYE),
                        conditionsFromItem(Items.GREEN_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_green_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE, DecoBlocks.HARDENED_GREEN_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_RED_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.RED_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.RED_STAINED_GLASS),
                        conditionsFromItem(Items.RED_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_red_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_RED_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.RED_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.RED_DYE),
                        conditionsFromItem(Items.RED_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_RED_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.RED_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.RED_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.RED_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_red_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.RED_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.RED_DYE),
                        conditionsFromItem(Items.RED_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_red_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE, DecoBlocks.HARDENED_RED_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLACK_STAINED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Items.BLACK_STAINED_GLASS)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.BLACK_STAINED_GLASS),
                        conditionsFromItem(Items.BLACK_STAINED_GLASS))
                .offerTo(exporter, new Identifier("hardened_black_stained_glass_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLACK_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.BLACK_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .criterion(hasItem(Items.BLACK_DYE),
                        conditionsFromItem(Items.BLACK_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HARDENED_BLACK_STAINED_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('X', Blocks.BLACK_STAINED_GLASS_PANE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Blocks.BLACK_STAINED_GLASS_PANE),
                        conditionsFromItem(Blocks.BLACK_STAINED_GLASS_PANE))
                .offerTo(exporter, new Identifier("hardened_black_stained_glass_pane_iron_ingot"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.BLACK_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .criterion(hasItem(Items.BLACK_DYE),
                        conditionsFromItem(Items.BLACK_DYE))
                .criterion(hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_black_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE, DecoBlocks.HARDENED_BLACK_STAINED_GLASS);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.DEEPSLATE), RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_DEEPSLATE,
                        0.1f, 200).criterion(hasItem(Items.DEEPSLATE), conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_DEEPSLATE)));

        createStairsRecipe(DecoBlocks.SMOOTH_DEEPSLATE_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_DEEPSLATE))
                .criterion(hasItem(DecoBlocks.SMOOTH_DEEPSLATE),conditionsFromItem(DecoBlocks.SMOOTH_DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_DEEPSLATE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_DEEPSLATE_STAIRS, DecoBlocks.SMOOTH_DEEPSLATE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_DEEPSLATE_SLAB, DecoBlocks.SMOOTH_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_DEEPSLATE_SLAB, DecoBlocks.SMOOTH_DEEPSLATE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_DEEPSLATE_WALL, DecoBlocks.SMOOTH_DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_DEEPSLATE_WALL, DecoBlocks.SMOOTH_DEEPSLATE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BLACKSTONE), RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE,
                        0.1f, 200).criterion(hasItem(Items.BLACKSTONE), conditionsFromItem(Items.BLACKSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_BLACKSTONE)));

        createStairsRecipe(DecoBlocks.SMOOTH_BLACKSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_BLACKSTONE))
                .criterion(hasItem(DecoBlocks.SMOOTH_BLACKSTONE),conditionsFromItem(DecoBlocks.SMOOTH_BLACKSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_BLACKSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE_STAIRS, DecoBlocks.SMOOTH_BLACKSTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_BLACKSTONE_SLAB, DecoBlocks.SMOOTH_BLACKSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE_SLAB, DecoBlocks.SMOOTH_BLACKSTONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_BLACKSTONE_WALL, DecoBlocks.SMOOTH_BLACKSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE_WALL, DecoBlocks.SMOOTH_BLACKSTONE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.DEEPSLATE_BLAST_FURNACE)
                .pattern("III")
                .pattern("IXI")
                .pattern("###")
                .input('I', Items.IRON_INGOT)
                .input('X', DecoBlocks.DEEPSLATE_FURNACE)
                .input('#', DecoBlocks.SMOOTH_DEEPSLATE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(DecoBlocks.DEEPSLATE_FURNACE),
                        conditionsFromItem(DecoBlocks.DEEPSLATE_FURNACE))
                .criterion(hasItem(DecoBlocks.SMOOTH_DEEPSLATE),
                        conditionsFromItem(DecoBlocks.SMOOTH_DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DEEPSLATE_BLAST_FURNACE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.BLACKSTONE_BLAST_FURNACE)
                .pattern("III")
                .pattern("IXI")
                .pattern("###")
                .input('I', Items.IRON_INGOT)
                .input('X', DecoBlocks.BLACKSTONE_FURNACE)
                .input('#', DecoBlocks.SMOOTH_BLACKSTONE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(DecoBlocks.BLACKSTONE_FURNACE),
                        conditionsFromItem(DecoBlocks.BLACKSTONE_FURNACE))
                .criterion(hasItem(DecoBlocks.SMOOTH_BLACKSTONE),
                        conditionsFromItem(DecoBlocks.SMOOTH_BLACKSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACKSTONE_BLAST_FURNACE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.DEEPSLATE_STONECUTTER)
                .pattern(" I ")
                .pattern("###")
                .input('I', Items.IRON_INGOT)
                .input('#', Items.DEEPSLATE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.DEEPSLATE),
                        conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DEEPSLATE_STONECUTTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.BLACKSTONE_STONECUTTER)
                .pattern(" I ")
                .pattern("###")
                .input('I', Items.IRON_INGOT)
                .input('#', Items.BLACKSTONE)
                .criterion(hasItem(Items.IRON_INGOT),
                        conditionsFromItem(Items.IRON_INGOT))
                .criterion(hasItem(Items.BLACKSTONE),
                        conditionsFromItem(Items.BLACKSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACKSTONE_STONECUTTER)));

        createStairsRecipe(DecoBlocks.DEEPSLATE_STAIRS, Ingredient.ofItems(Items.DEEPSLATE))
                .criterion(hasItem(Items.DEEPSLATE),conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DEEPSLATE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DEEPSLATE_STAIRS, Items.DEEPSLATE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEEPSLATE_SLAB, Items.DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DEEPSLATE_SLAB, Items.DEEPSLATE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.DEEPSLATE_WALL, Items.DEEPSLATE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DEEPSLATE_WALL, Items.DEEPSLATE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BRICKS, Items.BRICK_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BRICKS, Items.BRICKS);

        createStairsRecipe(DecoBlocks.END_STONE_STAIRS, Ingredient.ofItems(Items.END_STONE))
                .criterion(hasItem(Items.END_STONE),conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.END_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.END_STONE_STAIRS, Items.END_STONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_SLAB, Items.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.END_STONE_SLAB, Items.END_STONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.END_STONE_WALL, Items.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.END_STONE_WALL, Items.END_STONE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_END_STONE, DecoBlocks.END_STONE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_END_STONE, Items.END_STONE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.PURPUR_BLOCK), RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_PURPUR,
                        0.1f, 200).criterion(hasItem(Items.PURPUR_BLOCK), conditionsFromItem(Items.PURPUR_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_PURPUR)));

        createStairsRecipe(DecoBlocks.SMOOTH_PURPUR_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_PURPUR))
                .criterion(hasItem(DecoBlocks.SMOOTH_PURPUR),conditionsFromItem(DecoBlocks.SMOOTH_PURPUR))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_PURPUR_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_PURPUR_STAIRS, DecoBlocks.SMOOTH_PURPUR);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_PURPUR_SLAB, DecoBlocks.SMOOTH_PURPUR);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_PURPUR_SLAB, DecoBlocks.SMOOTH_PURPUR,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_PURPUR_WALL, DecoBlocks.SMOOTH_PURPUR);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_PURPUR_WALL, DecoBlocks.SMOOTH_PURPUR);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICKS, Items.PURPUR_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICKS, Items.PURPUR_BLOCK);

        createStairsRecipe(DecoBlocks.PURPUR_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.PURPUR_BRICKS))
                .criterion(hasItem(DecoBlocks.PURPUR_BRICKS),conditionsFromItem(DecoBlocks.PURPUR_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PURPUR_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICK_STAIRS, Items.PURPUR_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICK_STAIRS, DecoBlocks.PURPUR_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPUR_BRICK_SLAB, DecoBlocks.PURPUR_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICK_SLAB, Items.PURPUR_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICK_SLAB, DecoBlocks.PURPUR_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PURPUR_BRICK_WALL, DecoBlocks.PURPUR_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICK_WALL, Items.PURPUR_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICK_WALL, DecoBlocks.PURPUR_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_PURPUR, Items.PURPUR_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.ENDER_PEARL)
                .input('#', Items.END_STONE)
                .criterion(hasItem(Items.ENDER_PEARL),
                        conditionsFromItem(Items.ENDER_PEARL))
                .criterion(hasItem(Items.END_STONE),
                        conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.VOID_STONE)));

        createStairsRecipe(DecoBlocks.VOID_STONE_STAIRS, Ingredient.ofItems(DecoBlocks.VOID_STONE))
                .criterion(hasItem(DecoBlocks.VOID_STONE),conditionsFromItem(DecoBlocks.VOID_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.VOID_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_STAIRS, DecoBlocks.VOID_STONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_SLAB, DecoBlocks.VOID_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_SLAB, DecoBlocks.VOID_STONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.VOID_STONE_WALL, DecoBlocks.VOID_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_WALL, DecoBlocks.VOID_STONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICKS, DecoBlocks.VOID_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICKS, DecoBlocks.VOID_STONE);

        createStairsRecipe(DecoBlocks.VOID_STONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.VOID_STONE_BRICKS))
                .criterion(hasItem(DecoBlocks.VOID_STONE_BRICKS),conditionsFromItem(DecoBlocks.VOID_STONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.VOID_STONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_STAIRS, DecoBlocks.VOID_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_STAIRS, DecoBlocks.VOID_STONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_SLAB, DecoBlocks.VOID_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_SLAB, DecoBlocks.VOID_STONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_SLAB, DecoBlocks.VOID_STONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.VOID_STONE_BRICK_WALL, DecoBlocks.VOID_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_WALL, DecoBlocks.VOID_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_WALL, DecoBlocks.VOID_STONE_BRICKS);

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,Items.PRISMARINE_BRICKS, Items.PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,Items.PRISMARINE_BRICK_STAIRS, Items.PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,Items.PRISMARINE_BRICK_SLAB, Items.PRISMARINE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE);

        createStairsRecipe(DecoBlocks.OBSIDIAN_STAIRS, Ingredient.ofItems(Items.OBSIDIAN))
                .criterion(hasItem(Items.OBSIDIAN),conditionsFromItem(Items.OBSIDIAN))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.OBSIDIAN_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_STAIRS, Items.OBSIDIAN);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OBSIDIAN_SLAB, Items.OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_SLAB, Items.OBSIDIAN,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.OBSIDIAN_WALL, Items.OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_WALL, Items.OBSIDIAN);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICKS, Items.OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICKS, Items.OBSIDIAN);

        createStairsRecipe(DecoBlocks.OBSIDIAN_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.OBSIDIAN_BRICKS))
                .criterion(hasItem(DecoBlocks.OBSIDIAN_BRICKS),conditionsFromItem(DecoBlocks.OBSIDIAN_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.OBSIDIAN_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_STAIRS, Items.OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_STAIRS, DecoBlocks.OBSIDIAN_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OBSIDIAN_BRICK_SLAB, DecoBlocks.OBSIDIAN_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_SLAB, Items.OBSIDIAN,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_SLAB, DecoBlocks.OBSIDIAN_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.OBSIDIAN_BRICK_WALL, DecoBlocks.OBSIDIAN_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_WALL, Items.OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_WALL, DecoBlocks.OBSIDIAN_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_PILLAR, DecoBlocks.OBSIDIAN_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_PILLAR, Items.OBSIDIAN);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_OBSIDIAN, DecoBlocks.OBSIDIAN_PILLAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_OBSIDIAN, Items.OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_OBSIDIAN, DecoBlocks.OBSIDIAN_PILLAR);

        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, Items.FLINT,
                RecipeCategory.BUILDING_BLOCKS,DecoBlocks.FLINT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC,Items.CHARCOAL,
                RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHARCOAL_BLOCK);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ECHO_BLOCK, Items.ECHO_SHARD);

        offerCutCopperRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_IRON, Items.IRON_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON, Items.IRON_BLOCK);

        createStairsRecipe(DecoBlocks.CUT_IRON_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_IRON))
                .criterion(hasItem(DecoBlocks.CUT_IRON),conditionsFromItem(DecoBlocks.CUT_IRON))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_IRON_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON_STAIRS, Items.IRON_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON_STAIRS, DecoBlocks.CUT_IRON);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_IRON_SLAB, DecoBlocks.CUT_IRON);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON_SLAB, Items.IRON_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON_SLAB, DecoBlocks.CUT_IRON,2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_IRON_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET),
                        conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_IRON_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HEAVY_IRON_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.IRON_BLOCK)
                .criterion(hasItem(Items.IRON_BLOCK),
                        conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HEAVY_IRON_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.GOLD_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.GOLD_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT),
                        conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GOLD_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.GOLD_TRAPDOOR)
                .pattern("##")
                .pattern("##")
                .input('#', Items.GOLD_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT),
                        conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GOLD_TRAPDOOR)));

        offerPressurePlateRecipe(exporter, DecoBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Items.POLISHED_DEEPSLATE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.POLISHED_DEEPSLATE_BUTTON)
                .input(Items.POLISHED_DEEPSLATE)
                .criterion(hasItem(Items.POLISHED_DEEPSLATE),
                        conditionsFromItem(Items.POLISHED_DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_DEEPSLATE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HEAVY_COPPER_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.COPPER_BLOCK)
                .criterion(hasItem(Items.COPPER_BLOCK),
                        conditionsFromItem(Items.COPPER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.HEAVY_COPPER_BARS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.WAXED_HEAVY_COPPER_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.WAXED_COPPER_BLOCK)
                .criterion(hasItem(Items.WAXED_COPPER_BLOCK),
                        conditionsFromItem(Items.WAXED_COPPER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WAXED_HEAVY_COPPER_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.EXPOSED_HEAVY_COPPER_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.EXPOSED_COPPER)
                .criterion(hasItem(Items.EXPOSED_COPPER),
                        conditionsFromItem(Items.EXPOSED_COPPER))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.WAXED_EXPOSED_COPPER)
                .criterion(hasItem(Items.WAXED_EXPOSED_COPPER),
                        conditionsFromItem(Items.WAXED_EXPOSED_COPPER))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.WEATHERED_HEAVY_COPPER_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.WEATHERED_COPPER)
                .criterion(hasItem(Items.WEATHERED_COPPER),
                        conditionsFromItem(Items.WEATHERED_COPPER))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.WAXED_WEATHERED_COPPER)
                .criterion(hasItem(Items.WAXED_WEATHERED_COPPER),
                        conditionsFromItem(Items.WAXED_WEATHERED_COPPER))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.OXIDIZED_COPPER)
                .criterion(hasItem(Items.OXIDIZED_COPPER),
                        conditionsFromItem(Items.OXIDIZED_COPPER))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.WAXED_OXIDIZED_COPPER)
                .criterion(hasItem(Items.WAXED_OXIDIZED_COPPER),
                        conditionsFromItem(Items.WAXED_OXIDIZED_COPPER))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.COPPER_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.COPPER_INGOT)
                .criterion(hasItem(Items.COPPER_INGOT),
                        conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.COPPER_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_COPPER_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', DecoItems.COPPER_NUGGET)
                .criterion(hasItem(DecoItems.COPPER_NUGGET),
                        conditionsFromItem(DecoItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_COPPER_BARS)));

        offerPressurePlateRecipe(exporter, DecoBlocks.DEEPSLATE_PRESSURE_PLATE, Items.DEEPSLATE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.DEEPSLATE_BUTTON)
                .input(Items.DEEPSLATE)
                .criterion(hasItem(Items.DEEPSLATE),
                        conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DEEPSLATE_BUTTON)));

        offerPressurePlateRecipe(exporter, DecoBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE, Items.COBBLED_DEEPSLATE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.COBBLED_DEEPSLATE_BUTTON)
                .input(Items.COBBLED_DEEPSLATE)
                .criterion(hasItem(Items.COBBLED_DEEPSLATE),
                        conditionsFromItem(Items.COBBLED_DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.COBBLED_DEEPSLATE_BUTTON)));

        offerPressurePlateRecipe(exporter, DecoBlocks.COBBLESTONE_PRESSURE_PLATE, Items.COBBLESTONE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.COBBLESTONE_BUTTON)
                .input(Items.COBBLESTONE)
                .criterion(hasItem(Items.COBBLESTONE),
                        conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.COBBLESTONE_BUTTON)));

        offerPressurePlateRecipe(exporter, DecoBlocks.BLACKSTONE_PRESSURE_PLATE, Items.BLACKSTONE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.BLACKSTONE_BUTTON)
                .input(Items.BLACKSTONE)
                .criterion(hasItem(Items.BLACKSTONE),
                        conditionsFromItem(Items.BLACKSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACKSTONE_BUTTON)));

        offerPressurePlateRecipe(exporter, DecoBlocks.POLISHED_STONE_PRESSURE_PLATE, DecoBlocks.POLISHED_STONE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.POLISHED_STONE_BUTTON)
                .input(DecoBlocks.POLISHED_STONE)
                .criterion(hasItem(DecoBlocks.POLISHED_STONE),
                        conditionsFromItem(DecoBlocks.POLISHED_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_STONE_BUTTON)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.YELLOW_DYE)
                .input(DecoBlocks.YELLOW_TULIP)
                .criterion(hasItem(DecoBlocks.YELLOW_TULIP),
                        conditionsFromItem(DecoBlocks.YELLOW_TULIP))
                .offerTo(exporter, new Identifier("yellow_dye_from_yellow_tulip"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PURPLE_DYE)
                .input(DecoBlocks.PURPLE_TULIP)
                .criterion(hasItem(DecoBlocks.PURPLE_TULIP),
                        conditionsFromItem(DecoBlocks.PURPLE_TULIP))
                .offerTo(exporter, new Identifier("purple_dye_from_purple_tulip"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.MAGENTA_DYE)
                .input(DecoBlocks.MAGENTA_TULIP)
                .criterion(hasItem(DecoBlocks.MAGENTA_TULIP),
                        conditionsFromItem(DecoBlocks.MAGENTA_TULIP))
                .offerTo(exporter, new Identifier("magenta_dye_from_magenta_tulip"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.BLACK_DYE)
                .input(DecoBlocks.BLACK_TULIP)
                .criterion(hasItem(DecoBlocks.BLACK_TULIP),
                        conditionsFromItem(DecoBlocks.BLACK_TULIP))
                .offerTo(exporter, new Identifier("black_dye_from_black_tulip"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.LIME_DYE)
                .input(DecoBlocks.GREEN_TULIP)
                .criterion(hasItem(DecoBlocks.GREEN_TULIP),
                        conditionsFromItem(DecoBlocks.GREEN_TULIP))
                .offerTo(exporter, new Identifier("lime_dye_from_green_tulip"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.LIGHT_BLUE_DYE)
                .input(DecoBlocks.BLUE_TULIP)
                .criterion(hasItem(DecoBlocks.BLUE_TULIP),
                        conditionsFromItem(DecoBlocks.BLUE_TULIP))
                .offerTo(exporter, new Identifier("light_blue_dye_from_blue_tulip"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.CYAN_DYE)
                .input(DecoBlocks.CYAN_TULIP)
                .criterion(hasItem(DecoBlocks.CYAN_TULIP),
                        conditionsFromItem(DecoBlocks.CYAN_TULIP))
                .offerTo(exporter, new Identifier("cyan_dye_from_cyan_tulip"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.RED_DYE)
                .input(DecoBlocks.BARBERTON_DAISY)
                .criterion(hasItem(DecoBlocks.BARBERTON_DAISY),
                        conditionsFromItem(DecoBlocks.BARBERTON_DAISY))
                .offerTo(exporter, new Identifier("red_dye_from_barberton_daisy"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.YELLOW_DYE)
                .input(DecoBlocks.BLUE_EYED_DAISY)
                .criterion(hasItem(DecoBlocks.BLUE_EYED_DAISY),
                        conditionsFromItem(DecoBlocks.BLUE_EYED_DAISY))
                .offerTo(exporter, new Identifier("yellow_dye_from_blue_eyed_daisy"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PINK_DYE)
                .input(DecoBlocks.GERBERA_DAISY)
                .criterion(hasItem(DecoBlocks.GERBERA_DAISY),
                        conditionsFromItem(DecoBlocks.GERBERA_DAISY))
                .offerTo(exporter, new Identifier("pink_dye_from_gerbera_daisy"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PURPLE_DYE)
                .input(DecoBlocks.MICHAELMAS_DAISY)
                .criterion(hasItem(DecoBlocks.MICHAELMAS_DAISY),
                        conditionsFromItem(DecoBlocks.MICHAELMAS_DAISY))
                .offerTo(exporter, new Identifier("purple_dye_from_michaelmas_daisy"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.ORANGE_DYE)
                .input(DecoBlocks.CALIFORNIA_POPPY)
                .criterion(hasItem(DecoBlocks.CALIFORNIA_POPPY),
                        conditionsFromItem(DecoBlocks.CALIFORNIA_POPPY))
                .offerTo(exporter, new Identifier("orange_dye_from_california_poppy"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PINK_DYE)
                .input(DecoBlocks.SALMON_POPPY)
                .criterion(hasItem(DecoBlocks.SALMON_POPPY),
                        conditionsFromItem(DecoBlocks.SALMON_POPPY))
                .offerTo(exporter, new Identifier("pink_dye_from_salmon_poppy"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.WHITE_DYE)
                .input(DecoBlocks.WHITE_ORCHID)
                .criterion(hasItem(DecoBlocks.WHITE_ORCHID),
                        conditionsFromItem(DecoBlocks.WHITE_ORCHID))
                .offerTo(exporter, new Identifier("white_dye_from_white_orchid"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PINK_DYE)
                .input(DecoBlocks.PINK_ORCHID)
                .criterion(hasItem(DecoBlocks.WHITE_ORCHID),
                        conditionsFromItem(DecoBlocks.WHITE_ORCHID))
                .offerTo(exporter, new Identifier("pink_dye_from_pink_orchid"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.YELLOW_DYE)
                .input(DecoBlocks.YELLOW_ORCHID)
                .criterion(hasItem(DecoBlocks.YELLOW_ORCHID),
                        conditionsFromItem(DecoBlocks.YELLOW_ORCHID))
                .offerTo(exporter, new Identifier("yellow_dye_from_yellow_orchid"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.RED_DYE)
                .input(DecoBlocks.ROSE)
                .criterion(hasItem(DecoBlocks.ROSE),
                        conditionsFromItem(DecoBlocks.ROSE))
                .offerTo(exporter, new Identifier("red_dye_from_rose"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PURPLE_DYE)
                .input(DecoBlocks.ENDER_ROSE)
                .criterion(hasItem(DecoBlocks.ENDER_ROSE),
                        conditionsFromItem(DecoBlocks.ENDER_ROSE))
                .offerTo(exporter, new Identifier("purple_dye_from_ender_rose"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PURPLE_DYE,4)
                .input(DecoBlocks.ENDER_ROSE_BUSH)
                .criterion(hasItem(DecoBlocks.ENDER_ROSE_BUSH),
                        conditionsFromItem(DecoBlocks.ENDER_ROSE_BUSH))
                .offerTo(exporter, new Identifier("purple_dye_from_ender_rose_bush"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.BLACK_DYE,4)
                .input(DecoBlocks.WITHER_ROSE_BUSH)
                .criterion(hasItem(DecoBlocks.WITHER_ROSE_BUSH),
                        conditionsFromItem(DecoBlocks.WITHER_ROSE_BUSH))
                .offerTo(exporter, new Identifier("black_dye_from_wither_rose_bush"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,Items.ROSE_BUSH)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.ROSE)
                .criterion(hasItem(DecoBlocks.ROSE),
                        conditionsFromItem(DecoBlocks.ROSE))
                .offerTo(exporter, new Identifier(getRecipeName(Items.ROSE_BUSH)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.ENDER_ROSE_BUSH)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.ENDER_ROSE)
                .criterion(hasItem(DecoBlocks.ENDER_ROSE),
                        conditionsFromItem(DecoBlocks.ENDER_ROSE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ENDER_ROSE_BUSH)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.WITHER_ROSE_BUSH)
                .pattern("##")
                .pattern("##")
                .input('#', Items.WITHER_ROSE)
                .criterion(hasItem(Items.WITHER_ROSE),
                        conditionsFromItem(Items.WITHER_ROSE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WITHER_ROSE_BUSH)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.RED_DYE,2)
                .input(DecoBlocks.RED_SUNFLOWER)
                .criterion(hasItem(DecoBlocks.RED_SUNFLOWER),
                        conditionsFromItem(DecoBlocks.RED_SUNFLOWER))
                .offerTo(exporter, new Identifier("red_dye_from_red_sunflower"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.WHITE_DYE,2)
                .input(DecoBlocks.NOVA_STARFLOWER)
                .criterion(hasItem(DecoBlocks.NOVA_STARFLOWER),
                        conditionsFromItem(DecoBlocks.NOVA_STARFLOWER))
                .offerTo(exporter, new Identifier("white_dye_from_nova_starflower"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PINK_DYE)
                .input(DecoBlocks.PAEONIA)
                .criterion(hasItem(DecoBlocks.PAEONIA),
                        conditionsFromItem(DecoBlocks.PAEONIA))
                .offerTo(exporter, new Identifier("pink_dye_from_paeonia"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,Items.PEONY)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.PAEONIA)
                .criterion(hasItem(DecoBlocks.PAEONIA),
                        conditionsFromItem(DecoBlocks.PAEONIA))
                .offerTo(exporter, new Identifier(getRecipeName(Items.PEONY)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PURPLE_DYE)
                .input(DecoBlocks.LAVENDER)
                .criterion(hasItem(DecoBlocks.LAVENDER),
                        conditionsFromItem(DecoBlocks.LAVENDER))
                .offerTo(exporter, new Identifier("purple_dye_from_lavender"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.COPPER_LANTERN)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.TORCH)
                .input('#', DecoItems.COPPER_NUGGET)
                .criterion(hasItem(Items.TORCH),
                        conditionsFromItem(Items.TORCH))
                .criterion(hasItem(DecoItems.COPPER_NUGGET),
                        conditionsFromItem(DecoItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.COPPER_LANTERN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.COPPER_SOUL_LANTERN)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.SOUL_TORCH)
                .input('#', DecoItems.COPPER_NUGGET)
                .criterion(hasItem(Items.SOUL_TORCH),
                        conditionsFromItem(Items.SOUL_TORCH))
                .criterion(hasItem(DecoItems.COPPER_NUGGET),
                        conditionsFromItem(DecoItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.COPPER_SOUL_LANTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.COPPER_CHAIN)
                .pattern("#")
                .pattern("X")
                .pattern("#")
                .input('X', Items.COPPER_INGOT)
                .input('#', DecoItems.COPPER_NUGGET)
                .criterion(hasItem(Items.COPPER_INGOT),
                        conditionsFromItem(Items.COPPER_INGOT))
                .criterion(hasItem(DecoItems.COPPER_NUGGET),
                        conditionsFromItem(DecoItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.COPPER_CHAIN)));

        offerPressurePlateRecipe(exporter, DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE, Items.COPPER_INGOT);

        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.WHITE_DYE, RecipeCategory.DECORATIONS,DecoBlocks.WHITE_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.LIGHT_GRAY_DYE, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_GRAY_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.GRAY_DYE,RecipeCategory.DECORATIONS,DecoBlocks.GRAY_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.BLACK_DYE, RecipeCategory.DECORATIONS,DecoBlocks.BLACK_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.BROWN_DYE, RecipeCategory.DECORATIONS,DecoBlocks.BROWN_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.RED_DYE, RecipeCategory.DECORATIONS,DecoBlocks.RED_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.ORANGE_DYE, RecipeCategory.DECORATIONS,DecoBlocks.ORANGE_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.YELLOW_DYE, RecipeCategory.DECORATIONS,DecoBlocks.YELLOW_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.LIME_DYE, RecipeCategory.DECORATIONS,DecoBlocks.LIME_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.GREEN_DYE,RecipeCategory.DECORATIONS,DecoBlocks.GREEN_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.CYAN_DYE,RecipeCategory.DECORATIONS,DecoBlocks.CYAN_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.LIGHT_BLUE_DYE, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_BLUE_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.BLUE_DYE, RecipeCategory.DECORATIONS,DecoBlocks.BLUE_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.PURPLE_DYE, RecipeCategory.DECORATIONS,DecoBlocks.PURPLE_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.MAGENTA_DYE, RecipeCategory.DECORATIONS,DecoBlocks.MAGENTA_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.PINK_DYE, RecipeCategory.DECORATIONS,DecoBlocks.PINK_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_GRAY_BLOCK,3)
                .input(DecoBlocks.BLACK_BLOCK)
                .input(DecoBlocks.WHITE_BLOCK)
                .input(DecoBlocks.WHITE_BLOCK)
                .criterion(hasItem(DecoBlocks.BLACK_BLOCK),
                        conditionsFromItem(DecoBlocks.BLACK_BLOCK))
                .criterion(hasItem(DecoBlocks.WHITE_BLOCK),
                        conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .offerTo(exporter, new Identifier("light_gray_block_from_black_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_GRAY_BLOCK,2)
                .input(DecoBlocks.GRAY_BLOCK)
                .input(DecoBlocks.WHITE_BLOCK)
                .criterion(hasItem(DecoBlocks.GRAY_BLOCK),
                        conditionsFromItem(DecoBlocks.GRAY_BLOCK))
                .criterion(hasItem(DecoBlocks.WHITE_BLOCK),
                        conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .offerTo(exporter, new Identifier("light_gray_block_from_gray_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.GRAY_BLOCK,2)
                .input(DecoBlocks.BLACK_BLOCK)
                .input(DecoBlocks.WHITE_BLOCK)
                .criterion(hasItem(DecoBlocks.BLACK_BLOCK),
                        conditionsFromItem(DecoBlocks.BLACK_BLOCK))
                .criterion(hasItem(DecoBlocks.WHITE_BLOCK),
                        conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .offerTo(exporter, new Identifier("gray_block_from_black_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.ORANGE_BLOCK,2)
                .input(DecoBlocks.YELLOW_BLOCK)
                .input(DecoBlocks.RED_BLOCK)
                .criterion(hasItem(DecoBlocks.YELLOW_BLOCK),
                        conditionsFromItem(DecoBlocks.YELLOW_BLOCK))
                .criterion(hasItem(DecoBlocks.RED_BLOCK),
                        conditionsFromItem(DecoBlocks.RED_BLOCK))
                .offerTo(exporter, new Identifier("orange_block_from_red_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.LIME_BLOCK,2)
                .input(DecoBlocks.GREEN_BLOCK)
                .input(DecoBlocks.WHITE_BLOCK)
                .criterion(hasItem(DecoBlocks.GREEN_BLOCK),
                        conditionsFromItem(DecoBlocks.GREEN_BLOCK))
                .criterion(hasItem(DecoBlocks.WHITE_BLOCK),
                        conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .offerTo(exporter, new Identifier("lime_block_from_green_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.CYAN_BLOCK,2)
                .input(DecoBlocks.GREEN_BLOCK)
                .input(DecoBlocks.BLUE_BLOCK)
                .criterion(hasItem(DecoBlocks.GREEN_BLOCK),
                        conditionsFromItem(DecoBlocks.GREEN_BLOCK))
                .criterion(hasItem(DecoBlocks.BLUE_BLOCK),
                        conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .offerTo(exporter, new Identifier("cyan_block_from_green_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_BLUE_BLOCK,2)
                .input(DecoBlocks.BLUE_BLOCK)
                .input(DecoBlocks.WHITE_BLOCK)
                .criterion(hasItem(DecoBlocks.BLUE_BLOCK),
                        conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .criterion(hasItem(DecoBlocks.WHITE_BLOCK),
                        conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .offerTo(exporter, new Identifier("light_blue_block_from_blue_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.PURPLE_BLOCK,2)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.BLUE_BLOCK)
                .criterion(hasItem(DecoBlocks.RED_BLOCK),
                        conditionsFromItem(DecoBlocks.RED_BLOCK))
                .criterion(hasItem(DecoBlocks.BLUE_BLOCK),
                        conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .offerTo(exporter, new Identifier("purple_block_from_red_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.MAGENTA_BLOCK,2)
                .input(DecoBlocks.PINK_BLOCK)
                .input(DecoBlocks.PURPLE_BLOCK)
                .criterion(hasItem(DecoBlocks.PINK_BLOCK),
                        conditionsFromItem(DecoBlocks.PINK_BLOCK))
                .criterion(hasItem(DecoBlocks.PURPLE_BLOCK),
                        conditionsFromItem(DecoBlocks.PURPLE_BLOCK))
                .offerTo(exporter, new Identifier("magenta_block_from_pink_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.MAGENTA_BLOCK,3)
                .input(DecoBlocks.PINK_BLOCK)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.BLUE_BLOCK)
                .criterion(hasItem(DecoBlocks.PINK_BLOCK),
                        conditionsFromItem(DecoBlocks.PINK_BLOCK))
                .criterion(hasItem(DecoBlocks.RED_BLOCK),
                        conditionsFromItem(DecoBlocks.RED_BLOCK))
                .criterion(hasItem(DecoBlocks.BLUE_BLOCK),
                        conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .offerTo(exporter, new Identifier("magenta_block_from_blue_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.MAGENTA_BLOCK,3)
                .input(DecoBlocks.WHITE_BLOCK)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.PURPLE_BLOCK)
                .criterion(hasItem(DecoBlocks.WHITE_BLOCK),
                        conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .criterion(hasItem(DecoBlocks.RED_BLOCK),
                        conditionsFromItem(DecoBlocks.RED_BLOCK))
                .criterion(hasItem(DecoBlocks.PURPLE_BLOCK),
                        conditionsFromItem(DecoBlocks.PURPLE_BLOCK))
                .offerTo(exporter, new Identifier("magenta_block_from_purple_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.MAGENTA_BLOCK,4)
                .input(DecoBlocks.WHITE_BLOCK)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.BLUE_BLOCK)
                .criterion(hasItem(DecoBlocks.WHITE_BLOCK),
                        conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .criterion(hasItem(DecoBlocks.RED_BLOCK),
                        conditionsFromItem(DecoBlocks.RED_BLOCK))
                .criterion(hasItem(DecoBlocks.BLUE_BLOCK),
                        conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .offerTo(exporter, new Identifier("magenta_block_from_white_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.MAGENTA_DYE,3)
                .input(Items.WHITE_DYE)
                .input(Items.RED_DYE)
                .input(Items.PURPLE_DYE)
                .criterion(hasItem(Items.WHITE_DYE),
                        conditionsFromItem(Items.WHITE_DYE))
                .criterion(hasItem(Items.RED_DYE),
                        conditionsFromItem(Items.RED_DYE))
                .criterion(hasItem(Items.PURPLE_DYE),
                        conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier("magenta_dye_from_purple_dye"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.PINK_BLOCK,2)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.WHITE_BLOCK)
                .criterion(hasItem(DecoBlocks.RED_BLOCK),
                        conditionsFromItem(DecoBlocks.RED_BLOCK))
                .criterion(hasItem(DecoBlocks.WHITE_BLOCK),
                        conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .offerTo(exporter, new Identifier("pink_block_from_red_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.BROWN_BLOCK,2)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.GREEN_BLOCK)
                .criterion(hasItem(DecoBlocks.RED_BLOCK),
                        conditionsFromItem(DecoBlocks.RED_BLOCK))
                .criterion(hasItem(DecoBlocks.GREEN_BLOCK),
                        conditionsFromItem(DecoBlocks.GREEN_BLOCK))
                .offerTo(exporter, new Identifier("brown_block_from_red_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.BROWN_DYE,2)
                .input(Items.RED_DYE)
                .input(Items.GREEN_DYE)
                .criterion(hasItem(Items.RED_DYE),
                        conditionsFromItem(Items.RED_DYE))
                .criterion(hasItem(Items.GREEN_DYE),
                        conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier("brown_dye_from_red_dye"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.BROWN_BLOCK,3)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.YELLOW_BLOCK)
                .input(DecoBlocks.BLUE_BLOCK)
                .criterion(hasItem(DecoBlocks.RED_BLOCK),
                        conditionsFromItem(DecoBlocks.RED_BLOCK))
                .criterion(hasItem(DecoBlocks.YELLOW_BLOCK),
                        conditionsFromItem(DecoBlocks.YELLOW_BLOCK))
                .criterion(hasItem(DecoBlocks.BLUE_BLOCK),
                        conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .offerTo(exporter, new Identifier("brown_block_from_blue_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.BROWN_DYE,3)
                .input(Items.RED_DYE)
                .input(Items.YELLOW_DYE)
                .input(Items.BLUE_DYE)
                .criterion(hasItem(Items.RED_DYE),
                        conditionsFromItem(Items.RED_DYE))
                .criterion(hasItem(Items.YELLOW_DYE),
                        conditionsFromItem(Items.YELLOW_DYE))
                .criterion(hasItem(Items.BLUE_DYE),
                        conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier("brown_dye_from_blue_dye"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.GREEN_BLOCK,2)
                .input(DecoBlocks.BLUE_BLOCK)
                .input(DecoBlocks.YELLOW_BLOCK)
                .criterion(hasItem(DecoBlocks.BLUE_BLOCK),
                        conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .criterion(hasItem(DecoBlocks.YELLOW_BLOCK),
                        conditionsFromItem(DecoBlocks.YELLOW_BLOCK))
                .offerTo(exporter, new Identifier("green_block_from_blue_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.GREEN_DYE,2)
                .input(Items.BLUE_DYE)
                .input(Items.YELLOW_DYE)
                .criterion(hasItem(Items.BLUE_DYE),
                        conditionsFromItem(Items.BLUE_DYE))
                .criterion(hasItem(Items.YELLOW_DYE),
                        conditionsFromItem(Items.YELLOW_DYE))
                .offerTo(exporter, new Identifier("green_dye_from_blue_dye"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.LIME_BLOCK,3)
                .input(DecoBlocks.WHITE_BLOCK)
                .input(DecoBlocks.YELLOW_BLOCK)
                .input(DecoBlocks.BLUE_BLOCK)
                .criterion(hasItem(DecoBlocks.WHITE_BLOCK),
                        conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .criterion(hasItem(DecoBlocks.YELLOW_BLOCK),
                        conditionsFromItem(DecoBlocks.YELLOW_BLOCK))
                .criterion(hasItem(DecoBlocks.BLUE_BLOCK),
                        conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .offerTo(exporter, new Identifier("lime_block_from_yellow_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.LIME_DYE,3)
                .input(Items.WHITE_DYE)
                .input(Items.YELLOW_DYE)
                .input(Items.BLUE_DYE)
                .criterion(hasItem(Items.WHITE_DYE),
                        conditionsFromItem(Items.WHITE_DYE))
                .criterion(hasItem(Items.YELLOW_DYE),
                        conditionsFromItem(Items.YELLOW_DYE))
                .criterion(hasItem(Items.BLUE_DYE),
                        conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier("lime_dye_from_yellow_dye"));

        createStairsRecipe(DecoBlocks.WOODEN_STAIRS, Ingredient.ofItems(DecoBlocks.WOODEN_PLANKS))
                .criterion(hasItem(DecoBlocks.WOODEN_PLANKS),conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WOODEN_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WOODEN_SLAB, DecoBlocks.WOODEN_PLANKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.WOODEN_FENCE)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .criterion(hasItem(DecoBlocks.WOODEN_PLANKS),
                        conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WOODEN_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.WOODEN_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .criterion(hasItem(Items.STICK),
                        conditionsFromItem(Items.STICK))
                .criterion(hasItem(DecoBlocks.WOODEN_PLANKS),
                        conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WOODEN_FENCE_GATE)));

        offerPressurePlateRecipe(exporter, DecoBlocks.WOODEN_PRESSURE_PLATE, DecoBlocks.WOODEN_PLANKS);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.WOODEN_BUTTON)
                .input(DecoBlocks.WOODEN_PLANKS)
                .criterion(hasItem(DecoBlocks.WOODEN_PLANKS),
                        conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WOODEN_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.WOODEN_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .criterion(hasItem(DecoBlocks.WOODEN_PLANKS),
                        conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WOODEN_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.WOODEN_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .criterion(hasItem(DecoBlocks.WOODEN_PLANKS),
                        conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WOODEN_TRAPDOOR)));

        createSignRecipe(DecoItems.WOODEN_SIGN, Ingredient.ofItems(DecoBlocks.WOODEN_PLANKS))
                .criterion(hasItem(DecoBlocks.WOODEN_PLANKS),conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoItems.WOODEN_SIGN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WOODEN_WOOD,4)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.WOODEN_LOG)
                .criterion(hasItem(DecoBlocks.WOODEN_LOG),
                        conditionsFromItem(DecoBlocks.WOODEN_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WOODEN_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STRIPPED_WOODEN_WOOD,4)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.STRIPPED_WOODEN_LOG)
                .criterion(hasItem(DecoBlocks.STRIPPED_WOODEN_LOG),
                        conditionsFromItem(DecoBlocks.STRIPPED_WOODEN_LOG))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STRIPPED_WOODEN_WOOD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.COPPER_BUTTON)
                .input(DecoItems.COPPER_NUGGET)
                .criterion(hasItem(DecoItems.COPPER_NUGGET),
                        conditionsFromItem(DecoItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.COPPER_BUTTON)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.IRON_BUTTON)
                .input(Items.IRON_NUGGET)
                .criterion(hasItem(Items.IRON_NUGGET),
                        conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.IRON_BUTTON)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.GOLD_BUTTON)
                .input(Items.GOLD_NUGGET)
                .criterion(hasItem(Items.GOLD_NUGGET),
                        conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GOLD_BUTTON)));
    }
}
