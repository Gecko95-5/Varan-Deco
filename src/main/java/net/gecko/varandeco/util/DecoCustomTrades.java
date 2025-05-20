package net.gecko.varandeco.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.gecko.varandeco.block.DecoBlocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;

public class DecoCustomTrades {
    public static void registerCustomTrades() {

        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.PUFFY_DANDELION, 1),
                            12, 0, 0.075f));});

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.SALMON_POPPY, 1),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.CALIFORNIA_POPPY, 1),
                            12, 0, 0.075f));});

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.BLACK_TULIP, 1),
                            7, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.BLUE_TULIP, 1),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.CYAN_TULIP, 1),
                            7, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.YELLOW_TULIP, 1),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.PURPLE_TULIP, 1),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.MAGENTA_TULIP, 1),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.GREEN_TULIP, 1),
                            7, 0, 0.075f));});

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.BARBERTON_DAISY, 1),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.BLUE_EYED_DAISY, 1),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.GERBERA_DAISY, 1),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.MICHAELMAS_DAISY, 1),
                            12, 0, 0.075f));});

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.YELLOW_ORCHID, 1),
                            8, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.WHITE_ORCHID, 1),
                            6, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.PINK_ORCHID, 1),
                            6, 0, 0.075f));});

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.ROSE, 1),
                            12, 0, 0.075f));});

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.PAEONIA, 1),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 1),
                            new ItemStack(DecoBlocks.LAVENDER, 1),
                            9, 0, 0.075f));});

        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.RED_BLOCK, 1),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.WHITE_BLOCK, 1),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.BLUE_BLOCK, 1),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.PINK_BLOCK, 1),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.BLACK_BLOCK, 1),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.GREEN_BLOCK, 1),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.LIGHT_GRAY_BLOCK, 1),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.MAGENTA_BLOCK, 1),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.YELLOW_BLOCK, 1),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.GRAY_BLOCK, 1),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.PURPLE_BLOCK, 1),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.LIGHT_BLUE_BLOCK, 1),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.LIME_BLOCK, 1),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.ORANGE_BLOCK, 1),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.BROWN_BLOCK, 1),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.CYAN_BLOCK, 1),
                            4, 0, 0.075f));});


        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 15),
                            new ItemStack(DecoBlocks.WOODEN_SAPLING, 1),
                            8, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new TradedItem(Items.EMERALD, 12),
                            new ItemStack(DecoBlocks.BLACK_ICE, 1),
                            6, 0, 0.075f));});
    }
}
