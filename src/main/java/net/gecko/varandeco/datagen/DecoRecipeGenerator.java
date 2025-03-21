package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.ShapelessRecipe;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class DecoRecipeGenerator extends FabricRecipeProvider {
    public DecoRecipeGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        offerWallRecipe(exporter, DecoBlocks.POLISHED_ANDESITE_WALL, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_ANDESITE_WALL, Items.ANDESITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_ANDESITE_WALL, Items.POLISHED_ANDESITE);

        offerWallRecipe(exporter, DecoBlocks.POLISHED_DIORITE_WALL, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_DIORITE_WALL, Items.DIORITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_DIORITE_WALL, Items.POLISHED_DIORITE);

        offerWallRecipe(exporter, DecoBlocks.POLISHED_GRANITE_WALL, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_GRANITE_WALL, Items.GRANITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_GRANITE_WALL, Items.POLISHED_GRANITE);

        offerWallRecipe(exporter, DecoBlocks.STONE_WALL, Items.STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_WALL, Items.STONE);

        createStairsRecipe(DecoBlocks.SMOOTH_STONE_STAIRS, Ingredient.ofItems(Blocks.SMOOTH_STONE))
                .criterion(hasItem(Blocks.SMOOTH_STONE),conditionsFromItem(Blocks.SMOOTH_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_STONE_STAIRS, Items.SMOOTH_STONE);

        offerWallRecipe(exporter, DecoBlocks.SMOOTH_STONE_WALL, Items.SMOOTH_STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_STONE_WALL, Items.SMOOTH_STONE);

        createStairsRecipe(DecoBlocks.CALCITE_STAIRS, Ingredient.ofItems(Blocks.CALCITE))
                .criterion(hasItem(Blocks.CALCITE),conditionsFromItem(Blocks.CALCITE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CALCITE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CALCITE_STAIRS, Items.CALCITE);

        offerSlabRecipe(exporter, DecoBlocks.CALCITE_SLAB, Items.CALCITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CALCITE_SLAB, Items.CALCITE,2);

        offerWallRecipe(exporter, DecoBlocks.CALCITE_WALL, Items.CALCITE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CALCITE_WALL, Items.CALCITE);

        createStairsRecipe(DecoBlocks.TUFF_STAIRS, Ingredient.ofItems(Blocks.TUFF))
                .criterion(hasItem(Blocks.TUFF),conditionsFromItem(Blocks.TUFF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.TUFF_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.TUFF_STAIRS, Items.TUFF);

        offerSlabRecipe(exporter, DecoBlocks.TUFF_SLAB, Items.TUFF);
        offerStonecuttingRecipe(exporter, DecoBlocks.TUFF_SLAB, Items.TUFF,2);

        offerWallRecipe(exporter, DecoBlocks.TUFF_WALL, Items.TUFF);
        offerStonecuttingRecipe(exporter, DecoBlocks.TUFF_WALL, Items.TUFF);

        createStairsRecipe(DecoBlocks.DRIPSTONE_STAIRS, Ingredient.ofItems(Blocks.DRIPSTONE_BLOCK))
                .criterion(hasItem(Blocks.DRIPSTONE_BLOCK),conditionsFromItem(Blocks.DRIPSTONE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DRIPSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.DRIPSTONE_STAIRS, Items.DRIPSTONE_BLOCK);

        offerSlabRecipe(exporter, DecoBlocks.DRIPSTONE_SLAB, Items.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.DRIPSTONE_SLAB, Items.DRIPSTONE_BLOCK,2);

        offerWallRecipe(exporter, DecoBlocks.DRIPSTONE_WALL, Items.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.DRIPSTONE_WALL, Items.DRIPSTONE_BLOCK);

        offerPolishedStoneRecipe(exporter, DecoBlocks.POLISHED_STONE, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE, Items.COBBLESTONE);

        offerPolishedStoneRecipe(exporter, Items.STONE_BRICKS, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, Items.STONE_BRICKS, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, Items.STONE_BRICK_STAIRS, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, Items.STONE_BRICK_SLAB, DecoBlocks.POLISHED_STONE,2);
        offerStonecuttingRecipe(exporter, Items.STONE_BRICK_WALL, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, Items.CHISELED_STONE_BRICKS, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, Items.STONE_BRICKS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, Items.STONE_BRICK_STAIRS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, Items.STONE_BRICK_SLAB, Items.COBBLESTONE,2);
        offerStonecuttingRecipe(exporter, Items.STONE_BRICK_WALL, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, Items.CHISELED_STONE_BRICKS, Items.COBBLESTONE);

        createStairsRecipe(DecoBlocks.POLISHED_STONE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_STONE))
                .criterion(hasItem(DecoBlocks.POLISHED_STONE),conditionsFromItem(DecoBlocks.POLISHED_STONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_STAIRS, DecoBlocks.POLISHED_STONE);

        offerSlabRecipe(exporter, DecoBlocks.POLISHED_STONE_SLAB, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_SLAB, DecoBlocks.POLISHED_STONE,2);

        offerWallRecipe(exporter, DecoBlocks.POLISHED_STONE_WALL, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_WALL, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_STAIRS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_SLAB, Items.COBBLESTONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_STONE_WALL, Items.COBBLESTONE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.STONE_TILES, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, Items.STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILES, DecoBlocks.POLISHED_STONE);

        createStairsRecipe(DecoBlocks.STONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.STONE_TILES))
                .criterion(hasItem(DecoBlocks.STONE_TILES),conditionsFromItem(DecoBlocks.STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_STAIRS, DecoBlocks.STONE_TILES);

        offerSlabRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, DecoBlocks.STONE_TILES);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, DecoBlocks.STONE_TILES,2);

        offerWallRecipe(exporter, DecoBlocks.STONE_TILE_WALL, DecoBlocks.STONE_TILES);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_WALL, DecoBlocks.STONE_TILES);

        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_STAIRS, Items.COBBLESTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, Items.COBBLESTONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_WALL, Items.COBBLESTONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_STAIRS, Items.STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, Items.STONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_WALL, Items.STONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_STAIRS, DecoBlocks.POLISHED_STONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, DecoBlocks.POLISHED_STONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_WALL, DecoBlocks.POLISHED_STONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_STAIRS, Items.STONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_SLAB, Items.STONE_BRICKS,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.STONE_TILE_WALL, Items.STONE_BRICKS);

        createStairsRecipe(DecoBlocks.PACKED_MUD_STAIRS, Ingredient.ofItems(Blocks.PACKED_MUD))
                .criterion(hasItem(Blocks.PACKED_MUD),conditionsFromItem(Blocks.PACKED_MUD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PACKED_MUD_STAIRS)));

        offerSlabRecipe(exporter, DecoBlocks.PACKED_MUD_SLAB, Items.PACKED_MUD);
        offerWallRecipe(exporter, DecoBlocks.PACKED_MUD_WALL, Items.PACKED_MUD);

        ShapedRecipeJsonBuilder.create(DecoBlocks.RED_NETHER_BRICK_FENCE)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.RED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .criterion(RecipeProvider.hasItem(Blocks.RED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Blocks.RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.RED_NETHER_BRICK_FENCE)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .criterion(RecipeProvider.hasItem(Blocks.NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Blocks.NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.NETHER_BRICK_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.RED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .criterion(RecipeProvider.hasItem(Blocks.RED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Blocks.RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE)));

        createStairsRecipe(DecoBlocks.NETHERRACK_STAIRS, Ingredient.ofItems(Blocks.NETHERRACK))
                .criterion(hasItem(Blocks.NETHERRACK),conditionsFromItem(Blocks.NETHERRACK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.NETHERRACK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.NETHERRACK_STAIRS, Items.NETHERRACK);

        offerSlabRecipe(exporter, DecoBlocks.NETHERRACK_SLAB, Items.NETHERRACK);
        offerStonecuttingRecipe(exporter, DecoBlocks.NETHERRACK_SLAB, Items.NETHERRACK,2);

        offerWallRecipe(exporter, DecoBlocks.NETHERRACK_WALL, Items.NETHERRACK);
        offerStonecuttingRecipe(exporter, DecoBlocks.NETHERRACK_WALL, Items.NETHERRACK);

        createStairsRecipe(DecoBlocks.MAGMA_STAIRS, Ingredient.ofItems(Blocks.MAGMA_BLOCK))
                .criterion(hasItem(Blocks.MAGMA_BLOCK),conditionsFromItem(Blocks.MAGMA_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGMA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_STAIRS, Items.MAGMA_BLOCK);

        offerSlabRecipe(exporter, DecoBlocks.MAGMA_SLAB, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_SLAB, Items.MAGMA_BLOCK,2);

        offerWallRecipe(exporter, DecoBlocks.MAGMA_WALL, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_WALL, Items.MAGMA_BLOCK);

        offerPolishedStoneRecipe(exporter, DecoBlocks.MAGMA_BRICKS, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICKS, Items.MAGMA_BLOCK);

        createStairsRecipe(DecoBlocks.MAGMA_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.MAGMA_BRICKS))
                .criterion(hasItem(DecoBlocks.MAGMA_BRICKS),conditionsFromItem(DecoBlocks.MAGMA_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGMA_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_STAIRS, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_STAIRS, DecoBlocks.MAGMA_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.MAGMA_BRICK_SLAB, DecoBlocks.MAGMA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_SLAB, Items.MAGMA_BLOCK,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_SLAB, DecoBlocks.MAGMA_BRICKS,2);

        offerWallRecipe(exporter, DecoBlocks.MAGMA_BRICK_WALL, DecoBlocks.MAGMA_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_WALL, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGMA_BRICK_WALL, DecoBlocks.MAGMA_BRICKS);

        offerChiseledBlockRecipe(exporter, DecoBlocks.CHISELED_MAGMA_BRICKS, DecoBlocks.MAGMA_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_MAGMA_BRICKS, Items.MAGMA_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_MAGMA_BRICKS, DecoBlocks.MAGMA_BRICKS);

        offerPolishedStoneRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.BLACKSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILES, Items.POLISHED_BLACKSTONE);

        createStairsRecipe(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_BLACKSTONE_TILES))
                .criterion(hasItem(DecoBlocks.POLISHED_BLACKSTONE_TILES),conditionsFromItem(DecoBlocks.POLISHED_BLACKSTONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, DecoBlocks.POLISHED_BLACKSTONE_TILES);

        offerSlabRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.POLISHED_BLACKSTONE_TILES);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.POLISHED_BLACKSTONE_TILES,2);

        offerWallRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.POLISHED_BLACKSTONE_TILES);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.POLISHED_BLACKSTONE_TILES);

        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Items.BLACKSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Items.BLACKSTONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Items.BLACKSTONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Items.POLISHED_BLACKSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Items.POLISHED_BLACKSTONE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Items.POLISHED_BLACKSTONE);

        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, Items.POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB, Items.POLISHED_BLACKSTONE_BRICKS,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL, Items.POLISHED_BLACKSTONE_BRICKS);

        ShapedRecipeJsonBuilder.create(DecoBlocks.POLISHED_GLIDED_BLACKSTONE,2)
                .pattern("P#")
                .pattern("#P")
                .input('P', Items.POLISHED_BLACKSTONE)
                .input('#', Items.GILDED_BLACKSTONE)
                .criterion(RecipeProvider.hasItem(Blocks.POLISHED_BLACKSTONE),
                        RecipeProvider.conditionsFromItem(Blocks.POLISHED_BLACKSTONE))
                .criterion(RecipeProvider.hasItem(Blocks.GILDED_BLACKSTONE),
                        RecipeProvider.conditionsFromItem(Blocks.GILDED_BLACKSTONE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.POLISHED_GLIDED_BLACKSTONE)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.CHISELED_GLIDED_BLACKSTONE)
                .pattern("###")
                .pattern("#C#")
                .pattern("###")
                .input('C', Items.CHISELED_POLISHED_BLACKSTONE)
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

        createStairsRecipe(DecoBlocks.PACKED_ICE_STAIRS, Ingredient.ofItems(Blocks.PACKED_ICE))
                .criterion(hasItem(Blocks.PACKED_ICE),conditionsFromItem(Blocks.PACKED_ICE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PACKED_ICE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.PACKED_ICE_STAIRS, Items.PACKED_ICE);

        offerSlabRecipe(exporter, DecoBlocks.PACKED_ICE_SLAB, Items.PACKED_ICE);
        offerStonecuttingRecipe(exporter, DecoBlocks.PACKED_ICE_SLAB, Items.PACKED_ICE,2);

        offerWallRecipe(exporter, DecoBlocks.PACKED_ICE_WALL, Items.PACKED_ICE);
        offerStonecuttingRecipe(exporter, DecoBlocks.PACKED_ICE_WALL, Items.PACKED_ICE);

        createStairsRecipe(DecoBlocks.BLUE_ICE_STAIRS, Ingredient.ofItems(Blocks.BLUE_ICE))
                .criterion(hasItem(Blocks.BLUE_ICE),conditionsFromItem(Blocks.BLUE_ICE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_ICE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_ICE_STAIRS, Items.BLUE_ICE);

        offerSlabRecipe(exporter, DecoBlocks.BLUE_ICE_SLAB, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_ICE_SLAB, Items.BLUE_ICE,2);

        offerWallRecipe(exporter, DecoBlocks.BLUE_ICE_WALL, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_ICE_WALL, Items.BLUE_ICE);

        ShapedRecipeJsonBuilder.create(DecoItems.SNOW_BRICK,8)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('I', Items.ICE)
                .input('#', Items.SNOWBALL)
                .criterion(RecipeProvider.hasItem(Blocks.ICE),
                        RecipeProvider.conditionsFromItem(Blocks.ICE))
                .criterion(RecipeProvider.hasItem(Items.SNOWBALL),
                        RecipeProvider.conditionsFromItem(Items.SNOWBALL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.SNOW_BRICK)));

        offerPolishedStoneRecipe(exporter, DecoBlocks.SNOW_BRICKS, DecoItems.SNOW_BRICK);

        ShapedRecipeJsonBuilder.create(DecoBlocks.SNOW_BRICK_STAIRS)
                .pattern("#  ")
                .pattern("## ")
                .pattern("###")
                .input('#', DecoItems.SNOW_BRICK)
                .criterion(RecipeProvider.hasItem(DecoItems.SNOW_BRICK),
                        RecipeProvider.conditionsFromItem(DecoItems.SNOW_BRICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SNOW_BRICK_STAIRS)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.SNOW_BRICK_SLAB,2)
                .pattern("###")
                .input('#', DecoItems.SNOW_BRICK)
                .criterion(RecipeProvider.hasItem(DecoItems.SNOW_BRICK),
                        RecipeProvider.conditionsFromItem(DecoItems.SNOW_BRICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SNOW_BRICK_SLAB)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.SNOW_BRICK_WALL)
                .pattern("###")
                .pattern("###")
                .input('#', DecoItems.SNOW_BRICK)
                .criterion(RecipeProvider.hasItem(DecoItems.SNOW_BRICK),
                        RecipeProvider.conditionsFromItem(DecoItems.SNOW_BRICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SNOW_BRICK_WALL)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.CHISELED_SNOW_BRICKS)
                .pattern("###")
                .pattern("#S#")
                .pattern("###")
                .input('S', Items.SNOWBALL)
                .input('#', DecoItems.SNOW_BRICK)
                .criterion(RecipeProvider.hasItem(Items.SNOWBALL),
                        RecipeProvider.conditionsFromItem(Items.SNOWBALL))
                .criterion(RecipeProvider.hasItem(DecoItems.SNOW_BRICK),
                        RecipeProvider.conditionsFromItem(DecoItems.SNOW_BRICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHISELED_SNOW_BRICKS)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.ICE_BRICKS)
                .pattern("/#")
                .pattern("#/")
                .input('/', Items.BLUE_ICE)
                .input('#', Items.PACKED_ICE)
                .criterion(RecipeProvider.hasItem(Blocks.BLUE_ICE),
                        RecipeProvider.conditionsFromItem(Blocks.BLUE_ICE))
                .criterion(RecipeProvider.hasItem(Blocks.PACKED_ICE),
                        RecipeProvider.conditionsFromItem(Blocks.PACKED_ICE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.ICE_BRICKS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.ICE_BRICKS, Items.BLUE_ICE);

        createStairsRecipe(DecoBlocks.ICE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.ICE_BRICKS))
                .criterion(hasItem(DecoBlocks.ICE_BRICKS),conditionsFromItem(DecoBlocks.ICE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ICE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.ICE_BRICK_STAIRS, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter, DecoBlocks.ICE_BRICK_STAIRS, DecoBlocks.ICE_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.ICE_BRICK_SLAB, DecoBlocks.ICE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.ICE_BRICK_SLAB, Items.BLUE_ICE,2);
        offerStonecuttingRecipe(exporter, DecoBlocks.ICE_BRICK_SLAB, DecoBlocks.ICE_BRICKS,2);

        offerWallRecipe(exporter, DecoBlocks.ICE_BRICK_WALL, DecoBlocks.ICE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.ICE_BRICK_WALL, Items.BLUE_ICE);
        offerStonecuttingRecipe(exporter, DecoBlocks.ICE_BRICK_WALL, DecoBlocks.ICE_BRICKS);

        ShapedRecipeJsonBuilder.create(DecoBlocks.BLACK_ICE)
                .pattern("/#/")
                .pattern("#/#")
                .pattern("/#/")
                .input('/', Items.BLUE_ICE)
                .input('#', Items.PACKED_ICE)
                .criterion(RecipeProvider.hasItem(Items.BLUE_ICE),
                        RecipeProvider.conditionsFromItem(Items.BLUE_ICE))
                .criterion(RecipeProvider.hasItem(Items.PACKED_ICE),
                        RecipeProvider.conditionsFromItem(Items.PACKED_ICE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BLACK_ICE)));

        createStairsRecipe(DecoBlocks.CUT_SANDSTONE_STAIRS, Ingredient.ofItems(Items.CUT_SANDSTONE))
                .criterion(hasItem(Items.CUT_SANDSTONE),conditionsFromItem(Items.CUT_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_STAIRS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_STAIRS, Items.CUT_SANDSTONE);

        createStairsRecipe(DecoBlocks.CUT_RED_SANDSTONE_STAIRS, Ingredient.ofItems(Items.CUT_RED_SANDSTONE))
                .criterion(hasItem(Items.CUT_RED_SANDSTONE),conditionsFromItem(Items.CUT_RED_SANDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_RED_SANDSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_STAIRS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_STAIRS, Items.CUT_RED_SANDSTONE);

        offerWallRecipe(exporter, DecoBlocks.CUT_SANDSTONE_WALL, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_WALL, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_WALL, Items.CUT_SANDSTONE);

        offerWallRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_WALL, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_WALL, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_WALL, Items.CUT_RED_SANDSTONE);

        offerWallRecipe(exporter, DecoBlocks.SMOOTH_SANDSTONE_WALL, Items.SMOOTH_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_SANDSTONE_WALL, Items.SMOOTH_SANDSTONE);

        offerWallRecipe(exporter, DecoBlocks.SMOOTH_RED_SANDSTONE_WALL, Items.SMOOTH_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_RED_SANDSTONE_WALL, Items.SMOOTH_RED_SANDSTONE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICKS, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICKS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICKS, Items.CUT_SANDSTONE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICKS, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICKS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICKS, Items.CUT_RED_SANDSTONE);

        createStairsRecipe(DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_SANDSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.CUT_SANDSTONE_BRICKS),conditionsFromItem(DecoBlocks.CUT_SANDSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_STAIRS, DecoBlocks.CUT_SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_SANDSTONE_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_WALL, Items.SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_WALL, Items.CUT_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_SANDSTONE_BRICKS);

        createStairsRecipe(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_RED_SANDSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.CUT_RED_SANDSTONE_BRICKS),conditionsFromItem(DecoBlocks.CUT_RED_SANDSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_STAIRS, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, Items.RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, Items.CUT_RED_SANDSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_RED_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_RED_SANDSTONE_BRICKS);

        ShapelessRecipeJsonBuilder.create(DecoBlocks.CACTUS_PLANKS,2)
                .input(Items.CACTUS)
                .criterion(RecipeProvider.hasItem(Items.CACTUS),
                        RecipeProvider.conditionsFromItem(Items.CACTUS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PLANKS)));

        createStairsRecipe(DecoBlocks.CACTUS_PLANK_STAIRS, Ingredient.ofItems(DecoBlocks.CACTUS_PLANKS))
                .criterion(hasItem(DecoBlocks.CACTUS_PLANKS),conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CACTUS_PLANK_STAIRS)));

        offerSlabRecipe(exporter, DecoBlocks.CACTUS_PLANK_SLAB, DecoBlocks.CACTUS_PLANKS);

        ShapedRecipeJsonBuilder.create(DecoBlocks.CACTUS_PLANK_FENCE)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PLANK_FENCE)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.CACTUS_PLANK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PLANK_FENCE_GATE)));

        offerPressurePlateRecipe(exporter, DecoBlocks.CACTUS_PLANK_PRESSURE_PLATE, DecoBlocks.CACTUS_PLANKS);

        ShapelessRecipeJsonBuilder.create(DecoBlocks.CACTUS_PLANK_BUTTON)
                .input(DecoBlocks.CACTUS_PLANKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_PLANK_BUTTON)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.CACTUS_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_DOOR)));
        ShapedRecipeJsonBuilder.create(DecoBlocks.CACTUS_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CACTUS_TRAPDOOR)));

        createSignRecipe(DecoItems.CACTUS_SIGN, Ingredient.ofItems(DecoBlocks.CACTUS_PLANKS))
                .criterion(hasItem(DecoBlocks.CACTUS_PLANKS),conditionsFromItem(DecoBlocks.CACTUS_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoItems.CACTUS_SIGN)));

        offerWallRecipe(exporter, DecoBlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE);
        offerStonecuttingRecipe(exporter, DecoBlocks.DARK_PRISMARINE_WALL, Items.DARK_PRISMARINE);

        offerWallRecipe(exporter, DecoBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.PRISMARINE_BRICK_WALL, Items.PRISMARINE_BRICKS);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE, Items.PRISMARINE_CRYSTALS);

        createStairsRecipe(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS, Ingredient.ofItems(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .criterion(hasItem(DecoBlocks.CRYSTALLIZED_PRISMARINE),conditionsFromItem(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_STAIRS, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        offerSlabRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        offerWallRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.CRYSTALLIZED_PRISMARINE), Blocks.SEA_LANTERN,
                0.35f, 200).criterion(hasItem(DecoBlocks.CRYSTALLIZED_PRISMARINE), conditionsFromItem(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .offerTo(exporter, new Identifier("sea_lantern_from_smelting"));

        ShapedRecipeJsonBuilder.create(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.PRISMARINE_CRYSTALS)
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_CRYSTALS),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_CRYSTALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS)));

        createStairsRecipe(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS))
                .criterion(hasItem(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS),conditionsFromItem(DecoBlocks.CRYSTALLIZED_PRISMARINE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_STAIRS, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_SLAB, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICK_WALL, DecoBlocks.CRYSTALLIZED_PRISMARINE_BRICKS);

        ShapedRecipeJsonBuilder.create(DecoBlocks.LIGHT_PRISMARINE)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('#', Items.PRISMARINE_CRYSTALS)
                .input('I', Items.WHITE_DYE)
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_CRYSTALS),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_CRYSTALS))
                .criterion(RecipeProvider.hasItem(Items.WHITE_DYE),
                        RecipeProvider.conditionsFromItem(Items.WHITE_DYE))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.LIGHT_PRISMARINE)));

        createStairsRecipe(DecoBlocks.LIGHT_PRISMARINE_STAIRS, Ingredient.ofItems(DecoBlocks.LIGHT_PRISMARINE))
                .criterion(hasItem(DecoBlocks.LIGHT_PRISMARINE),conditionsFromItem(DecoBlocks.LIGHT_PRISMARINE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_PRISMARINE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_PRISMARINE_STAIRS, DecoBlocks.LIGHT_PRISMARINE);

        offerSlabRecipe(exporter, DecoBlocks.LIGHT_PRISMARINE_SLAB, DecoBlocks.LIGHT_PRISMARINE);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_PRISMARINE_SLAB, DecoBlocks.LIGHT_PRISMARINE);

        offerWallRecipe(exporter, DecoBlocks.LIGHT_PRISMARINE_WALL, DecoBlocks.LIGHT_PRISMARINE);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_PRISMARINE_WALL, DecoBlocks.LIGHT_PRISMARINE);

        ShapedRecipeJsonBuilder.create(DecoBlocks.CHISELED_PRISMARINE_BRICKS)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('#', Items.PRISMARINE_SHARD)
                .input('I', Items.PRISMARINE_CRYSTALS)
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_SHARD),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_SHARD))
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_CRYSTALS),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_CRYSTALS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHISELED_PRISMARINE_BRICKS)));
        ShapedRecipeJsonBuilder.create(DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS)
                .pattern("###")
                .pattern("#I#")
                .pattern("###")
                .input('#', Items.PRISMARINE_CRYSTALS)
                .input('I', Items.PRISMARINE_SHARD)
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_CRYSTALS),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_CRYSTALS))
                .criterion(RecipeProvider.hasItem(Items.PRISMARINE_SHARD),
                        RecipeProvider.conditionsFromItem(Items.PRISMARINE_SHARD))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHISELED_CRYSTALLIZED_PRISMARINE_BRICKS)));

        ShapelessRecipeJsonBuilder.create(DecoItems.BUBBLE_ORB)
                .input(Items.WATER_BUCKET)
                .input(Items.SLIME_BALL)
                .criterion(RecipeProvider.hasItem(Items.SLIME_BALL),
                        RecipeProvider.conditionsFromItem(Items.SLIME_BALL))
                .criterion(RecipeProvider.hasItem(Items.WATER_BUCKET),
                        RecipeProvider.conditionsFromItem(Items.WATER_BUCKET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.BUBBLE_ORB)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.BUBBLE_BLOCK)
                .pattern("#I")
                .pattern("I#")
                .input('#', Items.COBBLESTONE)
                .input('I', DecoItems.BUBBLE_ORB)
                .criterion(RecipeProvider.hasItem(Items.COBBLESTONE),
                        RecipeProvider.conditionsFromItem(Items.COBBLESTONE))
                .criterion(RecipeProvider.hasItem(DecoItems.BUBBLE_ORB),
                        RecipeProvider.conditionsFromItem(DecoItems.BUBBLE_ORB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BUBBLE_BLOCK)));

        createStairsRecipe(DecoBlocks.BUBBLE_STAIRS, Ingredient.ofItems(DecoBlocks.BUBBLE_BLOCK))
                .criterion(hasItem(DecoBlocks.BUBBLE_BLOCK),conditionsFromItem(DecoBlocks.BUBBLE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BUBBLE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_STAIRS, DecoBlocks.BUBBLE_BLOCK);

        offerSlabRecipe(exporter, DecoBlocks.BUBBLE_SLAB, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_SLAB, DecoBlocks.BUBBLE_BLOCK);

        offerWallRecipe(exporter, DecoBlocks.BUBBLE_WALL, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_WALL, DecoBlocks.BUBBLE_BLOCK);

        offerPolishedStoneRecipe(exporter, DecoBlocks.BUBBLE_BRICKS, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_BRICKS, DecoBlocks.BUBBLE_BLOCK);

        createStairsRecipe(DecoBlocks.BUBBLE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BUBBLE_BRICKS))
                .criterion(hasItem(DecoBlocks.BUBBLE_BRICKS),conditionsFromItem(DecoBlocks.BUBBLE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BUBBLE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_BRICK_STAIRS, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_BRICK_STAIRS, DecoBlocks.BUBBLE_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.BUBBLE_BRICK_SLAB, DecoBlocks.BUBBLE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_BRICK_SLAB, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_BRICK_SLAB, DecoBlocks.BUBBLE_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.BUBBLE_BRICK_WALL, DecoBlocks.BUBBLE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_BRICK_WALL, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.BUBBLE_BRICK_WALL, DecoBlocks.BUBBLE_BRICKS);

        offerChiseledBlockRecipe(exporter, DecoBlocks.CHISELED_BUBBLE_BRICKS, DecoBlocks.BUBBLE_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_BUBBLE_BRICKS, DecoBlocks.BUBBLE_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_BUBBLE_BRICKS, DecoBlocks.BUBBLE_BRICKS);

        offerPolishedStoneRecipe(exporter, DecoBlocks.SOUL_SOILSTONE, Items.SOUL_SOIL);

        createStairsRecipe(DecoBlocks.SOUL_SOILSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE))
                .criterion(hasItem(DecoBlocks.SOUL_SOILSTONE),conditionsFromItem(DecoBlocks.SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SOUL_SOILSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.SOUL_SOILSTONE_STAIRS, DecoBlocks.SOUL_SOILSTONE);

        offerSlabRecipe(exporter, DecoBlocks.SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE);

        offerWallRecipe(exporter, DecoBlocks.SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);

        createStairsRecipe(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_SOUL_SOILSTONE))
                .criterion(hasItem(DecoBlocks.CUT_SOUL_SOILSTONE),conditionsFromItem(DecoBlocks.CUT_SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_STAIRS, DecoBlocks.CUT_SOUL_SOILSTONE);

        offerSlabRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE);

        offerWallRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_WALL, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_WALL, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_WALL, DecoBlocks.CUT_SOUL_SOILSTONE);

        offerChiseledBlockRecipe(exporter, DecoBlocks.CHISELED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_SOUL_SOILSTONE, DecoBlocks.SOUL_SOILSTONE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE), DecoBlocks.SMOOTH_SOUL_SOILSTONE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.SOUL_SOILSTONE), conditionsFromItem(DecoBlocks.SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier("smooth_soul_soilstone_from_smelting"));

        createStairsRecipe(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_SOUL_SOILSTONE))
                .criterion(hasItem(DecoBlocks.SMOOTH_SOUL_SOILSTONE),conditionsFromItem(DecoBlocks.SMOOTH_SOUL_SOILSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS, DecoBlocks.SMOOTH_SOUL_SOILSTONE);

        offerSlabRecipe(exporter, DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB, DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB, DecoBlocks.SMOOTH_SOUL_SOILSTONE);

        offerWallRecipe(exporter, DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL, DecoBlocks.SMOOTH_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL, DecoBlocks.SMOOTH_SOUL_SOILSTONE);

        offerPolishedStoneRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS, DecoBlocks.CUT_SOUL_SOILSTONE);

        createStairsRecipe(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS),conditionsFromItem(DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_STAIRS, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_SLAB, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.CUT_SOUL_SOILSTONE);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_SOUL_SOILSTONE_BRICK_WALL, DecoBlocks.CUT_SOUL_SOILSTONE_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.QUARTZ_WALL, Blocks.QUARTZ_BLOCK);
        offerWallRecipe(exporter, DecoBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);
        offerStonecuttingRecipe(exporter, DecoBlocks.SMOOTH_QUARTZ_WALL, Blocks.SMOOTH_QUARTZ);

        createStairsRecipe(DecoBlocks.QUARTZ_BRICK_STAIRS, Ingredient.ofItems(Blocks.QUARTZ_BRICKS))
                .criterion(hasItem(Blocks.QUARTZ_BRICKS),conditionsFromItem(Blocks.QUARTZ_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.QUARTZ_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);

        ShapedRecipeJsonBuilder.create(DecoBlocks.CUT_QUARTZ)
                .pattern("#Q")
                .pattern("Q#")
                .input('#', Items.QUARTZ_BLOCK)
                .input('Q', Items.QUARTZ)
                .criterion(RecipeProvider.hasItem(Items.QUARTZ_BLOCK),
                        RecipeProvider.conditionsFromItem(Items.QUARTZ_BLOCK))
                .criterion(RecipeProvider.hasItem(Items.QUARTZ),
                        RecipeProvider.conditionsFromItem(Items.QUARTZ))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CUT_QUARTZ)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_QUARTZ, Blocks.QUARTZ_BLOCK);

        createStairsRecipe(DecoBlocks.CUT_QUARTZ_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_QUARTZ))
                .criterion(hasItem(DecoBlocks.CUT_QUARTZ),conditionsFromItem(DecoBlocks.CUT_QUARTZ))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CUT_QUARTZ_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_QUARTZ_STAIRS, Blocks.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_QUARTZ_STAIRS, DecoBlocks.CUT_QUARTZ);

        offerSlabRecipe(exporter, DecoBlocks.CUT_QUARTZ_SLAB, DecoBlocks.CUT_QUARTZ);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_QUARTZ_SLAB, Blocks.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_QUARTZ_SLAB, DecoBlocks.CUT_QUARTZ);

        offerWallRecipe(exporter, DecoBlocks.CUT_QUARTZ_WALL, DecoBlocks.CUT_QUARTZ);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_QUARTZ_WALL, Blocks.QUARTZ_BLOCK);
        offerStonecuttingRecipe(exporter, DecoBlocks.CUT_QUARTZ_WALL, DecoBlocks.CUT_QUARTZ);

        ShapedRecipeJsonBuilder.create(Items.WARPED_WART_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', DecoItems.WARPED_WART)
                .criterion(RecipeProvider.hasItem(DecoItems.WARPED_WART),
                        RecipeProvider.conditionsFromItem(DecoItems.WARPED_WART))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.WARPED_WART_BLOCK)));

        offerChiseledBlockRecipe(exporter, DecoBlocks.CHISELED_RED_NETHER_BRICKS, Items.RED_NETHER_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_RED_NETHER_BRICKS, Items.RED_NETHER_BRICKS);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_NETHER_BRICKS), DecoBlocks.CRACKED_RED_NETHER_BRICKS,
                        0.1f, 200).criterion(hasItem(Items.RED_NETHER_BRICKS), conditionsFromItem(Items.RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier("cracked_red_nether_bricks_from_smelting"));

        ShapedRecipeJsonBuilder.create(DecoBlocks.BLUE_NETHER_BRICKS)
                .pattern("#N")
                .pattern("N#")
                .input('#', DecoItems.WARPED_WART)
                .input('N', Items.NETHER_BRICK)
                .criterion(RecipeProvider.hasItem(DecoItems.WARPED_WART),
                        RecipeProvider.conditionsFromItem(DecoItems.WARPED_WART))
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BLUE_NETHER_BRICKS)));

        createStairsRecipe(DecoBlocks.BLUE_NETHER_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICKS))
                .criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICKS),conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_NETHER_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_NETHER_BRICK_STAIRS, DecoBlocks.BLUE_NETHER_BRICKS);

        offerSlabRecipe(exporter, DecoBlocks.BLUE_NETHER_BRICK_SLAB, DecoBlocks.BLUE_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_NETHER_BRICK_SLAB, DecoBlocks.BLUE_NETHER_BRICKS);

        offerWallRecipe(exporter, DecoBlocks.BLUE_NETHER_BRICK_WALL, DecoBlocks.BLUE_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_NETHER_BRICK_WALL, DecoBlocks.BLUE_NETHER_BRICKS);

        ShapedRecipeJsonBuilder.create(DecoBlocks.BLUE_NETHER_BRICK_FENCE)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.BLUE_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BLUE_NETHER_BRICK_FENCE)));

        ShapedRecipeJsonBuilder.create(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.BLUE_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.NETHER_BRICK),
                        RecipeProvider.conditionsFromItem(Items.NETHER_BRICK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE)));

        offerChiseledBlockRecipe(exporter, DecoBlocks.CHISELED_BLUE_NETHER_BRICKS, DecoBlocks.BLUE_NETHER_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, DecoBlocks.CHISELED_BLUE_NETHER_BRICKS, DecoBlocks.BLUE_NETHER_BRICKS);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICKS), DecoBlocks.CRACKED_BLUE_NETHER_BRICKS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICKS), conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier("cracked_blue_nether_bricks_from_smelting"));

        ShapedRecipeJsonBuilder.create(Items.ENDER_PEARL)
                .pattern(" # ")
                .pattern("#F#")
                .pattern(" # ")
                .input('#', DecoItems.WARPED_WART)
                .input('F', Items.CHORUS_FRUIT)
                .criterion(RecipeProvider.hasItem(DecoItems.WARPED_WART),
                        RecipeProvider.conditionsFromItem(DecoItems.WARPED_WART))
                .criterion(RecipeProvider.hasItem(Items.CHORUS_FRUIT),
                        RecipeProvider.conditionsFromItem(Items.CHORUS_FRUIT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.ENDER_PEARL)));

        ShapedRecipeJsonBuilder.create(Items.ENDER_EYE)
                .pattern(" # ")
                .pattern("#F#")
                .pattern(" #B")
                .input('#', DecoItems.WARPED_WART)
                .input('F', Items.CHORUS_FRUIT)
                .input('B', Items.BLAZE_POWDER)
                .criterion(RecipeProvider.hasItem(DecoItems.WARPED_WART),
                        RecipeProvider.conditionsFromItem(DecoItems.WARPED_WART))
                .criterion(RecipeProvider.hasItem(Items.CHORUS_FRUIT),
                        RecipeProvider.conditionsFromItem(Items.CHORUS_FRUIT))
                .criterion(RecipeProvider.hasItem(Items.BLAZE_POWDER),
                        RecipeProvider.conditionsFromItem(Items.BLAZE_POWDER))
                .offerTo(exporter, new Identifier("ender_eye_from_warped_wart"));

        createStairsRecipe(DecoBlocks.TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.TERRACOTTA))
                .criterion(hasItem(Blocks.TERRACOTTA),conditionsFromItem(Blocks.TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.TERRACOTTA_STAIRS, Blocks.TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA);

        createStairsRecipe(DecoBlocks.WHITE_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.WHITE_TERRACOTTA))
                .criterion(hasItem(Blocks.WHITE_TERRACOTTA),conditionsFromItem(Blocks.WHITE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WHITE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.BLACK_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.BLACK_TERRACOTTA))
                .criterion(hasItem(Blocks.BLACK_TERRACOTTA),conditionsFromItem(Blocks.BLACK_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACK_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA);

        createStairsRecipe(DecoBlocks.GRAY_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.GRAY_TERRACOTTA))
                .criterion(hasItem(Blocks.GRAY_TERRACOTTA),conditionsFromItem(Blocks.GRAY_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GRAY_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA);

        createStairsRecipe(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.LIGHT_GRAY_TERRACOTTA))
                .criterion(hasItem(Blocks.LIGHT_GRAY_TERRACOTTA),conditionsFromItem(Blocks.LIGHT_GRAY_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA);

        createStairsRecipe(DecoBlocks.BROWN_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.BROWN_TERRACOTTA))
                .criterion(hasItem(Blocks.BROWN_TERRACOTTA),conditionsFromItem(Blocks.BROWN_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BROWN_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_WALL, Blocks.BROWN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BROWN_TERRACOTTA_WALL, Blocks.BROWN_TERRACOTTA);

        createStairsRecipe(DecoBlocks.RED_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.RED_TERRACOTTA))
                .criterion(hasItem(Blocks.RED_TERRACOTTA),conditionsFromItem(Blocks.RED_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RED_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA);

        createStairsRecipe(DecoBlocks.ORANGE_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.ORANGE_TERRACOTTA))
                .criterion(hasItem(Blocks.ORANGE_TERRACOTTA),conditionsFromItem(Blocks.ORANGE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ORANGE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.YELLOW_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.YELLOW_TERRACOTTA))
                .criterion(hasItem(Blocks.YELLOW_TERRACOTTA),conditionsFromItem(Blocks.YELLOW_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.YELLOW_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA);

        createStairsRecipe(DecoBlocks.LIME_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.LIME_TERRACOTTA))
                .criterion(hasItem(Blocks.LIME_TERRACOTTA),conditionsFromItem(Blocks.LIME_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIME_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA);

        createStairsRecipe(DecoBlocks.GREEN_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.GREEN_TERRACOTTA))
                .criterion(hasItem(Blocks.GREEN_TERRACOTTA),conditionsFromItem(Blocks.GREEN_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GREEN_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA);

        createStairsRecipe(DecoBlocks.CYAN_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.CYAN_TERRACOTTA))
                .criterion(hasItem(Blocks.CYAN_TERRACOTTA),conditionsFromItem(Blocks.CYAN_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CYAN_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA);

        createStairsRecipe(DecoBlocks.BLUE_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.BLUE_TERRACOTTA))
                .criterion(hasItem(Blocks.BLUE_TERRACOTTA),conditionsFromItem(Blocks.BLUE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_WALL, Blocks.BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.BLUE_TERRACOTTA_WALL, Blocks.BLUE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.LIGHT_BLUE_TERRACOTTA))
                .criterion(hasItem(Blocks.LIGHT_BLUE_TERRACOTTA),conditionsFromItem(Blocks.LIGHT_BLUE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.PURPLE_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.PURPLE_TERRACOTTA))
                .criterion(hasItem(Blocks.PURPLE_TERRACOTTA),conditionsFromItem(Blocks.PURPLE_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PURPLE_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA);

        createStairsRecipe(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.MAGENTA_TERRACOTTA))
                .criterion(hasItem(Blocks.MAGENTA_TERRACOTTA),conditionsFromItem(Blocks.MAGENTA_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGENTA_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA);

        createStairsRecipe(DecoBlocks.PINK_TERRACOTTA_STAIRS, Ingredient.ofItems(Blocks.PINK_TERRACOTTA))
                .criterion(hasItem(Blocks.PINK_TERRACOTTA),conditionsFromItem(Blocks.PINK_TERRACOTTA))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PINK_TERRACOTTA_STAIRS)));
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA);

        offerSlabRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA);

        offerWallRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA);
        offerStonecuttingRecipe(exporter, DecoBlocks.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA);

    }
}
