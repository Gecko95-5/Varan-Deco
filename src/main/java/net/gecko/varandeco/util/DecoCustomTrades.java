package net.gecko.varandeco.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.gecko.varandeco.block.DecoBlocks;
import net.gecko.varandeco.item.DecoItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class DecoCustomTrades {
    public static void registerCustomTrades() {

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.PUFFY_DANDELION),
                            12, 0, 0.075f));});

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoItems.LILAC_FLOWER, 2),
                            12, 0, 0.075f));});

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.SALMON_POPPY),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.CALIFORNIA_POPPY),
                            12, 0, 0.075f));});

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.BLACK_TULIP),
                            7, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.BLUE_TULIP),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.CYAN_TULIP),
                            7, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.YELLOW_TULIP),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.PURPLE_TULIP),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.MAGENTA_TULIP),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.GREEN_TULIP),
                            7, 0, 0.075f));});

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.BARBERTON_DAISY),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.BLUE_EYED_DAISY),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.GERBERA_DAISY),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.MICHAELMAS_DAISY),
                            12, 0, 0.075f));});

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.YELLOW_ORCHID),
                            8, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.WHITE_ORCHID),
                            6, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.PINK_ORCHID),
                            6, 0, 0.075f));});

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.ROSE),
                            12, 0, 0.075f));});

        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.PAEONIA),
                            12, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.LAVENDER),
                            9, 0, 0.075f));});

        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.RED_BLOCK),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.WHITE_BLOCK),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.BLUE_BLOCK),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.PINK_BLOCK),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.BLACK_BLOCK),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.GREEN_BLOCK),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.LIGHT_GRAY_BLOCK),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.MAGENTA_BLOCK),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.YELLOW_BLOCK),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.GRAY_BLOCK),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.PURPLE_BLOCK),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.LIGHT_BLUE_BLOCK),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.LIME_BLOCK),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.ORANGE_BLOCK),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.BROWN_BLOCK),
                            4, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(DecoBlocks.CYAN_BLOCK),
                            4, 0, 0.075f));});


        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,15),
                            new ItemStack(DecoBlocks.WOODEN_SAPLING),
                            8, 0, 0.075f));});
        TradeOfferHelper.registerWanderingTraderOffers(2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD,12),
                            new ItemStack(DecoBlocks.BLACK_ICE),
                            6, 0, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(Items.STONE_BRICKS,8),
                            16, 5, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.STONE_TILES,8),
                            16, 5, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.WHITE_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.LIGHT_GRAY_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.GRAY_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.BLACK_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.BROWN_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.RED_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.ORANGE_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.YELLOW_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.LIME_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.GREEN_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.CYAN_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.LIGHT_BLUE_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.BLUE_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.PURPLE_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.MAGENTA_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,4,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.PINK_TERRACOTTA_BRICKS),
                            12, 15, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(Items.QUARTZ_BRICKS),
                            12, 30, 0.075f));});

        TradeOfferHelper.registerVillagerOffers(VillagerProfession.MASON,5,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD),
                            new ItemStack(DecoBlocks.CUT_QUARTZ),
                            12, 30, 0.075f));});
    }
}
