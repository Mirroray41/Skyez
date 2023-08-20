package net.zapp.skyez.register.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.phys.BlockHitResult;
import net.zapp.skyez.register.blocks.BlockRegister;

public class BlockPlacer extends DirectionalBlock {
    public BlockPlacer(Properties p_52591_) {
        super(p_52591_);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.SOUTH));
    }

    @Override
    public InteractionResult use(BlockState blockState, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult result) {
        if (!level.isClientSide() && !player.isCrouching()) {
            if (blockState.getValue(BlockStateProperties.FACING).toString().equals("south") && level.getBlockState(pos.south()) == Blocks.AIR.defaultBlockState()) {
                level.setBlockAndUpdate(pos.south(), Blocks.STONE.defaultBlockState());
            } else if (blockState.getValue(BlockStateProperties.FACING).toString().equals("north") && level.getBlockState(pos.north()) == Blocks.AIR.defaultBlockState()) {
                level.setBlockAndUpdate(pos.north(), Blocks.STONE.defaultBlockState());
            } else if (blockState.getValue(BlockStateProperties.FACING).toString().equals("east") && level.getBlockState(pos.east()) == Blocks.AIR.defaultBlockState()) {
                level.setBlockAndUpdate(pos.east(), Blocks.STONE.defaultBlockState());
            } else if (blockState.getValue(BlockStateProperties.FACING).toString().equals("west") && level.getBlockState(pos.west()) == Blocks.AIR.defaultBlockState()) {
                level.setBlockAndUpdate(pos.west(), Blocks.STONE.defaultBlockState());
            } else if (blockState.getValue(BlockStateProperties.FACING).toString().equals("down") && level.getBlockState(pos.below()) == Blocks.AIR.defaultBlockState()) {
                level.setBlockAndUpdate(pos.below(), Blocks.STONE.defaultBlockState());
            } else if (blockState.getValue(BlockStateProperties.FACING).toString().equals("up") && level.getBlockState(pos.above()) == Blocks.AIR.defaultBlockState()) {
                level.setBlockAndUpdate(pos.above(), Blocks.STONE.defaultBlockState());
            }
            return InteractionResult.PASS;

        }else {
            return InteractionResult.FAIL;
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_55125_) {
        p_55125_.add(FACING);
    }

    public BlockState rotate(BlockState p_55115_, Rotation p_55116_) {
        return p_55115_.setValue(FACING, p_55116_.rotate(p_55115_.getValue(FACING)));
    }

    public BlockState mirror(BlockState p_55112_, Mirror p_55113_) {
        return p_55112_.rotate(p_55113_.getRotation(p_55112_.getValue(FACING)));
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
    }
}
