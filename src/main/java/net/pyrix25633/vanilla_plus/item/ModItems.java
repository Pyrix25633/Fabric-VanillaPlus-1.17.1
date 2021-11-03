package net.pyrix25633.vanilla_plus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pyrix25633.vanilla_plus.VanillaPlus;
import net.pyrix25633.vanilla_plus.item.custom.DecoratorToolItem;

public class ModItems {

    public static final Item DECORATOR_TOOL = registerItem("decorator_tool",
        new DecoratorToolItem(new FabricItemSettings()
                .group(ModItemGroup.DECORATED_BLOCKS).maxDamage(256)));

    private static Item registerItem(String name, Item item ) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + VanillaPlus.MOD_ID);
    }
}
