package net.gecko.varandeco;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.entity.DecoBoats;
import net.gecko.varandeco.entity.DecoEntities;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.TexturedRenderLayers;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;
import net.minecraft.client.util.SpriteIdentifier;

public class VaranDecoClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(DecoEntities.SNOW_BRICK_PROJECTILE, FlyingItemEntityRenderer::new);

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.YELLOW_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_YELLOW_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.PURPLE_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_PURPLE_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MAGENTA_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_MAGENTA_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.BLUE_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_BLUE_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.BLACK_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_BLACK_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.GREEN_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_GREEN_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.CYAN_TULIP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_CYAN_TULIP, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.BARBERTON_DAISY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_BARBERTON_DAISY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.BLUE_EYED_DAISY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_BLUE_EYED_DAISY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.GERBERA_DAISY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_GERBERA_DAISY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MICHAELMAS_DAISY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_MICHAELMAS_DAISY, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WOODEN_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_WOODEN_SAPLING, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.PUFFY_DANDELION, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_PUFFY_DANDELION, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.CALIFORNIA_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_CALIFORNIA_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.SALMON_POPPY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_SALMON_POPPY, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.YELLOW_ORCHID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_YELLOW_ORCHID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.PINK_ORCHID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_PINK_ORCHID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WHITE_ORCHID, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_WHITE_ORCHID, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.ENDER_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_ENDER_ROSE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.ENDER_ROSE_BUSH, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WITHER_ROSE_BUSH, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.RED_SUNFLOWER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.NOVA_STARFLOWER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.PAEONIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_PAEONIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.LAVENDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_LAVENDER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.CACTUS_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.CACTUS_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WOODEN_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WOODEN_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WOODEN_LEAVES, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WARPED_WART_PLANT, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.BIRCH_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.SPRUCE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.JUNGLE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.ACACIA_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.DARK_OAK_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MANGROVE_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.CRIMSON_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WARPED_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.CACTUS_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WOODEN_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.BAMBOO_LADDER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.CHERRY_LADDER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HEAVY_IRON_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.LIGHT_IRON_BARS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HEAVY_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_HEAVY_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.LIGHT_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_LIGHT_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_EXPOSED_LIGHT_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_WEATHERED_LIGHT_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_OXIDIZED_LIGHT_COPPER_BARS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.EXPOSED_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_EXPOSED_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WEATHERED_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_WEATHERED_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.OXIDIZED_COPPER_BARS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.COPPER_CHAIN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_COPPER_CHAIN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.EXPOSED_COPPER_CHAIN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_EXPOSED_COPPER_CHAIN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WEATHERED_COPPER_CHAIN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_WEATHERED_COPPER_CHAIN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.OXIDIZED_COPPER_CHAIN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_OXIDIZED_COPPER_CHAIN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.COPPER_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_COPPER_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.EXPOSED_COPPER_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_EXPOSED_COPPER_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WEATHERED_COPPER_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_WEATHERED_COPPER_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.OXIDIZED_COPPER_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_OXIDIZED_COPPER_LANTERN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.COPPER_SOUL_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_COPPER_SOUL_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.TINTED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_GLASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_GLASS_PANE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_TINTED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_TINTED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_WHITE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_LIME_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_PINK_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_GRAY_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_BLUE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_BROWN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_RED_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_BLACK_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_GREEN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_WHITE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_WHITE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_LIME_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_LIME_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_PINK_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_PINK_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_GRAY_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_GRAY_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_BLUE_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_BLUE_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_BROWN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_BROWN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_RED_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_RED_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_BLACK_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_BLACK_STAINED_GLASS_PANE, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_GREEN_STAINED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MOSAIC_GREEN_STAINED_GLASS_PANE, RenderLayer.getTranslucent());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.DEEPSLATE_STONECUTTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.BLACKSTONE_STONECUTTER, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.ANCIENT_ROSE_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.ANCIENT_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.POTTED_ANCIENT_ROSE, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MIGHTY_LAVENDER_CROP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.MIGHTY_LAVENDER, RenderLayer.getCutout());

        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.CACTUS_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.WOODEN_SIGN_TEXTURE));

        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.STRIPPED_OAK_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.STRIPPED_SPRUCE_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.STRIPPED_BIRCH_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.STRIPPED_JUNGLE_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.STRIPPED_ACACIA_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.STRIPPED_DARK_OAK_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.STRIPPED_MANGROVE_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.STRIPPED_CHERRY_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.STRIPPED_CRIMSON_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.STRIPPED_WARPED_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.STRIPPED_WOODEN_SIGN_TEXTURE));

        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.OAK_MOSAIC_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.SPRUCE_MOSAIC_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.BIRCH_MOSAIC_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.JUNGLE_MOSAIC_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.ACACIA_MOSAIC_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.DARK_OAK_MOSAIC_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.MANGROVE_MOSAIC_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.CHERRY_MOSAIC_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.BAMBOO_MOSAIC_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.CRIMSON_MOSAIC_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.WARPED_MOSAIC_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.CACTUS_MOSAIC_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.WOODEN_MOSAIC_SIGN_TEXTURE));

        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.WOODEN_HANGING_SIGN_TEXTURE));

        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.OAK_PLANKS_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.SPRUCE_PLANKS_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.BIRCH_PLANKS_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.JUNGLE_PLANKS_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.ACACIA_PLANKS_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.DARK_OAK_PLANKS_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.MANGROVE_PLANKS_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.CHERRY_PLANKS_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.CRIMSON_PLANKS_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.WARPED_PLANKS_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.CACTUS_PLANKS_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.WOODEN_PLANKS_HANGING_SIGN_TEXTURE));

        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.OAK_MOSAIC_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.SPRUCE_MOSAIC_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.BIRCH_MOSAIC_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.JUNGLE_MOSAIC_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.ACACIA_MOSAIC_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.DARK_OAK_MOSAIC_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.MANGROVE_MOSAIC_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.CHERRY_MOSAIC_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.BAMBOO_MOSAIC_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.CRIMSON_MOSAIC_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.WARPED_MOSAIC_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.CACTUS_MOSAIC_HANGING_SIGN_TEXTURE));
        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.WOODEN_MOSAIC_HANGING_SIGN_TEXTURE));

        TerraformBoatClientHelper.registerModelLayers(DecoBoats.CACTUS_BOAT_ID,false);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.WOODEN_BOAT_ID,false);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.CRIMSON_BOAT_ID,false);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.WARPED_BOAT_ID,false);
    }
}
