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

    // Oak
    public static final Block DECORATED_OAK_PLANKS = registerWoodBlock("decorated_oak_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_OAK_LOG = registerWoodBlock("decorated_oak_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_OAK_WOOD = registerWoodBlock("decorated_oak_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_OAK_LOG = registerWoodBlock("decorated_stripped_oak_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_OAK_WOOD = registerWoodBlock("decorated_stripped_oak_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block OAK_TABLE = registerWoodBlock("oak_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    //Acacia
    public static final Block DECORATED_ACACIA_PLANKS = registerWoodBlock("decorated_acacia_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_ACACIA_LOG = registerWoodBlock("decorated_acacia_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_ACACIA_WOOD = registerWoodBlock("decorated_acacia_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_ACACIA_LOG = registerWoodBlock("decorated_stripped_acacia_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_ACACIA_WOOD = registerWoodBlock("decorated_stripped_acacia_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block ACACIA_TABLE = registerWoodBlock("acacia_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    //Birch
    public static final Block DECORATED_BIRCH_PLANKS = registerWoodBlock("decorated_birch_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_BIRCH_LOG = registerWoodBlock("decorated_birch_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_BIRCH_WOOD = registerWoodBlock("decorated_birch_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_BIRCH_LOG = registerWoodBlock("decorated_stripped_birch_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_BIRCH_WOOD = registerWoodBlock("decorated_stripped_birch_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block BIRCH_TABLE = registerWoodBlock("birch_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    //Spruce
    public static final Block DECORATED_SPRUCE_PLANKS = registerWoodBlock("decorated_spruce_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_SPRUCE_LOG = registerWoodBlock("decorated_spruce_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_SPRUCE_WOOD = registerWoodBlock("decorated_spruce_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_SPRUCE_LOG = registerWoodBlock("decorated_stripped_spruce_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_SPRUCE_WOOD = registerWoodBlock("decorated_stripped_spruce_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block SPRUCE_TABLE = registerWoodBlock("spruce_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    //Jungle
    public static final Block DECORATED_JUNGLE_PLANKS = registerWoodBlock("decorated_jungle_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_JUNGLE_LOG = registerWoodBlock("decorated_jungle_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_JUNGLE_WOOD = registerWoodBlock("decorated_jungle_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_JUNGLE_LOG = registerWoodBlock("decorated_stripped_jungle_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_JUNGLE_WOOD = registerWoodBlock("decorated_stripped_jungle_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block JUNGLE_TABLE = registerWoodBlock("jungle_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));

    //Dark Oak
    public static final Block DECORATED_DARK_OAK_PLANKS = registerWoodBlock("decorated_dark_oak_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_DARK_OAK_LOG = registerWoodBlock("decorated_dark_oak_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_DARK_OAK_WOOD = registerWoodBlock("decorated_dark_oak_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_DARK_OAK_LOG = registerWoodBlock("decorated_stripped_dark_oak_log",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_DARK_OAK_WOOD = registerWoodBlock("decorated_stripped_dark_oak_wood",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DARK_OAK_TABLE = registerWoodBlock("dark_oak_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    //Crimson
    public static final Block DECORATED_CRIMSON_PLANKS = registerWoodBlock("decorated_crimson_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_CRIMSON_STEM = registerWoodBlock("decorated_crimson_stem",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_CRIMSON_HYPHAE = registerWoodBlock("decorated_crimson_hyphae",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_CRIMSON_STEM = registerWoodBlock("decorated_stripped_crimson_stem",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_CRIMSON_HYPHAE = registerWoodBlock("decorated_stripped_crimson_hyphae",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block CRIMSON_TABLE = registerWoodBlock("crimson_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));
    //Warped
    public static final Block DECORATED_WARPED_PLANKS = registerWoodBlock("decorated_warped_planks",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_WARPED_STEM = registerWoodBlock("decorated_warped_stem",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_WARPED_HYPHAE = registerWoodBlock("decorated_warped_hyphae",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_WARPED_STEM = registerWoodBlock("decorated_stripped_warped_stem",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block DECORATED_STRIPPED_WARPED_HYPHAE = registerWoodBlock("decorated_stripped_warped_hyphae",
            new ModLogBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block WARPED_TABLE = registerWoodBlock("warped_table",
            new ModTableBlock(FabricBlockSettings.of(Material.WOOD)
                    .strength(woodHardness, woodResistance)
                    .breakByTool(FabricToolTags.AXES)
                    .sounds(BlockSoundGroup.WOOD).nonOpaque()));

    private static Block registerWoodBlock(String name, Block block) {
        registerWoodBlockItem(name, block);
        return Registry.register(Registry.BLOCK, new Identifier(VanillaPlus.MOD_ID, name), block);
    }

    private static Item registerWoodBlockItem(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaPlus.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(ModItemGroup.DECORATED_BLOCKS)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering ModBlocks for " + VanillaPlus.MOD_ID);
    }
}
