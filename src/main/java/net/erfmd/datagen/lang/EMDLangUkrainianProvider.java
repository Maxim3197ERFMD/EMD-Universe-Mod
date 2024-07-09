package net.erfmd.datagen.lang;

import net.erfmd.block.EMDBlocks;
import net.erfmd.item.EMDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EMDLangUkrainianProvider extends FabricLanguageProvider {
    public EMDLangUkrainianProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "uk_ua", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(EMDItems.RAW_RUBY, "Необроблений рубін");
        translationBuilder.add(EMDItems.RUBY, "Рубін");

        translationBuilder.add(EMDItems.PIECE_OF_CAKE, "Шматочок торта");
        translationBuilder.add(EMDItems.PIECE_OF_CHOCOLATE_CAKE, "Шматочок шоколадного торта");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_115, "Шматочок \"Експерименту 115\"");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_803S, "Шматочок \"Експерименту 803-S\"");
        translationBuilder.add(EMDItems.CARAMEL, "Карамель");
        translationBuilder.add(EMDItems.CARAMEL_APPLE, "Карамельне яблуко");

        translationBuilder.add(EMDBlocks.CHOCOLATE_CAKE, "Шоколадний торт");
        translationBuilder.add(EMDBlocks.EXPERIMENT_115, "Експеримент 115");
        translationBuilder.add(EMDBlocks.EXPERIMENT_803S, "Експеримент 803-S");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_APPLE, "Рожеве золоте яблуко");

        translationBuilder.add(EMDItems.ROSE_GOLD_INGOT, "Рожевий золотий злиток");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SWORD, "Рожевий золотий меч");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_AXE, "Рожева золота сокира");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_PICKAXE, "Рожеве золоте кайло");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SHOVEL, "Рожева золота лопата");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_HOE, "Рожева золота мотика");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_HELMET, "Рожевий золотий шолом");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_CHESTPLATE, "Рожевий золотий нагрудник");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_LEGGINGS, "Рожеві золоті наголінники");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_BOOTS, "Рожеві золоті чоботи");

        translationBuilder.add(EMDItems.COPPER_COIL, "Мідна котушка");
        translationBuilder.add(EMDItems.COPPER_CABLE, "Мідний дріт");
        translationBuilder.add(EMDItems.ACCUMULATOR, "Акумулятор");
        translationBuilder.add(EMDItems.ENERGY_BALL, "Енергетична сфера");
        translationBuilder.add(EMDItems.SPECIAL_STORAGE, "Чіп-плата");
        translationBuilder.add(EMDItems.EMERALD_DUST, "Смарагдовий пил");
        translationBuilder.add(EMDItems.DIAMOND_DUST, "Діамантовий пил");
        translationBuilder.add(EMDItems.METAL_ALLOY, "Металевий сплав");
        translationBuilder.add(EMDItems.WARPED_NETHERITE_INGOT, "Химерний незерит");
        translationBuilder.add(EMDItems.HIGH_VOLTAGE_BATTERY, "Високовольтна батарея");

        translationBuilder.add(EMDItems.RAILGUN, "Рельсотрон");
        translationBuilder.add(EMDItems.DISSASEMBLY_CHAINSAW, "Бензопила Дрона-Демонтувальника");
        translationBuilder.add(EMDItems.LM85_BLADE, "Клинок LM-85");

        translationBuilder.add(EMDItems.MEAT_CLUB, "М'ясний кийок");
        translationBuilder.add(EMDItems.LOLLICHOP, "Кледенець");
        translationBuilder.add(EMDItems.CANDY_CANE, "Карамельна тростина");
        translationBuilder.add(EMDItems.WORKER_DRONE_ARM, "Рука Дрона-Робітника");

        translationBuilder.add(EMDItems.CHERRIES, "Вишня");
        translationBuilder.add(EMDItems.BANANA, "Банан");
        translationBuilder.add(EMDItems.HONEYSUCKLE, "Жимолість");
        translationBuilder.add(EMDItems.CHERRY_PIE, "Вишневий пиріг");
        translationBuilder.add(EMDItems.HONEYSUCKLE_PIE, "Пиріг із жимолості");

        translationBuilder.add(EMDBlocks.POTATO_BLOCK, "Блок картоплі");
        translationBuilder.add(EMDBlocks.POISONOUS_POTATO_BLOCK, "Блок отруйної картоплі");

        translationBuilder.add(EMDBlocks.RUBY_ORE, "Рубінова руда");
        translationBuilder.add(EMDBlocks.DEEPSLATE_RUBY_ORE, "Глибосланцева рубінова руда");
        translationBuilder.add(EMDBlocks.NETHER_RUBY_ORE, "Незерська рубінова руда");
        translationBuilder.add(EMDBlocks.NETHER_IRON_ORE, "Незерська залізна руда");
        translationBuilder.add(EMDBlocks.RAW_RUBY_BLOCK, "Блок необробленого рубіна");
        translationBuilder.add(EMDBlocks.RUBY_BLOCK, "Блок рубіна");
        translationBuilder.add(EMDBlocks.ROSE_GOLD_BLOCK, "Блок рожевого золота");
        translationBuilder.add(EMDBlocks.STONE_TILES, "Кам'яні кахлі");
        translationBuilder.add(EMDBlocks.STONE_TILE_SLAB, "Плита з кам'яних кахлів");
        translationBuilder.add(EMDBlocks.STONE_TILE_STAIRS, "Сходи з кам'яних кахлів");
        translationBuilder.add(EMDBlocks.STONE_TILE_WALL, "Стіна з кам'яних кахлів");
        translationBuilder.add(EMDBlocks.CRACKED_STONE_TILES, "Тріснуті кам'яні кахлі");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILES, "Поліровані чорнокам'яні кахлі");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB, "Плита з полірованих чорнокам'яних кахлів");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, "Сходи з полірованих чорнокам'яних кахлів");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL, "Стіна з полірованих чорнокам'яних кахлів");
        translationBuilder.add(EMDBlocks.CRACKED_POLISHED_BLACKSTONE_TILES, "Тріснуті поліровані чорнокам'яні кахлі");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE, "Гладкий камінь Енду");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_SLAB, "Плита з гладкого каменю Енду");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_STAIRS, "Сходи з гладкого каменю Енду");
        translationBuilder.add(EMDBlocks.END_STONE_TILES, "Кахлі з каменю Енду");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_SLAB, "Плита з кахлів Енду");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_STAIRS, "Сходи з кахлів Енду");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_WALL, "Стіна з кахлів Енду");

        translationBuilder.add(EMDBlocks.IRON_BAR_DOOR, "Сітчасті двері");
        translationBuilder.add(EMDBlocks.IRON_BAR_BLOCK, "Ґратчастий блок");
        translationBuilder.add(EMDBlocks.IRON_BAR_SLAB, "Ґратчаста плита");
        translationBuilder.add(EMDBlocks.IRON_BAR_TRAPDOOR, "Ґратчастий люк");

        translationBuilder.add(EMDBlocks.REDSTONE_HEART, "Редстоунове серце");

        translationBuilder.add(EMDBlocks.COLORED_REDSTONE_LAMP, "Різнокольоровий редстоунова лампа");
        translationBuilder.add(EMDBlocks.BLACK_REDSTONE_LAMP, "Чорна редстоунова лампа");
        translationBuilder.add(EMDBlocks.BLUE_REDSTONE_LAMP, "Синя редстоунова лампа");
        translationBuilder.add(EMDBlocks.BROWN_REDSTONE_LAMP, "Коричнева редстоунова лампа");
        translationBuilder.add(EMDBlocks.CYAN_REDSTONE_LAMP, "Бірюзова редстоунова лампа");
        translationBuilder.add(EMDBlocks.GRAY_REDSTONE_LAMP, "Сіра редстоунова лампа");
        translationBuilder.add(EMDBlocks.GREEN_REDSTONE_LAMP, "Зелена редстоунова лампа");
        translationBuilder.add(EMDBlocks.LIGHT_BLUE_REDSTONE_LAMP, "Блакитна редстоунова лампа");
        translationBuilder.add(EMDBlocks.LIGHT_GRAY_REDSTONE_LAMP, "Світло-сіра редстоунова лампа");
        translationBuilder.add(EMDBlocks.LIME_REDSTONE_LAMP, "Лаймова редстоунова лампа");
        translationBuilder.add(EMDBlocks.MAGENTA_REDSTONE_LAMP, "Пурпурова редстоунова лампа");
        translationBuilder.add(EMDBlocks.ORANGE_REDSTONE_LAMP, "Помаранчева редстоунова лампа");
        translationBuilder.add(EMDBlocks.PINK_REDSTONE_LAMP, "Рожева редстоунова лампа");
        translationBuilder.add(EMDBlocks.PURPLE_REDSTONE_LAMP, "Фіолетова редстоунова лампа");
        translationBuilder.add(EMDBlocks.RED_REDSTONE_LAMP, "Червона редстоунова лампа");
        translationBuilder.add(EMDBlocks.WHITE_REDSTONE_LAMP, "Біла редстоунова лампа");
        translationBuilder.add(EMDBlocks.YELLOW_REDSTONE_LAMP, "Жовта редстоунова лампа");

        translationBuilder.add("trim_material.emd_universe.rose", "Рожевий золотий матеріал");

        translationBuilder.add("itemgroup.test", "Тест");
    }
}
