package net.pyrix25633.vanilla_plus.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.pyrix25633.vanilla_plus.VanillaPlus;

public class ModItemGroup {
    public static final ItemGroup WOOD = FabricItemGroupBuilder.build(new Identifier(VanillaPlus.MOD_ID, "wood"),
             () -> new ItemStack(ModItems.DECORATOR_TOOL));
}
