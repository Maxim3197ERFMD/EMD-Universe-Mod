package net.erfmd.datagen.lang;

import net.erfmd.block.EMDBlocks;
import net.erfmd.item.EMDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EMDLangBelarusianProvider extends FabricLanguageProvider {
    public EMDLangBelarusianProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "be_by", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(EMDItems.RAW_RUBY, "Сырой рубін");
        translationBuilder.add(EMDItems.RUBY, "Рубін");

        translationBuilder.add(EMDItems.PIECE_OF_CAKE, "Кавалачак торта");
        translationBuilder.add(EMDItems.PIECE_OF_CHOCOLATE_CAKE, "Кавалачак шакаладнага торта");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_115, "Кавалачак \"Эксперыменту 115\"");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_803S, "Кавалачак \"Эксперыменту 803-S\"");
        translationBuilder.add(EMDItems.CARAMEL, "Карамель");
        translationBuilder.add(EMDItems.CARAMEL_APPLE, "Карамельны яблык");

        translationBuilder.add(EMDBlocks.CHOCOLATE_CAKE, "Шакаладны торт");
        translationBuilder.add(EMDBlocks.EXPERIMENT_115, "Эксперымент 115");
        translationBuilder.add(EMDBlocks.EXPERIMENT_803S, "Эксперымент 803-S");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_APPLE, "Ружовы залаты яблык");

        translationBuilder.add(EMDItems.ROSE_GOLD_INGOT, "Ружовы залаты злітак");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SWORD, "Ружовы залаты меч");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_AXE, "Ружовая залатая сякера");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_PICKAXE, "Ружовая залатая кірка");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SHOVEL, "Ружовая залатая рыдлёўка");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_HOE, "Ружовая залатая матыка");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_HELMET, "Ружовы залаты шлем");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_CHESTPLATE, "Ружовы залаты кіраса");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_LEGGINGS, "Ружовыя залатыя понажы");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_BOOTS, "Ружовыя залатыя боты");

        translationBuilder.add(EMDItems.COPPER_COIL, "Мядзяна шпулька");
        translationBuilder.add(EMDItems.COPPER_CABLE, "Мядзяны дрот");
        translationBuilder.add(EMDItems.ACCUMULATOR, "Акумулятар");
        translationBuilder.add(EMDItems.ENERGY_BALL, "Энергетычная сфера");
        translationBuilder.add(EMDItems.SPECIAL_STORAGE, "Чып-плата");
        translationBuilder.add(EMDItems.EMERALD_DUST, "Смарагдавы пыл");
        translationBuilder.add(EMDItems.DIAMOND_DUST, "Дыяментавы пыл");
        translationBuilder.add(EMDItems.METAL_ALLOY, "Металічны сплаў");
        translationBuilder.add(EMDItems.WARPED_NETHERITE_INGOT, "Скажоны нэдарыт");
        translationBuilder.add(EMDItems.HIGH_VOLTAGE_BATTERY, "Высакавольтная батарэя");

        translationBuilder.add(EMDItems.RAILGUN, "Рэльсотрон");
        translationBuilder.add(EMDItems.DISSASEMBLY_CHAINSAW, "Бензапіла Дрона-Дэмантажніка");
        translationBuilder.add(EMDItems.LM85_BLADE, "Клінок LM85");

        translationBuilder.add(EMDItems.MEAT_CLUB, "Мясная дубінка");
        translationBuilder.add(EMDItems.LOLLICHOP, "Клядзянец");
        translationBuilder.add(EMDItems.CANDY_CANE, "Карамельны кій");
        translationBuilder.add(EMDItems.WORKER_DRONE_ARM, "Рука Дрона-Рабочага");

        translationBuilder.add(EMDItems.CHERRIES, "Вішня");
        translationBuilder.add(EMDItems.BANANA, "Банан");
        translationBuilder.add(EMDItems.HONEYSUCKLE, "Бружмель");
        translationBuilder.add(EMDItems.CHERRY_PIE, "Вішнёвы пірог");
        translationBuilder.add(EMDItems.HONEYSUCKLE_PIE, "Пірог з бружмелі");

        translationBuilder.add(EMDBlocks.POTATO_BLOCK, "Блок бульбы");
        translationBuilder.add(EMDBlocks.POISONOUS_POTATO_BLOCK, "Блок атрутнай бульбы");

        translationBuilder.add(EMDBlocks.RUBY_ORE, "Рубінавая руда");
        translationBuilder.add(EMDBlocks.DEEPSLATE_RUBY_ORE, "Рубінавая руда глыбінь");
        translationBuilder.add(EMDBlocks.NETHER_RUBY_ORE, "Рубінавая руда нэдара");
        translationBuilder.add(EMDBlocks.NETHER_IRON_ORE, "Жалезная руда нэдара");
        translationBuilder.add(EMDBlocks.RAW_RUBY_BLOCK, "Блок сырога рубіна");
        translationBuilder.add(EMDBlocks.RUBY_BLOCK, "Рубінавы блок");
        translationBuilder.add(EMDBlocks.ROSE_GOLD_BLOCK, "Ружовы залаты блок");
        translationBuilder.add(EMDBlocks.STONE_TILES, "Каменная кафля");
        translationBuilder.add(EMDBlocks.STONE_TILE_SLAB, "Пліта з каменнай кафлі");
        translationBuilder.add(EMDBlocks.STONE_TILE_STAIRS, "Прыступкі з каменнай кафлі");
        translationBuilder.add(EMDBlocks.STONE_TILE_WALL, "Сцяна з каменнай кафлі");
        translationBuilder.add(EMDBlocks.CRACKED_STONE_TILES, "Патрэсканая каменная кафля");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILES, "Кафля з паліраванага чарніту");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB, "Пліта з паліраванай чарнітавай кафлі");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, "Прыступкі з паліраванай чарнітавай кафлі");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL, "Сцяна з паліраванай чарнітавай кафлі");
        translationBuilder.add(EMDBlocks.CRACKED_POLISHED_BLACKSTONE_TILES, "Патрэсканая кафля з паліраванага чарніту");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE, "Гладкі камень Энда");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_SLAB, "Пліта з гладкага камню Энда");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_STAIRS, "Прыступкі з гладкага камню Энда");
        translationBuilder.add(EMDBlocks.END_STONE_TILES, "Кафля з камню Энда");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_SLAB, "Пліта из кафлі Энда");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_STAIRS, "Прыступкі из кафлі Энда");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_WALL, "Сцяна из кафлі Энда");

        translationBuilder.add(EMDBlocks.IRON_BAR_DOOR, "Сеткаватыя дзверы");
        translationBuilder.add(EMDBlocks.IRON_BAR_BLOCK, "Кратчаты блок");
        translationBuilder.add(EMDBlocks.IRON_BAR_SLAB, "Кратчатая пліта");
        translationBuilder.add(EMDBlocks.IRON_BAR_TRAPDOOR, "Кратчаты люк");

        translationBuilder.add(EMDBlocks.REDSTONE_HEART, "Рэдстоўнавае сэрца");

        translationBuilder.add(EMDBlocks.COLORED_REDSTONE_LAMP, "Рознакаляровая рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.BLACK_REDSTONE_LAMP, "Чорная рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.BLUE_REDSTONE_LAMP, "Сіняя рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.BROWN_REDSTONE_LAMP, "Карычневая рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.CYAN_REDSTONE_LAMP, "Бірузовая рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.GRAY_REDSTONE_LAMP, "Шэрая рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.GREEN_REDSTONE_LAMP, "Зялёная рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.LIGHT_BLUE_REDSTONE_LAMP, "Блакітная рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.LIGHT_GRAY_REDSTONE_LAMP, "Светла-шэрая рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.LIME_REDSTONE_LAMP, "Лаймавая рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.MAGENTA_REDSTONE_LAMP, "Пурпурная рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.ORANGE_REDSTONE_LAMP, "Аранжавая рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.PINK_REDSTONE_LAMP, "Ружовая рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.PURPLE_REDSTONE_LAMP, "Фіялетавая рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.RED_REDSTONE_LAMP, "Чырвоная рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.WHITE_REDSTONE_LAMP, "Белая рэдстоўнавая лампа");
        translationBuilder.add(EMDBlocks.YELLOW_REDSTONE_LAMP, "Жоўтая рэдстоўнавая лампа");

        translationBuilder.add("trim_material.emd_universe.rose", "Матэрыял - Ружовае золата");

        translationBuilder.add("itemgroup.test", "Тэст");
    }
}
