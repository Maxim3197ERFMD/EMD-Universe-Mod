package net.erfmd.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class EMDFoodComponents {
    public static final FoodComponent PIECE_OF_CAKE = new FoodComponent.Builder().nutrition(2).saturationModifier(0.1f).build();
    public static final FoodComponent PIECE_OF_CHOCOLATE_CAKE = new FoodComponent.Builder().nutrition(3)
            .saturationModifier(0.25f).build();
    public static final FoodComponent PIECE_OF_EXPERIMENT_115 = new FoodComponent.Builder().nutrition(2).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 300), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 3000), 0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 3000), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 3000), 0.08f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400), 0.05f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 2400), 0.03f)
            .statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 3000), 0.02f)
            .build();
    public static final FoodComponent PIECE_OF_EXPERIMENT_803S = new FoodComponent.Builder()
            .nutrition(3).saturationModifier(0.25f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 600), 0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, 600), 0.15f)
            .statusEffect(new StatusEffectInstance(StatusEffects.POISON, 1000), 0.1f)
            .statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 2400), 0.035f)
            .statusEffect(new StatusEffectInstance(StatusEffects.MINING_FATIGUE, 3000), 0.015f)
            .build();
    public static final FoodComponent ROSE_GOLDEN_APPLE = new FoodComponent.Builder().nutrition(5).saturationModifier(1.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 1800), 1.0f)
            .statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 1800), 1.0f)
            .build();

    public static final FoodComponent CARAMEL = new FoodComponent.Builder().nutrition(4).saturationModifier(0.4f).build();
    public static final FoodComponent CARAMEL_APPLE = new FoodComponent.Builder().nutrition(6).saturationModifier(1.0f).build();

    public static final FoodComponent MEAT_CLUB = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build();
    public static final FoodComponent LOLLICHOP = new FoodComponent.Builder().nutrition(5).saturationModifier(0.6f).build();
    public static final FoodComponent CANDY_CANE = new FoodComponent.Builder().nutrition(5).saturationModifier(0.8f).build();
    public static final FoodComponent WORKER_DRONE_ARM = new FoodComponent.Builder().nutrition(6).saturationModifier(0.6f).build();

    public static final FoodComponent CHERRIES = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2f).build();
    public static final FoodComponent BANANA = new FoodComponent.Builder().nutrition(3).saturationModifier(0.3f).build();

    public static final FoodComponent HONEYSUCKLE = new FoodComponent.Builder().nutrition(3).saturationModifier(0.5f).build();
    public static final FoodComponent CHERRY_PIE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.6f).build();
    public static final FoodComponent HONEYSUCKLE_PIE = new FoodComponent.Builder().nutrition(8).saturationModifier(0.8f).build();
}
