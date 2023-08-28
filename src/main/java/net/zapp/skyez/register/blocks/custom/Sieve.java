package net.zapp.skyez.register.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.zapp.skyez.register.blocks.BlockRegister;
import net.zapp.skyez.register.items.ItemRegister;

import java.util.Random;

public class Sieve extends Block {
    public static final IntegerProperty STAGE = IntegerProperty.create("stage", 0, 16);

    private static final VoxelShape SHAPE =  Shapes.or(Block.box(0, 10, 0, 16, 15, 16), Block.box(0.5F, 0, 0.5F, 1.5F, 10, 1.5F), Block.box(14.5F, 0, 14.5F, 15.5F, 10, 15.5F), Block.box(0.5F, 0, 14.5F, 1.5F, 10, 15.5F), Block.box(14.5F, 0, 0.5F, 15.5F, 10, 1.5F));

    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }
    public Sieve(Properties p_49795_) {
        super(p_49795_);
        this.registerDefaultState(this.defaultBlockState().setValue(STAGE, 0));
    }
    public void genRandom(Item item, Float chance, Level level, BlockPos pos) {
        Random rand = new Random();
        for (int i = 0; i < Math.floor(chance); i++) {
            level.addFreshEntity(new ItemEntity(level, pos.getX() + 0.5F, pos.getY() + 1F, pos.getZ() + 0.5F, new ItemStack(item)));
        }
        if (rand.nextInt(100)<((chance-Math.floor(chance))*100)) {
            level.addFreshEntity(new ItemEntity(level, pos.getX() + 0.5F, pos.getY() + 1F, pos.getZ() + 0.5F, new ItemStack(item)));
        }
    }

    public void drops(BlockPos pos, Level level) {
        genRandom(Items.FLINT, 0.5F, level, pos);
        genRandom(ItemRegister.FINE_GRAVEL_DUST.get(), 1.5F, level, pos);
        genRandom(ItemRegister.SMALL_IRON_DUST.get(), 0.3F, level, pos);
        genRandom(ItemRegister.SMALL_REDSTONE_DUST.get(), 0.2F, level, pos);
    }

    public Item getItem() {
        return Blocks.GRAVEL.asItem();
    }

    public Block getBaseBlock() {
        return BlockRegister.TEMPBLOCK2.get();
    }

    public void rollBlockState(BlockState blockState, Level level, BlockPos pos, Player player) {
        int stage = blockState.getValue(STAGE);
        if (stage == 0 && player.getItemInHand(InteractionHand.MAIN_HAND).is(getItem())) {
            level.setBlockAndUpdate(pos, blockState.setValue(STAGE, 1));
            if (!player.isCreative()) {
                player.getItemInHand(InteractionHand.MAIN_HAND).shrink(1);
            }
        } else if (stage == 16) {
            level.setBlockAndUpdate(pos, blockState.setValue(STAGE, 0));
            drops(pos, level);
        } else if (stage > 0) {
            level.setBlockAndUpdate(pos, blockState.setValue(STAGE, stage + 1));
        }
    }

    @Override
    public InteractionResult use(BlockState p_60503_, Level p_60504_, BlockPos p_60505_, Player p_60506_, InteractionHand p_60507_, BlockHitResult p_60508_) {
        if (!p_60504_.isClientSide()) {
            if (p_60506_.getItemInHand(InteractionHand.OFF_HAND).is(ItemRegister.STONE_SQUEEGEE.get())) {
                if (!p_60506_.isCreative()) {
                    if (p_60506_.getItemInHand(InteractionHand.OFF_HAND).getDamageValue() < p_60506_.getItemInHand(InteractionHand.OFF_HAND).getMaxDamage()) {
                        p_60506_.getItemInHand(InteractionHand.OFF_HAND).setDamageValue(p_60506_.getItemInHand(InteractionHand.OFF_HAND).getDamageValue() + 1);
                    } else {
                        p_60506_.getItemInHand(InteractionHand.OFF_HAND).shrink(1);
                    }
                    p_60506_.getItemInHand(InteractionHand.OFF_HAND).setDamageValue(p_60506_.getItemInHand(InteractionHand.OFF_HAND).getDamageValue() + 1);
                }
                for (int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        BlockPos blockPos = new BlockPos(p_60505_.getX() + i - 1, p_60505_.getY(), p_60505_.getZ() + j - 1);
                        if (p_60504_.getBlockState(blockPos).getBlock() == getBaseBlock()) {
                            rollBlockState(p_60504_.getBlockState(blockPos), p_60504_, blockPos, p_60506_);
                        }
                        System.out.println(p_60504_.getBlockState(blockPos));
                    }
                }
            }
            else {
                rollBlockState(p_60503_, p_60504_, p_60505_, p_60506_);
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(STAGE);
    }
}

