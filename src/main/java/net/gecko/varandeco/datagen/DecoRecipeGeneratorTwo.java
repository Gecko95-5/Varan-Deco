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
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;
import org.jetbrains.annotations.Nullable;

public class DecoRecipeGeneratorTwo extends FabricRecipeProvider {
    public DecoRecipeGeneratorTwo(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_PURPUR,2)
                .pattern("##")
                .pattern("##")
                .input('#', Items.PURPUR_SLAB)
                .criterion(RecipeProvider.hasItem(Items.PURPUR_SLAB),
                        RecipeProvider.conditionsFromItem(Items.PURPUR_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHISELED_PURPUR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR,4)
                .pattern("#P")
                .pattern("P#")
                .input('#', Items.PURPUR_BLOCK)
                .input('P', Items.POPPED_CHORUS_FRUIT)
                .criterion(RecipeProvider.hasItem(Items.PURPUR_BLOCK),
                        RecipeProvider.conditionsFromItem(Items.PURPUR_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CUT_PURPUR)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR, Items.PURPUR_BLOCK);

        createStairsRecipe(DecoBlocks.CUT_PURPUR_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_PURPUR))
                .criterion(hasItem(DecoBlocks.CUT_PURPUR),conditionsFromItem(DecoBlocks.CUT_PURPUR))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CUT_PURPUR_STAIRS)));
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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.PASSTOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, DecoItems.SHADDOL,4)
                .pattern("S#")
                .pattern("#S")
                .input('#', Items.INK_SAC)
                .input('S', DecoTags.Items.MUSHROOMS)
                .criterion("has_mushrooms", conditionsFromTag(DecoTags.Items.MUSHROOMS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.SHADDOL)));

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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.OAK_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OAK_WOOD_SLAB, Items.OAK_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.OAK_WOOD_WALL, Items.OAK_WOOD);

        createStairsRecipe(DecoBlocks.SPRUCE_WOOD_STAIRS, Ingredient.ofItems(Items.SPRUCE_WOOD))
                .criterion(hasItem(Items.SPRUCE_WOOD),conditionsFromItem(Items.SPRUCE_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SPRUCE_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SPRUCE_WOOD_SLAB, Items.SPRUCE_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.SPRUCE_WOOD_WALL, Items.SPRUCE_WOOD);

        createStairsRecipe(DecoBlocks.BIRCH_WOOD_STAIRS, Ingredient.ofItems(Items.BIRCH_WOOD))
                .criterion(hasItem(Items.BIRCH_WOOD),conditionsFromItem(Items.BIRCH_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.BIRCH_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BIRCH_WOOD_SLAB, Items.BIRCH_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.BIRCH_WOOD_WALL, Items.BIRCH_WOOD);

        createStairsRecipe(DecoBlocks.JUNGLE_WOOD_STAIRS, Ingredient.ofItems(Items.JUNGLE_WOOD))
                .criterion(hasItem(Items.JUNGLE_WOOD),conditionsFromItem(Items.JUNGLE_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.JUNGLE_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.JUNGLE_WOOD_SLAB, Items.JUNGLE_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.JUNGLE_WOOD_WALL, Items.JUNGLE_WOOD);

        createStairsRecipe(DecoBlocks.ACACIA_WOOD_STAIRS, Ingredient.ofItems(Items.ACACIA_WOOD))
                .criterion(hasItem(Items.ACACIA_WOOD),conditionsFromItem(Items.ACACIA_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.ACACIA_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ACACIA_WOOD_SLAB, Items.ACACIA_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.ACACIA_WOOD_WALL, Items.ACACIA_WOOD);

        createStairsRecipe(DecoBlocks.DARK_OAK_WOOD_STAIRS, Ingredient.ofItems(Items.DARK_OAK_WOOD))
                .criterion(hasItem(Items.DARK_OAK_WOOD),conditionsFromItem(Items.DARK_OAK_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DARK_OAK_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DARK_OAK_WOOD_SLAB, Items.DARK_OAK_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.DARK_OAK_WOOD_WALL, Items.DARK_OAK_WOOD);

        createStairsRecipe(DecoBlocks.MANGROVE_WOOD_STAIRS, Ingredient.ofItems(Items.MANGROVE_WOOD))
                .criterion(hasItem(Items.MANGROVE_WOOD),conditionsFromItem(Items.MANGROVE_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MANGROVE_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MANGROVE_WOOD_SLAB, Items.MANGROVE_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.MANGROVE_WOOD_WALL, Items.MANGROVE_WOOD);

        createStairsRecipe(DecoBlocks.CRIMSON_HYPHAE_STAIRS, Ingredient.ofItems(Items.CRIMSON_HYPHAE))
                .criterion(hasItem(Items.CRIMSON_HYPHAE),conditionsFromItem(Items.CRIMSON_HYPHAE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRIMSON_HYPHAE_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRIMSON_HYPHAE_SLAB, Items.CRIMSON_HYPHAE);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.CRIMSON_HYPHAE_WALL, Items.CRIMSON_HYPHAE);

        createStairsRecipe(DecoBlocks.WARPED_HYPHAE_STAIRS, Ingredient.ofItems(Items.WARPED_HYPHAE))
                .criterion(hasItem(Items.WARPED_HYPHAE),conditionsFromItem(Items.WARPED_HYPHAE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WARPED_HYPHAE_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WARPED_HYPHAE_SLAB, Items.WARPED_HYPHAE);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.WARPED_HYPHAE_WALL, Items.WARPED_HYPHAE);

        createStairsRecipe(DecoBlocks.STRIPPED_OAK_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Items.STRIPPED_OAK_WOOD),conditionsFromItem(Items.STRIPPED_OAK_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.STRIPPED_OAK_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_OAK_WOOD_SLAB, Items.STRIPPED_OAK_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_OAK_WOOD_WALL, Items.STRIPPED_OAK_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_SPRUCE_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Items.STRIPPED_SPRUCE_WOOD),conditionsFromItem(Items.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.STRIPPED_SPRUCE_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_SPRUCE_WOOD_SLAB, Items.STRIPPED_SPRUCE_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_SPRUCE_WOOD_WALL, Items.STRIPPED_SPRUCE_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_BIRCH_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Items.STRIPPED_BIRCH_WOOD),conditionsFromItem(Items.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.STRIPPED_BIRCH_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_BIRCH_WOOD_SLAB, Items.STRIPPED_BIRCH_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_BIRCH_WOOD_WALL, Items.STRIPPED_BIRCH_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_JUNGLE_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Items.STRIPPED_JUNGLE_WOOD),conditionsFromItem(Items.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.STRIPPED_JUNGLE_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_JUNGLE_WOOD_SLAB, Items.STRIPPED_JUNGLE_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_JUNGLE_WOOD_WALL, Items.STRIPPED_JUNGLE_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_ACACIA_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Items.STRIPPED_ACACIA_WOOD),conditionsFromItem(Items.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.STRIPPED_ACACIA_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_ACACIA_WOOD_SLAB, Items.STRIPPED_ACACIA_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_ACACIA_WOOD_WALL, Items.STRIPPED_ACACIA_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Items.STRIPPED_DARK_OAK_WOOD),conditionsFromItem(Items.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_DARK_OAK_WOOD_SLAB, Items.STRIPPED_DARK_OAK_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_DARK_OAK_WOOD_WALL, Items.STRIPPED_DARK_OAK_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_MANGROVE_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Items.STRIPPED_MANGROVE_WOOD),conditionsFromItem(Items.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.STRIPPED_MANGROVE_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_MANGROVE_WOOD_SLAB, Items.STRIPPED_MANGROVE_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_MANGROVE_WOOD_WALL, Items.STRIPPED_MANGROVE_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS, Ingredient.ofItems(Items.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Items.STRIPPED_CRIMSON_HYPHAE),conditionsFromItem(Items.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, Items.STRIPPED_CRIMSON_HYPHAE);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_CRIMSON_HYPHAE_WALL, Items.STRIPPED_CRIMSON_HYPHAE);

        createStairsRecipe(DecoBlocks.STRIPPED_WARPED_HYPHAE_STAIRS, Ingredient.ofItems(Items.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Items.STRIPPED_WARPED_HYPHAE),conditionsFromItem(Items.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.STRIPPED_WARPED_HYPHAE_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_WARPED_HYPHAE_SLAB, Items.STRIPPED_WARPED_HYPHAE);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_WARPED_HYPHAE_WALL, Items.STRIPPED_WARPED_HYPHAE);

        createStairsRecipe(DecoBlocks.WOODEN_WOOD_STAIRS, Ingredient.ofItems(DecoBlocks.WOODEN_WOOD))
                .criterion(hasItem(DecoBlocks.WOODEN_WOOD),conditionsFromItem(DecoBlocks.WOODEN_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WOODEN_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WOODEN_WOOD_SLAB, DecoBlocks.WOODEN_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.WOODEN_WOOD_WALL, DecoBlocks.WOODEN_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_WOODEN_WOOD_STAIRS, Ingredient.ofItems(DecoBlocks.STRIPPED_WOODEN_WOOD))
                .criterion(hasItem(DecoBlocks.STRIPPED_WOODEN_WOOD),conditionsFromItem(DecoBlocks.STRIPPED_WOODEN_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.STRIPPED_WOODEN_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_WOODEN_WOOD_SLAB, DecoBlocks.STRIPPED_WOODEN_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_WOODEN_WOOD_WALL, DecoBlocks.STRIPPED_WOODEN_WOOD);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_NETHERRACK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.NETHERRACK)
                .criterion(RecipeProvider.hasItem(Items.NETHERRACK),
                        RecipeProvider.conditionsFromItem(Items.NETHERRACK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.PACKED_NETHERRACK)));

        createStairsRecipe(DecoBlocks.PACKED_NETHERRACK_STAIRS, Ingredient.ofItems(DecoBlocks.PACKED_NETHERRACK))
                .criterion(hasItem(DecoBlocks.PACKED_NETHERRACK),conditionsFromItem(DecoBlocks.PACKED_NETHERRACK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.PACKED_NETHERRACK_STAIRS)));
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_STAIRS, DecoBlocks.PACKED_NETHERRACK);

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_SLAB, DecoBlocks.PACKED_NETHERRACK);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_SLAB, DecoBlocks.PACKED_NETHERRACK,2);

        offerSlabRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks. PACKED_NETHERRACK_WALL, DecoBlocks.PACKED_NETHERRACK);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_WALL, DecoBlocks.PACKED_NETHERRACK);

        offerPolishedStoneRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.NETHERRACK_BRICKS, DecoBlocks.PACKED_NETHERRACK);
        offerStonecuttingRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICKS, DecoBlocks.PACKED_NETHERRACK);

        createStairsRecipe(DecoBlocks.NETHERRACK_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.NETHERRACK_BRICKS))
                .criterion(hasItem(DecoBlocks.NETHERRACK_BRICKS),conditionsFromItem(DecoBlocks.NETHERRACK_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.NETHERRACK_BRICK_STAIRS)));
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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SMOOTH_GLOWSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_CACTUS,4)
                .pattern("##")
                .pattern("##")
                .input('#', Items.CACTUS)
                .criterion(RecipeProvider.hasItem(Items.CACTUS),
                        RecipeProvider.conditionsFromItem(Items.CACTUS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.PACKED_CACTUS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_PLANKS,2)
                .input(DecoBlocks.PACKED_CACTUS)
                .group("cactus_planks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.PACKED_CACTUS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.PACKED_CACTUS))
                .offerTo(exporter, Identifier.of("cactus_planks_form_packed_cactus"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_PLANKS,2)
                .input(DecoBlocks.STRIPPED_CACTUS)
                .group("cactus_planks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.STRIPPED_CACTUS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.STRIPPED_CACTUS))
                .offerTo(exporter, Identifier.of("cactus_planks_form_stripped_cactus"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.OAK_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.OAK_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.OAK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.OAK_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.OAK_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.OAK_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.OAK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.OAK_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.BIRCH_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.BIRCH_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.BIRCH_SLAB),
                        RecipeProvider.conditionsFromItem(Items.BIRCH_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.BIRCH_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.BIRCH_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.BIRCH_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.BIRCH_SLAB),
                        RecipeProvider.conditionsFromItem(Items.BIRCH_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.BIRCH_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.SPRUCE_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.SPRUCE_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.SPRUCE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.SPRUCE_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SPRUCE_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.SPRUCE_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.SPRUCE_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.SPRUCE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.SPRUCE_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SPRUCE_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.JUNGLE_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.JUNGLE_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.JUNGLE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.JUNGLE_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.JUNGLE_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.JUNGLE_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.JUNGLE_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.JUNGLE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.JUNGLE_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.JUNGLE_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.ACACIA_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.ACACIA_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.ACACIA_SLAB),
                        RecipeProvider.conditionsFromItem(Items.ACACIA_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.ACACIA_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.ACACIA_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.ACACIA_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.ACACIA_SLAB),
                        RecipeProvider.conditionsFromItem(Items.ACACIA_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.ACACIA_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.DARK_OAK_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.DARK_OAK_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.DARK_OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.DARK_OAK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DARK_OAK_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.DARK_OAK_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.DARK_OAK_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.DARK_OAK_SLAB),
                        RecipeProvider.conditionsFromItem(Items.DARK_OAK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DARK_OAK_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.MANGROVE_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.MANGROVE_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.MANGROVE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.MANGROVE_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MANGROVE_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.MANGROVE_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.MANGROVE_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.MANGROVE_SLAB),
                        RecipeProvider.conditionsFromItem(Items.MANGROVE_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MANGROVE_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.CRIMSON_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.CRIMSON_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.CRIMSON_SLAB),
                        RecipeProvider.conditionsFromItem(Items.CRIMSON_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRIMSON_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.CRIMSON_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.CRIMSON_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.CRIMSON_SLAB),
                        RecipeProvider.conditionsFromItem(Items.CRIMSON_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRIMSON_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.WARPED_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.WARPED_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.WARPED_SLAB),
                        RecipeProvider.conditionsFromItem(Items.WARPED_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WARPED_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.WARPED_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.WARPED_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.WARPED_SLAB),
                        RecipeProvider.conditionsFromItem(Items.WARPED_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WARPED_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.CACTUS_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.CACTUS_PLANK_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANK_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CACTUS_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.CACTUS_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.CACTUS_PLANK_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.CACTUS_PLANK_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CACTUS_PLANK_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CACTUS_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.WOODEN_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.WOODEN_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WOODEN_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.WOODEN_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.WOODEN_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.WOODEN_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WOODEN_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WOODEN_PALLET_TRAPDOOR)));

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
                .offerTo(exporter, Identifier.of(getRecipeName(Items.BROWN_MUSHROOM_BLOCK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,Items.RED_MUSHROOM_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.RED_MUSHROOM)
                .group("giant_mushroom_blocks")
                .criterion(RecipeProvider.hasItem(Items.RED_MUSHROOM),
                        RecipeProvider.conditionsFromItem(Items.RED_MUSHROOM))
                .offerTo(exporter, Identifier.of(getRecipeName(Items.RED_MUSHROOM_BLOCK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,Items.MUSHROOM_STEM)
                .pattern("##")
                .pattern("##")
                .input('#', DecoTags.Items.MUSHROOMS)
                .criterion("has_mushrooms", conditionsFromTag(DecoTags.Items.MUSHROOMS))
                .offerTo(exporter, Identifier.of(getRecipeName(Items.MUSHROOM_STEM)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_PLANKS,4)
                .input(DecoTags.Items.GIANT_MUSHROOM_BLOCKS)
                .group("planks")
                .criterion("has_logs", conditionsFromTag(DecoTags.Items.GIANT_MUSHROOM_BLOCKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MUSHROOM_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_PLANKS,2)
                .input(Items.MUSHROOM_STEM)
                .group("planks")
                .criterion(RecipeProvider.hasItem(Items.MUSHROOM_STEM),
                        RecipeProvider.conditionsFromItem(Items.MUSHROOM_STEM))
                .offerTo(exporter, Identifier.of("mushroom_planks_form_stem"));

        createStairsRecipe(DecoBlocks.MUSHROOM_STAIRS, Ingredient.ofItems(DecoBlocks.MUSHROOM_PLANKS))
                .group("wooden_stairs")
                .criterion(hasItem(DecoBlocks.MUSHROOM_PLANKS),conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MUSHROOM_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_SLAB,6)
                .pattern("###")
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_slab")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MUSHROOM_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.MUSHROOM_FENCE,3)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_fence")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MUSHROOM_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_fence_fence")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MUSHROOM_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_PRESSURE_PLATE)
                .pattern("##")
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_pressure_plate")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MUSHROOM_PRESSURE_PLATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_BUTTON)
                .input(DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_button")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MUSHROOM_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_door")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MUSHROOM_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_trapdoor")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MUSHROOM_TRAPDOOR)));

        createSignRecipe(DecoItems.MUSHROOM_SIGN, Ingredient.ofItems(DecoBlocks.MUSHROOM_PLANKS))
                .group("wooden_sign")
                .criterion(hasItem(DecoBlocks.MUSHROOM_PLANKS),conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.MUSHROOM_SIGN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.MUSHROOM_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MUSHROOM_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.MUSHROOM_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MUSHROOM_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MUSHROOM_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MUSHROOM_PALLET_TRAPDOOR)));

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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.POLISHED_CALCITE_STAIRS)));
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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CUT_CALCITE_STAIRS)));
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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CALCITE_BRICK_STAIRS)));
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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CUT_ANDESITE_STAIRS)));
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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.ANDESITE_BRICK_STAIRS)));
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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CUT_GRANITE_STAIRS)));
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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.GRANITE_BRICK_STAIRS)));
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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CUT_DIORITE_STAIRS)));
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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DIORITE_BRICK_STAIRS)));
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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CUT_GOLD_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_STAIRS, Items.GOLD_BLOCK,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_STAIRS, DecoBlocks.CUT_GOLD);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_SLAB, DecoBlocks.CUT_GOLD);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_SLAB, Items.GOLD_BLOCK,8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_SLAB, DecoBlocks.CUT_GOLD,2);

        createStairsRecipe(DecoBlocks.IRON_STAIRS, Ingredient.ofItems(Items.IRON_BLOCK))
                .criterion(hasItem(Items.IRON_BLOCK),conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_STAIRS, Items.IRON_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_SLAB, Items.IRON_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_SLAB, Items.IRON_BLOCK,2);

        createStairsRecipe(DecoBlocks.GOLD_STAIRS, Ingredient.ofItems(Items.GOLD_BLOCK))
                .criterion(hasItem(Items.GOLD_BLOCK),conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.GOLD_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_STAIRS, Items.GOLD_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_SLAB, Items.GOLD_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_SLAB, Items.GOLD_BLOCK,2);

        createStairsRecipe(DecoBlocks.RAW_IRON_STAIRS, Ingredient.ofItems(Items.RAW_IRON_BLOCK))
                .criterion(hasItem(Items.RAW_IRON_BLOCK),conditionsFromItem(Items.RAW_IRON_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.RAW_IRON_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_IRON_STAIRS, Items.RAW_IRON_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_IRON_SLAB, Items.RAW_IRON_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_IRON_SLAB, Items.RAW_IRON_BLOCK,2);

        createStairsRecipe(DecoBlocks.RAW_GOLD_STAIRS, Ingredient.ofItems(Items.RAW_GOLD_BLOCK))
                .criterion(hasItem(Items.RAW_GOLD_BLOCK),conditionsFromItem(Items.RAW_GOLD_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.RAW_GOLD_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_GOLD_STAIRS, Items.RAW_GOLD_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_GOLD_SLAB, Items.RAW_GOLD_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_GOLD_SLAB, Items.RAW_GOLD_BLOCK,2);

        createStairsRecipe(DecoBlocks.COPPER_STAIRS, Ingredient.ofItems(Items.COPPER_BLOCK))
                .criterion(hasItem(Items.COPPER_BLOCK),conditionsFromItem(Items.COPPER_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_STAIRS, Items.COPPER_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_SLAB, Items.COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_SLAB, Items.COPPER_BLOCK,2);

        createStairsRecipe(DecoBlocks.EXPOSED_COPPER_STAIRS, Ingredient.ofItems(Items.EXPOSED_COPPER))
                .criterion(hasItem(Items.EXPOSED_COPPER),conditionsFromItem(Items.EXPOSED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.EXPOSED_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.EXPOSED_COPPER_STAIRS, Items.EXPOSED_COPPER);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.EXPOSED_COPPER_SLAB, Items.EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.EXPOSED_COPPER_SLAB, Items.EXPOSED_COPPER,2);

        createStairsRecipe(DecoBlocks.WEATHERED_COPPER_STAIRS, Ingredient.ofItems(Items.WEATHERED_COPPER))
                .criterion(hasItem(Items.WEATHERED_COPPER),conditionsFromItem(Items.WEATHERED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WEATHERED_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WEATHERED_COPPER_STAIRS, Items.WEATHERED_COPPER);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WEATHERED_COPPER_SLAB, Items.WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WEATHERED_COPPER_SLAB, Items.WEATHERED_COPPER,2);

        createStairsRecipe(DecoBlocks.OXIDIZED_COPPER_STAIRS, Ingredient.ofItems(Items.OXIDIZED_COPPER))
                .criterion(hasItem(Items.OXIDIZED_COPPER),conditionsFromItem(Items.OXIDIZED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.OXIDIZED_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OXIDIZED_COPPER_STAIRS, Items.OXIDIZED_COPPER);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OXIDIZED_COPPER_SLAB, Items.OXIDIZED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OXIDIZED_COPPER_SLAB, Items.OXIDIZED_COPPER,2);

        createStairsRecipe(DecoBlocks.WAXED_COPPER_STAIRS, Ingredient.ofItems(Items.WAXED_COPPER_BLOCK))
                .criterion(hasItem(Items.WAXED_COPPER_BLOCK),conditionsFromItem(Items.WAXED_COPPER_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WAXED_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_COPPER_STAIRS, Items.WAXED_COPPER_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_COPPER_SLAB, Items.WAXED_COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_COPPER_SLAB, Items.WAXED_COPPER_BLOCK,2);

        createStairsRecipe(DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS, Ingredient.ofItems(Items.WAXED_EXPOSED_COPPER))
                .criterion(hasItem(Items.WAXED_EXPOSED_COPPER),conditionsFromItem(Items.WAXED_EXPOSED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS, Items.WAXED_EXPOSED_COPPER);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_EXPOSED_COPPER_SLAB, Items.WAXED_EXPOSED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_EXPOSED_COPPER_SLAB, Items.WAXED_EXPOSED_COPPER,2);

        createStairsRecipe(DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS, Ingredient.ofItems(Items.WAXED_WEATHERED_COPPER))
                .criterion(hasItem(Items.WAXED_WEATHERED_COPPER),conditionsFromItem(Items.WAXED_WEATHERED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS, Items.WAXED_WEATHERED_COPPER);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_WEATHERED_COPPER_SLAB, Items.WAXED_WEATHERED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_WEATHERED_COPPER_SLAB, Items.WAXED_WEATHERED_COPPER,2);

        createStairsRecipe(DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS, Ingredient.ofItems(Items.WAXED_OXIDIZED_COPPER))
                .criterion(hasItem(Items.WAXED_OXIDIZED_COPPER),conditionsFromItem(Items.WAXED_OXIDIZED_COPPER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS, Items.WAXED_OXIDIZED_COPPER);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB, Items.WAXED_OXIDIZED_COPPER);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB, Items.WAXED_OXIDIZED_COPPER,2);

        createStairsRecipe(DecoBlocks.RAW_COPPER_STAIRS, Ingredient.ofItems(Items.RAW_COPPER_BLOCK))
                .criterion(hasItem(Items.RAW_COPPER_BLOCK),conditionsFromItem(Items.RAW_COPPER_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.RAW_COPPER_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_COPPER_STAIRS, Items.RAW_COPPER_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_COPPER_SLAB, Items.RAW_COPPER_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_COPPER_SLAB, Items.RAW_COPPER_BLOCK,2);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLESTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.STONE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.COBBLESTONE_STAIRS), conditionsFromItem(Items.COBBLESTONE_STAIRS))
                .offerTo(exporter, Identifier.of("stone_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLESTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.STONE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.COBBLESTONE_SLAB), conditionsFromItem(Items.COBBLESTONE_SLAB))
                .offerTo(exporter, Identifier.of("stone_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLESTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.STONE_WALL,
                        0.1f, 200).criterion(hasItem(Items.COBBLESTONE_WALL), conditionsFromItem(Items.COBBLESTONE_WALL))
                .offerTo(exporter, Identifier.of("stone_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.STONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_STONE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.STONE_STAIRS), conditionsFromItem(Items.STONE_STAIRS))
                .offerTo(exporter, Identifier.of("smooth_stone_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.STONE_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_STONE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.STONE_SLAB), conditionsFromItem(Items.STONE_SLAB))
                .offerTo(exporter, Identifier.of("smooth_stone_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.STONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_STONE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.STONE_WALL), conditionsFromItem(DecoBlocks.STONE_WALL))
                .offerTo(exporter, Identifier.of("smooth_stone_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLED_DEEPSLATE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEEPSLATE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.COBBLED_DEEPSLATE_STAIRS), conditionsFromItem(Items.COBBLED_DEEPSLATE_STAIRS))
                .offerTo(exporter, Identifier.of("deepslate_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLED_DEEPSLATE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEEPSLATE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.COBBLED_DEEPSLATE_SLAB), conditionsFromItem(Items.COBBLED_DEEPSLATE_SLAB))
                .offerTo(exporter, Identifier.of("deepslate_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLED_DEEPSLATE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.DEEPSLATE_WALL,
                        0.1f, 200).criterion(hasItem(Items.COBBLED_DEEPSLATE_WALL), conditionsFromItem(Items.COBBLED_DEEPSLATE_WALL))
                .offerTo(exporter, Identifier.of("deepslate_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.SANDSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_SANDSTONE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.SANDSTONE_STAIRS), conditionsFromItem(Items.SANDSTONE_STAIRS))
                .offerTo(exporter, Identifier.of("smooth_sandstone_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.SANDSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_SANDSTONE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.SANDSTONE_SLAB), conditionsFromItem(Items.SANDSTONE_SLAB))
                .offerTo(exporter, Identifier.of("smooth_sandstone_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.SANDSTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_SANDSTONE_WALL,
                        0.1f, 200).criterion(hasItem(Items.SANDSTONE_WALL), conditionsFromItem(Items.SANDSTONE_WALL))
                .offerTo(exporter, Identifier.of("smooth_sandstone_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_SANDSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_RED_SANDSTONE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.RED_SANDSTONE_STAIRS), conditionsFromItem(Items.RED_SANDSTONE_STAIRS))
                .offerTo(exporter, Identifier.of("smooth_red_sandstone_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_SANDSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_RED_SANDSTONE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.RED_SANDSTONE_SLAB), conditionsFromItem(Items.RED_SANDSTONE_SLAB))
                .offerTo(exporter, Identifier.of("smooth_red_sandstone_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_SANDSTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_RED_SANDSTONE_WALL,
                        0.1f, 200).criterion(hasItem(Items.RED_SANDSTONE_WALL), conditionsFromItem(Items.RED_SANDSTONE_WALL))
                .offerTo(exporter, Identifier.of("smooth_red_sandstone_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.QUARTZ_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_QUARTZ_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.QUARTZ_STAIRS), conditionsFromItem(Items.QUARTZ_STAIRS))
                .offerTo(exporter, Identifier.of("smooth_quartz_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.QUARTZ_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_QUARTZ_SLAB,
                        0.1f, 200).criterion(hasItem(Items.QUARTZ_SLAB), conditionsFromItem(Items.QUARTZ_SLAB))
                .offerTo(exporter, Identifier.of("smooth_quartz_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.QUARTZ_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_QUARTZ_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.QUARTZ_WALL), conditionsFromItem(DecoBlocks.QUARTZ_WALL))
                .offerTo(exporter, Identifier.of("smooth_quartz_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.SOUL_SOILSTONE_STAIRS), conditionsFromItem(DecoBlocks.SOUL_SOILSTONE_STAIRS))
                .offerTo(exporter, Identifier.of("smooth_soul_soilstone_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.SOUL_SOILSTONE_SLAB), conditionsFromItem(DecoBlocks.SOUL_SOILSTONE_SLAB))
                .offerTo(exporter, Identifier.of("smooth_soul_soilstone_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.SOUL_SOILSTONE_WALL), conditionsFromItem(DecoBlocks.SOUL_SOILSTONE_WALL))
                .offerTo(exporter, Identifier.of("smooth_soul_soilstone_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BLACKSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_BLACKSTONE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.BLACKSTONE_STAIRS), conditionsFromItem(Items.BLACKSTONE_STAIRS))
                .offerTo(exporter, Identifier.of("smooth_blackstone_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BLACKSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_BLACKSTONE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.BLACKSTONE_SLAB), conditionsFromItem(Items.BLACKSTONE_SLAB))
                .offerTo(exporter, Identifier.of("smooth_blackstone_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BLACKSTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_BLACKSTONE_WALL,
                        0.1f, 200).criterion(hasItem(Items.BLACKSTONE_WALL), conditionsFromItem(Items.BLACKSTONE_WALL))
                .offerTo(exporter, Identifier.of("smooth_blackstone_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.DEEPSLATE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_DEEPSLATE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.DEEPSLATE_STAIRS), conditionsFromItem(DecoBlocks.DEEPSLATE_STAIRS))
                .offerTo(exporter, Identifier.of("smooth_deepslate_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.DEEPSLATE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_DEEPSLATE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.DEEPSLATE_SLAB), conditionsFromItem(DecoBlocks.DEEPSLATE_SLAB))
                .offerTo(exporter, Identifier.of("smooth_deepslate_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.DEEPSLATE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_DEEPSLATE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.DEEPSLATE_WALL), conditionsFromItem(DecoBlocks.DEEPSLATE_WALL))
                .offerTo(exporter, Identifier.of("smooth_deepslate_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RAW_IRON_BLOCK), RecipeCategory.MISC, Items.IRON_BLOCK,
                        6.3f, 1800).criterion(hasItem(Items.RAW_IRON_BLOCK), conditionsFromItem(Items.RAW_IRON_BLOCK))
                .offerTo(exporter, Identifier.of("iron_block_from_smelting"));

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(Items.RAW_IRON_BLOCK), RecipeCategory.MISC, Items.IRON_BLOCK,
                        6.3f, 900).criterion(hasItem(Items.RAW_IRON_BLOCK), conditionsFromItem(Items.RAW_IRON_BLOCK))
                .offerTo(exporter, Identifier.of("iron_block_from_blasting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_IRON_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_IRON_STAIRS), conditionsFromItem(DecoBlocks.RAW_IRON_STAIRS))
                .offerTo(exporter, Identifier.of("iron_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_IRON_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_IRON_SLAB), conditionsFromItem(DecoBlocks.RAW_IRON_SLAB))
                .offerTo(exporter, Identifier.of("iron_slab_from_smelting"));

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_IRON_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_STAIRS,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_IRON_STAIRS), conditionsFromItem(DecoBlocks.RAW_IRON_STAIRS))
                .offerTo(exporter, Identifier.of("iron_stairs_from_blasting"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_IRON_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_SLAB,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_IRON_SLAB), conditionsFromItem(DecoBlocks.RAW_IRON_SLAB))
                .offerTo(exporter, Identifier.of("iron_slab_from_blasting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC, Items.GOLD_BLOCK,
                        6.3f, 1800).criterion(hasItem(Items.RAW_GOLD_BLOCK), conditionsFromItem(Items.RAW_GOLD_BLOCK))
                .offerTo(exporter, Identifier.of("gold_block_from_smelting"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC, Items.GOLD_BLOCK,
                        6.3f, 900).criterion(hasItem(Items.RAW_GOLD_BLOCK), conditionsFromItem(Items.RAW_GOLD_BLOCK))
                .offerTo(exporter, Identifier.of("gold_block_from_blasting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_GOLD_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_GOLD_STAIRS), conditionsFromItem(DecoBlocks.RAW_GOLD_STAIRS))
                .offerTo(exporter, Identifier.of("gold_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_GOLD_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_GOLD_SLAB), conditionsFromItem(DecoBlocks.RAW_GOLD_SLAB))
                .offerTo(exporter, Identifier.of("gold_slab_from_smelting"));

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_GOLD_STAIRS),  RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_STAIRS,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_GOLD_STAIRS), conditionsFromItem(DecoBlocks.RAW_GOLD_STAIRS))
                .offerTo(exporter, Identifier.of("gold_stairs_from_blasting"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_GOLD_SLAB),  RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_SLAB,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_GOLD_SLAB), conditionsFromItem(DecoBlocks.RAW_GOLD_SLAB))
                .offerTo(exporter, Identifier.of("gold_slab_from_blasting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC, Items.COPPER_BLOCK,
                        6.3f, 1800).criterion(hasItem(Items.RAW_COPPER_BLOCK), conditionsFromItem(Items.RAW_COPPER_BLOCK))
                .offerTo(exporter, Identifier.of("copper_block_from_smelting"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC, Items.COPPER_BLOCK,
                        6.3f, 900).criterion(hasItem(Items.RAW_COPPER_BLOCK), conditionsFromItem(Items.RAW_COPPER_BLOCK))
                .offerTo(exporter, Identifier.of("copper_block_from_blasting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_COPPER_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_COPPER_STAIRS), conditionsFromItem(DecoBlocks.RAW_COPPER_STAIRS))
                .offerTo(exporter, Identifier.of("copper_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_COPPER_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_COPPER_SLAB), conditionsFromItem(DecoBlocks.RAW_COPPER_SLAB))
                .offerTo(exporter, Identifier.of("copper_slab_from_smelting"));

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_COPPER_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_STAIRS,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_COPPER_STAIRS), conditionsFromItem(DecoBlocks.RAW_COPPER_STAIRS))
                .offerTo(exporter, Identifier.of("copper_stairs_from_blasting"));
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_COPPER_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_SLAB,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_COPPER_SLAB), conditionsFromItem(DecoBlocks.RAW_COPPER_SLAB))
                .offerTo(exporter, Identifier.of("copper_slab_from_blasting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.DEEPSLATE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.DEEPSLATE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(Items.DEEPSLATE),
                        RecipeProvider.conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DEEPSLATE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.COBBLED_DEEPSLATE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.COBBLED_DEEPSLATE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(Items.COBBLED_DEEPSLATE),
                        RecipeProvider.conditionsFromItem(Items.COBBLED_DEEPSLATE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.COBBLED_DEEPSLATE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_DEEPSLATE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.POLISHED_DEEPSLATE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(Items.POLISHED_DEEPSLATE),
                        RecipeProvider.conditionsFromItem(Items.POLISHED_DEEPSLATE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.POLISHED_DEEPSLATE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.STONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.STONE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(Items.STONE),
                        RecipeProvider.conditionsFromItem(Items.STONE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.STONE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_STONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.POLISHED_STONE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(DecoBlocks.POLISHED_STONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.POLISHED_STONE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.POLISHED_STONE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.BLACKSTONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.BLACKSTONE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(Items.BLACKSTONE),
                        RecipeProvider.conditionsFromItem(Items.BLACKSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.BLACKSTONE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_BLACKSTONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.POLISHED_BLACKSTONE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(Items.POLISHED_BLACKSTONE),
                        RecipeProvider.conditionsFromItem(Items.POLISHED_BLACKSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.POLISHED_BLACKSTONE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.HEAVY_GOLD_BARS)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.GOLD_BARS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.GOLD_BARS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.GOLD_BARS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.HEAVY_GOLD_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.GOLD_INGOT)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.GOLD_BARS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.LIGHT_GOLD_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.GOLD_NUGGET)
                .criterion(RecipeProvider.hasItem(Items.GOLD_NUGGET),
                        RecipeProvider.conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.LIGHT_GOLD_BARS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN)
                .input(ItemTags.SAND)
                .input(Items.OBSIDIAN)
                .criterion(RecipeProvider.hasItem(Items.OBSIDIAN),
                        RecipeProvider.conditionsFromItem(Items.OBSIDIAN))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SANDED_OBSIDIAN)));

        createStairsRecipe(DecoBlocks.SANDED_OBSIDIAN_STAIRS, Ingredient.ofItems(DecoBlocks.SANDED_OBSIDIAN))
                .criterion(hasItem(DecoBlocks.SANDED_OBSIDIAN),conditionsFromItem(DecoBlocks.SANDED_OBSIDIAN))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SANDED_OBSIDIAN_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_STAIRS, DecoBlocks.SANDED_OBSIDIAN);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_SLAB, DecoBlocks.SANDED_OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_SLAB, DecoBlocks.SANDED_OBSIDIAN,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.SANDED_OBSIDIAN_WALL, DecoBlocks.SANDED_OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_WALL, DecoBlocks.SANDED_OBSIDIAN);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.OBSIDIAN), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN,
                        0.1f, 200).criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SMOOTH_OBSIDIAN)));

        createStairsRecipe(DecoBlocks.SMOOTH_OBSIDIAN_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_OBSIDIAN))
                .criterion(hasItem(DecoBlocks.SMOOTH_OBSIDIAN),conditionsFromItem(DecoBlocks.SMOOTH_OBSIDIAN))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SMOOTH_OBSIDIAN_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_STAIRS, DecoBlocks.SMOOTH_OBSIDIAN);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.OBSIDIAN_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.OBSIDIAN_STAIRS), conditionsFromItem(DecoBlocks.OBSIDIAN_STAIRS))
                .offerTo(exporter, Identifier.of("smooth_obsidian_stairs_from_smelting"));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_SLAB, DecoBlocks.SMOOTH_OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_SLAB, DecoBlocks.SMOOTH_OBSIDIAN,2);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.OBSIDIAN_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.OBSIDIAN_SLAB), conditionsFromItem(DecoBlocks.OBSIDIAN_SLAB))
                .offerTo(exporter, Identifier.of("smooth_obsidian_slab_from_smelting"));

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_OBSIDIAN_WALL, DecoBlocks.SMOOTH_OBSIDIAN);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_WALL, DecoBlocks.SMOOTH_OBSIDIAN);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.OBSIDIAN_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_OBSIDIAN_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.OBSIDIAN_WALL), conditionsFromItem(DecoBlocks.OBSIDIAN_WALL))
                .offerTo(exporter, Identifier.of("smooth_obsidian_wall_from_smelting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN,4)
                .pattern("#O")
                .pattern("O#")
                .input('#', DecoBlocks.SANDED_OBSIDIAN)
                .input('O', Items.OBSIDIAN)
                .criterion(RecipeProvider.hasItem(DecoBlocks.SANDED_OBSIDIAN),
                        RecipeProvider.conditionsFromItem(DecoBlocks.SANDED_OBSIDIAN))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CUT_OBSIDIAN)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN, DecoBlocks.SANDED_OBSIDIAN);

        createStairsRecipe(DecoBlocks.CUT_OBSIDIAN_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_OBSIDIAN))
                .criterion(hasItem(DecoBlocks.CUT_OBSIDIAN),conditionsFromItem(DecoBlocks.CUT_OBSIDIAN))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CUT_OBSIDIAN_STAIRS)));
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
                .offerTo(exporter, Identifier.of("yellow_dye_from_buttercup"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIME_DYE)
                .input(DecoBlocks.NIGHTSHADE)
                .group("lime_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.NIGHTSHADE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.NIGHTSHADE))
                .offerTo(exporter, Identifier.of("lime_dye_from_bromeliad"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLACK_DYE)
                .input(DecoBlocks.ENDERSHADE)
                .group("black_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.ENDERSHADE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.ENDERSHADE))
                .offerTo(exporter, Identifier.of("black_dye_from_endershade"));

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE, DecoBlocks.POLISHED_END_STONE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE, Items.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE, DecoBlocks.POLISHED_END_STONE);


        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE, Items.END_STONE);


        createStairsRecipe(DecoBlocks.POLISHED_END_STONE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_END_STONE))
                .criterion(hasItem(DecoBlocks.POLISHED_END_STONE),conditionsFromItem(DecoBlocks.POLISHED_END_STONE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.POLISHED_END_STONE_STAIRS)));
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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_END_STONE_BRICKS)));


        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, Items.END_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, Items.END_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, Items.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, DecoBlocks.POLISHED_END_STONE);


        createStairsRecipe(DecoBlocks.END_STONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.END_STONE_TILES))
                .criterion(hasItem(DecoBlocks.END_STONE_TILES),conditionsFromItem(DecoBlocks.END_STONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.END_STONE_TILE_STAIRS)));
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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_END_STONE_TILES)));


        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.END_STONE), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE,
                        0.1f, 200).criterion(hasItem(Items.END_STONE), conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SMOOTH_END_STONE)));


        createStairsRecipe(DecoBlocks.SMOOTH_END_STONE_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_END_STONE))
                .criterion(hasItem(DecoBlocks.SMOOTH_END_STONE),conditionsFromItem(DecoBlocks.SMOOTH_END_STONE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SMOOTH_END_STONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_STAIRS, DecoBlocks.SMOOTH_END_STONE);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_STAIRS), conditionsFromItem(DecoBlocks.END_STONE_STAIRS))
                .offerTo(exporter, Identifier.of("smooth_end_stone_stairs_from_smelting"));


        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_SLAB, DecoBlocks.SMOOTH_END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_SLAB, DecoBlocks.SMOOTH_END_STONE,2);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_SLAB), conditionsFromItem(DecoBlocks.END_STONE_SLAB))
                .offerTo(exporter, Identifier.of("smooth_end_stone_slab_from_smelting"));


        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_END_STONE_WALL, DecoBlocks.SMOOTH_END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_WALL, DecoBlocks.SMOOTH_END_STONE);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_END_STONE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_WALL), conditionsFromItem(DecoBlocks.END_STONE_WALL))
                .offerTo(exporter, Identifier.of("smooth_endstone_wall_from_smelting"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.END_STONE_BUTTON)
                .input(Items.END_STONE)
                .criterion(RecipeProvider.hasItem(Items.END_STONE),
                        RecipeProvider.conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.END_STONE_BUTTON)));
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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.POLISHED_END_STONE_BUTTON)));
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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.END_STONE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_END_STONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.POLISHED_END_STONE)
                .group("lever")
                .criterion(RecipeProvider.hasItem(DecoBlocks.POLISHED_END_STONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.POLISHED_END_STONE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.POLISHED_END_STONE_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_BLAST_FURNACE)
                .pattern("III")
                .pattern("IXI")
                .pattern("###")
                .input('I', Items.IRON_INGOT)
                .input('X', DecoBlocks.END_STONE_FURNACE)
                .input('#', DecoBlocks.SMOOTH_END_STONE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.SMOOTH_END_STONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.SMOOTH_END_STONE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.END_STONE_BLAST_FURNACE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_SMOKER)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', ItemTags.LOGS)
                .input('X', DecoBlocks.END_STONE_FURNACE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.END_STONE_FURNACE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.END_STONE_FURNACE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.END_STONE_SMOKER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_STONECUTTER)
                .pattern(" I ")
                .pattern("###")
                .input('I', Items.IRON_INGOT)
                .input('#', Items.END_STONE)
                .criterion(RecipeProvider.hasItem(Items.END_STONE),
                        RecipeProvider.conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.END_STONE_STONECUTTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_GRINDSTONE)
                .pattern("I-I")
                .pattern("# #")
                .input('I', Items.STICK)
                .input('-', DecoBlocks.END_STONE_SLAB)
                .input('#', ItemTags.PLANKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.END_STONE_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.END_STONE_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.END_STONE_GRINDSTONE)));

        createStairsRecipe(DecoBlocks.CHERRY_WOOD_STAIRS, Ingredient.ofItems(Items.CHERRY_WOOD))
                .criterion(hasItem(Items.CHERRY_WOOD),conditionsFromItem(Items.CHERRY_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHERRY_WOOD_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHERRY_WOOD_SLAB, Items.CHERRY_WOOD);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.CHERRY_WOOD_WALL, Items.CHERRY_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_CHERRY_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Items.STRIPPED_CHERRY_WOOD),conditionsFromItem(Items.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.STRIPPED_CHERRY_WOOD_STAIRS)));

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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHERRY_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.CHERRY_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.CHERRY_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.CHERRY_SLAB),
                        RecipeProvider.conditionsFromItem(Items.CHERRY_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHERRY_PALLET_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.BAMBOO_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.BAMBOO_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(Items.BAMBOO_SLAB),
                        RecipeProvider.conditionsFromItem(Items.BAMBOO_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.BAMBOO_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.BAMBOO_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.BAMBOO_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(Items.BAMBOO_SLAB),
                        RecipeProvider.conditionsFromItem(Items.BAMBOO_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.BAMBOO_PALLET_TRAPDOOR)));

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MUSHROOM_MOSAIC, DecoBlocks.MUSHROOM_SLAB);

        createStairsRecipe(DecoBlocks.MUSHROOM_MOSAIC_STAIRS, Ingredient.ofItems(DecoBlocks.MUSHROOM_MOSAIC))
                .criterion(hasItem(DecoBlocks.MUSHROOM_MOSAIC),conditionsFromItem(DecoBlocks.MUSHROOM_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MUSHROOM_MOSAIC_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MUSHROOM_MOSAIC_SLAB, DecoBlocks.MUSHROOM_MOSAIC);

        createSignRecipe(DecoItems.STRIPPED_CACTUS_SIGN, Ingredient.ofItems(DecoBlocks.STRIPPED_CACTUS))
                .criterion(hasItem(DecoBlocks.STRIPPED_CACTUS),conditionsFromItem(DecoBlocks.STRIPPED_CACTUS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.STRIPPED_CACTUS_SIGN)));
        createSignRecipe(DecoItems.MUSHROOM_STEM_SIGN, Ingredient.ofItems(Blocks.MUSHROOM_STEM))
                .criterion(hasItem(Blocks.MUSHROOM_STEM),conditionsFromItem(Blocks.MUSHROOM_STEM))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.MUSHROOM_STEM_SIGN)));
        createSignRecipe(DecoItems.MUSHROOM_MOSAIC_SIGN, Ingredient.ofItems(DecoBlocks.MUSHROOM_MOSAIC))
                .criterion(hasItem(DecoBlocks.MUSHROOM_MOSAIC),conditionsFromItem(DecoBlocks.MUSHROOM_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.MUSHROOM_MOSAIC_SIGN)));

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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.OAK_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.OAK_CHEST_RAFT, DecoItems.OAK_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.BIRCH_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.BIRCH_PLANKS)
                .input('-', Items.BIRCH_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.BIRCH_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.BIRCH_CHEST_RAFT, DecoItems.BIRCH_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.SPRUCE_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.SPRUCE_PLANKS)
                .input('-', Items.SPRUCE_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.SPRUCE_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.SPRUCE_CHEST_RAFT, DecoItems.SPRUCE_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.JUNGLE_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.JUNGLE_PLANKS)
                .input('-', Items.JUNGLE_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.JUNGLE_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.JUNGLE_CHEST_RAFT, DecoItems.JUNGLE_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.ACACIA_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.ACACIA_PLANKS)
                .input('-', Items.ACACIA_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.ACACIA_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.ACACIA_CHEST_RAFT, DecoItems.ACACIA_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.DARK_OAK_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.DARK_OAK_PLANKS)
                .input('-', Items.DARK_OAK_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.DARK_OAK_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.DARK_OAK_CHEST_RAFT, DecoItems.DARK_OAK_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.MANGROVE_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.MANGROVE_PLANKS)
                .input('-', Items.MANGROVE_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.MANGROVE_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.MANGROVE_CHEST_RAFT, DecoItems.MANGROVE_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.CHERRY_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.CHERRY_PLANKS)
                .input('-', Items.CHERRY_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.CHERRY_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.CHERRY_CHEST_RAFT, DecoItems.CHERRY_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.CRIMSON_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.CRIMSON_PLANKS)
                .input('-', Items.CRIMSON_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.CRIMSON_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.CRIMSON_CHEST_RAFT, DecoItems.CRIMSON_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.WARPED_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.WARPED_PLANKS)
                .input('-', Items.WARPED_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.WARPED_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.WARPED_CHEST_RAFT, DecoItems.WARPED_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.CACTUS_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .input('-', DecoBlocks.CACTUS_PLANK_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.CACTUS_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.CACTUS_CHEST_RAFT, DecoItems.CACTUS_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.MUSHROOM_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .input('-', DecoBlocks.MUSHROOM_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.MUSHROOM_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.MUSHROOM_CHEST_RAFT, DecoItems.MUSHROOM_RAFT);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.WOODEN_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .input('-', DecoBlocks.WOODEN_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.WOODEN_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.WOODEN_CHEST_RAFT, DecoItems.WOODEN_RAFT);

        offerBoatRecipe(exporter, DecoItems.BAMBOO_BOAT, Blocks.BAMBOO_PLANKS);
        offerChestBoatRecipe(exporter, DecoItems.BAMBOO_CHEST_BOAT, DecoItems.BAMBOO_BOAT);

        createStairsRecipe(DecoBlocks.OAK_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.OAK_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.OAK_BOOKSHELF),conditionsFromItem(DecoBlocks.OAK_BOOKSHELF))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.OAK_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OAK_BOOKSHELF_SLAB, DecoBlocks.OAK_BOOKSHELF);

        createStairsRecipe(DecoBlocks.SPRUCE_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.SPRUCE_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.SPRUCE_BOOKSHELF),conditionsFromItem(DecoBlocks.SPRUCE_BOOKSHELF))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SPRUCE_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SPRUCE_BOOKSHELF_SLAB, DecoBlocks.SPRUCE_BOOKSHELF);

        createStairsRecipe(DecoBlocks.BIRCH_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.BIRCH_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.BIRCH_BOOKSHELF),conditionsFromItem(DecoBlocks.BIRCH_BOOKSHELF))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.BIRCH_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BIRCH_BOOKSHELF_SLAB, DecoBlocks.BIRCH_BOOKSHELF);

        createStairsRecipe(DecoBlocks.JUNGLE_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.JUNGLE_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.JUNGLE_BOOKSHELF),conditionsFromItem(DecoBlocks.JUNGLE_BOOKSHELF))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.JUNGLE_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.JUNGLE_BOOKSHELF_SLAB, DecoBlocks.JUNGLE_BOOKSHELF);

        createStairsRecipe(DecoBlocks.ACACIA_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.ACACIA_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.ACACIA_BOOKSHELF),conditionsFromItem(DecoBlocks.ACACIA_BOOKSHELF))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.ACACIA_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ACACIA_BOOKSHELF_SLAB, DecoBlocks.ACACIA_BOOKSHELF);

        createStairsRecipe(DecoBlocks.DARK_OAK_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.DARK_OAK_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.DARK_OAK_BOOKSHELF),conditionsFromItem(DecoBlocks.DARK_OAK_BOOKSHELF))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DARK_OAK_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DARK_OAK_BOOKSHELF_SLAB, DecoBlocks.DARK_OAK_BOOKSHELF);

        createStairsRecipe(DecoBlocks.MANGROVE_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.MANGROVE_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.MANGROVE_BOOKSHELF),conditionsFromItem(DecoBlocks.MANGROVE_BOOKSHELF))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MANGROVE_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MANGROVE_BOOKSHELF_SLAB, DecoBlocks.MANGROVE_BOOKSHELF);

        createStairsRecipe(DecoBlocks.CHERRY_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.CHERRY_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.CHERRY_BOOKSHELF),conditionsFromItem(DecoBlocks.CHERRY_BOOKSHELF))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHERRY_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHERRY_BOOKSHELF_SLAB, DecoBlocks.CHERRY_BOOKSHELF);

        createStairsRecipe(DecoBlocks.BAMBOO_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.BAMBOO_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.BAMBOO_BOOKSHELF),conditionsFromItem(DecoBlocks.BAMBOO_BOOKSHELF))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.BAMBOO_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BAMBOO_BOOKSHELF_SLAB, DecoBlocks.BAMBOO_BOOKSHELF);

        createStairsRecipe(DecoBlocks.CRIMSON_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.CRIMSON_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.CRIMSON_BOOKSHELF),conditionsFromItem(DecoBlocks.CRIMSON_BOOKSHELF))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRIMSON_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRIMSON_BOOKSHELF_SLAB, DecoBlocks.CRIMSON_BOOKSHELF);

        createStairsRecipe(DecoBlocks.WARPED_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.WARPED_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.WARPED_BOOKSHELF),conditionsFromItem(DecoBlocks.WARPED_BOOKSHELF))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WARPED_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WARPED_BOOKSHELF_SLAB, DecoBlocks.WARPED_BOOKSHELF);

        createStairsRecipe(DecoBlocks.CACTUS_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.CACTUS_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.CACTUS_BOOKSHELF),conditionsFromItem(DecoBlocks.CACTUS_BOOKSHELF))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CACTUS_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_BOOKSHELF_SLAB, DecoBlocks.CACTUS_BOOKSHELF);

        createStairsRecipe(DecoBlocks.MUSHROOM_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.MUSHROOM_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.MUSHROOM_BOOKSHELF),conditionsFromItem(DecoBlocks.MUSHROOM_BOOKSHELF))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MUSHROOM_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_BOOKSHELF_SLAB, DecoBlocks.MUSHROOM_BOOKSHELF);

        createStairsRecipe(DecoBlocks.WOODEN_BOOKSHELF_STAIRS, Ingredient.ofItems(Items.BOOKSHELF))
                .criterion(hasItem(Items.BOOKSHELF),conditionsFromItem(Items.BOOKSHELF))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WOODEN_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WOODEN_BOOKSHELF_SLAB, Items.BOOKSHELF);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_MUSHROOM_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.IRON_CAP_MUSHROOM)
                .group("giant_mushroom_blocks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_MUSHROOM),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_MUSHROOM))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK)));

        createStairsRecipe(DecoBlocks.IRON_CAP_STAIRS, Ingredient.ofItems(DecoBlocks.IRON_CAP_PLANKS))
                .group("wooden_stairs")
                .criterion(hasItem(DecoBlocks.IRON_CAP_PLANKS),conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_SLAB,6)
                .pattern("###")
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_slab")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.IRON_CAP_FENCE,3)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_fence")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_fence_gate")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_PRESSURE_PLATE)
                .pattern("##")
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_pressure_plate")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_PRESSURE_PLATE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_BUTTON)
                .input(DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_button")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_door")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_trapdoor")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_HYPHAE,4)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.IRON_CAP_STEM)
                .group("bark")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_STEM),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_STEM))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_HYPHAE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STRIPPED_IRON_CAP_HYPHAE,4)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.STRIPPED_IRON_CAP_STEM)
                .group("bark")
                .criterion(RecipeProvider.hasItem(DecoBlocks.STRIPPED_IRON_CAP_STEM),
                        RecipeProvider.conditionsFromItem(DecoBlocks.STRIPPED_IRON_CAP_STEM))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_PLANKS,4)
                .input(DecoTags.Items.IRON_CAP_STEM)
                .criterion("has_logs", conditionsFromTag(DecoTags.Items.IRON_CAP_STEM))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_PLANKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_PLANKS,8)
                .input(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK)
                .group("planks")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK))
                .offerTo(exporter, Identifier.of("iron_cap_planks_form_mushroom_block"));

        createStairsRecipe(DecoBlocks.IRON_CAP_HYPHAE_STAIRS, Ingredient.ofItems(DecoBlocks.IRON_CAP_HYPHAE))
                .criterion(hasItem(DecoBlocks.IRON_CAP_HYPHAE),conditionsFromItem(DecoBlocks.IRON_CAP_HYPHAE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_HYPHAE_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_CAP_HYPHAE_SLAB, DecoBlocks.IRON_CAP_HYPHAE);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.IRON_CAP_HYPHAE_WALL, DecoBlocks.IRON_CAP_HYPHAE);

        createStairsRecipe(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_STAIRS, Ingredient.ofItems(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE))
                .criterion(hasItem(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE),conditionsFromItem(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_STAIRS)));

        offerSlabRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_SLAB, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE);

        offerWallRecipe(exporter,RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_WALL, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_CAP_MOSAIC, DecoBlocks.IRON_CAP_SLAB);

        createStairsRecipe(DecoBlocks.IRON_CAP_MOSAIC_STAIRS, Ingredient.ofItems(DecoBlocks.IRON_CAP_MOSAIC))
                .criterion(hasItem(DecoBlocks.IRON_CAP_MOSAIC),conditionsFromItem(DecoBlocks.IRON_CAP_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_MOSAIC_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_CAP_MOSAIC_SLAB, DecoBlocks.IRON_CAP_MOSAIC);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SPORE_IRON_ORE), RecipeCategory.MISC, Items.IRON_INGOT,
                        0.7f, 200).criterion(hasItem(DecoBlocks.SPORE_IRON_ORE), conditionsFromItem(DecoBlocks.SPORE_IRON_ORE))
                .offerTo(exporter, Identifier.of("iron_ingot_from_smelting_spore_ore"));

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.SPORE_IRON_ORE), RecipeCategory.MISC, Items.IRON_INGOT,
                        0.7f, 100).criterion(hasItem(DecoBlocks.SPORE_IRON_ORE), conditionsFromItem(DecoBlocks.SPORE_IRON_ORE))
                .offerTo(exporter, Identifier.of("iron_ingot_from_blasting_spore_ore"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.IRON_CAP_SLAB)
                .group("pallet_doors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_PALLET_DOOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.IRON_CAP_SLAB)
                .group("pallet_trapdoors")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRON_CAP_SLAB),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRON_CAP_SLAB))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_PALLET_TRAPDOOR)));

        offerCraftingTableVariantRecipe(exporter, DecoBlocks.IRON_CAP_CRAFTING_TABLE, DecoBlocks.IRON_CAP_PLANKS);
        offerBarrelVariantRecipe(exporter, DecoBlocks.IRON_CAP_BARREL, DecoBlocks.IRON_CAP_PLANKS);
        offerCartographyTableVariantRecipe(exporter, DecoBlocks.IRON_CAP_CARTOGRAPHY_TABLE, DecoBlocks.IRON_CAP_PLANKS);
        offerSmithingTableVariantRecipe(exporter, DecoBlocks.IRON_CAP_SMITHING_TABLE, DecoBlocks.IRON_CAP_PLANKS);
        offerLadderVariantRecipe(exporter, DecoBlocks.IRON_CAP_LADDER, DecoBlocks.IRON_CAP_SLAB);

        offerNoteBlockVariantRecipe(exporter, DecoBlocks.IRON_CAP_NOTE_BLOCK, DecoBlocks.IRON_CAP_PLANKS);

        offerBookshelvesVariantRecipe(exporter, DecoBlocks.IRON_CAP_BOOKSHELF, DecoBlocks.IRON_CAP_PLANKS);

        createStairsRecipe(DecoBlocks.IRON_CAP_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.IRON_CAP_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.IRON_CAP_BOOKSHELF),conditionsFromItem(DecoBlocks.IRON_CAP_BOOKSHELF))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_CAP_BOOKSHELF_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_BOOKSHELF_SLAB, DecoBlocks.IRON_CAP_BOOKSHELF);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TRANSPORTATION, DecoItems.IRON_CAP_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .input('-', DecoBlocks.IRON_CAP_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.IRON_CAP_RAFT)));
        offerChestBoatRecipe(exporter, DecoItems.IRON_CAP_CHEST_RAFT, DecoItems.IRON_CAP_RAFT);

        offerBoatRecipe(exporter, DecoItems.IRON_CAP_BOAT, DecoBlocks.IRON_CAP_PLANKS);
        offerChestBoatRecipe(exporter, DecoItems.IRON_CAP_CHEST_BOAT, DecoItems.IRON_CAP_BOAT);

        createSignRecipe(DecoItems.IRON_CAP_SIGN, Ingredient.ofItems(DecoBlocks.IRON_CAP_PLANKS))
                .criterion(hasItem(DecoBlocks.IRON_CAP_PLANKS),conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.IRON_CAP_SIGN)));
        createSignRecipe(DecoItems.STRIPPED_IRON_CAP_SIGN, Ingredient.ofItems(DecoBlocks.STRIPPED_IRON_CAP_STEM))
                .criterion(hasItem(DecoBlocks.STRIPPED_IRON_CAP_STEM),conditionsFromItem(DecoBlocks.STRIPPED_IRON_CAP_STEM))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.STRIPPED_IRON_CAP_SIGN)));
        createSignRecipe(DecoItems.IRON_CAP_MOSAIC_SIGN, Ingredient.ofItems(DecoBlocks.IRON_CAP_MOSAIC))
                .criterion(hasItem(DecoBlocks.IRON_CAP_MOSAIC),conditionsFromItem(DecoBlocks.IRON_CAP_MOSAIC))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.IRON_CAP_MOSAIC_SIGN)));

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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.PACKED_GRASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_PODZOL)
                .pattern("##")
                .pattern("##")
                .input('#', Items.PODZOL)
                .group("packed_soil")
                .criterion(RecipeProvider.hasItem(Items.PODZOL),
                        RecipeProvider.conditionsFromItem(Items.PODZOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.PACKED_PODZOL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_MYCELIUM)
                .pattern("##")
                .pattern("##")
                .input('#', Items.MYCELIUM)
                .group("packed_soil")
                .criterion(RecipeProvider.hasItem(Items.MYCELIUM),
                        RecipeProvider.conditionsFromItem(Items.MYCELIUM))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.PACKED_MYCELIUM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_CRIMSON_NYLIUM)
                .pattern("##")
                .pattern("##")
                .input('#', Items.CRIMSON_NYLIUM)
                .group("packed_nylium")
                .criterion(RecipeProvider.hasItem(Items.CRIMSON_NYLIUM),
                        RecipeProvider.conditionsFromItem(Items.CRIMSON_NYLIUM))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.PACKED_CRIMSON_NYLIUM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_WARPED_NYLIUM)
                .pattern("##")
                .pattern("##")
                .input('#', Items.WARPED_NYLIUM)
                .group("packed_nylium")
                .criterion(RecipeProvider.hasItem(Items.WARPED_NYLIUM),
                        RecipeProvider.conditionsFromItem(Items.WARPED_NYLIUM))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.PACKED_WARPED_NYLIUM)));

        offerCarpetRecipe(exporter, DecoBlocks.GRASS_CARPET, DecoBlocks.PACKED_GRASS);
        offerCarpetRecipe(exporter, DecoBlocks.PODZOL_CARPET, DecoBlocks.PACKED_PODZOL);
        offerCarpetRecipe(exporter, DecoBlocks.MYCELIUM_CARPET, DecoBlocks.PACKED_MYCELIUM);
        offerCarpetRecipe(exporter, DecoBlocks.CRIMSON_NYLIUM_CARPET, DecoBlocks.PACKED_CRIMSON_NYLIUM);
        offerCarpetRecipe(exporter, DecoBlocks.WARPED_NYLIUM_CARPET, DecoBlocks.PACKED_WARPED_NYLIUM);

        createStairsRecipe(DecoBlocks.GRASS_STAIRS, Ingredient.ofItems(DecoBlocks.PACKED_GRASS))
                .criterion(hasItem(DecoBlocks.PACKED_GRASS),conditionsFromItem(DecoBlocks.PACKED_GRASS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.GRASS_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRASS_SLAB, DecoBlocks.PACKED_GRASS);

        createStairsRecipe(DecoBlocks.PODZOL_STAIRS, Ingredient.ofItems(DecoBlocks.PACKED_PODZOL))
                .criterion(hasItem(DecoBlocks.PACKED_PODZOL),conditionsFromItem(DecoBlocks.PACKED_PODZOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.PODZOL_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PODZOL_SLAB, DecoBlocks.PACKED_PODZOL);

        createStairsRecipe(DecoBlocks.MYCELIUM_STAIRS, Ingredient.ofItems(DecoBlocks.PACKED_MYCELIUM))
                .criterion(hasItem(DecoBlocks.PACKED_MYCELIUM),conditionsFromItem(DecoBlocks.PACKED_MYCELIUM))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MYCELIUM_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MYCELIUM_SLAB, DecoBlocks.PACKED_MYCELIUM);

        createStairsRecipe(DecoBlocks.CRIMSON_NYLIUM_STAIRS, Ingredient.ofItems(DecoBlocks.PACKED_CRIMSON_NYLIUM))
                .criterion(hasItem(DecoBlocks.PACKED_CRIMSON_NYLIUM),conditionsFromItem(DecoBlocks.PACKED_CRIMSON_NYLIUM))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRIMSON_NYLIUM_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRIMSON_NYLIUM_SLAB, DecoBlocks.PACKED_CRIMSON_NYLIUM);

        createStairsRecipe(DecoBlocks.WARPED_NYLIUM_STAIRS, Ingredient.ofItems(DecoBlocks.PACKED_WARPED_NYLIUM))
                .criterion(hasItem(DecoBlocks.PACKED_WARPED_NYLIUM),conditionsFromItem(DecoBlocks.PACKED_WARPED_NYLIUM))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WARPED_NYLIUM_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WARPED_NYLIUM_SLAB, DecoBlocks.PACKED_WARPED_NYLIUM);

        createStairsRecipe(DecoBlocks.MOSS_STAIRS, Ingredient.ofItems(Items.MOSS_BLOCK))
                .criterion(hasItem(Items.MOSS_BLOCK),conditionsFromItem(Items.MOSS_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MOSS_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSS_SLAB, Items.MOSS_BLOCK);

        createStairsRecipe(DecoBlocks.DIRT_STAIRS, Ingredient.ofItems(Items.DIRT))
                .criterion(hasItem(Items.DIRT),conditionsFromItem(Items.DIRT))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DIRT_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIRT_SLAB, Items.DIRT);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DIRT_WALL, Items.DIRT);

        createStairsRecipe(DecoBlocks.COARSE_DIRT_STAIRS, Ingredient.ofItems(Items.COARSE_DIRT))
                .criterion(hasItem(Items.COARSE_DIRT),conditionsFromItem(Items.COARSE_DIRT))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.COARSE_DIRT_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COARSE_DIRT_SLAB, Items.COARSE_DIRT);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.COARSE_DIRT_WALL, Items.COARSE_DIRT);

        createStairsRecipe(DecoBlocks.ROOTED_DIRT_STAIRS, Ingredient.ofItems(Items.ROOTED_DIRT))
                .criterion(hasItem(Items.ROOTED_DIRT),conditionsFromItem(Items.ROOTED_DIRT))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.ROOTED_DIRT_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ROOTED_DIRT_SLAB, Items.ROOTED_DIRT);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.ROOTED_DIRT_WALL, Items.ROOTED_DIRT);

        createStairsRecipe(DecoBlocks.MUD_STAIRS, Ingredient.ofItems(Items.MUD))
                .criterion(hasItem(Items.MUD),conditionsFromItem(Items.MUD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MUD_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MUD_SLAB, Items.MUD);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.MUD_WALL, Items.MUD);

        createStairsRecipe(DecoBlocks.CLAY_STAIRS, Ingredient.ofItems(Items.CLAY))
                .criterion(hasItem(Items.CLAY),conditionsFromItem(Items.CLAY))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CLAY_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CLAY_SLAB, Items.CLAY);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CLAY_WALL, Items.CLAY);

        createStairsRecipe(DecoBlocks.BONE_STAIRS, Ingredient.ofItems(Items.BONE_BLOCK))
                .criterion(hasItem(Items.BONE_BLOCK),conditionsFromItem(Items.BONE_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.BONE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BONE_STAIRS, Items.BONE_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BONE_SLAB, Items.BONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BONE_SLAB, Items.BONE_BLOCK,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.BONE_WALL, Items.BONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BONE_WALL, Items.BONE_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.ROOTED_DIRT,2)
                .pattern("#M")
                .pattern("M#")
                .input('#', Items.DIRT)
                .input('M', Items.HANGING_ROOTS)
                .criterion(RecipeProvider.hasItem(Items.DIRT),
                        RecipeProvider.conditionsFromItem(Items.DIRT))
                .offerTo(exporter, Identifier.of(getRecipeName(Items.ROOTED_DIRT)));

        createStairsRecipe(DecoBlocks.CLOUD_STAIRS, Ingredient.ofItems(DecoBlocks.SOLID_CLOUD))
                .criterion(hasItem(DecoBlocks.SOLID_CLOUD),conditionsFromItem(DecoBlocks.SOLID_CLOUD))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CLOUD_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CLOUD_SLAB, DecoBlocks.SOLID_CLOUD);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_WALL, DecoBlocks.SOLID_CLOUD);

        createStairsRecipe(DecoBlocks.CLOUD_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CLOUD_BRICKS))
                .criterion(hasItem(DecoBlocks.CLOUD_BRICKS),conditionsFromItem(DecoBlocks.CLOUD_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CLOUD_BRICK_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CLOUD_BRICK_SLAB, DecoBlocks.CLOUD_BRICKS);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CLOUD_BRICK_WALL, DecoBlocks.CLOUD_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_CLOUD_BRICKS, DecoBlocks.CLOUD_BRICK_SLAB);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SOLID_CLOUD)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.CLOUD_BLOCK)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CLOUD_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CLOUD_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SOLID_CLOUD)));

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
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_LADDER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.GOLDEN_LADDER,3)
                .input('#', Items.GOLD_NUGGET)
                .input('I', Items.GOLD_INGOT)
                .pattern("# #")
                .pattern("#I#")
                .pattern("# #")
                .group("metal_ladder")
                .criterion(RecipeProvider.hasItem(Items.GOLD_NUGGET),
                        RecipeProvider.conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.GOLDEN_LADDER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.COPPER_LADDER,3)
                .input('#', DecoItems.COPPER_NUGGET)
                .input('I', Items.COPPER_INGOT)
                .pattern("# #")
                .pattern("#I#")
                .pattern("# #")
                .group("metal_ladder")
                .criterion(RecipeProvider.hasItem(DecoItems.COPPER_NUGGET),
                        RecipeProvider.conditionsFromItem(DecoItems.COPPER_NUGGET))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.COPPER_LADDER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.WHITE_DYE)
                .input(DecoBlocks.ALPINE_POPPY)
                .group("white_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.ALPINE_POPPY),
                        RecipeProvider.conditionsFromItem(DecoBlocks.ALPINE_POPPY))
                .offerTo(exporter, Identifier.of("white_dye_from_alpine_poppy"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GRAY_DYE)
                .input(DecoBlocks.DEAD_EYE_DAISY)
                .group("gray_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.DEAD_EYE_DAISY),
                        RecipeProvider.conditionsFromItem(DecoBlocks.DEAD_EYE_DAISY))
                .offerTo(exporter, Identifier.of("gray_dye_from_dead_eye_daisy"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.ORANGE_DYE)
                .input(DecoBlocks.POPPED_BLUET)
                .group("orange_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.POPPED_BLUET),
                        RecipeProvider.conditionsFromItem(DecoBlocks.POPPED_BLUET))
                .offerTo(exporter, Identifier.of("orange_dye_from_popped_bluet"));

        createStairsRecipe(DecoBlocks.WHITE_WOOL_STAIRS, Ingredient.ofItems(Items.WHITE_WOOL))
                .criterion(hasItem(Items.WHITE_WOOL),conditionsFromItem(Items.WHITE_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WHITE_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_WOOL_SLAB, Items.WHITE_WOOL);

        createStairsRecipe(DecoBlocks.BLACK_WOOL_STAIRS, Ingredient.ofItems(Items.BLACK_WOOL))
                .criterion(hasItem(Items.BLACK_WOOL),conditionsFromItem(Items.BLACK_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.BLACK_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_WOOL_SLAB, Items.BLACK_WOOL);

        createStairsRecipe(DecoBlocks.GRAY_WOOL_STAIRS, Ingredient.ofItems(Items.GRAY_WOOL))
                .criterion(hasItem(Items.GRAY_WOOL),conditionsFromItem(Items.GRAY_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.GRAY_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRAY_WOOL_SLAB, Items.GRAY_WOOL);

        createStairsRecipe(DecoBlocks.LIGHT_GRAY_WOOL_STAIRS, Ingredient.ofItems(Items.LIGHT_GRAY_WOOL))
                .criterion(hasItem(Items.LIGHT_GRAY_WOOL),conditionsFromItem(Items.LIGHT_GRAY_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.LIGHT_GRAY_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIGHT_GRAY_WOOL_SLAB, Items.LIGHT_GRAY_WOOL);

        createStairsRecipe(DecoBlocks.BROWN_WOOL_STAIRS, Ingredient.ofItems(Items.BROWN_WOOL))
                .criterion(hasItem(Items.BROWN_WOOL),conditionsFromItem(Items.BROWN_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.BROWN_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BROWN_WOOL_SLAB, Items.BROWN_WOOL);

        createStairsRecipe(DecoBlocks.RED_WOOL_STAIRS, Ingredient.ofItems(Items.RED_WOOL))
                .criterion(hasItem(Items.RED_WOOL),conditionsFromItem(Items.RED_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.RED_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RED_WOOL_SLAB, Items.RED_WOOL);

        createStairsRecipe(DecoBlocks.ORANGE_WOOL_STAIRS, Ingredient.ofItems(Items.ORANGE_WOOL))
                .criterion(hasItem(Items.ORANGE_WOOL),conditionsFromItem(Items.ORANGE_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.ORANGE_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ORANGE_WOOL_SLAB, Items.ORANGE_WOOL);

        createStairsRecipe(DecoBlocks.YELLOW_WOOL_STAIRS, Ingredient.ofItems(Items.YELLOW_WOOL))
                .criterion(hasItem(Items.YELLOW_WOOL),conditionsFromItem(Items.YELLOW_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.YELLOW_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.YELLOW_WOOL_SLAB, Items.YELLOW_WOOL);

        createStairsRecipe(DecoBlocks.LIME_WOOL_STAIRS, Ingredient.ofItems(Items.LIME_WOOL))
                .criterion(hasItem(Items.LIME_WOOL),conditionsFromItem(Items.LIME_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.LIME_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIME_WOOL_SLAB, Items.LIME_WOOL);

        createStairsRecipe(DecoBlocks.GREEN_WOOL_STAIRS, Ingredient.ofItems(Items.GREEN_WOOL))
                .criterion(hasItem(Items.GREEN_WOOL),conditionsFromItem(Items.GREEN_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.GREEN_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GREEN_WOOL_SLAB, Items.GREEN_WOOL);

        createStairsRecipe(DecoBlocks.CYAN_WOOL_STAIRS, Ingredient.ofItems(Items.CYAN_WOOL))
                .criterion(hasItem(Items.CYAN_WOOL),conditionsFromItem(Items.CYAN_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CYAN_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CYAN_WOOL_SLAB, Items.CYAN_WOOL);

        createStairsRecipe(DecoBlocks.BLUE_WOOL_STAIRS, Ingredient.ofItems(Items.BLUE_WOOL))
                .criterion(hasItem(Items.BLUE_WOOL),conditionsFromItem(Items.BLUE_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.BLUE_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLUE_WOOL_SLAB, Items.BLUE_WOOL);

        createStairsRecipe(DecoBlocks.LIGHT_BLUE_WOOL_STAIRS, Ingredient.ofItems(Items.LIGHT_BLUE_WOOL))
                .criterion(hasItem(Items.LIGHT_BLUE_WOOL),conditionsFromItem(Items.LIGHT_BLUE_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.LIGHT_BLUE_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LIGHT_BLUE_WOOL_SLAB, Items.LIGHT_BLUE_WOOL);

        createStairsRecipe(DecoBlocks.PURPLE_WOOL_STAIRS, Ingredient.ofItems(Items.PURPLE_WOOL))
                .criterion(hasItem(Items.PURPLE_WOOL),conditionsFromItem(Items.PURPLE_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.PURPLE_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PURPLE_WOOL_SLAB, Items.PURPLE_WOOL);

        createStairsRecipe(DecoBlocks.MAGENTA_WOOL_STAIRS, Ingredient.ofItems(Items.MAGENTA_WOOL))
                .criterion(hasItem(Items.MAGENTA_WOOL),conditionsFromItem(Items.MAGENTA_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MAGENTA_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MAGENTA_WOOL_SLAB, Items.MAGENTA_WOOL);

        createStairsRecipe(DecoBlocks.PINK_WOOL_STAIRS, Ingredient.ofItems(Items.PINK_WOOL))
                .criterion(hasItem(Items.PINK_WOOL),conditionsFromItem(Items.PINK_WOOL))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.PINK_WOOL_STAIRS)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PINK_WOOL_SLAB, Items.PINK_WOOL);

        createStairsRecipe(DecoBlocks.CRACKED_STONE_BRICK_STAIRS, Ingredient.ofItems(Items.CRACKED_STONE_BRICKS))
                .criterion(hasItem(Items.CRACKED_STONE_BRICKS),conditionsFromItem(Items.CRACKED_STONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_STONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_STAIRS, Items.CRACKED_STONE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_SLAB, Items.CRACKED_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_SLAB, Items.CRACKED_STONE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_STONE_BRICK_WALL, Items.CRACKED_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_WALL, Items.CRACKED_STONE_BRICKS);

        createStairsRecipe(DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Ingredient.ofItems(Items.CRACKED_DEEPSLATE_BRICKS))
                .criterion(hasItem(Items.CRACKED_DEEPSLATE_BRICKS),conditionsFromItem(Items.CRACKED_DEEPSLATE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Items.CRACKED_DEEPSLATE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Items.CRACKED_DEEPSLATE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Items.CRACKED_DEEPSLATE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_WALL, Items.CRACKED_DEEPSLATE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_WALL, Items.CRACKED_DEEPSLATE_BRICKS);

        createStairsRecipe(DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Ingredient.ofItems(Items.CRACKED_DEEPSLATE_TILES))
                .criterion(hasItem(Items.CRACKED_DEEPSLATE_TILES),conditionsFromItem(Items.CRACKED_DEEPSLATE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Items.CRACKED_DEEPSLATE_TILES);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Items.CRACKED_DEEPSLATE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Items.CRACKED_DEEPSLATE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_DEEPSLATE_TILE_WALL, Items.CRACKED_DEEPSLATE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_WALL, Items.CRACKED_DEEPSLATE_TILES);

        createStairsRecipe(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Ingredient.ofItems(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .criterion(hasItem(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS),conditionsFromItem(Items.CRACKED_POLISHED_BLACKSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS);

        createStairsRecipe(DecoBlocks.CRACKED_NETHER_BRICK_STAIRS, Ingredient.ofItems(Items.CRACKED_NETHER_BRICKS))
                .criterion(hasItem(Items.CRACKED_NETHER_BRICKS),conditionsFromItem(Items.CRACKED_NETHER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_NETHER_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_STAIRS, Items.CRACKED_NETHER_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_SLAB, Items.CRACKED_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_SLAB, Items.CRACKED_NETHER_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_NETHER_BRICK_WALL, Items.CRACKED_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_WALL, Items.CRACKED_NETHER_BRICKS);

        createStairsRecipe(DecoBlocks.CRACKED_STONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.CRACKED_STONE_TILES))
                .criterion(hasItem(DecoBlocks.CRACKED_STONE_TILES),conditionsFromItem(DecoBlocks.CRACKED_STONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_STONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_STAIRS, DecoBlocks.CRACKED_STONE_TILES);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_SLAB, DecoBlocks.CRACKED_STONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_SLAB, DecoBlocks.CRACKED_STONE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_STONE_TILE_WALL, DecoBlocks.CRACKED_STONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_WALL, DecoBlocks.CRACKED_STONE_TILES);

        createStairsRecipe(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES))
                .criterion(hasItem(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES),conditionsFromItem(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_WALL, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILES);

        createStairsRecipe(DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CRACKED_END_STONE_BRICKS))
                .criterion(hasItem(DecoBlocks.CRACKED_END_STONE_BRICKS),conditionsFromItem(DecoBlocks.CRACKED_END_STONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS, DecoBlocks.CRACKED_END_STONE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_SLAB, DecoBlocks.CRACKED_END_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_SLAB, DecoBlocks.CRACKED_END_STONE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_END_STONE_BRICK_WALL, DecoBlocks.CRACKED_END_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_WALL, DecoBlocks.CRACKED_END_STONE_BRICKS);

        createStairsRecipe(DecoBlocks.CRACKED_END_STONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.CRACKED_END_STONE_TILES))
                .criterion(hasItem(DecoBlocks.CRACKED_END_STONE_TILES),conditionsFromItem(DecoBlocks.CRACKED_END_STONE_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_END_STONE_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_STAIRS, DecoBlocks.CRACKED_END_STONE_TILES);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_SLAB, DecoBlocks.CRACKED_END_STONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_SLAB, DecoBlocks.CRACKED_END_STONE_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_END_STONE_TILE_WALL, DecoBlocks.CRACKED_END_STONE_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_WALL, DecoBlocks.CRACKED_END_STONE_TILES);

        createStairsRecipe(DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CRACKED_RED_NETHER_BRICKS))
                .criterion(hasItem(DecoBlocks.CRACKED_RED_NETHER_BRICKS),conditionsFromItem(DecoBlocks.CRACKED_RED_NETHER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS, DecoBlocks.CRACKED_RED_NETHER_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB, DecoBlocks.CRACKED_RED_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB, DecoBlocks.CRACKED_RED_NETHER_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_RED_NETHER_BRICK_WALL, DecoBlocks.CRACKED_RED_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_WALL, DecoBlocks.CRACKED_RED_NETHER_BRICKS);

        createStairsRecipe(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS))
                .criterion(hasItem(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS),conditionsFromItem(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_WALL, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_WALL, DecoBlocks.CRACKED_BLUE_NETHER_BRICKS);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.STONE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.STONE_BRICK_STAIRS), conditionsFromItem(Items.STONE_BRICK_STAIRS))
                .offerTo(exporter, Identifier.of("cracked_stone_brick_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.STONE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_BRICK_SLAB,
                        0.1f, 200).criterion(hasItem(Items.STONE_BRICK_SLAB), conditionsFromItem(Items.STONE_BRICK_SLAB))
                .offerTo(exporter, Identifier.of("cracked_stone_brick_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.STONE_BRICK_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_STONE_BRICK_WALL,
                        0.1f, 200).criterion(hasItem(Items.STONE_BRICK_WALL), conditionsFromItem(Items.STONE_BRICK_WALL))
                .offerTo(exporter, Identifier.of("cracked_stone_brick_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.POLISHED_BLACKSTONE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.POLISHED_BLACKSTONE_BRICK_STAIRS), conditionsFromItem(Items.POLISHED_BLACKSTONE_BRICK_STAIRS))
                .offerTo(exporter, Identifier.of("cracked_polished_blackstone_brick_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.POLISHED_BLACKSTONE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB,
                        0.1f, 200).criterion(hasItem(Items.POLISHED_BLACKSTONE_BRICK_SLAB), conditionsFromItem(Items.POLISHED_BLACKSTONE_BRICK_SLAB))
                .offerTo(exporter, Identifier.of("cracked_polished_blackstone_brick_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.POLISHED_BLACKSTONE_BRICK_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL,
                        0.1f, 200).criterion(hasItem(Items.POLISHED_BLACKSTONE_BRICK_WALL), conditionsFromItem(Items.POLISHED_BLACKSTONE_BRICK_WALL))
                .offerTo(exporter, Identifier.of("cracked_polished_blackstone_brick_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.DEEPSLATE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.DEEPSLATE_BRICK_STAIRS), conditionsFromItem(Items.DEEPSLATE_BRICK_STAIRS))
                .offerTo(exporter, Identifier.of("cracked_deepslate_brick_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.DEEPSLATE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_SLAB,
                        0.1f, 200).criterion(hasItem(Items.DEEPSLATE_BRICK_SLAB), conditionsFromItem(Items.DEEPSLATE_BRICK_SLAB))
                .offerTo(exporter, Identifier.of("cracked_deepslate_brick_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.DEEPSLATE_BRICK_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_DEEPSLATE_BRICK_WALL,
                        0.1f, 200).criterion(hasItem(Items.DEEPSLATE_BRICK_WALL), conditionsFromItem(Items.DEEPSLATE_BRICK_WALL))
                .offerTo(exporter, Identifier.of("cracked_deepslate_brick_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.NETHER_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.NETHER_BRICK_STAIRS), conditionsFromItem(Items.NETHER_BRICK_STAIRS))
                .offerTo(exporter, Identifier.of("cracked_nether_brick_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.NETHER_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_NETHER_BRICK_SLAB,
                        0.1f, 200).criterion(hasItem(Items.NETHER_BRICK_SLAB), conditionsFromItem(Items.NETHER_BRICK_SLAB))
                .offerTo(exporter, Identifier.of("cracked_nether_brick_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.NETHER_BRICK_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_NETHER_BRICK_WALL,
                        0.1f, 200).criterion(hasItem(Items.NETHER_BRICK_WALL), conditionsFromItem(Items.NETHER_BRICK_WALL))
                .offerTo(exporter, Identifier.of("cracked_nether_brick_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.NETHER_BRICK_FENCE), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_NETHER_BRICK_FENCE,
                        0.1f, 200).criterion(hasItem(Items.NETHER_BRICK_FENCE), conditionsFromItem(Items.NETHER_BRICK_FENCE))
                .offerTo(exporter, Identifier.of("cracked_nether_brick_fence_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.NETHER_BRICK_FENCE_GATE), RecipeCategory.REDSTONE, DecoBlocks.CRACKED_NETHER_BRICK_FENCE_GATE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.NETHER_BRICK_FENCE_GATE), conditionsFromItem(DecoBlocks.NETHER_BRICK_FENCE_GATE))
                .offerTo(exporter, Identifier.of("cracked_nether_brick_fence_gate_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_NETHER_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.RED_NETHER_BRICK_STAIRS), conditionsFromItem(Items.RED_NETHER_BRICK_STAIRS))
                .offerTo(exporter, Identifier.of("cracked_red_nether_brick_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_NETHER_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_RED_NETHER_BRICK_SLAB,
                        0.1f, 200).criterion(hasItem(Items.RED_NETHER_BRICK_SLAB), conditionsFromItem(Items.RED_NETHER_BRICK_SLAB))
                .offerTo(exporter, Identifier.of("cracked_red_nether_brick_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_NETHER_BRICK_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_RED_NETHER_BRICK_WALL,
                        0.1f, 200).criterion(hasItem(Items.RED_NETHER_BRICK_WALL), conditionsFromItem(Items.RED_NETHER_BRICK_WALL))
                .offerTo(exporter, Identifier.of("cracked_red_nether_brick_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RED_NETHER_BRICK_FENCE), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RED_NETHER_BRICK_FENCE), conditionsFromItem(DecoBlocks.RED_NETHER_BRICK_FENCE))
                .offerTo(exporter, Identifier.of("cracked_red_nether_brick_fence_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE), RecipeCategory.REDSTONE, DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE), conditionsFromItem(DecoBlocks.RED_NETHER_BRICK_FENCE_GATE))
                .offerTo(exporter, Identifier.of("cracked_red_nether_brick_fence_gate_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICK_STAIRS), conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICK_STAIRS))
                .offerTo(exporter, Identifier.of("cracked_blue_nether_brick_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICK_SLAB), conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICK_SLAB))
                .offerTo(exporter, Identifier.of("cracked_blue_nether_brick_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICK_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICK_WALL), conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICK_WALL))
                .offerTo(exporter, Identifier.of("cracked_blue_nether_brick_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICK_FENCE), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICK_FENCE), conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICK_FENCE))
                .offerTo(exporter, Identifier.of("cracked_blue_nether_brick_fence_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE), RecipeCategory.REDSTONE, DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE), conditionsFromItem(DecoBlocks.BLUE_NETHER_BRICK_FENCE_GATE))
                .offerTo(exporter, Identifier.of("cracked_blue_nether_brick_fence_gate_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.DEEPSLATE_TILE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.DEEPSLATE_TILE_STAIRS), conditionsFromItem(Items.DEEPSLATE_TILE_STAIRS))
                .offerTo(exporter, Identifier.of("cracked_deepslate_tile_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.DEEPSLATE_TILE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_DEEPSLATE_TILE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.DEEPSLATE_TILE_SLAB), conditionsFromItem(Items.DEEPSLATE_TILE_SLAB))
                .offerTo(exporter, Identifier.of("cracked_deepslate_tile_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.DEEPSLATE_TILE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_DEEPSLATE_TILE_WALL,
                        0.1f, 200).criterion(hasItem(Items.DEEPSLATE_TILE_WALL), conditionsFromItem(Items.DEEPSLATE_TILE_WALL))
                .offerTo(exporter, Identifier.of("cracked_deepslate_tile_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.END_STONE_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.END_STONE_BRICK_STAIRS), conditionsFromItem(Items.END_STONE_BRICK_STAIRS))
                .offerTo(exporter, Identifier.of("cracked_end_stone_brick_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.END_STONE_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICK_SLAB,
                        0.1f, 200).criterion(hasItem(Items.END_STONE_BRICK_SLAB), conditionsFromItem(Items.END_STONE_BRICK_SLAB))
                .offerTo(exporter, Identifier.of("cracked_end_stone_brick_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.END_STONE_BRICK_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_END_STONE_BRICK_WALL,
                        0.1f, 200).criterion(hasItem(Items.END_STONE_BRICK_WALL), conditionsFromItem(Items.END_STONE_BRICK_WALL))
                .offerTo(exporter, Identifier.of("cracked_end_stone_brick_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.STONE_TILE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.STONE_TILE_STAIRS), conditionsFromItem(DecoBlocks.STONE_TILE_STAIRS))
                .offerTo(exporter, Identifier.of("cracked_stone_tile_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.STONE_TILE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_STONE_TILE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.STONE_TILE_SLAB), conditionsFromItem(DecoBlocks.STONE_TILE_SLAB))
                .offerTo(exporter, Identifier.of("cracked_stone_tile_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.STONE_TILE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_STONE_TILE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.STONE_TILE_WALL), conditionsFromItem(DecoBlocks.STONE_TILE_WALL))
                .offerTo(exporter, Identifier.of("cracked_stone_tile_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS), conditionsFromItem(DecoBlocks.POLISHED_BLACKSTONE_TILE_STAIRS))
                .offerTo(exporter, Identifier.of("cracked_polished_blackstone_tile_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB), conditionsFromItem(DecoBlocks.POLISHED_BLACKSTONE_TILE_SLAB))
                .offerTo(exporter, Identifier.of("cracked_polished_blackstone_tile_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_POLISHED_BLACKSTONE_TILE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL), conditionsFromItem(DecoBlocks.POLISHED_BLACKSTONE_TILE_WALL))
                .offerTo(exporter, Identifier.of("cracked_polished_blackstone_tile_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_TILE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_TILE_STAIRS), conditionsFromItem(DecoBlocks.END_STONE_TILE_STAIRS))
                .offerTo(exporter, Identifier.of("cracked_end_stone_tile_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_TILE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_TILE_SLAB), conditionsFromItem(DecoBlocks.END_STONE_TILE_SLAB))
                .offerTo(exporter, Identifier.of("cracked_end_stone_tile_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_TILE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_END_STONE_TILE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_TILE_WALL), conditionsFromItem(DecoBlocks.END_STONE_TILE_WALL))
                .offerTo(exporter, Identifier.of("cracked_end_stone_tile_wall_from_smelting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.BELL)
                .input('#', Items.GOLD_NUGGET)
                .input('I', Items.GOLD_INGOT)
                .input('/', Items.STICK)
                .input('S', ItemTags.STONE_CRAFTING_MATERIALS)
                .pattern("S/S")
                .pattern("SIS")
                .pattern("I#I")
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(Items.BELL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.CRACKED_NETHER_BRICK_FENCE,6)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.CRACKED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.CRACKED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Items.CRACKED_NETHER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_NETHER_BRICK_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE,6)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.CRACKED_RED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CRACKED_RED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CRACKED_RED_NETHER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE,6)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.CRACKED_BLUE_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.CRACKED_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', Items.CRACKED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.CRACKED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(Items.CRACKED_NETHER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_NETHER_BRICK_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.CRACKED_RED_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CRACKED_RED_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CRACKED_RED_NETHER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_RED_NETHER_BRICK_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.NETHER_BRICK)
                .input('#', DecoBlocks.CRACKED_BLUE_NETHER_BRICKS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CRACKED_BLUE_NETHER_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_BLUE_NETHER_BRICK_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GOLD_GRATE,4)
                .pattern(" X ")
                .pattern("X#X")
                .pattern(" X ")
                .input('#', Items.GOLD_BLOCK)
                .input('X', DecoBlocks.LIGHT_GOLD_BARS)
                .criterion(hasItem(Items.GOLD_BLOCK),
                        conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.GOLD_GRATE)));

        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.GOLD_GRATE, Items.GOLD_BLOCK,4);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_GOLD, DecoBlocks.CUT_GOLD_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_GOLD, Items.GOLD_BLOCK,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_GOLD, DecoBlocks.CUT_GOLD);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.TUFF_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.TUFF)
                .group("lever")
                .criterion(RecipeProvider.hasItem(Items.TUFF),
                        RecipeProvider.conditionsFromItem(Items.TUFF))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.TUFF_LEVER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_TUFF_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.POLISHED_TUFF)
                .group("lever")
                .criterion(RecipeProvider.hasItem(Items.POLISHED_TUFF),
                        RecipeProvider.conditionsFromItem(Items.POLISHED_TUFF))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.POLISHED_TUFF_LEVER)));

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE_BRICKS, Items.END_STONE_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE_BRICKS, Items.END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE_BRICKS, DecoBlocks.POLISHED_END_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE_BRICKS, Items.END_STONE_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoItems.EARTH_SPHERE)
                .pattern(" # ")
                .pattern("#D#")
                .pattern(" # ")
                .input('#', Items.MUD)
                .input('D', Items.COARSE_DIRT)
                .criterion(hasItem(Items.COARSE_DIRT),
                        conditionsFromItem(Items.COARSE_DIRT))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoItems.EARTH_SPHERE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WIND_BLOCK)
                .pattern("#I")
                .pattern("I#")
                .input('#', Items.TUFF)
                .input('I', Items.WIND_CHARGE)
                .criterion(hasItem(Items.WIND_CHARGE),
                        conditionsFromItem(Items.WIND_CHARGE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WIND_BLOCK)));

        createStairsRecipe(DecoBlocks.WIND_STAIRS, Ingredient.ofItems(DecoBlocks.WIND_BLOCK))
                .criterion(hasItem(DecoBlocks.WIND_BLOCK),conditionsFromItem(DecoBlocks.WIND_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WIND_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_STAIRS, DecoBlocks.WIND_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_SLAB, DecoBlocks.WIND_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_SLAB, DecoBlocks.WIND_BLOCK);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.WIND_WALL, DecoBlocks.WIND_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_WALL, DecoBlocks.WIND_BLOCK);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICKS, DecoBlocks.WIND_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICKS, DecoBlocks.WIND_BLOCK);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_WIND_BLOCK, DecoBlocks.WIND_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_WIND_BLOCK, DecoBlocks.WIND_BLOCK);

        createStairsRecipe(DecoBlocks.WIND_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.WIND_BRICKS))
                .criterion(hasItem(DecoBlocks.WIND_BRICKS),conditionsFromItem(DecoBlocks.WIND_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WIND_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICK_STAIRS, DecoBlocks.WIND_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICK_STAIRS, DecoBlocks.WIND_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICK_SLAB, DecoBlocks.WIND_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICK_SLAB, DecoBlocks.WIND_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICK_SLAB, DecoBlocks.WIND_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.WIND_BRICK_WALL, DecoBlocks.WIND_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICK_WALL, DecoBlocks.WIND_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WIND_BRICK_WALL, DecoBlocks.WIND_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_WIND_BRICKS, DecoBlocks.WIND_BRICK_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_WIND_BRICKS, DecoBlocks.WIND_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_WIND_BRICKS, DecoBlocks.WIND_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.EARTH_BLOCK)
                .pattern("#I")
                .pattern("I#")
                .input('#', Items.COBBLED_DEEPSLATE)
                .input('I', DecoItems.EARTH_SPHERE)
                .criterion(hasItem(DecoItems.EARTH_SPHERE),
                        conditionsFromItem(DecoItems.EARTH_SPHERE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.EARTH_BLOCK)));

        createStairsRecipe(DecoBlocks.EARTH_STAIRS, Ingredient.ofItems(DecoBlocks.EARTH_BLOCK))
                .criterion(hasItem(DecoBlocks.EARTH_BLOCK),conditionsFromItem(DecoBlocks.EARTH_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.EARTH_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_STAIRS, DecoBlocks.EARTH_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_SLAB, DecoBlocks.EARTH_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_SLAB, DecoBlocks.EARTH_BLOCK);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.EARTH_WALL, DecoBlocks.EARTH_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_WALL, DecoBlocks.EARTH_BLOCK);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICKS, DecoBlocks.EARTH_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICKS, DecoBlocks.EARTH_BLOCK);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_EARTH_BLOCK, DecoBlocks.EARTH_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_EARTH_BLOCK, DecoBlocks.EARTH_BLOCK);

        createStairsRecipe(DecoBlocks.EARTH_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.EARTH_BRICKS))
                .criterion(hasItem(DecoBlocks.EARTH_BRICKS),conditionsFromItem(DecoBlocks.EARTH_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.EARTH_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICK_STAIRS, DecoBlocks.EARTH_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICK_STAIRS, DecoBlocks.EARTH_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICK_SLAB, DecoBlocks.EARTH_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICK_SLAB, DecoBlocks.EARTH_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICK_SLAB, DecoBlocks.EARTH_BRICKS);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,DecoBlocks.EARTH_BRICK_WALL, DecoBlocks.EARTH_BRICKS);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICK_WALL, DecoBlocks.EARTH_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.EARTH_BRICK_WALL, DecoBlocks.EARTH_BRICKS);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_EARTH_BRICKS, DecoBlocks.EARTH_BRICK_SLAB);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_EARTH_BRICKS, DecoBlocks.EARTH_BLOCK);
        offerStonecuttingRecipe(exporter,  RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_EARTH_BRICKS, DecoBlocks.EARTH_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.GRASS_BLOCK,3)
                .pattern("G0G")
                .pattern("###")
                .input('#', Items.DIRT)
                .input('0', DecoItems.EARTH_SPHERE)
                .input('G', Items.SHORT_GRASS)
                .group("dirt_like")
                .criterion(hasItem(DecoItems.EARTH_SPHERE),
                        conditionsFromItem(DecoItems.EARTH_SPHERE))
                .offerTo(exporter, Identifier.of(getRecipeName(Items.GRASS_BLOCK)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.FARMLAND,3)
                .pattern("S0S")
                .pattern("###")
                .input('#', Items.DIRT)
                .input('0', DecoItems.EARTH_SPHERE)
                .input('S', DecoTags.Items.SEEDS)
                .group("dirt_like")
                .criterion(hasItem(DecoItems.EARTH_SPHERE),
                        conditionsFromItem(DecoItems.EARTH_SPHERE))
                .offerTo(exporter, Identifier.of(getRecipeName(Items.FARMLAND)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.DIRT_PATH,3)
                .pattern(" 0 ")
                .pattern("###")
                .input('#', Items.DIRT)
                .input('0', DecoItems.EARTH_SPHERE)
                .group("dirt_like")
                .criterion(hasItem(DecoItems.EARTH_SPHERE),
                        conditionsFromItem(DecoItems.EARTH_SPHERE))
                .offerTo(exporter, Identifier.of(getRecipeName(Items.DIRT_PATH)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.MYCELIUM,3)
                .pattern("M0M")
                .pattern("###")
                .input('#', Items.COARSE_DIRT)
                .input('0', DecoItems.EARTH_SPHERE)
                .input('M', DecoTags.Items.MUSHROOMS)
                .group("dirt_like")
                .criterion(hasItem(DecoItems.EARTH_SPHERE),
                        conditionsFromItem(DecoItems.EARTH_SPHERE))
                .offerTo(exporter, Identifier.of(getRecipeName(Items.MYCELIUM)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.PODZOL,3)
                .pattern("B0B")
                .pattern("###")
                .input('#', Items.COARSE_DIRT)
                .input('0', DecoItems.EARTH_SPHERE)
                .input('B', Items.DEAD_BUSH)
                .group("dirt_like")
                .criterion(hasItem(DecoItems.EARTH_SPHERE),
                        conditionsFromItem(DecoItems.EARTH_SPHERE))
                .offerTo(exporter, Identifier.of(getRecipeName(Items.PODZOL)));

        createStairsRecipe(DecoBlocks.CRACKED_TUFF_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CRACKED_TUFF_BRICKS))
                .criterion(hasItem(DecoBlocks.CRACKED_TUFF_BRICKS),conditionsFromItem(DecoBlocks.CRACKED_TUFF_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_TUFF_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_BRICK_STAIRS, DecoBlocks.CRACKED_TUFF_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_BRICK_SLAB, DecoBlocks.CRACKED_TUFF_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_BRICK_SLAB, DecoBlocks.CRACKED_TUFF_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_TUFF_BRICK_WALL, DecoBlocks.CRACKED_TUFF_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_BRICK_WALL, DecoBlocks.CRACKED_TUFF_BRICKS);

        createStairsRecipe(DecoBlocks.CRACKED_TUFF_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.CRACKED_TUFF_TILES))
                .criterion(hasItem(DecoBlocks.CRACKED_TUFF_TILES),conditionsFromItem(DecoBlocks.CRACKED_TUFF_TILES))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CRACKED_TUFF_TILE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_TILE_STAIRS, DecoBlocks.CRACKED_TUFF_TILES);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_TILE_SLAB, DecoBlocks.CRACKED_TUFF_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_TILE_SLAB, DecoBlocks.CRACKED_TUFF_TILES,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_TUFF_TILE_WALL, DecoBlocks.CRACKED_TUFF_TILES);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_TILE_WALL, DecoBlocks.CRACKED_TUFF_TILES);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.TUFF_BRICK_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_BRICK_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.TUFF_BRICK_STAIRS), conditionsFromItem(Items.TUFF_BRICK_STAIRS))
                .offerTo(exporter, Identifier.of("cracked_tuff_brick_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.TUFF_BRICK_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_BRICK_SLAB,
                        0.1f, 200).criterion(hasItem(Items.TUFF_BRICK_SLAB), conditionsFromItem(Items.TUFF_BRICK_SLAB))
                .offerTo(exporter, Identifier.of("cracked_tuff_brick_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.TUFF_BRICK_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_TUFF_BRICK_WALL,
                        0.1f, 200).criterion(hasItem(Items.TUFF_BRICK_WALL), conditionsFromItem(Items.TUFF_BRICK_WALL))
                .offerTo(exporter, Identifier.of("cracked_tuff_brick_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.TUFF_TILE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_TILE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.TUFF_TILE_STAIRS), conditionsFromItem(DecoBlocks.TUFF_TILE_STAIRS))
                .offerTo(exporter, Identifier.of("cracked_tuff_tile_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.TUFF_TILE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_TUFF_TILE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.TUFF_TILE_SLAB), conditionsFromItem(DecoBlocks.TUFF_TILE_SLAB))
                .offerTo(exporter, Identifier.of("cracked_tuff_tile_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.TUFF_TILE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.CRACKED_TUFF_TILE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.TUFF_TILE_WALL), conditionsFromItem(DecoBlocks.TUFF_TILE_WALL))
                .offerTo(exporter, Identifier.of("cracked_tuff_tile_wall_from_smelting"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.CRIMSON_NYLIUM,3)
                .pattern("R0R")
                .pattern("###")
                .input('#', Items.NETHERRACK)
                .input('0', DecoItems.EARTH_SPHERE)
                .input('R', Items.CRIMSON_ROOTS)
                .group("nyliums")
                .criterion(hasItem(DecoItems.EARTH_SPHERE),
                        conditionsFromItem(DecoItems.EARTH_SPHERE))
                .offerTo(exporter,getRecipeName(Items.CRIMSON_NYLIUM)+ "_recipe_create");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, Items.WARPED_NYLIUM,3)
                .pattern("R0R")
                .pattern("###")
                .input('#', Items.NETHERRACK)
                .input('0', DecoItems.EARTH_SPHERE)
                .input('R', Items.WARPED_ROOTS)
                .group("nyliums")
                .criterion(hasItem(DecoItems.EARTH_SPHERE),
                        conditionsFromItem(DecoItems.EARTH_SPHERE))
                .offerTo(exporter,getRecipeName(Items.WARPED_NYLIUM)+ "_recipe_create");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_GRASS)
                .pattern(" G ")
                .pattern("G0G")
                .pattern(" G ")
                .input('0', DecoItems.EARTH_SPHERE)
                .input('G', Items.SHORT_GRASS)
                .group("packed_soil")
                .criterion(hasItem(DecoItems.EARTH_SPHERE),
                        conditionsFromItem(DecoItems.EARTH_SPHERE))
                .offerTo(exporter,getRecipeName(DecoBlocks.PACKED_GRASS)+ "_from_earth_sphere");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_PODZOL)
                .pattern(" B ")
                .pattern("B0B")
                .pattern(" B ")
                .input('0', DecoItems.EARTH_SPHERE)
                .input('B', Items.DEAD_BUSH)
                .group("packed_soil")
                .criterion(hasItem(DecoItems.EARTH_SPHERE),
                        conditionsFromItem(DecoItems.EARTH_SPHERE))
                .offerTo(exporter,getRecipeName(DecoBlocks.PACKED_PODZOL)+ "_from_earth_sphere");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_MYCELIUM)
                .pattern(" M ")
                .pattern("M0M")
                .pattern(" M ")
                .input('0', DecoItems.EARTH_SPHERE)
                .input('M', DecoTags.Items.MUSHROOMS)
                .group("packed_soil")
                .criterion(hasItem(DecoItems.EARTH_SPHERE),
                        conditionsFromItem(DecoItems.EARTH_SPHERE))
                .offerTo(exporter,getRecipeName(DecoBlocks.PACKED_MYCELIUM)+ "_from_earth_sphere");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_CRIMSON_NYLIUM)
                .pattern(" R ")
                .pattern("R0R")
                .pattern(" R ")
                .input('0', Items.NETHERRACK)
                .input('R', Items.CRIMSON_ROOTS)
                .group("packed_nylium")
                .criterion(hasItem(Items.NETHERRACK),
                        conditionsFromItem(Items.NETHERRACK))
                .offerTo(exporter,getRecipeName(DecoBlocks.PACKED_CRIMSON_NYLIUM)+ "_from_netherrack");

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_WARPED_NYLIUM)
                .pattern(" R ")
                .pattern("R0R")
                .pattern(" R ")
                .input('0', Items.NETHERRACK)
                .input('R', Items.WARPED_ROOTS)
                .group("packed_nylium")
                .criterion(hasItem(Items.NETHERRACK),
                        conditionsFromItem(Items.NETHERRACK))
                .offerTo(exporter,getRecipeName(DecoBlocks.PACKED_WARPED_NYLIUM)+ "_from_netherrack");

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.MAGENTA_DYE)
                .input(DecoBlocks.ENDER_ROSE)
                .group("magenta_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.ENDER_ROSE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.ENDER_ROSE))
                .offerTo(exporter, Identifier.of("magenta_dye_from_ender_rose"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.MAGENTA_DYE,4)
                .input(DecoBlocks.ENDER_ROSE_BUSH)
                .group("magenta_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.ENDER_ROSE_BUSH),
                        RecipeProvider.conditionsFromItem(DecoBlocks.ENDER_ROSE_BUSH))
                .offerTo(exporter, Identifier.of("magenta_dye_from_ender_rose_bush"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_DEEPSLATE_BRICKS)
                .input(Items.SCULK_VEIN)
                .input(Items.DEEPSLATE_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.SCULK_VEIN),
                        RecipeProvider.conditionsFromItem(Items.SCULK_VEIN))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.MOSSY_DEEPSLATE_BRICKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_END_STONE_BRICKS)
                .input(Items.MOSS_BLOCK)
                .input(Items.END_STONE_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.END_STONE_BRICKS),
                        RecipeProvider.conditionsFromItem(Items.END_STONE_BRICKS))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.MOSSY_END_STONE_BRICKS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS)
                .input(Items.TWISTING_VINES)
                .input(Items.POLISHED_BLACKSTONE_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.TWISTING_VINES),
                        RecipeProvider.conditionsFromItem(Items.TWISTING_VINES))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS)));

        createStairsRecipe(DecoBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.MOSSY_DEEPSLATE_BRICKS))
                .criterion(hasItem(DecoBlocks.MOSSY_DEEPSLATE_BRICKS),conditionsFromItem(DecoBlocks.MOSSY_DEEPSLATE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS, DecoBlocks.MOSSY_DEEPSLATE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, DecoBlocks.MOSSY_DEEPSLATE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_DEEPSLATE_BRICK_SLAB, DecoBlocks.MOSSY_DEEPSLATE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_DEEPSLATE_BRICK_WALL, DecoBlocks.MOSSY_DEEPSLATE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_DEEPSLATE_BRICK_WALL, DecoBlocks.MOSSY_DEEPSLATE_BRICKS);

        createStairsRecipe(DecoBlocks.MOSSY_END_STONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.MOSSY_END_STONE_BRICKS))
                .criterion(hasItem(DecoBlocks.MOSSY_END_STONE_BRICKS),conditionsFromItem(DecoBlocks.MOSSY_END_STONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MOSSY_END_STONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_END_STONE_BRICK_STAIRS, DecoBlocks.MOSSY_END_STONE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_END_STONE_BRICK_SLAB, DecoBlocks.MOSSY_END_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_END_STONE_BRICK_SLAB, DecoBlocks.MOSSY_END_STONE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_END_STONE_BRICK_WALL, DecoBlocks.MOSSY_END_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_END_STONE_BRICK_WALL, DecoBlocks.MOSSY_END_STONE_BRICKS);

        createStairsRecipe(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS),conditionsFromItem(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_STAIRS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_SLAB, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_WALL, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICK_WALL, DecoBlocks.MOSSY_POLISHED_BLACKSTONE_BRICKS);

        createStairsRecipe(DecoBlocks.LAPIS_STAIRS, Ingredient.ofItems(Items.LAPIS_BLOCK))
                .criterion(hasItem(Items.LAPIS_BLOCK),conditionsFromItem(Items.LAPIS_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.LAPIS_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_STAIRS, Items.LAPIS_BLOCK);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_SLAB, Items.LAPIS_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_SLAB, Items.LAPIS_BLOCK,2);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.LAPIS_WALL, Items.LAPIS_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_WALL, Items.LAPIS_BLOCK);

        offerPolishedStoneRecipe(exporter,RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICKS, Items.LAPIS_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICKS, Items.LAPIS_BLOCK);

        createStairsRecipe(DecoBlocks.LAPIS_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.LAPIS_BRICKS))
                .criterion(hasItem(DecoBlocks.LAPIS_BRICKS),conditionsFromItem(DecoBlocks.LAPIS_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.LAPIS_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICK_STAIRS, Items.LAPIS_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICK_STAIRS, DecoBlocks.LAPIS_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICK_SLAB, DecoBlocks.LAPIS_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICK_SLAB, Items.LAPIS_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICK_SLAB, DecoBlocks.LAPIS_BRICKS,2);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.LAPIS_BRICK_WALL, DecoBlocks.LAPIS_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICK_WALL, Items.LAPIS_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_BRICK_WALL, DecoBlocks.LAPIS_BRICKS);


        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS,4)
                .pattern("#L")
                .pattern("L#")
                .input('#', Items.LAPIS_BLOCK)
                .input('L', Items.LAPIS_LAZULI)
                .criterion(RecipeProvider.hasItem(Items.LAPIS_BLOCK),
                        RecipeProvider.conditionsFromItem(Items.LAPIS_BLOCK))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.CUT_LAPIS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS, Items.LAPIS_BLOCK);

        createStairsRecipe(DecoBlocks.CUT_LAPIS_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_LAPIS))
                .criterion(hasItem(DecoBlocks.CUT_LAPIS),conditionsFromItem(DecoBlocks.CUT_LAPIS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CUT_LAPIS_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS_STAIRS, Items.LAPIS_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS_STAIRS, DecoBlocks.CUT_LAPIS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS_SLAB, DecoBlocks.CUT_LAPIS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS_SLAB, Items.LAPIS_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS_SLAB, DecoBlocks.CUT_LAPIS,2);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CUT_LAPIS_WALL, DecoBlocks.CUT_LAPIS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS_WALL, Items.LAPIS_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_LAPIS_WALL, DecoBlocks.CUT_LAPIS);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.LAPIS_BLOCK), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_LAPIS,
                        0.1f, 200).criterion(hasItem(Items.LAPIS_BLOCK), conditionsFromItem(Items.LAPIS_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SMOOTH_LAPIS)));

        createStairsRecipe(DecoBlocks.SMOOTH_LAPIS_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_LAPIS))
                .criterion(hasItem(DecoBlocks.SMOOTH_LAPIS),conditionsFromItem(DecoBlocks.SMOOTH_LAPIS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SMOOTH_LAPIS_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_LAPIS_STAIRS, DecoBlocks.SMOOTH_LAPIS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_LAPIS_SLAB, DecoBlocks.SMOOTH_LAPIS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_LAPIS_SLAB, DecoBlocks.SMOOTH_LAPIS,2);
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_LAPIS_WALL, DecoBlocks.SMOOTH_LAPIS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_LAPIS_WALL, DecoBlocks.SMOOTH_LAPIS);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.LAPIS_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_LAPIS_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.LAPIS_STAIRS), conditionsFromItem(DecoBlocks.LAPIS_STAIRS))
                .offerTo(exporter, Identifier.of("smooth_lapis_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.LAPIS_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_LAPIS_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.LAPIS_SLAB), conditionsFromItem(DecoBlocks.LAPIS_SLAB))
                .offerTo(exporter, Identifier.of("smooth_lapis_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.LAPIS_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_LAPIS_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.LAPIS_WALL), conditionsFromItem(DecoBlocks.LAPIS_WALL))
                .offerTo(exporter, Identifier.of("smooth_lapis_wall_from_smelting"));

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_LAPIS, DecoBlocks.LAPIS_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_LAPIS, Items.LAPIS_BLOCK);

        offerPillarBlockRecipe(exporter, DecoBlocks.LAPIS_PILLAR, DecoBlocks.LAPIS_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.LAPIS_PILLAR, Items.LAPIS_BLOCK);

        offerDuelCutRecipe(exporter, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
        offerDuelCutRecipe(exporter, DecoBlocks.DUEL_CUT_GRAY_CONCRETE, DecoBlocks.CUT_GRAY_CONCRETE);
        offerDuelCutRecipe(exporter, DecoBlocks.DUEL_CUT_BLACK_CONCRETE, DecoBlocks.CUT_BLACK_CONCRETE);
        offerDuelCutRecipe(exporter, DecoBlocks.DUEL_CUT_BROWN_CONCRETE, DecoBlocks.CUT_BROWN_CONCRETE);
        offerDuelCutRecipe(exporter, DecoBlocks.DUEL_CUT_RED_CONCRETE, DecoBlocks.CUT_RED_CONCRETE);
        offerDuelCutRecipe(exporter, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE, DecoBlocks.CUT_ORANGE_CONCRETE);
        offerDuelCutRecipe(exporter, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE, DecoBlocks.CUT_YELLOW_CONCRETE);
        offerDuelCutRecipe(exporter, DecoBlocks.DUEL_CUT_LIME_CONCRETE, DecoBlocks.CUT_LIME_CONCRETE);
        offerDuelCutRecipe(exporter, DecoBlocks.DUEL_CUT_GREEN_CONCRETE, DecoBlocks.CUT_GREEN_CONCRETE);
        offerDuelCutRecipe(exporter, DecoBlocks.DUEL_CUT_CYAN_CONCRETE, DecoBlocks.CUT_CYAN_CONCRETE);
        offerDuelCutRecipe(exporter, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
        offerDuelCutRecipe(exporter, DecoBlocks.DUEL_CUT_BLUE_CONCRETE, DecoBlocks.CUT_BLUE_CONCRETE);
        offerDuelCutRecipe(exporter, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE, DecoBlocks.CUT_PURPLE_CONCRETE);
        offerDuelCutRecipe(exporter, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE, DecoBlocks.CUT_MAGENTA_CONCRETE);
        offerDuelCutRecipe(exporter, DecoBlocks.DUEL_CUT_PINK_CONCRETE, DecoBlocks.CUT_PINK_CONCRETE);

        offerCheckeredRecipe(exporter, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE, DecoBlocks.CUT_LIGHT_GRAY_CONCRETE);
        offerCheckeredRecipe(exporter, DecoBlocks.CHECKERED_GRAY_CONCRETE, DecoBlocks.CUT_GRAY_CONCRETE);
        offerCheckeredRecipe(exporter, DecoBlocks.CHECKERED_BLACK_CONCRETE, DecoBlocks.CUT_BLACK_CONCRETE);
        offerCheckeredRecipe(exporter, DecoBlocks.CHECKERED_BROWN_CONCRETE, DecoBlocks.CUT_BROWN_CONCRETE);
        offerCheckeredRecipe(exporter, DecoBlocks.CHECKERED_RED_CONCRETE, DecoBlocks.CUT_RED_CONCRETE);
        offerCheckeredRecipe(exporter, DecoBlocks.CHECKERED_ORANGE_CONCRETE, DecoBlocks.CUT_ORANGE_CONCRETE);
        offerCheckeredRecipe(exporter, DecoBlocks.CHECKERED_YELLOW_CONCRETE, DecoBlocks.CUT_YELLOW_CONCRETE);
        offerCheckeredRecipe(exporter, DecoBlocks.CHECKERED_LIME_CONCRETE, DecoBlocks.CUT_LIME_CONCRETE);
        offerCheckeredRecipe(exporter, DecoBlocks.CHECKERED_GREEN_CONCRETE, DecoBlocks.CUT_GREEN_CONCRETE);
        offerCheckeredRecipe(exporter, DecoBlocks.CHECKERED_CYAN_CONCRETE, DecoBlocks.CUT_CYAN_CONCRETE);
        offerCheckeredRecipe(exporter, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE, DecoBlocks.CUT_LIGHT_BLUE_CONCRETE);
        offerCheckeredRecipe(exporter, DecoBlocks.CHECKERED_BLUE_CONCRETE, DecoBlocks.CUT_BLUE_CONCRETE);
        offerCheckeredRecipe(exporter, DecoBlocks.CHECKERED_PURPLE_CONCRETE, DecoBlocks.CUT_PURPLE_CONCRETE);
        offerCheckeredRecipe(exporter, DecoBlocks.CHECKERED_MAGENTA_CONCRETE, DecoBlocks.CUT_MAGENTA_CONCRETE);
        offerCheckeredRecipe(exporter, DecoBlocks.CHECKERED_PINK_CONCRETE, DecoBlocks.CUT_PINK_CONCRETE);

        createStairsRecipe(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.DUEL_CUT_BLACK_CONCRETE))
                .criterion(hasItem(DecoBlocks.DUEL_CUT_BLACK_CONCRETE),conditionsFromItem(DecoBlocks.DUEL_CUT_BLACK_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DUEL_CUT_BLACK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLACK_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_BLACK_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLACK_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLACK_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_BLACK_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_BLACK_CONCRETE_WALL, DecoBlocks.DUEL_CUT_BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLACK_CONCRETE_WALL, DecoBlocks.DUEL_CUT_BLACK_CONCRETE);

        createStairsRecipe(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.DUEL_CUT_GRAY_CONCRETE))
                .criterion(hasItem(DecoBlocks.DUEL_CUT_GRAY_CONCRETE),conditionsFromItem(DecoBlocks.DUEL_CUT_GRAY_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DUEL_CUT_GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GRAY_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_GRAY_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GRAY_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GRAY_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_GRAY_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_GRAY_CONCRETE_WALL, DecoBlocks.DUEL_CUT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GRAY_CONCRETE_WALL, DecoBlocks.DUEL_CUT_GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE))
                .criterion(hasItem(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE),conditionsFromItem(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.DUEL_CUT_LIGHT_GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.DUEL_CUT_BROWN_CONCRETE))
                .criterion(hasItem(DecoBlocks.DUEL_CUT_BROWN_CONCRETE),conditionsFromItem(DecoBlocks.DUEL_CUT_BROWN_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DUEL_CUT_BROWN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BROWN_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_BROWN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BROWN_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BROWN_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_BROWN_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_BROWN_CONCRETE_WALL, DecoBlocks.DUEL_CUT_BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BROWN_CONCRETE_WALL, DecoBlocks.DUEL_CUT_BROWN_CONCRETE);

        createStairsRecipe(DecoBlocks.DUEL_CUT_RED_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.DUEL_CUT_RED_CONCRETE))
                .criterion(hasItem(DecoBlocks.DUEL_CUT_RED_CONCRETE),conditionsFromItem(DecoBlocks.DUEL_CUT_RED_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DUEL_CUT_RED_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_RED_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_RED_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_RED_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_RED_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_RED_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_RED_CONCRETE_WALL, DecoBlocks.DUEL_CUT_RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_RED_CONCRETE_WALL, DecoBlocks.DUEL_CUT_RED_CONCRETE);

        createStairsRecipe(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE))
                .criterion(hasItem(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE),conditionsFromItem(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_ORANGE_CONCRETE,2);

        createStairsRecipe(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE))
                .criterion(hasItem(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE),conditionsFromItem(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_WALL, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE_WALL, DecoBlocks.DUEL_CUT_YELLOW_CONCRETE);

        createStairsRecipe(DecoBlocks.DUEL_CUT_LIME_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.DUEL_CUT_LIME_CONCRETE))
                .criterion(hasItem(DecoBlocks.DUEL_CUT_LIME_CONCRETE),conditionsFromItem(DecoBlocks.DUEL_CUT_LIME_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DUEL_CUT_LIME_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIME_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_LIME_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIME_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIME_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_LIME_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_LIME_CONCRETE_WALL, DecoBlocks.DUEL_CUT_LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIME_CONCRETE_WALL, DecoBlocks.DUEL_CUT_LIME_CONCRETE);

        createStairsRecipe(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.DUEL_CUT_GREEN_CONCRETE))
                .criterion(hasItem(DecoBlocks.DUEL_CUT_GREEN_CONCRETE),conditionsFromItem(DecoBlocks.DUEL_CUT_GREEN_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DUEL_CUT_GREEN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GREEN_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_GREEN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GREEN_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GREEN_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_GREEN_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_GREEN_CONCRETE_WALL, DecoBlocks.DUEL_CUT_GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_GREEN_CONCRETE_WALL, DecoBlocks.DUEL_CUT_GREEN_CONCRETE);

        createStairsRecipe(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.DUEL_CUT_CYAN_CONCRETE))
                .criterion(hasItem(DecoBlocks.DUEL_CUT_CYAN_CONCRETE),conditionsFromItem(DecoBlocks.DUEL_CUT_CYAN_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DUEL_CUT_CYAN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_CYAN_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_CYAN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_CYAN_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_CYAN_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_CYAN_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_CYAN_CONCRETE_WALL, DecoBlocks.DUEL_CUT_CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_CYAN_CONCRETE_WALL, DecoBlocks.DUEL_CUT_CYAN_CONCRETE);

        createStairsRecipe(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.DUEL_CUT_BLUE_CONCRETE))
                .criterion(hasItem(DecoBlocks.DUEL_CUT_BLUE_CONCRETE),conditionsFromItem(DecoBlocks.DUEL_CUT_BLUE_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DUEL_CUT_BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLUE_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_BLUE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLUE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLUE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_BLUE_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_BLUE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_BLUE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE))
                .criterion(hasItem(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE),conditionsFromItem(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_LIGHT_BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE))
                .criterion(hasItem(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE),conditionsFromItem(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE_WALL, DecoBlocks.DUEL_CUT_PURPLE_CONCRETE);

        createStairsRecipe(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE))
                .criterion(hasItem(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE),conditionsFromItem(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_WALL, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE_WALL, DecoBlocks.DUEL_CUT_MAGENTA_CONCRETE);

        createStairsRecipe(DecoBlocks.DUEL_CUT_PINK_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.DUEL_CUT_PINK_CONCRETE))
                .criterion(hasItem(DecoBlocks.DUEL_CUT_PINK_CONCRETE),conditionsFromItem(DecoBlocks.DUEL_CUT_PINK_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DUEL_CUT_PINK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PINK_CONCRETE_STAIRS, DecoBlocks.DUEL_CUT_PINK_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PINK_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PINK_CONCRETE_SLAB, DecoBlocks.DUEL_CUT_PINK_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DUEL_CUT_PINK_CONCRETE_WALL, DecoBlocks.DUEL_CUT_PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DUEL_CUT_PINK_CONCRETE_WALL, DecoBlocks.DUEL_CUT_PINK_CONCRETE);

        createStairsRecipe(DecoBlocks.CHECKERED_BLACK_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CHECKERED_BLACK_CONCRETE))
                .criterion(hasItem(DecoBlocks.CHECKERED_BLACK_CONCRETE),conditionsFromItem(DecoBlocks.CHECKERED_BLACK_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHECKERED_BLACK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLACK_CONCRETE_STAIRS, DecoBlocks.CHECKERED_BLACK_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLACK_CONCRETE_SLAB, DecoBlocks.CHECKERED_BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLACK_CONCRETE_SLAB, DecoBlocks.CHECKERED_BLACK_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_BLACK_CONCRETE_WALL, DecoBlocks.CHECKERED_BLACK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLACK_CONCRETE_WALL, DecoBlocks.CHECKERED_BLACK_CONCRETE);

        createStairsRecipe(DecoBlocks.CHECKERED_GRAY_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CHECKERED_GRAY_CONCRETE))
                .criterion(hasItem(DecoBlocks.CHECKERED_GRAY_CONCRETE),conditionsFromItem(DecoBlocks.CHECKERED_GRAY_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHECKERED_GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GRAY_CONCRETE_STAIRS, DecoBlocks.CHECKERED_GRAY_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GRAY_CONCRETE_SLAB, DecoBlocks.CHECKERED_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GRAY_CONCRETE_SLAB, DecoBlocks.CHECKERED_GRAY_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_GRAY_CONCRETE_WALL, DecoBlocks.CHECKERED_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GRAY_CONCRETE_WALL, DecoBlocks.CHECKERED_GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE))
                .criterion(hasItem(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE),conditionsFromItem(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_STAIRS, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_SLAB, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE_WALL, DecoBlocks.CHECKERED_LIGHT_GRAY_CONCRETE);

        createStairsRecipe(DecoBlocks.CHECKERED_BROWN_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CHECKERED_BROWN_CONCRETE))
                .criterion(hasItem(DecoBlocks.CHECKERED_BROWN_CONCRETE),conditionsFromItem(DecoBlocks.CHECKERED_BROWN_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHECKERED_BROWN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BROWN_CONCRETE_STAIRS, DecoBlocks.CHECKERED_BROWN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BROWN_CONCRETE_SLAB, DecoBlocks.CHECKERED_BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BROWN_CONCRETE_SLAB, DecoBlocks.CHECKERED_BROWN_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_BROWN_CONCRETE_WALL, DecoBlocks.CHECKERED_BROWN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BROWN_CONCRETE_WALL, DecoBlocks.CHECKERED_BROWN_CONCRETE);

        createStairsRecipe(DecoBlocks.CHECKERED_RED_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CHECKERED_RED_CONCRETE))
                .criterion(hasItem(DecoBlocks.CHECKERED_RED_CONCRETE),conditionsFromItem(DecoBlocks.CHECKERED_RED_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHECKERED_RED_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_RED_CONCRETE_STAIRS, DecoBlocks.CHECKERED_RED_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_RED_CONCRETE_SLAB, DecoBlocks.CHECKERED_RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_RED_CONCRETE_SLAB, DecoBlocks.CHECKERED_RED_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_RED_CONCRETE_WALL, DecoBlocks.CHECKERED_RED_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_RED_CONCRETE_WALL, DecoBlocks.CHECKERED_RED_CONCRETE);

        createStairsRecipe(DecoBlocks.CHECKERED_ORANGE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CHECKERED_ORANGE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CHECKERED_ORANGE_CONCRETE),conditionsFromItem(DecoBlocks.CHECKERED_ORANGE_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHECKERED_ORANGE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_ORANGE_CONCRETE_STAIRS, DecoBlocks.CHECKERED_ORANGE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_ORANGE_CONCRETE_SLAB, DecoBlocks.CHECKERED_ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_ORANGE_CONCRETE_SLAB, DecoBlocks.CHECKERED_ORANGE_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_ORANGE_CONCRETE_WALL, DecoBlocks.CHECKERED_ORANGE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_ORANGE_CONCRETE_WALL, DecoBlocks.CHECKERED_ORANGE_CONCRETE,2);

        createStairsRecipe(DecoBlocks.CHECKERED_YELLOW_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CHECKERED_YELLOW_CONCRETE))
                .criterion(hasItem(DecoBlocks.CHECKERED_YELLOW_CONCRETE),conditionsFromItem(DecoBlocks.CHECKERED_YELLOW_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHECKERED_YELLOW_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_YELLOW_CONCRETE_STAIRS, DecoBlocks.CHECKERED_YELLOW_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_YELLOW_CONCRETE_SLAB, DecoBlocks.CHECKERED_YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_YELLOW_CONCRETE_SLAB, DecoBlocks.CHECKERED_YELLOW_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_YELLOW_CONCRETE_WALL, DecoBlocks.CHECKERED_YELLOW_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_YELLOW_CONCRETE_WALL, DecoBlocks.CHECKERED_YELLOW_CONCRETE);

        createStairsRecipe(DecoBlocks.CHECKERED_LIME_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CHECKERED_LIME_CONCRETE))
                .criterion(hasItem(DecoBlocks.CHECKERED_LIME_CONCRETE),conditionsFromItem(DecoBlocks.CHECKERED_LIME_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHECKERED_LIME_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIME_CONCRETE_STAIRS, DecoBlocks.CHECKERED_LIME_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIME_CONCRETE_SLAB, DecoBlocks.CHECKERED_LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIME_CONCRETE_SLAB, DecoBlocks.CHECKERED_LIME_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_LIME_CONCRETE_WALL, DecoBlocks.CHECKERED_LIME_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIME_CONCRETE_WALL, DecoBlocks.CHECKERED_LIME_CONCRETE);

        createStairsRecipe(DecoBlocks.CHECKERED_GREEN_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CHECKERED_GREEN_CONCRETE))
                .criterion(hasItem(DecoBlocks.CHECKERED_GREEN_CONCRETE),conditionsFromItem(DecoBlocks.CHECKERED_GREEN_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHECKERED_GREEN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GREEN_CONCRETE_STAIRS, DecoBlocks.CHECKERED_GREEN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GREEN_CONCRETE_SLAB, DecoBlocks.CHECKERED_GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GREEN_CONCRETE_SLAB, DecoBlocks.CHECKERED_GREEN_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_GREEN_CONCRETE_WALL, DecoBlocks.CHECKERED_GREEN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_GREEN_CONCRETE_WALL, DecoBlocks.CHECKERED_GREEN_CONCRETE);

        createStairsRecipe(DecoBlocks.CHECKERED_CYAN_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CHECKERED_CYAN_CONCRETE))
                .criterion(hasItem(DecoBlocks.CHECKERED_CYAN_CONCRETE),conditionsFromItem(DecoBlocks.CHECKERED_CYAN_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHECKERED_CYAN_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_CYAN_CONCRETE_STAIRS, DecoBlocks.CHECKERED_CYAN_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_CYAN_CONCRETE_SLAB, DecoBlocks.CHECKERED_CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_CYAN_CONCRETE_SLAB, DecoBlocks.CHECKERED_CYAN_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_CYAN_CONCRETE_WALL, DecoBlocks.CHECKERED_CYAN_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_CYAN_CONCRETE_WALL, DecoBlocks.CHECKERED_CYAN_CONCRETE);

        createStairsRecipe(DecoBlocks.CHECKERED_BLUE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CHECKERED_BLUE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CHECKERED_BLUE_CONCRETE),conditionsFromItem(DecoBlocks.CHECKERED_BLUE_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHECKERED_BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLUE_CONCRETE_STAIRS, DecoBlocks.CHECKERED_BLUE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLUE_CONCRETE_SLAB, DecoBlocks.CHECKERED_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLUE_CONCRETE_SLAB, DecoBlocks.CHECKERED_BLUE_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_BLUE_CONCRETE_WALL, DecoBlocks.CHECKERED_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_BLUE_CONCRETE_WALL, DecoBlocks.CHECKERED_BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE),conditionsFromItem(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_STAIRS, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_SLAB, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE_WALL, DecoBlocks.CHECKERED_LIGHT_BLUE_CONCRETE);

        createStairsRecipe(DecoBlocks.CHECKERED_PURPLE_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CHECKERED_PURPLE_CONCRETE))
                .criterion(hasItem(DecoBlocks.CHECKERED_PURPLE_CONCRETE),conditionsFromItem(DecoBlocks.CHECKERED_PURPLE_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHECKERED_PURPLE_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PURPLE_CONCRETE_STAIRS, DecoBlocks.CHECKERED_PURPLE_CONCRETE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.LIGHT_GRAY_DYE,4)
                .input(DecoBlocks.MIGHTY_LAVENDER)
                .group("light_gray_dye")
                .criterion(hasItem(DecoBlocks.MIGHTY_LAVENDER),
                        conditionsFromItem(DecoBlocks.MIGHTY_LAVENDER))
                .offerTo(exporter, Identifier.of("light_gray_dye_from_mighty_lavender"));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PURPLE_CONCRETE_SLAB, DecoBlocks.CHECKERED_PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PURPLE_CONCRETE_SLAB, DecoBlocks.CHECKERED_PURPLE_CONCRETE,2);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,Items.LIGHT_GRAY_DYE)
                .input(DecoItems.MIGHTY_LAVENDER_FLOWER)
                .group("light_gray_dye")
                .criterion(hasItem(DecoItems.MIGHTY_LAVENDER_FLOWER),
                        conditionsFromItem(DecoItems.MIGHTY_LAVENDER_FLOWER))
                .offerTo(exporter, Identifier.of("light_gray_dye_from_mighty_lavender_flower"));
        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_PURPLE_CONCRETE_WALL, DecoBlocks.CHECKERED_PURPLE_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PURPLE_CONCRETE_WALL, DecoBlocks.CHECKERED_PURPLE_CONCRETE);

        createStairsRecipe(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CHECKERED_MAGENTA_CONCRETE))
                .criterion(hasItem(DecoBlocks.CHECKERED_MAGENTA_CONCRETE),conditionsFromItem(DecoBlocks.CHECKERED_MAGENTA_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHECKERED_MAGENTA_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_MAGENTA_CONCRETE_STAIRS, DecoBlocks.CHECKERED_MAGENTA_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_MAGENTA_CONCRETE_SLAB, DecoBlocks.CHECKERED_MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_MAGENTA_CONCRETE_SLAB, DecoBlocks.CHECKERED_MAGENTA_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_MAGENTA_CONCRETE_WALL, DecoBlocks.CHECKERED_MAGENTA_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_MAGENTA_CONCRETE_WALL, DecoBlocks.CHECKERED_MAGENTA_CONCRETE);

        createStairsRecipe(DecoBlocks.CHECKERED_PINK_CONCRETE_STAIRS, Ingredient.ofItems(DecoBlocks.CHECKERED_PINK_CONCRETE))
                .criterion(hasItem(DecoBlocks.CHECKERED_PINK_CONCRETE),conditionsFromItem(DecoBlocks.CHECKERED_PINK_CONCRETE))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CHECKERED_PINK_CONCRETE_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PINK_CONCRETE_STAIRS, DecoBlocks.CHECKERED_PINK_CONCRETE);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PINK_CONCRETE_SLAB, DecoBlocks.CHECKERED_PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PINK_CONCRETE_SLAB, DecoBlocks.CHECKERED_PINK_CONCRETE,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.CHECKERED_PINK_CONCRETE_WALL, DecoBlocks.CHECKERED_PINK_CONCRETE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHECKERED_PINK_CONCRETE_WALL, DecoBlocks.CHECKERED_PINK_CONCRETE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLUE_DYE)
                .input(DecoBlocks.IRIS)
                .group("blue_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.IRIS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.IRIS))
                .offerTo(exporter, Identifier.of("blue_dye_from_iris"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_BLUE_DYE)
                .input(DecoBlocks.BLUE_DELPHINIUM)
                .group("light_blue_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_DELPHINIUM),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_DELPHINIUM))
                .offerTo(exporter, Identifier.of("light_blue_dye_from_blue_delphinium"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.CYAN_DYE)
                .input(DecoBlocks.CYAN_ORCHID)
                .group("cyan_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.CYAN_ORCHID),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CYAN_ORCHID))
                .offerTo(exporter, Identifier.of("cyan_dye_from_cyan_orchid"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BLUE_DYE)
                .input(DecoBlocks.FELICIA_DAISY)
                .group("blue_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.FELICIA_DAISY),
                        RecipeProvider.conditionsFromItem(DecoBlocks.FELICIA_DAISY))
                .offerTo(exporter, Identifier.of("blue_dye_from_felicia_daisy"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BROWN_DYE,2)
                .input(DecoBlocks.MEGA_BROWN_TULIP)
                .group("brown_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.MEGA_BROWN_TULIP),
                        RecipeProvider.conditionsFromItem(DecoBlocks.MEGA_BROWN_TULIP))
                .offerTo(exporter, Identifier.of("brown_dye_from_mega_brown_tulip"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.JACK_O_SOUL_LANTERN)
                .input(Items.CARVED_PUMPKIN)
                .input(Items.SOUL_TORCH)
                .criterion(RecipeProvider.hasItem(Items.SOUL_TORCH),
                        RecipeProvider.conditionsFromItem(Items.SOUL_TORCH))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.JACK_O_SOUL_LANTERN)));

        offerPillarBlockRecipe(exporter, DecoBlocks.NETHER_BRICK_PILLAR, Items.NETHER_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.NETHER_BRICK_PILLAR, Items.NETHER_BRICKS);
        offerPillarBlockRecipe(exporter, DecoBlocks.RED_NETHER_BRICK_PILLAR, Items.RED_NETHER_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RED_NETHER_BRICK_PILLAR, Items.RED_NETHER_BRICKS);
        offerPillarBlockRecipe(exporter, DecoBlocks.BLUE_NETHER_BRICK_PILLAR, DecoBlocks.BLUE_NETHER_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLUE_NETHER_BRICK_PILLAR, DecoBlocks.BLUE_NETHER_BRICKS);

        offerPillarBlockRecipe(exporter, DecoBlocks.VOID_STONE_BRICK_PILLAR, DecoBlocks.VOID_STONE_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR, DecoBlocks.VOID_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR, DecoBlocks.VOID_STONE_BRICKS);

        createStairsRecipe(DecoBlocks.VOID_STONE_BRICK_PILLAR_STAIRS, Ingredient.ofItems(DecoBlocks.VOID_STONE_BRICK_PILLAR))
                .criterion(hasItem(DecoBlocks.VOID_STONE_BRICK_PILLAR),conditionsFromItem(DecoBlocks.VOID_STONE_BRICK_PILLAR))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.VOID_STONE_BRICK_PILLAR_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_STAIRS, DecoBlocks.VOID_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_STAIRS, DecoBlocks.VOID_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_STAIRS, DecoBlocks.VOID_STONE_BRICK_PILLAR);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_SLAB, DecoBlocks.VOID_STONE_BRICK_PILLAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_SLAB, DecoBlocks.VOID_STONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_SLAB, DecoBlocks.VOID_STONE_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_SLAB, DecoBlocks.VOID_STONE_BRICK_PILLAR,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.VOID_STONE_BRICK_PILLAR_WALL, DecoBlocks.VOID_STONE_BRICK_PILLAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_WALL, DecoBlocks.VOID_STONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_WALL, DecoBlocks.VOID_STONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.VOID_STONE_BRICK_PILLAR_WALL, DecoBlocks.VOID_STONE_BRICK_PILLAR);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICKS,3)
                .pattern("##")
                .pattern("--")
                .input('-', DecoBlocks.DRIPSTONE_SLAB)
                .input('#', Items.DRIPSTONE_BLOCK)
                .criterion(RecipeProvider.hasItem(Items.DRIPSTONE_BLOCK),
                        RecipeProvider.conditionsFromItem(Items.DRIPSTONE_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DRIPSTONE_BRICKS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICKS, Items.DRIPSTONE_BLOCK);

        createStairsRecipe(DecoBlocks.DRIPSTONE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.DRIPSTONE_BRICKS))
                .criterion(hasItem(DecoBlocks.DRIPSTONE_BRICKS),conditionsFromItem(DecoBlocks.DRIPSTONE_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DRIPSTONE_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_STAIRS, Items.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_STAIRS, DecoBlocks.DRIPSTONE_BRICKS);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_SLAB, DecoBlocks.DRIPSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_SLAB, Items.DRIPSTONE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_SLAB, DecoBlocks.DRIPSTONE_BRICKS,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DRIPSTONE_BRICK_WALL, DecoBlocks.DRIPSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_WALL, Items.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_WALL, DecoBlocks.DRIPSTONE_BRICKS);

        offerPillarBlockRecipe(exporter, DecoBlocks.DRIPSTONE_BRICK_PILLAR, DecoBlocks.DRIPSTONE_BRICK_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR, Items.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR, DecoBlocks.DRIPSTONE_BRICKS);

        createStairsRecipe(DecoBlocks.DRIPSTONE_BRICK_PILLAR_STAIRS, Ingredient.ofItems(DecoBlocks.DRIPSTONE_BRICK_PILLAR))
                .criterion(hasItem(DecoBlocks.DRIPSTONE_BRICK_PILLAR),conditionsFromItem(DecoBlocks.DRIPSTONE_BRICK_PILLAR))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DRIPSTONE_BRICK_PILLAR_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_STAIRS, Items.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_STAIRS, DecoBlocks.DRIPSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_STAIRS, DecoBlocks.DRIPSTONE_BRICK_PILLAR);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_SLAB, DecoBlocks.DRIPSTONE_BRICK_PILLAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_SLAB, Items.DRIPSTONE_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_SLAB, DecoBlocks.DRIPSTONE_BRICKS,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_SLAB, DecoBlocks.DRIPSTONE_BRICK_PILLAR,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_WALL, DecoBlocks.DRIPSTONE_BRICK_PILLAR);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_WALL, Items.DRIPSTONE_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_WALL, DecoBlocks.DRIPSTONE_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DRIPSTONE_BRICK_PILLAR_WALL, DecoBlocks.DRIPSTONE_BRICK_PILLAR);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CASTED_IRON,4)
                .pattern("---")
                .pattern("-#-")
                .pattern("---")
                .input('-', DecoBlocks.IRON_SLAB)
                .input('#', Items.IRON_BLOCK)
                .criterion(RecipeProvider.hasItem(Items.IRON_BLOCK),
                        RecipeProvider.conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CASTED_IRON)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CASTED_IRON, Items.IRON_BLOCK);

        createStairsRecipe(DecoBlocks.CASTED_IRON_STAIRS, Ingredient.ofItems(DecoBlocks.CASTED_IRON))
                .criterion(hasItem(DecoBlocks.CASTED_IRON),conditionsFromItem(DecoBlocks.CASTED_IRON))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.CASTED_IRON_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CASTED_IRON_STAIRS, Items.IRON_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CASTED_IRON_STAIRS, DecoBlocks.CASTED_IRON);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CASTED_IRON_SLAB, DecoBlocks.CASTED_IRON);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CASTED_IRON_SLAB, Items.IRON_BLOCK,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CASTED_IRON_SLAB, DecoBlocks.CASTED_IRON,2);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_DRIPSTONE, DecoBlocks.DRIPSTONE_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_DRIPSTONE, Items.DRIPSTONE_BLOCK);

        createStairsRecipe(DecoBlocks.TUBE_CORAL_STAIRS, Ingredient.ofItems(Items.TUBE_CORAL_BLOCK))
                .criterion(hasItem(Items.TUBE_CORAL_BLOCK),conditionsFromItem(Items.TUBE_CORAL_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.TUBE_CORAL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.TUBE_CORAL_STAIRS, Items.TUBE_CORAL_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.TUBE_CORAL_SLAB, Items.TUBE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.TUBE_CORAL_SLAB, Items.TUBE_CORAL_BLOCK,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.TUBE_CORAL_WALL, Items.TUBE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.TUBE_CORAL_WALL, Items.TUBE_CORAL_BLOCK);

        createStairsRecipe(DecoBlocks.BRAIN_CORAL_STAIRS, Ingredient.ofItems(Items.BRAIN_CORAL_BLOCK))
                .criterion(hasItem(Items.BRAIN_CORAL_BLOCK),conditionsFromItem(Items.BRAIN_CORAL_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.BRAIN_CORAL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BRAIN_CORAL_STAIRS, Items.BRAIN_CORAL_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BRAIN_CORAL_SLAB, Items.BRAIN_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BRAIN_CORAL_SLAB, Items.BRAIN_CORAL_BLOCK,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.BRAIN_CORAL_WALL, Items.BRAIN_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BRAIN_CORAL_WALL, Items.BRAIN_CORAL_BLOCK);

        createStairsRecipe(DecoBlocks.BUBBLE_CORAL_STAIRS, Ingredient.ofItems(Items.BUBBLE_CORAL_BLOCK))
                .criterion(hasItem(Items.BUBBLE_CORAL_BLOCK),conditionsFromItem(Items.BUBBLE_CORAL_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.BUBBLE_CORAL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BUBBLE_CORAL_STAIRS, Items.BUBBLE_CORAL_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BUBBLE_CORAL_SLAB, Items.BUBBLE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BUBBLE_CORAL_SLAB, Items.BUBBLE_CORAL_BLOCK,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.BUBBLE_CORAL_WALL, Items.BUBBLE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BUBBLE_CORAL_WALL, Items.BUBBLE_CORAL_BLOCK);

        createStairsRecipe(DecoBlocks.FIRE_CORAL_STAIRS, Ingredient.ofItems(Items.FIRE_CORAL_BLOCK))
                .criterion(hasItem(Items.FIRE_CORAL_BLOCK),conditionsFromItem(Items.FIRE_CORAL_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.FIRE_CORAL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.FIRE_CORAL_STAIRS, Items.FIRE_CORAL_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.FIRE_CORAL_SLAB, Items.FIRE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.FIRE_CORAL_SLAB, Items.FIRE_CORAL_BLOCK,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.FIRE_CORAL_WALL, Items.FIRE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.FIRE_CORAL_WALL, Items.FIRE_CORAL_BLOCK);

        createStairsRecipe(DecoBlocks.HORN_CORAL_STAIRS, Ingredient.ofItems(Items.HORN_CORAL_BLOCK))
                .criterion(hasItem(Items.HORN_CORAL_BLOCK),conditionsFromItem(Items.HORN_CORAL_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.HORN_CORAL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HORN_CORAL_STAIRS, Items.HORN_CORAL_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HORN_CORAL_SLAB, Items.HORN_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HORN_CORAL_SLAB, Items.HORN_CORAL_BLOCK,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.HORN_CORAL_WALL, Items.HORN_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HORN_CORAL_WALL, Items.HORN_CORAL_BLOCK);

        createStairsRecipe(DecoBlocks.DEAD_TUBE_CORAL_STAIRS, Ingredient.ofItems(Items.DEAD_TUBE_CORAL_BLOCK))
                .criterion(hasItem(Items.DEAD_TUBE_CORAL_BLOCK),conditionsFromItem(Items.DEAD_TUBE_CORAL_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DEAD_TUBE_CORAL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_TUBE_CORAL_STAIRS, Items.DEAD_TUBE_CORAL_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_TUBE_CORAL_SLAB, Items.DEAD_TUBE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_TUBE_CORAL_SLAB, Items.DEAD_TUBE_CORAL_BLOCK,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DEAD_TUBE_CORAL_WALL, Items.DEAD_TUBE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_TUBE_CORAL_WALL, Items.DEAD_TUBE_CORAL_BLOCK);

        createStairsRecipe(DecoBlocks.DEAD_BRAIN_CORAL_STAIRS, Ingredient.ofItems(Items.DEAD_BRAIN_CORAL_BLOCK))
                .criterion(hasItem(Items.DEAD_BRAIN_CORAL_BLOCK),conditionsFromItem(Items.DEAD_BRAIN_CORAL_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DEAD_BRAIN_CORAL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BRAIN_CORAL_STAIRS, Items.DEAD_BRAIN_CORAL_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BRAIN_CORAL_SLAB, Items.DEAD_BRAIN_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BRAIN_CORAL_SLAB, Items.DEAD_BRAIN_CORAL_BLOCK,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DEAD_BRAIN_CORAL_WALL, Items.DEAD_BRAIN_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BRAIN_CORAL_WALL, Items.DEAD_BRAIN_CORAL_BLOCK);

        createStairsRecipe(DecoBlocks.DEAD_BUBBLE_CORAL_STAIRS, Ingredient.ofItems(Items.DEAD_BUBBLE_CORAL_BLOCK))
                .criterion(hasItem(Items.DEAD_BUBBLE_CORAL_BLOCK),conditionsFromItem(Items.DEAD_BUBBLE_CORAL_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DEAD_BUBBLE_CORAL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BUBBLE_CORAL_STAIRS, Items.DEAD_BUBBLE_CORAL_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BUBBLE_CORAL_SLAB, Items.DEAD_BUBBLE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BUBBLE_CORAL_SLAB, Items.DEAD_BUBBLE_CORAL_BLOCK,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DEAD_BUBBLE_CORAL_WALL, Items.DEAD_BUBBLE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_BUBBLE_CORAL_WALL, Items.DEAD_BUBBLE_CORAL_BLOCK);

        createStairsRecipe(DecoBlocks.DEAD_FIRE_CORAL_STAIRS, Ingredient.ofItems(Items.DEAD_FIRE_CORAL_BLOCK))
                .criterion(hasItem(Items.DEAD_FIRE_CORAL_BLOCK),conditionsFromItem(Items.DEAD_FIRE_CORAL_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DEAD_FIRE_CORAL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_FIRE_CORAL_STAIRS, Items.DEAD_FIRE_CORAL_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_FIRE_CORAL_SLAB, Items.DEAD_FIRE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_FIRE_CORAL_SLAB, Items.DEAD_FIRE_CORAL_BLOCK,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DEAD_FIRE_CORAL_WALL, Items.DEAD_FIRE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_FIRE_CORAL_WALL, Items.DEAD_FIRE_CORAL_BLOCK);

        createStairsRecipe(DecoBlocks.DEAD_HORN_CORAL_STAIRS, Ingredient.ofItems(Items.DEAD_HORN_CORAL_BLOCK))
                .criterion(hasItem(Items.DEAD_HORN_CORAL_BLOCK),conditionsFromItem(Items.DEAD_HORN_CORAL_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.DEAD_HORN_CORAL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_HORN_CORAL_STAIRS, Items.DEAD_HORN_CORAL_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_HORN_CORAL_SLAB, Items.DEAD_HORN_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_HORN_CORAL_SLAB, Items.DEAD_HORN_CORAL_BLOCK,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.DEAD_HORN_CORAL_WALL, Items.DEAD_HORN_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEAD_HORN_CORAL_WALL, Items.DEAD_HORN_CORAL_BLOCK);

        offerHydratingRecipe(exporter, Items.TUBE_CORAL, Items.DEAD_TUBE_CORAL);
        offerHydratingRecipe(exporter, Items.BRAIN_CORAL, Items.DEAD_BRAIN_CORAL);
        offerHydratingRecipe(exporter, Items.BUBBLE_CORAL, Items.DEAD_BUBBLE_CORAL);
        offerHydratingRecipe(exporter, Items.FIRE_CORAL, Items.DEAD_FIRE_CORAL);
        offerHydratingRecipe(exporter, Items.HORN_CORAL, Items.DEAD_HORN_CORAL);

        offerHydratingRecipe(exporter, Items.TUBE_CORAL_FAN, Items.DEAD_TUBE_CORAL_FAN);
        offerHydratingRecipe(exporter, Items.BRAIN_CORAL_FAN, Items.DEAD_BRAIN_CORAL_FAN);
        offerHydratingRecipe(exporter, Items.BUBBLE_CORAL_FAN, Items.DEAD_BUBBLE_CORAL_FAN);
        offerHydratingRecipe(exporter, Items.FIRE_CORAL_FAN, Items.DEAD_FIRE_CORAL_FAN);
        offerHydratingRecipe(exporter, Items.HORN_CORAL_FAN, Items.DEAD_HORN_CORAL_FAN);

        offerHydratingRecipe(exporter, Items.TUBE_CORAL_BLOCK, Items.DEAD_TUBE_CORAL_BLOCK);
        offerHydratingRecipe(exporter, Items.BRAIN_CORAL_BLOCK, Items.DEAD_BRAIN_CORAL_BLOCK);
        offerHydratingRecipe(exporter, Items.BUBBLE_CORAL_BLOCK, Items.DEAD_BUBBLE_CORAL_BLOCK);
        offerHydratingRecipe(exporter, Items.FIRE_CORAL_BLOCK, Items.DEAD_FIRE_CORAL_BLOCK);
        offerHydratingRecipe(exporter, Items.HORN_CORAL_BLOCK, Items.DEAD_HORN_CORAL_BLOCK);

        offerHydratingRecipe(exporter, DecoBlocks.TUBE_CORAL_STAIRS, DecoBlocks.DEAD_TUBE_CORAL_STAIRS);
        offerHydratingRecipe(exporter, DecoBlocks.BRAIN_CORAL_STAIRS, DecoBlocks.DEAD_BRAIN_CORAL_STAIRS);
        offerHydratingRecipe(exporter, DecoBlocks.BUBBLE_CORAL_STAIRS, DecoBlocks.DEAD_BUBBLE_CORAL_STAIRS);
        offerHydratingRecipe(exporter, DecoBlocks.FIRE_CORAL_STAIRS, DecoBlocks.DEAD_FIRE_CORAL_STAIRS);
        offerHydratingRecipe(exporter, DecoBlocks.HORN_CORAL_STAIRS, DecoBlocks.DEAD_HORN_CORAL_STAIRS);

        offerHydratingRecipe(exporter, DecoBlocks.TUBE_CORAL_SLAB, DecoBlocks.DEAD_TUBE_CORAL_SLAB);
        offerHydratingRecipe(exporter, DecoBlocks.BRAIN_CORAL_SLAB, DecoBlocks.DEAD_BRAIN_CORAL_SLAB);
        offerHydratingRecipe(exporter, DecoBlocks.BUBBLE_CORAL_SLAB, DecoBlocks.DEAD_BUBBLE_CORAL_SLAB);
        offerHydratingRecipe(exporter, DecoBlocks.FIRE_CORAL_SLAB, DecoBlocks.DEAD_FIRE_CORAL_SLAB);
        offerHydratingRecipe(exporter, DecoBlocks.HORN_CORAL_SLAB, DecoBlocks.DEAD_HORN_CORAL_SLAB);

        offerHydratingRecipe(exporter, DecoBlocks.TUBE_CORAL_WALL, DecoBlocks.DEAD_TUBE_CORAL_WALL);
        offerHydratingRecipe(exporter, DecoBlocks.BRAIN_CORAL_WALL, DecoBlocks.DEAD_BRAIN_CORAL_WALL);
        offerHydratingRecipe(exporter, DecoBlocks.BUBBLE_CORAL_WALL, DecoBlocks.DEAD_BUBBLE_CORAL_WALL);
        offerHydratingRecipe(exporter, DecoBlocks.FIRE_CORAL_WALL, DecoBlocks.DEAD_FIRE_CORAL_WALL);
        offerHydratingRecipe(exporter, DecoBlocks.HORN_CORAL_WALL, DecoBlocks.DEAD_HORN_CORAL_WALL);

        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_TUBE_CORAL, Items.TUBE_CORAL);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_BRAIN_CORAL, Items.BRAIN_CORAL);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_BUBBLE_CORAL, Items.BUBBLE_CORAL);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_FIRE_CORAL, Items.FIRE_CORAL);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_HORN_CORAL, Items.HORN_CORAL);

        offerHydratingRecipe(exporter, DecoItems.HYDRATED_TUBE_CORAL_FAN, Items.TUBE_CORAL_FAN);
        offerHydratingRecipe(exporter, DecoItems.HYDRATED_BRAIN_CORAL_FAN, Items.BRAIN_CORAL_FAN);
        offerHydratingRecipe(exporter, DecoItems.HYDRATED_BUBBLE_CORAL_FAN, Items.BUBBLE_CORAL_FAN);
        offerHydratingRecipe(exporter, DecoItems.HYDRATED_FIRE_CORAL_FAN, Items.FIRE_CORAL_FAN);
        offerHydratingRecipe(exporter, DecoItems.HYDRATED_HORN_CORAL_FAN, Items.HORN_CORAL_FAN);

        offerReversibleCompactingFourRecipes(exporter,DecoBlocks.HYDRATED_BUBBLE_CORAL, DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK,
                "hydrated_bubble_coral_block","coral_block",
                "hydrated_bubble_coral","coral");

        offerReversibleCompactingFourRecipes(exporter,DecoBlocks.HYDRATED_TUBE_CORAL, DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK,
                "hydrated_tube_coral_block","coral_block",
                "hydrated_tube_coral","coral");

        offerReversibleCompactingFourRecipes(exporter,DecoBlocks.HYDRATED_HORN_CORAL, DecoBlocks.HYDRATED_HORN_CORAL_BLOCK,
                "hydrated_horn_coral_block","coral_block",
                "hydrated_horn_coral","coral");

        offerReversibleCompactingFourRecipes(exporter,DecoBlocks.HYDRATED_BRAIN_CORAL, DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK,
                "hydrated_brain_coral_block","coral_block",
                "hydrated_brain_coral","coral");

        offerReversibleCompactingFourRecipes(exporter,DecoBlocks.HYDRATED_FIRE_CORAL, DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK,
                "hydrated_fire_coral_block","coral_block",
                "hydrated_fire_coral","coral");

        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK, Items.TUBE_CORAL_BLOCK);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK, Items.BRAIN_CORAL_BLOCK);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK, Items.BUBBLE_CORAL_BLOCK);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK, Items.FIRE_CORAL_BLOCK);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_HORN_CORAL_BLOCK, Items.HORN_CORAL_BLOCK);

        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_TUBE_CORAL_STAIRS, DecoBlocks.TUBE_CORAL_STAIRS);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_BRAIN_CORAL_STAIRS, DecoBlocks.BRAIN_CORAL_STAIRS);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_BUBBLE_CORAL_STAIRS, DecoBlocks.BUBBLE_CORAL_STAIRS);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_FIRE_CORAL_STAIRS, DecoBlocks.FIRE_CORAL_STAIRS);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_HORN_CORAL_STAIRS, DecoBlocks.HORN_CORAL_STAIRS);

        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_TUBE_CORAL_SLAB, DecoBlocks.TUBE_CORAL_SLAB);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_BRAIN_CORAL_SLAB, DecoBlocks.BRAIN_CORAL_SLAB);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_BUBBLE_CORAL_SLAB, DecoBlocks.BUBBLE_CORAL_SLAB);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_FIRE_CORAL_SLAB, DecoBlocks.FIRE_CORAL_SLAB);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_HORN_CORAL_SLAB, DecoBlocks.HORN_CORAL_SLAB);

        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_TUBE_CORAL_WALL, DecoBlocks.TUBE_CORAL_WALL);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_BRAIN_CORAL_WALL, DecoBlocks.BRAIN_CORAL_WALL);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL, DecoBlocks.BUBBLE_CORAL_WALL);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_FIRE_CORAL_WALL, DecoBlocks.FIRE_CORAL_WALL);
        offerHydratingRecipe(exporter, DecoBlocks.HYDRATED_HORN_CORAL_WALL, DecoBlocks.HORN_CORAL_WALL);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.HYDRATED_BUBBLE_CORAL)
                .pattern("#")
                .pattern("#")
                .input('#', DecoItems.HYDRATED_BUBBLE_CORAL_FAN)
                .criterion(RecipeProvider.hasItem(DecoItems.HYDRATED_BUBBLE_CORAL_FAN),
                        RecipeProvider.conditionsFromItem(DecoItems.HYDRATED_BUBBLE_CORAL_FAN))
                .offerTo(exporter, Identifier.of("hydrated_bubble_coral_from_fan"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HYDRATED_TUBE_CORAL)
                .pattern("#")
                .pattern("#")
                .input('#', DecoItems.HYDRATED_TUBE_CORAL_FAN)
                .group("coral")
                .criterion(RecipeProvider.hasItem(DecoItems.HYDRATED_TUBE_CORAL_FAN),
                        RecipeProvider.conditionsFromItem(DecoItems.HYDRATED_TUBE_CORAL_FAN))
                .offerTo(exporter, Identifier.of("hydrated_tube_coral_from_fan"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HYDRATED_BRAIN_CORAL)
                .pattern("#")
                .pattern("#")
                .input('#', DecoItems.HYDRATED_BRAIN_CORAL_FAN)
                .group("coral")
                .criterion(RecipeProvider.hasItem(DecoItems.HYDRATED_BRAIN_CORAL_FAN),
                        RecipeProvider.conditionsFromItem(DecoItems.HYDRATED_BRAIN_CORAL_FAN))
                .offerTo(exporter, Identifier.of("hydrated_brain_coral_from_fan"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HYDRATED_FIRE_CORAL)
                .pattern("#")
                .pattern("#")
                .input('#', DecoItems.HYDRATED_FIRE_CORAL_FAN)
                .group("coral")
                .criterion(RecipeProvider.hasItem(DecoItems.HYDRATED_FIRE_CORAL_FAN),
                        RecipeProvider.conditionsFromItem(DecoItems.HYDRATED_FIRE_CORAL_FAN))
                .offerTo(exporter, Identifier.of("hydrated_fire_coral_from_fan"));
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.HYDRATED_HORN_CORAL)
                .pattern("#")
                .pattern("#")
                .input('#', DecoItems.HYDRATED_HORN_CORAL_FAN)
                .group("coral")
                .criterion(RecipeProvider.hasItem(DecoItems.HYDRATED_HORN_CORAL_FAN),
                        RecipeProvider.conditionsFromItem(DecoItems.HYDRATED_HORN_CORAL_FAN))
                .offerTo(exporter, Identifier.of("hydrated_horn_coral_from_fan"));

        createStairsRecipe(DecoBlocks.HYDRATED_TUBE_CORAL_STAIRS, Ingredient.ofItems(DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK))
                .criterion(hasItem(DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK),conditionsFromItem(DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.HYDRATED_TUBE_CORAL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_TUBE_CORAL_STAIRS,DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_TUBE_CORAL_SLAB, DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_TUBE_CORAL_SLAB, DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.HYDRATED_TUBE_CORAL_WALL, DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_TUBE_CORAL_WALL, DecoBlocks.HYDRATED_TUBE_CORAL_BLOCK);

        createStairsRecipe(DecoBlocks.HYDRATED_BRAIN_CORAL_STAIRS, Ingredient.ofItems(DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK))
                .criterion(hasItem(DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK),conditionsFromItem(DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.HYDRATED_BRAIN_CORAL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BRAIN_CORAL_STAIRS, DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BRAIN_CORAL_SLAB, DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BRAIN_CORAL_SLAB, DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.HYDRATED_BRAIN_CORAL_WALL, DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BRAIN_CORAL_WALL, DecoBlocks.HYDRATED_BRAIN_CORAL_BLOCK);

        createStairsRecipe(DecoBlocks.HYDRATED_BUBBLE_CORAL_STAIRS, Ingredient.ofItems(DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK))
                .criterion(hasItem(DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK),conditionsFromItem(DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.HYDRATED_BUBBLE_CORAL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BUBBLE_CORAL_STAIRS, DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BUBBLE_CORAL_SLAB, DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BUBBLE_CORAL_SLAB, DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL, DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_BUBBLE_CORAL_WALL, DecoBlocks.HYDRATED_BUBBLE_CORAL_BLOCK);

        createStairsRecipe(DecoBlocks.HYDRATED_FIRE_CORAL_STAIRS, Ingredient.ofItems(DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK))
                .criterion(hasItem(DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK),conditionsFromItem(DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.HYDRATED_FIRE_CORAL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_FIRE_CORAL_STAIRS, DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_FIRE_CORAL_SLAB, DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_FIRE_CORAL_SLAB, DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.HYDRATED_FIRE_CORAL_WALL, DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_FIRE_CORAL_WALL, DecoBlocks.HYDRATED_FIRE_CORAL_BLOCK);

        createStairsRecipe(DecoBlocks.HYDRATED_HORN_CORAL_STAIRS, Ingredient.ofItems(DecoBlocks.HYDRATED_HORN_CORAL_BLOCK))
                .criterion(hasItem(DecoBlocks.HYDRATED_HORN_CORAL_BLOCK),conditionsFromItem(DecoBlocks.HYDRATED_HORN_CORAL_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.HYDRATED_HORN_CORAL_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_HORN_CORAL_STAIRS, DecoBlocks.HYDRATED_HORN_CORAL_BLOCK);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_HORN_CORAL_SLAB, DecoBlocks.HYDRATED_HORN_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_HORN_CORAL_SLAB, DecoBlocks.HYDRATED_HORN_CORAL_BLOCK,2);

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.HYDRATED_HORN_CORAL_WALL, DecoBlocks.HYDRATED_HORN_CORAL_BLOCK);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HYDRATED_HORN_CORAL_WALL, DecoBlocks.HYDRATED_HORN_CORAL_BLOCK);

        createStairsRecipe(DecoBlocks.HAY_STAIRS, Ingredient.ofItems(Items.HAY_BLOCK))
                .criterion(hasItem(Items.HAY_BLOCK),conditionsFromItem(Items.HAY_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.HAY_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HAY_SLAB, Items.HAY_BLOCK);
        offerCarpetRecipe(exporter, DecoBlocks.HAY_CARPET, Items.HAY_BLOCK);

        createStairsRecipe(DecoBlocks.NETHER_WART_STAIRS, Ingredient.ofItems(Items.NETHER_WART_BLOCK))
                .criterion(hasItem(Items.NETHER_WART_BLOCK),conditionsFromItem(Items.NETHER_WART_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.NETHER_WART_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.NETHER_WART_SLAB, Items.NETHER_WART_BLOCK);

        createStairsRecipe(DecoBlocks.WARPED_WART_STAIRS, Ingredient.ofItems(Items.WARPED_WART_BLOCK))
                .criterion(hasItem(Items.WARPED_WART_BLOCK),conditionsFromItem(Items.WARPED_WART_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.WARPED_WART_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WARPED_WART_SLAB, Items.WARPED_WART_BLOCK);

        createStairsRecipe(DecoBlocks.SCULK_STAIRS, Ingredient.ofItems(Items.SCULK))
                .criterion(hasItem(Items.SCULK),conditionsFromItem(Items.SCULK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SCULK_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SCULK_SLAB, Items.SCULK);
        offerCarpetRecipe(exporter, DecoBlocks.SCULK_CARPET, Items.SCULK);

        createStairsRecipe(DecoBlocks.HONEYCOMB_STAIRS, Ingredient.ofItems(Items.HONEYCOMB_BLOCK))
                .criterion(hasItem(Items.HONEYCOMB_BLOCK),conditionsFromItem(Items.HONEYCOMB_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.HONEYCOMB_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.HONEYCOMB_SLAB, Items.HONEYCOMB_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.HONEYCOMB_WALL, Items.HONEYCOMB_BLOCK);

        createStairsRecipe(DecoBlocks.BAMBOO_BLOCK_STAIRS, Ingredient.ofItems(Items.BAMBOO_BLOCK))
                .criterion(hasItem(Items.BAMBOO_BLOCK),conditionsFromItem(Items.BAMBOO_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.BAMBOO_BLOCK_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BAMBOO_BLOCK_SLAB, Items.BAMBOO_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.BAMBOO_BLOCK_WALL, Items.BAMBOO_BLOCK);

        createStairsRecipe(DecoBlocks.STRIPPED_BAMBOO_STAIRS, Ingredient.ofItems(Items.STRIPPED_BAMBOO_BLOCK))
                .criterion(hasItem(Items.STRIPPED_BAMBOO_BLOCK),conditionsFromItem(Items.STRIPPED_BAMBOO_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.STRIPPED_BAMBOO_STAIRS)));
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_BAMBOO_SLAB, Items.STRIPPED_BAMBOO_BLOCK);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_BAMBOO_WALL, Items.STRIPPED_BAMBOO_BLOCK);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_TUFF_BRICKS)
                .input(Items.MOSS_BLOCK)
                .input(Items.TUFF_BRICKS)
                .criterion(RecipeProvider.hasItem(Items.MOSS_BLOCK),
                        RecipeProvider.conditionsFromItem(Items.MOSS_BLOCK))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.MOSSY_TUFF_BRICKS)));

        createStairsRecipe(DecoBlocks.MOSSY_TUFF_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.MOSSY_TUFF_BRICKS))
                .criterion(hasItem(DecoBlocks.MOSSY_TUFF_BRICKS),conditionsFromItem(DecoBlocks.MOSSY_TUFF_BRICKS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.MOSSY_TUFF_BRICK_STAIRS)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_TUFF_BRICK_STAIRS, DecoBlocks.MOSSY_TUFF_BRICKS);
        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_TUFF_BRICK_SLAB, DecoBlocks.MOSSY_TUFF_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MOSSY_TUFF_BRICK_SLAB, DecoBlocks.MOSSY_TUFF_BRICKS,2);
        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_TUFF_BRICK_WALL, DecoBlocks.MOSSY_TUFF_BRICKS);
        offerStonecuttingRecipe(exporter, RecipeCategory.DECORATIONS, DecoBlocks.MOSSY_TUFF_BRICK_WALL, DecoBlocks.MOSSY_TUFF_BRICKS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,Items.HANGING_ROOTS, 16)
                .input('#', ItemTags.LOGS_THAT_BURN)
                .input('/', Items.STICK)
                .pattern("/#/")
                .pattern(" / ")
                .criterion("has_logs", conditionsFromTag(ItemTags.LOGS_THAT_BURN))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(Items.HANGING_ROOTS)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, DecoBlocks.BROWN_BLOCK,2)
                .input(DecoBlocks.YELLOW_BLOCK)
                .input(DecoBlocks.PURPLE_BLOCK)
                .group("brown_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.YELLOW_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.YELLOW_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.PURPLE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.PURPLE_BLOCK))
                .offerTo(exporter, Identifier.of("brown_block_from_purple_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BROWN_DYE,2)
                .input(Items.YELLOW_DYE)
                .input(Items.PURPLE_DYE)
                .group("brown_dye")
                .criterion(RecipeProvider.hasItem(Items.YELLOW_DYE),
                        RecipeProvider.conditionsFromItem(Items.YELLOW_DYE))
                .criterion(RecipeProvider.hasItem(Items.PURPLE_DYE),
                        RecipeProvider.conditionsFromItem(Items.PURPLE_DYE))
                .offerTo(exporter, Identifier.of("brown_dye_from_purple_dye"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, DecoBlocks.BROWN_BLOCK,2)
                .input(DecoBlocks.BLUE_BLOCK)
                .input(DecoBlocks.ORANGE_BLOCK)
                .group("brown_block")
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLUE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLUE_BLOCK))
                .criterion(RecipeProvider.hasItem(DecoBlocks.ORANGE_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.ORANGE_BLOCK))
                .offerTo(exporter, Identifier.of("brown_block_from_orange_block"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BROWN_DYE,2)
                .input(Items.BLUE_DYE)
                .input(Items.ORANGE_DYE)
                .group("brown_dye")
                .criterion(RecipeProvider.hasItem(Items.BLUE_DYE),
                        RecipeProvider.conditionsFromItem(Items.BLUE_DYE))
                .criterion(RecipeProvider.hasItem(Items.ORANGE_DYE),
                        RecipeProvider.conditionsFromItem(Items.ORANGE_DYE))
                .offerTo(exporter, Identifier.of("brown_dye_from_orange_dye"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.COBWEB)
                .pattern(" / ")
                .pattern("/ /")
                .pattern(" / ")
                .input('/', Items.STRING)
                .criterion(RecipeProvider.hasItem(Items.STRING),
                        RecipeProvider.conditionsFromItem(Items.STRING))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(Items.COBWEB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.GLOWING_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.GLOWSTONE_DUST)
                .input('X', Items.GLASS)
                .criterion(RecipeProvider.hasItem(Items.GLOWSTONE_DUST),
                        RecipeProvider.conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.GLOWING_GLASS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.GLOWING_GLASS_PANE,6)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.GLOWSTONE_DUST)
                .input('X', Items.GLASS_PANE)
                .group("glowing_glass_pane")
                .criterion(RecipeProvider.hasItem(Items.GLOWSTONE_DUST),
                        RecipeProvider.conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, Identifier.of("glowing_glass_pane_glowstone_dust"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,DecoBlocks.GLOWING_GLASS_PANE,18)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.GLOWING_GLASS)
                .group("glowing_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.GLOWING_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.GLOWING_GLASS))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.GLOWING_GLASS_PANE)));

        offerHardenedGlassRecipe(exporter,DecoBlocks.HARDENED_GLOWING_GLASS, DecoBlocks.GLOWING_GLASS);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.HARDENED_GLOWING_GLASS,2)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.GLOWSTONE_DUST)
                .input('X', DecoBlocks.HARDENED_GLASS)
                .group("hardened_glass")
                .criterion(RecipeProvider.hasItem(Items.GLOWSTONE_DUST),
                        RecipeProvider.conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_GLOWING_GLASS)));

        offerHardenedGlassPaneRecipe(exporter,DecoBlocks.HARDENED_GLOWING_GLASS_PANE, DecoBlocks.GLOWING_GLASS_PANE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.HARDENED_GLOWING_GLASS_PANE,6)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.GLOWSTONE_DUST)
                .input('X', DecoBlocks.HARDENED_GLASS_PANE)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(Items.GLOWSTONE_DUST),
                        RecipeProvider.conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter, Identifier.of("hardened_glowing_glass_pane_glowstone_dust"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.HARDENED_GLOWING_GLASS_PANE,18)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.HARDENED_GLOWING_GLASS)
                .group("hardened_glass_pane")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HARDENED_GLOWING_GLASS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HARDENED_GLOWING_GLASS))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.HARDENED_GLOWING_GLASS_PANE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GRAY_DYE)
                .input(DecoBlocks.TAIGA_DANDELION)
                .group("gray_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.TAIGA_DANDELION),
                        RecipeProvider.conditionsFromItem(DecoBlocks.TAIGA_DANDELION))
                .offerTo(exporter, Identifier.of("gray_dye_from_taiga_dandelion"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.GREEN_DYE)
                .input(DecoBlocks.FERN_LAVENDER)
                .group("green_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.FERN_LAVENDER),
                        RecipeProvider.conditionsFromItem(DecoBlocks.FERN_LAVENDER))
                .offerTo(exporter, Identifier.of("green_dye_from_fern_lavender"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.BROWN_DYE)
                .input(DecoBlocks.CARAMEL_BUTTERCUP)
                .group("brown_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.CARAMEL_BUTTERCUP),
                        RecipeProvider.conditionsFromItem(DecoBlocks.CARAMEL_BUTTERCUP))
                .offerTo(exporter, Identifier.of("brown_dye_from_caramel_buttercup"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.LIGHT_GRAY_DYE)
                .input(DecoBlocks.SILVER_ROSE)
                .group("light_gray_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.SILVER_ROSE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.SILVER_ROSE))
                .offerTo(exporter, Identifier.of("light_gray_dye_from_silver_rose"));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.PURPLE_DYE)
                .input(DecoBlocks.ALPINE_SPEEDWELL)
                .group("purple_dye")
                .criterion(RecipeProvider.hasItem(DecoBlocks.ALPINE_SPEEDWELL),
                        RecipeProvider.conditionsFromItem(DecoBlocks.ALPINE_SPEEDWELL))
                .offerTo(exporter, Identifier.of("purple_dye_from_alpine_speedwell"));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_CHAIN)
                .pattern("-")
                .pattern("#")
                .pattern("-")
                .input('-', Items.GOLD_NUGGET)
                .input('#', Items.GOLD_INGOT)
                .criterion(RecipeProvider.hasItem(Items.GOLD_INGOT),
                        RecipeProvider.conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.GOLD_CHAIN)));

        offerBasicStairSlabWallRecipes(exporter, Items.COAL_BLOCK, DecoBlocks.COAL_STAIRS,
                DecoBlocks.COAL_SLAB, DecoBlocks.COAL_WALL);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COAL_BRICKS)
                .pattern("B#")
                .pattern("#B")
                .input('#', Items.COAL)
                .input('B', Items.BRICK)
                .criterion(RecipeProvider.hasItem(Items.BRICK),
                        RecipeProvider.conditionsFromItem(Items.BRICK))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.COAL_BRICKS)));

        offerChiseledStairSlabWallRecipes(exporter, DecoBlocks.COAL_BRICKS, DecoBlocks.COAL_BRICK_STAIRS,
                DecoBlocks.COAL_BRICK_SLAB, DecoBlocks.COAL_BRICK_WALL, DecoBlocks.CHISELED_COAL_BRICKS);

        offerNonStonecutterStairSlabWallRecipes(exporter, DecoBlocks.CHARCOAL_BLOCK, DecoBlocks.CHARCOAL_STAIRS,
                DecoBlocks.CHARCOAL_SLAB, DecoBlocks.CHARCOAL_WALL);

        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_LAMP, DecoBlocks.SMOOTH_GLOWSTONE);

        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_WHITE_LAMP, DecoBlocks.WHITE_LAMP);
        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_LIGHT_GRAY_LAMP, DecoBlocks.LIGHT_GRAY_LAMP);
        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_GRAY_LAMP, DecoBlocks.GRAY_LAMP);
        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_BLACK_LAMP, DecoBlocks.BLACK_LAMP);
        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_BROWN_LAMP, DecoBlocks.BROWN_LAMP);
        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_RED_LAMP, DecoBlocks.RED_LAMP);
        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_ORANGE_LAMP, DecoBlocks.ORANGE_LAMP);
        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_YELLOW_LAMP, DecoBlocks.YELLOW_LAMP);
        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_LIME_LAMP, DecoBlocks.LIME_LAMP);
        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_GREEN_LAMP, DecoBlocks.GREEN_LAMP);
        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_CYAN_LAMP, DecoBlocks.CYAN_LAMP);
        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_LIGHT_BLUE_LAMP, DecoBlocks.LIGHT_BLUE_LAMP);
        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_BLUE_LAMP, DecoBlocks.BLUE_LAMP);
        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_PURPLE_LAMP, DecoBlocks.PURPLE_LAMP);
        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_MAGENTA_LAMP, DecoBlocks.MAGENTA_LAMP);
        offerHangingLampRecipe(exporter, DecoBlocks.HANGING_PINK_LAMP, DecoBlocks.PINK_LAMP);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_WHITE_LAMP, Items.WHITE_STAINED_GLASS_PANE);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_LIGHT_GRAY_LAMP, Items.LIGHT_GRAY_STAINED_GLASS_PANE);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_GRAY_LAMP, Items.GRAY_STAINED_GLASS_PANE);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_BLACK_LAMP, Items.BLACK_STAINED_GLASS_PANE);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_BROWN_LAMP, Items.BROWN_STAINED_GLASS_PANE);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_RED_LAMP, Items.RED_STAINED_GLASS_PANE);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_ORANGE_LAMP, Items.ORANGE_STAINED_GLASS_PANE);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_YELLOW_LAMP, Items.YELLOW_STAINED_GLASS_PANE);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_LIME_LAMP, Items.LIME_STAINED_GLASS_PANE);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_GREEN_LAMP, Items.GREEN_STAINED_GLASS_PANE);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_CYAN_LAMP, Items.CYAN_STAINED_GLASS_PANE);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_LIGHT_BLUE_LAMP, Items.LIGHT_BLUE_STAINED_GLASS_PANE);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_BLUE_LAMP, Items.BLUE_STAINED_GLASS_PANE);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_PURPLE_LAMP, Items.PURPLE_STAINED_GLASS_PANE);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_MAGENTA_LAMP, Items.MAGENTA_STAINED_GLASS_PANE);

        offerHangingColouredLampRecipe(exporter,DecoBlocks.HANGING_PINK_LAMP, Items.PINK_STAINED_GLASS_PANE);

        offerStairSlabCarpetRecipes(exporter, Items.SAND, DecoBlocks.SAND_STAIRS, DecoBlocks.SAND_SLAB,
                DecoBlocks.SAND_CARPET);
        offerStairSlabCarpetRecipes(exporter, Items.RED_SAND, DecoBlocks.RED_SAND_STAIRS, DecoBlocks.RED_SAND_SLAB,
                DecoBlocks.RED_SAND_CARPET);
        offerStairSlabCarpetRecipes(exporter, Items.GRAVEL, DecoBlocks.GRAVEL_STAIRS, DecoBlocks.GRAVEL_SLAB,
                DecoBlocks.GRAVEL_CARPET);

        offerBasicStairSlabWallRecipes(exporter, DecoBlocks.FLINT_BLOCK, DecoBlocks.FLINT_STAIRS,
                DecoBlocks.FLINT_SLAB, DecoBlocks.FLINT_WALL);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_SAND,4)
                .pattern("P#")
                .pattern("#P")
                .input('#', Items.SAND)
                .input('P', DecoItems.PASSTOL)
                .criterion(RecipeProvider.hasItem(DecoItems.PASSTOL),
                        RecipeProvider.conditionsFromItem(DecoItems.PASSTOL))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.WHITE_SAND)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_SAND,4)
                .pattern("S#")
                .pattern("#S")
                .input('#', Items.SAND)
                .input('S', DecoItems.SHADDOL)
                .criterion(RecipeProvider.hasItem(DecoItems.SHADDOL),
                        RecipeProvider.conditionsFromItem(DecoItems.SHADDOL))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.BLACK_SAND)));

        offerTwoByTwoRecipe(exporter, DecoBlocks.WHITE_SANDSTONE, DecoBlocks.WHITE_SAND);
        offerTwoByTwoRecipe(exporter, DecoBlocks.BLACK_SANDSTONE, DecoBlocks.BLACK_SAND);

        offerChiseledStairSlabWallRecipes(exporter,DecoBlocks.WHITE_SANDSTONE, DecoBlocks.WHITE_SANDSTONE_STAIRS,
                DecoBlocks.WHITE_SANDSTONE_SLAB, DecoBlocks.WHITE_SANDSTONE_WALL, DecoBlocks.CHISELED_WHITE_SANDSTONE);
        offerChiseledStairSlabWallRecipes(exporter,DecoBlocks.BLACK_SANDSTONE, DecoBlocks.BLACK_SANDSTONE_STAIRS,
                DecoBlocks.BLACK_SANDSTONE_SLAB, DecoBlocks.BLACK_SANDSTONE_WALL, DecoBlocks.CHISELED_BLACK_SANDSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_WHITE_SANDSTONE, DecoBlocks.WHITE_SANDSTONE);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_BLACK_SANDSTONE, DecoBlocks.BLACK_SANDSTONE);

        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.CUT_WHITE_SANDSTONE, DecoBlocks.CUT_WHITE_SANDSTONE_STAIRS,
                DecoBlocks.CUT_WHITE_SANDSTONE_SLAB, DecoBlocks.CUT_WHITE_SANDSTONE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_WHITE_SANDSTONE_STAIRS, DecoBlocks.WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_WHITE_SANDSTONE_SLAB, DecoBlocks.WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_WHITE_SANDSTONE_WALL, DecoBlocks.WHITE_SANDSTONE);
        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.CUT_BLACK_SANDSTONE, DecoBlocks.CUT_BLACK_SANDSTONE_STAIRS,
                DecoBlocks.CUT_BLACK_SANDSTONE_SLAB, DecoBlocks.CUT_BLACK_SANDSTONE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_BLACK_SANDSTONE_STAIRS, DecoBlocks.BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_BLACK_SANDSTONE_SLAB, DecoBlocks.BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_BLACK_SANDSTONE_WALL, DecoBlocks.BLACK_SANDSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_WHITE_SANDSTONE_BRICKS, DecoBlocks.CUT_WHITE_SANDSTONE);
        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_BLACK_SANDSTONE_BRICKS, DecoBlocks.CUT_BLACK_SANDSTONE);

        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.CUT_WHITE_SANDSTONE_BRICKS, DecoBlocks.CUT_WHITE_SANDSTONE_BRICK_STAIRS,
                DecoBlocks.CUT_WHITE_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_WHITE_SANDSTONE_BRICK_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_WHITE_SANDSTONE_BRICK_STAIRS, DecoBlocks.WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_WHITE_SANDSTONE_BRICK_SLAB, DecoBlocks.WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_WHITE_SANDSTONE_BRICK_WALL, DecoBlocks.WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_WHITE_SANDSTONE_BRICK_STAIRS, DecoBlocks.CUT_WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_WHITE_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_WHITE_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_WHITE_SANDSTONE);
        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.CUT_BLACK_SANDSTONE_BRICKS, DecoBlocks.CUT_BLACK_SANDSTONE_BRICK_STAIRS,
                DecoBlocks.CUT_BLACK_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_BLACK_SANDSTONE_BRICK_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_BLACK_SANDSTONE_BRICK_STAIRS, DecoBlocks.BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_BLACK_SANDSTONE_BRICK_SLAB, DecoBlocks.BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_BLACK_SANDSTONE_BRICK_WALL, DecoBlocks.BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_BLACK_SANDSTONE_BRICK_STAIRS, DecoBlocks.CUT_BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_BLACK_SANDSTONE_BRICK_SLAB, DecoBlocks.CUT_BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_BLACK_SANDSTONE_BRICK_WALL, DecoBlocks.CUT_BLACK_SANDSTONE);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.WHITE_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_WHITE_SANDSTONE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.WHITE_SANDSTONE), conditionsFromItem(DecoBlocks.WHITE_SANDSTONE))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.SMOOTH_WHITE_SANDSTONE)));

        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.SMOOTH_WHITE_SANDSTONE, DecoBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS,
                DecoBlocks.SMOOTH_WHITE_SANDSTONE_SLAB, DecoBlocks.SMOOTH_WHITE_SANDSTONE_WALL);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.WHITE_SANDSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_WHITE_SANDSTONE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.WHITE_SANDSTONE_STAIRS), conditionsFromItem(DecoBlocks.WHITE_SANDSTONE_STAIRS))
                .offerTo(exporter, Identifier.of("smooth_white_sandstone_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.WHITE_SANDSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_WHITE_SANDSTONE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.WHITE_SANDSTONE_SLAB), conditionsFromItem(DecoBlocks.WHITE_SANDSTONE_SLAB))
                .offerTo(exporter, Identifier.of("smooth_white_sandstone_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.WHITE_SANDSTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_WHITE_SANDSTONE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.WHITE_SANDSTONE_WALL), conditionsFromItem(DecoBlocks.WHITE_SANDSTONE_WALL))
                .offerTo(exporter, Identifier.of("smooth_white_sandstone_wall_from_smelting"));

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLACK_SANDSTONE), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_BLACK_SANDSTONE,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLACK_SANDSTONE), conditionsFromItem(DecoBlocks.BLACK_SANDSTONE))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.SMOOTH_BLACK_SANDSTONE)));

        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.SMOOTH_BLACK_SANDSTONE, DecoBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS,
                DecoBlocks.SMOOTH_BLACK_SANDSTONE_SLAB, DecoBlocks.SMOOTH_BLACK_SANDSTONE_WALL);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLACK_SANDSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_BLACK_SANDSTONE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLACK_SANDSTONE_STAIRS), conditionsFromItem(DecoBlocks.BLACK_SANDSTONE_STAIRS))
                .offerTo(exporter, Identifier.of("smooth_black_sandstone_stairs_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLACK_SANDSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_BLACK_SANDSTONE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLACK_SANDSTONE_SLAB), conditionsFromItem(DecoBlocks.BLACK_SANDSTONE_SLAB))
                .offerTo(exporter, Identifier.of("smooth_black_sandstone_slab_from_smelting"));
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.BLACK_SANDSTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_BLACK_SANDSTONE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.BLACK_SANDSTONE_WALL), conditionsFromItem(DecoBlocks.BLACK_SANDSTONE_WALL))
                .offerTo(exporter, Identifier.of("smooth_black_sandstone_wall_from_smelting"));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COBBLED_WHITE_SANDSTONE,4)
                .input(DecoBlocks.WHITE_SANDSTONE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.WHITE_SANDSTONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.WHITE_SANDSTONE))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.COBBLED_WHITE_SANDSTONE)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COBBLED_WHITE_SANDSTONE, DecoBlocks.WHITE_SANDSTONE,4);

        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.COBBLED_WHITE_SANDSTONE, DecoBlocks.COBBLED_WHITE_SANDSTONE_STAIRS,
                DecoBlocks.COBBLED_WHITE_SANDSTONE_SLAB, DecoBlocks.COBBLED_WHITE_SANDSTONE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COBBLED_WHITE_SANDSTONE_STAIRS, DecoBlocks.WHITE_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COBBLED_WHITE_SANDSTONE_SLAB, DecoBlocks.WHITE_SANDSTONE,8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COBBLED_WHITE_SANDSTONE_WALL, DecoBlocks.WHITE_SANDSTONE,4);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_WHITE_SANDSTONE, DecoBlocks.COBBLED_WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_WHITE_SANDSTONE, DecoBlocks.WHITE_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_WHITE_SANDSTONE, DecoBlocks.COBBLED_WHITE_SANDSTONE);

        offerChiseledStairSlabWallRecipes(exporter,DecoBlocks.POLISHED_WHITE_SANDSTONE, DecoBlocks.POLISHED_WHITE_SANDSTONE_STAIRS,
                DecoBlocks.POLISHED_WHITE_SANDSTONE_SLAB, DecoBlocks.POLISHED_WHITE_SANDSTONE_WALL,
                DecoBlocks.CHISELED_POLISHED_WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_WHITE_SANDSTONE_STAIRS, DecoBlocks.WHITE_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_WHITE_SANDSTONE_STAIRS, DecoBlocks.COBBLED_WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_WHITE_SANDSTONE_SLAB, DecoBlocks.WHITE_SANDSTONE,8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_WHITE_SANDSTONE_SLAB, DecoBlocks.COBBLED_WHITE_SANDSTONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_WHITE_SANDSTONE_WALL, DecoBlocks.WHITE_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_WHITE_SANDSTONE_WALL, DecoBlocks.COBBLED_WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_POLISHED_WHITE_SANDSTONE, DecoBlocks.WHITE_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_POLISHED_WHITE_SANDSTONE, DecoBlocks.COBBLED_WHITE_SANDSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_SANDSTONE_BRICKS, DecoBlocks.POLISHED_WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_SANDSTONE_BRICKS, DecoBlocks.WHITE_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_SANDSTONE_BRICKS, DecoBlocks.COBBLED_WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_SANDSTONE_BRICKS, DecoBlocks.POLISHED_WHITE_SANDSTONE);

        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.WHITE_SANDSTONE_BRICKS, DecoBlocks.WHITE_SANDSTONE_BRICK_STAIRS,
                DecoBlocks.WHITE_SANDSTONE_BRICK_SLAB, DecoBlocks.WHITE_SANDSTONE_BRICK_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_SANDSTONE_BRICK_STAIRS, DecoBlocks.WHITE_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_SANDSTONE_BRICK_STAIRS, DecoBlocks.COBBLED_WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_SANDSTONE_BRICK_STAIRS, DecoBlocks.POLISHED_WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_SANDSTONE_BRICK_SLAB, DecoBlocks.WHITE_SANDSTONE,8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_SANDSTONE_BRICK_SLAB, DecoBlocks.COBBLED_WHITE_SANDSTONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_SANDSTONE_BRICK_SLAB, DecoBlocks.POLISHED_WHITE_SANDSTONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_SANDSTONE_BRICK_WALL, DecoBlocks.WHITE_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_SANDSTONE_BRICK_WALL, DecoBlocks.COBBLED_WHITE_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WHITE_SANDSTONE_BRICK_WALL, DecoBlocks.POLISHED_WHITE_SANDSTONE);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COBBLED_BLACK_SANDSTONE,4)
                .input(DecoBlocks.BLACK_SANDSTONE)
                .criterion(RecipeProvider.hasItem(DecoBlocks.BLACK_SANDSTONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.BLACK_SANDSTONE))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(DecoBlocks.COBBLED_BLACK_SANDSTONE)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COBBLED_BLACK_SANDSTONE, DecoBlocks.BLACK_SANDSTONE,4);

        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.COBBLED_BLACK_SANDSTONE, DecoBlocks.COBBLED_BLACK_SANDSTONE_STAIRS,
                DecoBlocks.COBBLED_BLACK_SANDSTONE_SLAB, DecoBlocks.COBBLED_BLACK_SANDSTONE_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COBBLED_BLACK_SANDSTONE_STAIRS, DecoBlocks.BLACK_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COBBLED_BLACK_SANDSTONE_SLAB, DecoBlocks.BLACK_SANDSTONE,8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COBBLED_BLACK_SANDSTONE_WALL, DecoBlocks.BLACK_SANDSTONE,4);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_BLACK_SANDSTONE, DecoBlocks.COBBLED_BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_BLACK_SANDSTONE, DecoBlocks.BLACK_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_BLACK_SANDSTONE, DecoBlocks.COBBLED_BLACK_SANDSTONE);

        offerChiseledStairSlabWallRecipes(exporter,DecoBlocks.POLISHED_BLACK_SANDSTONE, DecoBlocks.POLISHED_BLACK_SANDSTONE_STAIRS,
                DecoBlocks.POLISHED_BLACK_SANDSTONE_SLAB, DecoBlocks.POLISHED_BLACK_SANDSTONE_WALL,
                DecoBlocks.CHISELED_POLISHED_BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_BLACK_SANDSTONE_STAIRS, DecoBlocks.BLACK_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_BLACK_SANDSTONE_STAIRS, DecoBlocks.COBBLED_BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_BLACK_SANDSTONE_SLAB, DecoBlocks.BLACK_SANDSTONE,8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_BLACK_SANDSTONE_SLAB, DecoBlocks.COBBLED_BLACK_SANDSTONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_BLACK_SANDSTONE_WALL, DecoBlocks.BLACK_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_BLACK_SANDSTONE_WALL, DecoBlocks.COBBLED_BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_POLISHED_BLACK_SANDSTONE, DecoBlocks.BLACK_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_POLISHED_BLACK_SANDSTONE, DecoBlocks.COBBLED_BLACK_SANDSTONE);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_SANDSTONE_BRICKS, DecoBlocks.POLISHED_BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_SANDSTONE_BRICKS, DecoBlocks.BLACK_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_SANDSTONE_BRICKS, DecoBlocks.COBBLED_BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_SANDSTONE_BRICKS, DecoBlocks.POLISHED_BLACK_SANDSTONE);

        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.BLACK_SANDSTONE_BRICKS, DecoBlocks.BLACK_SANDSTONE_BRICK_STAIRS,
                DecoBlocks.BLACK_SANDSTONE_BRICK_SLAB, DecoBlocks.BLACK_SANDSTONE_BRICK_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_SANDSTONE_BRICK_STAIRS, DecoBlocks.BLACK_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_SANDSTONE_BRICK_STAIRS, DecoBlocks.COBBLED_BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_SANDSTONE_BRICK_STAIRS, DecoBlocks.POLISHED_BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_SANDSTONE_BRICK_SLAB, DecoBlocks.BLACK_SANDSTONE,8);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_SANDSTONE_BRICK_SLAB, DecoBlocks.COBBLED_BLACK_SANDSTONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_SANDSTONE_BRICK_SLAB, DecoBlocks.POLISHED_BLACK_SANDSTONE,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_SANDSTONE_BRICK_WALL, DecoBlocks.BLACK_SANDSTONE,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_SANDSTONE_BRICK_WALL, DecoBlocks.COBBLED_BLACK_SANDSTONE);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BLACK_SANDSTONE_BRICK_WALL, DecoBlocks.POLISHED_BLACK_SANDSTONE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.GOLD_LANTERN)
                .pattern("---")
                .pattern("-#-")
                .pattern("---")
                .input('-', Items.GOLD_NUGGET)
                .input('#', Items.TORCH)
                .criterion(RecipeProvider.hasItem(Items.GOLD_NUGGET),
                        RecipeProvider.conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.GOLD_LANTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, DecoBlocks.GOLD_SOUL_LANTERN)
                .pattern("---")
                .pattern("-#-")
                .pattern("---")
                .input('-', Items.GOLD_NUGGET)
                .input('#', Items.SOUL_TORCH)
                .criterion(RecipeProvider.hasItem(Items.SOUL_TORCH),
                        RecipeProvider.conditionsFromItem(Items.SOUL_TORCH))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.GOLD_SOUL_LANTERN)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.IRON_BAR_DOOR,3)
                .pattern("#-")
                .pattern("#-")
                .pattern("--")
                .input('-', Items.IRON_INGOT)
                .input('#', Items.IRON_BARS)
                .criterion(RecipeProvider.hasItem(Items.IRON_BARS),
                        RecipeProvider.conditionsFromItem(Items.IRON_BARS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_BAR_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.GOLD_BAR_DOOR,3)
                .pattern("#-")
                .pattern("#-")
                .pattern("--")
                .input('-', Items.GOLD_INGOT)
                .input('#', DecoBlocks.GOLD_BARS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.GOLD_BARS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.GOLD_BARS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.GOLD_BAR_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.IRON_BAR_TRAPDOOR)
                .pattern("#-")
                .pattern("--")
                .input('-', Items.IRON_INGOT)
                .input('#', Items.IRON_BARS)
                .criterion(RecipeProvider.hasItem(Items.IRON_BARS),
                        RecipeProvider.conditionsFromItem(Items.IRON_BARS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.IRON_BAR_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.GOLD_BAR_TRAPDOOR)
                .pattern("#-")
                .pattern("--")
                .input('-', Items.GOLD_INGOT)
                .input('#', DecoBlocks.GOLD_BARS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.GOLD_BARS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.GOLD_BARS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.GOLD_BAR_TRAPDOOR)));

        offerStairSlabCarpetRecipes(exporter, DecoBlocks.WHITE_SAND, DecoBlocks.WHITE_SAND_STAIRS,DecoBlocks.WHITE_SAND_SLAB,
                DecoBlocks.WHITE_SAND_CARPET);
        offerStairSlabCarpetRecipes(exporter, DecoBlocks.BLACK_SAND, DecoBlocks.BLACK_SAND_STAIRS,DecoBlocks.BLACK_SAND_SLAB,
                DecoBlocks.BLACK_SAND_CARPET);

        offerBasicStairSlabWallRecipes(exporter,Items.AMETHYST_BLOCK, DecoBlocks.AMETHYST_STAIRS,
                DecoBlocks.AMETHYST_SLAB, DecoBlocks.AMETHYST_WALL);
        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.ECHO_BLOCK, DecoBlocks.ECHO_STAIRS,
                DecoBlocks.ECHO_SLAB, DecoBlocks.ECHO_WALL);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SHINED_AMETHYST,2)
                .pattern("#F")
                .pattern("F#")
                .input('F', Items.FLINT)
                .input('#', Items.AMETHYST_BLOCK)
                .criterion(RecipeProvider.hasItem(Items.AMETHYST_BLOCK),
                        RecipeProvider.conditionsFromItem(Items.AMETHYST_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SHINED_AMETHYST)));
        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.SHINED_AMETHYST, DecoBlocks.SHINED_AMETHYST_STAIRS,
                DecoBlocks.SHINED_AMETHYST_SLAB, DecoBlocks.SHINED_AMETHYST_WALL);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SHINED_ECHO,2)
                .pattern("#F")
                .pattern("F#")
                .input('F', Items.FLINT)
                .input('#', DecoBlocks.ECHO_BLOCK)
                .criterion(RecipeProvider.hasItem(DecoBlocks.ECHO_BLOCK),
                        RecipeProvider.conditionsFromItem(DecoBlocks.ECHO_BLOCK))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SHINED_ECHO)));
        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.SHINED_ECHO, DecoBlocks.SHINED_ECHO_STAIRS,
                DecoBlocks.SHINED_ECHO_SLAB, DecoBlocks.SHINED_ECHO_WALL);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SCATTERED_AMETHYST,4)
                .pattern("#/")
                .pattern("/#")
                .input('/', Items.AMETHYST_SHARD)
                .input('#', DecoBlocks.SHINED_AMETHYST)
                .criterion(RecipeProvider.hasItem(DecoBlocks.SHINED_AMETHYST),
                        RecipeProvider.conditionsFromItem(DecoBlocks.SHINED_AMETHYST))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SCATTERED_AMETHYST)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SCATTERED_AMETHYST, DecoBlocks.SHINED_AMETHYST,2);
        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.SCATTERED_AMETHYST, DecoBlocks.SCATTERED_AMETHYST_STAIRS,
                DecoBlocks.SCATTERED_AMETHYST_SLAB, DecoBlocks.SCATTERED_AMETHYST_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SCATTERED_AMETHYST_STAIRS, DecoBlocks.SHINED_AMETHYST,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SCATTERED_AMETHYST_SLAB, DecoBlocks.SHINED_AMETHYST,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SCATTERED_AMETHYST_WALL, DecoBlocks.SHINED_AMETHYST,2);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SCATTERED_ECHO,4)
                .pattern("#/")
                .pattern("/#")
                .input('/', Items.ECHO_SHARD)
                .input('#', DecoBlocks.SHINED_ECHO)
                .criterion(RecipeProvider.hasItem(DecoBlocks.SHINED_ECHO),
                        RecipeProvider.conditionsFromItem(DecoBlocks.SHINED_ECHO))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.SCATTERED_ECHO)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SCATTERED_ECHO, DecoBlocks.SHINED_ECHO,2);
        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.SCATTERED_ECHO, DecoBlocks.SCATTERED_ECHO_STAIRS,
                DecoBlocks.SCATTERED_ECHO_SLAB, DecoBlocks.SCATTERED_ECHO_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SCATTERED_ECHO_STAIRS, DecoBlocks.SHINED_ECHO,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SCATTERED_ECHO_SLAB, DecoBlocks.SHINED_ECHO,4);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SCATTERED_ECHO_WALL, DecoBlocks.SHINED_ECHO,2);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.AMETHYST_BRICKS, DecoBlocks.SHINED_AMETHYST);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.AMETHYST_BRICKS, DecoBlocks.SHINED_AMETHYST);
        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.AMETHYST_BRICKS, DecoBlocks.AMETHYST_BRICK_STAIRS,
                DecoBlocks.AMETHYST_BRICK_SLAB, DecoBlocks.AMETHYST_BRICK_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.AMETHYST_BRICK_STAIRS, DecoBlocks.SHINED_AMETHYST);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.AMETHYST_BRICK_SLAB, DecoBlocks.SHINED_AMETHYST,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.AMETHYST_BRICK_WALL, DecoBlocks.SHINED_AMETHYST);

        offerPolishedStoneRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ECHO_BRICKS, DecoBlocks.SHINED_ECHO);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ECHO_BRICKS, DecoBlocks.SHINED_ECHO);
        offerBasicStairSlabWallRecipes(exporter,DecoBlocks.ECHO_BRICKS, DecoBlocks.ECHO_BRICK_STAIRS,
                DecoBlocks.ECHO_BRICK_SLAB, DecoBlocks.ECHO_BRICK_WALL);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ECHO_BRICK_STAIRS, DecoBlocks.SHINED_ECHO);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ECHO_BRICK_SLAB, DecoBlocks.SHINED_ECHO,2);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ECHO_BRICK_WALL, DecoBlocks.SHINED_ECHO);

        offerPillarBlockRecipe(exporter, DecoBlocks.AMETHYST_PILLAR, DecoBlocks.SHINED_AMETHYST_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.AMETHYST_PILLAR, DecoBlocks.SHINED_AMETHYST);

        offerPillarBlockRecipe(exporter, DecoBlocks.ECHO_PILLAR, DecoBlocks.SHINED_ECHO_SLAB);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ECHO_PILLAR, DecoBlocks.SHINED_ECHO);

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.COPPER_BAR_DOOR,3)
                .pattern("#-")
                .pattern("#-")
                .pattern("--")
                .input('-', Items.COPPER_INGOT)
                .input('#', DecoBlocks.COPPER_BARS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.COPPER_BARS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.COPPER_BARS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.COPPER_BAR_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, DecoBlocks.COPPER_BAR_TRAPDOOR)
                .pattern("#-")
                .pattern("--")
                .input('-', Items.COPPER_INGOT)
                .input('#', DecoBlocks.COPPER_BARS)
                .criterion(RecipeProvider.hasItem(DecoBlocks.COPPER_BARS),
                        RecipeProvider.conditionsFromItem(DecoBlocks.COPPER_BARS))
                .offerTo(exporter, Identifier.of(getRecipeName(DecoBlocks.COPPER_BAR_TRAPDOOR)));
    }
    public static void offerLadderVariantRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible woodInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output,3)
                .input('#', Items.STICK)
                .input('S', woodInput)
                .pattern("# #")
                .pattern("#S#")
                .pattern("# #")
                .group("wooden_ladder")
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));
    }

    public static void offerCraftingTableVariantRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible woodInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output)
                .input('#', woodInput)
                .input('$', DecoTags.Items.DECO_CRAFTING_TABLES)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_crafting_tables")
                .criterion(RecipeProvider.hasItem(woodInput),
                        RecipeProvider.conditionsFromItem(woodInput))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));
    }

    public static void offerBarrelVariantRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible woodInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output)
                .input('#', woodInput)
                .input('$', DecoTags.Items.DECO_BARRELS)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_barrels")
                .criterion(RecipeProvider.hasItem(woodInput),
                        RecipeProvider.conditionsFromItem(woodInput))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));
    }

    public static void offerCartographyTableVariantRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible woodInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output)
                .input('#', woodInput)
                .input('$', DecoTags.Items.DECO_CARTOGRAPHY_TABLES)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_cartography_tables")
                .criterion(RecipeProvider.hasItem(woodInput),
                        RecipeProvider.conditionsFromItem(woodInput))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));
    }
    public static void offerSmithingTableVariantRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible woodInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output)
                .input('#', woodInput)
                .input('$', DecoTags.Items.DECO_SMITHING_TABLES)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_smithing_tables")
                .criterion(RecipeProvider.hasItem(woodInput),
                        RecipeProvider.conditionsFromItem(woodInput))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));
    }
    public static void offerBookshelvesVariantRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible woodInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output)
                .input('#', woodInput)
                .input('$', DecoTags.Items.DECO_BOOKSHELVES)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_bookshelves")
                .criterion(RecipeProvider.hasItem(woodInput),
                        RecipeProvider.conditionsFromItem(woodInput))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));
    }
    public static void offerNoteBlockVariantRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible woodInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE,output)
                .input('#', woodInput)
                .input('$', DecoTags.Items.DECO_NOTE_BLOCKS)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("wooden_smithing_tables")
                .criterion(RecipeProvider.hasItem(woodInput),
                        RecipeProvider.conditionsFromItem(woodInput))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));
    }
        public static void offerTwoByTwoRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
            ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output)
                    .input('#', input)
                    .pattern("##")
                    .pattern("##")
                    .criterion(hasItem(input), conditionsFromItem(input))
                    .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(output)));
    }
    public static void offerPastelBlockRecipe(RecipeExporter exporter, ItemConvertible dyeBlockInput, ItemConvertible output) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,output, 8)
                .input('X', DecoItems.PASSTOL)
                .input('#', dyeBlockInput)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .group("pastel_blocks")
                .criterion("has_passtol", conditionsFromItem(DecoItems.PASSTOL))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));
    }
    public static void offerShadedBlockRecipe(RecipeExporter exporter, ItemConvertible dyeBlockInput, ItemConvertible output) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,output, 8)
                .input('X', DecoItems.SHADDOL)
                .input('#', dyeBlockInput)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .group("shaded_blocks")
                .criterion("has_shaddol", conditionsFromItem(DecoItems.SHADDOL))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));
    }
    public static void offerDyeBlockFromShadedRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible dyeBlockInput) {
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
    public static void offerDyeBlockFromPastelRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible dyeBlockInput) {
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
    public static void offerLampRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible paneInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output)
                .input('#', paneInput)
                .input('$', DecoBlocks.SMOOTH_GLOWSTONE)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("coloured_lamp")
                .criterion(RecipeProvider.hasItem(DecoBlocks.SMOOTH_GLOWSTONE),
                        RecipeProvider.conditionsFromItem(DecoBlocks.SMOOTH_GLOWSTONE))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));
    }
    public static void offerDuelCutRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible concreteInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,output)
                .input('#', concreteInput)
                .input('$', Items.AMETHYST_SHARD)
                .pattern("$#")
                .pattern("#$")
                .group("special_cut_concrete")
                .criterion(RecipeProvider.hasItem(concreteInput),
                        RecipeProvider.conditionsFromItem(concreteInput))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(output)));
    }
    public static void offerCheckeredRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible concreteInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,output)
                .input('#', concreteInput)
                .input('$', DecoItems.PASSTOL)
                .pattern("$#")
                .pattern("#$")
                .group("special_cut_concrete")
                .criterion(RecipeProvider.hasItem(concreteInput),
                        RecipeProvider.conditionsFromItem(concreteInput))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(output)));
    }
    public static void offerHydratingRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible coralInput) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,output)
                .input(coralInput)
                .input(DecoItems.BUBBLE_ORB)
                .group("hydrating_coral")
                .criterion(RecipeProvider.hasItem(coralInput),
                        RecipeProvider.conditionsFromItem(coralInput))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(output)+ "_from_hydrating"));
    }
    public static void offerReversibleCompactingFourRecipes(
            RecipeExporter exporter,
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
                .offerTo(exporter, Identifier.of(reverseRecipeName));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,compacted)
                .input('#', input)
                .pattern("##")
                .pattern("##")
                .group(compactingRecipeGroup)
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, Identifier.of(compactingRecipeName));
    }
    public static void offerHardenedGlassRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible glassInput) {
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

    public static void offerHardenedGlassPaneRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible glassPaneInput) {
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
    public static void offerBasicStairSlabWallRecipes(
            RecipeExporter exporter,
            ItemConvertible blockInput,
            ItemConvertible stair,
            ItemConvertible slab,
            ItemConvertible wall
    ) {
        createStairsRecipe(stair, Ingredient.ofItems(blockInput))
                .criterion(hasItem(blockInput),conditionsFromItem(blockInput))
                .offerTo(exporter, Identifier.of(getRecipeName(stair)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stair, blockInput);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, slab, blockInput);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, slab, blockInput,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,wall, blockInput);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, wall, blockInput);
    }
    public static void offerChiseledStairSlabWallRecipes(
            RecipeExporter exporter,
            ItemConvertible blockInput,
            ItemConvertible stair,
            ItemConvertible slab,
            ItemConvertible wall,
            ItemConvertible chiseledBlock
    ) {
        createStairsRecipe(stair, Ingredient.ofItems(blockInput))
                .criterion(hasItem(blockInput),conditionsFromItem(blockInput))
                .offerTo(exporter, Identifier.of(getRecipeName(stair)));
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, stair, blockInput);

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, slab, blockInput);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, slab, blockInput,2);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS, wall, blockInput);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, wall, blockInput);

        offerChiseledBlockRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, chiseledBlock, slab);
        offerStonecuttingRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, chiseledBlock, blockInput);
    }
    public static void offerNonStonecutterStairSlabWallRecipes(
            RecipeExporter exporter,
            ItemConvertible blockInput,
            ItemConvertible stair,
            ItemConvertible slab,
            ItemConvertible wall
    ) {
        createStairsRecipe(stair, Ingredient.ofItems(blockInput))
                .criterion(hasItem(blockInput),conditionsFromItem(blockInput))
                .offerTo(exporter, Identifier.of(getRecipeName(stair)));

        offerSlabRecipe(exporter, RecipeCategory.BUILDING_BLOCKS, slab, blockInput);

        offerWallRecipe(exporter, RecipeCategory.DECORATIONS,wall, blockInput);
    }
    public static void offerStairSlabCarpetRecipes(
            RecipeExporter exporter,
            ItemConvertible blockInput,
            ItemConvertible stair,
            ItemConvertible slab,
            ItemConvertible carpet
    ) {
        createStairsRecipe(stair, Ingredient.ofItems(blockInput))
                .criterion(hasItem(blockInput),conditionsFromItem(blockInput))
                .offerTo(exporter, Identifier.of(getRecipeName(stair)));

        offerSlabRecipe(exporter, RecipeCategory.DECORATIONS, slab, blockInput);

        offerCarpetRecipe(exporter, carpet, blockInput);
    }
    public static void offerHangingLampRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output,8)
                .pattern("###")
                .pattern("#X#")
                .pattern("###")
                .input('X', input)
                .input('#', Items.IRON_NUGGET)
                .group("hanging_lamps")
                .criterion(RecipeProvider.hasItem(input),
                        RecipeProvider.conditionsFromItem(input))
                .offerTo(exporter, Identifier.of(getRecipeName(output)));
    }
    public static void offerHangingColouredLampRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible paneInput) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS,output)
                .input('#', paneInput)
                .input('$', DecoBlocks.HANGING_LAMP)
                .pattern(" # ")
                .pattern("#$#")
                .pattern(" # ")
                .group("hanging_coloured_lamp")
                .criterion(RecipeProvider.hasItem(DecoBlocks.HANGING_LAMP),
                        RecipeProvider.conditionsFromItem(DecoBlocks.HANGING_LAMP))
                .offerTo(exporter, convertBetween(output, paneInput));
    }
    public static void offerPillarBlockRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible input) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output)
                .input('#', input)
                .pattern("#")
                .pattern("#")
                .pattern("#")
                .criterion(hasItem(input), conditionsFromItem(input))
                .offerTo(exporter, Identifier.of(RecipeProvider.getRecipeName(output)));
    }
}
