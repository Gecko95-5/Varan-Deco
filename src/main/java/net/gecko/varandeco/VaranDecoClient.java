package net.gecko.varandeco;

import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
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

        BlockRenderLayerMap.INSTANCE.putBlock(DecoBlocks.TINTED_GLASS_PANE, RenderLayer.getTranslucent());

        SpriteIdentifierRegistry.INSTANCE.addIdentifier
                (new SpriteIdentifier(TexturedRenderLayers.SIGNS_ATLAS_TEXTURE, DecoBlocks.CACTUS_SIGN_TEXTURE));
    }
}
