package net.gecko.varandeco.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.gecko.varandeco.util.DecoTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.recipe.CookingRecipeJsonBuilder;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class DecoRecipeGenerator extends FabricRecipeProvider {


    public DecoRecipeGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
        createShaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_PURPUR,2)
                .pattern("##")
                .pattern("##")
                .input('#', Items.PURPUR_SLAB)
                .criterion(hasItem(Items.PURPUR_SLAB),
                        conditionsFromItem(Items.PURPUR_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.CHISELED_PURPUR)+ "_recipe_create");

        createShaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR,4)
                .pattern("#P")
                .pattern("P#")
                .input('#', Items.PURPUR_BLOCK)
                .input('P', Items.POPPED_CHORUS_FRUIT)
                .criterion(hasItem(Items.PURPUR_BLOCK),
                        conditionsFromItem(Items.PURPUR_BLOCK))
                .offerTo(exporter, getRecipeName(DecoBlocks.CUT_PURPUR)+ "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR, Items.PURPUR_BLOCK);

        createStairsRecipe(DecoBlocks.CUT_PURPUR_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_PURPUR))
                .criterion(hasItem(DecoBlocks.CUT_PURPUR),conditionsFromItem(DecoBlocks.CUT_PURPUR))
                .offerTo(exporter, getRecipeName(DecoBlocks.CUT_PURPUR_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_STAIRS, Items.PURPUR_BLOCK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_STAIRS, DecoBlocks.CUT_PURPUR);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_SLAB, DecoBlocks.CUT_PURPUR);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_SLAB, Items.PURPUR_BLOCK,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_SLAB, DecoBlocks.CUT_PURPUR,2);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.CUT_PURPUR_WALL, DecoBlocks.CUT_PURPUR);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_WALL, Items.PURPUR_BLOCK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_PURPUR_WALL, DecoBlocks.CUT_PURPUR);

        createShaped(RecipeCategory.MISC, DecoItems.PASSTOL,4)
                .pattern("S#")
                .pattern("#S")
                .input('#', Items.BONE_MEAL)
                .input('S', DecoTags.Items.MUSHROOMS)
                .criterion("has_mushrooms", conditionsFromTag(DecoTags.Items.MUSHROOMS))
                .offerTo(exporter, getRecipeName(DecoItems.PASSTOL)+ "_recipe_create");

        createShaped(RecipeCategory.MISC, DecoItems.SHADDOL,4)
                .pattern("S#")
                .pattern("#S")
                .input('#', Items.INK_SAC)
                .input('S', DecoTags.Items.MUSHROOMS)
                .criterion("has_mushrooms", conditionsFromTag(DecoTags.Items.MUSHROOMS))
                .offerTo(exporter, getRecipeName(DecoItems.SHADDOL)+ "_recipe_create");

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
                .offerTo(exporter, getRecipeName(DecoBlocks.OAK_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OAK_WOOD_SLAB, Items.OAK_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.OAK_WOOD_WALL, Items.OAK_WOOD);

        createStairsRecipe(DecoBlocks.SPRUCE_WOOD_STAIRS, Ingredient.ofItems(Items.SPRUCE_WOOD))
                .criterion(hasItem(Items.SPRUCE_WOOD),conditionsFromItem(Items.SPRUCE_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.SPRUCE_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SPRUCE_WOOD_SLAB, Items.SPRUCE_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.SPRUCE_WOOD_WALL, Items.SPRUCE_WOOD);

        createStairsRecipe(DecoBlocks.BIRCH_WOOD_STAIRS, Ingredient.ofItems(Items.BIRCH_WOOD))
                .criterion(hasItem(Items.BIRCH_WOOD),conditionsFromItem(Items.BIRCH_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.BIRCH_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.BIRCH_WOOD_SLAB, Items.BIRCH_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.BIRCH_WOOD_WALL, Items.BIRCH_WOOD);

        createStairsRecipe(DecoBlocks.JUNGLE_WOOD_STAIRS, Ingredient.ofItems(Items.JUNGLE_WOOD))
                .criterion(hasItem(Items.JUNGLE_WOOD),conditionsFromItem(Items.JUNGLE_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.JUNGLE_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.JUNGLE_WOOD_SLAB, Items.JUNGLE_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.JUNGLE_WOOD_WALL, Items.JUNGLE_WOOD);

        createStairsRecipe(DecoBlocks.ACACIA_WOOD_STAIRS, Ingredient.ofItems(Items.ACACIA_WOOD))
                .criterion(hasItem(Items.ACACIA_WOOD),conditionsFromItem(Items.ACACIA_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.ACACIA_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ACACIA_WOOD_SLAB, Items.ACACIA_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.ACACIA_WOOD_WALL, Items.ACACIA_WOOD);

        createStairsRecipe(DecoBlocks.DARK_OAK_WOOD_STAIRS, Ingredient.ofItems(Items.DARK_OAK_WOOD))
                .criterion(hasItem(Items.DARK_OAK_WOOD),conditionsFromItem(Items.DARK_OAK_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.DARK_OAK_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DARK_OAK_WOOD_SLAB, Items.DARK_OAK_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.DARK_OAK_WOOD_WALL, Items.DARK_OAK_WOOD);

        createStairsRecipe(DecoBlocks.MANGROVE_WOOD_STAIRS, Ingredient.ofItems(Items.MANGROVE_WOOD))
                .criterion(hasItem(Items.MANGROVE_WOOD),conditionsFromItem(Items.MANGROVE_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.MANGROVE_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MANGROVE_WOOD_SLAB, Items.MANGROVE_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.MANGROVE_WOOD_WALL, Items.MANGROVE_WOOD);

        createStairsRecipe(DecoBlocks.CRIMSON_HYPHAE_STAIRS, Ingredient.ofItems(Items.CRIMSON_HYPHAE))
                .criterion(hasItem(Items.CRIMSON_HYPHAE),conditionsFromItem(Items.CRIMSON_HYPHAE))
                .offerTo(exporter, getRecipeName(DecoBlocks.CRIMSON_HYPHAE_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRIMSON_HYPHAE_SLAB, Items.CRIMSON_HYPHAE);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.CRIMSON_HYPHAE_WALL, Items.CRIMSON_HYPHAE);

        createStairsRecipe(DecoBlocks.WARPED_HYPHAE_STAIRS, Ingredient.ofItems(Items.WARPED_HYPHAE))
                .criterion(hasItem(Items.WARPED_HYPHAE),conditionsFromItem(Items.WARPED_HYPHAE))
                .offerTo(exporter, getRecipeName(DecoBlocks.WARPED_HYPHAE_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WARPED_HYPHAE_SLAB, Items.WARPED_HYPHAE);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.WARPED_HYPHAE_WALL, Items.WARPED_HYPHAE);

        createStairsRecipe(DecoBlocks.STRIPPED_OAK_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_OAK_WOOD))
                .criterion(hasItem(Items.STRIPPED_OAK_WOOD),conditionsFromItem(Items.STRIPPED_OAK_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.STRIPPED_OAK_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_OAK_WOOD_SLAB, Items.STRIPPED_OAK_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_OAK_WOOD_WALL, Items.STRIPPED_OAK_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_SPRUCE_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_SPRUCE_WOOD))
                .criterion(hasItem(Items.STRIPPED_SPRUCE_WOOD),conditionsFromItem(Items.STRIPPED_SPRUCE_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.STRIPPED_SPRUCE_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_SPRUCE_WOOD_SLAB, Items.STRIPPED_SPRUCE_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_SPRUCE_WOOD_WALL, Items.STRIPPED_SPRUCE_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_BIRCH_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_BIRCH_WOOD))
                .criterion(hasItem(Items.STRIPPED_BIRCH_WOOD),conditionsFromItem(Items.STRIPPED_BIRCH_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.STRIPPED_BIRCH_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_BIRCH_WOOD_SLAB, Items.STRIPPED_BIRCH_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_BIRCH_WOOD_WALL, Items.STRIPPED_BIRCH_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_JUNGLE_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_JUNGLE_WOOD))
                .criterion(hasItem(Items.STRIPPED_JUNGLE_WOOD),conditionsFromItem(Items.STRIPPED_JUNGLE_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.STRIPPED_JUNGLE_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_JUNGLE_WOOD_SLAB, Items.STRIPPED_JUNGLE_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_JUNGLE_WOOD_WALL, Items.STRIPPED_JUNGLE_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_ACACIA_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_ACACIA_WOOD))
                .criterion(hasItem(Items.STRIPPED_ACACIA_WOOD),conditionsFromItem(Items.STRIPPED_ACACIA_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.STRIPPED_ACACIA_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_ACACIA_WOOD_SLAB, Items.STRIPPED_ACACIA_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_ACACIA_WOOD_WALL, Items.STRIPPED_ACACIA_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_DARK_OAK_WOOD))
                .criterion(hasItem(Items.STRIPPED_DARK_OAK_WOOD),conditionsFromItem(Items.STRIPPED_DARK_OAK_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_DARK_OAK_WOOD_SLAB, Items.STRIPPED_DARK_OAK_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_DARK_OAK_WOOD_WALL, Items.STRIPPED_DARK_OAK_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_MANGROVE_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_MANGROVE_WOOD))
                .criterion(hasItem(Items.STRIPPED_MANGROVE_WOOD),conditionsFromItem(Items.STRIPPED_MANGROVE_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.STRIPPED_MANGROVE_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_MANGROVE_WOOD_SLAB, Items.STRIPPED_MANGROVE_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_MANGROVE_WOOD_WALL, Items.STRIPPED_MANGROVE_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS, Ingredient.ofItems(Items.STRIPPED_CRIMSON_HYPHAE))
                .criterion(hasItem(Items.STRIPPED_CRIMSON_HYPHAE),conditionsFromItem(Items.STRIPPED_CRIMSON_HYPHAE))
                .offerTo(exporter, getRecipeName(DecoBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, Items.STRIPPED_CRIMSON_HYPHAE);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_CRIMSON_HYPHAE_WALL, Items.STRIPPED_CRIMSON_HYPHAE);

        createStairsRecipe(DecoBlocks.STRIPPED_WARPED_HYPHAE_STAIRS, Ingredient.ofItems(Items.STRIPPED_WARPED_HYPHAE))
                .criterion(hasItem(Items.STRIPPED_WARPED_HYPHAE),conditionsFromItem(Items.STRIPPED_WARPED_HYPHAE))
                .offerTo(exporter, getRecipeName(DecoBlocks.STRIPPED_WARPED_HYPHAE_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_WARPED_HYPHAE_SLAB, Items.STRIPPED_WARPED_HYPHAE);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_WARPED_HYPHAE_WALL, Items.STRIPPED_WARPED_HYPHAE);

        createStairsRecipe(DecoBlocks.WOODEN_WOOD_STAIRS, Ingredient.ofItems(DecoBlocks.WOODEN_WOOD))
                .criterion(hasItem(DecoBlocks.WOODEN_WOOD),conditionsFromItem(DecoBlocks.WOODEN_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.WOODEN_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WOODEN_WOOD_SLAB, DecoBlocks.WOODEN_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.WOODEN_WOOD_WALL, DecoBlocks.WOODEN_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_WOODEN_WOOD_STAIRS, Ingredient.ofItems(DecoBlocks.STRIPPED_WOODEN_WOOD))
                .criterion(hasItem(DecoBlocks.STRIPPED_WOODEN_WOOD),conditionsFromItem(DecoBlocks.STRIPPED_WOODEN_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.STRIPPED_WOODEN_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_WOODEN_WOOD_SLAB, DecoBlocks.STRIPPED_WOODEN_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_WOODEN_WOOD_WALL, DecoBlocks.STRIPPED_WOODEN_WOOD);

        createShaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.PACKED_NETHERRACK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.NETHERRACK)
                .criterion(hasItem(Items.NETHERRACK),
                        conditionsFromItem(Items.NETHERRACK))
                .offerTo(exporter, getRecipeName(DecoBlocks.PACKED_NETHERRACK)+ "_recipe_create");

        createStairsRecipe(DecoBlocks.PACKED_NETHERRACK_STAIRS, Ingredient.ofItems(DecoBlocks.PACKED_NETHERRACK))
                .criterion(hasItem(DecoBlocks.PACKED_NETHERRACK),conditionsFromItem(DecoBlocks.PACKED_NETHERRACK))
                .offerTo(exporter, getRecipeName(DecoBlocks.PACKED_NETHERRACK_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_STAIRS, DecoBlocks.PACKED_NETHERRACK);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_SLAB, DecoBlocks.PACKED_NETHERRACK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_SLAB, DecoBlocks.PACKED_NETHERRACK,2);

        offerSlabRecipe(RecipeCategory.DECORATIONS, DecoBlocks. PACKED_NETHERRACK_WALL, DecoBlocks.PACKED_NETHERRACK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. PACKED_NETHERRACK_WALL, DecoBlocks.PACKED_NETHERRACK);

        offerPolishedStoneRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.NETHERRACK_BRICKS, DecoBlocks.PACKED_NETHERRACK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICKS, DecoBlocks.PACKED_NETHERRACK);

        createStairsRecipe(DecoBlocks.NETHERRACK_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.NETHERRACK_BRICKS))
                .criterion(hasItem(DecoBlocks.NETHERRACK_BRICKS),conditionsFromItem(DecoBlocks.NETHERRACK_BRICKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.NETHERRACK_BRICK_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_STAIRS, DecoBlocks.PACKED_NETHERRACK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_STAIRS, DecoBlocks.NETHERRACK_BRICKS);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_SLAB, DecoBlocks.NETHERRACK_BRICKS);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_SLAB, DecoBlocks.PACKED_NETHERRACK,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_SLAB, DecoBlocks.NETHERRACK_BRICKS,2);

        offerSlabRecipe(RecipeCategory.DECORATIONS, DecoBlocks. NETHERRACK_BRICK_WALL, DecoBlocks.NETHERRACK_BRICKS);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_WALL, DecoBlocks.PACKED_NETHERRACK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. NETHERRACK_BRICK_WALL, DecoBlocks.NETHERRACK_BRICKS);

        offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_MUD_BRICKS, Items.MUD_BRICK_SLAB);

        offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_ICE_BRICKS, DecoBlocks.ICE_BRICK_SLAB);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. CHISELED_ICE_BRICKS, Items.BLUE_ICE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. CHISELED_ICE_BRICKS, DecoBlocks.ICE_BRICKS);

        offerChiseledBlockRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHISELED_NETHERRACK_BRICKS, DecoBlocks.NETHERRACK_BRICK_SLAB);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. CHISELED_NETHERRACK_BRICKS, DecoBlocks.PACKED_NETHERRACK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. CHISELED_NETHERRACK_BRICKS, DecoBlocks.NETHERRACK_BRICKS);

        offerPolishedStoneRecipe( RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BASALT_BRICKS, Items.POLISHED_BASALT);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. BASALT_BRICKS, Items.BASALT);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks. BASALT_BRICKS, Items.POLISHED_BASALT);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.GLOWSTONE), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_GLOWSTONE,
                        0.35f, 200).criterion(hasItem(Items.GLOWSTONE), conditionsFromItem(Items.GLOWSTONE))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_GLOWSTONE)+ "_recipe_create");

        createShaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.PACKED_CACTUS,4)
                .pattern("##")
                .pattern("##")
                .input('#', Items.CACTUS)
                .criterion(hasItem(Items.CACTUS),
                        conditionsFromItem(Items.CACTUS))
                .offerTo(exporter, getRecipeName(DecoBlocks.PACKED_CACTUS)+ "_recipe_create");

        createShapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_PLANKS,2)
                .input(DecoBlocks.PACKED_CACTUS)
                .group("cactus_planks")
                .criterion(hasItem(DecoBlocks.PACKED_CACTUS),
                        conditionsFromItem(DecoBlocks.PACKED_CACTUS))
                .offerTo(exporter, getRecipeName(DecoBlocks.CACTUS_PLANKS)+ "_from_packed_cactus");

        createShapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_PLANKS,2)
                .input(DecoBlocks.STRIPPED_CACTUS)
                .group("cactus_planks")
                .criterion(hasItem(DecoBlocks.STRIPPED_CACTUS),
                        conditionsFromItem(DecoBlocks.STRIPPED_CACTUS))
                .offerTo(exporter, getRecipeName(DecoBlocks.CACTUS_PLANKS)+ "_from_stripped_cactus");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.OAK_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.OAK_SLAB)
                .group("pallet_doors")
                .criterion(hasItem(Items.OAK_SLAB),
                        conditionsFromItem(Items.OAK_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.OAK_PALLET_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE, DecoBlocks.OAK_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.OAK_SLAB)
                .group("pallet_trapdoors")
                .criterion(hasItem(Items.OAK_SLAB),
                        conditionsFromItem(Items.OAK_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.OAK_PALLET_TRAPDOOR)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.BIRCH_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.BIRCH_SLAB)
                .group("pallet_doors")
                .criterion(hasItem(Items.BIRCH_SLAB),
                        conditionsFromItem(Items.BIRCH_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.BIRCH_PALLET_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE, DecoBlocks.BIRCH_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.BIRCH_SLAB)
                .group("pallet_trapdoors")
                .criterion(hasItem(Items.BIRCH_SLAB),
                        conditionsFromItem(Items.BIRCH_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.BIRCH_PALLET_TRAPDOOR)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.SPRUCE_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.SPRUCE_SLAB)
                .group("pallet_doors")
                .criterion(hasItem(Items.SPRUCE_SLAB),
                        conditionsFromItem(Items.SPRUCE_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.SPRUCE_PALLET_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE, DecoBlocks.SPRUCE_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.SPRUCE_SLAB)
                .group("pallet_trapdoors")
                .criterion(hasItem(Items.SPRUCE_SLAB),
                        conditionsFromItem(Items.SPRUCE_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.SPRUCE_PALLET_TRAPDOOR)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.JUNGLE_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.JUNGLE_SLAB)
                .group("pallet_doors")
                .criterion(hasItem(Items.JUNGLE_SLAB),
                        conditionsFromItem(Items.JUNGLE_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.JUNGLE_PALLET_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE, DecoBlocks.JUNGLE_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.JUNGLE_SLAB)
                .group("pallet_trapdoors")
                .criterion(hasItem(Items.JUNGLE_SLAB),
                        conditionsFromItem(Items.JUNGLE_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.JUNGLE_PALLET_TRAPDOOR)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.ACACIA_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.ACACIA_SLAB)
                .group("pallet_doors")
                .criterion(hasItem(Items.ACACIA_SLAB),
                        conditionsFromItem(Items.ACACIA_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.ACACIA_PALLET_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE, DecoBlocks.ACACIA_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.ACACIA_SLAB)
                .group("pallet_trapdoors")
                .criterion(hasItem(Items.ACACIA_SLAB),
                        conditionsFromItem(Items.ACACIA_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.ACACIA_PALLET_TRAPDOOR)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.DARK_OAK_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.DARK_OAK_SLAB)
                .group("pallet_doors")
                .criterion(hasItem(Items.DARK_OAK_SLAB),
                        conditionsFromItem(Items.DARK_OAK_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.DARK_OAK_PALLET_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE, DecoBlocks.DARK_OAK_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.DARK_OAK_SLAB)
                .group("pallet_trapdoors")
                .criterion(hasItem(Items.DARK_OAK_SLAB),
                        conditionsFromItem(Items.DARK_OAK_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.DARK_OAK_PALLET_TRAPDOOR)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.MANGROVE_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.MANGROVE_SLAB)
                .group("pallet_doors")
                .criterion(hasItem(Items.MANGROVE_SLAB),
                        conditionsFromItem(Items.MANGROVE_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.MANGROVE_PALLET_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE, DecoBlocks.MANGROVE_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.MANGROVE_SLAB)
                .group("pallet_trapdoors")
                .criterion(hasItem(Items.MANGROVE_SLAB),
                        conditionsFromItem(Items.MANGROVE_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.MANGROVE_PALLET_TRAPDOOR)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.CRIMSON_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.CRIMSON_SLAB)
                .group("pallet_doors")
                .criterion(hasItem(Items.CRIMSON_SLAB),
                        conditionsFromItem(Items.CRIMSON_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.CRIMSON_PALLET_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE, DecoBlocks.CRIMSON_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.CRIMSON_SLAB)
                .group("pallet_trapdoors")
                .criterion(hasItem(Items.CRIMSON_SLAB),
                        conditionsFromItem(Items.CRIMSON_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.CRIMSON_PALLET_TRAPDOOR)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.WARPED_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.WARPED_SLAB)
                .group("pallet_doors")
                .criterion(hasItem(Items.WARPED_SLAB),
                        conditionsFromItem(Items.WARPED_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.WARPED_PALLET_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE, DecoBlocks.WARPED_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.WARPED_SLAB)
                .group("pallet_trapdoors")
                .criterion(hasItem(Items.WARPED_SLAB),
                        conditionsFromItem(Items.WARPED_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.WARPED_PALLET_TRAPDOOR)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.CACTUS_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.CACTUS_PLANK_SLAB)
                .group("pallet_doors")
                .criterion(hasItem(DecoBlocks.CACTUS_PLANK_SLAB),
                        conditionsFromItem(DecoBlocks.CACTUS_PLANK_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.CACTUS_PALLET_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE, DecoBlocks.CACTUS_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.CACTUS_PLANK_SLAB)
                .group("pallet_trapdoors")
                .criterion(hasItem(DecoBlocks.CACTUS_PLANK_SLAB),
                        conditionsFromItem(DecoBlocks.CACTUS_PLANK_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.CACTUS_PALLET_TRAPDOOR)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.WOODEN_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.WOODEN_SLAB)
                .group("pallet_doors")
                .criterion(hasItem(DecoBlocks.WOODEN_SLAB),
                        conditionsFromItem(DecoBlocks.WOODEN_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.WOODEN_PALLET_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE, DecoBlocks.WOODEN_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.WOODEN_SLAB)
                .group("pallet_trapdoors")
                .criterion(hasItem(DecoBlocks.WOODEN_SLAB),
                        conditionsFromItem(DecoBlocks.WOODEN_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.WOODEN_PALLET_TRAPDOOR)+ "_recipe_create");

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

        createShaped(RecipeCategory.BUILDING_BLOCKS,Items.BROWN_MUSHROOM_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.BROWN_MUSHROOM)
                .group("giant_mushroom_blocks")
                .criterion(hasItem(Items.BROWN_MUSHROOM),
                        conditionsFromItem(Items.BROWN_MUSHROOM))
                .offerTo(exporter, getRecipeName(Items.BROWN_MUSHROOM_BLOCK)+ "_recipe_create");

        createShaped(RecipeCategory.BUILDING_BLOCKS,Items.RED_MUSHROOM_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', Items.RED_MUSHROOM)
                .group("giant_mushroom_blocks")
                .criterion(hasItem(Items.RED_MUSHROOM),
                        conditionsFromItem(Items.RED_MUSHROOM))
                .offerTo(exporter, getRecipeName(Items.RED_MUSHROOM_BLOCK)+ "_recipe_create");

        createShaped(RecipeCategory.BUILDING_BLOCKS,Items.MUSHROOM_STEM)
                .pattern("##")
                .pattern("##")
                .input('#', DecoTags.Items.MUSHROOMS)
                .criterion("has_mushrooms", conditionsFromTag(DecoTags.Items.MUSHROOMS))
                .offerTo(exporter, getRecipeName(Items.MUSHROOM_STEM)+ "_recipe_create");

        createShapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_PLANKS,4)
                .input(DecoTags.Items.GIANT_MUSHROOM_BLOCKS)
                .group("planks")
                .criterion("has_logs", conditionsFromTag(DecoTags.Items.GIANT_MUSHROOM_BLOCKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.MUSHROOM_PLANKS)+ "_recipe_create");

        createShapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_PLANKS,2)
                .input(Items.MUSHROOM_STEM)
                .group("planks")
                .criterion(hasItem(Items.MUSHROOM_STEM),
                        conditionsFromItem(Items.MUSHROOM_STEM))
                .offerTo(exporter, getRecipeName(DecoBlocks.MUSHROOM_PLANKS)+ "_from_stem");

        createStairsRecipe(DecoBlocks.MUSHROOM_STAIRS, Ingredient.ofItems(DecoBlocks.MUSHROOM_PLANKS))
                .group("wooden_stairs")
                .criterion(hasItem(DecoBlocks.MUSHROOM_PLANKS),conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.MUSHROOM_STAIRS) + "_recipe_create");

        createShaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_SLAB,6)
                .pattern("###")
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_slab")
                .criterion(hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.MUSHROOM_SLAB)+ "_recipe_create");

        createShaped(RecipeCategory.DECORATIONS,DecoBlocks.MUSHROOM_FENCE,3)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_fence")
                .criterion(hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.MUSHROOM_FENCE)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_fence_fence")
                .criterion(hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.MUSHROOM_FENCE_GATE)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_PRESSURE_PLATE)
                .pattern("##")
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_pressure_plate")
                .criterion(hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.MUSHROOM_PRESSURE_PLATE)+ "_recipe_create");

        createShapeless(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_BUTTON)
                .input(DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_button")
                .criterion(hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.MUSHROOM_BUTTON)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_door")
                .criterion(hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.MUSHROOM_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .group("wooden_trapdoor")
                .criterion(hasItem(DecoBlocks.MUSHROOM_PLANKS),
                        conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.MUSHROOM_TRAPDOOR)+ "_recipe_create");

        createSignRecipe(DecoItems.MUSHROOM_SIGN, Ingredient.ofItems(DecoBlocks.MUSHROOM_PLANKS))
                .group("wooden_sign")
                .criterion(hasItem(DecoBlocks.MUSHROOM_PLANKS),conditionsFromItem(DecoBlocks.MUSHROOM_PLANKS))
                .offerTo(exporter, getRecipeName(DecoItems.MUSHROOM_SIGN)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.MUSHROOM_SLAB)
                .group("pallet_doors")
                .criterion(hasItem(DecoBlocks.MUSHROOM_SLAB),
                        conditionsFromItem(DecoBlocks.MUSHROOM_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.MUSHROOM_PALLET_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE,DecoBlocks.MUSHROOM_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.MUSHROOM_SLAB)
                .group("pallet_trapdoors")
                .criterion(hasItem(DecoBlocks.MUSHROOM_SLAB),
                        conditionsFromItem(DecoBlocks.MUSHROOM_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.MUSHROOM_PALLET_TRAPDOOR)+ "_recipe_create");

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

        offerPolishedStoneRecipe( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE, Items.CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE, Items.CALCITE);

        createStairsRecipe(DecoBlocks.POLISHED_CALCITE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_CALCITE))
                .criterion(hasItem(DecoBlocks.POLISHED_CALCITE),conditionsFromItem(DecoBlocks.POLISHED_CALCITE))
                .offerTo(exporter, getRecipeName(DecoBlocks.POLISHED_CALCITE_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_STAIRS, Items.CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_STAIRS, DecoBlocks.POLISHED_CALCITE);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_SLAB, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_SLAB, Items.CALCITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_SLAB, DecoBlocks.POLISHED_CALCITE,2);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.POLISHED_CALCITE_WALL, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_WALL, Items.CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_CALCITE_WALL, DecoBlocks.POLISHED_CALCITE);

        offerPolishedStoneRecipe( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE, Items.CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE, DecoBlocks.POLISHED_CALCITE);

        createStairsRecipe(DecoBlocks.CUT_CALCITE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_CALCITE))
                .criterion(hasItem(DecoBlocks.CUT_CALCITE),conditionsFromItem(DecoBlocks.CUT_CALCITE))
                .offerTo(exporter, getRecipeName(DecoBlocks.CUT_CALCITE_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_STAIRS, Items.CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_STAIRS, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_STAIRS, DecoBlocks.CUT_CALCITE);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_SLAB, DecoBlocks.CUT_CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_SLAB, Items.CALCITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_SLAB, DecoBlocks.POLISHED_CALCITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_SLAB, DecoBlocks.CUT_CALCITE,2);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.CUT_CALCITE_WALL, DecoBlocks.CUT_CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_WALL, Items.CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_WALL, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_CALCITE_WALL, DecoBlocks.CUT_CALCITE);

        offerChiseledBlockRecipe( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICKS, DecoBlocks.CUT_CALCITE_SLAB);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICKS, Items.CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICKS, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICKS, DecoBlocks.CUT_CALCITE);

        createStairsRecipe(DecoBlocks.CALCITE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.CALCITE_BRICKS))
                .criterion(hasItem(DecoBlocks.CALCITE_BRICKS),conditionsFromItem(DecoBlocks.CALCITE_BRICKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.CALCITE_BRICK_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_STAIRS, Items.CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_STAIRS, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_STAIRS, DecoBlocks.CUT_CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_STAIRS, DecoBlocks.CALCITE_BRICKS);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_SLAB, DecoBlocks.CALCITE_BRICKS);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_SLAB, Items.CALCITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_SLAB, DecoBlocks.POLISHED_CALCITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_SLAB, DecoBlocks.CUT_CALCITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_SLAB, DecoBlocks.CALCITE_BRICKS,2);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.CALCITE_BRICK_WALL, DecoBlocks.CALCITE_BRICKS);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_WALL, Items.CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_WALL, DecoBlocks.POLISHED_CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_WALL, DecoBlocks.CUT_CALCITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CALCITE_BRICK_WALL, DecoBlocks.CALCITE_BRICKS);

        offerPolishedStoneRecipe( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE, Items.ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE, Items.POLISHED_ANDESITE);

        createStairsRecipe(DecoBlocks.CUT_ANDESITE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_ANDESITE))
                .criterion(hasItem(DecoBlocks.CUT_ANDESITE),conditionsFromItem(DecoBlocks.CUT_ANDESITE))
                .offerTo(exporter, getRecipeName(DecoBlocks.CUT_ANDESITE_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_STAIRS, Items.ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_STAIRS, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_STAIRS, DecoBlocks.CUT_ANDESITE);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_SLAB, DecoBlocks.CUT_ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_SLAB, Items.ANDESITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_SLAB, Items.POLISHED_ANDESITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_SLAB, DecoBlocks.CUT_ANDESITE,2);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.CUT_ANDESITE_WALL, DecoBlocks.CUT_ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_WALL, Items.ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_WALL, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_ANDESITE_WALL, DecoBlocks.CUT_ANDESITE);

        offerChiseledBlockRecipe( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICKS, DecoBlocks.CUT_ANDESITE_SLAB);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICKS, Items.ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICKS, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICKS, DecoBlocks.CUT_ANDESITE);

        createStairsRecipe(DecoBlocks.ANDESITE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.ANDESITE_BRICKS))
                .criterion(hasItem(DecoBlocks.ANDESITE_BRICKS),conditionsFromItem(DecoBlocks.ANDESITE_BRICKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.ANDESITE_BRICK_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_STAIRS, Items.ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_STAIRS, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_STAIRS, DecoBlocks.CUT_ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_STAIRS, DecoBlocks.ANDESITE_BRICKS);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_SLAB, DecoBlocks.ANDESITE_BRICKS);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_SLAB, Items.ANDESITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_SLAB, Items.POLISHED_ANDESITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_SLAB, DecoBlocks.CUT_ANDESITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_SLAB, DecoBlocks.ANDESITE_BRICKS,2);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.ANDESITE_BRICK_WALL, DecoBlocks.ANDESITE_BRICKS);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_WALL, Items.ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_WALL, Items.POLISHED_ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_WALL, DecoBlocks.CUT_ANDESITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.ANDESITE_BRICK_WALL, DecoBlocks.ANDESITE_BRICKS);

        offerPolishedStoneRecipe( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE, Items.GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE, Items.POLISHED_GRANITE);

        createStairsRecipe(DecoBlocks.CUT_GRANITE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_GRANITE))
                .criterion(hasItem(DecoBlocks.CUT_GRANITE),conditionsFromItem(DecoBlocks.CUT_GRANITE))
                .offerTo(exporter, getRecipeName(DecoBlocks.CUT_GRANITE_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_STAIRS, Items.GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_STAIRS, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_STAIRS, DecoBlocks.CUT_GRANITE);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_SLAB, DecoBlocks.CUT_GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_SLAB, Items.GRANITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_SLAB, Items.POLISHED_GRANITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_SLAB, DecoBlocks.CUT_GRANITE,2);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.CUT_GRANITE_WALL, DecoBlocks.CUT_GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_WALL, Items.GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_WALL, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GRANITE_WALL, DecoBlocks.CUT_GRANITE);

        offerChiseledBlockRecipe( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICKS, DecoBlocks.CUT_GRANITE_SLAB);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICKS, Items.GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICKS, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICKS, DecoBlocks.CUT_GRANITE);

        createStairsRecipe(DecoBlocks.GRANITE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.GRANITE_BRICKS))
                .criterion(hasItem(DecoBlocks.GRANITE_BRICKS),conditionsFromItem(DecoBlocks.GRANITE_BRICKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.GRANITE_BRICK_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_STAIRS, Items.GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_STAIRS, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_STAIRS, DecoBlocks.CUT_GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_STAIRS, DecoBlocks.GRANITE_BRICKS);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_SLAB, DecoBlocks.GRANITE_BRICKS);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_SLAB, Items.GRANITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_SLAB, Items.POLISHED_GRANITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_SLAB, DecoBlocks.CUT_GRANITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_SLAB, DecoBlocks.GRANITE_BRICKS,2);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.GRANITE_BRICK_WALL, DecoBlocks.GRANITE_BRICKS);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_WALL, Items.GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_WALL, Items.POLISHED_GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_WALL, DecoBlocks.CUT_GRANITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GRANITE_BRICK_WALL, DecoBlocks.GRANITE_BRICKS);

        offerPolishedStoneRecipe( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE, Items.DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE, Items.POLISHED_DIORITE);

        createStairsRecipe(DecoBlocks.CUT_DIORITE_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_DIORITE))
                .criterion(hasItem(DecoBlocks.CUT_DIORITE),conditionsFromItem(DecoBlocks.CUT_DIORITE))
                .offerTo(exporter, getRecipeName(DecoBlocks.CUT_DIORITE_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_STAIRS, Items.DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_STAIRS, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_STAIRS, DecoBlocks.CUT_DIORITE);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_SLAB, DecoBlocks.CUT_DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_SLAB, Items.DIORITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_SLAB, Items.POLISHED_DIORITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_SLAB, DecoBlocks.CUT_DIORITE,2);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.CUT_DIORITE_WALL, DecoBlocks.CUT_DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_WALL, Items.DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_WALL, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_DIORITE_WALL, DecoBlocks.CUT_DIORITE);

        offerChiseledBlockRecipe( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICKS, DecoBlocks.CUT_DIORITE_SLAB);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICKS, Items.DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICKS, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICKS, DecoBlocks.CUT_DIORITE);

        createStairsRecipe(DecoBlocks.DIORITE_BRICK_STAIRS, Ingredient.ofItems(DecoBlocks.DIORITE_BRICKS))
                .criterion(hasItem(DecoBlocks.DIORITE_BRICKS),conditionsFromItem(DecoBlocks.DIORITE_BRICKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.DIORITE_BRICK_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_STAIRS, Items.DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_STAIRS, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_STAIRS, DecoBlocks.CUT_DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_STAIRS, DecoBlocks.DIORITE_BRICKS);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_SLAB, DecoBlocks.DIORITE_BRICKS);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_SLAB, Items.DIORITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_SLAB, Items.POLISHED_DIORITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_SLAB, DecoBlocks.CUT_DIORITE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_SLAB, DecoBlocks.DIORITE_BRICKS,2);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.DIORITE_BRICK_WALL, DecoBlocks.DIORITE_BRICKS);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_WALL, Items.DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_WALL, Items.POLISHED_DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_WALL, DecoBlocks.CUT_DIORITE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DIORITE_BRICK_WALL, DecoBlocks.DIORITE_BRICKS);

        offerCutCopperRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD, Items.GOLD_BLOCK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD, Items.GOLD_BLOCK,4);

        createStairsRecipe(DecoBlocks.CUT_GOLD_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_GOLD))
                .criterion(hasItem(DecoBlocks.CUT_GOLD),conditionsFromItem(DecoBlocks.CUT_GOLD))
                .offerTo(exporter, getRecipeName(DecoBlocks.CUT_GOLD_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_STAIRS, Items.GOLD_BLOCK,4);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_STAIRS, DecoBlocks.CUT_GOLD);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_SLAB, DecoBlocks.CUT_GOLD);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_SLAB, Items.GOLD_BLOCK,8);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_GOLD_SLAB, DecoBlocks.CUT_GOLD,2);

        createStairsRecipe(DecoBlocks.IRON_STAIRS, Ingredient.ofItems(Items.IRON_BLOCK))
                .criterion(hasItem(Items.IRON_BLOCK),conditionsFromItem(Items.IRON_BLOCK))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_STAIRS, Items.IRON_BLOCK);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_SLAB, Items.IRON_BLOCK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_SLAB, Items.IRON_BLOCK,2);

        createStairsRecipe(DecoBlocks.GOLD_STAIRS, Ingredient.ofItems(Items.GOLD_BLOCK))
                .criterion(hasItem(Items.GOLD_BLOCK),conditionsFromItem(Items.GOLD_BLOCK))
                .offerTo(exporter, getRecipeName(DecoBlocks.GOLD_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_STAIRS, Items.GOLD_BLOCK);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_SLAB, Items.GOLD_BLOCK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_SLAB, Items.GOLD_BLOCK,2);

        createStairsRecipe(DecoBlocks.RAW_IRON_STAIRS, Ingredient.ofItems(Items.RAW_IRON_BLOCK))
                .criterion(hasItem(Items.RAW_IRON_BLOCK),conditionsFromItem(Items.RAW_IRON_BLOCK))
                .offerTo(exporter, getRecipeName(DecoBlocks.RAW_IRON_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_IRON_STAIRS, Items.RAW_IRON_BLOCK);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_IRON_SLAB, Items.RAW_IRON_BLOCK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_IRON_SLAB, Items.RAW_IRON_BLOCK,2);

        createStairsRecipe(DecoBlocks.RAW_GOLD_STAIRS, Ingredient.ofItems(Items.RAW_GOLD_BLOCK))
                .criterion(hasItem(Items.RAW_GOLD_BLOCK),conditionsFromItem(Items.RAW_GOLD_BLOCK))
                .offerTo(exporter, getRecipeName(DecoBlocks.RAW_GOLD_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_GOLD_STAIRS, Items.RAW_GOLD_BLOCK);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_GOLD_SLAB, Items.RAW_GOLD_BLOCK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_GOLD_SLAB, Items.RAW_GOLD_BLOCK,2);

        createStairsRecipe(DecoBlocks.COPPER_STAIRS, Ingredient.ofItems(Items.COPPER_BLOCK))
                .criterion(hasItem(Items.COPPER_BLOCK),conditionsFromItem(Items.COPPER_BLOCK))
                .offerTo(exporter, getRecipeName(DecoBlocks.COPPER_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_STAIRS, Items.COPPER_BLOCK);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_SLAB, Items.COPPER_BLOCK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_SLAB, Items.COPPER_BLOCK,2);

        createStairsRecipe(DecoBlocks.EXPOSED_COPPER_STAIRS, Ingredient.ofItems(Items.EXPOSED_COPPER))
                .criterion(hasItem(Items.EXPOSED_COPPER),conditionsFromItem(Items.EXPOSED_COPPER))
                .offerTo(exporter, getRecipeName(DecoBlocks.EXPOSED_COPPER_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.EXPOSED_COPPER_STAIRS, Items.EXPOSED_COPPER);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.EXPOSED_COPPER_SLAB, Items.EXPOSED_COPPER);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.EXPOSED_COPPER_SLAB, Items.EXPOSED_COPPER,2);

        createStairsRecipe(DecoBlocks.WEATHERED_COPPER_STAIRS, Ingredient.ofItems(Items.WEATHERED_COPPER))
                .criterion(hasItem(Items.WEATHERED_COPPER),conditionsFromItem(Items.WEATHERED_COPPER))
                .offerTo(exporter, getRecipeName(DecoBlocks.WEATHERED_COPPER_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WEATHERED_COPPER_STAIRS, Items.WEATHERED_COPPER);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WEATHERED_COPPER_SLAB, Items.WEATHERED_COPPER);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WEATHERED_COPPER_SLAB, Items.WEATHERED_COPPER,2);

        createStairsRecipe(DecoBlocks.OXIDIZED_COPPER_STAIRS, Ingredient.ofItems(Items.OXIDIZED_COPPER))
                .criterion(hasItem(Items.OXIDIZED_COPPER),conditionsFromItem(Items.OXIDIZED_COPPER))
                .offerTo(exporter, getRecipeName(DecoBlocks.OXIDIZED_COPPER_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OXIDIZED_COPPER_STAIRS, Items.OXIDIZED_COPPER);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OXIDIZED_COPPER_SLAB, Items.OXIDIZED_COPPER);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.OXIDIZED_COPPER_SLAB, Items.OXIDIZED_COPPER,2);

        createStairsRecipe(DecoBlocks.WAXED_COPPER_STAIRS, Ingredient.ofItems(Items.WAXED_COPPER_BLOCK))
                .criterion(hasItem(Items.WAXED_COPPER_BLOCK),conditionsFromItem(Items.WAXED_COPPER_BLOCK))
                .offerTo(exporter, getRecipeName(DecoBlocks.WAXED_COPPER_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_COPPER_STAIRS, Items.WAXED_COPPER_BLOCK);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_COPPER_SLAB, Items.WAXED_COPPER_BLOCK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_COPPER_SLAB, Items.WAXED_COPPER_BLOCK,2);

        createStairsRecipe(DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS, Ingredient.ofItems(Items.WAXED_EXPOSED_COPPER))
                .criterion(hasItem(Items.WAXED_EXPOSED_COPPER),conditionsFromItem(Items.WAXED_EXPOSED_COPPER))
                .offerTo(exporter, getRecipeName(DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_EXPOSED_COPPER_STAIRS, Items.WAXED_EXPOSED_COPPER);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_EXPOSED_COPPER_SLAB, Items.WAXED_EXPOSED_COPPER);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_EXPOSED_COPPER_SLAB, Items.WAXED_EXPOSED_COPPER,2);

        createStairsRecipe(DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS, Ingredient.ofItems(Items.WAXED_WEATHERED_COPPER))
                .criterion(hasItem(Items.WAXED_WEATHERED_COPPER),conditionsFromItem(Items.WAXED_WEATHERED_COPPER))
                .offerTo(exporter, getRecipeName(DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_WEATHERED_COPPER_STAIRS, Items.WAXED_WEATHERED_COPPER);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_WEATHERED_COPPER_SLAB, Items.WAXED_WEATHERED_COPPER);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_WEATHERED_COPPER_SLAB, Items.WAXED_WEATHERED_COPPER,2);

        createStairsRecipe(DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS, Ingredient.ofItems(Items.WAXED_OXIDIZED_COPPER))
                .criterion(hasItem(Items.WAXED_OXIDIZED_COPPER),conditionsFromItem(Items.WAXED_OXIDIZED_COPPER))
                .offerTo(exporter, getRecipeName(DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_OXIDIZED_COPPER_STAIRS, Items.WAXED_OXIDIZED_COPPER);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB, Items.WAXED_OXIDIZED_COPPER);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.WAXED_OXIDIZED_COPPER_SLAB, Items.WAXED_OXIDIZED_COPPER,2);

        createStairsRecipe(DecoBlocks.RAW_COPPER_STAIRS, Ingredient.ofItems(Items.RAW_COPPER_BLOCK))
                .criterion(hasItem(Items.RAW_COPPER_BLOCK),conditionsFromItem(Items.RAW_COPPER_BLOCK))
                .offerTo(exporter, getRecipeName(DecoBlocks.RAW_COPPER_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_COPPER_STAIRS, Items.RAW_COPPER_BLOCK);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_COPPER_SLAB, Items.RAW_COPPER_BLOCK);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.RAW_COPPER_SLAB, Items.RAW_COPPER_BLOCK,2);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLESTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.STONE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.COBBLESTONE_STAIRS), conditionsFromItem(Items.COBBLESTONE_STAIRS))
                .offerTo(exporter, getRecipeName(Items.STONE_STAIRS) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLESTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.STONE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.COBBLESTONE_SLAB), conditionsFromItem(Items.COBBLESTONE_SLAB))
                .offerTo(exporter, getRecipeName(Items.STONE_SLAB) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLESTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.STONE_WALL,
                        0.1f, 200).criterion(hasItem(Items.COBBLESTONE_WALL), conditionsFromItem(Items.COBBLESTONE_WALL))
                .offerTo(exporter, getRecipeName(DecoBlocks.STONE_WALL) + "_form_smelting");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.STONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_STONE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.STONE_STAIRS), conditionsFromItem(Items.STONE_STAIRS))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_STONE_STAIRS) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.STONE_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_STONE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.STONE_SLAB), conditionsFromItem(Items.STONE_SLAB))
                .offerTo(exporter, getRecipeName(Items.SMOOTH_STONE_SLAB) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.STONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_STONE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.STONE_WALL), conditionsFromItem(DecoBlocks.STONE_WALL))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_STONE_WALL) + "_form_smelting");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLED_DEEPSLATE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEEPSLATE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.COBBLED_DEEPSLATE_STAIRS), conditionsFromItem(Items.COBBLED_DEEPSLATE_STAIRS))
                .offerTo(exporter, getRecipeName(DecoBlocks.DEEPSLATE_STAIRS) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLED_DEEPSLATE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.DEEPSLATE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.COBBLED_DEEPSLATE_SLAB), conditionsFromItem(Items.COBBLED_DEEPSLATE_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.DEEPSLATE_SLAB) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.COBBLED_DEEPSLATE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.DEEPSLATE_WALL,
                        0.1f, 200).criterion(hasItem(Items.COBBLED_DEEPSLATE_WALL), conditionsFromItem(Items.COBBLED_DEEPSLATE_WALL))
                .offerTo(exporter, getRecipeName(DecoBlocks.DEEPSLATE_WALL) + "_form_smelting");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.SANDSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_SANDSTONE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.SANDSTONE_STAIRS), conditionsFromItem(Items.SANDSTONE_STAIRS))
                .offerTo(exporter, getRecipeName(Items.SMOOTH_SANDSTONE_STAIRS) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.SANDSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_SANDSTONE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.SANDSTONE_SLAB), conditionsFromItem(Items.SANDSTONE_SLAB))
                .offerTo(exporter, getRecipeName(Items.SMOOTH_SANDSTONE_SLAB) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.SANDSTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_SANDSTONE_WALL,
                        0.1f, 200).criterion(hasItem(Items.SANDSTONE_WALL), conditionsFromItem(Items.SANDSTONE_WALL))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_SANDSTONE_WALL) + "_form_smelting");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_SANDSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_RED_SANDSTONE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.RED_SANDSTONE_STAIRS), conditionsFromItem(Items.RED_SANDSTONE_STAIRS))
                .offerTo(exporter, getRecipeName(Items.SMOOTH_RED_SANDSTONE_STAIRS) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_SANDSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_RED_SANDSTONE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.RED_SANDSTONE_SLAB), conditionsFromItem(Items.RED_SANDSTONE_SLAB))
                .offerTo(exporter, getRecipeName(Items.SMOOTH_RED_SANDSTONE_SLAB) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RED_SANDSTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_RED_SANDSTONE_WALL,
                        0.1f, 200).criterion(hasItem(Items.RED_SANDSTONE_WALL), conditionsFromItem(Items.RED_SANDSTONE_WALL))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_RED_SANDSTONE_WALL) + "_form_smelting");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.QUARTZ_STAIRS), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_QUARTZ_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.QUARTZ_STAIRS), conditionsFromItem(Items.QUARTZ_STAIRS))
                .offerTo(exporter, getRecipeName(Items.SMOOTH_QUARTZ_STAIRS) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.QUARTZ_SLAB), RecipeCategory.BUILDING_BLOCKS, Items.SMOOTH_QUARTZ_SLAB,
                        0.1f, 200).criterion(hasItem(Items.QUARTZ_SLAB), conditionsFromItem(Items.QUARTZ_SLAB))
                .offerTo(exporter, getRecipeName(Items.SMOOTH_QUARTZ_SLAB) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.QUARTZ_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_QUARTZ_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.QUARTZ_WALL), conditionsFromItem(DecoBlocks.QUARTZ_WALL))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_QUARTZ_WALL) + "_form_smelting");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.SOUL_SOILSTONE_STAIRS), conditionsFromItem(DecoBlocks.SOUL_SOILSTONE_STAIRS))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_SOUL_SOILSTONE_STAIRS) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.SOUL_SOILSTONE_SLAB), conditionsFromItem(DecoBlocks.SOUL_SOILSTONE_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_SOUL_SOILSTONE_SLAB) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SOUL_SOILSTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.SOUL_SOILSTONE_WALL), conditionsFromItem(DecoBlocks.SOUL_SOILSTONE_WALL))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_SOUL_SOILSTONE_WALL) + "_form_smelting");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BLACKSTONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_BLACKSTONE_STAIRS,
                        0.1f, 200).criterion(hasItem(Items.BLACKSTONE_STAIRS), conditionsFromItem(Items.BLACKSTONE_STAIRS))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_BLACKSTONE_STAIRS) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BLACKSTONE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_BLACKSTONE_SLAB,
                        0.1f, 200).criterion(hasItem(Items.BLACKSTONE_SLAB), conditionsFromItem(Items.BLACKSTONE_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_BLACKSTONE_SLAB) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.BLACKSTONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_BLACKSTONE_WALL,
                        0.1f, 200).criterion(hasItem(Items.BLACKSTONE_WALL), conditionsFromItem(Items.BLACKSTONE_WALL))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_BLACKSTONE_WALL) + "_form_smelting");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.DEEPSLATE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_DEEPSLATE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.DEEPSLATE_STAIRS), conditionsFromItem(DecoBlocks.DEEPSLATE_STAIRS))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_DEEPSLATE_STAIRS) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.DEEPSLATE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_DEEPSLATE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.DEEPSLATE_SLAB), conditionsFromItem(DecoBlocks.DEEPSLATE_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_DEEPSLATE_SLAB) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.DEEPSLATE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_DEEPSLATE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.DEEPSLATE_WALL), conditionsFromItem(DecoBlocks.DEEPSLATE_WALL))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_DEEPSLATE_WALL) + "_form_smelting");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RAW_IRON_BLOCK), RecipeCategory.MISC, Items.IRON_BLOCK,
                        6.3f, 1800).criterion(hasItem(Items.RAW_IRON_BLOCK), conditionsFromItem(Items.RAW_IRON_BLOCK))
                .offerTo(exporter, getRecipeName(Items.IRON_BLOCK) + "_form_smelting");

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(Items.RAW_IRON_BLOCK), RecipeCategory.MISC, Items.IRON_BLOCK,
                        6.3f, 900).criterion(hasItem(Items.RAW_IRON_BLOCK), conditionsFromItem(Items.RAW_IRON_BLOCK))
                .offerTo(exporter, getRecipeName(Items.IRON_BLOCK) + "_form_blasting");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_IRON_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_IRON_STAIRS), conditionsFromItem(DecoBlocks.RAW_IRON_STAIRS))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_STAIRS) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_IRON_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_IRON_SLAB), conditionsFromItem(DecoBlocks.RAW_IRON_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_SLAB) + "_form_smelting");

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_IRON_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_STAIRS,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_IRON_STAIRS), conditionsFromItem(DecoBlocks.RAW_IRON_STAIRS))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_STAIRS) + "_form_blasting");
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_IRON_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_SLAB,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_IRON_SLAB), conditionsFromItem(DecoBlocks.RAW_IRON_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.RAW_IRON_SLAB) + "_form_blasting");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC, Items.GOLD_BLOCK,
                        6.3f, 1800).criterion(hasItem(Items.RAW_GOLD_BLOCK), conditionsFromItem(Items.RAW_GOLD_BLOCK))
                .offerTo(exporter, getRecipeName(Items.GOLD_BLOCK) + "_form_smelting");
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(Items.RAW_GOLD_BLOCK), RecipeCategory.MISC, Items.GOLD_BLOCK,
                        6.3f, 900).criterion(hasItem(Items.RAW_GOLD_BLOCK), conditionsFromItem(Items.RAW_GOLD_BLOCK))
                .offerTo(exporter, getRecipeName(Items.GOLD_BLOCK) + "_form_blasting");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_GOLD_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_GOLD_STAIRS), conditionsFromItem(DecoBlocks.RAW_GOLD_STAIRS))
                .offerTo(exporter, getRecipeName(DecoBlocks.GOLD_STAIRS) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_GOLD_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_GOLD_SLAB), conditionsFromItem(DecoBlocks.RAW_GOLD_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.GOLD_SLAB) + "_form_smelting");

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_GOLD_STAIRS),  RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_STAIRS,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_GOLD_STAIRS), conditionsFromItem(DecoBlocks.RAW_GOLD_STAIRS))
                .offerTo(exporter, getRecipeName(DecoBlocks.GOLD_STAIRS) + "_form_blasting");
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_GOLD_SLAB),  RecipeCategory.BUILDING_BLOCKS, DecoBlocks.GOLD_SLAB,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_GOLD_SLAB), conditionsFromItem(DecoBlocks.RAW_GOLD_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.GOLD_SLAB) + "_form_blasting");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC, Items.COPPER_BLOCK,
                        6.3f, 1800).criterion(hasItem(Items.RAW_COPPER_BLOCK), conditionsFromItem(Items.RAW_COPPER_BLOCK))
                .offerTo(exporter, getRecipeName(Items.COPPER_BLOCK) + "_form_smelting");
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(Items.RAW_COPPER_BLOCK), RecipeCategory.MISC, Items.COPPER_BLOCK,
                        6.3f, 900).criterion(hasItem(Items.RAW_COPPER_BLOCK), conditionsFromItem(Items.RAW_COPPER_BLOCK))
                .offerTo(exporter, getRecipeName(Items.COPPER_BLOCK) + "_form_blasting");

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_COPPER_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_COPPER_STAIRS), conditionsFromItem(DecoBlocks.RAW_COPPER_STAIRS))
                .offerTo(exporter, getRecipeName(DecoBlocks.COPPER_STAIRS) + "_form_smelting");
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.RAW_COPPER_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.RAW_COPPER_SLAB), conditionsFromItem(DecoBlocks.RAW_COPPER_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.COPPER_SLAB) + "_form_smelting");

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_COPPER_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_STAIRS,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_COPPER_STAIRS), conditionsFromItem(DecoBlocks.RAW_COPPER_STAIRS))
                .offerTo(exporter, getRecipeName(DecoBlocks.COPPER_STAIRS) + "_form_blasting");
        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.RAW_COPPER_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.COPPER_SLAB,
                        0.1f, 100).criterion(hasItem(DecoBlocks.RAW_COPPER_SLAB), conditionsFromItem(DecoBlocks.RAW_COPPER_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.COPPER_SLAB) + "_form_blasting");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.DEEPSLATE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.DEEPSLATE)
                .group("lever")
                .criterion(hasItem(Items.DEEPSLATE),
                        conditionsFromItem(Items.DEEPSLATE))
                .offerTo(exporter, getRecipeName(DecoBlocks.DEEPSLATE_LEVER)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.COBBLED_DEEPSLATE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.COBBLED_DEEPSLATE)
                .group("lever")
                .criterion(hasItem(Items.COBBLED_DEEPSLATE),
                        conditionsFromItem(Items.COBBLED_DEEPSLATE))
                .offerTo(exporter, getRecipeName(DecoBlocks.COBBLED_DEEPSLATE_LEVER)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_DEEPSLATE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.POLISHED_DEEPSLATE)
                .group("lever")
                .criterion(hasItem(Items.POLISHED_DEEPSLATE),
                        conditionsFromItem(Items.POLISHED_DEEPSLATE))
                .offerTo(exporter, getRecipeName(DecoBlocks.POLISHED_DEEPSLATE_LEVER)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.STONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.STONE)
                .group("lever")
                .criterion(hasItem(Items.STONE),
                        conditionsFromItem(Items.STONE))
                .offerTo(exporter, getRecipeName(DecoBlocks.STONE_LEVER)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_STONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.POLISHED_STONE)
                .group("lever")
                .criterion(hasItem(DecoBlocks.POLISHED_STONE),
                        conditionsFromItem(DecoBlocks.POLISHED_STONE))
                .offerTo(exporter, getRecipeName(DecoBlocks.POLISHED_STONE_LEVER)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.BLACKSTONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.BLACKSTONE)
                .group("lever")
                .criterion(hasItem(Items.BLACKSTONE),
                        conditionsFromItem(Items.BLACKSTONE))
                .offerTo(exporter, getRecipeName(DecoBlocks.BLACKSTONE_LEVER)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_BLACKSTONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.POLISHED_BLACKSTONE)
                .group("lever")
                .criterion(hasItem(Items.POLISHED_BLACKSTONE),
                        conditionsFromItem(Items.POLISHED_BLACKSTONE))
                .offerTo(exporter, getRecipeName(DecoBlocks.POLISHED_BLACKSTONE_LEVER)+ "_recipe_create");

        createShaped(RecipeCategory.DECORATIONS, DecoBlocks.HEAVY_GOLD_BARS)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.GOLD_BARS)
                .criterion(hasItem(DecoBlocks.GOLD_BARS),
                        conditionsFromItem(DecoBlocks.GOLD_BARS))
                .offerTo(exporter, getRecipeName(DecoBlocks.HEAVY_GOLD_BARS)+ "_recipe_create");

        createShaped(RecipeCategory.DECORATIONS, DecoBlocks.GOLD_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.GOLD_INGOT)
                .criterion(hasItem(Items.GOLD_INGOT),
                        conditionsFromItem(Items.GOLD_INGOT))
                .offerTo(exporter, getRecipeName(DecoBlocks.GOLD_BARS)+ "_recipe_create");

        createShaped(RecipeCategory.DECORATIONS, DecoBlocks.LIGHT_GOLD_BARS,16)
                .pattern("###")
                .pattern("###")
                .input('#', Items.GOLD_NUGGET)
                .criterion(hasItem(Items.GOLD_NUGGET),
                        conditionsFromItem(Items.GOLD_NUGGET))
                .offerTo(exporter, getRecipeName(DecoBlocks.LIGHT_GOLD_BARS)+ "_recipe_create");

        createShapeless(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN)
                .input(ItemTags.SAND)
                .input(Items.OBSIDIAN)
                .criterion(hasItem(Items.OBSIDIAN),
                        conditionsFromItem(Items.OBSIDIAN))
                .offerTo(exporter, getRecipeName(DecoBlocks.SANDED_OBSIDIAN)+ "_recipe_create");

        createStairsRecipe(DecoBlocks.SANDED_OBSIDIAN_STAIRS, Ingredient.ofItems(DecoBlocks.SANDED_OBSIDIAN))
                .criterion(hasItem(DecoBlocks.SANDED_OBSIDIAN),conditionsFromItem(DecoBlocks.SANDED_OBSIDIAN))
                .offerTo(exporter, getRecipeName(DecoBlocks.SANDED_OBSIDIAN_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_STAIRS, DecoBlocks.SANDED_OBSIDIAN);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_SLAB, DecoBlocks.SANDED_OBSIDIAN);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_SLAB, DecoBlocks.SANDED_OBSIDIAN,2);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.SANDED_OBSIDIAN_WALL, DecoBlocks.SANDED_OBSIDIAN);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SANDED_OBSIDIAN_WALL, DecoBlocks.SANDED_OBSIDIAN);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.OBSIDIAN), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN,
                        0.1f, 200).criterion(hasItem(Items.OBSIDIAN), conditionsFromItem(Items.OBSIDIAN))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_OBSIDIAN)+ "_recipe_create");

        createStairsRecipe(DecoBlocks.SMOOTH_OBSIDIAN_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_OBSIDIAN))
                .criterion(hasItem(DecoBlocks.SMOOTH_OBSIDIAN),conditionsFromItem(DecoBlocks.SMOOTH_OBSIDIAN))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_OBSIDIAN_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_STAIRS, DecoBlocks.SMOOTH_OBSIDIAN);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.OBSIDIAN_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.OBSIDIAN_STAIRS), conditionsFromItem(DecoBlocks.OBSIDIAN_STAIRS))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_OBSIDIAN_STAIRS)+ "_from_smelting");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_SLAB, DecoBlocks.SMOOTH_OBSIDIAN);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_SLAB, DecoBlocks.SMOOTH_OBSIDIAN,2);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.OBSIDIAN_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.OBSIDIAN_SLAB), conditionsFromItem(DecoBlocks.OBSIDIAN_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_OBSIDIAN_SLAB)+ "_from_smelting");

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_OBSIDIAN_WALL, DecoBlocks.SMOOTH_OBSIDIAN);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_OBSIDIAN_WALL, DecoBlocks.SMOOTH_OBSIDIAN);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.OBSIDIAN_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_OBSIDIAN_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.OBSIDIAN_WALL), conditionsFromItem(DecoBlocks.OBSIDIAN_WALL))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_OBSIDIAN_WALL)+ "_from_smelting");

        createShaped(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN,4)
                .pattern("#O")
                .pattern("O#")
                .input('#', DecoBlocks.SANDED_OBSIDIAN)
                .input('O', Items.OBSIDIAN)
                .criterion(hasItem(DecoBlocks.SANDED_OBSIDIAN),
                        conditionsFromItem(DecoBlocks.SANDED_OBSIDIAN))
                .offerTo(exporter, getRecipeName(DecoBlocks.CUT_OBSIDIAN)+ "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN, DecoBlocks.SANDED_OBSIDIAN);

        createStairsRecipe(DecoBlocks.CUT_OBSIDIAN_STAIRS, Ingredient.ofItems(DecoBlocks.CUT_OBSIDIAN))
                .criterion(hasItem(DecoBlocks.CUT_OBSIDIAN),conditionsFromItem(DecoBlocks.CUT_OBSIDIAN))
                .offerTo(exporter, getRecipeName(DecoBlocks.CUT_OBSIDIAN_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_STAIRS, DecoBlocks.SANDED_OBSIDIAN);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_STAIRS, DecoBlocks.CUT_OBSIDIAN);

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_SLAB, DecoBlocks.CUT_OBSIDIAN);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_SLAB, DecoBlocks.SANDED_OBSIDIAN,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_SLAB, DecoBlocks.CUT_OBSIDIAN,2);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.CUT_OBSIDIAN_WALL, DecoBlocks.CUT_OBSIDIAN);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_WALL, DecoBlocks.SANDED_OBSIDIAN);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CUT_OBSIDIAN_WALL, DecoBlocks.CUT_OBSIDIAN);

        offerChiseledBlockRecipe( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_MAGMA_BLOCK, DecoBlocks.MAGMA_SLAB);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_MAGMA_BLOCK, DecoBlocks.MAGMA_SLAB);

        offerChiseledBlockRecipe( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_BUBBLE_BLOCK, DecoBlocks.BUBBLE_SLAB);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_BUBBLE_BLOCK, DecoBlocks.BUBBLE_SLAB);

        createShapeless(RecipeCategory.MISC, Items.YELLOW_DYE)
                .input(DecoBlocks.BUTTERCUP)
                .group("yellow_dye")
                .criterion(hasItem(DecoBlocks.BUTTERCUP),
                        conditionsFromItem(DecoBlocks.BUTTERCUP))
                .offerTo(exporter, getRecipeName(Items.YELLOW_DYE) + "_from_buttercup");
        createShapeless(RecipeCategory.MISC, Items.LIME_DYE)
                .input(DecoBlocks.NIGHTSHADE)
                .group("lime_dye")
                .criterion(hasItem(DecoBlocks.NIGHTSHADE),
                        conditionsFromItem(DecoBlocks.NIGHTSHADE))
                .offerTo(exporter, getRecipeName(Items.LIME_DYE) + "_from_nightshade");
        createShapeless(RecipeCategory.MISC, Items.BLACK_DYE)
                .input(DecoBlocks.ENDERSHADE)
                .group("black_dye")
                .criterion(hasItem(DecoBlocks.ENDERSHADE),
                        conditionsFromItem(DecoBlocks.ENDERSHADE))
                .offerTo(exporter, getRecipeName(Items.LIME_DYE) + "_from_endershade");

        offerChiseledBlockRecipe( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE, DecoBlocks.POLISHED_END_STONE_SLAB);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE, Items.END_STONE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHISELED_END_STONE, DecoBlocks.POLISHED_END_STONE);


        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE, Items.END_STONE);


        createStairsRecipe(DecoBlocks.POLISHED_END_STONE_STAIRS, Ingredient.ofItems(DecoBlocks.POLISHED_END_STONE))
                .criterion(hasItem(DecoBlocks.POLISHED_END_STONE),conditionsFromItem(DecoBlocks.POLISHED_END_STONE))
                .offerTo(exporter, getRecipeName(DecoBlocks.POLISHED_END_STONE_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_STAIRS, DecoBlocks.POLISHED_END_STONE);


        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_SLAB, DecoBlocks.POLISHED_END_STONE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_SLAB, DecoBlocks.POLISHED_END_STONE,2);


        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.POLISHED_END_STONE_WALL, DecoBlocks.POLISHED_END_STONE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_WALL, DecoBlocks.POLISHED_END_STONE);


        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.END_STONE_BRICKS, DecoBlocks.POLISHED_END_STONE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.END_STONE_BRICK_STAIRS, DecoBlocks.POLISHED_END_STONE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.END_STONE_BRICK_SLAB, DecoBlocks.POLISHED_END_STONE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, Items.END_STONE_BRICK_WALL, DecoBlocks.POLISHED_END_STONE);


        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.END_STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_BRICKS,
                        0.1f, 200).criterion(hasItem(Items.END_STONE_BRICKS), conditionsFromItem(Items.END_STONE_BRICKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.CRACKED_END_STONE_BRICKS)+ "_recipe_create");


        offerPolishedStoneRecipe( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, Items.END_STONE_BRICKS);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, Items.END_STONE_BRICKS);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, Items.END_STONE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILES, DecoBlocks.POLISHED_END_STONE);


        createStairsRecipe(DecoBlocks.END_STONE_TILE_STAIRS, Ingredient.ofItems(DecoBlocks.END_STONE_TILES))
                .criterion(hasItem(DecoBlocks.END_STONE_TILES),conditionsFromItem(DecoBlocks.END_STONE_TILES))
                .offerTo(exporter, getRecipeName(DecoBlocks.END_STONE_TILE_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_STAIRS, DecoBlocks.END_STONE_TILES);


        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_SLAB, DecoBlocks.END_STONE_TILES);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_SLAB, DecoBlocks.END_STONE_TILES,2);


        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_TILE_WALL, DecoBlocks.END_STONE_TILES);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_WALL, DecoBlocks.END_STONE_TILES);


        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_STAIRS, Items.END_STONE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_SLAB, Items.END_STONE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_WALL, Items.END_STONE);


        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_STAIRS, DecoBlocks.POLISHED_END_STONE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_SLAB, DecoBlocks.POLISHED_END_STONE,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_WALL, DecoBlocks.POLISHED_END_STONE);


        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_STAIRS, Items.END_STONE_BRICKS);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_SLAB, Items.END_STONE_BRICKS,2);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_TILE_WALL, Items.END_STONE_BRICKS);


        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_TILES), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CRACKED_END_STONE_TILES,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_TILES), conditionsFromItem(DecoBlocks.END_STONE_TILES))
                .offerTo(exporter, getRecipeName(DecoBlocks.CRACKED_END_STONE_TILES)+ "_recipe_create");


        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(Items.END_STONE), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE,
                        0.1f, 200).criterion(hasItem(Items.END_STONE), conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_END_STONE)+ "_recipe_create");


        createStairsRecipe(DecoBlocks.SMOOTH_END_STONE_STAIRS, Ingredient.ofItems(DecoBlocks.SMOOTH_END_STONE))
                .criterion(hasItem(DecoBlocks.SMOOTH_END_STONE),conditionsFromItem(DecoBlocks.SMOOTH_END_STONE))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_END_STONE_STAIRS) + "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_STAIRS, DecoBlocks.SMOOTH_END_STONE);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_STAIRS), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_STAIRS,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_STAIRS), conditionsFromItem(DecoBlocks.END_STONE_STAIRS))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_END_STONE_STAIRS) + "_from_smelting");


        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_SLAB, DecoBlocks.SMOOTH_END_STONE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_SLAB, DecoBlocks.SMOOTH_END_STONE,2);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_SLAB), RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_SLAB,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_SLAB), conditionsFromItem(DecoBlocks.END_STONE_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_END_STONE_SLAB) + "_from_smelting");


        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_END_STONE_WALL, DecoBlocks.SMOOTH_END_STONE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.SMOOTH_END_STONE_WALL, DecoBlocks.SMOOTH_END_STONE);
        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.END_STONE_WALL), RecipeCategory.DECORATIONS, DecoBlocks.SMOOTH_END_STONE_WALL,
                        0.1f, 200).criterion(hasItem(DecoBlocks.END_STONE_WALL), conditionsFromItem(DecoBlocks.END_STONE_WALL))
                .offerTo(exporter, getRecipeName(DecoBlocks.SMOOTH_END_STONE_WALL) + "_from_smelting");

        createShapeless(RecipeCategory.REDSTONE, DecoBlocks.END_STONE_BUTTON)
                .input(Items.END_STONE)
                .criterion(hasItem(Items.END_STONE),
                        conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, getRecipeName(DecoBlocks.END_STONE_BUTTON)+ "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_BUTTON, Items.END_STONE);

        offerPressurePlateRecipe(DecoBlocks.END_STONE_PRESSURE_PLATE, Items.END_STONE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.END_STONE_PRESSURE_PLATE, Items.END_STONE);

        offerPressurePlateRecipe(DecoBlocks.POLISHED_END_STONE_PRESSURE_PLATE, DecoBlocks.POLISHED_END_STONE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_PRESSURE_PLATE, Items.END_STONE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_PRESSURE_PLATE, DecoBlocks.POLISHED_END_STONE);

        createShapeless(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_END_STONE_BUTTON)
                .input(DecoBlocks.POLISHED_END_STONE)
                .criterion(hasItem(DecoBlocks.POLISHED_END_STONE),
                        conditionsFromItem(DecoBlocks.POLISHED_END_STONE))
                .offerTo(exporter, getRecipeName(DecoBlocks.POLISHED_END_STONE_BUTTON)+ "_recipe_create");
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_BUTTON, Items.END_STONE);
        offerStonecuttingRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.POLISHED_END_STONE_BUTTON, DecoBlocks.POLISHED_END_STONE);

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.END_STONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', Items.END_STONE)
                .group("lever")
                .criterion(hasItem(Items.END_STONE),
                        conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, getRecipeName(DecoBlocks.END_STONE_LEVER)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.POLISHED_END_STONE_LEVER)
                .pattern("/")
                .pattern("#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.POLISHED_END_STONE)
                .group("lever")
                .criterion(hasItem(DecoBlocks.POLISHED_END_STONE),
                        conditionsFromItem(DecoBlocks.POLISHED_END_STONE))
                .offerTo(exporter, getRecipeName(DecoBlocks.POLISHED_END_STONE_LEVER)+ "_recipe_create");

        createShaped(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_BLAST_FURNACE)
                .pattern("III")
                .pattern("IXI")
                .pattern("###")
                .input('I', Items.IRON_INGOT)
                .input('X', DecoBlocks.END_STONE_FURNACE)
                .input('#', DecoBlocks.SMOOTH_END_STONE)
                .criterion(hasItem(DecoBlocks.SMOOTH_END_STONE),
                        conditionsFromItem(DecoBlocks.SMOOTH_END_STONE))
                .offerTo(exporter, getRecipeName(DecoBlocks.END_STONE_BLAST_FURNACE)+ "_recipe_create");

        createShaped(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_SMOKER)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', ItemTags.LOGS)
                .input('X', DecoBlocks.END_STONE_FURNACE)
                .criterion(hasItem(DecoBlocks.END_STONE_FURNACE),
                        conditionsFromItem(DecoBlocks.END_STONE_FURNACE))
                .offerTo(exporter, getRecipeName(DecoBlocks.END_STONE_SMOKER)+ "_recipe_create");

        createShaped(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_STONECUTTER)
                .pattern(" I ")
                .pattern("###")
                .input('I', Items.IRON_INGOT)
                .input('#', Items.END_STONE)
                .criterion(hasItem(Items.END_STONE),
                        conditionsFromItem(Items.END_STONE))
                .offerTo(exporter, getRecipeName(DecoBlocks.END_STONE_STONECUTTER)+ "_recipe_create");

        createShaped(RecipeCategory.DECORATIONS, DecoBlocks.END_STONE_GRINDSTONE)
                .pattern("I-I")
                .pattern("# #")
                .input('I', Items.STICK)
                .input('-', DecoBlocks.END_STONE_SLAB)
                .input('#', ItemTags.PLANKS)
                .criterion(hasItem(DecoBlocks.END_STONE_SLAB),
                        conditionsFromItem(DecoBlocks.END_STONE_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.END_STONE_GRINDSTONE)+ "_recipe_create");

        createStairsRecipe(DecoBlocks.CHERRY_WOOD_STAIRS, Ingredient.ofItems(Items.CHERRY_WOOD))
                .criterion(hasItem(Items.CHERRY_WOOD),conditionsFromItem(Items.CHERRY_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.CHERRY_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.CHERRY_WOOD_SLAB, Items.CHERRY_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.CHERRY_WOOD_WALL, Items.CHERRY_WOOD);

        createStairsRecipe(DecoBlocks.STRIPPED_CHERRY_WOOD_STAIRS, Ingredient.ofItems(Items.STRIPPED_CHERRY_WOOD))
                .criterion(hasItem(Items.STRIPPED_CHERRY_WOOD),conditionsFromItem(Items.STRIPPED_CHERRY_WOOD))
                .offerTo(exporter, getRecipeName(DecoBlocks.STRIPPED_CHERRY_WOOD_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_CHERRY_WOOD_SLAB, Items.STRIPPED_CHERRY_WOOD);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_CHERRY_WOOD_WALL, Items.STRIPPED_CHERRY_WOOD);

        offerNoteBlockVariantRecipe(exporter, DecoBlocks.CHERRY_NOTE_BLOCK, Items.CHERRY_PLANKS);
        offerNoteBlockVariantRecipe(exporter, DecoBlocks.BAMBOO_NOTE_BLOCK, Items.BAMBOO_PLANKS);

        offerBookshelvesVariantRecipe(exporter, DecoBlocks.MUSHROOM_BOOKSHELF, DecoBlocks.MUSHROOM_BOOKSHELF);

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.CHERRY_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.CHERRY_SLAB)
                .group("pallet_doors")
                .criterion(hasItem(Items.CHERRY_SLAB),
                        conditionsFromItem(Items.CHERRY_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.CHERRY_PALLET_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE, DecoBlocks.CHERRY_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.CHERRY_SLAB)
                .group("pallet_trapdoors")
                .criterion(hasItem(Items.CHERRY_SLAB),
                        conditionsFromItem(Items.CHERRY_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.CHERRY_PALLET_TRAPDOOR)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE, DecoBlocks.BAMBOO_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', Items.BAMBOO_SLAB)
                .group("pallet_doors")
                .criterion(hasItem(Items.BAMBOO_SLAB),
                        conditionsFromItem(Items.BAMBOO_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.BAMBOO_PALLET_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE, DecoBlocks.BAMBOO_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', Items.BAMBOO_SLAB)
                .group("pallet_trapdoors")
                .criterion(hasItem(Items.BAMBOO_SLAB),
                        conditionsFromItem(Items.BAMBOO_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.BAMBOO_PALLET_TRAPDOOR)+ "_recipe_create");

        offerChiseledBlockRecipe( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MUSHROOM_MOSAIC, DecoBlocks.MUSHROOM_SLAB);

        createStairsRecipe(DecoBlocks.MUSHROOM_MOSAIC_STAIRS, Ingredient.ofItems(DecoBlocks.MUSHROOM_MOSAIC))
                .criterion(hasItem(DecoBlocks.MUSHROOM_MOSAIC),conditionsFromItem(DecoBlocks.MUSHROOM_MOSAIC))
                .offerTo(exporter, getRecipeName(DecoBlocks.MUSHROOM_MOSAIC_STAIRS) + "_recipe_create");
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.MUSHROOM_MOSAIC_SLAB, DecoBlocks.MUSHROOM_MOSAIC);

        createSignRecipe(DecoItems.STRIPPED_CACTUS_SIGN, Ingredient.ofItems(DecoBlocks.STRIPPED_CACTUS))
                .criterion(hasItem(DecoBlocks.STRIPPED_CACTUS),conditionsFromItem(DecoBlocks.STRIPPED_CACTUS))
                .offerTo(exporter, getRecipeName(DecoItems.STRIPPED_CACTUS_SIGN)+ "_recipe_create");
        createSignRecipe(DecoItems.MUSHROOM_STEM_SIGN, Ingredient.ofItems(Blocks.MUSHROOM_STEM))
                .criterion(hasItem(Blocks.MUSHROOM_STEM),conditionsFromItem(Blocks.MUSHROOM_STEM))
                .offerTo(exporter, getRecipeName(DecoItems.MUSHROOM_STEM_SIGN)+ "_recipe_create");
        createSignRecipe(DecoItems.MUSHROOM_MOSAIC_SIGN, Ingredient.ofItems(DecoBlocks.MUSHROOM_MOSAIC))
                .criterion(hasItem(DecoBlocks.MUSHROOM_MOSAIC),conditionsFromItem(DecoBlocks.MUSHROOM_MOSAIC))
                .offerTo(exporter, getRecipeName(DecoItems.MUSHROOM_MOSAIC_SIGN)+ "_recipe_create");

        offerHangingSignRecipe(DecoItems.CACTUS_HANGING_SIGN, DecoBlocks.STRIPPED_CACTUS);
        offerHangingSignRecipe(DecoItems.MUSHROOM_HANGING_SIGN, Blocks.MUSHROOM_STEM);

        offerHangingSignRecipe(DecoItems.MUSHROOM_PLANKS_HANGING_SIGN, DecoBlocks.MUSHROOM_PLANKS);

        offerHangingSignRecipe(DecoItems.MUSHROOM_MOSAIC_HANGING_SIGN, DecoBlocks.MUSHROOM_MOSAIC);

        offerBoatRecipe(DecoItems.MUSHROOM_BOAT, DecoBlocks.MUSHROOM_PLANKS);
        offerChestBoatRecipe(DecoItems.MUSHROOM_CHEST_BOAT, DecoItems.MUSHROOM_BOAT);

        createShaped(RecipeCategory.TRANSPORTATION, DecoItems.OAK_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.OAK_PLANKS)
                .input('-', Items.OAK_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, getRecipeName(DecoItems.OAK_RAFT)+ "_recipe_create");
        offerChestBoatRecipe(DecoItems.OAK_CHEST_RAFT, DecoItems.OAK_RAFT);

        createShaped(RecipeCategory.TRANSPORTATION, DecoItems.BIRCH_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.BIRCH_PLANKS)
                .input('-', Items.BIRCH_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, getRecipeName(DecoItems.BIRCH_RAFT)+ "_recipe_create");
        offerChestBoatRecipe(DecoItems.BIRCH_CHEST_RAFT, DecoItems.BIRCH_RAFT);

        createShaped(RecipeCategory.TRANSPORTATION, DecoItems.SPRUCE_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.SPRUCE_PLANKS)
                .input('-', Items.SPRUCE_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, getRecipeName(DecoItems.SPRUCE_RAFT)+ "_recipe_create");
        offerChestBoatRecipe(DecoItems.SPRUCE_CHEST_RAFT, DecoItems.SPRUCE_RAFT);

        createShaped(RecipeCategory.TRANSPORTATION, DecoItems.JUNGLE_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.JUNGLE_PLANKS)
                .input('-', Items.JUNGLE_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, getRecipeName(DecoItems.JUNGLE_RAFT)+ "_recipe_create");
        offerChestBoatRecipe(DecoItems.JUNGLE_CHEST_RAFT, DecoItems.JUNGLE_RAFT);

        createShaped(RecipeCategory.TRANSPORTATION, DecoItems.ACACIA_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.ACACIA_PLANKS)
                .input('-', Items.ACACIA_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, getRecipeName(DecoItems.ACACIA_RAFT)+ "_recipe_create");
        offerChestBoatRecipe(DecoItems.ACACIA_CHEST_RAFT, DecoItems.ACACIA_RAFT);

        createShaped(RecipeCategory.TRANSPORTATION, DecoItems.DARK_OAK_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.DARK_OAK_PLANKS)
                .input('-', Items.DARK_OAK_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, getRecipeName(DecoItems.DARK_OAK_RAFT)+ "_recipe_create");
        offerChestBoatRecipe(DecoItems.DARK_OAK_CHEST_RAFT, DecoItems.DARK_OAK_RAFT);

        createShaped(RecipeCategory.TRANSPORTATION, DecoItems.MANGROVE_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.MANGROVE_PLANKS)
                .input('-', Items.MANGROVE_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, getRecipeName(DecoItems.MANGROVE_RAFT)+ "_recipe_create");
        offerChestBoatRecipe(DecoItems.MANGROVE_CHEST_RAFT, DecoItems.MANGROVE_RAFT);

        createShaped(RecipeCategory.TRANSPORTATION, DecoItems.CHERRY_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.CHERRY_PLANKS)
                .input('-', Items.CHERRY_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, getRecipeName(DecoItems.CHERRY_RAFT)+ "_recipe_create");
        offerChestBoatRecipe(DecoItems.CHERRY_CHEST_RAFT, DecoItems.CHERRY_RAFT);

        createShaped(RecipeCategory.TRANSPORTATION, DecoItems.CRIMSON_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.CRIMSON_PLANKS)
                .input('-', Items.CRIMSON_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, getRecipeName(DecoItems.CRIMSON_RAFT)+ "_recipe_create");
        offerChestBoatRecipe(DecoItems.CRIMSON_CHEST_RAFT, DecoItems.CRIMSON_RAFT);

        createShaped(RecipeCategory.TRANSPORTATION, DecoItems.WARPED_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', Items.WARPED_PLANKS)
                .input('-', Items.WARPED_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, getRecipeName(DecoItems.WARPED_RAFT)+ "_recipe_create");
        offerChestBoatRecipe(DecoItems.WARPED_CHEST_RAFT, DecoItems.WARPED_RAFT);

        createShaped(RecipeCategory.TRANSPORTATION, DecoItems.CACTUS_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', DecoBlocks.CACTUS_PLANKS)
                .input('-', DecoBlocks.CACTUS_PLANK_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, getRecipeName(DecoItems.CACTUS_RAFT)+ "_recipe_create");
        offerChestBoatRecipe(DecoItems.CACTUS_CHEST_RAFT, DecoItems.CACTUS_RAFT);

        createShaped(RecipeCategory.TRANSPORTATION, DecoItems.MUSHROOM_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', DecoBlocks.MUSHROOM_PLANKS)
                .input('-', DecoBlocks.MUSHROOM_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, getRecipeName(DecoItems.MUSHROOM_RAFT)+ "_recipe_create");
        offerChestBoatRecipe(DecoItems.MUSHROOM_CHEST_RAFT, DecoItems.MUSHROOM_RAFT);

        createShaped(RecipeCategory.TRANSPORTATION, DecoItems.WOODEN_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', DecoBlocks.WOODEN_PLANKS)
                .input('-', DecoBlocks.WOODEN_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, getRecipeName(DecoItems.WOODEN_RAFT)+ "_recipe_create");
        offerChestBoatRecipe(DecoItems.WOODEN_CHEST_RAFT, DecoItems.WOODEN_RAFT);

        offerBoatRecipe(DecoItems.BAMBOO_BOAT, Blocks.BAMBOO_PLANKS);
        offerChestBoatRecipe(DecoItems.BAMBOO_CHEST_BOAT, DecoItems.BAMBOO_BOAT);

        createStairsRecipe(DecoBlocks.OAK_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.OAK_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.OAK_BOOKSHELF),conditionsFromItem(DecoBlocks.OAK_BOOKSHELF))
                .offerTo(exporter, getRecipeName(DecoBlocks.OAK_BOOKSHELF_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.OAK_BOOKSHELF_SLAB, DecoBlocks.OAK_BOOKSHELF);

        createStairsRecipe(DecoBlocks.SPRUCE_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.SPRUCE_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.SPRUCE_BOOKSHELF),conditionsFromItem(DecoBlocks.SPRUCE_BOOKSHELF))
                .offerTo(exporter, getRecipeName(DecoBlocks.SPRUCE_BOOKSHELF_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.SPRUCE_BOOKSHELF_SLAB, DecoBlocks.SPRUCE_BOOKSHELF);

        createStairsRecipe(DecoBlocks.BIRCH_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.BIRCH_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.BIRCH_BOOKSHELF),conditionsFromItem(DecoBlocks.BIRCH_BOOKSHELF))
                .offerTo(exporter, getRecipeName(DecoBlocks.BIRCH_BOOKSHELF_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BIRCH_BOOKSHELF_SLAB, DecoBlocks.BIRCH_BOOKSHELF);

        createStairsRecipe(DecoBlocks.JUNGLE_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.JUNGLE_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.JUNGLE_BOOKSHELF),conditionsFromItem(DecoBlocks.JUNGLE_BOOKSHELF))
                .offerTo(exporter, getRecipeName(DecoBlocks.JUNGLE_BOOKSHELF_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.JUNGLE_BOOKSHELF_SLAB, DecoBlocks.JUNGLE_BOOKSHELF);

        createStairsRecipe(DecoBlocks.ACACIA_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.ACACIA_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.ACACIA_BOOKSHELF),conditionsFromItem(DecoBlocks.ACACIA_BOOKSHELF))
                .offerTo(exporter, getRecipeName(DecoBlocks.ACACIA_BOOKSHELF_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.ACACIA_BOOKSHELF_SLAB, DecoBlocks.ACACIA_BOOKSHELF);

        createStairsRecipe(DecoBlocks.DARK_OAK_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.DARK_OAK_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.DARK_OAK_BOOKSHELF),conditionsFromItem(DecoBlocks.DARK_OAK_BOOKSHELF))
                .offerTo(exporter, getRecipeName(DecoBlocks.DARK_OAK_BOOKSHELF_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.DARK_OAK_BOOKSHELF_SLAB, DecoBlocks.DARK_OAK_BOOKSHELF);

        createStairsRecipe(DecoBlocks.MANGROVE_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.MANGROVE_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.MANGROVE_BOOKSHELF),conditionsFromItem(DecoBlocks.MANGROVE_BOOKSHELF))
                .offerTo(exporter, getRecipeName(DecoBlocks.MANGROVE_BOOKSHELF_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MANGROVE_BOOKSHELF_SLAB, DecoBlocks.MANGROVE_BOOKSHELF);

        createStairsRecipe(DecoBlocks.CHERRY_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.CHERRY_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.CHERRY_BOOKSHELF),conditionsFromItem(DecoBlocks.CHERRY_BOOKSHELF))
                .offerTo(exporter, getRecipeName(DecoBlocks.CHERRY_BOOKSHELF_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CHERRY_BOOKSHELF_SLAB, DecoBlocks.CHERRY_BOOKSHELF);

        createStairsRecipe(DecoBlocks.BAMBOO_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.BAMBOO_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.BAMBOO_BOOKSHELF),conditionsFromItem(DecoBlocks.BAMBOO_BOOKSHELF))
                .offerTo(exporter, getRecipeName(DecoBlocks.BAMBOO_BOOKSHELF_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.BAMBOO_BOOKSHELF_SLAB, DecoBlocks.BAMBOO_BOOKSHELF);

        createStairsRecipe(DecoBlocks.CRIMSON_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.CRIMSON_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.CRIMSON_BOOKSHELF),conditionsFromItem(DecoBlocks.CRIMSON_BOOKSHELF))
                .offerTo(exporter, getRecipeName(DecoBlocks.CRIMSON_BOOKSHELF_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CRIMSON_BOOKSHELF_SLAB, DecoBlocks.CRIMSON_BOOKSHELF);

        createStairsRecipe(DecoBlocks.WARPED_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.WARPED_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.WARPED_BOOKSHELF),conditionsFromItem(DecoBlocks.WARPED_BOOKSHELF))
                .offerTo(exporter, getRecipeName(DecoBlocks.WARPED_BOOKSHELF_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WARPED_BOOKSHELF_SLAB, DecoBlocks.WARPED_BOOKSHELF);

        createStairsRecipe(DecoBlocks.CACTUS_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.CACTUS_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.CACTUS_BOOKSHELF),conditionsFromItem(DecoBlocks.CACTUS_BOOKSHELF))
                .offerTo(exporter, getRecipeName(DecoBlocks.CACTUS_BOOKSHELF_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.CACTUS_BOOKSHELF_SLAB, DecoBlocks.CACTUS_BOOKSHELF);

        createStairsRecipe(DecoBlocks.MUSHROOM_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.MUSHROOM_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.MUSHROOM_BOOKSHELF),conditionsFromItem(DecoBlocks.MUSHROOM_BOOKSHELF))
                .offerTo(exporter, getRecipeName(DecoBlocks.MUSHROOM_BOOKSHELF_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.MUSHROOM_BOOKSHELF_SLAB, DecoBlocks.MUSHROOM_BOOKSHELF);

        createStairsRecipe(DecoBlocks.WOODEN_BOOKSHELF_STAIRS, Ingredient.ofItems(Items.BOOKSHELF))
                .criterion(hasItem(Items.BOOKSHELF),conditionsFromItem(Items.BOOKSHELF))
                .offerTo(exporter, getRecipeName(DecoBlocks.WOODEN_BOOKSHELF_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.WOODEN_BOOKSHELF_SLAB, Items.BOOKSHELF);

        createShaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_MUSHROOM_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.IRON_CAP_MUSHROOM)
                .group("giant_mushroom_blocks")
                .criterion(hasItem(DecoBlocks.IRON_CAP_MUSHROOM),
                        conditionsFromItem(DecoBlocks.IRON_CAP_MUSHROOM))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK)+ "_recipe_create");

        createStairsRecipe(DecoBlocks.IRON_CAP_STAIRS, Ingredient.ofItems(DecoBlocks.IRON_CAP_PLANKS))
                .group("wooden_stairs")
                .criterion(hasItem(DecoBlocks.IRON_CAP_PLANKS),conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_STAIRS) + "_recipe_create");

        createShaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_SLAB,6)
                .pattern("###")
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_slab")
                .criterion(hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_SLAB)+ "_recipe_create");

        createShaped(RecipeCategory.DECORATIONS,DecoBlocks.IRON_CAP_FENCE,3)
                .pattern("#/#")
                .pattern("#/#")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_fence")
                .criterion(hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_FENCE)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_FENCE_GATE)
                .pattern("/#/")
                .pattern("/#/")
                .input('/', Items.STICK)
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_fence_gate")
                .criterion(hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_FENCE_GATE)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_PRESSURE_PLATE)
                .pattern("##")
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_pressure_plate")
                .criterion(hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_PRESSURE_PLATE)+ "_recipe_create");

        createShapeless(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_BUTTON)
                .input(DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_button")
                .criterion(hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_BUTTON)+ "_recipe_create");

        createShaped(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_door")
                .criterion(hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .group("wooden_trapdoor")
                .criterion(hasItem(DecoBlocks.IRON_CAP_PLANKS),
                        conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_TRAPDOOR)+ "_recipe_create");

        createShaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_HYPHAE,4)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.IRON_CAP_STEM)
                .group("bark")
                .criterion(hasItem(DecoBlocks.IRON_CAP_STEM),
                        conditionsFromItem(DecoBlocks.IRON_CAP_STEM))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_HYPHAE)+ "_recipe_create");
        createShaped(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.STRIPPED_IRON_CAP_HYPHAE,4)
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.STRIPPED_IRON_CAP_STEM)
                .group("bark")
                .criterion(hasItem(DecoBlocks.STRIPPED_IRON_CAP_STEM),
                        conditionsFromItem(DecoBlocks.STRIPPED_IRON_CAP_STEM))
                .offerTo(exporter, getRecipeName(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE)+ "_recipe_create");

        createShapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_PLANKS,4)
                .input(DecoTags.Items.IRON_CAP_STEM)
                .criterion("has_logs", conditionsFromTag(DecoTags.Items.IRON_CAP_STEM))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_PLANKS)+ "_recipe_create");

        createShapeless(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_PLANKS,8)
                .input(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK)
                .group("planks")
                .criterion(hasItem(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK),
                        conditionsFromItem(DecoBlocks.IRON_CAP_MUSHROOM_BLOCK))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_PLANKS)+ "_form_mushroom_block");

        createStairsRecipe(DecoBlocks.IRON_CAP_HYPHAE_STAIRS, Ingredient.ofItems(DecoBlocks.IRON_CAP_HYPHAE))
                .criterion(hasItem(DecoBlocks.IRON_CAP_HYPHAE),conditionsFromItem(DecoBlocks.IRON_CAP_HYPHAE))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_HYPHAE_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_CAP_HYPHAE_SLAB, DecoBlocks.IRON_CAP_HYPHAE);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.IRON_CAP_HYPHAE_WALL, DecoBlocks.IRON_CAP_HYPHAE);

        createStairsRecipe(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_STAIRS, Ingredient.ofItems(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE))
                .criterion(hasItem(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE),conditionsFromItem(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE))
                .offerTo(exporter, getRecipeName(DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_SLAB, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE);

        offerWallRecipe(RecipeCategory.DECORATIONS, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE_WALL, DecoBlocks.STRIPPED_IRON_CAP_HYPHAE);

        offerChiseledBlockRecipe( RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_CAP_MOSAIC, DecoBlocks.IRON_CAP_SLAB);

        createStairsRecipe(DecoBlocks.IRON_CAP_MOSAIC_STAIRS, Ingredient.ofItems(DecoBlocks.IRON_CAP_MOSAIC))
                .criterion(hasItem(DecoBlocks.IRON_CAP_MOSAIC),conditionsFromItem(DecoBlocks.IRON_CAP_MOSAIC))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_MOSAIC_STAIRS) + "_recipe_create");
        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS, DecoBlocks.IRON_CAP_MOSAIC_SLAB, DecoBlocks.IRON_CAP_MOSAIC);

        CookingRecipeJsonBuilder.createSmelting(Ingredient.ofItems(DecoBlocks.SPORE_IRON_ORE), RecipeCategory.MISC, Items.IRON_INGOT,
                        0.7f, 200).criterion(hasItem(DecoBlocks.SPORE_IRON_ORE), conditionsFromItem(DecoBlocks.SPORE_IRON_ORE))
                .offerTo(exporter, getRecipeName(Items.IRON_INGOT) + "_from_spore_ore_smelting");

        CookingRecipeJsonBuilder.createBlasting(Ingredient.ofItems(DecoBlocks.SPORE_IRON_ORE), RecipeCategory.MISC, Items.IRON_INGOT,
                        0.7f, 100).criterion(hasItem(DecoBlocks.SPORE_IRON_ORE), conditionsFromItem(DecoBlocks.SPORE_IRON_ORE))
                .offerTo(exporter, getRecipeName(Items.IRON_INGOT) + "_from_spore_ore_blasting");

        createShaped(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_PALLET_DOOR,3)
                .pattern("##")
                .pattern("##")
                .pattern("##")
                .input('#', DecoBlocks.IRON_CAP_SLAB)
                .group("pallet_doors")
                .criterion(hasItem(DecoBlocks.IRON_CAP_SLAB),
                        conditionsFromItem(DecoBlocks.IRON_CAP_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_PALLET_DOOR)+ "_recipe_create");
        createShaped(RecipeCategory.REDSTONE,DecoBlocks.IRON_CAP_PALLET_TRAPDOOR,2)
                .pattern("###")
                .pattern("###")
                .input('#', DecoBlocks.IRON_CAP_SLAB)
                .group("pallet_trapdoors")
                .criterion(hasItem(DecoBlocks.IRON_CAP_SLAB),
                        conditionsFromItem(DecoBlocks.IRON_CAP_SLAB))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_PALLET_TRAPDOOR)+ "_recipe_create");

        offerCraftingTableVariantRecipe(exporter, DecoBlocks.IRON_CAP_CRAFTING_TABLE, DecoBlocks.IRON_CAP_PLANKS);
        offerBarrelVariantRecipe(exporter, DecoBlocks.IRON_CAP_BARREL, DecoBlocks.IRON_CAP_PLANKS);
        offerCartographyTableVariantRecipe(exporter, DecoBlocks.IRON_CAP_CARTOGRAPHY_TABLE, DecoBlocks.IRON_CAP_PLANKS);
        offerSmithingTableVariantRecipe(exporter, DecoBlocks.IRON_CAP_SMITHING_TABLE, DecoBlocks.IRON_CAP_PLANKS);
        offerLadderVariantRecipe(exporter, DecoBlocks.IRON_CAP_LADDER, DecoBlocks.IRON_CAP_SLAB);

        offerNoteBlockVariantRecipe(exporter, DecoBlocks.IRON_CAP_NOTE_BLOCK, DecoBlocks.IRON_CAP_PLANKS);

        offerBookshelvesVariantRecipe(exporter, DecoBlocks.IRON_CAP_BOOKSHELF, DecoBlocks.IRON_CAP_PLANKS);

        createStairsRecipe(DecoBlocks.IRON_CAP_BOOKSHELF_STAIRS, Ingredient.ofItems(DecoBlocks.IRON_CAP_BOOKSHELF))
                .criterion(hasItem(DecoBlocks.IRON_CAP_BOOKSHELF),conditionsFromItem(DecoBlocks.IRON_CAP_BOOKSHELF))
                .offerTo(exporter, getRecipeName(DecoBlocks.IRON_CAP_BOOKSHELF_STAIRS) + "_recipe_create");

        offerSlabRecipe(RecipeCategory.BUILDING_BLOCKS,DecoBlocks.IRON_CAP_BOOKSHELF_SLAB, DecoBlocks.IRON_CAP_BOOKSHELF);

        createShaped(RecipeCategory.TRANSPORTATION, DecoItems.IRON_CAP_RAFT)
                .pattern("# #")
                .pattern("---")
                .group("boat")
                .input('#', DecoBlocks.IRON_CAP_PLANKS)
                .input('-', DecoBlocks.IRON_CAP_SLAB)
                .criterion("in_water", requireEnteringFluid(Blocks.WATER))
                .offerTo(exporter, getRecipeName(DecoItems.IRON_CAP_RAFT)+ "_recipe_create");
        offerChestBoatRecipe(DecoItems.IRON_CAP_CHEST_RAFT, DecoItems.IRON_CAP_RAFT);

        offerBoatRecipe(DecoItems.IRON_CAP_BOAT, DecoBlocks.IRON_CAP_PLANKS);
        offerChestBoatRecipe(DecoItems.IRON_CAP_CHEST_BOAT, DecoItems.IRON_CAP_BOAT);

        createSignRecipe(DecoItems.IRON_CAP_SIGN, Ingredient.ofItems(DecoBlocks.IRON_CAP_PLANKS))
                .criterion(hasItem(DecoBlocks.IRON_CAP_PLANKS),conditionsFromItem(DecoBlocks.IRON_CAP_PLANKS))
                .offerTo(exporter, getRecipeName(DecoItems.IRON_CAP_SIGN)+ "_recipe_create");
        createSignRecipe(DecoItems.STRIPPED_IRON_CAP_SIGN, Ingredient.ofItems(DecoBlocks.STRIPPED_IRON_CAP_STEM))
                .criterion(hasItem(DecoBlocks.STRIPPED_IRON_CAP_STEM),conditionsFromItem(DecoBlocks.STRIPPED_IRON_CAP_STEM))
                .offerTo(exporter, getRecipeName(DecoItems.STRIPPED_IRON_CAP_SIGN)+ "_recipe_create");
        createSignRecipe(DecoItems.IRON_CAP_MOSAIC_SIGN, Ingredient.ofItems(DecoBlocks.IRON_CAP_MOSAIC))
                .criterion(hasItem(DecoBlocks.IRON_CAP_MOSAIC),conditionsFromItem(DecoBlocks.IRON_CAP_MOSAIC))
                .offerTo(exporter, getRecipeName(DecoItems.IRON_CAP_MOSAIC_SIGN)+ "_recipe_create");

        offerHangingSignRecipe( DecoItems.IRON_CAP_HANGING_SIGN, DecoBlocks.STRIPPED_IRON_CAP_STEM);

        offerHangingSignRecipe( DecoItems.IRON_CAP_PLANKS_HANGING_SIGN, DecoBlocks.IRON_CAP_PLANKS);

        offerHangingSignRecipe( DecoItems.IRON_CAP_MOSAIC_HANGING_SIGN, DecoBlocks.IRON_CAP_MOSAIC);
            }
            public void  offerLadderVariantRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible woodInput) {
                createShaped(RecipeCategory.DECORATIONS,output,3)
                        .input('#', Items.STICK)
                        .input('S', woodInput)
                        .pattern("# #")
                        .pattern("#S#")
                        .pattern("# #")
                        .group("wooden_ladder")
                        .criterion(hasItem(Items.STICK),
                                conditionsFromItem(Items.STICK))
                        .offerTo(exporter, getRecipeName(output) + "_recipe_create");
            }

            public void offerCraftingTableVariantRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible woodInput) {
                createShaped(RecipeCategory.DECORATIONS,output)
                        .input('#', woodInput)
                        .input('$', DecoTags.Items.DECO_CRAFTING_TABLES)
                        .pattern(" # ")
                        .pattern("#$#")
                        .pattern(" # ")
                        .group("wooden_crafting_tables")
                        .criterion(hasItem(woodInput),
                                conditionsFromItem(woodInput))
                        .offerTo(exporter, getRecipeName(output)+ "_recipe_create");
            }


            public void offerBarrelVariantRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible woodInput) {
                createShaped(RecipeCategory.DECORATIONS,output)
                        .input('#', woodInput)
                        .input('$', DecoTags.Items.DECO_BARRELS)
                        .pattern(" # ")
                        .pattern("#$#")
                        .pattern(" # ")
                        .group("wooden_barrels")
                        .criterion(hasItem(woodInput),
                                conditionsFromItem(woodInput))
                        .offerTo(exporter, getRecipeName(output)+ "_recipe_create");
            }

            public void offerCartographyTableVariantRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible woodInput) {
                createShaped(RecipeCategory.DECORATIONS,output)
                        .input('#', woodInput)
                        .input('$', DecoTags.Items.DECO_CARTOGRAPHY_TABLES)
                        .pattern(" # ")
                        .pattern("#$#")
                        .pattern(" # ")
                        .group("wooden_cartography_tables")
                        .criterion(hasItem(woodInput),
                                conditionsFromItem(woodInput))
                        .offerTo(exporter, getRecipeName(output)+ "_recipe_create");
            }
            public void offerSmithingTableVariantRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible woodInput) {
                createShaped(RecipeCategory.DECORATIONS,output)
                        .input('#', woodInput)
                        .input('$', DecoTags.Items.DECO_SMITHING_TABLES)
                        .pattern(" # ")
                        .pattern("#$#")
                        .pattern(" # ")
                        .group("wooden_smithing_tables")
                        .criterion(hasItem(woodInput),
                                conditionsFromItem(woodInput))
                        .offerTo(exporter, getRecipeName(output)+ "_recipe_create");
            }
            public void offerBookshelvesVariantRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible woodInput) {
                createShaped(RecipeCategory.DECORATIONS,output)
                        .input('#', woodInput)
                        .input('$', DecoTags.Items.DECO_BOOKSHELVES)
                        .pattern(" # ")
                        .pattern("#$#")
                        .pattern(" # ")
                        .group("wooden_bookshelves")
                        .criterion(hasItem(woodInput), conditionsFromItem(woodInput))
                        .offerTo(exporter, getRecipeName(output)+ "_recipe_create");
            }
            public void offerNoteBlockVariantRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible woodInput) {
                createShaped(RecipeCategory.REDSTONE,output)
                        .input('#', woodInput)
                        .input('$', DecoTags.Items.DECO_NOTE_BLOCKS)
                        .pattern(" # ")
                        .pattern("#$#")
                        .pattern(" # ")
                        .group("wooden_smithing_tables")
                        .criterion(hasItem(woodInput),
                                conditionsFromItem(woodInput))
                        .offerTo(exporter, getRecipeName(output)+ "_recipe_create");
            }
            public void offerReversibleCompactingFourRecipes(
                    RecipeExporter exporter,
                    ItemConvertible input,
                    ItemConvertible compacted,
                    String compactingRecipeName,
                    @Nullable String compactingRecipeGroup,
                    String reverseRecipeName,
                    @Nullable String reverseRecipeGroup
            ) {
                createShapeless(RecipeCategory.MISC,input, 4)
                        .input(compacted)
                        .group(reverseRecipeGroup)
                        .criterion(hasItem(compacted), conditionsFromItem(compacted))
                        .offerTo(exporter, reverseRecipeName+ "_recipe_create");
                createShaped(RecipeCategory.BUILDING_BLOCKS,compacted)
                        .input('#', input)
                        .pattern("##")
                        .pattern("##")
                        .group(compactingRecipeGroup)
                        .criterion(hasItem(input), conditionsFromItem(input))
                        .offerTo(exporter, compactingRecipeName+ "_recipe_create");
            }
            public void offerPastelBlockRecipe(RecipeExporter exporter, ItemConvertible dyeBlockInput, ItemConvertible output) {
                createShaped(RecipeCategory.BUILDING_BLOCKS,output, 8)
                        .input('X', DecoItems.PASSTOL)
                        .input('#', dyeBlockInput)
                        .pattern("###")
                        .pattern("#X#")
                        .pattern("###")
                        .group("pastel_blocks")
                        .criterion("has_passtol", conditionsFromItem(DecoItems.PASSTOL))
                        .offerTo(exporter, getRecipeName(output)+ "_recipe_create");
            }
            public void offerShadedBlockRecipe(RecipeExporter exporter, ItemConvertible dyeBlockInput, ItemConvertible output) {
                createShaped(RecipeCategory.BUILDING_BLOCKS,output, 8)
                        .input('X', DecoItems.SHADDOL)
                        .input('#', dyeBlockInput)
                        .pattern("###")
                        .pattern("#X#")
                        .pattern("###")
                        .group("shaded_blocks")
                        .criterion("has_shaddol", conditionsFromItem(DecoItems.SHADDOL))
                        .offerTo(exporter, getRecipeName(output)+ "_recipe_create");
            }
            public void offerDyeBlockFromShadedRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible dyeBlockInput) {
                createShaped(RecipeCategory.BUILDING_BLOCKS,output, 8)
                        .input('X', DecoItems.PASSTOL)
                        .input('#', dyeBlockInput)
                        .pattern("###")
                        .pattern("#X#")
                        .pattern("###")
                        .group("pastel_blocks")
                        .criterion("has_passtol", conditionsFromItem(DecoItems.PASSTOL))
                        .offerTo(exporter, convertBetween(output, dyeBlockInput));
            }
            public void offerDyeBlockFromPastelRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible dyeBlockInput) {
                createShaped(RecipeCategory.BUILDING_BLOCKS,output, 8)
                        .input('X', DecoItems.SHADDOL)
                        .input('#', dyeBlockInput)
                        .pattern("###")
                        .pattern("#X#")
                        .pattern("###")
                        .group("shaded_blocks")
                        .criterion("has_shaddol", conditionsFromItem(DecoItems.SHADDOL))
                        .offerTo(exporter, convertBetween(output, dyeBlockInput));
            }
            public void offerLampRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible paneInput) {
                createShaped(RecipeCategory.BUILDING_BLOCKS, output)
                        .input('#', paneInput)
                        .input('$', DecoBlocks.SMOOTH_GLOWSTONE)
                        .pattern(" # ")
                        .pattern("#$#")
                        .pattern(" # ")
                        .group("coloured_lamp")
                        .criterion(hasItem(DecoBlocks.SMOOTH_GLOWSTONE),
                                conditionsFromItem(DecoBlocks.SMOOTH_GLOWSTONE))
                        .offerTo(exporter, getRecipeName(output)+ "_recipe_create");
            }
        };
    }


    @Override
    public String getName() {
        return "";
    }
}