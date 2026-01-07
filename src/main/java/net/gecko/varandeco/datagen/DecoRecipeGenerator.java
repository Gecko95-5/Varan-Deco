package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.gecko.varandeco.util.DecoTags;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class DecoRecipeGenerator extends FabricRecipeProvider {
    public DecoRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_ANDESITE_WALL, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_ANDESITE_WALL, Items.ANDESITE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_ANDESITE_WALL, Items.POLISHED_ANDESITE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_DIORITE_WALL, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_DIORITE_WALL, Items.DIORITE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_DIORITE_WALL, Items.POLISHED_DIORITE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_GRANITE_WALL, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_GRANITE_WALL, Items.GRANITE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_GRANITE_WALL, Items.POLISHED_GRANITE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.STONE_WALL, Items.STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_WALL, Items.STONE);

        createStairsRecipe(DecoBlocks.SMOOTH_STONE_STAIRS, Ingredient.ofItems(Items.SMOOTH_STONE))
                .criterion(hasItem(Items.SMOOTH_STONE),conditionsFromItem(Items.SMOOTH_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_STONE_STAIRS, Items.SMOOTH_STONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_STONE_WALL, Items.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_STONE_WALL, Items.SMOOTH_STONE);

        createStairsRecipe(DecoBlocks.CALCITE_STAIRS, Ingredient.ofItems(Items.CALCITE))
                .criterion(hasItem(Items.CALCITE),conditionsFromItem(Items.CALCITE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CALCITE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CALCITE_STAIRS, Items.CALCITE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CALCITE_SLAB, Items.CALCITE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CALCITE_SLAB, Items.CALCITE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CALCITE_WALL, Items.CALCITE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CALCITE_WALL, Items.CALCITE);

        createStairsRecipe(DecoBlocks.TUFF_STAIRS, Ingredient.ofItems(Items.TUFF))
                .criterion(hasItem(Items.TUFF),conditionsFromItem(Items.TUFF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.TUFF_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_STAIRS, Items.TUFF);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_SLAB, Items.TUFF);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_SLAB, Items.TUFF,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.TUFF_WALL, Items.TUFF);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TUFF_WALL, Items.TUFF);

        createStairsRecipe(DecoBlocks.DRIPSTONE_STAIRS, Ingredient.ofItems(Items.DRIPSTONE_BLOCK))
                .criterion(hasItem(Items.DRIPSTONE_BLOCK),conditionsFromItem(Items.DRIPSTONE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DRIPSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIPSTONE_STAIRS, Items.DRIPSTONE_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIPSTONE_SLAB, Items.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIPSTONE_SLAB, Items.DRIPSTONE_BLOCK,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.DRIPSTONE_WALL, Items.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DRIPSTONE_WALL, Items.DRIPSTONE_BLOCK);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE, Items.COBBLESTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICKS, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICKS, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_STAIRS, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_SLAB, DecoBlocks.POLISHED_STONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_WALL, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.CHISELED_STONE_BRICKS, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICKS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_STAIRS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_SLAB, Items.COBBLESTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.STONE_BRICK_WALL, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.CHISELED_STONE_BRICKS, Items.COBBLESTONE);

        createStairsRecipe(DecoBlocks.POLISHED_STONE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_STONE))
                .criterion(hasItem(DecoBlocks.POLISHED_STONE),conditionsFromItem(DecoBlocks.POLISHED_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_STAIRS, DecoBlocks.POLISHED_STONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_SLAB, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_SLAB, DecoBlocks.POLISHED_STONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_STONE_WALL, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_WALL, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_STAIRS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_SLAB, Items.COBBLESTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_WALL, Items.COBBLESTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILES, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILES, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILES, Items.STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILES, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILES, DecoBlocks.POLISHED_STONE);

        createStairsRecipe(DecoBlocks.STONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.STONE_TILES))
                .criterion(hasItem(DecoBlocks.STONE_TILES),conditionsFromItem(DecoBlocks.STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_STAIRS, DecoBlocks.STONE_TILES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, DecoBlocks.STONE_TILES);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, DecoBlocks.STONE_TILES,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.STONE_TILE_WALL, DecoBlocks.STONE_TILES);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_WALL, DecoBlocks.STONE_TILES);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_STAIRS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, Items.COBBLESTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_WALL, Items.COBBLESTONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_STAIRS, Items.STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, Items.STONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_WALL, Items.STONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_STAIRS, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, DecoBlocks.POLISHED_STONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_WALL, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_STAIRS, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_SLAB, Items.STONE_BRICKS,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STONE_TILE_WALL, Items.STONE_BRICKS);

        createStairsRecipe(DecoBlocks.PACKED_MUD_STAIRS, Ingredient.ofItems(Items.PACKED_MUD))
                .criterion(hasItem(Items.PACKED_MUD),conditionsFromItem(Items.PACKED_MUD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PACKED_MUD_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_MUD_SLAB, Items.PACKED_MUD);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PACKED_MUD_WALL, Items.PACKED_MUD);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.RED_NETHER_BRICK_FENCE,6)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.RED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.RED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Items.RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.RED_NETHER_BRICK_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.NETHER_BRICK_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.RED_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.RED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.RED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Items.RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE)));

        createStairsRecipe(DecoBlocks.NETHERRACK_STAIRS, Ingredient.ofItems(Items.NETHERRACK))
                .criterion(hasItem(Items.NETHERRACK),conditionsFromItem(Items.NETHERRACK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.NETHERRACK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.NETHERRACK_STAIRS, Items.NETHERRACK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.NETHERRACK_SLAB, Items.NETHERRACK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.NETHERRACK_SLAB, Items.NETHERRACK,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.NETHERRACK_WALL, Items.NETHERRACK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.NETHERRACK_WALL, Items.NETHERRACK);

        createStairsRecipe(DecoBlocks.MAGMA_STAIRS, Ingredient.ofItems(Items.MAGMA_BLOCK))
                .criterion(hasItem(Items.MAGMA_BLOCK),conditionsFromItem(Items.MAGMA_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGMA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_STAIRS, Items.MAGMA_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_SLAB, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_SLAB, Items.MAGMA_BLOCK,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.MAGMA_WALL, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_WALL, Items.MAGMA_BLOCK);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICKS, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICKS, Items.MAGMA_BLOCK);

        createStairsRecipe(DecoBlocks.MAGMA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.MAGMA_BRICKS))
                .criterion(hasItem(DecoBlocks.MAGMA_BRICKS),conditionsFromItem(DecoBlocks.MAGMA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGMA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_STAIRS, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_STAIRS, DecoBlocks.MAGMA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_SLAB, DecoBlocks.MAGMA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_SLAB, Items.MAGMA_BLOCK,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_SLAB, DecoBlocks.MAGMA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.MAGMA_BRICK_WALL, DecoBlocks.MAGMA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_WALL, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGMA_BRICK_WALL, DecoBlocks.MAGMA_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_MAGMA_BRICKS, DecoBlocks.MAGMA_BRICK_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_MAGMA_BRICKS, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_MAGMA_BRICKS, DecoBlocks.MAGMA_BRICKS);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.BLACKSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE);

        createStairsRecipe(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_BLACKSTONE_TILES))
                .criterion(hasItem(DecoBlocks.POLISHED_BLACKSTONE_TILES),conditionsFromItem(DecoBlocks.POLISHED_BLACKSTONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, DecoBlocks.POLISHED_BLACKSTONE_TILES);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.POLISHED_BLACKSTONE_TILES);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.POLISHED_BLACKSTONE_TILES,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.POLISHED_BLACKSTONE_TILES);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.POLISHED_BLACKSTONE_TILES);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Items.BLACKSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Items.BLACKSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Items.BLACKSTONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Items.POLISHED_BLACKSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Items.POLISHED_BLACKSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Items.POLISHED_BLACKSTONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Items.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Items.POLISHED_BLACKSTONE_BRICKS,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Items.POLISHED_BLACKSTONE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_GLIDED_BLACKSTONE,2)
                .pattern("P#")
                .pattern("#P")
                .input('P', Items.POLISHED_BLACKSTONE)
                .input('#', Items.GILDED_BLACKSTONE)
                .criterion(RecipeProvider.hasItem(Items.GILDED_BLACKSTONE),
                        RecipeProvider.conditionsFromItem(Items.GILDED_BLACKSTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.POLISHED_GLIDED_BLACKSTONE)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_GLIDED_BLACKSTONE, Items.GILDED_BLACKSTONE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_GLIDED_BLACKSTONE,4)
                .pattern(" # ")
                .pattern("#C#")
                .pattern(" # ")
                .input('C', Items.CHISELED_POLISHED_BLACKSTONE)
                .input('#', DecoBlocks.POLISHED_GLIDED_BLACKSTONE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.POLISHED_GLIDED_BLACKSTONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.POLISHED_GLIDED_BLACKSTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHISELED_GLIDED_BLACKSTONE)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_GLIDED_BLACKSTONE, Items.GILDED_BLACKSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_GLIDED_BLACKSTONE, DecoBlocks.POLISHED_GLIDED_BLACKSTONE);

        createStairsRecipe(DecoBlocks.SNOW_STAIRS, Ingredient.ofItems(Items.SNOW_BLOCK))
                .criterion(hasItem(Items.SNOW_BLOCK),conditionsFromItem(Items.SNOW_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SNOW_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SNOW_SLAB, Items.SNOW_BLOCK);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SNOW_WALL, Items.SNOW_BLOCK);

        createStairsRecipe(DecoBlocks.PACKED_ICE_STAIRS, Ingredient.ofItems(Items.PACKED_ICE))
                .criterion(hasItem(Items.PACKED_ICE),conditionsFromItem(Items.PACKED_ICE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PACKED_ICE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_ICE_STAIRS, Items.PACKED_ICE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_ICE_SLAB, Items.PACKED_ICE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_ICE_SLAB, Items.PACKED_ICE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PACKED_ICE_WALL, Items.PACKED_ICE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_ICE_WALL, Items.PACKED_ICE);

        createStairsRecipe(DecoBlocks.BLUE_ICE_STAIRS, Ingredient.ofItems(Items.BLUE_ICE))
                .criterion(hasItem(Items.BLUE_ICE),conditionsFromItem(Items.BLUE_ICE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_ICE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_ICE_STAIRS, Items.BLUE_ICE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_ICE_SLAB, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_ICE_SLAB, Items.BLUE_ICE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLUE_ICE_WALL, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_ICE_WALL, Items.BLUE_ICE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoItems.SNOW_BRICK)
                .input(Items.SNOWBALL)
                .input(Items.SNOWBALL)
                .input(Items.SNOWBALL)
                .input(DecoItems.ICE_SHARD)
                .criterion(RecipeProvider.hasItem(Items.SNOWBALL),
                        RecipeProvider.conditionsFromItem(Items.SNOWBALL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.SNOW_BRICK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SNOW_BRICKS)
                .pattern("##")
                .pattern("##")
                .input('#', DecoItems.SNOW_BRICK)
                .criterion(RecipeProvider.hasItem(DecoItems.SNOW_BRICK),
                        RecipeProvider.conditionsFromItem(DecoItems.SNOW_BRICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SNOW_BRICKS)));

        createStairsRecipe(DecoBlocks.SNOW_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.SNOW_BRICKS))
                .criterion(hasItem(DecoBlocks.SNOW_BRICKS),conditionsFromItem(DecoBlocks.SNOW_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SNOW_BRICK_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SNOW_BRICK_SLAB, DecoBlocks.SNOW_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SNOW_BRICK_WALL, DecoBlocks.SNOW_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_SNOW_BRICKS)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('S', Items.SNOWBALL)
                .input('#', DecoItems.SNOW_BRICK)
                .criterion(RecipeProvider.hasItem(DecoItems.SNOW_BRICK),
                        RecipeProvider.conditionsFromItem(DecoItems.SNOW_BRICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHISELED_SNOW_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICKS,4)
                .pattern("/#")
                .pattern("#/")
                .input('/', Items.BLUE_ICE)
                .input('#', Items.PACKED_ICE)
                .criterion(RecipeProvider.hasItem(Items.PACKED_ICE),
                        RecipeProvider.conditionsFromItem(Items.PACKED_ICE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.ICE_BRICKS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICKS, Items.BLUE_ICE);

        createStairsRecipe(DecoBlocks.ICE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.ICE_BRICKS))
                .criterion(hasItem(DecoBlocks.ICE_BRICKS),conditionsFromItem(DecoBlocks.ICE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ICE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_STAIRS, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_STAIRS, DecoBlocks.ICE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_SLAB, DecoBlocks.ICE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_SLAB, Items.BLUE_ICE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_SLAB, DecoBlocks.ICE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.ICE_BRICK_WALL, DecoBlocks.ICE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_WALL, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ICE_BRICK_WALL, DecoBlocks.ICE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.BLACK_ICE)
                .pattern("/#/")
                .pattern("#/#")
                .pattern("/#/")
                .input('/', Items.BLUE_ICE)
                .input('#', Items.PACKED_ICE)
                .criterion(RecipeProvider.hasItem(Items.BLUE_ICE),
                        RecipeProvider.conditionsFromItem(Items.BLUE_ICE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BLACK_ICE)));

        createStairsRecipe(DecoBlocks.CUT_SANDSTONE_STAIRS, Ingredient.ofItems(Items.CUT_SANDSTONE))
                .criterion(hasItem(Items.CUT_SANDSTONE),conditionsFromItem(Items.CUT_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_STAIRS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_STAIRS, Items.CUT_SANDSTONE);

        createStairsRecipe(DecoBlocks.CUT_RED_SANDSTONE_STAIRS, Ingredient.ofItems(Items.CUT_RED_SANDSTONE))
                .criterion(hasItem(Items.CUT_RED_SANDSTONE),conditionsFromItem(Items.CUT_RED_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_RED_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_STAIRS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_STAIRS, Items.CUT_RED_SANDSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_SANDSTONE_WALL, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_WALL, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_WALL, Items.CUT_SANDSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_RED_SANDSTONE_WALL, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_WALL, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_WALL, Items.CUT_RED_SANDSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_SANDSTONE_WALL, Items.SMOOTH_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_SANDSTONE_WALL, Items.SMOOTH_SANDSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_RED_SANDSTONE_WALL, Items.SMOOTH_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_RED_SANDSTONE_WALL, Items.SMOOTH_RED_SANDSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICKS, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICKS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICKS, Items.CUT_SANDSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICKS, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICKS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICKS, Items.CUT_RED_SANDSTONE);

        createStairsRecipe(DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_SANDSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.CUT_SANDSTONE_BRICKS),conditionsFromItem(DecoBlocks.CUT_SANDSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, DecoBlocks.CUT_SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_SANDSTONE_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_WALL, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_WALL, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_SANDSTONE_BRICKS);

        createStairsRecipe(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_RED_SANDSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.CUT_RED_SANDSTONE_BRICKS),conditionsFromItem(DecoBlocks.CUT_RED_SANDSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_PLANKS,2)
                .input(Items.CACTUS)
                .group("planks")
                .criterion(RecipeProvider.hasItem(Items.CACTUS),
                        RecipeProvider.conditionsFromItem(Items.CACTUS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PLANKS)));

        createStairsRecipe(DecoBlocks.CACTUS_PLANK_STAIRS, Ingredient.ofItems(DecoBlocks.CACTUS_PLANKS))
                .group("wooden_stairs")
                .criterion(hasItem(DecoBlocks.CACTUS_PLANKS),conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CACTUS_PLANK_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_PLANK_SLAB,6)
                .pattern("###")
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .group("wooden_slab")
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PLANK_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.CACTUS_PLANK_FENCE,3)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .group("wooden_fence")
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PLANK_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.CACTUS_PLANK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .group("wooden_fence_fence")
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PLANK_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE)
                .pattern("##")
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .group("wooden_pressure_plate")
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.CACTUS_PLANK_BUTTON)
                .input(DecoBlocks.CACTUS_PLANKS)
                .group("wooden_button")
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PLANK_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.CACTUS_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .group("wooden_door")
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.CACTUS_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .group("wooden_trapdoor")
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_TRAPDOOR)));

        createSignRecipe(DecoItems.CACTUS_SIGN, Ingredient.ofItems(DecoBlocks.CACTUS_PLANKS))
                .group("wooden_sign")
                .criterion(hasItem(DecoBlocks.CACTUS_PLANKS),conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoItems.CACTUS_SIGN)));

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE)
                .pattern("##")
                .pattern("##")
                .input('#', Items.PRISMARINE_CRYSTALS)
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_CRYSTALS),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_CRYSTALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRYSTALLIZED_PRISMARINE)));

        createStairsRecipe(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS, Ingredient.ofItems(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .criterion(hasItem(DecoBlocks.CRYSTALLIZED_PRISMARINE),conditionsFromItem(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.CRYSTALLIZED_PRISMARINE), RecipeCategory.BUILDING_BLOCKS, Items.SEA_LANTERN,
                0.35f, 200).criterion(hasItem(DecoBlocks.CRYSTALLIZED_PRISMARINE), conditionsFromItem(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .offerTo(exporter, new Identifier("sea_lantern_from_smelting"));

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        createStairsRecipe(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS))
                .criterion(hasItem(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS),conditionsFromItem(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIGHT_PRISMARINE,8)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('#', DecoBlocks.CRYSTALLIZED_PRISMARINE)
                .input('I', Items.AMETHYST_SHARD)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CRYSTALLIZED_PRISMARINE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .criterion(RecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        RecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.LIGHT_PRISMARINE)));

        createStairsRecipe(DecoBlocks.LIGHT_PRISMARINE_STAIRS, Ingredient.ofItems(DecoBlocks.LIGHT_PRISMARINE))
                .criterion(hasItem(DecoBlocks.LIGHT_PRISMARINE),conditionsFromItem(DecoBlocks.LIGHT_PRISMARINE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_PRISMARINE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_PRISMARINE_STAIRS, DecoBlocks.LIGHT_PRISMARINE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_PRISMARINE_SLAB, DecoBlocks.LIGHT_PRISMARINE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_PRISMARINE_SLAB, DecoBlocks.LIGHT_PRISMARINE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_PRISMARINE_WALL, DecoBlocks.LIGHT_PRISMARINE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_PRISMARINE_WALL, DecoBlocks.LIGHT_PRISMARINE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_PRISMARINE_BRICKS,4)
                .pattern(" # ")
                .pattern("#I#")
                .pattern(" # ")
                .input('#', Items.PRISMARINE_BRICKS)
                .input('I', DecoBlocks.CRYSTALLIZED_PRISMARINE)
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_BRICKS),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHISELED_PRISMARINE_BRICKS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS)
                .pattern(" # ")
                .pattern("#I#")
                .pattern(" # ")
                .input('#', DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)
                .input('I', Items.PRISMARINE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BUBBLE_BLOCK)
                .pattern("#I")
                .pattern("I#")
                .input('#', Items.COBBLESTONE)
                .input('I', DecoItems.BUBBLE_ORB)
                .criterion(RecipeProvider.hasItem(DecoItems.BUBBLE_ORB),
                        RecipeProvider.conditionsFromItem(DecoItems.BUBBLE_ORB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BUBBLE_BLOCK)));

        createStairsRecipe(DecoBlocks.BUBBLE_STAIRS, Ingredient.ofItems(DecoBlocks.BUBBLE_BLOCK))
                .criterion(hasItem(DecoBlocks.BUBBLE_BLOCK),conditionsFromItem(DecoBlocks.BUBBLE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BUBBLE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_STAIRS, DecoBlocks.BUBBLE_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_SLAB, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_SLAB, DecoBlocks.BUBBLE_BLOCK);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BUBBLE_WALL, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_WALL, DecoBlocks.BUBBLE_BLOCK);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICKS, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICKS, DecoBlocks.BUBBLE_BLOCK);

        createStairsRecipe(DecoBlocks.BUBBLE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BUBBLE_BRICKS))
                .criterion(hasItem(DecoBlocks.BUBBLE_BRICKS),conditionsFromItem(DecoBlocks.BUBBLE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BUBBLE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_STAIRS, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_STAIRS, DecoBlocks.BUBBLE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_SLAB, DecoBlocks.BUBBLE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_SLAB, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_SLAB, DecoBlocks.BUBBLE_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BUBBLE_BRICK_WALL, DecoBlocks.BUBBLE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_WALL, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BUBBLE_BRICK_WALL, DecoBlocks.BUBBLE_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BUBBLE_BRICKS, DecoBlocks.BUBBLE_BRICK_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BUBBLE_BRICKS, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BUBBLE_BRICKS, DecoBlocks.BUBBLE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SOUL_SOILSTONE)
                .pattern("##")
                .pattern("##")
                .input('#', DecoTags.Items.SOUL_GROUND_BLOCKS)
                .criterion("has_soul_blocks", conditionsFromTag(DecoTags.Items.SOUL_GROUND_BLOCKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SOUL_SOILSTONE)));

        createStairsRecipe(DecoBlocks.SOUL_SOILSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE))
                .criterion(hasItem(DecoBlocks.SOUL_SOILSTONE),conditionsFromItem(DecoBlocks.SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SOUL_SOILSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_STAIRS, DecoBlocks.SOUL_SOILSTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);

        createStairsRecipe(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_SOUL_SOILSTONE))
                .criterion(hasItem(DecoBlocks.CUT_SOUL_SOILSTONE),conditionsFromItem(DecoBlocks.CUT_SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS, DecoBlocks.CUT_SOUL_SOILSTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_SOUL_SOILSTONE_WALL, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_WALL, DecoBlocks.CUT_SOUL_SOILSTONE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_SOUL_SOILSTONE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.SOUL_SOILSTONE), conditionsFromItem(DecoBlocks.SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier("smooth_soul_soilstone_from_smelting"));

        createStairsRecipe(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_SOUL_SOILSTONE))
                .criterion(hasItem(DecoBlocks.SMOOTH_SOUL_SOILSTONE),conditionsFromItem(DecoBlocks.SMOOTH_SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS, DecoBlocks.SMOOTH_SOUL_SOILSTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB, DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB, DecoBlocks.SMOOTH_SOUL_SOILSTONE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL, DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL, DecoBlocks.SMOOTH_SOUL_SOILSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS, DecoBlocks.CUT_SOUL_SOILSTONE);

        createStairsRecipe(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS),conditionsFromItem(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.QUARTZ_WALL, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_WALL, Items.QUARTZ_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_QUARTZ_WALL, Items.SMOOTH_QUARTZ);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_QUARTZ_WALL, Items.SMOOTH_QUARTZ);

        createStairsRecipe(DecoBlocks.QUARTZ_BRICK_STAIRS, Ingredient.ofItems(Items.QUARTZ_BRICKS))
                .criterion(hasItem(Items.QUARTZ_BRICKS),conditionsFromItem(Items.QUARTZ_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.QUARTZ_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_STAIRS, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_STAIRS, Items.QUARTZ_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_SLAB, Items.QUARTZ_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_SLAB, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_SLAB, Items.QUARTZ_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.QUARTZ_BRICK_WALL, Items.QUARTZ_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_WALL, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.QUARTZ_BRICK_WALL, Items.QUARTZ_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ,4)
                .pattern("#Q")
                .pattern("Q#")
                .input('#', Items.QUARTZ_BLOCK)
                .input('Q', Items.QUARTZ)
                .criterion(RecipeProvider.hasItem(Items.QUARTZ_BLOCK),
                        RecipeProvider.conditionsFromItem(Items.QUARTZ_BLOCK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CUT_QUARTZ)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ, Items.QUARTZ_BLOCK);

        createStairsRecipe(DecoBlocks.CUT_QUARTZ_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_QUARTZ))
                .criterion(hasItem(DecoBlocks.CUT_QUARTZ),conditionsFromItem(DecoBlocks.CUT_QUARTZ))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_QUARTZ_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_STAIRS, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_STAIRS, DecoBlocks.CUT_QUARTZ);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_SLAB, DecoBlocks.CUT_QUARTZ);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_SLAB, Items.QUARTZ_BLOCK,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_SLAB, DecoBlocks.CUT_QUARTZ,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_QUARTZ_WALL, DecoBlocks.CUT_QUARTZ);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_WALL, Items.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_QUARTZ_WALL, DecoBlocks.CUT_QUARTZ);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,Items.WARPED_WART_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', DecoItems.WARPED_WART)
                .criterion(RecipeProvider.hasItem(DecoItems.WARPED_WART),
                        RecipeProvider.conditionsFromItem(DecoItems.WARPED_WART))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.WARPED_WART_BLOCK)));

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_RED_NETHER_BRICKS, Items.RED_NETHER_BRICK_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_RED_NETHER_BRICKS, Items.RED_NETHER_BRICKS);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_NETHER_BRICKS),RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICKS,
                        0.1f, 200).criterion(hasItem(Items.RED_NETHER_BRICKS), conditionsFromItem(Items.RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier("cracked_red_nether_bricks_from_smelting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_NETHER_BRICKS)
                .pattern("N#")
                .pattern("#N")
                .input('#', DecoItems.WARPED_WART)
                .input('N', Items.NETHER_BRICK)
                .criterion(RecipeProvider.hasItem(DecoItems.WARPED_WART),
                        RecipeProvider.conditionsFromItem(DecoItems.WARPED_WART))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BLUE_NETHER_BRICKS)));

        createStairsRecipe(DecoBlocks.BLUE_NETHER_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICKS))
                .criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICKS),conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_NETHER_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_NETHER_BRICK_STAIRS, DecoBlocks.BLUE_NETHER_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_NETHER_BRICK_SLAB, DecoBlocks.BLUE_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_NETHER_BRICK_SLAB, DecoBlocks.BLUE_NETHER_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLUE_NETHER_BRICK_WALL, DecoBlocks.BLUE_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_NETHER_BRICK_WALL, DecoBlocks.BLUE_NETHER_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.BLUE_NETHER_BRICK_FENCE,6)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.BLUE_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BLUE_NETHER_BRICK_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.BLUE_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE)));

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BLUE_NETHER_BRICKS, DecoBlocks.BLUE_NETHER_BRICK_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BLUE_NETHER_BRICKS, DecoBlocks.BLUE_NETHER_BRICKS);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICKS),RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICKS), conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.ENDER_PEARL)
                .pattern(" # ")
                .pattern("#F#")
                .pattern(" # ")
                .input('#', DecoItems.WARPED_WART)
                .input('F', Items.CHORUS_FRUIT)
                .criterion(RecipeProvider.hasItem(Items.CHORUS_FRUIT),
                        RecipeProvider.conditionsFromItem(Items.CHORUS_FRUIT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.ENDER_PEARL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.ENDER_EYE)
                .pattern(" # ")
                .pattern("#F#")
                .pattern(" #B")
                .input('#', DecoItems.WARPED_WART)
                .input('F', Items.CHORUS_FRUIT)
                .input('B', Items.BLAZE_POWDER)
                .criterion(RecipeProvider.hasItem(Items.CHORUS_FRUIT),
                        RecipeProvider.conditionsFromItem(Items.CHORUS_FRUIT))
                .offerTo(exporter, new Identifier("ender_eye_from_warped_wart"));

        createStairsRecipe(DecoBlocks.TERRACOTTA_STAIRS, Ingredient.ofItems(Items.TERRACOTTA))
                .criterion(hasItem(Items.TERRACOTTA),conditionsFromItem(Items.TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_STAIRS, Items.TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_SLAB, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_SLAB, Items.TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.TERRACOTTA_WALL, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_WALL, Items.TERRACOTTA);

        createStairsRecipe(DecoBlocks.WHITE_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.WHITE_TERRACOTTA))
                .criterion(hasItem(Items.WHITE_TERRACOTTA),conditionsFromItem(Items.WHITE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WHITE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_STAIRS, Items.WHITE_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_SLAB, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_SLAB, Items.WHITE_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.WHITE_TERRACOTTA_WALL, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_WALL, Items.WHITE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.BLACK_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.BLACK_TERRACOTTA))
                .criterion(hasItem(Items.BLACK_TERRACOTTA),conditionsFromItem(Items.BLACK_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACK_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_STAIRS, Items.BLACK_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_SLAB, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_SLAB, Items.BLACK_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLACK_TERRACOTTA_WALL, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_WALL, Items.BLACK_TERRACOTTA);

        createStairsRecipe(DecoBlocks.GRAY_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.GRAY_TERRACOTTA))
                .criterion(hasItem(Items.GRAY_TERRACOTTA),conditionsFromItem(Items.GRAY_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GRAY_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_STAIRS, Items.GRAY_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_SLAB, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_SLAB, Items.GRAY_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.GRAY_TERRACOTTA_WALL, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_WALL, Items.GRAY_TERRACOTTA);

        createStairsRecipe(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.LIGHT_GRAY_TERRACOTTA))
                .criterion(hasItem(Items.LIGHT_GRAY_TERRACOTTA),conditionsFromItem(Items.LIGHT_GRAY_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Items.LIGHT_GRAY_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Items.LIGHT_GRAY_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Items.LIGHT_GRAY_TERRACOTTA);

        createStairsRecipe(DecoBlocks.BROWN_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.BROWN_TERRACOTTA))
                .criterion(hasItem(Items.BROWN_TERRACOTTA),conditionsFromItem(Items.BROWN_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BROWN_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_STAIRS, Items.BROWN_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_SLAB, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_SLAB, Items.BROWN_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BROWN_TERRACOTTA_WALL, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_WALL, Items.BROWN_TERRACOTTA);

        createStairsRecipe(DecoBlocks.RED_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.RED_TERRACOTTA))
                .criterion(hasItem(Items.RED_TERRACOTTA),conditionsFromItem(Items.RED_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RED_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_STAIRS, Items.RED_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_SLAB, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_SLAB, Items.RED_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.RED_TERRACOTTA_WALL, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_WALL, Items.RED_TERRACOTTA);

        createStairsRecipe(DecoBlocks.ORANGE_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.ORANGE_TERRACOTTA))
                .criterion(hasItem(Items.ORANGE_TERRACOTTA),conditionsFromItem(Items.ORANGE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ORANGE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_STAIRS, Items.ORANGE_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_SLAB, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_SLAB, Items.ORANGE_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.ORANGE_TERRACOTTA_WALL, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_WALL, Items.ORANGE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.YELLOW_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.YELLOW_TERRACOTTA))
                .criterion(hasItem(Items.YELLOW_TERRACOTTA),conditionsFromItem(Items.YELLOW_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.YELLOW_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_STAIRS, Items.YELLOW_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_SLAB, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_SLAB, Items.YELLOW_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.YELLOW_TERRACOTTA_WALL, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_WALL, Items.YELLOW_TERRACOTTA);

        createStairsRecipe(DecoBlocks.LIME_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.LIME_TERRACOTTA))
                .criterion(hasItem(Items.LIME_TERRACOTTA),conditionsFromItem(Items.LIME_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIME_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_STAIRS, Items.LIME_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_SLAB, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_SLAB, Items.LIME_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIME_TERRACOTTA_WALL, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_WALL, Items.LIME_TERRACOTTA);

        createStairsRecipe(DecoBlocks.GREEN_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.GREEN_TERRACOTTA))
                .criterion(hasItem(Items.GREEN_TERRACOTTA),conditionsFromItem(Items.GREEN_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GREEN_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_STAIRS, Items.GREEN_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_SLAB, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_SLAB, Items.GREEN_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.GREEN_TERRACOTTA_WALL, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_WALL, Items.GREEN_TERRACOTTA);

        createStairsRecipe(DecoBlocks.CYAN_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.CYAN_TERRACOTTA))
                .criterion(hasItem(Items.CYAN_TERRACOTTA),conditionsFromItem(Items.CYAN_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CYAN_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_STAIRS, Items.CYAN_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_SLAB, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_SLAB, Items.CYAN_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CYAN_TERRACOTTA_WALL, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_WALL, Items.CYAN_TERRACOTTA);

        createStairsRecipe(DecoBlocks.BLUE_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.BLUE_TERRACOTTA))
                .criterion(hasItem(Items.BLUE_TERRACOTTA),conditionsFromItem(Items.BLUE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_STAIRS, Items.BLUE_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_SLAB, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_SLAB, Items.BLUE_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLUE_TERRACOTTA_WALL, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_WALL, Items.BLUE_TERRACOTTA,2);

        createStairsRecipe(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.LIGHT_BLUE_TERRACOTTA))
                .criterion(hasItem(Items.LIGHT_BLUE_TERRACOTTA),conditionsFromItem(Items.LIGHT_BLUE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Items.LIGHT_BLUE_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Items.LIGHT_BLUE_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Items.LIGHT_BLUE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.PURPLE_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.PURPLE_TERRACOTTA))
                .criterion(hasItem(Items.PURPLE_TERRACOTTA),conditionsFromItem(Items.PURPLE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PURPLE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_STAIRS, Items.PURPLE_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_SLAB, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_SLAB, Items.PURPLE_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PURPLE_TERRACOTTA_WALL, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_WALL, Items.PURPLE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.MAGENTA_TERRACOTTA))
                .criterion(hasItem(Items.MAGENTA_TERRACOTTA),conditionsFromItem(Items.MAGENTA_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_STAIRS, Items.MAGENTA_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_SLAB, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_SLAB, Items.MAGENTA_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.MAGENTA_TERRACOTTA_WALL, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_WALL, Items.MAGENTA_TERRACOTTA);

        createStairsRecipe(DecoBlocks.PINK_TERRACOTTA_STAIRS, Ingredient.ofItems(Items.PINK_TERRACOTTA))
                .criterion(hasItem(Items.PINK_TERRACOTTA),conditionsFromItem(Items.PINK_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PINK_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_STAIRS, Items.PINK_TERRACOTTA);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_SLAB, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_SLAB, Items.PINK_TERRACOTTA,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PINK_TERRACOTTA_WALL, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_WALL, Items.PINK_TERRACOTTA);

        createStairsRecipe(DecoBlocks.WHITE_CONCRETE_STAIRS, Ingredient.ofItems(Items.WHITE_CONCRETE))
                .criterion(hasItem(Items.WHITE_CONCRETE),conditionsFromItem(Items.WHITE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WHITE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_STAIRS, Items.WHITE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_SLAB, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_SLAB, Items.WHITE_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.WHITE_CONCRETE_WALL, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_WALL, Items.WHITE_CONCRETE);

        createStairsRecipe(DecoBlocks.BLACK_CONCRETE_STAIRS, Ingredient.ofItems(Items.BLACK_CONCRETE))
                .criterion(hasItem(Items.BLACK_CONCRETE),conditionsFromItem(Items.BLACK_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_STAIRS, Items.BLACK_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_SLAB, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_SLAB, Items.BLACK_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLACK_CONCRETE_WALL, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_WALL, Items.BLACK_CONCRETE);

        createStairsRecipe(DecoBlocks.GRAY_CONCRETE_STAIRS, Ingredient.ofItems(Items.GRAY_CONCRETE))
                .criterion(hasItem(Items.GRAY_CONCRETE),conditionsFromItem(Items.GRAY_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_STAIRS, Items.GRAY_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_SLAB, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_SLAB, Items.GRAY_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.GRAY_CONCRETE_WALL, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_WALL, Items.GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.ofItems(Items.LIGHT_GRAY_CONCRETE))
                .criterion(hasItem(Items.LIGHT_GRAY_CONCRETE),conditionsFromItem(Items.LIGHT_GRAY_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Items.LIGHT_GRAY_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB, Items.LIGHT_GRAY_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_GRAY_CONCRETE_WALL, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_WALL, Items.LIGHT_GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.BROWN_CONCRETE_STAIRS, Ingredient.ofItems(Items.BROWN_CONCRETE))
                .criterion(hasItem(Items.BROWN_CONCRETE),conditionsFromItem(Items.BROWN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BROWN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_STAIRS, Items.BROWN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_SLAB, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_SLAB, Items.BROWN_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BROWN_CONCRETE_WALL, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_WALL, Items.BROWN_CONCRETE);

        createStairsRecipe(DecoBlocks.RED_CONCRETE_STAIRS, Ingredient.ofItems(Items.RED_CONCRETE))
                .criterion(hasItem(Items.RED_CONCRETE),conditionsFromItem(Items.RED_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RED_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_STAIRS, Items.RED_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_SLAB, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_SLAB, Items.RED_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.RED_CONCRETE_WALL, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_WALL, Items.RED_CONCRETE);

        createStairsRecipe(DecoBlocks.ORANGE_CONCRETE_STAIRS, Ingredient.ofItems(Items.ORANGE_CONCRETE))
                .criterion(hasItem(Items.ORANGE_CONCRETE),conditionsFromItem(Items.ORANGE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ORANGE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_STAIRS, Items.ORANGE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_SLAB, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_SLAB, Items.ORANGE_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.ORANGE_CONCRETE_WALL, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_WALL, Items.ORANGE_CONCRETE);

        createStairsRecipe(DecoBlocks.YELLOW_CONCRETE_STAIRS, Ingredient.ofItems(Items.YELLOW_CONCRETE))
                .criterion(hasItem(Items.YELLOW_CONCRETE),conditionsFromItem(Items.YELLOW_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.YELLOW_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_STAIRS, Items.YELLOW_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_SLAB, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_SLAB, Items.YELLOW_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.YELLOW_CONCRETE_WALL, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_WALL, Items.YELLOW_CONCRETE);

        createStairsRecipe(DecoBlocks.LIME_CONCRETE_STAIRS, Ingredient.ofItems(Items.LIME_CONCRETE))
                .criterion(hasItem(Items.LIME_CONCRETE),conditionsFromItem(Items.LIME_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIME_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_STAIRS, Items.LIME_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_SLAB, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_SLAB, Items.LIME_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIME_CONCRETE_WALL, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_WALL, Items.LIME_CONCRETE);

        createStairsRecipe(DecoBlocks.GREEN_CONCRETE_STAIRS, Ingredient.ofItems(Items.GREEN_CONCRETE))
                .criterion(hasItem(Items.GREEN_CONCRETE),conditionsFromItem(Items.GREEN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GREEN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_STAIRS, Items.GREEN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_SLAB, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_SLAB, Items.GREEN_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.GREEN_CONCRETE_WALL, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_WALL, Items.GREEN_CONCRETE);

        createStairsRecipe(DecoBlocks.CYAN_CONCRETE_STAIRS, Ingredient.ofItems(Items.CYAN_CONCRETE))
                .criterion(hasItem(Items.CYAN_CONCRETE),conditionsFromItem(Items.CYAN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CYAN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_STAIRS, Items.CYAN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_SLAB, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_SLAB, Items.CYAN_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CYAN_CONCRETE_WALL, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_WALL, Items.CYAN_CONCRETE);

        createStairsRecipe(DecoBlocks.BLUE_CONCRETE_STAIRS, Ingredient.ofItems(Items.BLUE_CONCRETE))
                .criterion(hasItem(Items.BLUE_CONCRETE),conditionsFromItem(Items.BLUE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_STAIRS, Items.BLUE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_SLAB, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_SLAB, Items.BLUE_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLUE_CONCRETE_WALL, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_WALL, Items.BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.ofItems(Items.LIGHT_BLUE_CONCRETE))
                .criterion(hasItem(Items.LIGHT_BLUE_CONCRETE),conditionsFromItem(Items.LIGHT_BLUE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Items.LIGHT_BLUE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB, Items.LIGHT_BLUE_CONCRETE);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_BLUE_CONCRETE_WALL, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_WALL, Items.LIGHT_BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.PURPLE_CONCRETE_STAIRS, Ingredient.ofItems(Items.PURPLE_CONCRETE))
                .criterion(hasItem(Items.PURPLE_CONCRETE),conditionsFromItem(Items.PURPLE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PURPLE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_STAIRS, Items.PURPLE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_SLAB, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_SLAB, Items.PURPLE_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PURPLE_CONCRETE_WALL, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_WALL, Items.PURPLE_CONCRETE);

        createStairsRecipe(DecoBlocks.MAGENTA_CONCRETE_STAIRS, Ingredient.ofItems(Items.MAGENTA_CONCRETE))
                .criterion(hasItem(Items.MAGENTA_CONCRETE),conditionsFromItem(Items.MAGENTA_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGENTA_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_STAIRS, Items.MAGENTA_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_SLAB, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_SLAB, Items.MAGENTA_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.MAGENTA_CONCRETE_WALL, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_WALL, Items.MAGENTA_CONCRETE);

        createStairsRecipe(DecoBlocks.PINK_CONCRETE_STAIRS, Ingredient.ofItems(Items.PINK_CONCRETE))
                .criterion(hasItem(Items.PINK_CONCRETE),conditionsFromItem(Items.PINK_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PINK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_STAIRS, Items.PINK_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_SLAB, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_SLAB, Items.PINK_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PINK_CONCRETE_WALL, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_WALL, Items.PINK_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICKS, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICKS, Items.TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.WHITE_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_white_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICKS, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICKS, Items.WHITE_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.LIGHT_GRAY_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_light_gray_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS, Items.LIGHT_GRAY_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.GRAY_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_gray_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICKS, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICKS, Items.GRAY_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.BLACK_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_black_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICKS, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICKS, Items.BLACK_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.BROWN_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_brown_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICKS, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICKS, Items.BROWN_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.RED_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_red_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICKS, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICKS, Items.RED_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.ORANGE_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_orange_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICKS, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICKS, Items.ORANGE_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.YELLOW_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_yellow_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICKS, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICKS, Items.YELLOW_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.LIME_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_lime_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICKS, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICKS, Items.LIME_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.GREEN_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_green_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICKS, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICKS, Items.GREEN_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.CYAN_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_cyan_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICKS, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICKS, Items.CYAN_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.LIGHT_BLUE_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_light_blue_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS, Items.LIGHT_BLUE_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.BLUE_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_blue_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICKS, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICKS, Items.BLUE_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.PURPLE_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_purple_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICKS, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICKS, Items.PURPLE_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.MAGENTA_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_magenta_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICKS, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICKS, Items.MAGENTA_TERRACOTTA);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICKS)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('#', DecoBlocks.TERRACOTTA_BRICKS)
                .input('X', Items.PINK_DYE)
                .group("terracotta_bricks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TERRACOTTA_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .group("terracotta_bricks")
                .offerTo(exporter, new Identifier("dye_pink_terracotta_bricks"));
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICKS, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICKS, Items.PINK_TERRACOTTA);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE, Items.WHITE_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE, Items.LIGHT_GRAY_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE, Items.GRAY_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE, Items.BLACK_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE, Items.BROWN_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE, Items.RED_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE, Items.ORANGE_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE, Items.YELLOW_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE, Items.LIME_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE, Items.GREEN_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE, Items.CYAN_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE, Items.LIGHT_BLUE_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE, Items.BLUE_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE, Items.PURPLE_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE, Items.MAGENTA_CONCRETE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE, Items.PINK_CONCRETE);

        createStairsRecipe(DecoBlocks.TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_STAIRS, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_STAIRS, DecoBlocks.TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_SLAB, DecoBlocks.TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_SLAB, Items.TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_SLAB, DecoBlocks.TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.TERRACOTTA_BRICK_WALL, DecoBlocks.TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_WALL, Items.TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.TERRACOTTA_BRICK_WALL, DecoBlocks.TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.WHITE_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.WHITE_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.WHITE_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.WHITE_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB, DecoBlocks.WHITE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB, Items.WHITE_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_SLAB, DecoBlocks.WHITE_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL, DecoBlocks.WHITE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL, Items.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_TERRACOTTA_BRICK_WALL, DecoBlocks.WHITE_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BLACK_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.BLACK_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.BLACK_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_STAIRS, DecoBlocks.BLACK_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLACK_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB, Items.BLACK_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLACK_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL, DecoBlocks.BLACK_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL, Items.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_TERRACOTTA_BRICK_WALL, DecoBlocks.BLACK_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.GRAY_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.GRAY_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.GRAY_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_STAIRS, DecoBlocks.GRAY_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.GRAY_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB, Items.GRAY_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.GRAY_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.GRAY_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL, Items.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.GRAY_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_STAIRS, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, Items.LIGHT_GRAY_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, Items.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BROWN_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.BROWN_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.BROWN_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_STAIRS, DecoBlocks.BROWN_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB, DecoBlocks.BROWN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB, Items.BROWN_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_SLAB, DecoBlocks.BROWN_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL, DecoBlocks.BROWN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL, Items.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_TERRACOTTA_BRICK_WALL, DecoBlocks.BROWN_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.RED_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.RED_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.RED_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_STAIRS, DecoBlocks.RED_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_SLAB, DecoBlocks.RED_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_SLAB, Items.RED_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_SLAB, DecoBlocks.RED_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.RED_TERRACOTTA_BRICK_WALL, DecoBlocks.RED_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_WALL, Items.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_TERRACOTTA_BRICK_WALL, DecoBlocks.RED_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.ORANGE_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.ORANGE_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.ORANGE_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, Items.ORANGE_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_SLAB, DecoBlocks.ORANGE_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL, Items.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_TERRACOTTA_BRICK_WALL, DecoBlocks.ORANGE_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.YELLOW_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.YELLOW_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.YELLOW_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_STAIRS, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, Items.YELLOW_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_SLAB, DecoBlocks.YELLOW_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL, Items.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_TERRACOTTA_BRICK_WALL, DecoBlocks.YELLOW_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.LIME_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.LIME_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.LIME_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_STAIRS, DecoBlocks.LIME_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIME_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB, Items.LIME_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIME_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIME_TERRACOTTA_BRICK_WALL, DecoBlocks.LIME_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_WALL, Items.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_TERRACOTTA_BRICK_WALL, DecoBlocks.LIME_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.GREEN_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.GREEN_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.GREEN_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_STAIRS, DecoBlocks.GREEN_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB, DecoBlocks.GREEN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB, Items.GREEN_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_SLAB, DecoBlocks.GREEN_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL, DecoBlocks.GREEN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL, Items.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_TERRACOTTA_BRICK_WALL, DecoBlocks.GREEN_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CYAN_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.CYAN_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.CYAN_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_STAIRS, DecoBlocks.CYAN_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB, DecoBlocks.CYAN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB, Items.CYAN_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_SLAB, DecoBlocks.CYAN_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL, DecoBlocks.CYAN_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL, Items.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_TERRACOTTA_BRICK_WALL, DecoBlocks.CYAN_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BLUE_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.BLUE_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.BLUE_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.BLUE_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLUE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB, Items.BLUE_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.BLUE_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.BLUE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL, Items.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.BLUE_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, Items.LIGHT_BLUE_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_SLAB, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, Items.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICK_WALL, DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.PURPLE_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.PURPLE_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.PURPLE_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_STAIRS, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, Items.PURPLE_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_SLAB, DecoBlocks.PURPLE_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL, Items.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_TERRACOTTA_BRICK_WALL, DecoBlocks.PURPLE_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_STAIRS, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, Items.MAGENTA_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_SLAB, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL, Items.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_TERRACOTTA_BRICK_WALL, DecoBlocks.MAGENTA_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.PINK_TERRACOTTA_BRICKS))
                .criterion(hasItem(DecoBlocks.PINK_TERRACOTTA_BRICKS),conditionsFromItem(DecoBlocks.PINK_TERRACOTTA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_STAIRS, DecoBlocks.PINK_TERRACOTTA_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB, DecoBlocks.PINK_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB, Items.PINK_TERRACOTTA,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_SLAB, DecoBlocks.PINK_TERRACOTTA_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PINK_TERRACOTTA_BRICK_WALL, DecoBlocks.PINK_TERRACOTTA_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_WALL, Items.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_TERRACOTTA_BRICK_WALL, DecoBlocks.PINK_TERRACOTTA_BRICKS);

        createStairsRecipe(DecoBlocks.CUT_WHITE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_WHITE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_WHITE_CONCRETE),conditionsFromItem(DecoBlocks.CUT_WHITE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_WHITE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_STAIRS, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_STAIRS, DecoBlocks.CUT_WHITE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_SLAB, DecoBlocks.CUT_WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_SLAB, Items.WHITE_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_SLAB, DecoBlocks.CUT_WHITE_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_WHITE_CONCRETE_WALL, DecoBlocks.CUT_WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_WALL, Items.WHITE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_WHITE_CONCRETE_WALL, DecoBlocks.CUT_WHITE_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_BLACK_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_BLACK_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_BLACK_CONCRETE),conditionsFromItem(DecoBlocks.CUT_BLACK_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_BLACK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_STAIRS, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_STAIRS, DecoBlocks.CUT_BLACK_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_SLAB, DecoBlocks.CUT_BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_SLAB, Items.BLACK_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_SLAB, DecoBlocks.CUT_BLACK_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_BLACK_CONCRETE_WALL, DecoBlocks.CUT_BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_WALL, Items.BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLACK_CONCRETE_WALL, DecoBlocks.CUT_BLACK_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_GRAY_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_GRAY_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_GRAY_CONCRETE),conditionsFromItem(DecoBlocks.CUT_GRAY_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_STAIRS, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_STAIRS, DecoBlocks.CUT_GRAY_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_SLAB, Items.GRAY_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_GRAY_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_WALL, Items.GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE),conditionsFromItem(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_STAIRS, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB, Items.LIGHT_GRAY_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL, Items.LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_BROWN_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_BROWN_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_BROWN_CONCRETE),conditionsFromItem(DecoBlocks.CUT_BROWN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_BROWN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_STAIRS, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_STAIRS, DecoBlocks.CUT_BROWN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_SLAB, DecoBlocks.CUT_BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_SLAB, Items.BROWN_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_SLAB, DecoBlocks.CUT_BROWN_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_BROWN_CONCRETE_WALL, DecoBlocks.CUT_BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_WALL, Items.BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BROWN_CONCRETE_WALL, DecoBlocks.CUT_BROWN_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_RED_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_RED_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_RED_CONCRETE),conditionsFromItem(DecoBlocks.CUT_RED_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_RED_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_STAIRS, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_STAIRS, DecoBlocks.CUT_RED_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_SLAB, DecoBlocks.CUT_RED_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_SLAB, Items.RED_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_SLAB, DecoBlocks.CUT_RED_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_RED_CONCRETE_WALL, DecoBlocks.CUT_RED_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_WALL, Items.RED_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_RED_CONCRETE_WALL, DecoBlocks.CUT_RED_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_ORANGE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_ORANGE_CONCRETE),conditionsFromItem(DecoBlocks.CUT_ORANGE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS, Items.ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_STAIRS, DecoBlocks.CUT_ORANGE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_SLAB, DecoBlocks.CUT_ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_SLAB, Items.ORANGE_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_SLAB, DecoBlocks.CUT_ORANGE_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_ORANGE_CONCRETE_WALL, DecoBlocks.CUT_ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_WALL, Items.ORANGE_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_ORANGE_CONCRETE_WALL, DecoBlocks.CUT_ORANGE_CONCRETE,2);

        createStairsRecipe(DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_YELLOW_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_YELLOW_CONCRETE),conditionsFromItem(DecoBlocks.CUT_YELLOW_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_STAIRS, DecoBlocks.CUT_YELLOW_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_SLAB, DecoBlocks.CUT_YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_SLAB, Items.YELLOW_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_SLAB, DecoBlocks.CUT_YELLOW_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_YELLOW_CONCRETE_WALL, DecoBlocks.CUT_YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_WALL, Items.YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_YELLOW_CONCRETE_WALL, DecoBlocks.CUT_YELLOW_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_LIME_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_LIME_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_LIME_CONCRETE),conditionsFromItem(DecoBlocks.CUT_LIME_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_LIME_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_STAIRS, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_STAIRS, DecoBlocks.CUT_LIME_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_SLAB, DecoBlocks.CUT_LIME_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_SLAB, Items.LIME_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_SLAB, DecoBlocks.CUT_LIME_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_LIME_CONCRETE_WALL, DecoBlocks.CUT_LIME_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_WALL, Items.LIME_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIME_CONCRETE_WALL, DecoBlocks.CUT_LIME_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_GREEN_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_GREEN_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_GREEN_CONCRETE),conditionsFromItem(DecoBlocks.CUT_GREEN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_GREEN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_STAIRS, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_STAIRS, DecoBlocks.CUT_GREEN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_SLAB, DecoBlocks.CUT_GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_SLAB, Items.GREEN_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_SLAB, DecoBlocks.CUT_GREEN_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_GREEN_CONCRETE_WALL, DecoBlocks.CUT_GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_WALL, Items.GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_GREEN_CONCRETE_WALL, DecoBlocks.CUT_GREEN_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_CYAN_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_CYAN_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_CYAN_CONCRETE),conditionsFromItem(DecoBlocks.CUT_CYAN_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_CYAN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_STAIRS, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_STAIRS, DecoBlocks.CUT_CYAN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_SLAB, DecoBlocks.CUT_CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_SLAB, Items.CYAN_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_SLAB, DecoBlocks.CUT_CYAN_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_CYAN_CONCRETE_WALL, DecoBlocks.CUT_CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_WALL, Items.CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_CYAN_CONCRETE_WALL, DecoBlocks.CUT_CYAN_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_BLUE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_BLUE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_BLUE_CONCRETE),conditionsFromItem(DecoBlocks.CUT_BLUE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_STAIRS, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_STAIRS, DecoBlocks.CUT_BLUE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_SLAB, Items.BLUE_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_BLUE_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_WALL, Items.BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE),conditionsFromItem(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_STAIRS, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB, Items.LIGHT_BLUE_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL, Items.LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_PURPLE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_PURPLE_CONCRETE),conditionsFromItem(DecoBlocks.CUT_PURPLE_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_STAIRS, DecoBlocks.CUT_PURPLE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_SLAB, DecoBlocks.CUT_PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_SLAB, Items.PURPLE_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_SLAB, DecoBlocks.CUT_PURPLE_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_PURPLE_CONCRETE_WALL, DecoBlocks.CUT_PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_WALL, Items.PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PURPLE_CONCRETE_WALL, DecoBlocks.CUT_PURPLE_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_MAGENTA_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_MAGENTA_CONCRETE),conditionsFromItem(DecoBlocks.CUT_MAGENTA_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_STAIRS, DecoBlocks.CUT_MAGENTA_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB, DecoBlocks.CUT_MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB, Items.MAGENTA_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_SLAB, DecoBlocks.CUT_MAGENTA_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_MAGENTA_CONCRETE_WALL, DecoBlocks.CUT_MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_WALL, Items.MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_MAGENTA_CONCRETE_WALL, DecoBlocks.CUT_MAGENTA_CONCRETE);

        createStairsRecipe(DecoBlocks.CUT_PINK_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_PINK_CONCRETE))
                .criterion(hasItem(DecoBlocks.CUT_PINK_CONCRETE),conditionsFromItem(DecoBlocks.CUT_PINK_CONCRETE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_PINK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_STAIRS, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_STAIRS, DecoBlocks.CUT_PINK_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_SLAB, DecoBlocks.CUT_PINK_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_SLAB, Items.PINK_CONCRETE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_SLAB, DecoBlocks.CUT_PINK_CONCRETE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.CUT_PINK_CONCRETE_WALL, DecoBlocks.CUT_PINK_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_WALL, Items.PINK_CONCRETE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_PINK_CONCRETE_WALL, DecoBlocks.CUT_PINK_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_PILLAR, DecoBlocks.WHITE_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WHITE_CONCRETE_PILLAR, Items.WHITE_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_PILLAR, DecoBlocks.LIGHT_GRAY_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_GRAY_CONCRETE_PILLAR, Items.LIGHT_GRAY_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_PILLAR, DecoBlocks.GRAY_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GRAY_CONCRETE_PILLAR, Items.GRAY_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_PILLAR, DecoBlocks.BLACK_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACK_CONCRETE_PILLAR, Items.BLACK_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_PILLAR, DecoBlocks.BROWN_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BROWN_CONCRETE_PILLAR, Items.BROWN_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_PILLAR, DecoBlocks.RED_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_CONCRETE_PILLAR, Items.RED_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_PILLAR, DecoBlocks.ORANGE_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ORANGE_CONCRETE_PILLAR, Items.ORANGE_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_PILLAR, DecoBlocks.YELLOW_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.YELLOW_CONCRETE_PILLAR, Items.YELLOW_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_PILLAR, DecoBlocks.LIME_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIME_CONCRETE_PILLAR, Items.LIME_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_PILLAR, DecoBlocks.GREEN_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GREEN_CONCRETE_PILLAR, Items.GREEN_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_PILLAR, DecoBlocks.CYAN_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CYAN_CONCRETE_PILLAR, Items.CYAN_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_PILLAR, DecoBlocks.LIGHT_BLUE_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.LIGHT_BLUE_CONCRETE_PILLAR, Items.LIGHT_BLUE_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_PILLAR, DecoBlocks.BLUE_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLUE_CONCRETE_PILLAR, Items.BLUE_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_PILLAR, DecoBlocks.PURPLE_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPLE_CONCRETE_PILLAR, Items.PURPLE_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_PILLAR, DecoBlocks.MAGENTA_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MAGENTA_CONCRETE_PILLAR, Items.MAGENTA_CONCRETE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_PILLAR, DecoBlocks.PINK_CONCRETE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PINK_CONCRETE_PILLAR, Items.PINK_CONCRETE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.TINTED_GLASS_PANE,6)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.AMETHYST_SHARD)
                .input('X', Items.GLASS_PANE)
                .group("tinted_glass_pane")
                .criterion(RecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        RecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier("tinted_glass_pane_amethyst_shard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.TINTED_GLASS_PANE,18)
                .pattern("###")
                .pattern("###")
                .input('#', Items.TINTED_GLASS)
                .group("tinted_glass_pane")
                .criterion(RecipeProvider.hasItem(Items.TINTED_GLASS),
                        RecipeProvider.conditionsFromItem(Items.TINTED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.TINTED_GLASS_PANE)));

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_GLASS, Items.GLASS);

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_GLASS_PANE, DecoBlocks.HARDENED_GLASS);

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_GLASS_PANE, Items.GLASS_PANE);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_TINTED_GLASS, Items.TINTED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_TINTED_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.AMETHYST_SHARD)
                .input('X', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        RecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_TINTED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_TINTED_GLASS_PANE, DecoBlocks.TINTED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_TINTED_GLASS_PANE,6)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.AMETHYST_SHARD)
                .input('X', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(Items.AMETHYST_SHARD),
                        RecipeProvider.conditionsFromItem(Items.AMETHYST_SHARD))
                .offerTo(exporter, new Identifier("hardened_tinted_glass_pane_amethyst_shard"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.HARDENED_TINTED_GLASS_PANE,18)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.HARDENED_TINTED_GLASS)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_TINTED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_TINTED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_TINTED_GLASS_PANE)));

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_WHITE_STAINED_GLASS, Items.WHITE_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_WHITE_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.WHITE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_WHITE_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE, Items.WHITE_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.WHITE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_white_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE, DecoBlocks.HARDENED_WHITE_STAINED_GLASS);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_ORANGE_STAINED_GLASS, Items.ORANGE_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_ORANGE_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.ORANGE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE, Items.ORANGE_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.ORANGE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_orange_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE, DecoBlocks.HARDENED_ORANGE_STAINED_GLASS);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS, Items.MAGENTA_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.MAGENTA_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE, Items.MAGENTA_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.MAGENTA_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_magenta_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE, DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS, Items.LIGHT_BLUE_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.LIGHT_BLUE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE, Items.LIGHT_BLUE_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.LIGHT_BLUE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_light_blue_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE, DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_YELLOW_STAINED_GLASS, Items.YELLOW_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_YELLOW_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.YELLOW_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE, Items.YELLOW_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.YELLOW_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_yellow_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE, DecoBlocks.HARDENED_YELLOW_STAINED_GLASS);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_LIME_STAINED_GLASS, Items.LIME_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIME_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.LIME_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_LIME_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE, Items.LIME_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.LIME_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_lime_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE, DecoBlocks.HARDENED_LIME_STAINED_GLASS);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_PINK_STAINED_GLASS, Items.PINK_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PINK_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.PINK_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_PINK_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE, Items.PINK_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.PINK_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_pink_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE, DecoBlocks.HARDENED_PINK_STAINED_GLASS);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_GRAY_STAINED_GLASS, Items.GRAY_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GRAY_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.GRAY_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_GRAY_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE, Items.GRAY_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.GRAY_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_gray_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE, DecoBlocks.HARDENED_GRAY_STAINED_GLASS);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS, Items.LIGHT_GRAY_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.LIGHT_GRAY_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE, Items.LIGHT_GRAY_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.LIGHT_GRAY_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_light_gray_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE, DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_CYAN_STAINED_GLASS, Items.CYAN_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_CYAN_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.CYAN_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_CYAN_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE, Items.CYAN_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.CYAN_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_cyan_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE, DecoBlocks.HARDENED_CYAN_STAINED_GLASS);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_PURPLE_STAINED_GLASS, Items.PURPLE_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PURPLE_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.PURPLE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE, Items.PURPLE_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.PURPLE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_purple_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE, DecoBlocks.HARDENED_PURPLE_STAINED_GLASS);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_BLUE_STAINED_GLASS, Items.BLUE_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLUE_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.BLUE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_BLUE_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE, Items.BLUE_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.BLUE_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_blue_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE, DecoBlocks.HARDENED_BLUE_STAINED_GLASS);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_BROWN_STAINED_GLASS, Items.BROWN_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BROWN_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.BROWN_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_BROWN_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE, Items.BROWN_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.BROWN_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_brown_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE, DecoBlocks.HARDENED_BROWN_STAINED_GLASS);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_GREEN_STAINED_GLASS, Items.GREEN_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GREEN_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.GREEN_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_GREEN_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE, Items.GREEN_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.GREEN_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_green_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE, DecoBlocks.HARDENED_GREEN_STAINED_GLASS);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_RED_STAINED_GLASS, Items.RED_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_RED_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.RED_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_RED_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE, Items.RED_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.RED_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_red_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE, DecoBlocks.HARDENED_RED_STAINED_GLASS);

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_BLACK_STAINED_GLASS, Items.BLACK_STAINED_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLACK_STAINED_GLASS,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.BLACK_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_BLACK_STAINED_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE, Items.BLACK_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.BLACK_DYE)
                .input('#', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLASS_PANE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLASS_PANE))
                .offerTo(exporter, new Identifier("dyed_hardened_black_stained_glass_pane"));

        offerStainedGlassPaneRecipe(exporter, DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE, DecoBlocks.HARDENED_BLACK_STAINED_GLASS);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.DEEPSLATE),RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_DEEPSLATE,
                        0.1f, 200).criterion(hasItem(Items.DEEPSLATE), conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SMOOTH_DEEPSLATE)));

        createStairsRecipe(DecoBlocks.SMOOTH_DEEPSLATE_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_DEEPSLATE))
                .criterion(hasItem(DecoBlocks.SMOOTH_DEEPSLATE),conditionsFromItem(DecoBlocks.SMOOTH_DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_DEEPSLATE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_DEEPSLATE_STAIRS, DecoBlocks.SMOOTH_DEEPSLATE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_DEEPSLATE_SLAB, DecoBlocks.SMOOTH_DEEPSLATE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_DEEPSLATE_SLAB, DecoBlocks.SMOOTH_DEEPSLATE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_DEEPSLATE_WALL, DecoBlocks.SMOOTH_DEEPSLATE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_DEEPSLATE_WALL, DecoBlocks.SMOOTH_DEEPSLATE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BLACKSTONE), RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE,
                        0.1f, 200).criterion(hasItem(Items.BLACKSTONE), conditionsFromItem(Items.BLACKSTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SMOOTH_BLACKSTONE)));

        createStairsRecipe(DecoBlocks.SMOOTH_BLACKSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_BLACKSTONE))
                .criterion(hasItem(DecoBlocks.SMOOTH_BLACKSTONE),conditionsFromItem(DecoBlocks.SMOOTH_BLACKSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_BLACKSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE_STAIRS, DecoBlocks.SMOOTH_BLACKSTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE_SLAB, DecoBlocks.SMOOTH_BLACKSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE_SLAB, DecoBlocks.SMOOTH_BLACKSTONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_BLACKSTONE_WALL, DecoBlocks.SMOOTH_BLACKSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BLACKSTONE_WALL, DecoBlocks.SMOOTH_BLACKSTONE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.DEEPSLATE_BLAST_FURNACE)
                .pattern("III")
                .pattern("IXI")
                .pattern("###")
                .input('I', Items.IRON_INGOT)
                .input('X', DecoBlocks.DEEPSLATE_FURNACE)
                .input('#', DecoBlocks.SMOOTH_DEEPSLATE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.SMOOTH_DEEPSLATE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.SMOOTH_DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DEEPSLATE_BLAST_FURNACE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.BLACKSTONE_BLAST_FURNACE)
                .pattern("III")
                .pattern("IXI")
                .pattern("###")
                .input('I', Items.IRON_INGOT)
                .input('X', DecoBlocks.BLACKSTONE_FURNACE)
                .input('#', DecoBlocks.SMOOTH_BLACKSTONE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.SMOOTH_BLACKSTONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.SMOOTH_BLACKSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACKSTONE_BLAST_FURNACE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.DEEPSLATE_SMOKER)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', ItemTags.LOGS)
                .input('X', DecoBlocks.DEEPSLATE_FURNACE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.DEEPSLATE_FURNACE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.DEEPSLATE_FURNACE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DEEPSLATE_SMOKER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.BLACKSTONE_SMOKER)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', ItemTags.LOGS)
                .input('X', DecoBlocks.BLACKSTONE_FURNACE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLACKSTONE_FURNACE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLACKSTONE_FURNACE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACKSTONE_SMOKER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.DEEPSLATE_STONECUTTER)
                .pattern(" I ")
                .pattern("###")
                .input('I', Items.IRON_INGOT)
                .input('#', Items.DEEPSLATE)
                .criterion(RecipeProvider.hasItem(Items.DEEPSLATE),
                        RecipeProvider.conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DEEPSLATE_STONECUTTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.BLACKSTONE_STONECUTTER)
                .pattern(" I ")
                .pattern("###")
                .input('I', Items.IRON_INGOT)
                .input('#', Items.BLACKSTONE)
                .criterion(RecipeProvider.hasItem(Items.BLACKSTONE),
                        RecipeProvider.conditionsFromItem(Items.BLACKSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACKSTONE_STONECUTTER)));

        createStairsRecipe(DecoBlocks.DEEPSLATE_STAIRS, Ingredient.ofItems(Items.DEEPSLATE))
                .criterion(hasItem(Items.DEEPSLATE),conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DEEPSLATE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DEEPSLATE_STAIRS, Items.DEEPSLATE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DEEPSLATE_SLAB, Items.DEEPSLATE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DEEPSLATE_SLAB, Items.DEEPSLATE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.DEEPSLATE_WALL, Items.DEEPSLATE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DEEPSLATE_WALL, Items.DEEPSLATE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BRICKS, Items.BRICK_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_BRICKS, Items.BRICKS);

        createStairsRecipe(DecoBlocks.END_STONE_STAIRS, Ingredient.ofItems(Items.END_STONE))
                .criterion(hasItem(Items.END_STONE),conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.END_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.END_STONE_STAIRS, Items.END_STONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.END_STONE_SLAB, Items.END_STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.END_STONE_SLAB, Items.END_STONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.END_STONE_WALL, Items.END_STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.END_STONE_WALL, Items.END_STONE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.PURPUR_BLOCK), RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_PURPUR,
                        0.1f, 200).criterion(hasItem(Items.PURPUR_BLOCK), conditionsFromItem(Items.PURPUR_BLOCK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SMOOTH_PURPUR)));

        createStairsRecipe(DecoBlocks.SMOOTH_PURPUR_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_PURPUR))
                .criterion(hasItem(DecoBlocks.SMOOTH_PURPUR),conditionsFromItem(DecoBlocks.SMOOTH_PURPUR))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_PURPUR_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_PURPUR_STAIRS, DecoBlocks.SMOOTH_PURPUR);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_PURPUR_SLAB, DecoBlocks.SMOOTH_PURPUR);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_PURPUR_SLAB, DecoBlocks.SMOOTH_PURPUR,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_PURPUR_WALL, DecoBlocks.SMOOTH_PURPUR);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_PURPUR_WALL, DecoBlocks.SMOOTH_PURPUR);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICKS, Items.PURPUR_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICKS, Items.PURPUR_BLOCK);

        createStairsRecipe(DecoBlocks.PURPUR_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.PURPUR_BRICKS))
                .criterion(hasItem(DecoBlocks.PURPUR_BRICKS),conditionsFromItem(DecoBlocks.PURPUR_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PURPUR_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPUR_BRICK_STAIRS, Items.PURPUR_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPUR_BRICK_STAIRS, DecoBlocks.PURPUR_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPUR_BRICK_SLAB, DecoBlocks.PURPUR_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICK_SLAB, Items.PURPUR_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_BRICK_SLAB, DecoBlocks.PURPUR_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.PURPUR_BRICK_WALL, DecoBlocks.PURPUR_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPUR_BRICK_WALL, Items.PURPUR_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPUR_BRICK_WALL, DecoBlocks.PURPUR_BRICKS);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_PURPUR, Items.PURPUR_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.ENDER_PEARL)
                .input('#', Items.END_STONE)
                .criterion(RecipeProvider.hasItem(Items.END_STONE),
                        RecipeProvider.conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.VOID_STONE)));

        createStairsRecipe(DecoBlocks.VOID_STONE_STAIRS, Ingredient.ofItems(DecoBlocks.VOID_STONE))
                .criterion(hasItem(DecoBlocks.VOID_STONE),conditionsFromItem(DecoBlocks.VOID_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.VOID_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_STAIRS, DecoBlocks.VOID_STONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_SLAB, DecoBlocks.VOID_STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_SLAB, DecoBlocks.VOID_STONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.VOID_STONE_WALL, DecoBlocks.VOID_STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_WALL, DecoBlocks.VOID_STONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICKS, DecoBlocks.VOID_STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICKS, DecoBlocks.VOID_STONE);

        createStairsRecipe(DecoBlocks.VOID_STONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.VOID_STONE_BRICKS))
                .criterion(hasItem(DecoBlocks.VOID_STONE_BRICKS),conditionsFromItem(DecoBlocks.VOID_STONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.VOID_STONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_STAIRS, DecoBlocks.VOID_STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_STAIRS, DecoBlocks.VOID_STONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_SLAB, DecoBlocks.VOID_STONE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_SLAB, DecoBlocks.VOID_STONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_SLAB, DecoBlocks.VOID_STONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.VOID_STONE_BRICK_WALL, DecoBlocks.VOID_STONE_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_WALL, DecoBlocks.VOID_STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.VOID_STONE_BRICK_WALL, DecoBlocks.VOID_STONE_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_VOID_STONE, DecoBlocks.VOID_STONE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_VOID_STONE, DecoBlocks.VOID_STONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.PRISMARINE_BRICKS, Items.PRISMARINE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.PRISMARINE_BRICK_STAIRS, Items.PRISMARINE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.PRISMARINE_BRICK_SLAB, Items.PRISMARINE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE);

        createStairsRecipe(DecoBlocks.OBSIDIAN_STAIRS, Ingredient.ofItems(Items.OBSIDIAN))
                .criterion(hasItem(Items.OBSIDIAN),conditionsFromItem(Items.OBSIDIAN))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.OBSIDIAN_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_STAIRS, Items.OBSIDIAN);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_SLAB, Items.OBSIDIAN);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_SLAB, Items.OBSIDIAN,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.OBSIDIAN_WALL, Items.OBSIDIAN);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_WALL, Items.OBSIDIAN);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICKS, DecoBlocks.SANDED_OBSIDIAN);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICKS, DecoBlocks.SANDED_OBSIDIAN);

        createStairsRecipe(DecoBlocks.OBSIDIAN_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.OBSIDIAN_BRICKS))
                .criterion(hasItem(DecoBlocks.OBSIDIAN_BRICKS),conditionsFromItem(DecoBlocks.OBSIDIAN_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.OBSIDIAN_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_STAIRS, DecoBlocks.SANDED_OBSIDIAN);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_STAIRS, DecoBlocks.OBSIDIAN_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_SLAB, DecoBlocks.OBSIDIAN_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_SLAB, DecoBlocks.SANDED_OBSIDIAN,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_SLAB, DecoBlocks.OBSIDIAN_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.OBSIDIAN_BRICK_WALL, DecoBlocks.OBSIDIAN_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_WALL, DecoBlocks.SANDED_OBSIDIAN);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_BRICK_WALL, DecoBlocks.OBSIDIAN_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_PILLAR, DecoBlocks.OBSIDIAN_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OBSIDIAN_PILLAR, DecoBlocks.SANDED_OBSIDIAN);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_OBSIDIAN,2)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.OBSIDIAN_SLAB)
                .criterion(RecipeProvider.hasItem(DecoBlocks.OBSIDIAN_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.OBSIDIAN_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHISELED_OBSIDIAN)));
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_OBSIDIAN, Items.OBSIDIAN);

        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC, Items.FLINT,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.FLINT_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC,Items.CHARCOAL,RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHARCOAL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ECHO_BLOCK)
                .pattern("##")
                .pattern("##")
                .input('#', Items.ECHO_SHARD)
                .criterion(RecipeProvider.hasItem(Items.ECHO_SHARD),
                        RecipeProvider.conditionsFromItem(Items.ECHO_SHARD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.ECHO_BLOCK)));

        offerCutCopperRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON, Items.IRON_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON, Items.IRON_BLOCK,4);

        createStairsRecipe(DecoBlocks.CUT_IRON_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_IRON))
                .criterion(hasItem(DecoBlocks.CUT_IRON),conditionsFromItem(DecoBlocks.CUT_IRON))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_IRON_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON_STAIRS, Items.IRON_BLOCK,4);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON_STAIRS, DecoBlocks.CUT_IRON);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON_SLAB, DecoBlocks.CUT_IRON);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON_SLAB, Items.IRON_BLOCK,8);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CUT_IRON_SLAB, DecoBlocks.CUT_IRON,2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_IRON_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.IRON_NUGGET)
                .criterion(RecipeProvider.hasItem(Items.IRON_NUGGET),
                        RecipeProvider.conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.LIGHT_IRON_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HEAVY_IRON_BARS)
                .pattern("##")
                .pattern("##")
                .input('#', Items.IRON_BARS)
                .criterion(RecipeProvider.hasItem(Items.IRON_BARS),
                        RecipeProvider.conditionsFromItem(Items.IRON_BARS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HEAVY_IRON_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.GOLD_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.GOLD_INGOT)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.GOLD_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.GOLD_TRAPDOOR)
                .pattern("##")
                .pattern("##")
                .input('#', Items.GOLD_INGOT)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.GOLD_TRAPDOOR)));

        offerPressurePlateRecipe(exporter, DecoBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Items.POLISHED_DEEPSLATE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.POLISHED_DEEPSLATE_BUTTON)
                .input(Items.POLISHED_DEEPSLATE)
                .criterion(RecipeProvider.hasItem(Items.POLISHED_DEEPSLATE),
                        RecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.POLISHED_DEEPSLATE_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HEAVY_COPPER_BARS)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.COPPER_BARS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.COPPER_BARS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.COPPER_BARS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HEAVY_COPPER_BARS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.WAXED_HEAVY_COPPER_BARS)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.WAXED_COPPER_BARS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.WAXED_COPPER_BARS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WAXED_COPPER_BARS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WAXED_HEAVY_COPPER_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.EXPOSED_HEAVY_COPPER_BARS)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.EXPOSED_COPPER_BARS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.EXPOSED_COPPER_BARS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.EXPOSED_COPPER_BARS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.WAXED_EXPOSED_COPPER_BARS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.WAXED_EXPOSED_COPPER_BARS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WAXED_EXPOSED_COPPER_BARS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.WEATHERED_HEAVY_COPPER_BARS)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.WEATHERED_COPPER_BARS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.WEATHERED_COPPER_BARS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WEATHERED_COPPER_BARS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.WAXED_WEATHERED_COPPER_BARS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.WAXED_WEATHERED_COPPER_BARS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WAXED_WEATHERED_COPPER_BARS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.OXIDIZED_COPPER_BARS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.OXIDIZED_COPPER_BARS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.OXIDIZED_COPPER_BARS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.WAXED_OXIDIZED_COPPER_BARS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.COPPER_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.COPPER_INGOT)
                .criterion(RecipeProvider.hasItem(Items.COPPER_INGOT),
                        RecipeProvider.conditionsFromItem(Items.COPPER_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.COPPER_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.LIGHT_COPPER_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', DecoItems.COPPER_NUGGET)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_NUGGET),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.LIGHT_COPPER_BARS)));

        offerPressurePlateRecipe(exporter, DecoBlocks.DEEPSLATE_PRESSURE_PLATE, Items.DEEPSLATE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DEEPSLATE_PRESSURE_PLATE, Items.DEEPSLATE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.DEEPSLATE_BUTTON)
                .input(Items.DEEPSLATE)
                .criterion(RecipeProvider.hasItem(Items.DEEPSLATE),
                        RecipeProvider.conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.DEEPSLATE_BUTTON)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DEEPSLATE_BUTTON, Items.DEEPSLATE);

        offerPressurePlateRecipe(exporter, DecoBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE, Items.COBBLED_DEEPSLATE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_DEEPSLATE_PRESSURE_PLATE, Items.COBBLED_DEEPSLATE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE, Items.COBBLED_DEEPSLATE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.COBBLED_DEEPSLATE_BUTTON)
                .input(Items.COBBLED_DEEPSLATE)
                .criterion(RecipeProvider.hasItem(Items.COBBLED_DEEPSLATE),
                        RecipeProvider.conditionsFromItem(Items.COBBLED_DEEPSLATE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.COBBLED_DEEPSLATE_BUTTON)));

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_DEEPSLATE_BUTTON, Items.COBBLED_DEEPSLATE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_DEEPSLATE_BUTTON, Items.COBBLED_DEEPSLATE);

        offerPressurePlateRecipe(exporter, DecoBlocks.COBBLESTONE_PRESSURE_PLATE, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLESTONE_PRESSURE_PLATE, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_PRESSURE_PLATE, Items.COBBLESTONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.STONE_PRESSURE_PLATE, Items.STONE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.COBBLESTONE_BUTTON)
                .input(Items.COBBLESTONE)
                .criterion(RecipeProvider.hasItem(Items.COBBLESTONE),
                        RecipeProvider.conditionsFromItem(Items.COBBLESTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.COBBLESTONE_BUTTON)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLESTONE_BUTTON, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_BUTTON, Items.COBBLESTONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.STONE_BUTTON, Items.STONE);

        offerPressurePlateRecipe(exporter, DecoBlocks.BLACKSTONE_PRESSURE_PLATE, Items.BLACKSTONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACKSTONE_PRESSURE_PLATE, Items.BLACKSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.POLISHED_BLACKSTONE_PRESSURE_PLATE, Items.BLACKSTONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.POLISHED_BLACKSTONE_PRESSURE_PLATE, Items.POLISHED_BLACKSTONE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.BLACKSTONE_BUTTON)
                .input(Items.BLACKSTONE)
                .criterion(RecipeProvider.hasItem(Items.BLACKSTONE),
                        RecipeProvider.conditionsFromItem(Items.BLACKSTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BLACKSTONE_BUTTON)));

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BLACKSTONE_BUTTON, Items.BLACKSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.POLISHED_BLACKSTONE_BUTTON, Items.BLACKSTONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,Items.POLISHED_BLACKSTONE_BUTTON, Items.POLISHED_BLACKSTONE);

        offerPressurePlateRecipe(exporter, DecoBlocks.POLISHED_STONE_PRESSURE_PLATE, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_PRESSURE_PLATE, DecoBlocks.POLISHED_STONE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.POLISHED_STONE_BUTTON)
                .input(DecoBlocks.POLISHED_STONE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.POLISHED_STONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.POLISHED_STONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.POLISHED_STONE_BUTTON)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_STONE_BUTTON, DecoBlocks.POLISHED_STONE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.YELLOW_DYE)
                .input(DecoBlocks.YELLOW_TULIP)
                .group("yellow_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.YELLOW_TULIP),
                        RecipeProvider.conditionsFromItem(DecoBlocks.YELLOW_TULIP))
                .offerTo(exporter, new Identifier("yellow_dye_from_yellow_tulip"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PURPLE_DYE)
                .input(DecoBlocks.PURPLE_TULIP)
                .group("purple_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.PURPLE_TULIP),
                        RecipeProvider.conditionsFromItem(DecoBlocks.PURPLE_TULIP))
                .offerTo(exporter, new Identifier("purple_dye_from_purple_tulip"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.MAGENTA_DYE)
                .input(DecoBlocks.MAGENTA_TULIP)
                .group("magenta_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MAGENTA_TULIP),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MAGENTA_TULIP))
                .offerTo(exporter, new Identifier("magenta_dye_from_magenta_tulip"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.BLACK_DYE)
                .input(DecoBlocks.BLACK_TULIP)
                .group("black_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLACK_TULIP),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLACK_TULIP))
                .offerTo(exporter, new Identifier("black_dye_from_black_tulip"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.LIME_DYE)
                .input(DecoBlocks.GREEN_TULIP)
                .group("lime_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.GREEN_TULIP),
                        RecipeProvider.conditionsFromItem(DecoBlocks.GREEN_TULIP))
                .offerTo(exporter, new Identifier("lime_dye_from_green_tulip"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.LIGHT_BLUE_DYE)
                .input(DecoBlocks.BLUE_TULIP)
                .group("light_blue_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_TULIP),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_TULIP))
                .offerTo(exporter, new Identifier("light_blue_dye_from_blue_tulip"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.CYAN_DYE)
                .input(DecoBlocks.CYAN_TULIP)
                .group("cyan_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.CYAN_TULIP),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CYAN_TULIP))
                .offerTo(exporter, new Identifier("cyan_dye_from_cyan_tulip"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.RED_DYE)
                .input(DecoBlocks.BARBERTON_DAISY)
                .group("red_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.BARBERTON_DAISY),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BARBERTON_DAISY))
                .offerTo(exporter, new Identifier("red_dye_from_barberton_daisy"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.YELLOW_DYE)
                .input(DecoBlocks.BLUE_EYED_DAISY)
                .group("yellow_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_EYED_DAISY),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_EYED_DAISY))
                .offerTo(exporter, new Identifier("yellow_dye_from_blue_eyed_daisy"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PINK_DYE)
                .input(DecoBlocks.GERBERA_DAISY)
                .group("pink_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.GERBERA_DAISY),
                        RecipeProvider.conditionsFromItem(DecoBlocks.GERBERA_DAISY))
                .offerTo(exporter, new Identifier("pink_dye_from_gerbera_daisy"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PURPLE_DYE)
                .input(DecoBlocks.MICHAELMAS_DAISY)
                .group("purple_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MICHAELMAS_DAISY),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MICHAELMAS_DAISY))
                .offerTo(exporter, new Identifier("purple_dye_from_michaelmas_daisy"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.ORANGE_DYE)
                .input(DecoBlocks.CALIFORNIA_POPPY)
                .group("orange_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.CALIFORNIA_POPPY),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CALIFORNIA_POPPY))
                .offerTo(exporter, new Identifier("orange_dye_from_california_poppy"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PINK_DYE)
                .input(DecoBlocks.SALMON_POPPY)
                .group("pink_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.SALMON_POPPY),
                        RecipeProvider.conditionsFromItem(DecoBlocks.SALMON_POPPY))
                .offerTo(exporter, new Identifier("pink_dye_from_salmon_poppy"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.WHITE_DYE)
                .input(DecoBlocks.WHITE_ORCHID)
                .group("white_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WHITE_ORCHID),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WHITE_ORCHID))
                .offerTo(exporter, new Identifier("white_dye_from_white_orchid"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PINK_DYE)
                .input(DecoBlocks.PINK_ORCHID)
                .group("pink_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.PINK_ORCHID),
                        RecipeProvider.conditionsFromItem(DecoBlocks.PINK_ORCHID))
                .offerTo(exporter, new Identifier("pink_dye_from_pink_orchid"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.YELLOW_DYE)
                .input(DecoBlocks.YELLOW_ORCHID)
                .group("yellow_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.YELLOW_ORCHID),
                        RecipeProvider.conditionsFromItem(DecoBlocks.YELLOW_ORCHID))
                .offerTo(exporter, new Identifier("yellow_dye_from_yellow_orchid"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.RED_DYE)
                .input(DecoBlocks.ROSE)
                .group("red_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.ROSE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.ROSE))
                .offerTo(exporter, new Identifier("red_dye_from_rose"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PURPLE_DYE)
                .input(DecoBlocks.ENDER_ROSE)
                .group("purple_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.ENDER_ROSE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.ENDER_ROSE))
                .offerTo(exporter, new Identifier("purple_dye_from_ender_rose"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PURPLE_DYE,4)
                .input(DecoBlocks.ENDER_ROSE_BUSH)
                .group("purple_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.ENDER_ROSE_BUSH),
                        RecipeProvider.conditionsFromItem(DecoBlocks.ENDER_ROSE_BUSH))
                .offerTo(exporter, new Identifier("purple_dye_from_ender_rose_bush"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.BLACK_DYE,4)
                .input(DecoBlocks.WITHER_ROSE_BUSH)
                .group("black_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WITHER_ROSE_BUSH),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WITHER_ROSE_BUSH))
                .offerTo(exporter, new Identifier("black_dye_from_wither_rose_bush"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,Items.ROSE_BUSH)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.ROSE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.ROSE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.ROSE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.ROSE_BUSH)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.ENDER_ROSE_BUSH)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.ENDER_ROSE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.ENDER_ROSE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.ENDER_ROSE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.ENDER_ROSE_BUSH)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.WITHER_ROSE_BUSH)
                .pattern("##")
                .pattern("##")
                .input('#', Items.WITHER_ROSE)
                .criterion(RecipeProvider.hasItem(Items.WITHER_ROSE),
                        RecipeProvider.conditionsFromItem(Items.WITHER_ROSE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WITHER_ROSE_BUSH)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.RED_DYE,2)
                .input(DecoBlocks.RED_SUNFLOWER)
                .group("red_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.RED_SUNFLOWER),
                        RecipeProvider.conditionsFromItem(DecoBlocks.RED_SUNFLOWER))
                .offerTo(exporter, new Identifier("red_dye_from_red_sunflower"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.WHITE_DYE,2)
                .input(DecoBlocks.NOVA_STARFLOWER)
                .group("white_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.NOVA_STARFLOWER),
                        RecipeProvider.conditionsFromItem(DecoBlocks.NOVA_STARFLOWER))
                .offerTo(exporter, new Identifier("white_dye_from_nova_starflower"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PINK_DYE)
                .input(DecoBlocks.PAEONIA)
                .group("pink_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.PAEONIA),
                        RecipeProvider.conditionsFromItem(DecoBlocks.PAEONIA))
                .offerTo(exporter, new Identifier("pink_dye_from_paeonia"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,Items.PEONY)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.PAEONIA)
                .criterion(RecipeProvider.hasItem(DecoBlocks.PAEONIA),
                        RecipeProvider.conditionsFromItem(DecoBlocks.PAEONIA))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.PEONY)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.PURPLE_DYE)
                .input(DecoBlocks.LAVENDER)
                .group("purple_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.LAVENDER),
                        RecipeProvider.conditionsFromItem(DecoBlocks.LAVENDER))
                .offerTo(exporter, new Identifier("purple_dye_from_lavender"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.COPPER_LANTERN)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.TORCH)
                .input('#', DecoItems.COPPER_NUGGET)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_NUGGET),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.COPPER_LANTERN)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.COPPER_SOUL_LANTERN)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', Items.SOUL_TORCH)
                .input('#', DecoItems.COPPER_NUGGET)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_NUGGET),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.COPPER_SOUL_LANTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.COPPER_CHAIN)
                .pattern("#")
                .pattern("X")
                .pattern("#")
                .input('X', Items.COPPER_INGOT)
                .input('#', DecoItems.COPPER_NUGGET)
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_NUGGET),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.COPPER_CHAIN)));

        offerPressurePlateRecipe(exporter, DecoBlocks.COPPER_WEIGHT_PRESSURE_PLATE, Items.COPPER_INGOT);

        offerReversibleCompactingFourRecipes(exporter,Items.WHITE_DYE, DecoBlocks.WHITE_BLOCK,
                "white_block","white_block",
                "white_dye","white_dye");

        offerReversibleCompactingFourRecipes(exporter,Items.LIGHT_GRAY_DYE, DecoBlocks.LIGHT_GRAY_BLOCK,
                "light_gray_block","light_gray_block",
                "light_gray_dye","light_gray_dye");

        offerReversibleCompactingFourRecipes(exporter,Items.GRAY_DYE, DecoBlocks.GRAY_BLOCK,
                "gray_block","gray_block",
                "gray_dye","gray_dye");

        offerReversibleCompactingFourRecipes(exporter,Items.BLACK_DYE, DecoBlocks.BLACK_BLOCK,
                "black_block","black_block",
                "black_dye","black_dye");

        offerReversibleCompactingFourRecipes(exporter,Items.BROWN_DYE, DecoBlocks.BROWN_BLOCK,
                "brown_block","brown_block",
                "brown_dye","brown_dye");

        offerReversibleCompactingFourRecipes(exporter,Items.RED_DYE, DecoBlocks.RED_BLOCK,
                "red_block","red_block",
                "red_dye","red_dye");

        offerReversibleCompactingFourRecipes(exporter,Items.ORANGE_DYE, DecoBlocks.ORANGE_BLOCK,
                "orange_block","orange_block",
                "orange_dye","orange_dye");

        offerReversibleCompactingFourRecipes(exporter,Items.YELLOW_DYE, DecoBlocks.YELLOW_BLOCK,
                "yellow_block","yellow_block",
                "yellow_dye","yellow_dye");

        offerReversibleCompactingFourRecipes(exporter,Items.LIME_DYE, DecoBlocks.LIME_BLOCK,
                "lime_block","lime_block",
                "lime_dye","lime_dye");

        offerReversibleCompactingFourRecipes(exporter,Items.GREEN_DYE, DecoBlocks.GREEN_BLOCK,
                "green_block","green_block",
                "green_dye","green_dye");

        offerReversibleCompactingFourRecipes(exporter,Items.CYAN_DYE, DecoBlocks.CYAN_BLOCK,
                "cyan_block","cyan_block",
                "cyan_dye","cyan_dye");

        offerReversibleCompactingFourRecipes(exporter,Items.LIGHT_BLUE_DYE, DecoBlocks.LIGHT_BLUE_BLOCK,
                "light_blue_block","light_blue_block",
                "light_blue_dye","light_blue_dye");

        offerReversibleCompactingFourRecipes(exporter,Items.BLUE_DYE, DecoBlocks.BLUE_BLOCK,
                "blue_block","blue_block",
                "blue_dye","blue_dye");

        offerReversibleCompactingFourRecipes(exporter,Items.PURPLE_DYE, DecoBlocks.PURPLE_BLOCK,
                "purple_block","purple_block",
                "purple_dye","purple_dye");

        offerReversibleCompactingFourRecipes(exporter,Items.MAGENTA_DYE, DecoBlocks.MAGENTA_BLOCK,
                "magenta_block","magenta_block",
                "magenta_dye","magenta_dye");

        offerReversibleCompactingFourRecipes(exporter,Items.PINK_DYE, DecoBlocks.PINK_BLOCK,
                "pink_block","pink_block",
                "pink_dye","pink_dye");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.LIGHT_GRAY_BLOCK,3)
                .input(DecoBlocks.BLACK_BLOCK)
                .input(DecoBlocks.WHITE_BLOCK)
                .input(DecoBlocks.WHITE_BLOCK)
                .group("light_gray_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLACK_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLACK_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.WHITE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .offerTo(exporter, new Identifier("light_gray_block_from_black_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.LIGHT_GRAY_BLOCK,2)
                .input(DecoBlocks.GRAY_BLOCK)
                .input(DecoBlocks.WHITE_BLOCK)
                .group("light_gray_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.GRAY_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.GRAY_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.WHITE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .offerTo(exporter, new Identifier("light_gray_block_from_gray_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.GRAY_BLOCK,2)
                .input(DecoBlocks.BLACK_BLOCK)
                .input(DecoBlocks.WHITE_BLOCK)
                .group("gray_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLACK_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLACK_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.WHITE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .offerTo(exporter, new Identifier("gray_block_from_black_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.ORANGE_BLOCK,2)
                .input(DecoBlocks.YELLOW_BLOCK)
                .input(DecoBlocks.RED_BLOCK)
                .group("orange_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.YELLOW_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.YELLOW_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.RED_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.RED_BLOCK))
                .offerTo(exporter, new Identifier("orange_block_from_red_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.LIME_BLOCK,2)
                .input(DecoBlocks.GREEN_BLOCK)
                .input(DecoBlocks.WHITE_BLOCK)
                .group("lime_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.GREEN_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.GREEN_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.WHITE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .offerTo(exporter, new Identifier("lime_block_from_green_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.CYAN_BLOCK,2)
                .input(DecoBlocks.GREEN_BLOCK)
                .input(DecoBlocks.BLUE_BLOCK)
                .group("cyan_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.GREEN_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.GREEN_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .offerTo(exporter, new Identifier("cyan_block_from_green_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.CYAN_BLOCK,3)
                .input(DecoBlocks.YELLOW_BLOCK)
                .input(DecoBlocks.BLUE_BLOCK)
                .input(DecoBlocks.BLUE_BLOCK)
                .group("cyan_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.YELLOW_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.YELLOW_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .offerTo(exporter, new Identifier("cyan_block_from_blue_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.CYAN_DYE,3)
                .input(Items.YELLOW_DYE)
                .input(Items.BLUE_DYE)
                .input(Items.BLUE_DYE)
                .group("cyan_dye")
                .criterion(RecipeProvider.hasItem(Items.YELLOW_DYE),
                        RecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                .criterion(RecipeProvider.hasItem(Items.BLUE_DYE),
                        RecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier("cyan_dye_from_blue_dye"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.LIGHT_BLUE_BLOCK,2)
                .input(DecoBlocks.BLUE_BLOCK)
                .input(DecoBlocks.WHITE_BLOCK)
                .group("light_blue_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.WHITE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .offerTo(exporter, new Identifier("light_blue_block_from_blue_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.PURPLE_BLOCK,2)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.BLUE_BLOCK)
                .group("purple_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.RED_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.RED_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .offerTo(exporter, new Identifier("purple_block_from_red_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.MAGENTA_BLOCK,2)
                .input(DecoBlocks.PINK_BLOCK)
                .input(DecoBlocks.PURPLE_BLOCK)
                .group("magenta_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.PINK_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.PINK_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.PURPLE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.PURPLE_BLOCK))
                .offerTo(exporter, new Identifier("magenta_block_from_pink_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.MAGENTA_BLOCK,3)
                .input(DecoBlocks.PINK_BLOCK)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.BLUE_BLOCK)
                .group("magenta_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.PINK_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.PINK_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.RED_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.RED_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .offerTo(exporter, new Identifier("magenta_block_from_blue_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.MAGENTA_BLOCK,3)
                .input(DecoBlocks.WHITE_BLOCK)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.PURPLE_BLOCK)
                .group("magenta_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WHITE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.RED_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.RED_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.PURPLE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.PURPLE_BLOCK))
                .offerTo(exporter, new Identifier("magenta_block_from_purple_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.MAGENTA_BLOCK,4)
                .input(DecoBlocks.WHITE_BLOCK)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.BLUE_BLOCK)
                .group("magenta_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WHITE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.RED_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.RED_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .offerTo(exporter, new Identifier("magenta_block_from_white_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.MAGENTA_DYE,3)
                .input(Items.WHITE_DYE)
                .input(Items.RED_DYE)
                .input(Items.PURPLE_DYE)
                .group("magenta_dye")
                .criterion(RecipeProvider.hasItem(Items.WHITE_DYE),
                        RecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                .criterion(RecipeProvider.hasItem(Items.RED_DYE),
                        RecipeProvider.conditionsFromItem(Items.RED_DYE))
                .criterion(RecipeProvider.hasItem(Items.PURPLE_DYE),
                        RecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, new Identifier("magenta_dye_from_purple_dye"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.PINK_BLOCK,2)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.WHITE_BLOCK)
                .group("pink_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.RED_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.RED_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.WHITE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .offerTo(exporter, new Identifier("pink_block_from_red_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.BROWN_BLOCK,2)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.GREEN_BLOCK)
                .group("brown_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.RED_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.RED_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.GREEN_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.GREEN_BLOCK))
                .offerTo(exporter, new Identifier("brown_block_from_red_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.BROWN_DYE,2)
                .input(Items.RED_DYE)
                .input(Items.GREEN_DYE)
                .group("brown_dye")
                .criterion(RecipeProvider.hasItem(Items.RED_DYE),
                        RecipeProvider.conditionsFromItem(Items.RED_DYE))
                .criterion(RecipeProvider.hasItem(Items.GREEN_DYE),
                        RecipeProvider.conditionsFromItem(Items.GREEN_DYE))
                .offerTo(exporter, new Identifier("brown_dye_from_red_dye"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.BROWN_BLOCK,3)
                .input(DecoBlocks.RED_BLOCK)
                .input(DecoBlocks.YELLOW_BLOCK)
                .input(DecoBlocks.BLUE_BLOCK)
                .group("brown_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.RED_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.RED_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.YELLOW_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.YELLOW_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .offerTo(exporter, new Identifier("brown_block_from_blue_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.BROWN_DYE,3)
                .input(Items.RED_DYE)
                .input(Items.YELLOW_DYE)
                .input(Items.BLUE_DYE)
                .group("brown_dye")
                .criterion(RecipeProvider.hasItem(Items.RED_DYE),
                        RecipeProvider.conditionsFromItem(Items.RED_DYE))
                .criterion(RecipeProvider.hasItem(Items.YELLOW_DYE),
                        RecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                .criterion(RecipeProvider.hasItem(Items.BLUE_DYE),
                        RecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                .offerTo(exporter, new Identifier("brown_dye_from_blue_dye"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.GREEN_BLOCK,2)
                .input(DecoBlocks.BLUE_BLOCK)
                .input(DecoBlocks.YELLOW_BLOCK)
                .group("green_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.YELLOW_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.YELLOW_BLOCK))
                .offerTo(exporter, new Identifier("green_block_from_blue_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.GREEN_DYE,2)
                .input(Items.BLUE_DYE)
                .input(Items.YELLOW_DYE)
                .group("green_dye")
                .criterion(RecipeProvider.hasItem(Items.BLUE_DYE),
                        RecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                .criterion(RecipeProvider.hasItem(Items.YELLOW_DYE),
                        RecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                .group("green_dye")
                .offerTo(exporter, new Identifier("green_dye_from_blue_dye"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.LIME_BLOCK,3)
                .input(DecoBlocks.WHITE_BLOCK)
                .input(DecoBlocks.YELLOW_BLOCK)
                .input(DecoBlocks.BLUE_BLOCK)
                .group("lime_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WHITE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WHITE_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.YELLOW_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.YELLOW_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .offerTo(exporter, new Identifier("lime_block_from_yellow_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.LIME_DYE,3)
                .input(Items.WHITE_DYE)
                .input(Items.YELLOW_DYE)
                .input(Items.BLUE_DYE)
                .group("lime_dye")
                .criterion(RecipeProvider.hasItem(Items.WHITE_DYE),
                        RecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                .criterion(RecipeProvider.hasItem(Items.YELLOW_DYE),
                        RecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                .criterion(RecipeProvider.hasItem(Items.BLUE_DYE),
                        RecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                .group("lime_dye")
                .offerTo(exporter, new Identifier("lime_dye_from_yellow_dye"));

        createStairsRecipe(DecoBlocks.WOODEN_STAIRS, Ingredient.ofItems(DecoBlocks.WOODEN_PLANKS))
                .group("wooden_stairs")
                .criterion(hasItem(DecoBlocks.WOODEN_PLANKS),conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WOODEN_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WOODEN_SLAB,6)
                .pattern("###")
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .group("wooden_slab")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WOODEN_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.WOODEN_FENCE,3)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .group("wooden_fence")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WOODEN_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.WOODEN_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .group("wooden_fence_gate")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WOODEN_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.WOODEN_PRESSURE_PLATE)
                .pattern("##")
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .group("wooden_pressure_plate")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WOODEN_PRESSURE_PLATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.WOODEN_BUTTON)
                .input(DecoBlocks.WOODEN_PLANKS)
                .group("wooden_button")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WOODEN_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.WOODEN_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .group("wooden_door")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WOODEN_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.WOODEN_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .group("wooden_trapdoor")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WOODEN_TRAPDOOR)));

        createSignRecipe(DecoItems.WOODEN_SIGN, Ingredient.ofItems(DecoBlocks.WOODEN_PLANKS))
                .group("wooden_sign")
                .criterion(hasItem(DecoBlocks.WOODEN_PLANKS),conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoItems.WOODEN_SIGN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WOODEN_WOOD,4)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.WOODEN_LOG)
                .group("bark")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_LOG),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_LOG))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WOODEN_WOOD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STRIPPED_WOODEN_WOOD,4)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.STRIPPED_WOODEN_LOG)
                .group("bark")
                .criterion(RecipeProvider.hasItem(DecoBlocks.STRIPPED_WOODEN_LOG),
                        RecipeProvider.conditionsFromItem(DecoBlocks.STRIPPED_WOODEN_LOG))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.STRIPPED_WOODEN_WOOD)));

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.PURPUR_WALL, Items.PURPUR_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PURPUR_WALL, Items.PURPUR_BLOCK);

        createStairsRecipe(DecoBlocks.SMOOTH_BASALT_STAIRS, Ingredient.ofItems(Items.SMOOTH_BASALT))
                .criterion(hasItem(Items.SMOOTH_BASALT),conditionsFromItem(Items.SMOOTH_BASALT))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_BASALT_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BASALT_STAIRS, Items.SMOOTH_BASALT);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BASALT_SLAB, Items.SMOOTH_BASALT);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BASALT_SLAB, Items.SMOOTH_BASALT,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SMOOTH_BASALT_WALL, Items.SMOOTH_BASALT);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SMOOTH_BASALT_WALL, Items.SMOOTH_BASALT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.HEART_OF_THE_SEA)
                .pattern("#C#")
                .pattern("CEC")
                .pattern("#C#")
                .input('E', Items.ENDER_EYE)
                .input('C', Items.PRISMARINE_CRYSTALS)
                .input('#', DecoItems.BUBBLE_ORB)
                .criterion(RecipeProvider.hasItem(Items.ENDER_EYE),
                        RecipeProvider.conditionsFromItem(Items.ENDER_EYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.HEART_OF_THE_SEA)));

        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.BUBBLE_CORAL, RecipeCategory.BUILDING_BLOCKS,Items.BUBBLE_CORAL_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.TUBE_CORAL, RecipeCategory.BUILDING_BLOCKS,Items.TUBE_CORAL_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.BRAIN_CORAL, RecipeCategory.BUILDING_BLOCKS,Items.BRAIN_CORAL_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.FIRE_CORAL, RecipeCategory.BUILDING_BLOCKS,Items.FIRE_CORAL_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.HORN_CORAL, RecipeCategory.BUILDING_BLOCKS,Items.HORN_CORAL_BLOCK);

        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.DEAD_BUBBLE_CORAL, RecipeCategory.BUILDING_BLOCKS,Items.DEAD_BUBBLE_CORAL_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.DEAD_TUBE_CORAL, RecipeCategory.BUILDING_BLOCKS,Items.DEAD_TUBE_CORAL_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.DEAD_BRAIN_CORAL, RecipeCategory.BUILDING_BLOCKS,Items.DEAD_BRAIN_CORAL_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.DEAD_FIRE_CORAL, RecipeCategory.BUILDING_BLOCKS,Items.DEAD_FIRE_CORAL_BLOCK);
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,Items.DEAD_HORN_CORAL, RecipeCategory.BUILDING_BLOCKS,Items.DEAD_HORN_CORAL_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.BUBBLE_CORAL)
                .pattern("#")
                .pattern("#")
                .input('#', Items.BUBBLE_CORAL_FAN)
                .criterion(RecipeProvider.hasItem(Items.BUBBLE_CORAL_FAN),
                        RecipeProvider.conditionsFromItem(Items.BUBBLE_CORAL_FAN))
                .offerTo(exporter, new Identifier("bubble_coral_from_fan"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.TUBE_CORAL)
                .pattern("#")
                .pattern("#")
                .input('#', Items.TUBE_CORAL_FAN)
                .criterion(RecipeProvider.hasItem(Items.TUBE_CORAL_FAN),
                        RecipeProvider.conditionsFromItem(Items.TUBE_CORAL_FAN))
                .offerTo(exporter, new Identifier("tube_coral_from_fan"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.BRAIN_CORAL)
                .pattern("#")
                .pattern("#")
                .input('#', Items.BRAIN_CORAL_FAN)
                .criterion(RecipeProvider.hasItem(Items.BRAIN_CORAL_FAN),
                        RecipeProvider.conditionsFromItem(Items.BRAIN_CORAL_FAN))
                .offerTo(exporter, new Identifier("brain_coral_from_fan"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.FIRE_CORAL)
                .pattern("#")
                .pattern("#")
                .input('#', Items.FIRE_CORAL_FAN)
                .criterion(RecipeProvider.hasItem(Items.FIRE_CORAL_FAN),
                        RecipeProvider.conditionsFromItem(Items.FIRE_CORAL_FAN))
                .offerTo(exporter, new Identifier("fire_coral_from_fan"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.HORN_CORAL)
                .pattern("#")
                .pattern("#")
                .input('#', Items.HORN_CORAL_FAN)
                .criterion(RecipeProvider.hasItem(Items.HORN_CORAL_FAN),
                        RecipeProvider.conditionsFromItem(Items.HORN_CORAL_FAN))
                .offerTo(exporter, new Identifier("horn_coral_from_fan"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.DEAD_BUBBLE_CORAL)
                .pattern("#")
                .pattern("#")
                .input('#', Items.DEAD_BUBBLE_CORAL_FAN)
                .criterion(RecipeProvider.hasItem(Items.DEAD_BUBBLE_CORAL_FAN),
                        RecipeProvider.conditionsFromItem(Items.DEAD_BUBBLE_CORAL_FAN))
                .offerTo(exporter, new Identifier("dead_bubble_coral_from_fan"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.DEAD_TUBE_CORAL)
                .pattern("#")
                .pattern("#")
                .input('#', Items.DEAD_TUBE_CORAL_FAN)
                .criterion(RecipeProvider.hasItem(Items.DEAD_TUBE_CORAL_FAN),
                        RecipeProvider.conditionsFromItem(Items.DEAD_TUBE_CORAL_FAN))
                .offerTo(exporter, new Identifier("dead_tube_coral_from_fan"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.DEAD_BRAIN_CORAL)
                .pattern("#")
                .pattern("#")
                .input('#', Items.DEAD_BRAIN_CORAL_FAN)
                .criterion(RecipeProvider.hasItem(Items.DEAD_BRAIN_CORAL_FAN),
                        RecipeProvider.conditionsFromItem(Items.DEAD_BRAIN_CORAL_FAN))
                .offerTo(exporter, new Identifier("dead_brain_coral_from_fan"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.DEAD_FIRE_CORAL)
                .pattern("#")
                .pattern("#")
                .input('#', Items.DEAD_FIRE_CORAL_FAN)
                .criterion(RecipeProvider.hasItem(Items.DEAD_FIRE_CORAL_FAN),
                        RecipeProvider.conditionsFromItem(Items.DEAD_FIRE_CORAL_FAN))
                .offerTo(exporter, new Identifier("dead_fire_coral_from_fan"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.DEAD_HORN_CORAL)
                .pattern("#")
                .pattern("#")
                .input('#', Items.DEAD_HORN_CORAL_FAN)
                .criterion(RecipeProvider.hasItem(Items.DEAD_HORN_CORAL_FAN),
                        RecipeProvider.conditionsFromItem(Items.DEAD_HORN_CORAL_FAN))
                .offerTo(exporter, new Identifier("dead_horn_coral_from_fan"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,Items.LILAC)
                .pattern("##")
                .pattern("##")
                .input('#', DecoItems.LILAC_FLOWER)
                .criterion(RecipeProvider.hasItem(DecoItems.LILAC_FLOWER),
                        RecipeProvider.conditionsFromItem(DecoItems.LILAC_FLOWER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.LILAC)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.MAGENTA_DYE)
                .input(DecoItems.LILAC_FLOWER)
                .group("magenta_dye")
                .criterion(RecipeProvider.hasItem(DecoItems.LILAC_FLOWER),
                        RecipeProvider.conditionsFromItem(DecoItems.LILAC_FLOWER))
                .offerTo(exporter, new Identifier("magenta_dye_from_lilac_flower"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,DecoItems.LILAC_STEW)
                .input(Items.BOWL)
                .input(Items.BROWN_MUSHROOM)
                .input(Items.RED_MUSHROOM)
                .input(DecoItems.LILAC_FLOWER)
                .criterion(RecipeProvider.hasItem(Items.BOWL),
                        RecipeProvider.conditionsFromItem(Items.BOWL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.LILAC_STEW)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.TALL_GRASS)
                .pattern("#")
                .pattern("#")
                .input('#', Items.GRASS)
                .criterion(RecipeProvider.hasItem(Items.GRASS),
                        RecipeProvider.conditionsFromItem(Items.GRASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.TALL_GRASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.LARGE_FERN)
                .pattern("#")
                .pattern("#")
                .input('#', Items.FERN)
                .criterion(RecipeProvider.hasItem(Items.FERN),
                        RecipeProvider.conditionsFromItem(Items.FERN))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.LARGE_FERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,Items.WARPED_ROOTS)
                .pattern("#")
                .pattern("#")
                .input('#', Items.NETHER_SPROUTS)
                .criterion(RecipeProvider.hasItem(Items.NETHER_SPROUTS),
                        RecipeProvider.conditionsFromItem(Items.NETHER_SPROUTS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.WARPED_ROOTS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,DecoItems.TALL_SEAGRASS)
                .pattern("#")
                .pattern("#")
                .input('#', Items.SEAGRASS)
                .criterion(RecipeProvider.hasItem(Items.SEAGRASS),
                        RecipeProvider.conditionsFromItem(Items.SEAGRASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.TALL_SEAGRASS)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.STONE_TILES), RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRACKED_STONE_TILES,
                        0.1f, 200).criterion(hasItem(DecoBlocks.STONE_TILES), conditionsFromItem(DecoBlocks.STONE_TILES))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRACKED_STONE_TILES)));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.POLISHED_BLACKSTONE_TILES), RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES,
                        0.1f, 200).criterion(hasItem(DecoBlocks.POLISHED_BLACKSTONE_TILES), conditionsFromItem(DecoBlocks.POLISHED_BLACKSTONE_TILES))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.DEEPSLATE_GRINDSTONE)
                .pattern("I-I")
                .pattern("# #")
                .input('I', Items.STICK)
                .input('-', DecoBlocks.DEEPSLATE_SLAB)
                .input('#', ItemTags.PLANKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.DEEPSLATE_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.DEEPSLATE_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.DEEPSLATE_GRINDSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.BLACKSTONE_GRINDSTONE)
                .pattern("I-I")
                .pattern("# #")
                .input('I', Items.STICK)
                .input('-', Items.BLACKSTONE_SLAB)
                .input('#', ItemTags.PLANKS)
                .criterion(RecipeProvider.hasItem(Items.BLACKSTONE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.BLACKSTONE_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BLACKSTONE_GRINDSTONE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE)
                .input(Items.SANDSTONE)
                .criterion(RecipeProvider.hasItem(Items.SANDSTONE),
                        RecipeProvider.conditionsFromItem(Items.SANDSTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.COBBLED_SANDSTONE)));

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE, Items.SANDSTONE);

        createStairsRecipe(DecoBlocks.COBBLED_SANDSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.COBBLED_SANDSTONE))
                .criterion(hasItem(DecoBlocks.COBBLED_SANDSTONE),conditionsFromItem(DecoBlocks.COBBLED_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.COBBLED_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE_STAIRS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE_STAIRS, DecoBlocks.COBBLED_SANDSTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE_SLAB, DecoBlocks.COBBLED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE_SLAB, Items.SANDSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE_SLAB, DecoBlocks.COBBLED_SANDSTONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.COBBLED_SANDSTONE_WALL, DecoBlocks.COBBLED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE_WALL, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SANDSTONE_WALL, DecoBlocks.COBBLED_SANDSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE, DecoBlocks.COBBLED_SANDSTONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE, DecoBlocks.COBBLED_SANDSTONE);

        createStairsRecipe(DecoBlocks.POLISHED_SANDSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_SANDSTONE))
                .criterion(hasItem(DecoBlocks.POLISHED_SANDSTONE),conditionsFromItem(DecoBlocks.POLISHED_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_STAIRS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_STAIRS, DecoBlocks.COBBLED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_STAIRS, DecoBlocks.POLISHED_SANDSTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_SLAB, DecoBlocks.POLISHED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_SLAB, Items.SANDSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_SLAB, DecoBlocks.COBBLED_SANDSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_SLAB, DecoBlocks.POLISHED_SANDSTONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_SANDSTONE_WALL, DecoBlocks.POLISHED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_WALL, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_WALL, DecoBlocks.COBBLED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SANDSTONE_WALL, DecoBlocks.POLISHED_SANDSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICKS, DecoBlocks.POLISHED_SANDSTONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICKS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICKS, DecoBlocks.COBBLED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICKS, DecoBlocks.POLISHED_SANDSTONE);

        createStairsRecipe(DecoBlocks.SANDSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.SANDSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.SANDSTONE_BRICKS),conditionsFromItem(DecoBlocks.SANDSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SANDSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_STAIRS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_STAIRS, DecoBlocks.COBBLED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_STAIRS, DecoBlocks.POLISHED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_STAIRS, DecoBlocks.SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_SLAB, DecoBlocks.POLISHED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_SLAB, Items.SANDSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_SLAB, DecoBlocks.COBBLED_SANDSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_SLAB, DecoBlocks.POLISHED_SANDSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_SLAB, DecoBlocks.SANDSTONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SANDSTONE_BRICK_WALL, DecoBlocks.POLISHED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_WALL, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_WALL, DecoBlocks.COBBLED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_WALL, DecoBlocks.POLISHED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SANDSTONE_BRICK_WALL, DecoBlocks.SANDSTONE_BRICKS);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE)
                .input(Items.RED_SANDSTONE)
                .criterion(RecipeProvider.hasItem(Items.RED_SANDSTONE),
                        RecipeProvider.conditionsFromItem(Items.RED_SANDSTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.COBBLED_RED_SANDSTONE)));

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE, Items.RED_SANDSTONE);

        createStairsRecipe(DecoBlocks.COBBLED_RED_SANDSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.COBBLED_RED_SANDSTONE))
                .criterion(hasItem(DecoBlocks.COBBLED_RED_SANDSTONE),conditionsFromItem(DecoBlocks.COBBLED_RED_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.COBBLED_RED_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE_STAIRS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE_STAIRS, DecoBlocks.COBBLED_RED_SANDSTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE_SLAB, DecoBlocks.COBBLED_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE_SLAB, Items.RED_SANDSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE_SLAB, DecoBlocks.COBBLED_RED_SANDSTONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.COBBLED_RED_SANDSTONE_WALL, DecoBlocks.COBBLED_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE_WALL, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_RED_SANDSTONE_WALL, DecoBlocks.COBBLED_RED_SANDSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE, DecoBlocks.COBBLED_RED_SANDSTONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE, DecoBlocks.COBBLED_RED_SANDSTONE);

        createStairsRecipe(DecoBlocks.POLISHED_RED_SANDSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_RED_SANDSTONE))
                .criterion(hasItem(DecoBlocks.POLISHED_RED_SANDSTONE),conditionsFromItem(DecoBlocks.POLISHED_RED_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_RED_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_STAIRS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_STAIRS, DecoBlocks.COBBLED_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_STAIRS, DecoBlocks.POLISHED_RED_SANDSTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_SLAB, DecoBlocks.POLISHED_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_SLAB, Items.RED_SANDSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_SLAB, DecoBlocks.COBBLED_RED_SANDSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_SLAB, DecoBlocks.POLISHED_RED_SANDSTONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_RED_SANDSTONE_WALL, DecoBlocks.POLISHED_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_WALL, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_WALL, DecoBlocks.COBBLED_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_RED_SANDSTONE_WALL, DecoBlocks.POLISHED_RED_SANDSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICKS, DecoBlocks.POLISHED_RED_SANDSTONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICKS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICKS, DecoBlocks.COBBLED_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICKS, DecoBlocks.POLISHED_RED_SANDSTONE);

        createStairsRecipe(DecoBlocks.RED_SANDSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.RED_SANDSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.RED_SANDSTONE_BRICKS),conditionsFromItem(DecoBlocks.RED_SANDSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RED_SANDSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_STAIRS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_STAIRS, DecoBlocks.COBBLED_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_STAIRS, DecoBlocks.POLISHED_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_STAIRS, DecoBlocks.RED_SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_SLAB, DecoBlocks.POLISHED_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_SLAB, Items.RED_SANDSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_SLAB, DecoBlocks.COBBLED_RED_SANDSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_SLAB, DecoBlocks.POLISHED_RED_SANDSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_SLAB, DecoBlocks.RED_SANDSTONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.RED_SANDSTONE_BRICK_WALL, DecoBlocks.POLISHED_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_WALL, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_WALL, DecoBlocks.COBBLED_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_WALL, DecoBlocks.POLISHED_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.RED_SANDSTONE_BRICK_WALL, DecoBlocks.RED_SANDSTONE_BRICKS);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE)
                .input(DecoBlocks.SOUL_SOILSTONE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.SOUL_SOILSTONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.COBBLED_SOUL_SOILSTONE)));

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);

        createStairsRecipe(DecoBlocks.COBBLED_SOUL_SOILSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.COBBLED_SOUL_SOILSTONE))
                .criterion(hasItem(DecoBlocks.COBBLED_SOUL_SOILSTONE),conditionsFromItem(DecoBlocks.COBBLED_SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.COBBLED_SOUL_SOILSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE_STAIRS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE_STAIRS, DecoBlocks.COBBLED_SOUL_SOILSTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE_SLAB, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE_SLAB, DecoBlocks.COBBLED_SOUL_SOILSTONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.COBBLED_SOUL_SOILSTONE_WALL, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.COBBLED_SOUL_SOILSTONE_WALL, DecoBlocks.COBBLED_SOUL_SOILSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE, DecoBlocks.COBBLED_SOUL_SOILSTONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE, DecoBlocks.COBBLED_SOUL_SOILSTONE);

        createStairsRecipe(DecoBlocks.POLISHED_SOUL_SOILSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_SOUL_SOILSTONE))
                .criterion(hasItem(DecoBlocks.POLISHED_SOUL_SOILSTONE),conditionsFromItem(DecoBlocks.POLISHED_SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_SOUL_SOILSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_STAIRS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_STAIRS, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_STAIRS, DecoBlocks.POLISHED_SOUL_SOILSTONE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB, DecoBlocks.POLISHED_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB, DecoBlocks.COBBLED_SOUL_SOILSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB, DecoBlocks.POLISHED_SOUL_SOILSTONE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.POLISHED_SOUL_SOILSTONE_WALL, DecoBlocks.POLISHED_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_WALL, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.POLISHED_SOUL_SOILSTONE_WALL, DecoBlocks.POLISHED_SOUL_SOILSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICKS, DecoBlocks.POLISHED_SOUL_SOILSTONE);

        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICKS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICKS, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICKS, DecoBlocks.POLISHED_SOUL_SOILSTONE);

        createStairsRecipe(DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.SOUL_SOILSTONE_BRICKS),conditionsFromItem(DecoBlocks.SOUL_SOILSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.POLISHED_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.SOUL_SOILSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.POLISHED_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.SOUL_SOILSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.COBBLED_SOUL_SOILSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.POLISHED_SOUL_SOILSTONE,2);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.SOUL_SOILSTONE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.POLISHED_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.POLISHED_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.SOUL_SOILSTONE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.FRAGILE_ICE)
                .pattern("##")
                .pattern("##")
                .input('#', DecoItems.ICE_SHARD)
                .criterion(RecipeProvider.hasItem(DecoItems.ICE_SHARD),
                        RecipeProvider.conditionsFromItem(DecoItems.ICE_SHARD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.FRAGILE_ICE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,Items.ICE)
                .pattern("###")
                .pattern("#W#")
                .pattern("###")
                .input('#', DecoItems.ICE_SHARD)
                .input('W', DecoTags.Items.WATER_ITEMS)
                .criterion(RecipeProvider.hasItem(DecoItems.ICE_SHARD),
                        RecipeProvider.conditionsFromItem(DecoItems.ICE_SHARD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.ICE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE)
                .pattern("#X#")
                .pattern("BPM")
                .pattern("#/#")
                .input('#', Items.COPPER_BLOCK)
                .input('X', DecoBlocks.COPPER_BARS)
                .input('/', Items.COPPER_INGOT)
                .input('B', DecoBlocks.BUBBLE_BLOCK)
                .input('P', Items.PISTON)
                .input('M', Items.MAGMA_BLOCK)
                .criterion(RecipeProvider.hasItem(DecoBlocks.BUBBLE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BUBBLE_BLOCK))
                .criterion(RecipeProvider.hasItem(Items.MAGMA_BLOCK),
                        RecipeProvider.conditionsFromItem(Items.MAGMA_BLOCK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BUBBLE_ELEVATOR_BLOCK_BUBBLE)));

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SANDSTONE, DecoBlocks.POLISHED_SANDSTONE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SANDSTONE, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SANDSTONE, DecoBlocks.COBBLED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SANDSTONE, DecoBlocks.POLISHED_SANDSTONE);


        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_RED_SANDSTONE, DecoBlocks.POLISHED_RED_SANDSTONE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_RED_SANDSTONE, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_RED_SANDSTONE, DecoBlocks.COBBLED_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_RED_SANDSTONE, DecoBlocks.POLISHED_RED_SANDSTONE);


        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SOUL_SOILSTONE, DecoBlocks.POLISHED_SOUL_SOILSTONE_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SOUL_SOILSTONE, DecoBlocks.COBBLED_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_POLISHED_SOUL_SOILSTONE, DecoBlocks.POLISHED_SOUL_SOILSTONE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.BLUE_DYE)
                .input(DecoBlocks.BLUE_HIBISCUS)
                .group("blue_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_HIBISCUS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_HIBISCUS))
                .offerTo(exporter, new Identifier("blue_dye_from_blue_hibiscus"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.MAGENTA_DYE)
                .input(DecoBlocks.BROMELIAD)
                .group("magenta_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.BROMELIAD),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BROMELIAD))
                .offerTo(exporter, new Identifier("magenta_dye_from_bromeliad"));

        offerCraftingTableVariantRecipe(exporter, DecoBlocks.OAK_CRAFTING_TABLE, Items.OAK_PLANKS);
        offerCraftingTableVariantRecipe(exporter, DecoBlocks.SPRUCE_CRAFTING_TABLE, Items.SPRUCE_PLANKS);
        offerCraftingTableVariantRecipe(exporter, DecoBlocks.BIRCH_CRAFTING_TABLE, Items.BIRCH_PLANKS);
        offerCraftingTableVariantRecipe(exporter, DecoBlocks.JUNGLE_CRAFTING_TABLE, Items.JUNGLE_PLANKS);
        offerCraftingTableVariantRecipe(exporter, DecoBlocks.ACACIA_CRAFTING_TABLE, Items.ACACIA_PLANKS);
        offerCraftingTableVariantRecipe(exporter, DecoBlocks.DARK_OAK_CRAFTING_TABLE, Items.DARK_OAK_PLANKS);
        offerCraftingTableVariantRecipe(exporter, DecoBlocks.MANGROVE_CRAFTING_TABLE, Items.MANGROVE_PLANKS);
        offerCraftingTableVariantRecipe(exporter, DecoBlocks.CRIMSON_CRAFTING_TABLE, Items.CRIMSON_PLANKS);
        offerCraftingTableVariantRecipe(exporter, DecoBlocks.WARPED_CRAFTING_TABLE, Items.WARPED_PLANKS);
        offerCraftingTableVariantRecipe(exporter, DecoBlocks.CACTUS_CRAFTING_TABLE, DecoBlocks.CACTUS_PLANKS);

        offerBarrelVariantRecipe(exporter, DecoBlocks.OAK_BARREL, Items.OAK_PLANKS);
        offerBarrelVariantRecipe(exporter, DecoBlocks.SPRUCE_BARREL, Items.SPRUCE_PLANKS);
        offerBarrelVariantRecipe(exporter, DecoBlocks.BIRCH_BARREL, Items.BIRCH_PLANKS);
        offerBarrelVariantRecipe(exporter, DecoBlocks.JUNGLE_BARREL, Items.JUNGLE_PLANKS);
        offerBarrelVariantRecipe(exporter, DecoBlocks.ACACIA_BARREL, Items.ACACIA_PLANKS);
        offerBarrelVariantRecipe(exporter, DecoBlocks.DARK_OAK_BARREL, Items.DARK_OAK_PLANKS);
        offerBarrelVariantRecipe(exporter, DecoBlocks.MANGROVE_BARREL, Items.MANGROVE_PLANKS);
        offerBarrelVariantRecipe(exporter, DecoBlocks.CRIMSON_BARREL, Items.CRIMSON_PLANKS);
        offerBarrelVariantRecipe(exporter, DecoBlocks.WARPED_BARREL, Items.WARPED_PLANKS);
        offerBarrelVariantRecipe(exporter, DecoBlocks.CACTUS_BARREL, DecoBlocks.CACTUS_PLANKS);

        offerCartographyTableVariantRecipe(exporter, DecoBlocks.OAK_CARTOGRAPHY_TABLE, Items.OAK_PLANKS);
        offerCartographyTableVariantRecipe(exporter, DecoBlocks.SPRUCE_CARTOGRAPHY_TABLE, Items.SPRUCE_PLANKS);
        offerCartographyTableVariantRecipe(exporter, DecoBlocks.BIRCH_CARTOGRAPHY_TABLE, Items.BIRCH_PLANKS);
        offerCartographyTableVariantRecipe(exporter, DecoBlocks.JUNGLE_CARTOGRAPHY_TABLE, Items.JUNGLE_PLANKS);
        offerCartographyTableVariantRecipe(exporter, DecoBlocks.ACACIA_CARTOGRAPHY_TABLE, Items.ACACIA_PLANKS);
        offerCartographyTableVariantRecipe(exporter, DecoBlocks.DARK_OAK_CARTOGRAPHY_TABLE, Items.DARK_OAK_PLANKS);
        offerCartographyTableVariantRecipe(exporter, DecoBlocks.MANGROVE_CARTOGRAPHY_TABLE, Items.MANGROVE_PLANKS);
        offerCartographyTableVariantRecipe(exporter, DecoBlocks.CRIMSON_CARTOGRAPHY_TABLE, Items.CRIMSON_PLANKS);
        offerCartographyTableVariantRecipe(exporter, DecoBlocks.WARPED_CARTOGRAPHY_TABLE, Items.WARPED_PLANKS);
        offerCartographyTableVariantRecipe(exporter, DecoBlocks.CACTUS_CARTOGRAPHY_TABLE, DecoBlocks.CACTUS_PLANKS);

        offerSmithingTableVariantRecipe(exporter, DecoBlocks.OAK_SMITHING_TABLE, Items.OAK_PLANKS);
        offerSmithingTableVariantRecipe(exporter, DecoBlocks.SPRUCE_SMITHING_TABLE, Items.SPRUCE_PLANKS);
        offerSmithingTableVariantRecipe(exporter, DecoBlocks.BIRCH_SMITHING_TABLE, Items.BIRCH_PLANKS);
        offerSmithingTableVariantRecipe(exporter, DecoBlocks.JUNGLE_SMITHING_TABLE, Items.JUNGLE_PLANKS);
        offerSmithingTableVariantRecipe(exporter, DecoBlocks.ACACIA_SMITHING_TABLE, Items.ACACIA_PLANKS);
        offerSmithingTableVariantRecipe(exporter, DecoBlocks.DARK_OAK_SMITHING_TABLE, Items.DARK_OAK_PLANKS);
        offerSmithingTableVariantRecipe(exporter, DecoBlocks.MANGROVE_SMITHING_TABLE, Items.MANGROVE_PLANKS);
        offerSmithingTableVariantRecipe(exporter, DecoBlocks.CRIMSON_SMITHING_TABLE, Items.CRIMSON_PLANKS);
        offerSmithingTableVariantRecipe(exporter, DecoBlocks.WARPED_SMITHING_TABLE, Items.WARPED_PLANKS);
        offerSmithingTableVariantRecipe(exporter, DecoBlocks.CACTUS_SMITHING_TABLE, DecoBlocks.CACTUS_PLANKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,Items.CRAFTING_TABLE)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .input('$', DecoTags.Items.DECO_CRAFTING_TABLES)
                .group("wooden_crafting_tables")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier("wooden_crafting_table"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,Items.BARREL)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .input('$', DecoTags.Items.DECO_BARRELS)
                .group("wooden_barrels")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier("wooden_barrel"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,Items.CARTOGRAPHY_TABLE)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .input('$', DecoTags.Items.DECO_CARTOGRAPHY_TABLES)
                .group("wooden_cartography_tables")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier("wooden_cartography_tables"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,Items.SMITHING_TABLE)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .input('$', DecoTags.Items.DECO_SMITHING_TABLES)
                .group("wooden_smithing_tables")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_PLANKS))
                .offerTo(exporter, new Identifier("wooden_smithing_tables"));

        offerLadderVariantRecipe(exporter, DecoBlocks.SPRUCE_LADDER, Items.SPRUCE_SLAB);
        offerLadderVariantRecipe(exporter, DecoBlocks.BIRCH_LADDER, Items.BIRCH_SLAB);
        offerLadderVariantRecipe(exporter, DecoBlocks.JUNGLE_LADDER, Items.JUNGLE_SLAB);
        offerLadderVariantRecipe(exporter, DecoBlocks.ACACIA_LADDER, Items.ACACIA_SLAB);
        offerLadderVariantRecipe(exporter, DecoBlocks.DARK_OAK_LADDER, Items.DARK_OAK_SLAB);
        offerLadderVariantRecipe(exporter, DecoBlocks.MANGROVE_LADDER, Items.MANGROVE_SLAB);
        offerLadderVariantRecipe(exporter, DecoBlocks.CRIMSON_LADDER, Items.CRIMSON_SLAB);
        offerLadderVariantRecipe(exporter, DecoBlocks.WARPED_LADDER, Items.WARPED_SLAB);
        offerLadderVariantRecipe(exporter, DecoBlocks.CACTUS_LADDER, DecoBlocks.CACTUS_PLANK_SLAB);
        offerLadderVariantRecipe(exporter, DecoBlocks.WOODEN_LADDER, DecoBlocks.WOODEN_SLAB);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,DecoBlocks.WOODEN_SAPLING)
                .pattern("OSB")
                .pattern("###")
                .pattern("JAD")
                .input('#', ItemTags.LOGS_THAT_BURN)
                .input('O', Items.OAK_SAPLING)
                .input('S', Items.SPRUCE_SAPLING)
                .input('B', Items.BIRCH_SAPLING)
                .input('J', Items.JUNGLE_SAPLING)
                .input('A', Items.ACACIA_SAPLING)
                .input('D', Items.DARK_OAK_SAPLING)
                .criterion("has_saplings", conditionsFromTag(ItemTags.SAPLINGS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WOODEN_SAPLING)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WOODEN_PLANKS,4)
                .input(DecoTags.Items.WOODEN_LOGS)
                .criterion("has_logs", conditionsFromTag(DecoTags.Items.WOODEN_LOGS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WOODEN_PLANKS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_PURPUR,2)
                .pattern("##")
                .pattern("##")
                .input('#', Items.PURPUR_SLAB)
                .criterion(RecipeProvider.hasItem(Items.PURPUR_SLAB),
                        RecipeProvider.conditionsFromItem(Items.PURPUR_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHISELED_PURPUR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR,4)
                .pattern("#P")
                .pattern("P#")
                .input('#', Items.PURPUR_BLOCK)
                .input('P', Items.POPPED_CHORUS_FRUIT)
                .criterion(RecipeProvider.hasItem(Items.PURPUR_BLOCK),
                        RecipeProvider.conditionsFromItem(Items.PURPUR_BLOCK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CUT_PURPUR)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR, Items.PURPUR_BLOCK);

        createStairsRecipe(DecoBlocks.CUT_PURPUR_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_PURPUR))
                .criterion(hasItem(DecoBlocks.CUT_PURPUR),conditionsFromItem(DecoBlocks.CUT_PURPUR))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_PURPUR_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_STAIRS, Items.PURPUR_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_STAIRS, DecoBlocks.CUT_PURPUR);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_SLAB, DecoBlocks.CUT_PURPUR);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_SLAB, Items.PURPUR_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_SLAB, DecoBlocks.CUT_PURPUR,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CUT_PURPUR_WALL, DecoBlocks.CUT_PURPUR);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_WALL, Items.PURPUR_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_WALL, DecoBlocks.CUT_PURPUR);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, DecoItems.PASSTOL,4)
                .pattern("S#")
                .pattern("#S")
                .input('#', Items.BONE_MEAL)
                .input('S', DecoTags.Items.MUSHROOMS)
                .criterion("has_mushrooms", conditionsFromTag(DecoTags.Items.MUSHROOMS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.PASSTOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, DecoItems.SHADDOL,4)
                .pattern("S#")
                .pattern("#S")
                .input('#', Items.INK_SAC)
                .input('S', DecoTags.Items.MUSHROOMS)
                .criterion("has_mushrooms", conditionsFromTag(DecoTags.Items.MUSHROOMS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.SHADDOL)));

        offerPastelBlockRecipe(exporter, DecoBlocks.LIGHT_GRAY_BLOCK, DecoBlocks.PASTEL_LIGHT_GRAY_BLOCK);
        offerPastelBlockRecipe(exporter, DecoBlocks.GRAY_BLOCK, DecoBlocks.PASTEL_GRAY_BLOCK);
        offerPastelBlockRecipe(exporter, DecoBlocks.BROWN_BLOCK, DecoBlocks.PASTEL_BROWN_BLOCK);
        offerPastelBlockRecipe(exporter, DecoBlocks.RED_BLOCK, DecoBlocks.PASTEL_RED_BLOCK);
        offerPastelBlockRecipe(exporter, DecoBlocks.ORANGE_BLOCK, DecoBlocks.PASTEL_ORANGE_BLOCK);
        offerPastelBlockRecipe(exporter, DecoBlocks.YELLOW_BLOCK, DecoBlocks.PASTEL_YELLOW_BLOCK);
        offerPastelBlockRecipe(exporter, DecoBlocks.LIME_BLOCK, DecoBlocks.PASTEL_LIME_BLOCK);
        offerPastelBlockRecipe(exporter, DecoBlocks.GREEN_BLOCK, DecoBlocks.PASTEL_GREEN_BLOCK);
        offerPastelBlockRecipe(exporter, DecoBlocks.CYAN_BLOCK, DecoBlocks.PASTEL_CYAN_BLOCK);
        offerPastelBlockRecipe(exporter, DecoBlocks.LIGHT_BLUE_BLOCK, DecoBlocks.PASTEL_LIGHT_BLUE_BLOCK);
        offerPastelBlockRecipe(exporter, DecoBlocks.BLUE_BLOCK, DecoBlocks.PASTEL_BLUE_BLOCK);
        offerPastelBlockRecipe(exporter, DecoBlocks.PURPLE_BLOCK, DecoBlocks.PASTEL_PURPLE_BLOCK);
        offerPastelBlockRecipe(exporter, DecoBlocks.MAGENTA_BLOCK, DecoBlocks.PASTEL_MAGENTA_BLOCK);
        offerPastelBlockRecipe(exporter, DecoBlocks.PINK_BLOCK, DecoBlocks.PASTEL_PINK_BLOCK);

        offerShadedBlockRecipe(exporter, DecoBlocks.LIGHT_GRAY_BLOCK, DecoBlocks.SHADED_LIGHT_GRAY_BLOCK);
        offerShadedBlockRecipe(exporter, DecoBlocks.GRAY_BLOCK, DecoBlocks.SHADED_GRAY_BLOCK);
        offerShadedBlockRecipe(exporter, DecoBlocks.BROWN_BLOCK, DecoBlocks.SHADED_BROWN_BLOCK);
        offerShadedBlockRecipe(exporter, DecoBlocks.RED_BLOCK, DecoBlocks.SHADED_RED_BLOCK);
        offerShadedBlockRecipe(exporter, DecoBlocks.ORANGE_BLOCK, DecoBlocks.SHADED_ORANGE_BLOCK);
        offerShadedBlockRecipe(exporter, DecoBlocks.YELLOW_BLOCK, DecoBlocks.SHADED_YELLOW_BLOCK);
        offerShadedBlockRecipe(exporter, DecoBlocks.LIME_BLOCK, DecoBlocks.SHADED_LIME_BLOCK);
        offerShadedBlockRecipe(exporter, DecoBlocks.GREEN_BLOCK, DecoBlocks.SHADED_GREEN_BLOCK);
        offerShadedBlockRecipe(exporter, DecoBlocks.CYAN_BLOCK, DecoBlocks.SHADED_CYAN_BLOCK);
        offerShadedBlockRecipe(exporter, DecoBlocks.LIGHT_BLUE_BLOCK, DecoBlocks.SHADED_LIGHT_BLUE_BLOCK);
        offerShadedBlockRecipe(exporter, DecoBlocks.BLUE_BLOCK, DecoBlocks.SHADED_BLUE_BLOCK);
        offerShadedBlockRecipe(exporter, DecoBlocks.PURPLE_BLOCK, DecoBlocks.SHADED_PURPLE_BLOCK);
        offerShadedBlockRecipe(exporter, DecoBlocks.MAGENTA_BLOCK, DecoBlocks.SHADED_MAGENTA_BLOCK);
        offerShadedBlockRecipe(exporter, DecoBlocks.PINK_BLOCK, DecoBlocks.SHADED_PINK_BLOCK);

        offerDyeBlockFromPastelRecipe(exporter, DecoBlocks.LIGHT_GRAY_BLOCK, DecoBlocks.PASTEL_LIGHT_GRAY_BLOCK);
        offerDyeBlockFromPastelRecipe(exporter, DecoBlocks.GRAY_BLOCK, DecoBlocks.PASTEL_GRAY_BLOCK);
        offerDyeBlockFromPastelRecipe(exporter, DecoBlocks.BROWN_BLOCK, DecoBlocks.PASTEL_BROWN_BLOCK);
        offerDyeBlockFromPastelRecipe(exporter, DecoBlocks.RED_BLOCK, DecoBlocks.PASTEL_RED_BLOCK);
        offerDyeBlockFromPastelRecipe(exporter, DecoBlocks.ORANGE_BLOCK, DecoBlocks.PASTEL_ORANGE_BLOCK);
        offerDyeBlockFromPastelRecipe(exporter, DecoBlocks.YELLOW_BLOCK, DecoBlocks.PASTEL_YELLOW_BLOCK);
        offerDyeBlockFromPastelRecipe(exporter, DecoBlocks.LIME_BLOCK, DecoBlocks.PASTEL_LIME_BLOCK);
        offerDyeBlockFromPastelRecipe(exporter, DecoBlocks.GREEN_BLOCK, DecoBlocks.PASTEL_GREEN_BLOCK);
        offerDyeBlockFromPastelRecipe(exporter, DecoBlocks.CYAN_BLOCK, DecoBlocks.PASTEL_CYAN_BLOCK);
        offerDyeBlockFromPastelRecipe(exporter, DecoBlocks.LIGHT_BLUE_BLOCK, DecoBlocks.PASTEL_LIGHT_BLUE_BLOCK);
        offerDyeBlockFromPastelRecipe(exporter, DecoBlocks.BLUE_BLOCK, DecoBlocks.PASTEL_BLUE_BLOCK);
        offerDyeBlockFromPastelRecipe(exporter, DecoBlocks.PURPLE_BLOCK, DecoBlocks.PASTEL_PURPLE_BLOCK);
        offerDyeBlockFromPastelRecipe(exporter, DecoBlocks.MAGENTA_BLOCK, DecoBlocks.PASTEL_MAGENTA_BLOCK);
        offerDyeBlockFromPastelRecipe(exporter, DecoBlocks.PINK_BLOCK, DecoBlocks.PASTEL_PINK_BLOCK);

        offerDyeBlockFromShadedRecipe(exporter, DecoBlocks.LIGHT_GRAY_BLOCK, DecoBlocks.SHADED_LIGHT_GRAY_BLOCK);
        offerDyeBlockFromShadedRecipe(exporter, DecoBlocks.GRAY_BLOCK, DecoBlocks.SHADED_GRAY_BLOCK);
        offerDyeBlockFromShadedRecipe(exporter, DecoBlocks.BROWN_BLOCK, DecoBlocks.SHADED_BROWN_BLOCK);
        offerDyeBlockFromShadedRecipe(exporter, DecoBlocks.RED_BLOCK, DecoBlocks.SHADED_RED_BLOCK);
        offerDyeBlockFromShadedRecipe(exporter, DecoBlocks.ORANGE_BLOCK, DecoBlocks.SHADED_ORANGE_BLOCK);
        offerDyeBlockFromShadedRecipe(exporter, DecoBlocks.YELLOW_BLOCK, DecoBlocks.SHADED_YELLOW_BLOCK);
        offerDyeBlockFromShadedRecipe(exporter, DecoBlocks.LIME_BLOCK, DecoBlocks.SHADED_LIME_BLOCK);
        offerDyeBlockFromShadedRecipe(exporter, DecoBlocks.GREEN_BLOCK, DecoBlocks.SHADED_GREEN_BLOCK);
        offerDyeBlockFromShadedRecipe(exporter, DecoBlocks.CYAN_BLOCK, DecoBlocks.SHADED_CYAN_BLOCK);
        offerDyeBlockFromShadedRecipe(exporter, DecoBlocks.LIGHT_BLUE_BLOCK, DecoBlocks.SHADED_LIGHT_BLUE_BLOCK);
        offerDyeBlockFromShadedRecipe(exporter, DecoBlocks.BLUE_BLOCK, DecoBlocks.SHADED_BLUE_BLOCK);
        offerDyeBlockFromShadedRecipe(exporter, DecoBlocks.PURPLE_BLOCK, DecoBlocks.SHADED_PURPLE_BLOCK);
        offerDyeBlockFromShadedRecipe(exporter, DecoBlocks.MAGENTA_BLOCK, DecoBlocks.SHADED_MAGENTA_BLOCK);
        offerDyeBlockFromShadedRecipe(exporter, DecoBlocks.PINK_BLOCK, DecoBlocks.SHADED_PINK_BLOCK);

        createStairsRecipe(DecoBlocks.OAK_WOOD_STAIRS, Ingredient.ofItems(Items.OAK_WOOD))
                .criterion(hasItem(Items.OAK_WOOD),conditionsFromItem(Items.OAK_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.OAK_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OAK_WOOD_SLAB, Items.OAK_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.OAK_WOOD_WALL, Items.OAK_WOOD);

        createStairsRecipe(DecoBlocks.SPRUCE_WOOD_STAIRS, Ingredient.ofItems(Items.SPRUCE_WOOD))
                .criterion(hasItem(Items.SPRUCE_WOOD),conditionsFromItem(Items.SPRUCE_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SPRUCE_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SPRUCE_WOOD_SLAB, Items.SPRUCE_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.SPRUCE_WOOD_WALL, Items.SPRUCE_WOOD);

        createStairsRecipe(DecoBlocks.BIRCH_WOOD_STAIRS, Ingredient.ofItems(Items.BIRCH_WOOD))
                .criterion(hasItem(Items.BIRCH_WOOD),conditionsFromItem(Items.BIRCH_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BIRCH_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BIRCH_WOOD_SLAB, Items.BIRCH_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.BIRCH_WOOD_WALL, Items.BIRCH_WOOD);

        createStairsRecipe(DecoBlocks.JUNGLE_WOOD_STAIRS, Ingredient.ofItems(Items.JUNGLE_WOOD))
                .criterion(hasItem(Items.JUNGLE_WOOD),conditionsFromItem(Items.JUNGLE_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.JUNGLE_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.JUNGLE_WOOD_SLAB, Items.JUNGLE_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.JUNGLE_WOOD_WALL, Items.JUNGLE_WOOD);

        createStairsRecipe(DecoBlocks.ACACIA_WOOD_STAIRS, Ingredient.ofItems(Items.ACACIA_WOOD))
                .criterion(hasItem(Items.ACACIA_WOOD),conditionsFromItem(Items.ACACIA_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ACACIA_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ACACIA_WOOD_SLAB, Items.ACACIA_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.ACACIA_WOOD_WALL, Items.ACACIA_WOOD);

        createStairsRecipe(DecoBlocks.DARK_OAK_WOOD_STAIRS, Ingredient.ofItems(Items.DARK_OAK_WOOD))
                .criterion(hasItem(Items.DARK_OAK_WOOD),conditionsFromItem(Items.DARK_OAK_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DARK_OAK_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DARK_OAK_WOOD_SLAB, Items.DARK_OAK_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.DARK_OAK_WOOD_WALL, Items.DARK_OAK_WOOD);

        createStairsRecipe(DecoBlocks.MANGROVE_WOOD_STAIRS, Ingredient.ofItems(Items.MANGROVE_WOOD))
                .criterion(hasItem(Items.MANGROVE_WOOD),conditionsFromItem(Items.MANGROVE_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MANGROVE_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MANGROVE_WOOD_SLAB, Items.MANGROVE_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.MANGROVE_WOOD_WALL, Items.MANGROVE_WOOD);

        createStairsRecipe(DecoBlocks.CRIMSON_HYPHAE_STAIRS, Ingredient.ofItems(Items.CRIMSON_HYPHAE))
                .criterion(hasItem(Items.CRIMSON_HYPHAE),conditionsFromItem(Items.CRIMSON_HYPHAE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRIMSON_HYPHAE_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRIMSON_HYPHAE_SLAB, Items.CRIMSON_HYPHAE);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.CRIMSON_HYPHAE_WALL, Items.CRIMSON_HYPHAE);

        createStairsRecipe(DecoBlocks.WARPED_HYPHAE_STAIRS, Ingredient.ofItems(Items.WARPED_HYPHAE))
                .criterion(hasItem(Items.WARPED_HYPHAE),conditionsFromItem(Items.WARPED_HYPHAE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WARPED_HYPHAE_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WARPED_HYPHAE_SLAB, Items.WARPED_HYPHAE);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.WARPED_HYPHAE_WALL, Items.WARPED_HYPHAE);

        createStairsRecipe(DecoBlocks.STRIPPED_OAK_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Items.STRIPPED_OAK_WOOD),conditionsFromItem(Items.STRIPPED_OAK_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STRIPPED_OAK_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_OAK_WOOD_SLAB, Items.STRIPPED_OAK_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_OAK_WOOD_WALL, Items.STRIPPED_OAK_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_SPRUCE_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Items.STRIPPED_SPRUCE_WOOD),conditionsFromItem(Items.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STRIPPED_SPRUCE_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_SPRUCE_WOOD_SLAB, Items.STRIPPED_SPRUCE_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_SPRUCE_WOOD_WALL, Items.STRIPPED_SPRUCE_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_BIRCH_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Items.STRIPPED_BIRCH_WOOD),conditionsFromItem(Items.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STRIPPED_BIRCH_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_BIRCH_WOOD_SLAB, Items.STRIPPED_BIRCH_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_BIRCH_WOOD_WALL, Items.STRIPPED_BIRCH_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_JUNGLE_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Items.STRIPPED_JUNGLE_WOOD),conditionsFromItem(Items.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STRIPPED_JUNGLE_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_JUNGLE_WOOD_SLAB, Items.STRIPPED_JUNGLE_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_JUNGLE_WOOD_WALL, Items.STRIPPED_JUNGLE_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_ACACIA_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Items.STRIPPED_ACACIA_WOOD),conditionsFromItem(Items.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STRIPPED_ACACIA_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_ACACIA_WOOD_SLAB, Items.STRIPPED_ACACIA_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_ACACIA_WOOD_WALL, Items.STRIPPED_ACACIA_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Items.STRIPPED_DARK_OAK_WOOD),conditionsFromItem(Items.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_DARK_OAK_WOOD_SLAB, Items.STRIPPED_DARK_OAK_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_DARK_OAK_WOOD_WALL, Items.STRIPPED_DARK_OAK_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_MANGROVE_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Items.STRIPPED_MANGROVE_WOOD),conditionsFromItem(Items.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STRIPPED_MANGROVE_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_MANGROVE_WOOD_SLAB, Items.STRIPPED_MANGROVE_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_MANGROVE_WOOD_WALL, Items.STRIPPED_MANGROVE_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS, Ingredient.ofItems(Items.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Items.STRIPPED_CRIMSON_HYPHAE),conditionsFromItem(Items.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, Items.STRIPPED_CRIMSON_HYPHAE);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_CRIMSON_HYPHAE_WALL, Items.STRIPPED_CRIMSON_HYPHAE);

        createStairsRecipe(DecoBlocks.STRIPPED_WARPED_HYPHAE_STAIRS, Ingredient.ofItems(Items.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Items.STRIPPED_WARPED_HYPHAE),conditionsFromItem(Items.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STRIPPED_WARPED_HYPHAE_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_WARPED_HYPHAE_SLAB, Items.STRIPPED_WARPED_HYPHAE);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_WARPED_HYPHAE_WALL, Items.STRIPPED_WARPED_HYPHAE);

        createStairsRecipe(DecoBlocks.WOODEN_WOOD_STAIRS, Ingredient.ofItems(DecoBlocks.WOODEN_WOOD))
                .criterion(hasItem(DecoBlocks.WOODEN_WOOD),conditionsFromItem(DecoBlocks.WOODEN_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WOODEN_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WOODEN_WOOD_SLAB, DecoBlocks.WOODEN_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.WOODEN_WOOD_WALL, DecoBlocks.WOODEN_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_WOODEN_WOOD_STAIRS, Ingredient.ofItems(DecoBlocks.STRIPPED_WOODEN_WOOD))
                .criterion(hasItem(DecoBlocks.STRIPPED_WOODEN_WOOD),conditionsFromItem(DecoBlocks.STRIPPED_WOODEN_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STRIPPED_WOODEN_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_WOODEN_WOOD_SLAB, DecoBlocks.STRIPPED_WOODEN_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_WOODEN_WOOD_WALL, DecoBlocks.STRIPPED_WOODEN_WOOD);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_NETHERRACK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.NETHERRACK)
                .criterion(RecipeProvider.hasItem(Items.NETHERRACK),
                        RecipeProvider.conditionsFromItem(Items.NETHERRACK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PACKED_NETHERRACK)));

        createStairsRecipe(DecoBlocks.PACKED_NETHERRACK_STAIRS, Ingredient.ofItems(DecoBlocks.PACKED_NETHERRACK))
                .criterion(hasItem(DecoBlocks.PACKED_NETHERRACK),conditionsFromItem(DecoBlocks.PACKED_NETHERRACK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PACKED_NETHERRACK_STAIRS)));
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_STAIRS, DecoBlocks.PACKED_NETHERRACK);

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_SLAB, DecoBlocks.PACKED_NETHERRACK);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_SLAB, DecoBlocks.PACKED_NETHERRACK,2);

        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks. PACKED_NETHERRACK_WALL, DecoBlocks.PACKED_NETHERRACK);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_WALL, DecoBlocks.PACKED_NETHERRACK);

        offerPolishedStoneRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.NETHERRACK_BRICKS, DecoBlocks.PACKED_NETHERRACK);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICKS, DecoBlocks.PACKED_NETHERRACK);

        createStairsRecipe(DecoBlocks.NETHERRACK_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.NETHERRACK_BRICKS))
                .criterion(hasItem(DecoBlocks.NETHERRACK_BRICKS),conditionsFromItem(DecoBlocks.NETHERRACK_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.NETHERRACK_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_STAIRS, DecoBlocks.PACKED_NETHERRACK);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_STAIRS, DecoBlocks.NETHERRACK_BRICKS);

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_SLAB, DecoBlocks.NETHERRACK_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_SLAB, DecoBlocks.PACKED_NETHERRACK,2);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_SLAB, DecoBlocks.NETHERRACK_BRICKS,2);

        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks. NETHERRACK_BRICK_WALL, DecoBlocks.NETHERRACK_BRICKS);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_WALL, DecoBlocks.PACKED_NETHERRACK);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_WALL, DecoBlocks.NETHERRACK_BRICKS);

        offerChiseledBlockRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_MUD_BRICKS, Items.MUD_BRICK_SLAB);

        offerChiseledBlockRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_ICE_BRICKS, DecoBlocks.ICE_BRICK_SLAB);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. CHISELED_ICE_BRICKS, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. CHISELED_ICE_BRICKS, DecoBlocks.ICE_BRICKS);

        offerChiseledBlockRecipe(exporter,RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_NETHERRACK_BRICKS, DecoBlocks.NETHERRACK_BRICK_SLAB);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. CHISELED_NETHERRACK_BRICKS, DecoBlocks.PACKED_NETHERRACK);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. CHISELED_NETHERRACK_BRICKS, DecoBlocks.NETHERRACK_BRICKS);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BASALT_BRICKS, Items.POLISHED_BASALT);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. BASALT_BRICKS, Items.BASALT);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. BASALT_BRICKS, Items.POLISHED_BASALT);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.GLOWSTONE), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_GLOWSTONE,
                        0.35f, 200).criterion(hasItem(Items.GLOWSTONE), conditionsFromItem(Items.GLOWSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_GLOWSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_CACTUS,4)
                .pattern("##")
                .pattern("##")
                .input('#', Items.CACTUS)
                .criterion(RecipeProvider.hasItem(Items.CACTUS),
                        RecipeProvider.conditionsFromItem(Items.CACTUS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PACKED_CACTUS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_PLANKS,2)
                .input(DecoBlocks.PACKED_CACTUS)
                .group("cactus_planks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.PACKED_CACTUS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.PACKED_CACTUS))
                .offerTo(exporter, new Identifier("cactus_planks_form_packed_cactus"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_PLANKS,2)
                .input(DecoBlocks.STRIPPED_CACTUS)
                .group("cactus_planks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.STRIPPED_CACTUS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.STRIPPED_CACTUS))
                .offerTo(exporter, new Identifier("cactus_planks_form_stripped_cactus"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.OAK_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.OAK_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.OAK_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.OAK_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.OAK_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.OAK_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.OAK_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.OAK_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.BIRCH_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.BIRCH_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.BIRCH_SLAB),
                        RecipeProvider.conditionsFromItem(Items.BIRCH_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BIRCH_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.BIRCH_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.BIRCH_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.BIRCH_SLAB),
                        RecipeProvider.conditionsFromItem(Items.BIRCH_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BIRCH_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.SPRUCE_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.SPRUCE_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.SPRUCE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.SPRUCE_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SPRUCE_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.SPRUCE_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.SPRUCE_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.SPRUCE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.SPRUCE_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SPRUCE_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.JUNGLE_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.JUNGLE_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.JUNGLE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.JUNGLE_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.JUNGLE_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.JUNGLE_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.JUNGLE_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.JUNGLE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.JUNGLE_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.JUNGLE_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.ACACIA_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.ACACIA_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.ACACIA_SLAB),
                        RecipeProvider.conditionsFromItem(Items.ACACIA_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.ACACIA_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.ACACIA_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.ACACIA_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.ACACIA_SLAB),
                        RecipeProvider.conditionsFromItem(Items.ACACIA_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.ACACIA_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.DARK_OAK_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.DARK_OAK_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.DARK_OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.DARK_OAK_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.DARK_OAK_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.DARK_OAK_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.DARK_OAK_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.DARK_OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.DARK_OAK_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.DARK_OAK_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.MANGROVE_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.MANGROVE_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.MANGROVE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.MANGROVE_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.MANGROVE_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.MANGROVE_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.MANGROVE_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.MANGROVE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.MANGROVE_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.MANGROVE_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.CRIMSON_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.CRIMSON_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.CRIMSON_SLAB),
                        RecipeProvider.conditionsFromItem(Items.CRIMSON_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRIMSON_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.CRIMSON_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.CRIMSON_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.CRIMSON_SLAB),
                        RecipeProvider.conditionsFromItem(Items.CRIMSON_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRIMSON_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.WARPED_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.WARPED_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.WARPED_SLAB),
                        RecipeProvider.conditionsFromItem(Items.WARPED_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WARPED_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.WARPED_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.WARPED_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.WARPED_SLAB),
                        RecipeProvider.conditionsFromItem(Items.WARPED_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WARPED_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.CACTUS_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.CACTUS_PLANK_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANK_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANK_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.CACTUS_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.CACTUS_PLANK_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANK_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANK_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.WOODEN_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.WOODEN_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WOODEN_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.WOODEN_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.WOODEN_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.WOODEN_PALLET_TRAPDOOR)));

        offerLampRecipe(exporter,DecoBlocks.WHITE_LAMP, Items.WHITE_STAINED_GLASS_PANE);

        offerLampRecipe(exporter,DecoBlocks.LIGHT_GRAY_LAMP, Items.LIGHT_GRAY_STAINED_GLASS_PANE);

        offerLampRecipe(exporter,DecoBlocks.GRAY_LAMP, Items.GRAY_STAINED_GLASS_PANE);

        offerLampRecipe(exporter,DecoBlocks.BLACK_LAMP, Items.BLACK_STAINED_GLASS_PANE);

        offerLampRecipe(exporter,DecoBlocks.BROWN_LAMP, Items.BROWN_STAINED_GLASS_PANE);

        offerLampRecipe(exporter,DecoBlocks.RED_LAMP, Items.RED_STAINED_GLASS_PANE);

        offerLampRecipe(exporter,DecoBlocks.ORANGE_LAMP, Items.ORANGE_STAINED_GLASS_PANE);

        offerLampRecipe(exporter,DecoBlocks.YELLOW_LAMP, Items.YELLOW_STAINED_GLASS_PANE);

        offerLampRecipe(exporter,DecoBlocks.LIME_LAMP, Items.LIME_STAINED_GLASS_PANE);

        offerLampRecipe(exporter,DecoBlocks.GREEN_LAMP, Items.GREEN_STAINED_GLASS_PANE);

        offerLampRecipe(exporter,DecoBlocks.CYAN_LAMP, Items.CYAN_STAINED_GLASS_PANE);

        offerLampRecipe(exporter,DecoBlocks.LIGHT_BLUE_LAMP, Items.LIGHT_BLUE_STAINED_GLASS_PANE);

        offerLampRecipe(exporter,DecoBlocks.BLUE_LAMP, Items.BLUE_STAINED_GLASS_PANE);

        offerLampRecipe(exporter,DecoBlocks.PURPLE_LAMP, Items.PURPLE_STAINED_GLASS_PANE);

        offerLampRecipe(exporter,DecoBlocks.MAGENTA_LAMP, Items.MAGENTA_STAINED_GLASS_PANE);

        offerLampRecipe(exporter,DecoBlocks.PINK_LAMP, Items.PINK_STAINED_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,Items.BROWN_MUSHROOM_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.BROWN_MUSHROOM)
                .group("giant_mushroom_blocks")
                .criterion(RecipeProvider.hasItem(Items.BROWN_MUSHROOM),
                        RecipeProvider.conditionsFromItem(Items.BROWN_MUSHROOM))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.BROWN_MUSHROOM_BLOCK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,Items.RED_MUSHROOM_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.RED_MUSHROOM)
                .group("giant_mushroom_blocks")
                .criterion(RecipeProvider.hasItem(Items.RED_MUSHROOM),
                        RecipeProvider.conditionsFromItem(Items.RED_MUSHROOM))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.RED_MUSHROOM_BLOCK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,Items.MUSHROOM_STEM)
                .pattern("##")
                .pattern("##")
                .input('#', DecoTags.Items.MUSHROOMS)
                .criterion("has_mushrooms", conditionsFromTag(DecoTags.Items.MUSHROOMS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.MUSHROOM_STEM)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_PLANKS,4)
                .input(DecoTags.Items.GIANT_MUSHROOM_BLOCKS)
                .group("planks")
                .criterion("has_logs", conditionsFromTag(DecoTags.Items.GIANT_MUSHROOM_BLOCKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.MUSHROOM_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_PLANKS,2)
                .input(Items.MUSHROOM_STEM)
                .group("planks")
                .criterion(RecipeProvider.hasItem(Items.MUSHROOM_STEM),
                        RecipeProvider.conditionsFromItem(Items.MUSHROOM_STEM))
                .offerTo(exporter, new Identifier("mushroom_planks_form_stem"));

        createStairsRecipe(DecoBlocks.MUSHROOM_STAIRS, Ingredient.ofItems(DecoBlocks.MUSHROOM_PLANKS))
                .group("wooden_stairs")
                .criterion(hasItem(DecoBlocks.MUSHROOM_PLANKS),conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MUSHROOM_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_SLAB,6)
                .pattern("###")
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_slab")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.MUSHROOM_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.MUSHROOM_FENCE,3)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_fence")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.MUSHROOM_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_fence_fence")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.MUSHROOM_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_PRESSURE_PLATE)
                .pattern("##")
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_pressure_plate")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.MUSHROOM_PRESSURE_PLATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_BUTTON)
                .input(DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_button")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.MUSHROOM_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_door")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.MUSHROOM_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_trapdoor")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.MUSHROOM_TRAPDOOR)));

        createSignRecipe(DecoItems.MUSHROOM_SIGN, Ingredient.ofItems(DecoBlocks.MUSHROOM_PLANKS))
                .group("wooden_sign")
                .criterion(hasItem(DecoBlocks.MUSHROOM_PLANKS),conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoItems.MUSHROOM_SIGN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.MUSHROOM_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.MUSHROOM_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.MUSHROOM_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.MUSHROOM_PALLET_TRAPDOOR)));

        offerCraftingTableVariantRecipe(exporter, DecoBlocks.MUSHROOM_CRAFTING_TABLE, DecoBlocks.MUSHROOM_PLANKS);
        offerBarrelVariantRecipe(exporter, DecoBlocks.MUSHROOM_BARREL, DecoBlocks.MUSHROOM_PLANKS);
        offerCartographyTableVariantRecipe(exporter, DecoBlocks.MUSHROOM_CARTOGRAPHY_TABLE, DecoBlocks.MUSHROOM_PLANKS);
        offerSmithingTableVariantRecipe(exporter, DecoBlocks.MUSHROOM_SMITHING_TABLE, DecoBlocks.MUSHROOM_PLANKS);
        offerLadderVariantRecipe(exporter, DecoBlocks.MUSHROOM_LADDER, DecoBlocks.MUSHROOM_SLAB);

        offerNoteBlockVariantRecipe(exporter, DecoBlocks.MUSHROOM_NOTE_BLOCK, DecoBlocks.MUSHROOM_PLANKS);
        offerNoteBlockVariantRecipe(exporter, DecoBlocks.OAK_NOTE_BLOCK, Items.OAK_PLANKS);
        offerNoteBlockVariantRecipe(exporter, DecoBlocks.SPRUCE_NOTE_BLOCK, Items.SPRUCE_PLANKS);
        offerNoteBlockVariantRecipe(exporter, DecoBlocks.BIRCH_NOTE_BLOCK, Items.BIRCH_PLANKS);
        offerNoteBlockVariantRecipe(exporter, DecoBlocks.JUNGLE_NOTE_BLOCK, Items.JUNGLE_PLANKS);
        offerNoteBlockVariantRecipe(exporter, DecoBlocks.DARK_OAK_NOTE_BLOCK, Items.DARK_OAK_PLANKS);
        offerNoteBlockVariantRecipe(exporter, DecoBlocks.ACACIA_NOTE_BLOCK, Items.ACACIA_PLANKS);
        offerNoteBlockVariantRecipe(exporter, DecoBlocks.MANGROVE_NOTE_BLOCK, Items.MANGROVE_PLANKS);
        offerNoteBlockVariantRecipe(exporter, DecoBlocks.CRIMSON_NOTE_BLOCK, Items.CRIMSON_PLANKS);
        offerNoteBlockVariantRecipe(exporter, DecoBlocks.WARPED_NOTE_BLOCK, Items.WARPED_PLANKS);
        offerNoteBlockVariantRecipe(exporter, DecoBlocks.CACTUS_NOTE_BLOCK, DecoBlocks.CACTUS_PLANKS);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE, Items.CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE, Items.CALCITE);

        createStairsRecipe(DecoBlocks.POLISHED_CALCITE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_CALCITE))
                .criterion(hasItem(DecoBlocks.POLISHED_CALCITE),conditionsFromItem(DecoBlocks.POLISHED_CALCITE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_CALCITE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_STAIRS, Items.CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_STAIRS, DecoBlocks.POLISHED_CALCITE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_SLAB, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_SLAB, Items.CALCITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_SLAB, DecoBlocks.POLISHED_CALCITE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.POLISHED_CALCITE_WALL, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_WALL, Items.CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_WALL, DecoBlocks.POLISHED_CALCITE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE, Items.CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE, DecoBlocks.POLISHED_CALCITE);

        createStairsRecipe(DecoBlocks.CUT_CALCITE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_CALCITE))
                .criterion(hasItem(DecoBlocks.CUT_CALCITE),conditionsFromItem(DecoBlocks.CUT_CALCITE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_CALCITE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_STAIRS, Items.CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_STAIRS, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_STAIRS, DecoBlocks.CUT_CALCITE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_SLAB, DecoBlocks.CUT_CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_SLAB, Items.CALCITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_SLAB, DecoBlocks.POLISHED_CALCITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_SLAB, DecoBlocks.CUT_CALCITE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CUT_CALCITE_WALL, DecoBlocks.CUT_CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_WALL, Items.CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_WALL, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_WALL, DecoBlocks.CUT_CALCITE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICKS, DecoBlocks.CUT_CALCITE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICKS, Items.CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICKS, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICKS, DecoBlocks.CUT_CALCITE);

        createStairsRecipe(DecoBlocks.CALCITE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CALCITE_BRICKS))
                .criterion(hasItem(DecoBlocks.CALCITE_BRICKS),conditionsFromItem(DecoBlocks.CALCITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CALCITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_STAIRS, Items.CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_STAIRS, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_STAIRS, DecoBlocks.CUT_CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_STAIRS, DecoBlocks.CALCITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_SLAB, DecoBlocks.CALCITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_SLAB, Items.CALCITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_SLAB, DecoBlocks.POLISHED_CALCITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_SLAB, DecoBlocks.CUT_CALCITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_SLAB, DecoBlocks.CALCITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CALCITE_BRICK_WALL, DecoBlocks.CALCITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_WALL, Items.CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_WALL, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_WALL, DecoBlocks.CUT_CALCITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_WALL, DecoBlocks.CALCITE_BRICKS);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE, Items.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE, Items.POLISHED_ANDESITE);

        createStairsRecipe(DecoBlocks.CUT_ANDESITE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_ANDESITE))
                .criterion(hasItem(DecoBlocks.CUT_ANDESITE),conditionsFromItem(DecoBlocks.CUT_ANDESITE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_ANDESITE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_STAIRS, Items.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_STAIRS, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_STAIRS, DecoBlocks.CUT_ANDESITE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_SLAB, DecoBlocks.CUT_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_SLAB, Items.ANDESITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_SLAB, Items.POLISHED_ANDESITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_SLAB, DecoBlocks.CUT_ANDESITE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CUT_ANDESITE_WALL, DecoBlocks.CUT_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_WALL, Items.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_WALL, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_WALL, DecoBlocks.CUT_ANDESITE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICKS, DecoBlocks.CUT_ANDESITE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICKS, Items.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICKS, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICKS, DecoBlocks.CUT_ANDESITE);

        createStairsRecipe(DecoBlocks.ANDESITE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.ANDESITE_BRICKS))
                .criterion(hasItem(DecoBlocks.ANDESITE_BRICKS),conditionsFromItem(DecoBlocks.ANDESITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ANDESITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_STAIRS, Items.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_STAIRS, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_STAIRS, DecoBlocks.CUT_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_STAIRS, DecoBlocks.ANDESITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_SLAB, DecoBlocks.ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_SLAB, Items.ANDESITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_SLAB, Items.POLISHED_ANDESITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_SLAB, DecoBlocks.CUT_ANDESITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_SLAB, DecoBlocks.ANDESITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.ANDESITE_BRICK_WALL, DecoBlocks.ANDESITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_WALL, Items.ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_WALL, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_WALL, DecoBlocks.CUT_ANDESITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_WALL, DecoBlocks.ANDESITE_BRICKS);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE, Items.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE, Items.POLISHED_GRANITE);

        createStairsRecipe(DecoBlocks.CUT_GRANITE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_GRANITE))
                .criterion(hasItem(DecoBlocks.CUT_GRANITE),conditionsFromItem(DecoBlocks.CUT_GRANITE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_GRANITE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_STAIRS, Items.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_STAIRS, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_STAIRS, DecoBlocks.CUT_GRANITE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_SLAB, DecoBlocks.CUT_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_SLAB, Items.GRANITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_SLAB, Items.POLISHED_GRANITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_SLAB, DecoBlocks.CUT_GRANITE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CUT_GRANITE_WALL, DecoBlocks.CUT_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_WALL, Items.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_WALL, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_WALL, DecoBlocks.CUT_GRANITE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICKS, DecoBlocks.CUT_GRANITE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICKS, Items.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICKS, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICKS, DecoBlocks.CUT_GRANITE);

        createStairsRecipe(DecoBlocks.GRANITE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.GRANITE_BRICKS))
                .criterion(hasItem(DecoBlocks.GRANITE_BRICKS),conditionsFromItem(DecoBlocks.GRANITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GRANITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_STAIRS, Items.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_STAIRS, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_STAIRS, DecoBlocks.CUT_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_STAIRS, DecoBlocks.GRANITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_SLAB, DecoBlocks.GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_SLAB, Items.GRANITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_SLAB, Items.POLISHED_GRANITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_SLAB, DecoBlocks.CUT_GRANITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_SLAB, DecoBlocks.GRANITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.GRANITE_BRICK_WALL, DecoBlocks.GRANITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_WALL, Items.GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_WALL, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_WALL, DecoBlocks.CUT_GRANITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_WALL, DecoBlocks.GRANITE_BRICKS);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE, Items.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE, Items.POLISHED_DIORITE);

        createStairsRecipe(DecoBlocks.CUT_DIORITE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_DIORITE))
                .criterion(hasItem(DecoBlocks.CUT_DIORITE),conditionsFromItem(DecoBlocks.CUT_DIORITE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_DIORITE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_STAIRS, Items.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_STAIRS, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_STAIRS, DecoBlocks.CUT_DIORITE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_SLAB, DecoBlocks.CUT_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_SLAB, Items.DIORITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_SLAB, Items.POLISHED_DIORITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_SLAB, DecoBlocks.CUT_DIORITE,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CUT_DIORITE_WALL, DecoBlocks.CUT_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_WALL, Items.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_WALL, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_WALL, DecoBlocks.CUT_DIORITE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICKS, DecoBlocks.CUT_DIORITE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICKS, Items.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICKS, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICKS, DecoBlocks.CUT_DIORITE);

        createStairsRecipe(DecoBlocks.DIORITE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.DIORITE_BRICKS))
                .criterion(hasItem(DecoBlocks.DIORITE_BRICKS),conditionsFromItem(DecoBlocks.DIORITE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DIORITE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_STAIRS, Items.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_STAIRS, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_STAIRS, DecoBlocks.CUT_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_STAIRS, DecoBlocks.DIORITE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_SLAB, DecoBlocks.DIORITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_SLAB, Items.DIORITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_SLAB, Items.POLISHED_DIORITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_SLAB, DecoBlocks.CUT_DIORITE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_SLAB, DecoBlocks.DIORITE_BRICKS,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DIORITE_BRICK_WALL, DecoBlocks.DIORITE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_WALL, Items.DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_WALL, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_WALL, DecoBlocks.CUT_DIORITE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_WALL, DecoBlocks.DIORITE_BRICKS);

        offerCutCopperRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD, Items.GOLD_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD, Items.GOLD_BLOCK,4);

        createStairsRecipe(DecoBlocks.CUT_GOLD_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_GOLD))
                .criterion(hasItem(DecoBlocks.CUT_GOLD),conditionsFromItem(DecoBlocks.CUT_GOLD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_GOLD_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_STAIRS, Items.GOLD_BLOCK,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_STAIRS, DecoBlocks.CUT_GOLD);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_SLAB, DecoBlocks.CUT_GOLD);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_SLAB, Items.GOLD_BLOCK,8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_SLAB, DecoBlocks.CUT_GOLD,2);

        createStairsRecipe(DecoBlocks.IRON_STAIRS, Ingredient.ofItems(Items.IRON_BLOCK))
                .criterion(hasItem(Items.IRON_BLOCK),conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.IRON_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_STAIRS, Items.IRON_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_SLAB, Items.IRON_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_SLAB, Items.IRON_BLOCK,2);

        createStairsRecipe(DecoBlocks.GOLD_STAIRS, Ingredient.ofItems(Items.GOLD_BLOCK))
                .criterion(hasItem(Items.GOLD_BLOCK),conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GOLD_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_STAIRS, Items.GOLD_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_SLAB, Items.GOLD_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_SLAB, Items.GOLD_BLOCK,2);

        createStairsRecipe(DecoBlocks.RAW_IRON_STAIRS, Ingredient.ofItems(Items.RAW_IRON_BLOCK))
                .criterion(hasItem(Items.RAW_IRON_BLOCK),conditionsFromItem(Items.RAW_IRON_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RAW_IRON_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_IRON_STAIRS, Items.RAW_IRON_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_IRON_SLAB, Items.RAW_IRON_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_IRON_SLAB, Items.RAW_IRON_BLOCK,2);

        createStairsRecipe(DecoBlocks.RAW_GOLD_STAIRS, Ingredient.ofItems(Items.RAW_GOLD_BLOCK))
                .criterion(hasItem(Items.RAW_GOLD_BLOCK),conditionsFromItem(Items.RAW_GOLD_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RAW_GOLD_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_GOLD_STAIRS, Items.RAW_GOLD_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_GOLD_SLAB, Items.RAW_GOLD_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_GOLD_SLAB, Items.RAW_GOLD_BLOCK,2);

        createStairsRecipe(DecoBlocks.COPPER_STAIRS, Ingredient.ofItems(Items.COPPER_BLOCK))
                .criterion(hasItem(Items.COPPER_BLOCK),conditionsFromItem(Items.COPPER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_STAIRS, Items.COPPER_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_SLAB, Items.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_SLAB, Items.COPPER_BLOCK,2);

        createStairsRecipe(DecoBlocks.EXPOSED_COPPER_STAIRS, Ingredient.ofItems(Items.EXPOSED_COPPER))
                .criterion(hasItem(Items.EXPOSED_COPPER),conditionsFromItem(Items.EXPOSED_COPPER))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.EXPOSED_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.EXPOSED_COPPER_STAIRS, Items.EXPOSED_COPPER);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.EXPOSED_COPPER_SLAB, Items.EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.EXPOSED_COPPER_SLAB, Items.EXPOSED_COPPER,2);

        createStairsRecipe(DecoBlocks.WEATHERED_COPPER_STAIRS, Ingredient.ofItems(Items.WEATHERED_COPPER))
                .criterion(hasItem(Items.WEATHERED_COPPER),conditionsFromItem(Items.WEATHERED_COPPER))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WEATHERED_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WEATHERED_COPPER_STAIRS, Items.WEATHERED_COPPER);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WEATHERED_COPPER_SLAB, Items.WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WEATHERED_COPPER_SLAB, Items.WEATHERED_COPPER,2);

        createStairsRecipe(DecoBlocks.OXIDIZED_COPPER_STAIRS, Ingredient.ofItems(Items.OXIDIZED_COPPER))
                .criterion(hasItem(Items.OXIDIZED_COPPER),conditionsFromItem(Items.OXIDIZED_COPPER))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.OXIDIZED_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OXIDIZED_COPPER_STAIRS, Items.OXIDIZED_COPPER);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OXIDIZED_COPPER_SLAB, Items.OXIDIZED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OXIDIZED_COPPER_SLAB, Items.OXIDIZED_COPPER,2);

        createStairsRecipe(DecoBlocks.WAXED_COPPER_STAIRS, Ingredient.ofItems(Items.WAXED_COPPER_BLOCK))
                .criterion(hasItem(Items.WAXED_COPPER_BLOCK),conditionsFromItem(Items.WAXED_COPPER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WAXED_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_COPPER_STAIRS, Items.WAXED_COPPER_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_COPPER_SLAB, Items.WAXED_COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_COPPER_SLAB, Items.WAXED_COPPER_BLOCK,2);

        createStairsRecipe(DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS, Ingredient.ofItems(Items.WAXED_EXPOSED_COPPER))
                .criterion(hasItem(Items.WAXED_EXPOSED_COPPER),conditionsFromItem(Items.WAXED_EXPOSED_COPPER))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS, Items.WAXED_EXPOSED_COPPER);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_EXPOSED_COPPER_SLAB, Items.WAXED_EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_EXPOSED_COPPER_SLAB, Items.WAXED_EXPOSED_COPPER,2);

        createStairsRecipe(DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS, Ingredient.ofItems(Items.WAXED_WEATHERED_COPPER))
                .criterion(hasItem(Items.WAXED_WEATHERED_COPPER),conditionsFromItem(Items.WAXED_WEATHERED_COPPER))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS, Items.WAXED_WEATHERED_COPPER);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_WEATHERED_COPPER_SLAB, Items.WAXED_WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_WEATHERED_COPPER_SLAB, Items.WAXED_WEATHERED_COPPER,2);

        createStairsRecipe(DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS, Ingredient.ofItems(Items.WAXED_OXIDIZED_COPPER))
                .criterion(hasItem(Items.WAXED_OXIDIZED_COPPER),conditionsFromItem(Items.WAXED_OXIDIZED_COPPER))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS, Items.WAXED_OXIDIZED_COPPER);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB, Items.WAXED_OXIDIZED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB, Items.WAXED_OXIDIZED_COPPER,2);

        createStairsRecipe(DecoBlocks.RAW_COPPER_STAIRS, Ingredient.ofItems(Items.RAW_COPPER_BLOCK))
                .criterion(hasItem(Items.RAW_COPPER_BLOCK),conditionsFromItem(Items.RAW_COPPER_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RAW_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_COPPER_STAIRS, Items.RAW_COPPER_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_COPPER_SLAB, Items.RAW_COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_COPPER_SLAB, Items.RAW_COPPER_BLOCK,2);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLESTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.STONE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.COBBLESTONE_STAIRS), conditionsFromItem(Items.COBBLESTONE_STAIRS))
                .offerTo(exporter, new Identifier("stone_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLESTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.STONE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.COBBLESTONE_SLAB), conditionsFromItem(Items.COBBLESTONE_SLAB))
                .offerTo(exporter, new Identifier("stone_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLESTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.STONE_WALL,
                        0.1f, 200).criterion(hasItem(Items.COBBLESTONE_WALL), conditionsFromItem(Items.COBBLESTONE_WALL))
                .offerTo(exporter, new Identifier("stone_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.STONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_STONE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.STONE_STAIRS), conditionsFromItem(Items.STONE_STAIRS))
                .offerTo(exporter, new Identifier("smooth_stone_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.STONE_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_STONE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.STONE_SLAB), conditionsFromItem(Items.STONE_SLAB))
                .offerTo(exporter, new Identifier("smooth_stone_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.STONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_STONE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.STONE_WALL), conditionsFromItem(DecoBlocks.STONE_WALL))
                .offerTo(exporter, new Identifier("smooth_stone_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLED_DEEPSLATE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEEPSLATE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.COBBLED_DEEPSLATE_STAIRS), conditionsFromItem(Items.COBBLED_DEEPSLATE_STAIRS))
                .offerTo(exporter, new Identifier("deepslate_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLED_DEEPSLATE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEEPSLATE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.COBBLED_DEEPSLATE_SLAB), conditionsFromItem(Items.COBBLED_DEEPSLATE_SLAB))
                .offerTo(exporter, new Identifier("deepslate_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLED_DEEPSLATE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.DEEPSLATE_WALL,
                        0.1f, 200).criterion(hasItem(Items.COBBLED_DEEPSLATE_WALL), conditionsFromItem(Items.COBBLED_DEEPSLATE_WALL))
                .offerTo(exporter, new Identifier("deepslate_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.SANDSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_SANDSTONE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.SANDSTONE_STAIRS), conditionsFromItem(Items.SANDSTONE_STAIRS))
                .offerTo(exporter, new Identifier("smooth_sandstone_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.SANDSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_SANDSTONE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.SANDSTONE_SLAB), conditionsFromItem(Items.SANDSTONE_SLAB))
                .offerTo(exporter, new Identifier("smooth_sandstone_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.SANDSTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_SANDSTONE_WALL,
                        0.1f, 200).criterion(hasItem(Items.SANDSTONE_WALL), conditionsFromItem(Items.SANDSTONE_WALL))
                .offerTo(exporter, new Identifier("smooth_sandstone_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_SANDSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_RED_SANDSTONE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.RED_SANDSTONE_STAIRS), conditionsFromItem(Items.RED_SANDSTONE_STAIRS))
                .offerTo(exporter, new Identifier("smooth_red_sandstone_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_SANDSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_RED_SANDSTONE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.RED_SANDSTONE_SLAB), conditionsFromItem(Items.RED_SANDSTONE_SLAB))
                .offerTo(exporter, new Identifier("smooth_red_sandstone_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_SANDSTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_RED_SANDSTONE_WALL,
                        0.1f, 200).criterion(hasItem(Items.RED_SANDSTONE_WALL), conditionsFromItem(Items.RED_SANDSTONE_WALL))
                .offerTo(exporter, new Identifier("smooth_red_sandstone_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.QUARTZ_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_QUARTZ_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.QUARTZ_STAIRS), conditionsFromItem(Items.QUARTZ_STAIRS))
                .offerTo(exporter, new Identifier("smooth_quartz_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.QUARTZ_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_QUARTZ_SLAB,
                        0.1f, 200).criterion(hasItem(Items.QUARTZ_SLAB), conditionsFromItem(Items.QUARTZ_SLAB))
                .offerTo(exporter, new Identifier("smooth_quartz_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.QUARTZ_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_QUARTZ_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.QUARTZ_WALL), conditionsFromItem(DecoBlocks.QUARTZ_WALL))
                .offerTo(exporter, new Identifier("smooth_quartz_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.SOUL_SOILSTONE_STAIRS), conditionsFromItem(DecoBlocks.SOUL_SOILSTONE_STAIRS))
                .offerTo(exporter, new Identifier("smooth_soul_soilstone_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.SOUL_SOILSTONE_SLAB), conditionsFromItem(DecoBlocks.SOUL_SOILSTONE_SLAB))
                .offerTo(exporter, new Identifier("smooth_soul_soilstone_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.SOUL_SOILSTONE_WALL), conditionsFromItem(DecoBlocks.SOUL_SOILSTONE_WALL))
                .offerTo(exporter, new Identifier("smooth_soul_soilstone_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BLACKSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_BLACKSTONE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.BLACKSTONE_STAIRS), conditionsFromItem(Items.BLACKSTONE_STAIRS))
                .offerTo(exporter, new Identifier("smooth_blackstone_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BLACKSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_BLACKSTONE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.BLACKSTONE_SLAB), conditionsFromItem(Items.BLACKSTONE_SLAB))
                .offerTo(exporter, new Identifier("smooth_blackstone_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BLACKSTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_BLACKSTONE_WALL,
                        0.1f, 200).criterion(hasItem(Items.BLACKSTONE_WALL), conditionsFromItem(Items.BLACKSTONE_WALL))
                .offerTo(exporter, new Identifier("smooth_blackstone_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.DEEPSLATE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_DEEPSLATE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.DEEPSLATE_STAIRS), conditionsFromItem(DecoBlocks.DEEPSLATE_STAIRS))
                .offerTo(exporter, new Identifier("smooth_deepslate_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.DEEPSLATE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_DEEPSLATE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.DEEPSLATE_SLAB), conditionsFromItem(DecoBlocks.DEEPSLATE_SLAB))
                .offerTo(exporter, new Identifier("smooth_deepslate_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.DEEPSLATE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_DEEPSLATE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.DEEPSLATE_WALL), conditionsFromItem(DecoBlocks.DEEPSLATE_WALL))
                .offerTo(exporter, new Identifier("smooth_deepslate_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RAW_IRON_BLOCK), RecipeCategory.MISC, Items.IRON_BLOCK,
                        6.3f, 1800).criterion(hasItem(Items.RAW_IRON_BLOCK), conditionsFromItem(Items.RAW_IRON_BLOCK))
                .offerTo(exporter, new Identifier("iron_block_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_IRON_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_IRON_STAIRS), conditionsFromItem(DecoBlocks.RAW_IRON_STAIRS))
                .offerTo(exporter, new Identifier("iron_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_IRON_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_IRON_SLAB), conditionsFromItem(DecoBlocks.RAW_IRON_SLAB))
                .offerTo(exporter, new Identifier("iron_slab_from_smelting"));

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(Items.RAW_IRON_BLOCK), RecipeCategory.MISC, Items.IRON_BLOCK,
                        6.3f, 900).criterion(hasItem(Items.RAW_IRON_BLOCK), conditionsFromItem(Items.RAW_IRON_BLOCK))
                .offerTo(exporter, new Identifier("iron_block_from_blasting"));

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_IRON_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_STAIRS,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_IRON_STAIRS), conditionsFromItem(DecoBlocks.RAW_IRON_STAIRS))
                .offerTo(exporter, new Identifier("iron_stairs_from_blasting"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_IRON_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_SLAB,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_IRON_SLAB), conditionsFromItem(DecoBlocks.RAW_IRON_SLAB))
                .offerTo(exporter, new Identifier("iron_slab_from_blasting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC, Items.GOLD_BLOCK,
                        6.3f, 1800).criterion(hasItem(Items.RAW_GOLD_BLOCK), conditionsFromItem(Items.RAW_GOLD_BLOCK))
                .offerTo(exporter, new Identifier("gold_block_from_smelting"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC, Items.GOLD_BLOCK,
                        6.3f, 900).criterion(hasItem(Items.RAW_GOLD_BLOCK), conditionsFromItem(Items.RAW_GOLD_BLOCK))
                .offerTo(exporter, new Identifier("gold_block_from_blasting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_GOLD_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_GOLD_STAIRS), conditionsFromItem(DecoBlocks.RAW_GOLD_STAIRS))
                .offerTo(exporter, new Identifier("gold_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_GOLD_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_GOLD_SLAB), conditionsFromItem(DecoBlocks.RAW_GOLD_SLAB))
                .offerTo(exporter, new Identifier("gold_slab_from_smelting"));

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_GOLD_STAIRS),  RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_STAIRS,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_GOLD_STAIRS), conditionsFromItem(DecoBlocks.RAW_GOLD_STAIRS))
                .offerTo(exporter, new Identifier("gold_stairs_from_blasting"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_GOLD_SLAB),  RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_SLAB,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_GOLD_SLAB), conditionsFromItem(DecoBlocks.RAW_GOLD_SLAB))
                .offerTo(exporter, new Identifier("gold_slab_from_blasting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC, Items.COPPER_BLOCK,
                        6.3f, 1800).criterion(hasItem(Items.RAW_COPPER_BLOCK), conditionsFromItem(Items.RAW_COPPER_BLOCK))
                .offerTo(exporter, new Identifier("copper_block_from_smelting"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC, Items.COPPER_BLOCK,
                        6.3f, 900).criterion(hasItem(Items.RAW_COPPER_BLOCK), conditionsFromItem(Items.RAW_COPPER_BLOCK))
                .offerTo(exporter, new Identifier("copper_block_from_blasting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_COPPER_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_COPPER_STAIRS), conditionsFromItem(DecoBlocks.RAW_COPPER_STAIRS))
                .offerTo(exporter, new Identifier("copper_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_COPPER_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_COPPER_SLAB), conditionsFromItem(DecoBlocks.RAW_COPPER_SLAB))
                .offerTo(exporter, new Identifier("copper_slab_from_smelting"));

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_COPPER_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_STAIRS,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_COPPER_STAIRS), conditionsFromItem(DecoBlocks.RAW_COPPER_STAIRS))
                .offerTo(exporter, new Identifier("copper_stairs_from_blasting"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_COPPER_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_SLAB,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_COPPER_SLAB), conditionsFromItem(DecoBlocks.RAW_COPPER_SLAB))
                .offerTo(exporter, new Identifier("copper_slab_from_blasting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.DEEPSLATE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.DEEPSLATE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(Items.DEEPSLATE),
                        RecipeProvider.conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.DEEPSLATE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.COBBLED_DEEPSLATE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.COBBLED_DEEPSLATE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(Items.COBBLED_DEEPSLATE),
                        RecipeProvider.conditionsFromItem(Items.COBBLED_DEEPSLATE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.COBBLED_DEEPSLATE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_DEEPSLATE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.POLISHED_DEEPSLATE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(Items.POLISHED_DEEPSLATE),
                        RecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.POLISHED_DEEPSLATE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.STONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.STONE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(Items.STONE),
                        RecipeProvider.conditionsFromItem(Items.STONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.STONE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_STONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.POLISHED_STONE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(DecoBlocks.POLISHED_STONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.POLISHED_STONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.POLISHED_STONE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.BLACKSTONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.BLACKSTONE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(Items.BLACKSTONE),
                        RecipeProvider.conditionsFromItem(Items.BLACKSTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BLACKSTONE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_BLACKSTONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.POLISHED_BLACKSTONE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(Items.POLISHED_BLACKSTONE),
                        RecipeProvider.conditionsFromItem(Items.POLISHED_BLACKSTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.POLISHED_BLACKSTONE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.HEAVY_GOLD_BARS)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.GOLD_BARS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.GOLD_BARS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.GOLD_BARS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.HEAVY_GOLD_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.GOLD_INGOT)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.GOLD_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.LIGHT_GOLD_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.GOLD_NUGGET)
                .criterion(RecipeProvider.hasItem(Items.GOLD_NUGGET),
                        RecipeProvider.conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.LIGHT_GOLD_BARS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN)
                .input(ItemTags.SAND)
                .input(Items.OBSIDIAN)
                .criterion(RecipeProvider.hasItem(Items.OBSIDIAN),
                        RecipeProvider.conditionsFromItem(Items.OBSIDIAN))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SANDED_OBSIDIAN)));

        createStairsRecipe(DecoBlocks.SANDED_OBSIDIAN_STAIRS, Ingredient.ofItems(DecoBlocks.SANDED_OBSIDIAN))
                .criterion(hasItem(DecoBlocks.SANDED_OBSIDIAN),conditionsFromItem(DecoBlocks.SANDED_OBSIDIAN))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SANDED_OBSIDIAN_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_STAIRS, DecoBlocks.SANDED_OBSIDIAN);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_SLAB, DecoBlocks.SANDED_OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_SLAB, DecoBlocks.SANDED_OBSIDIAN,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.SANDED_OBSIDIAN_WALL, DecoBlocks.SANDED_OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_WALL, DecoBlocks.SANDED_OBSIDIAN);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.OBSIDIAN), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN,
                        0.1f, 200).criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SMOOTH_OBSIDIAN)));

        createStairsRecipe(DecoBlocks.SMOOTH_OBSIDIAN_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_OBSIDIAN))
                .criterion(hasItem(DecoBlocks.SMOOTH_OBSIDIAN),conditionsFromItem(DecoBlocks.SMOOTH_OBSIDIAN))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_OBSIDIAN_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_STAIRS, DecoBlocks.SMOOTH_OBSIDIAN);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.OBSIDIAN_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.OBSIDIAN_STAIRS), conditionsFromItem(DecoBlocks.OBSIDIAN_STAIRS))
                .offerTo(exporter, new Identifier("smooth_obsidian_stairs_from_smelting"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_SLAB, DecoBlocks.SMOOTH_OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_SLAB, DecoBlocks.SMOOTH_OBSIDIAN,2);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.OBSIDIAN_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.OBSIDIAN_SLAB), conditionsFromItem(DecoBlocks.OBSIDIAN_SLAB))
                .offerTo(exporter, new Identifier("smooth_obsidian_slab_from_smelting"));

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_OBSIDIAN_WALL, DecoBlocks.SMOOTH_OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_WALL, DecoBlocks.SMOOTH_OBSIDIAN);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.OBSIDIAN_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_OBSIDIAN_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.OBSIDIAN_WALL), conditionsFromItem(DecoBlocks.OBSIDIAN_WALL))
                .offerTo(exporter, new Identifier("smooth_obsidian_wall_from_smelting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN,4)
                .pattern("#O")
                .pattern("O#")
                .input('#', DecoBlocks.SANDED_OBSIDIAN)
                .input('O', Items.OBSIDIAN)
                .criterion(RecipeProvider.hasItem(DecoBlocks.SANDED_OBSIDIAN),
                        RecipeProvider.conditionsFromItem(DecoBlocks.SANDED_OBSIDIAN))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CUT_OBSIDIAN)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN, DecoBlocks.SANDED_OBSIDIAN);

        createStairsRecipe(DecoBlocks.CUT_OBSIDIAN_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_OBSIDIAN))
                .criterion(hasItem(DecoBlocks.CUT_OBSIDIAN),conditionsFromItem(DecoBlocks.CUT_OBSIDIAN))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_OBSIDIAN_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_STAIRS, DecoBlocks.SANDED_OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_STAIRS, DecoBlocks.CUT_OBSIDIAN);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_SLAB, DecoBlocks.CUT_OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_SLAB, DecoBlocks.SANDED_OBSIDIAN,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_SLAB, DecoBlocks.CUT_OBSIDIAN,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CUT_OBSIDIAN_WALL, DecoBlocks.CUT_OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_WALL, DecoBlocks.SANDED_OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_WALL, DecoBlocks.CUT_OBSIDIAN);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_MAGMA_BLOCK, DecoBlocks.MAGMA_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_MAGMA_BLOCK, DecoBlocks.MAGMA_SLAB);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_BUBBLE_BLOCK, DecoBlocks.BUBBLE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_BUBBLE_BLOCK, DecoBlocks.BUBBLE_SLAB);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(DecoBlocks.BUTTERCUP)
                .group("yellow_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.BUTTERCUP),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BUTTERCUP))
                .offerTo(exporter, new Identifier("yellow_dye_from_buttercup"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIME_DYE)
                .input(DecoBlocks.NIGHTSHADE)
                .group("lime_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.NIGHTSHADE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.NIGHTSHADE))
                .offerTo(exporter, new Identifier("lime_dye_from_bromeliad"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLACK_DYE)
                .input(DecoBlocks.ENDERSHADE)
                .group("black_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.ENDERSHADE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.ENDERSHADE))
                .offerTo(exporter, new Identifier("black_dye_from_endershade"));

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE, DecoBlocks.POLISHED_END_STONE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE, Items.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE, DecoBlocks.POLISHED_END_STONE);


        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE, Items.END_STONE);


        createStairsRecipe(DecoBlocks.POLISHED_END_STONE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_END_STONE))
                .criterion(hasItem(DecoBlocks.POLISHED_END_STONE),conditionsFromItem(DecoBlocks.POLISHED_END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_END_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_STAIRS, DecoBlocks.POLISHED_END_STONE);


        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_SLAB, DecoBlocks.POLISHED_END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_SLAB, DecoBlocks.POLISHED_END_STONE,2);


        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.POLISHED_END_STONE_WALL, DecoBlocks.POLISHED_END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_WALL, DecoBlocks.POLISHED_END_STONE);


        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.END_STONE_BRICKS, DecoBlocks.POLISHED_END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.END_STONE_BRICK_STAIRS, DecoBlocks.POLISHED_END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.END_STONE_BRICK_SLAB, DecoBlocks.POLISHED_END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, Items.END_STONE_BRICK_WALL, DecoBlocks.POLISHED_END_STONE);


        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.END_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICKS,
                        0.1f, 200).criterion(hasItem(Items.END_STONE_BRICKS), conditionsFromItem(Items.END_STONE_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRACKED_END_STONE_BRICKS)));


        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, Items.END_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, Items.END_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, Items.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, DecoBlocks.POLISHED_END_STONE);


        createStairsRecipe(DecoBlocks.END_STONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.END_STONE_TILES))
                .criterion(hasItem(DecoBlocks.END_STONE_TILES),conditionsFromItem(DecoBlocks.END_STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.END_STONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_STAIRS, DecoBlocks.END_STONE_TILES);


        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_SLAB, DecoBlocks.END_STONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_SLAB, DecoBlocks.END_STONE_TILES,2);


        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_TILE_WALL, DecoBlocks.END_STONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_WALL, DecoBlocks.END_STONE_TILES);


        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_STAIRS, Items.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_SLAB, Items.END_STONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_WALL, Items.END_STONE);


        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_STAIRS, DecoBlocks.POLISHED_END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_SLAB, DecoBlocks.POLISHED_END_STONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_WALL, DecoBlocks.POLISHED_END_STONE);


        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_STAIRS, Items.END_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_SLAB, Items.END_STONE_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_WALL, Items.END_STONE_BRICKS);


        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_TILES), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILES,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_TILES), conditionsFromItem(DecoBlocks.END_STONE_TILES))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRACKED_END_STONE_TILES)));


        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.END_STONE), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE,
                        0.1f, 200).criterion(hasItem(Items.END_STONE), conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SMOOTH_END_STONE)));


        createStairsRecipe(DecoBlocks.SMOOTH_END_STONE_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_END_STONE))
                .criterion(hasItem(DecoBlocks.SMOOTH_END_STONE),conditionsFromItem(DecoBlocks.SMOOTH_END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_END_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_STAIRS, DecoBlocks.SMOOTH_END_STONE);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_STAIRS), conditionsFromItem(DecoBlocks.END_STONE_STAIRS))
                .offerTo(exporter, new Identifier("smooth_end_stone_stairs_from_smelting"));


        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_SLAB, DecoBlocks.SMOOTH_END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_SLAB, DecoBlocks.SMOOTH_END_STONE,2);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_SLAB), conditionsFromItem(DecoBlocks.END_STONE_SLAB))
                .offerTo(exporter, new Identifier("smooth_end_stone_slab_from_smelting"));


        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_END_STONE_WALL, DecoBlocks.SMOOTH_END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_WALL, DecoBlocks.SMOOTH_END_STONE);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_END_STONE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_WALL), conditionsFromItem(DecoBlocks.END_STONE_WALL))
                .offerTo(exporter, new Identifier("smooth_endstone_wall_from_smelting"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.END_STONE_BUTTON)
                .input(Items.END_STONE)
                .criterion(RecipeProvider.hasItem(Items.END_STONE),
                        RecipeProvider.conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.END_STONE_BUTTON)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_BUTTON, Items.END_STONE);

        offerPressurePlateRecipe(exporter, DecoBlocks.END_STONE_PRESSURE_PLATE, Items.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_PRESSURE_PLATE, Items.END_STONE);

        offerPressurePlateRecipe(exporter, DecoBlocks.POLISHED_END_STONE_PRESSURE_PLATE, DecoBlocks.POLISHED_END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_PRESSURE_PLATE, Items.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_PRESSURE_PLATE, DecoBlocks.POLISHED_END_STONE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_END_STONE_BUTTON)
                .input(DecoBlocks.POLISHED_END_STONE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.POLISHED_END_STONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.POLISHED_END_STONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.POLISHED_END_STONE_BUTTON)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_BUTTON, Items.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_BUTTON, DecoBlocks.POLISHED_END_STONE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.END_STONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.END_STONE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(Items.END_STONE),
                        RecipeProvider.conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.END_STONE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_END_STONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.POLISHED_END_STONE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(DecoBlocks.POLISHED_END_STONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.POLISHED_END_STONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.POLISHED_END_STONE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_BLAST_FURNACE)
                .pattern("III")
                .pattern("IXI")
                .pattern("###")
                .input('I', Items.IRON_INGOT)
                .input('X', DecoBlocks.END_STONE_FURNACE)
                .input('#', DecoBlocks.SMOOTH_END_STONE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.SMOOTH_END_STONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.SMOOTH_END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.END_STONE_BLAST_FURNACE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_SMOKER)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', ItemTags.LOGS)
                .input('X', DecoBlocks.END_STONE_FURNACE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.END_STONE_FURNACE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.END_STONE_FURNACE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.END_STONE_SMOKER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_STONECUTTER)
                .pattern(" I ")
                .pattern("###")
                .input('I', Items.IRON_INGOT)
                .input('#', Items.END_STONE)
                .criterion(RecipeProvider.hasItem(Items.END_STONE),
                        RecipeProvider.conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.END_STONE_STONECUTTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_GRINDSTONE)
                .pattern("I-I")
                .pattern("# #")
                .input('I', Items.STICK)
                .input('-', DecoBlocks.END_STONE_SLAB)
                .input('#', ItemTags.PLANKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.END_STONE_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.END_STONE_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.END_STONE_GRINDSTONE)));
    }
    public static void offerLadderVariantRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible woodInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output,3)
                .input('#', Items.STICK)
                .input('S', woodInput)
                .pattern("# #")
                .pattern("#S#")
                .pattern("# #")
                .group("wooden_ladder")
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(output)));
    }

    public static void offerCraftingTableVariantRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible woodInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output)
                .input('#', woodInput)
                .input('$', DecoTags.Items.DECO_CRAFTING_TABLES)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_crafting_tables")
                .criterion(RecipeProvider.hasItem(woodInput),
                        RecipeProvider.conditionsFromItem(woodInput))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(output)));
    }

    public static void offerBarrelVariantRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible woodInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output)
                .input('#', woodInput)
                .input('$', DecoTags.Items.DECO_BARRELS)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_barrels")
                .criterion(RecipeProvider.hasItem(woodInput),
                        RecipeProvider.conditionsFromItem(woodInput))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(output)));
    }

    public static void offerCartographyTableVariantRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible woodInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output)
                .input('#', woodInput)
                .input('$', DecoTags.Items.DECO_CARTOGRAPHY_TABLES)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_cartography_tables")
                .criterion(RecipeProvider.hasItem(woodInput),
                        RecipeProvider.conditionsFromItem(woodInput))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(output)));
    }
    public static void offerSmithingTableVariantRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible woodInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output)
                .input('#', woodInput)
                .input('$', DecoTags.Items.DECO_SMITHING_TABLES)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_smithing_tables")
                .criterion(RecipeProvider.hasItem(woodInput),
                        RecipeProvider.conditionsFromItem(woodInput))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(output)));
    }
    public static void offerNoteBlockVariantRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible woodInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,output)
                .input('#', woodInput)
                .input('$', DecoTags.Items.DECO_NOTE_BLOCKS)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_smithing_tables")
                .criterion(RecipeProvider.hasItem(woodInput),
                        RecipeProvider.conditionsFromItem(woodInput))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(output)));
    }
    public static void offerHardenedGlassRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible glassInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output, 4)
                .input('#', Items.IRON_INGOT)
                .input('X', glassInput)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .group("hardened_glass")
                .criterion("has_iron_ingot", conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter, convertBetween(output, glassInput));
    }

        public static void offerHardenedGlassPaneRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible glassPaneInput) {
            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output, 8)
                    .input('#', Items.IRON_INGOT)
                    .input('X', glassPaneInput)
                    .pattern(" # ")
                    .pattern("#X#")
                    .pattern(" # ")
                    .group("hardened_glass_panes")
                    .criterion("has_iron_ingot", conditionsFromItem(Items.IRON_INGOT))
                    .offerTo(exporter, convertBetween(output, glassPaneInput));
    }
    public static void offerReversibleCompactingFourRecipes(
            Consumer<RecipeJsonProvider> exporter,
            ItemConvertible input,
            ItemConvertible compacted,
            String compactingRecipeName,
            @Nullable String compactingRecipeGroup,
            String reverseRecipeName,
            @Nullable String reverseRecipeGroup
    ) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,input, 4)
                .input(compacted)
                .group(reverseRecipeGroup)
                .criterion(hasItem(compacted), conditionsFromItem(compacted))
                .offerTo(exporter, new Identifier(reverseRecipeName));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,compacted)
                .input('#', input)
                .pattern("##")
                .pattern("##")
                .group(compactingRecipeGroup)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, new Identifier(compactingRecipeName));
    }
    public static void offerPastelBlockRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible dyeBlockInput, ItemConvertible output) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,output, 8)
                .input('X', DecoItems.PASSTOL)
                .input('#', dyeBlockInput)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .group("pastel_blocks")
                .criterion("has_passtol", conditionsFromItem(DecoItems.PASSTOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(output)));
    }
    public static void offerShadedBlockRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible dyeBlockInput, ItemConvertible output) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,output, 8)
                .input('X', DecoItems.SHADDOL)
                .input('#', dyeBlockInput)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .group("shaded_blocks")
                .criterion("has_shaddol", conditionsFromItem(DecoItems.SHADDOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(output)));
    }
    public static void offerDyeBlockFromShadedRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible dyeBlockInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,output, 8)
                .input('X', DecoItems.PASSTOL)
                .input('#', dyeBlockInput)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .group("pastel_blocks")
                .criterion("has_passtol", conditionsFromItem(DecoItems.PASSTOL))
                .offerTo(exporter, convertBetween(output, dyeBlockInput));
    }
    public static void offerDyeBlockFromPastelRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible dyeBlockInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,output, 8)
                .input('X', DecoItems.SHADDOL)
                .input('#', dyeBlockInput)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .group("shaded_blocks")
                .criterion("has_shaddol", conditionsFromItem(DecoItems.SHADDOL))
                .offerTo(exporter, convertBetween(output, dyeBlockInput));
    }
    public static void offerLampRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible paneInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output)
                .input('#', paneInput)
                .input('$', DecoBlocks.SMOOTH_GLOWSTONE)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("coloured_lamp")
                .criterion(RecipeProvider.hasItem(DecoBlocks.SMOOTH_GLOWSTONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.SMOOTH_GLOWSTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(output)));
    }
}
