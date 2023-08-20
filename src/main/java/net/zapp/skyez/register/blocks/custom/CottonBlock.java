package net.zapp.skyez.register.blocks.custom;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.zapp.skyez.register.items.ItemRegister;

public class CottonBlock extends CropBlock {
    public static final IntegerProperty AGE = BlockStateProperties.AGE_5;

    public CottonBlock(Properties properties) {
        super(properties);
    }

    @Override
    public int getMaxAge() {
        return 5;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ItemRegister.COTTON_SEEDS.get();
    }
}