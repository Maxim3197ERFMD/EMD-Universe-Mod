package net.erfmd.datagen.lang;

import net.erfmd.block.EMDBlocks;
import net.erfmd.item.EMDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EMDLangFrenchProvider extends FabricLanguageProvider {
    public EMDLangFrenchProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "fr_fr", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(EMDItems.RAW_RUBY, "Raaka rubiini");
        translationBuilder.add(EMDItems.RUBY, "Rubiini");

        translationBuilder.add(EMDItems.PIECE_OF_CAKE, "Pala kakkua");
        translationBuilder.add(EMDItems.PIECE_OF_CHOCOLATE_CAKE, "Pala suklaakakkua");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_115, "Pala \"Kokeesta 115\"");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_803S, "Pala \"Kokeesta 803-S\"");
        translationBuilder.add(EMDItems.CARAMEL, "Karamelli");
        translationBuilder.add(EMDItems.CARAMEL_APPLE, "Karamelli omena");

        translationBuilder.add(EMDBlocks.CHOCOLATE_CAKE, "Suklaakakku");
        translationBuilder.add(EMDBlocks.EXPERIMENT_115, "Koe 115");
        translationBuilder.add(EMDBlocks.EXPERIMENT_803S, "Koe 803-S");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_APPLE, "Vaaleanpunainen kultaomena");

        translationBuilder.add(EMDItems.ROSE_GOLD_INGOT, "Vaaleanpunainen kultaharkko");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SWORD, "Vaaleanpunainen kultamiekka");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_AXE, "Vaaleanpunainen kultakirves");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_PICKAXE, "Vaaleanpunainen kultahakku");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SHOVEL, "Vaaleanpunainen kultalapio");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_HOE, "Vaaleanpunainen kultakuokka");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_HELMET, "Vaaleanpunainen kultakypärä");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_CHESTPLATE, "Vaaleanpunainen kultarintapanssari");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_LEGGINGS, "Vaaleanpunainen kultahousut");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_BOOTS, "Vaaleanpunainen kultasaappaat");

        translationBuilder.add(EMDItems.COPPER_COIL, "Медная катушка");
        translationBuilder.add(EMDItems.COPPER_CABLE, "Медный провод");
        translationBuilder.add(EMDItems.ACCUMULATOR, "Аккумулятор");
        translationBuilder.add(EMDItems.ENERGY_BALL, "Энергетическая сфера");
        translationBuilder.add(EMDItems.SPECIAL_STORAGE, "Чип-плата");
        translationBuilder.add(EMDItems.EMERALD_DUST, "Изумрудная пыль");
        translationBuilder.add(EMDItems.DIAMOND_DUST, "Алмазная пыль");
        translationBuilder.add(EMDItems.METAL_ALLOY, "Металлический сплав");
        translationBuilder.add(EMDItems.WARPED_NETHERITE_INGOT, "Искажённый незерит");
        translationBuilder.add(EMDItems.HIGH_VOLTAGE_BATTERY, "Высоковольтная батарея");

        translationBuilder.add(EMDItems.RAILGUN, "Railgun");
        translationBuilder.add(EMDItems.DISSASEMBLY_CHAINSAW, "Purkaja moottorisaha");
        translationBuilder.add(EMDItems.LM85_BLADE, "Terä LM-85");

        translationBuilder.add(EMDItems.MEAT_CLUB, "Мясная дубинка");
        translationBuilder.add(EMDItems.LOLLICHOP, "Кледенец");
        translationBuilder.add(EMDItems.CANDY_CANE, "Карамельная трость");
        translationBuilder.add(EMDItems.WORKER_DRONE_ARM, "Рука Дрона-Рабочего");

        translationBuilder.add(EMDItems.CHERRIES, "Kirsikka");
        translationBuilder.add(EMDItems.BANANA, "Banaani");
        translationBuilder.add(EMDItems.HONEYSUCKLE, "Kuusama");
        translationBuilder.add(EMDItems.CHERRY_PIE, "Kirsikkapiirakka");
        translationBuilder.add(EMDItems.HONEYSUCKLE_PIE, "Kuusamapiirakka");

        translationBuilder.add(EMDBlocks.POTATO_BLOCK, "Perunakuutio");
        translationBuilder.add(EMDBlocks.POISONOUS_POTATO_BLOCK, "Myrkyllinen perunakuutio");

        translationBuilder.add(EMDBlocks.RUBY_ORE, "Rubiinimalmi");
        translationBuilder.add(EMDBlocks.DEEPSLATE_RUBY_ORE, "Pohjaliuskerubiinimalmi");
        translationBuilder.add(EMDBlocks.NETHER_RUBY_ORE, "Nether-rubiinimalmi");
        translationBuilder.add(EMDBlocks.NETHER_IRON_ORE, "Nether-rautamalmi");
        translationBuilder.add(EMDBlocks.RAW_RUBY_BLOCK, "Raaka rubiinikuutio");
        translationBuilder.add(EMDBlocks.RUBY_BLOCK, "Rubiinikuutio");
        translationBuilder.add(EMDBlocks.ROSE_GOLD_BLOCK, "Vaaleanpunainen kultakuutio");
        translationBuilder.add(EMDBlocks.STONE_TILES, "Kivikaakelit");
        translationBuilder.add(EMDBlocks.STONE_TILE_SLAB, "Kivikaakelilaatta");
        translationBuilder.add(EMDBlocks.STONE_TILE_STAIRS, "Kivikaakeliportaat");
        translationBuilder.add(EMDBlocks.STONE_TILE_WALL, "Kivikaakelitmuuri");
        translationBuilder.add(EMDBlocks.CRACKED_STONE_TILES, "Murtuneet kivikaakelit");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILES, "Kiillotettu mustakivikaakelit");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB, "Kiillotettu mustakivikaakelilaatta");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, "Kiillotettu mustakivikaakeliportaat");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL, "Kiillotettu mustakivikaakelitmuuri");
        translationBuilder.add(EMDBlocks.CRACKED_POLISHED_BLACKSTONE_TILES, "Murtuneet kiillotettu mustakivikaakelit");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE, "End-sileä kivi");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_SLAB, "End-sileä kivilaatta");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_STAIRS, "End-sileä kiviportaat");
        translationBuilder.add(EMDBlocks.END_STONE_TILES, "End-kivikaakelit");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_SLAB, "End-kivikaakelilaatta");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_STAIRS, "End-kivikaakeliportaat");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_WALL, "End-kivikaakelitmuuri");

        translationBuilder.add(EMDBlocks.IRON_BAR_DOOR, "Сетчатая дверь");
        translationBuilder.add(EMDBlocks.IRON_BAR_TRAPDOOR, "Сетчатый люк");
        translationBuilder.add(EMDBlocks.IRON_BAR_BLOCK, "Решётчатый блок");
        translationBuilder.add(EMDBlocks.IRON_BAR_SLAB, "Решётчатая плита");

        translationBuilder.add(EMDBlocks.REDSTONE_HEART, "Redstone-sydän");

        translationBuilder.add(EMDBlocks.COLORED_REDSTONE_LAMP, "Цветной редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.BLACK_REDSTONE_LAMP, "Чёрный редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.BLUE_REDSTONE_LAMP, "Синий редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.BROWN_REDSTONE_LAMP, "Коричневый редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.CYAN_REDSTONE_LAMP, "Бирюзовый редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.GRAY_REDSTONE_LAMP, "Серый редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.GREEN_REDSTONE_LAMP, "Зелёный редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.LIGHT_BLUE_REDSTONE_LAMP, "Голубой редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.LIGHT_GRAY_REDSTONE_LAMP, "Светло-серый редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.LIME_REDSTONE_LAMP, "Лаймовый редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.MAGENTA_REDSTONE_LAMP, "Пурпурный редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.ORANGE_REDSTONE_LAMP, "Оранжевый редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.PINK_REDSTONE_LAMP, "Розовый редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.PURPLE_REDSTONE_LAMP, "Фиолетовый редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.RED_REDSTONE_LAMP, "Красный редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.WHITE_REDSTONE_LAMP, "Белый редстоуновый фонарь");
        translationBuilder.add(EMDBlocks.YELLOW_REDSTONE_LAMP, "Жёлтый редстоуновый фонарь");

        translationBuilder.add("trim_material.emd_universe.rose", "Vaaleanpunainen kultamateriaali");

        translationBuilder.add("itemgroup.test", "Тест");
    }
}
