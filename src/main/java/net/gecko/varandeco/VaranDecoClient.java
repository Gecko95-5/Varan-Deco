package net.gecko.varandeco;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.gecko.varandeco.entity.DecoEntities;
import net.minecraft.client.render.entity.FlyingItemEntityRenderer;

public class VaranDecoClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(DecoEntities.SNOW_BRICK_PROJECTILE, FlyingItemEntityRenderer::new);
    }
}
