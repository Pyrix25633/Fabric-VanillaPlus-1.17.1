package net.pyrix25633.vanilla_plus.registries;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.pyrix25633.vanilla_plus.block.ModBlocks;

public class ModFlammableBlocks {
    public static void registerFlammables(){
        final int Encouragement = 5, Flammability = 20;
        //Oak
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_OAK_PLANKS, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_OAK_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_OAK_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_OAK_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_OAK_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.OAK_TABLE, Encouragement, Flammability);
        //Acacia
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_ACACIA_PLANKS, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_ACACIA_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_ACACIA_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_ACACIA_LOG, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.DECORATED_STRIPPED_ACACIA_WOOD, Encouragement, Flammability);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ACACIA_TABLE, Encouragement, Flammability);
    }
}
