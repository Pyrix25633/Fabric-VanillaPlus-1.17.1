package net.pyrix25633.vanilla_plus.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.pyrix25633.vanilla_plus.block.ModBlocks;
import net.pyrix25633.vanilla_plus.block.custom.ModLogBlock;

import java.util.Objects;

public class DecoratorToolItem extends Item {
    public DecoratorToolItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        boolean finished = false;
        BlockPos positionClicked = context.getBlockPos();
        Block clickedBlock = context.getWorld().getBlockState(positionClicked).getBlock();
        PlayerEntity player = Objects.requireNonNull(context.getPlayer());
        World world = context.getWorld();
        BlockState state = context.getWorld().getBlockState(positionClicked);

        if(clickedBlock == Blocks.OAK_PLANKS) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_OAK_PLANKS.getDefaultState());
            context.getStack().damage(1, context.getPlayer(), (p) -> p.sendToolBreakStatus(p.getActiveHand()));
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }
        else if(clickedBlock == Blocks.OAK_LOG) {
            world.setBlockState(positionClicked, ModBlocks.DECORATED_OAK_LOG.getDefaultState().with(ModLogBlock.AXIS, state.get(ModLogBlock.AXIS)));
            context.getStack().damage(1, context.getPlayer(), (p) -> p.sendToolBreakStatus(p.getActiveHand()));
            world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.ITEM_AXE_STRIP, SoundCategory.NEUTRAL, 1.0f, 1.0f);
            finished = true;
        }



        if(finished){
        return ActionResult.success(true);
        }

        return super.useOnBlock(context);
    }
}
