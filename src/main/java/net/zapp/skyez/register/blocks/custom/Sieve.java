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
    public final void GenRandom(Item item, Float chance, Level level, BlockPos pos) {
        Random rand = new Random();
        for (int i = 0; i < Math.floor(chance); i++) {
            level.addFreshEntity(new ItemEntity(level, pos.getX() + 0.5F, pos.getY() + 1F, pos.getZ() + 0.5F, new ItemStack(item)));
        }
        if (rand.nextInt(100)<((chance-Math.floor(chance))*100)) {
            level.addFreshEntity(new ItemEntity(level, pos.getX() + 0.5F, pos.getY() + 1F, pos.getZ() + 0.5F, new ItemStack(item)));
        }
    }

    @Override
    public InteractionResult use(BlockState p_60503_, Level p_60504_, BlockPos p_60505_, Player p_60506_, InteractionHand p_60507_, BlockHitResult p_60508_) {
        if (!p_60504_.isClientSide()) {
            if (p_60503_.getValue(STAGE) == 0 && p_60506_.getItemInHand(InteractionHand.MAIN_HAND).is(Blocks.GRAVEL.asItem())) {
                p_60504_.setBlockAndUpdate(p_60505_, p_60503_.setValue(STAGE, 1));
                if (!p_60506_.isCreative()) {
                    p_60506_.getItemInHand(InteractionHand.MAIN_HAND).shrink(1);
                }

            } else if (p_60503_.getValue(STAGE) == 16) {
                p_60504_.setBlockAndUpdate(p_60505_, p_60503_.setValue(STAGE, 0));
                GenRandom(Items.FLINT, 0.5F, p_60504_, p_60505_);
                GenRandom(ItemRegister.FINE_GRAVEL_DUST.get(), 1.5F, p_60504_, p_60505_);
            } else if (p_60503_.getValue(STAGE) > 0) {
                p_60504_.setBlockAndUpdate(p_60505_, p_60503_.setValue(STAGE, p_60503_.getValue(STAGE) + 1));
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(STAGE);
    }
}

