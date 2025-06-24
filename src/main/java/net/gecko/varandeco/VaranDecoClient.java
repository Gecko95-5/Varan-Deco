package net.gecko.varandeco;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.entity.DecoBoats;
import net.gecko.varandeco.entity.DecoEntities;
import net.minecraft.client.render.BlockRenderLayer;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class VaranDecoClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(DecoEntities.SNOW_BRICK_PROJECTILE, FlyingItemEntityRenderer::new);

        BlockRenderLayerMap.putBlock(DecoBlocks.YELLOW_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_YELLOW_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.PURPLE_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_PURPLE_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MAGENTA_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_MAGENTA_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BLUE_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BLUE_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BLACK_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BLACK_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.GREEN_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_GREEN_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CYAN_TULIP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_CYAN_TULIP, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.BARBERTON_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BARBERTON_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BLUE_EYED_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_BLUE_EYED_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.GERBERA_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_GERBERA_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MICHAELMAS_DAISY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_MICHAELMAS_DAISY, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_SAPLING, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_WOODEN_SAPLING, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.PUFFY_DANDELION, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_PUFFY_DANDELION, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.CALIFORNIA_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_CALIFORNIA_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.SALMON_POPPY, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_SALMON_POPPY, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.YELLOW_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_YELLOW_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.PINK_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_PINK_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WHITE_ORCHID, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_WHITE_ORCHID, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.ENDER_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_ENDER_ROSE, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.ENDER_ROSE_BUSH, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WITHER_ROSE_BUSH, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.RED_SUNFLOWER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.NOVA_STARFLOWER, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.PAEONIA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_PAEONIA, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.LAVENDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_LAVENDER, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.CACTUS_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CACTUS_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_DOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_TRAPDOOR, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_LEAVES, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WARPED_WART_PLANT, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.BIRCH_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.SPRUCE_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.JUNGLE_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.ACACIA_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.DARK_OAK_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MANGROVE_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CRIMSON_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WARPED_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CACTUS_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WOODEN_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BAMBOO_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.CHERRY_LADDER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.PALE_OAK_LADDER, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HEAVY_IRON_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.LIGHT_IRON_BARS, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.EXPOSED_HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_EXPOSED_HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WEATHERED_HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_WEATHERED_HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.OXIDIZED_HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_OXIDIZED_HEAVY_COPPER_BARS, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.EXPOSED_LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_EXPOSED_LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WEATHERED_LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_WEATHERED_LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.OXIDIZED_LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_OXIDIZED_LIGHT_COPPER_BARS, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.EXPOSED_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_EXPOSED_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WEATHERED_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_WEATHERED_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.OXIDIZED_COPPER_BARS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_OXIDIZED_COPPER_BARS, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.COPPER_CHAIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_COPPER_CHAIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.EXPOSED_COPPER_CHAIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_EXPOSED_COPPER_CHAIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WEATHERED_COPPER_CHAIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_WEATHERED_COPPER_CHAIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.OXIDIZED_COPPER_CHAIN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_OXIDIZED_COPPER_CHAIN, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.COPPER_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_COPPER_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.EXPOSED_COPPER_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_EXPOSED_COPPER_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WEATHERED_COPPER_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_WEATHERED_COPPER_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.OXIDIZED_COPPER_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_OXIDIZED_COPPER_LANTERN, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.EXPOSED_COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WEATHERED_COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.OXIDIZED_COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.TINTED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GLASS, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GLASS_PANE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_TINTED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_TINTED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_WHITE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_WHITE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_ORANGE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_MAGENTA_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIGHT_BLUE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_YELLOW_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIME_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIME_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_PINK_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_PINK_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GRAY_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GRAY_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_LIGHT_GRAY_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_CYAN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_PURPLE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BLUE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BLUE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BROWN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BROWN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_RED_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_RED_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BLACK_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_BLACK_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GREEN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.HARDENED_GREEN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_WHITE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_WHITE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_ORANGE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_MAGENTA_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIGHT_BLUE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_YELLOW_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIME_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIME_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_PINK_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_PINK_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_GRAY_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_GRAY_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_LIGHT_GRAY_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_CYAN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_PURPLE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BLUE_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BLUE_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BROWN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BROWN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_RED_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_RED_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BLACK_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_BLACK_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_GREEN_STAINED_GLASS, BlockRenderLayer.TRANSLUCENT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MOSAIC_GREEN_STAINED_GLASS_PANE, BlockRenderLayer.TRANSLUCENT);

        BlockRenderLayerMap.putBlock(DecoBlocks.DEEPSLATE_STONECUTTER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.BLACKSTONE_STONECUTTER, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.TUFF_STONECUTTER, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.IRON_GRATE, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.ANCIENT_ROSE_CROP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.ANCIENT_ROSE, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.POTTED_ANCIENT_ROSE, BlockRenderLayer.CUTOUT);

        BlockRenderLayerMap.putBlock(DecoBlocks.MIGHTY_LAVENDER_CROP, BlockRenderLayer.CUTOUT);
        BlockRenderLayerMap.putBlock(DecoBlocks.MIGHTY_LAVENDER, BlockRenderLayer.CUTOUT);

        TerraformBoatClientHelper.registerModelLayers(DecoBoats.CACTUS_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.WOODEN_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.CRIMSON_BOAT_ID);
        TerraformBoatClientHelper.registerModelLayers(DecoBoats.WARPED_BOAT_ID);
    }
}
