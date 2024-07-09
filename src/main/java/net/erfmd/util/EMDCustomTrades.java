package net.erfmd.util;

import net.erfmd.item.EMDItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import net.minecraft.village.VillagerProfession;

public class EMDCustomTrades {
    public static void registerCustomTrades() {

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CLERIC, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 2),
                            new ItemStack(Items.PHANTOM_MEMBRANE, 1),
                            6, 5, 0.05f
                    ));
                });



        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 2),
                            new ItemStack(EMDItems.CHERRIES, 1),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 2),
                            new ItemStack(EMDItems.BANANA, 1),
                            6, 5, 0.05f
                    ));
                });



        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 10),
                            new ItemStack(EMDItems.MEAT_CLUB, 1),
                            6, 5, 0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.BUTCHER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 2),
                            new ItemStack(EMDItems.HONEYSUCKLE, 10),
                            6, 5, 0.05f
                    ));
                });



        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 2),
                            new ItemStack(Items.TUBE_CORAL, 1),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 1),
                            new ItemStack(Items.BRAIN_CORAL, 1),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 1),
                            new ItemStack(Items.BUBBLE_CORAL, 1),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 1),
                            new ItemStack(Items.FIRE_CORAL, 1),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 1),
                            new ItemStack(Items.HORN_CORAL, 1),
                            6, 5, 0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 3,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 2),
                            new ItemStack(Items.TUBE_CORAL_FAN, 1),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 2),
                            new ItemStack(Items.BRAIN_CORAL_FAN, 1),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 2),
                            new ItemStack(Items.BUBBLE_CORAL_FAN, 1),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 2),
                            new ItemStack(Items.FIRE_CORAL_FAN, 1),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 2),
                            new ItemStack(Items.HORN_CORAL_FAN, 1),
                            6, 5, 0.05f
                    ));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FISHERMAN, 4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 3),
                            new ItemStack(Items.TUBE_CORAL_BLOCK, 1),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 3),
                            new ItemStack(Items.BRAIN_CORAL_BLOCK, 1),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 3),
                            new ItemStack(Items.BUBBLE_CORAL_BLOCK, 1),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 3),
                            new ItemStack(Items.FIRE_CORAL_BLOCK, 1),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 3),
                            new ItemStack(Items.HORN_CORAL_BLOCK, 1),
                            6, 5, 0.05f
                    ));
                });



        TradeOfferHelper.registerVillagerOffers(VillagerProfession.CARTOGRAPHER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 5),
                            new ItemStack(Items.OCHRE_FROGLIGHT, 1),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 5),
                            new ItemStack(Items.VERDANT_FROGLIGHT, 1),
                            6, 5, 0.05f
                    ));
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 5),
                            new ItemStack(Items.PEARLESCENT_FROGLIGHT, 1),
                            6, 5, 0.05f
                    ));
                });



        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(EMDItems.RUBY, 10),
                            new ItemStack(Items.BUNDLE, 1),
                            6, 5, 0.05f
                    ));
                });
    }
}
