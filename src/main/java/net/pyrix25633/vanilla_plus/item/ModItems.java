package net.pyrix25633.vanilla_plus.item;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pyrix25633.vanilla_plus.VanillaPlus;

public class ModItems {

    //* public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()
    //*        .group(ItemGroup.BUILDING_BLOCKS)));

    private static Item registerItem(String name, Item item ) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaPlus.MOD_ID, name), item);
    }

    public static void registerModItems() {
        System.out.println("Registering Mod Items for " + VanillaPlus.MOD_ID);
    }
}
