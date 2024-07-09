package net.erfmd.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.erfmd.item.EMDItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class EMDLootTableModifiers {
    private static final Identifier ZOMBIE_ID =
            Identifier.of("minecraft", "entities/zombie");
    private static final Identifier PIG_ID =
            Identifier.of("minecraft", "entities/pig");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source) -> {
            if(ZOMBIE_ID == key.getRegistry() && source. isBuiltin()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f))
                        .with(ItemEntry.builder(EMDItems.WORKER_DRONE_ARM))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder);
            }

            if(PIG_ID == key.getRegistry() && source. isBuiltin()) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f))
                        .with(ItemEntry.builder(EMDItems.MEAT_CLUB))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}
