package net.pyrix25633.vanilla_plus.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.pyrix25633.vanilla_plus.VanillaPlus;
import net.pyrix25633.vanilla_plus.block.custom.*;
import net.pyrix25633.vanilla_plus.item.ModItemGroup;

public class ModBlocks {

    static final float woodHardness = 2f, woodResistance = 2f;

    // Mud Blocks
    public static final Block DECORATED_OAK_PLANKS = registerWoodBlock("decorated_oak_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .jumpVelocityMultiplier(0.9f)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_OAK_LOG = registerWoodBlock("decorated_oak_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .jumpVelocityMultiplier(0.9f)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_OAK_WOOD = registerWoodBlock("decorated_oak_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .jumpVelocityMultiplier(0.9f)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_OAK_LOG = registerWoodBlock("decorated_stripped_oak_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .jumpVelocityMultiplier(0.9f)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_OAK_WOOD = registerWoodBlock("decorated_stripped_oak_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .jumpVelocityMultiplier(0.9f)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));

    private static Block registerWoodBlock(String name, Block block) {
        registerWoodBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(VanillaPlus.MOD_ID, name), block);
    }

    private static Item registerWoodBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaPlus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.WOOD)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + VanillaPlus.MOD_ID);
    }
}
