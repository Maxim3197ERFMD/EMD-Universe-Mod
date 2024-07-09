package net.erfmd;

import net.erfmd.block.EMDBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class EMDUniverseClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(EMDBlocks.IRON_BAR_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EMDBlocks.IRON_BAR_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EMDBlocks.IRON_BAR_SLAB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(EMDBlocks.IRON_BAR_BLOCK, RenderLayer.getCutout());
    }
}
