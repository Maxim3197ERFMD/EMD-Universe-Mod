package net.erfmd.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;

public class Experiment_115_Block extends CakeBlock {

    public Experiment_115_Block(Settings settings) {
        super(settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (world.isClient) {
            if (tryEat(world, pos, state, player).isAccepted()) {
                return ActionResult.SUCCESS;
            }

            if (player.getStackInHand(Hand.MAIN_HAND).isEmpty()) {
                return ActionResult.CONSUME;
            }
        }

        return tryEat(world, pos, state, player);
    }

    protected static ActionResult tryEat(WorldAccess world, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!player.canConsume(false)) {
            return ActionResult.PASS;
        }
        player.incrementStat(Stats.EAT_CAKE_SLICE);
        player.getHungerManager().add(2, 0.5f);
        if (world.getRandom().nextFloat() <= 0.25f) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1));
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400));
        } else if (world.getRandom().nextFloat() <= 0.125f) {
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 200, 2));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 6000));
                player.addStatusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 6000));
            } else if (world.getRandom().nextFloat() <= 0.0625f) {
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 3));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 3));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 6000));
                    player.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, 600));
                } else if (world.getRandom().nextFloat() <= 0.032f) {
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 3));
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.INVISIBILITY, 2400));
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400));
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2400));
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 2400, 1));
                    } else if (world.getRandom().nextFloat() <= 0.016f) {
                            player.addStatusEffect(new StatusEffectInstance(StatusEffects.SPEED, 2400, 1));
                            player.addStatusEffect(new StatusEffectInstance(StatusEffects.HASTE, 2400, 1));
                            player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 2400, 1));
                            player.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 2400, 1));
                            player.addStatusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 2400, 1));
                            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 2400, 1));
                        }
        int i = state.get(BITES);
        world.emitGameEvent(player, GameEvent.EAT, pos);
        if (i < 6) {
            world.setBlockState(pos, state.with(BITES, i + 1), Block.NOTIFY_ALL);
        } else {
            world.removeBlock(pos, false);
            world.emitGameEvent(player, GameEvent.BLOCK_DESTROY, pos);
        }
        return ActionResult.SUCCESS;
    }
}