package net.gecko.varandeco;

import com.terraformersmc.terraform.sign.SpriteIdentifierRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.gecko.varandeco.block.DecoBlocks;
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


        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.CACTUS_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.CACTUS_TRAPDOOR, RenderLayer.getCutout());
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

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.DEEPSLATE_STONECUTTER, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.BLACKSTONE_STONECUTTER, RenderLayer.getCutout());

        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.CACTUS_SIGN_TEXTURE));
    }
}
