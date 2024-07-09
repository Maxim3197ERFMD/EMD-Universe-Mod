package net.erfmd.item;

import net.minecraft.block.Block;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.TagKey;

import java.util.function.Supplier;

public enum EMDOtherToolMaterial implements ToolMaterial {
    SPECIAL_TOOL_ITEM(2031, 12.0f, 4.0f, 15, () -> Ingredient.ofItems(EMDItems.RUBY)),
    ROSE_GOLD(1440, 12.0f, 3.0f, 22, () -> Ingredient.ofItems(EMDItems.ROSE_GOLD_INGOT));

    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    EMDOtherToolMaterial( int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public TagKey<Block> getInverseTag() {
        return null;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public ToolComponent createComponent(TagKey<Block> tag) {
        return ToolMaterial.super.createComponent(tag);
    }
}
