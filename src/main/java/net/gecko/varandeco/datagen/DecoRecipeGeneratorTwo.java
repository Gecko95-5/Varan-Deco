package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.gecko.varandeco.util.DecoTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;

import java.util.function.Consumer;

public class DecoRecipeGeneratorTwo extends FabricRecipeProvider {
    public DecoRecipeGeneratorTwo(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
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

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(Items.RAW_IRON_BLOCK), RecipeCategory.MISC, Items.IRON_BLOCK,
                        6.3f, 900).criterion(hasItem(Items.RAW_IRON_BLOCK), conditionsFromItem(Items.RAW_IRON_BLOCK))
                .offerTo(exporter, new Identifier("iron_block_from_blasting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_IRON_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_IRON_STAIRS), conditionsFromItem(DecoBlocks.RAW_IRON_STAIRS))
                .offerTo(exporter, new Identifier("iron_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_IRON_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_IRON_SLAB), conditionsFromItem(DecoBlocks.RAW_IRON_SLAB))
                .offerTo(exporter, new Identifier("iron_slab_from_smelting"));

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

        createStairsRecipe(DecoBlocks.CHERRY_WOOD_STAIRS, Ingredient.ofItems(Items.CHERRY_WOOD))
                .criterion(hasItem(Items.CHERRY_WOOD),conditionsFromItem(Items.CHERRY_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CHERRY_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHERRY_WOOD_SLAB, Items.CHERRY_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.CHERRY_WOOD_WALL, Items.CHERRY_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_CHERRY_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Items.STRIPPED_CHERRY_WOOD),conditionsFromItem(Items.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STRIPPED_CHERRY_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_CHERRY_WOOD_SLAB, Items.STRIPPED_CHERRY_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_CHERRY_WOOD_WALL, Items.STRIPPED_CHERRY_WOOD);

        offerNoteBlockVariantRecipe(exporter, DecoBlocks.CHERRY_NOTE_BLOCK, Items.CHERRY_PLANKS);
        offerNoteBlockVariantRecipe(exporter, DecoBlocks.BAMBOO_NOTE_BLOCK, Items.BAMBOO_PLANKS);

        offerBookshelvesVariantRecipe(exporter, DecoBlocks.MUSHROOM_BOOKSHELF, DecoBlocks.MUSHROOM_BOOKSHELF);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.CHERRY_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.CHERRY_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.CHERRY_SLAB),
                        RecipeProvider.conditionsFromItem(Items.CHERRY_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHERRY_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.CHERRY_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.CHERRY_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.CHERRY_SLAB),
                        RecipeProvider.conditionsFromItem(Items.CHERRY_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CHERRY_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.BAMBOO_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.BAMBOO_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.BAMBOO_SLAB),
                        RecipeProvider.conditionsFromItem(Items.BAMBOO_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BAMBOO_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.BAMBOO_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.BAMBOO_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.BAMBOO_SLAB),
                        RecipeProvider.conditionsFromItem(Items.BAMBOO_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.BAMBOO_PALLET_TRAPDOOR)));

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MUSHROOM_MOSAIC, DecoBlocks.MUSHROOM_SLAB);

        createStairsRecipe(DecoBlocks.MUSHROOM_MOSAIC_STAIRS, Ingredient.ofItems(DecoBlocks.MUSHROOM_MOSAIC))
                .criterion(hasItem(DecoBlocks.MUSHROOM_MOSAIC),conditionsFromItem(DecoBlocks.MUSHROOM_MOSAIC))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MUSHROOM_MOSAIC_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MUSHROOM_MOSAIC_SLAB, DecoBlocks.MUSHROOM_MOSAIC);

        createSignRecipe(DecoItems.STRIPPED_CACTUS_SIGN, Ingredient.ofItems(DecoBlocks.STRIPPED_CACTUS))
                .criterion(hasItem(DecoBlocks.STRIPPED_CACTUS),conditionsFromItem(DecoBlocks.STRIPPED_CACTUS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoItems.STRIPPED_CACTUS_SIGN)));
        createSignRecipe(DecoItems.MUSHROOM_STEM_SIGN, Ingredient.ofItems(Blocks.MUSHROOM_STEM))
                .criterion(hasItem(Blocks.MUSHROOM_STEM),conditionsFromItem(Blocks.MUSHROOM_STEM))
                .offerTo(exporter, new Identifier(getRecipeName(DecoItems.MUSHROOM_STEM_SIGN)));
        createSignRecipe(DecoItems.MUSHROOM_MOSAIC_SIGN, Ingredient.ofItems(DecoBlocks.MUSHROOM_MOSAIC))
                .criterion(hasItem(DecoBlocks.MUSHROOM_MOSAIC),conditionsFromItem(DecoBlocks.MUSHROOM_MOSAIC))
                .offerTo(exporter, new Identifier(getRecipeName(DecoItems.MUSHROOM_MOSAIC_SIGN)));

        offerHangingSignRecipe(exporter, DecoItems.CACTUS_HANGING_SIGN, DecoBlocks.STRIPPED_CACTUS);
        offerHangingSignRecipe(exporter, DecoItems.MUSHROOM_HANGING_SIGN, Blocks.MUSHROOM_STEM);

        offerHangingSignRecipe(exporter, DecoItems.MUSHROOM_PLANKS_HANGING_SIGN, DecoBlocks.MUSHROOM_PLANKS);

        offerHangingSignRecipe(exporter, DecoItems.MUSHROOM_MOSAIC_HANGING_SIGN, DecoBlocks.MUSHROOM_MOSAIC);

        offerBoatRecipe(exporter, DecoItems.MUSHROOM_BOAT, DecoBlocks.MUSHROOM_PLANKS);
        offerChestBoatRecipe(exporter, DecoItems.MUSHROOM_CHEST_BOAT, DecoItems.MUSHROOM_BOAT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.OAK_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.OAK_PLANKS)
                .input('-', Items.OAK_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.OAK_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.OAK_CHEST_RAFT, DecoItems.OAK_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.BIRCH_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.BIRCH_PLANKS)
                .input('-', Items.BIRCH_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.BIRCH_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.BIRCH_CHEST_RAFT, DecoItems.BIRCH_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.SPRUCE_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.SPRUCE_PLANKS)
                .input('-', Items.SPRUCE_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.SPRUCE_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.SPRUCE_CHEST_RAFT, DecoItems.SPRUCE_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.JUNGLE_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.JUNGLE_PLANKS)
                .input('-', Items.JUNGLE_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.JUNGLE_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.JUNGLE_CHEST_RAFT, DecoItems.JUNGLE_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.ACACIA_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.ACACIA_PLANKS)
                .input('-', Items.ACACIA_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.ACACIA_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.ACACIA_CHEST_RAFT, DecoItems.ACACIA_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.DARK_OAK_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.DARK_OAK_PLANKS)
                .input('-', Items.DARK_OAK_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.DARK_OAK_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.DARK_OAK_CHEST_RAFT, DecoItems.DARK_OAK_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.MANGROVE_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.MANGROVE_PLANKS)
                .input('-', Items.MANGROVE_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.MANGROVE_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.MANGROVE_CHEST_RAFT, DecoItems.MANGROVE_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.CHERRY_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.CHERRY_PLANKS)
                .input('-', Items.CHERRY_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.CHERRY_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.CHERRY_CHEST_RAFT, DecoItems.CHERRY_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.CRIMSON_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.CRIMSON_PLANKS)
                .input('-', Items.CRIMSON_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.CRIMSON_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.CRIMSON_CHEST_RAFT, DecoItems.CRIMSON_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.WARPED_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.WARPED_PLANKS)
                .input('-', Items.WARPED_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.WARPED_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.WARPED_CHEST_RAFT, DecoItems.WARPED_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.CACTUS_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .input('-', DecoBlocks.CACTUS_PLANK_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.CACTUS_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.CACTUS_CHEST_RAFT, DecoItems.CACTUS_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.MUSHROOM_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .input('-', DecoBlocks.MUSHROOM_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.MUSHROOM_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.MUSHROOM_CHEST_RAFT, DecoItems.MUSHROOM_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.WOODEN_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .input('-', DecoBlocks.WOODEN_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.WOODEN_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.WOODEN_CHEST_RAFT, DecoItems.WOODEN_RAFT);

        offerBoatRecipe(exporter, DecoItems.BAMBOO_BOAT, Blocks.BAMBOO_PLANKS);
        offerChestBoatRecipe(exporter, DecoItems.BAMBOO_CHEST_BOAT, DecoItems.BAMBOO_BOAT);

        createStairsRecipe(DecoBlocks.OAK_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.OAK_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.OAK_BOOKSHELF),conditionsFromItem(DecoBlocks.OAK_BOOKSHELF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.OAK_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OAK_BOOKSHELF_SLAB, DecoBlocks.OAK_BOOKSHELF);

        createStairsRecipe(DecoBlocks.SPRUCE_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.SPRUCE_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.SPRUCE_BOOKSHELF),conditionsFromItem(DecoBlocks.SPRUCE_BOOKSHELF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.SPRUCE_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SPRUCE_BOOKSHELF_SLAB, DecoBlocks.SPRUCE_BOOKSHELF);

        createStairsRecipe(DecoBlocks.BIRCH_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.BIRCH_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.BIRCH_BOOKSHELF),conditionsFromItem(DecoBlocks.BIRCH_BOOKSHELF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BIRCH_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BIRCH_BOOKSHELF_SLAB, DecoBlocks.BIRCH_BOOKSHELF);

        createStairsRecipe(DecoBlocks.JUNGLE_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.JUNGLE_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.JUNGLE_BOOKSHELF),conditionsFromItem(DecoBlocks.JUNGLE_BOOKSHELF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.JUNGLE_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.JUNGLE_BOOKSHELF_SLAB, DecoBlocks.JUNGLE_BOOKSHELF);

        createStairsRecipe(DecoBlocks.ACACIA_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.ACACIA_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.ACACIA_BOOKSHELF),conditionsFromItem(DecoBlocks.ACACIA_BOOKSHELF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ACACIA_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ACACIA_BOOKSHELF_SLAB, DecoBlocks.ACACIA_BOOKSHELF);

        createStairsRecipe(DecoBlocks.DARK_OAK_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.DARK_OAK_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.DARK_OAK_BOOKSHELF),conditionsFromItem(DecoBlocks.DARK_OAK_BOOKSHELF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DARK_OAK_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DARK_OAK_BOOKSHELF_SLAB, DecoBlocks.DARK_OAK_BOOKSHELF);

        createStairsRecipe(DecoBlocks.MANGROVE_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.MANGROVE_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.MANGROVE_BOOKSHELF),conditionsFromItem(DecoBlocks.MANGROVE_BOOKSHELF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MANGROVE_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MANGROVE_BOOKSHELF_SLAB, DecoBlocks.MANGROVE_BOOKSHELF);

        createStairsRecipe(DecoBlocks.CHERRY_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.CHERRY_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.CHERRY_BOOKSHELF),conditionsFromItem(DecoBlocks.CHERRY_BOOKSHELF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CHERRY_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHERRY_BOOKSHELF_SLAB, DecoBlocks.CHERRY_BOOKSHELF);

        createStairsRecipe(DecoBlocks.BAMBOO_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.BAMBOO_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.BAMBOO_BOOKSHELF),conditionsFromItem(DecoBlocks.BAMBOO_BOOKSHELF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BAMBOO_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BAMBOO_BOOKSHELF_SLAB, DecoBlocks.BAMBOO_BOOKSHELF);

        createStairsRecipe(DecoBlocks.CRIMSON_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.CRIMSON_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.CRIMSON_BOOKSHELF),conditionsFromItem(DecoBlocks.CRIMSON_BOOKSHELF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRIMSON_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRIMSON_BOOKSHELF_SLAB, DecoBlocks.CRIMSON_BOOKSHELF);

        createStairsRecipe(DecoBlocks.WARPED_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.WARPED_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.WARPED_BOOKSHELF),conditionsFromItem(DecoBlocks.WARPED_BOOKSHELF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WARPED_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WARPED_BOOKSHELF_SLAB, DecoBlocks.WARPED_BOOKSHELF);

        createStairsRecipe(DecoBlocks.CACTUS_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.CACTUS_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.CACTUS_BOOKSHELF),conditionsFromItem(DecoBlocks.CACTUS_BOOKSHELF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CACTUS_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_BOOKSHELF_SLAB, DecoBlocks.CACTUS_BOOKSHELF);

        createStairsRecipe(DecoBlocks.MUSHROOM_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.MUSHROOM_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.MUSHROOM_BOOKSHELF),conditionsFromItem(DecoBlocks.MUSHROOM_BOOKSHELF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MUSHROOM_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_BOOKSHELF_SLAB, DecoBlocks.MUSHROOM_BOOKSHELF);

        createStairsRecipe(DecoBlocks.WOODEN_BOOKSHELF_STAIRS, Ingredient.ofItems(Items.BOOKSHELF))
                .criterion(hasItem(Items.BOOKSHELF),conditionsFromItem(Items.BOOKSHELF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WOODEN_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WOODEN_BOOKSHELF_SLAB, Items.BOOKSHELF);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_MUSHROOM_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.IRON_CAP_MUSHROOM)
                .group("giant_mushroom_blocks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_MUSHROOM),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_MUSHROOM))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK)));

        createStairsRecipe(DecoBlocks.IRON_CAP_STAIRS, Ingredient.ofItems(DecoBlocks.IRON_CAP_PLANKS))
                .group("wooden_stairs")
                .criterion(hasItem(DecoBlocks.IRON_CAP_PLANKS),conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.IRON_CAP_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_SLAB,6)
                .pattern("###")
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_slab")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.IRON_CAP_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.IRON_CAP_FENCE,3)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_fence")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.IRON_CAP_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_fence_gate")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.IRON_CAP_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_PRESSURE_PLATE)
                .pattern("##")
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_pressure_plate")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.IRON_CAP_PRESSURE_PLATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_BUTTON)
                .input(DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_button")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.IRON_CAP_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_door")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.IRON_CAP_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_trapdoor")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.IRON_CAP_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_HYPHAE,4)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.IRON_CAP_STEM)
                .group("bark")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_STEM),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_STEM))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.IRON_CAP_HYPHAE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STRIPPED_IRON_CAP_HYPHAE,4)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.STRIPPED_IRON_CAP_STEM)
                .group("bark")
                .criterion(RecipeProvider.hasItem(DecoBlocks.STRIPPED_IRON_CAP_STEM),
                        RecipeProvider.conditionsFromItem(DecoBlocks.STRIPPED_IRON_CAP_STEM))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_PLANKS,4)
                .input(DecoTags.Items.IRON_CAP_STEM)
                .criterion("has_logs", conditionsFromTag(DecoTags.Items.IRON_CAP_STEM))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.IRON_CAP_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_PLANKS,8)
                .input(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK)
                .group("planks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK))
                .offerTo(exporter, new Identifier("iron_cap_planks_form_mushroom_block"));

        createStairsRecipe(DecoBlocks.IRON_CAP_HYPHAE_STAIRS, Ingredient.ofItems(DecoBlocks.IRON_CAP_HYPHAE))
                .criterion(hasItem(DecoBlocks.IRON_CAP_HYPHAE),conditionsFromItem(DecoBlocks.IRON_CAP_HYPHAE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.IRON_CAP_HYPHAE_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_CAP_HYPHAE_SLAB, DecoBlocks.IRON_CAP_HYPHAE);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.IRON_CAP_HYPHAE_WALL, DecoBlocks.IRON_CAP_HYPHAE);

        createStairsRecipe(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_STAIRS, Ingredient.ofItems(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE))
                .criterion(hasItem(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE),conditionsFromItem(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_SLAB, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_WALL, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_CAP_MOSAIC, DecoBlocks.IRON_CAP_SLAB);

        createStairsRecipe(DecoBlocks.IRON_CAP_MOSAIC_STAIRS, Ingredient.ofItems(DecoBlocks.IRON_CAP_MOSAIC))
                .criterion(hasItem(DecoBlocks.IRON_CAP_MOSAIC),conditionsFromItem(DecoBlocks.IRON_CAP_MOSAIC))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.IRON_CAP_MOSAIC_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_CAP_MOSAIC_SLAB, DecoBlocks.IRON_CAP_MOSAIC);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SPORE_IRON_ORE), RecipeCategory.MISC, Items.IRON_INGOT,
                        0.7f, 200).criterion(hasItem(DecoBlocks.SPORE_IRON_ORE), conditionsFromItem(DecoBlocks.SPORE_IRON_ORE))
                .offerTo(exporter, new Identifier("iron_ingot_from_smelting_spore_ore"));

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.SPORE_IRON_ORE), RecipeCategory.MISC, Items.IRON_INGOT,
                        0.7f, 100).criterion(hasItem(DecoBlocks.SPORE_IRON_ORE), conditionsFromItem(DecoBlocks.SPORE_IRON_ORE))
                .offerTo(exporter, new Identifier("iron_ingot_from_blasting_spore_ore"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.IRON_CAP_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.IRON_CAP_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.IRON_CAP_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_SLAB))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.IRON_CAP_PALLET_TRAPDOOR)));

        offerCraftingTableVariantRecipe(exporter, DecoBlocks.IRON_CAP_CRAFTING_TABLE, DecoBlocks.IRON_CAP_PLANKS);
        offerBarrelVariantRecipe(exporter, DecoBlocks.IRON_CAP_BARREL, DecoBlocks.IRON_CAP_PLANKS);
        offerCartographyTableVariantRecipe(exporter, DecoBlocks.IRON_CAP_CARTOGRAPHY_TABLE, DecoBlocks.IRON_CAP_PLANKS);
        offerSmithingTableVariantRecipe(exporter, DecoBlocks.IRON_CAP_SMITHING_TABLE, DecoBlocks.IRON_CAP_PLANKS);
        offerLadderVariantRecipe(exporter, DecoBlocks.IRON_CAP_LADDER, DecoBlocks.IRON_CAP_SLAB);

        offerNoteBlockVariantRecipe(exporter, DecoBlocks.IRON_CAP_NOTE_BLOCK, DecoBlocks.IRON_CAP_PLANKS);

        offerBookshelvesVariantRecipe(exporter, DecoBlocks.IRON_CAP_BOOKSHELF, DecoBlocks.IRON_CAP_PLANKS);

        createStairsRecipe(DecoBlocks.IRON_CAP_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.IRON_CAP_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.IRON_CAP_BOOKSHELF),conditionsFromItem(DecoBlocks.IRON_CAP_BOOKSHELF))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.IRON_CAP_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_BOOKSHELF_SLAB, DecoBlocks.IRON_CAP_BOOKSHELF);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.IRON_CAP_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .input('-', DecoBlocks.IRON_CAP_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoItems.IRON_CAP_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.IRON_CAP_CHEST_RAFT, DecoItems.IRON_CAP_RAFT);

        offerBoatRecipe(exporter, DecoItems.IRON_CAP_BOAT, DecoBlocks.IRON_CAP_PLANKS);
        offerChestBoatRecipe(exporter, DecoItems.IRON_CAP_CHEST_BOAT, DecoItems.IRON_CAP_BOAT);

        createSignRecipe(DecoItems.IRON_CAP_SIGN, Ingredient.ofItems(DecoBlocks.IRON_CAP_PLANKS))
                .criterion(hasItem(DecoBlocks.IRON_CAP_PLANKS),conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoItems.IRON_CAP_SIGN)));
        createSignRecipe(DecoItems.STRIPPED_IRON_CAP_SIGN, Ingredient.ofItems(DecoBlocks.STRIPPED_IRON_CAP_STEM))
                .criterion(hasItem(DecoBlocks.STRIPPED_IRON_CAP_STEM),conditionsFromItem(DecoBlocks.STRIPPED_IRON_CAP_STEM))
                .offerTo(exporter, new Identifier(getRecipeName(DecoItems.STRIPPED_IRON_CAP_SIGN)));
        createSignRecipe(DecoItems.IRON_CAP_MOSAIC_SIGN, Ingredient.ofItems(DecoBlocks.IRON_CAP_MOSAIC))
                .criterion(hasItem(DecoBlocks.IRON_CAP_MOSAIC),conditionsFromItem(DecoBlocks.IRON_CAP_MOSAIC))
                .offerTo(exporter, new Identifier(getRecipeName(DecoItems.IRON_CAP_MOSAIC_SIGN)));

        offerHangingSignRecipe(exporter, DecoItems.IRON_CAP_HANGING_SIGN, DecoBlocks.STRIPPED_IRON_CAP_STEM);

        offerHangingSignRecipe(exporter, DecoItems.IRON_CAP_PLANKS_HANGING_SIGN, DecoBlocks.IRON_CAP_PLANKS);

        offerHangingSignRecipe(exporter, DecoItems.IRON_CAP_MOSAIC_HANGING_SIGN, DecoBlocks.IRON_CAP_MOSAIC);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_GRASS)
                .pattern("##")
                .pattern("##")
                .input('#', Items.GRASS_BLOCK)
                .group("packed_soil")
                .criterion(RecipeProvider.hasItem(Items.GRASS_BLOCK),
                        RecipeProvider.conditionsFromItem(Items.GRASS_BLOCK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.PACKED_GRASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_PODZOL)
                .pattern("##")
                .pattern("##")
                .input('#', Items.PODZOL)
                .group("packed_soil")
                .criterion(RecipeProvider.hasItem(Items.PODZOL),
                        RecipeProvider.conditionsFromItem(Items.PODZOL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.PACKED_PODZOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_MYCELIUM)
                .pattern("##")
                .pattern("##")
                .input('#', Items.MYCELIUM)
                .group("packed_soil")
                .criterion(RecipeProvider.hasItem(Items.MYCELIUM),
                        RecipeProvider.conditionsFromItem(Items.MYCELIUM))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.PACKED_MYCELIUM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_CRIMSON_NYLIUM)
                .pattern("##")
                .pattern("##")
                .input('#', Items.CRIMSON_NYLIUM)
                .group("packed_nylium")
                .criterion(RecipeProvider.hasItem(Items.CRIMSON_NYLIUM),
                        RecipeProvider.conditionsFromItem(Items.CRIMSON_NYLIUM))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.PACKED_CRIMSON_NYLIUM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_WARPED_NYLIUM)
                .pattern("##")
                .pattern("##")
                .input('#', Items.WARPED_NYLIUM)
                .group("packed_nylium")
                .criterion(RecipeProvider.hasItem(Items.WARPED_NYLIUM),
                        RecipeProvider.conditionsFromItem(Items.WARPED_NYLIUM))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.PACKED_WARPED_NYLIUM)));

        offerCarpetRecipe(exporter, DecoBlocks.GRASS_CARPET, DecoBlocks.PACKED_GRASS);
        offerCarpetRecipe(exporter, DecoBlocks.PODZOL_CARPET, DecoBlocks.PACKED_PODZOL);
        offerCarpetRecipe(exporter, DecoBlocks.MYCELIUM_CARPET, DecoBlocks.PACKED_MYCELIUM);
        offerCarpetRecipe(exporter, DecoBlocks.CRIMSON_NYLIUM_CARPET, DecoBlocks.PACKED_CRIMSON_NYLIUM);
        offerCarpetRecipe(exporter, DecoBlocks.WARPED_NYLIUM_CARPET, DecoBlocks.PACKED_WARPED_NYLIUM);

        createStairsRecipe(DecoBlocks.GRASS_STAIRS, Ingredient.ofItems(DecoBlocks.PACKED_GRASS))
                .criterion(hasItem(DecoBlocks.PACKED_GRASS),conditionsFromItem(DecoBlocks.PACKED_GRASS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GRASS_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRASS_SLAB, DecoBlocks.PACKED_GRASS);

        createStairsRecipe(DecoBlocks.PODZOL_STAIRS, Ingredient.ofItems(DecoBlocks.PACKED_PODZOL))
                .criterion(hasItem(DecoBlocks.PACKED_PODZOL),conditionsFromItem(DecoBlocks.PACKED_PODZOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PODZOL_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PODZOL_SLAB, DecoBlocks.PACKED_PODZOL);

        createStairsRecipe(DecoBlocks.MYCELIUM_STAIRS, Ingredient.ofItems(DecoBlocks.PACKED_MYCELIUM))
                .criterion(hasItem(DecoBlocks.PACKED_MYCELIUM),conditionsFromItem(DecoBlocks.PACKED_MYCELIUM))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MYCELIUM_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MYCELIUM_SLAB, DecoBlocks.PACKED_MYCELIUM);

        createStairsRecipe(DecoBlocks.CRIMSON_NYLIUM_STAIRS, Ingredient.ofItems(DecoBlocks.PACKED_CRIMSON_NYLIUM))
                .criterion(hasItem(DecoBlocks.PACKED_CRIMSON_NYLIUM),conditionsFromItem(DecoBlocks.PACKED_CRIMSON_NYLIUM))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRIMSON_NYLIUM_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRIMSON_NYLIUM_SLAB, DecoBlocks.PACKED_CRIMSON_NYLIUM);

        createStairsRecipe(DecoBlocks.WARPED_NYLIUM_STAIRS, Ingredient.ofItems(DecoBlocks.PACKED_WARPED_NYLIUM))
                .criterion(hasItem(DecoBlocks.PACKED_WARPED_NYLIUM),conditionsFromItem(DecoBlocks.PACKED_WARPED_NYLIUM))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WARPED_NYLIUM_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WARPED_NYLIUM_SLAB, DecoBlocks.PACKED_WARPED_NYLIUM);

        createStairsRecipe(DecoBlocks.MOSS_STAIRS, Ingredient.ofItems(Items.MOSS_BLOCK))
                .criterion(hasItem(Items.MOSS_BLOCK),conditionsFromItem(Items.MOSS_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MOSS_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSS_SLAB, Items.MOSS_BLOCK);

        createStairsRecipe(DecoBlocks.DIRT_STAIRS, Ingredient.ofItems(Items.DIRT))
                .criterion(hasItem(Items.DIRT),conditionsFromItem(Items.DIRT))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.DIRT_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIRT_SLAB, Items.DIRT);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DIRT_WALL, Items.DIRT);

        createStairsRecipe(DecoBlocks.COARSE_DIRT_STAIRS, Ingredient.ofItems(Items.COARSE_DIRT))
                .criterion(hasItem(Items.COARSE_DIRT),conditionsFromItem(Items.COARSE_DIRT))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.COARSE_DIRT_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COARSE_DIRT_SLAB, Items.COARSE_DIRT);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.COARSE_DIRT_WALL, Items.COARSE_DIRT);

        createStairsRecipe(DecoBlocks.ROOTED_DIRT_STAIRS, Ingredient.ofItems(Items.ROOTED_DIRT))
                .criterion(hasItem(Items.ROOTED_DIRT),conditionsFromItem(Items.ROOTED_DIRT))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ROOTED_DIRT_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ROOTED_DIRT_SLAB, Items.ROOTED_DIRT);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.ROOTED_DIRT_WALL, Items.ROOTED_DIRT);

        createStairsRecipe(DecoBlocks.MUD_STAIRS, Ingredient.ofItems(Items.MUD))
                .criterion(hasItem(Items.MUD),conditionsFromItem(Items.MUD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MUD_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MUD_SLAB, Items.MUD);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.MUD_WALL, Items.MUD);

        createStairsRecipe(DecoBlocks.CLAY_STAIRS, Ingredient.ofItems(Items.CLAY))
                .criterion(hasItem(Items.CLAY),conditionsFromItem(Items.CLAY))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CLAY_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CLAY_SLAB, Items.CLAY);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CLAY_WALL, Items.CLAY);

        createStairsRecipe(DecoBlocks.BONE_STAIRS, Ingredient.ofItems(Items.BONE_BLOCK))
                .criterion(hasItem(Items.BONE_BLOCK),conditionsFromItem(Items.BONE_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BONE_STAIRS, Items.BONE_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BONE_SLAB, Items.BONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BONE_SLAB, Items.BONE_BLOCK,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.BONE_WALL, Items.BONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BONE_WALL, Items.BONE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.ROOTED_DIRT)
                .pattern("#M")
                .pattern("M#")
                .input('#', Items.DIRT)
                .input('M', Items.HANGING_ROOTS)
                .criterion(RecipeProvider.hasItem(Items.DIRT),
                        RecipeProvider.conditionsFromItem(Items.DIRT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.ROOTED_DIRT)));

        createStairsRecipe(DecoBlocks.CLOUD_STAIRS, Ingredient.ofItems(DecoBlocks.SOLID_CLOUD))
                .criterion(hasItem(DecoBlocks.SOLID_CLOUD),conditionsFromItem(DecoBlocks.SOLID_CLOUD))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CLOUD_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CLOUD_SLAB, DecoBlocks.SOLID_CLOUD);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_WALL, DecoBlocks.SOLID_CLOUD);

        createStairsRecipe(DecoBlocks.CLOUD_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CLOUD_BRICKS))
                .criterion(hasItem(DecoBlocks.CLOUD_BRICKS),conditionsFromItem(DecoBlocks.CLOUD_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CLOUD_BRICK_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CLOUD_BRICK_SLAB, DecoBlocks.CLOUD_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BRICK_WALL, DecoBlocks.CLOUD_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_CLOUD_BRICKS, DecoBlocks.CLOUD_BRICK_SLAB);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SOLID_CLOUD)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.CLOUD_BLOCK)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CLOUD_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CLOUD_BLOCK))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.SOLID_CLOUD)));

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CLOUD_BRICKS, DecoBlocks.SOLID_CLOUD);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.IRON_LADDER,3)
                .input('#', Items.IRON_NUGGET)
                .input('I', Items.IRON_INGOT)
                .pattern("# #")
                .pattern("#I#")
                .pattern("# #")
                .group("metal_ladder")
                .criterion(RecipeProvider.hasItem(Items.IRON_NUGGET),
                        RecipeProvider.conditionsFromItem(Items.IRON_NUGGET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.IRON_LADDER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.GOLDEN_LADDER,3)
                .input('#', Items.GOLD_NUGGET)
                .input('I', Items.GOLD_INGOT)
                .pattern("# #")
                .pattern("#I#")
                .pattern("# #")
                .group("metal_ladder")
                .criterion(RecipeProvider.hasItem(Items.GOLD_NUGGET),
                        RecipeProvider.conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.GOLDEN_LADDER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.COPPER_LADDER,3)
                .input('#', DecoItems.COPPER_NUGGET)
                .input('I', Items.COPPER_INGOT)
                .pattern("# #")
                .pattern("#I#")
                .pattern("# #")
                .group("metal_ladder")
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_NUGGET),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_NUGGET))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.COPPER_LADDER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WHITE_DYE)
                .input(DecoBlocks.ALPINE_POPPY)
                .group("white_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.ALPINE_POPPY),
                        RecipeProvider.conditionsFromItem(DecoBlocks.ALPINE_POPPY))
                .offerTo(exporter, new Identifier("white_dye_from_alpine_poppy"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GRAY_DYE)
                .input(DecoBlocks.DEAD_EYE_DAISY)
                .group("gray_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.DEAD_EYE_DAISY),
                        RecipeProvider.conditionsFromItem(DecoBlocks.DEAD_EYE_DAISY))
                .offerTo(exporter, new Identifier("gray_dye_from_dead_eye_daisy"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ORANGE_DYE)
                .input(DecoBlocks.POPPED_BLUET)
                .group("orange_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.POPPED_BLUET),
                        RecipeProvider.conditionsFromItem(DecoBlocks.POPPED_BLUET))
                .offerTo(exporter, new Identifier("orange_dye_from_popped_bluet"));

        createStairsRecipe(DecoBlocks.WHITE_WOOL_STAIRS, Ingredient.ofItems(Items.WHITE_WOOL))
                .criterion(hasItem(Items.WHITE_WOOL),conditionsFromItem(Items.WHITE_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.WHITE_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_WOOL_SLAB, Items.WHITE_WOOL);

        createStairsRecipe(DecoBlocks.BLACK_WOOL_STAIRS, Ingredient.ofItems(Items.BLACK_WOOL))
                .criterion(hasItem(Items.BLACK_WOOL),conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLACK_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_WOOL_SLAB, Items.BLACK_WOOL);

        createStairsRecipe(DecoBlocks.GRAY_WOOL_STAIRS, Ingredient.ofItems(Items.GRAY_WOOL))
                .criterion(hasItem(Items.GRAY_WOOL),conditionsFromItem(Items.GRAY_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GRAY_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRAY_WOOL_SLAB, Items.GRAY_WOOL);

        createStairsRecipe(DecoBlocks.LIGHT_GRAY_WOOL_STAIRS, Ingredient.ofItems(Items.LIGHT_GRAY_WOOL))
                .criterion(hasItem(Items.LIGHT_GRAY_WOOL),conditionsFromItem(Items.LIGHT_GRAY_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_GRAY_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIGHT_GRAY_WOOL_SLAB, Items.LIGHT_GRAY_WOOL);

        createStairsRecipe(DecoBlocks.BROWN_WOOL_STAIRS, Ingredient.ofItems(Items.BROWN_WOOL))
                .criterion(hasItem(Items.BROWN_WOOL),conditionsFromItem(Items.BROWN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BROWN_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BROWN_WOOL_SLAB, Items.BROWN_WOOL);

        createStairsRecipe(DecoBlocks.RED_WOOL_STAIRS, Ingredient.ofItems(Items.RED_WOOL))
                .criterion(hasItem(Items.RED_WOOL),conditionsFromItem(Items.RED_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.RED_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RED_WOOL_SLAB, Items.RED_WOOL);

        createStairsRecipe(DecoBlocks.ORANGE_WOOL_STAIRS, Ingredient.ofItems(Items.ORANGE_WOOL))
                .criterion(hasItem(Items.ORANGE_WOOL),conditionsFromItem(Items.ORANGE_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.ORANGE_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ORANGE_WOOL_SLAB, Items.ORANGE_WOOL);

        createStairsRecipe(DecoBlocks.YELLOW_WOOL_STAIRS, Ingredient.ofItems(Items.YELLOW_WOOL))
                .criterion(hasItem(Items.YELLOW_WOOL),conditionsFromItem(Items.YELLOW_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.YELLOW_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.YELLOW_WOOL_SLAB, Items.YELLOW_WOOL);

        createStairsRecipe(DecoBlocks.LIME_WOOL_STAIRS, Ingredient.ofItems(Items.LIME_WOOL))
                .criterion(hasItem(Items.LIME_WOOL),conditionsFromItem(Items.LIME_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIME_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIME_WOOL_SLAB, Items.LIME_WOOL);

        createStairsRecipe(DecoBlocks.GREEN_WOOL_STAIRS, Ingredient.ofItems(Items.GREEN_WOOL))
                .criterion(hasItem(Items.GREEN_WOOL),conditionsFromItem(Items.GREEN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.GREEN_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GREEN_WOOL_SLAB, Items.GREEN_WOOL);

        createStairsRecipe(DecoBlocks.CYAN_WOOL_STAIRS, Ingredient.ofItems(Items.CYAN_WOOL))
                .criterion(hasItem(Items.CYAN_WOOL),conditionsFromItem(Items.CYAN_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CYAN_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CYAN_WOOL_SLAB, Items.CYAN_WOOL);

        createStairsRecipe(DecoBlocks.BLUE_WOOL_STAIRS, Ingredient.ofItems(Items.BLUE_WOOL))
                .criterion(hasItem(Items.BLUE_WOOL),conditionsFromItem(Items.BLUE_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.BLUE_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLUE_WOOL_SLAB, Items.BLUE_WOOL);

        createStairsRecipe(DecoBlocks.LIGHT_BLUE_WOOL_STAIRS, Ingredient.ofItems(Items.LIGHT_BLUE_WOOL))
                .criterion(hasItem(Items.LIGHT_BLUE_WOOL),conditionsFromItem(Items.LIGHT_BLUE_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.LIGHT_BLUE_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIGHT_BLUE_WOOL_SLAB, Items.LIGHT_BLUE_WOOL);

        createStairsRecipe(DecoBlocks.PURPLE_WOOL_STAIRS, Ingredient.ofItems(Items.PURPLE_WOOL))
                .criterion(hasItem(Items.PURPLE_WOOL),conditionsFromItem(Items.PURPLE_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PURPLE_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPLE_WOOL_SLAB, Items.PURPLE_WOOL);

        createStairsRecipe(DecoBlocks.MAGENTA_WOOL_STAIRS, Ingredient.ofItems(Items.MAGENTA_WOOL))
                .criterion(hasItem(Items.MAGENTA_WOOL),conditionsFromItem(Items.MAGENTA_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.MAGENTA_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MAGENTA_WOOL_SLAB, Items.MAGENTA_WOOL);

        createStairsRecipe(DecoBlocks.PINK_WOOL_STAIRS, Ingredient.ofItems(Items.PINK_WOOL))
                .criterion(hasItem(Items.PINK_WOOL),conditionsFromItem(Items.PINK_WOOL))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.PINK_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PINK_WOOL_SLAB, Items.PINK_WOOL);

        createStairsRecipe(DecoBlocks.CRACKED_STONE_BRICK_STAIRS, Ingredient.ofItems(Items.CRACKED_STONE_BRICKS))
                .criterion(hasItem(Items.CRACKED_STONE_BRICKS),conditionsFromItem(Items.CRACKED_STONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRACKED_STONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_STAIRS, Items.CRACKED_STONE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_SLAB, Items.CRACKED_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_SLAB, Items.CRACKED_STONE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_STONE_BRICK_WALL, Items.CRACKED_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_WALL, Items.CRACKED_STONE_BRICKS);

        createStairsRecipe(DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Ingredient.ofItems(Items.CRACKED_DEEPSLATE_BRICKS))
                .criterion(hasItem(Items.CRACKED_DEEPSLATE_BRICKS),conditionsFromItem(Items.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Items.CRACKED_DEEPSLATE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Items.CRACKED_DEEPSLATE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Items.CRACKED_DEEPSLATE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_WALL, Items.CRACKED_DEEPSLATE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_WALL, Items.CRACKED_DEEPSLATE_BRICKS);

        createStairsRecipe(DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Ingredient.ofItems(Items.CRACKED_DEEPSLATE_TILES))
                .criterion(hasItem(Items.CRACKED_DEEPSLATE_TILES),conditionsFromItem(Items.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Items.CRACKED_DEEPSLATE_TILES);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Items.CRACKED_DEEPSLATE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Items.CRACKED_DEEPSLATE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_DEEPSLATE_TILE_WALL, Items.CRACKED_DEEPSLATE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_WALL, Items.CRACKED_DEEPSLATE_TILES);

        createStairsRecipe(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Ingredient.ofItems(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .criterion(hasItem(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS),conditionsFromItem(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS);

        createStairsRecipe(DecoBlocks.CRACKED_NETHER_BRICK_STAIRS, Ingredient.ofItems(Items.CRACKED_NETHER_BRICKS))
                .criterion(hasItem(Items.CRACKED_NETHER_BRICKS),conditionsFromItem(Items.CRACKED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRACKED_NETHER_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_STAIRS, Items.CRACKED_NETHER_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_SLAB, Items.CRACKED_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_SLAB, Items.CRACKED_NETHER_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_NETHER_BRICK_WALL, Items.CRACKED_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_WALL, Items.CRACKED_NETHER_BRICKS);

        createStairsRecipe(DecoBlocks.CRACKED_STONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.CRACKED_STONE_TILES))
                .criterion(hasItem(DecoBlocks.CRACKED_STONE_TILES),conditionsFromItem(DecoBlocks.CRACKED_STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRACKED_STONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_STAIRS, DecoBlocks.CRACKED_STONE_TILES);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_SLAB, DecoBlocks.CRACKED_STONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_SLAB, DecoBlocks.CRACKED_STONE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_STONE_TILE_WALL, DecoBlocks.CRACKED_STONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_WALL, DecoBlocks.CRACKED_STONE_TILES);

        createStairsRecipe(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES))
                .criterion(hasItem(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES),conditionsFromItem(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);

        createStairsRecipe(DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CRACKED_END_STONE_BRICKS))
                .criterion(hasItem(DecoBlocks.CRACKED_END_STONE_BRICKS),conditionsFromItem(DecoBlocks.CRACKED_END_STONE_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS, DecoBlocks.CRACKED_END_STONE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_SLAB, DecoBlocks.CRACKED_END_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_SLAB, DecoBlocks.CRACKED_END_STONE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_END_STONE_BRICK_WALL, DecoBlocks.CRACKED_END_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_WALL, DecoBlocks.CRACKED_END_STONE_BRICKS);

        createStairsRecipe(DecoBlocks.CRACKED_END_STONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.CRACKED_END_STONE_TILES))
                .criterion(hasItem(DecoBlocks.CRACKED_END_STONE_TILES),conditionsFromItem(DecoBlocks.CRACKED_END_STONE_TILES))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRACKED_END_STONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_STAIRS, DecoBlocks.CRACKED_END_STONE_TILES);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_SLAB, DecoBlocks.CRACKED_END_STONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_SLAB, DecoBlocks.CRACKED_END_STONE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_END_STONE_TILE_WALL, DecoBlocks.CRACKED_END_STONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_WALL, DecoBlocks.CRACKED_END_STONE_TILES);

        createStairsRecipe(DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CRACKED_RED_NETHER_BRICKS))
                .criterion(hasItem(DecoBlocks.CRACKED_RED_NETHER_BRICKS),conditionsFromItem(DecoBlocks.CRACKED_RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, DecoBlocks.CRACKED_RED_NETHER_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB, DecoBlocks.CRACKED_RED_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB, DecoBlocks.CRACKED_RED_NETHER_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_RED_NETHER_BRICK_WALL, DecoBlocks.CRACKED_RED_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_WALL, DecoBlocks.CRACKED_RED_NETHER_BRICKS);

        createStairsRecipe(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS))
                .criterion(hasItem(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS),conditionsFromItem(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(getRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_WALL, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_WALL, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.STONE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.STONE_BRICK_STAIRS), conditionsFromItem(Items.STONE_BRICK_STAIRS))
                .offerTo(exporter, new Identifier("cracked_stone_brick_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.STONE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_SLAB,
                        0.1f, 200).criterion(hasItem(Items.STONE_BRICK_SLAB), conditionsFromItem(Items.STONE_BRICK_SLAB))
                .offerTo(exporter, new Identifier("cracked_stone_brick_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.STONE_BRICK_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_STONE_BRICK_WALL,
                        0.1f, 200).criterion(hasItem(Items.STONE_BRICK_WALL), conditionsFromItem(Items.STONE_BRICK_WALL))
                .offerTo(exporter, new Identifier("cracked_stone_brick_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.POLISHED_BLACKSTONE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.POLISHED_BLACKSTONE_BRICK_STAIRS), conditionsFromItem(Items.POLISHED_BLACKSTONE_BRICK_STAIRS))
                .offerTo(exporter, new Identifier("cracked_polished_blackstone_brick_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.POLISHED_BLACKSTONE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB,
                        0.1f, 200).criterion(hasItem(Items.POLISHED_BLACKSTONE_BRICK_SLAB), conditionsFromItem(Items.POLISHED_BLACKSTONE_BRICK_SLAB))
                .offerTo(exporter, new Identifier("cracked_polished_blackstone_brick_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.POLISHED_BLACKSTONE_BRICK_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL,
                        0.1f, 200).criterion(hasItem(Items.POLISHED_BLACKSTONE_BRICK_WALL), conditionsFromItem(Items.POLISHED_BLACKSTONE_BRICK_WALL))
                .offerTo(exporter, new Identifier("cracked_polished_blackstone_brick_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.DEEPSLATE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.DEEPSLATE_BRICK_STAIRS), conditionsFromItem(Items.DEEPSLATE_BRICK_STAIRS))
                .offerTo(exporter, new Identifier("cracked_deepslate_brick_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.DEEPSLATE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB,
                        0.1f, 200).criterion(hasItem(Items.DEEPSLATE_BRICK_SLAB), conditionsFromItem(Items.DEEPSLATE_BRICK_SLAB))
                .offerTo(exporter, new Identifier("cracked_deepslate_brick_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.DEEPSLATE_BRICK_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_WALL,
                        0.1f, 200).criterion(hasItem(Items.DEEPSLATE_BRICK_WALL), conditionsFromItem(Items.DEEPSLATE_BRICK_WALL))
                .offerTo(exporter, new Identifier("cracked_deepslate_brick_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.NETHER_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.NETHER_BRICK_STAIRS), conditionsFromItem(Items.NETHER_BRICK_STAIRS))
                .offerTo(exporter, new Identifier("cracked_nether_brick_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.NETHER_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_SLAB,
                        0.1f, 200).criterion(hasItem(Items.NETHER_BRICK_SLAB), conditionsFromItem(Items.NETHER_BRICK_SLAB))
                .offerTo(exporter, new Identifier("cracked_nether_brick_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.NETHER_BRICK_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_NETHER_BRICK_WALL,
                        0.1f, 200).criterion(hasItem(Items.NETHER_BRICK_WALL), conditionsFromItem(Items.NETHER_BRICK_WALL))
                .offerTo(exporter, new Identifier("cracked_nether_brick_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.NETHER_BRICK_FENCE), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_NETHER_BRICK_FENCE,
                        0.1f, 200).criterion(hasItem(Items.NETHER_BRICK_FENCE), conditionsFromItem(Items.NETHER_BRICK_FENCE))
                .offerTo(exporter, new Identifier("cracked_nether_brick_fence_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.NETHER_BRICK_FENCE_GATE), RecipeCategory.REDSTONE, DecoBlocks.CRACKED_NETHER_BRICK_FENCE_GATE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.NETHER_BRICK_FENCE_GATE), conditionsFromItem(DecoBlocks.NETHER_BRICK_FENCE_GATE))
                .offerTo(exporter, new Identifier("cracked_nether_brick_fence_gate_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_NETHER_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.RED_NETHER_BRICK_STAIRS), conditionsFromItem(Items.RED_NETHER_BRICK_STAIRS))
                .offerTo(exporter, new Identifier("cracked_red_nether_brick_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_NETHER_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB,
                        0.1f, 200).criterion(hasItem(Items.RED_NETHER_BRICK_SLAB), conditionsFromItem(Items.RED_NETHER_BRICK_SLAB))
                .offerTo(exporter, new Identifier("cracked_red_nether_brick_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_NETHER_BRICK_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_RED_NETHER_BRICK_WALL,
                        0.1f, 200).criterion(hasItem(Items.RED_NETHER_BRICK_WALL), conditionsFromItem(Items.RED_NETHER_BRICK_WALL))
                .offerTo(exporter, new Identifier("cracked_red_nether_brick_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RED_NETHER_BRICK_FENCE), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RED_NETHER_BRICK_FENCE), conditionsFromItem(DecoBlocks.RED_NETHER_BRICK_FENCE))
                .offerTo(exporter, new Identifier("cracked_red_nether_brick_fence_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE), RecipeCategory.REDSTONE, DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE), conditionsFromItem(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE))
                .offerTo(exporter, new Identifier("cracked_red_nether_brick_fence_gate_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICK_STAIRS), conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICK_STAIRS))
                .offerTo(exporter, new Identifier("cracked_blue_nether_brick_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICK_SLAB), conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICK_SLAB))
                .offerTo(exporter, new Identifier("cracked_blue_nether_brick_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICK_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICK_WALL), conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICK_WALL))
                .offerTo(exporter, new Identifier("cracked_blue_nether_brick_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICK_FENCE), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICK_FENCE), conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICK_FENCE))
                .offerTo(exporter, new Identifier("cracked_blue_nether_brick_fence_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE), RecipeCategory.REDSTONE, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE), conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE))
                .offerTo(exporter, new Identifier("cracked_blue_nether_brick_fence_gate_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.DEEPSLATE_TILE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.DEEPSLATE_TILE_STAIRS), conditionsFromItem(Items.DEEPSLATE_TILE_STAIRS))
                .offerTo(exporter, new Identifier("cracked_deepslate_tile_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.DEEPSLATE_TILE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.DEEPSLATE_TILE_SLAB), conditionsFromItem(Items.DEEPSLATE_TILE_SLAB))
                .offerTo(exporter, new Identifier("cracked_deepslate_tile_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.DEEPSLATE_TILE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_DEEPSLATE_TILE_WALL,
                        0.1f, 200).criterion(hasItem(Items.DEEPSLATE_TILE_WALL), conditionsFromItem(Items.DEEPSLATE_TILE_WALL))
                .offerTo(exporter, new Identifier("cracked_deepslate_tile_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.END_STONE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.END_STONE_BRICK_STAIRS), conditionsFromItem(Items.END_STONE_BRICK_STAIRS))
                .offerTo(exporter, new Identifier("cracked_end_stone_brick_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.END_STONE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_SLAB,
                        0.1f, 200).criterion(hasItem(Items.END_STONE_BRICK_SLAB), conditionsFromItem(Items.END_STONE_BRICK_SLAB))
                .offerTo(exporter, new Identifier("cracked_end_stone_brick_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.END_STONE_BRICK_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_END_STONE_BRICK_WALL,
                        0.1f, 200).criterion(hasItem(Items.END_STONE_BRICK_WALL), conditionsFromItem(Items.END_STONE_BRICK_WALL))
                .offerTo(exporter, new Identifier("cracked_end_stone_brick_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.STONE_TILE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.STONE_TILE_STAIRS), conditionsFromItem(DecoBlocks.STONE_TILE_STAIRS))
                .offerTo(exporter, new Identifier("cracked_stone_tile_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.STONE_TILE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.STONE_TILE_SLAB), conditionsFromItem(DecoBlocks.STONE_TILE_SLAB))
                .offerTo(exporter, new Identifier("cracked_stone_tile_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.STONE_TILE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_STONE_TILE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.STONE_TILE_WALL), conditionsFromItem(DecoBlocks.STONE_TILE_WALL))
                .offerTo(exporter, new Identifier("cracked_stone_tile_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS), conditionsFromItem(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS))
                .offerTo(exporter, new Identifier("cracked_polished_blackstone_tile_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB), conditionsFromItem(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB))
                .offerTo(exporter, new Identifier("cracked_polished_blackstone_tile_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL), conditionsFromItem(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL))
                .offerTo(exporter, new Identifier("cracked_polished_blackstone_tile_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_TILE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_TILE_STAIRS), conditionsFromItem(DecoBlocks.END_STONE_TILE_STAIRS))
                .offerTo(exporter, new Identifier("cracked_end_stone_tile_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_TILE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_TILE_SLAB), conditionsFromItem(DecoBlocks.END_STONE_TILE_SLAB))
                .offerTo(exporter, new Identifier("cracked_end_stone_tile_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_TILE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_END_STONE_TILE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_TILE_WALL), conditionsFromItem(DecoBlocks.END_STONE_TILE_WALL))
                .offerTo(exporter, new Identifier("cracked_end_stone_tile_wall_from_smelting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.BELL)
                .input('#', Items.GOLD_NUGGET)
                .input('I', Items.GOLD_INGOT)
                .input('/', Items.STICK)
                .pattern("///")
                .pattern("I#I")
                .pattern(" I ")
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(Items.BELL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.CRACKED_NETHER_BRICK_FENCE,6)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.CRACKED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.CRACKED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Items.CRACKED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRACKED_NETHER_BRICK_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE,6)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.CRACKED_RED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CRACKED_RED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CRACKED_RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE,6)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.CRACKED_BLUE_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.CRACKED_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.CRACKED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.CRACKED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Items.CRACKED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRACKED_NETHER_BRICK_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.CRACKED_RED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CRACKED_RED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CRACKED_RED_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.CRACKED_BLUE_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE)));
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
    public static void offerBookshelvesVariantRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible output, ItemConvertible woodInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output)
                .input('#', woodInput)
                .input('$', DecoTags.Items.DECO_BOOKSHELVES)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_bookshelves")
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
