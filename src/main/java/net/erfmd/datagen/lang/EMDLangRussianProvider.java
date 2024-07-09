package net.erfmd.datagen.lang;

import net.erfmd.block.EMDBlocks;
import net.erfmd.item.EMDItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EMDLangRussianProvider extends FabricLanguageProvider {
    public EMDLangRussianProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "ru_ru", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(EMDItems.RAW_RUBY, "Рудный рубин");
        translationBuilder.add(EMDItems.RUBY, "Рубин");

        translationBuilder.add(EMDItems.PIECE_OF_CAKE, "Кусочек торта");
        translationBuilder.add(EMDItems.PIECE_OF_CHOCOLATE_CAKE, "Кусочек шоколадного торта");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_115, "Кусочек \"Эксперимента 115\"");
        translationBuilder.add(EMDItems.PIECE_OF_EXPERIMENT_803S, "Кусочек \"Эксперимента 803-S\"");
        translationBuilder.add(EMDItems.CARAMEL, "Карамель");
        translationBuilder.add(EMDItems.CARAMEL_APPLE, "Карамельное яблоко");

        translationBuilder.add(EMDBlocks.CHOCOLATE_CAKE, "Шоколадный торт");
        translationBuilder.add(EMDBlocks.EXPERIMENT_115, "Эксперимент 115");
        translationBuilder.add(EMDBlocks.EXPERIMENT_803S, "Эксперимент 803-S");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_APPLE, "Розовое золотое яблоко");

        translationBuilder.add(EMDItems.ROSE_GOLD_INGOT, "Розовое золотой слиток");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SWORD, "Розовый золотой меч");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_AXE, "Розовый золотой топор");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_PICKAXE, "Розовая золотая кирка");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_SHOVEL, "Розовая золотая лопата");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_HOE, "Розовая золотая мотыга");

        translationBuilder.add(EMDItems.ROSE_GOLDEN_HELMET, "Розовый золотой шлем");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_CHESTPLATE, "Розовый золотой нагрудник");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_LEGGINGS, "Розовые золотые поножи");
        translationBuilder.add(EMDItems.ROSE_GOLDEN_BOOTS, "Розовые золотые ботинки");

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

        translationBuilder.add(EMDItems.RAILGUN, "Рельсотрон");
        translationBuilder.add(EMDItems.DISSASEMBLY_CHAINSAW, "Бензопила Дрона-Демонтажника");
        translationBuilder.add(EMDItems.LM85_BLADE, "Клинок LM-85");

        translationBuilder.add(EMDItems.MEAT_CLUB, "Мясная дубинка");
        translationBuilder.add(EMDItems.LOLLICHOP, "Кледенец");
        translationBuilder.add(EMDItems.CANDY_CANE, "Карамельная трость");
        translationBuilder.add(EMDItems.WORKER_DRONE_ARM, "Рука Дрона-Рабочего");

        translationBuilder.add(EMDItems.CHERRIES, "Вишня");
        translationBuilder.add(EMDItems.BANANA, "Банан");
        translationBuilder.add(EMDItems.HONEYSUCKLE, "Жимолость");
        translationBuilder.add(EMDItems.CHERRY_PIE, "Вишнёвый пирог");
        translationBuilder.add(EMDItems.HONEYSUCKLE_PIE, "Пирог из жимолости");

        translationBuilder.add(EMDBlocks.POTATO_BLOCK, "Блок картофели");
        translationBuilder.add(EMDBlocks.POISONOUS_POTATO_BLOCK, "Блок ядовитой картофели");

        translationBuilder.add(EMDBlocks.RUBY_ORE, "Рубиновая руда");
        translationBuilder.add(EMDBlocks.DEEPSLATE_RUBY_ORE, "Рубиноносный глубинный сланец");
        translationBuilder.add(EMDBlocks.NETHER_RUBY_ORE, "Незерская рубиновая руда");
        translationBuilder.add(EMDBlocks.NETHER_IRON_ORE, "Незерская железная руда");
        translationBuilder.add(EMDBlocks.RAW_RUBY_BLOCK, "Блок рудного рубина");
        translationBuilder.add(EMDBlocks.RUBY_BLOCK, "Рубиновый блок");
        translationBuilder.add(EMDBlocks.ROSE_GOLD_BLOCK, "Розовый золотой блок");
        translationBuilder.add(EMDBlocks.STONE_TILES, "Каменный плитняк");
        translationBuilder.add(EMDBlocks.STONE_TILE_SLAB, "Плита из каменного плитняка");
        translationBuilder.add(EMDBlocks.STONE_TILE_STAIRS, "Ступеньки из каменного плитняка");
        translationBuilder.add(EMDBlocks.STONE_TILE_WALL, "Ограда из каменного плитняка");
        translationBuilder.add(EMDBlocks.CRACKED_STONE_TILES, "Потрескавшийся каменный плитняк");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILES, "Полированно-чернитный плитняк");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_SLAB, "Плита из полированно-чернитного плитняка");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_STAIRS, "Ступеньки из полированно-чернитного плитняка");
        translationBuilder.add(EMDBlocks.POLISHED_BLACKSTONE_TILE_WALL, "Ограда из полированно-чернитного плитняка");
        translationBuilder.add(EMDBlocks.CRACKED_POLISHED_BLACKSTONE_TILES, "Потрескавшийся полированно-чернитный плитняк");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE, "Гладкий эндерняк");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_SLAB, "Плита из гладкого эндерняка");
        translationBuilder.add(EMDBlocks.SMOOTH_END_STONE_STAIRS, "Ступеньки из гладкого эндерняка");
        translationBuilder.add(EMDBlocks.END_STONE_TILES, "Эндерняковый плитняк");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_SLAB, "Плита из эндернякового плитняка");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_STAIRS, "Ступеньки из эндернякового плитняка");
        translationBuilder.add(EMDBlocks.END_STONE_TILE_WALL, "Ограда из эндернякового плитняка");
        translationBuilder.add(EMDBlocks.POLISHED_STONE, "Полированный камень");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_SLAB, "Плита из полированного камня");
        translationBuilder.add(EMDBlocks.POLISHED_STONE_STAIRS, "Ступеньки из полированного камня");
        translationBuilder.add(EMDBlocks.CHISELED_STONE, "Резной камень");
        translationBuilder.add(EMDBlocks.CHISELED_POLISHED_STONE, "Резной полированный камень");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICKS, "Песчаниковые кирпичи");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICK_SLAB, "Плита из песчаникового кирпича");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICK_STAIRS, "Ступеньки из песчаникового кирпича");
        translationBuilder.add(EMDBlocks.SANDSTONE_BRICK_WALL, "Ограда из песчаникового кирпича");
        translationBuilder.add(EMDBlocks.CHISELED_SANDSTONE_BRICKS, "Резные песчаниковые кирпичи");
        translationBuilder.add(EMDBlocks.POLISHED_NETHER_BRICKS, "Полированные незерские кирпичи");
        translationBuilder.add(EMDBlocks.POLISHED_NETHER_BRICK_SLAB, "Ограда из полированного незерского кирпича");
        translationBuilder.add(EMDBlocks.POLISHED_NETHER_BRICK_STAIRS, "Ступеньки из полированного незерского кирпича");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICKS, "Искажённые незерские кирпичи");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICK_SLAB, "Плита из искажённого незерского кирпича");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICK_STAIRS, "Ступеньки из искажённого незерского кирпича");
        translationBuilder.add(EMDBlocks.WARP_NETHER_BRICK_WALL, "Ограда из искажённого незерского кирпича");
        translationBuilder.add(EMDBlocks.SNOW_BRICKS, "Снежные кирпичи");
        translationBuilder.add(EMDBlocks.SNOW_BRICK_SLAB, "Плита из снежного кирпича");
        translationBuilder.add(EMDBlocks.SNOW_BRICK_STAIRS, "Ступеньки из снежного кирпича");
        translationBuilder.add(EMDBlocks.SNOW_BRICK_WALL, "Ограда из снежного кирпича");


        translationBuilder.add(EMDBlocks.IRON_BAR_DOOR, "Сетчатая дверь");
        translationBuilder.add(EMDBlocks.IRON_BAR_BLOCK, "Решётчатый блок");
        translationBuilder.add(EMDBlocks.IRON_BAR_SLAB, "Решётчатая плита");
        translationBuilder.add(EMDBlocks.IRON_BAR_TRAPDOOR, "Решётчатый люк");

        translationBuilder.add(EMDBlocks.REDSTONE_HEART, "Редстоуновое сердце");

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

        translationBuilder.add("trim_material.emd_universe.rose", "Розово-золотая");

        translationBuilder.add("itemgroup.test", "Тест");
    }
}
