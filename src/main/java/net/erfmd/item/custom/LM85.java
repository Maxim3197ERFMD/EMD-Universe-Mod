package net.erfmd.item.custom;

import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ToolComponent;
import net.minecraft.item.*;
import net.minecraft.registry.tag.BlockTags;

import java.util.List;

public class LM85 extends SwordItem {
    public LM85(ToolMaterial material, Settings settings) {
        super(material, settings.component(DataComponentTypes.TOOL, createToolComponent()));
    }

    private static ToolComponent createToolComponent() {
        return new ToolComponent(List.of(ToolComponent.Rule.of(BlockTags.PICKAXE_MINEABLE, 12.0F)), 1.0F, 2);
    }
}