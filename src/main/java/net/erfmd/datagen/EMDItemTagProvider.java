package net.erfmd.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.erfmd.item.EMDItems;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class EMDItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public EMDItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(EMDItems.ROSE_GOLDEN_HELMET, EMDItems.ROSE_GOLDEN_CHESTPLATE, EMDItems.ROSE_GOLDEN_LEGGINGS, EMDItems.ROSE_GOLDEN_BOOTS);
        getOrCreateTagBuilder(ItemTags.TRIM_MATERIALS)
                .add(EMDItems.ROSE_GOLD_INGOT);
        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .add(EMDItems.RUBY)
                .add(EMDItems.ROSE_GOLD_INGOT);
    }
}