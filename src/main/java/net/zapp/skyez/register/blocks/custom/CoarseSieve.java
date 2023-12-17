package net.zapp.skyez.register.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.zapp.skyez.register.blocks.BlockRegister;
import net.zapp.skyez.register.items.ItemRegister;

public class CoarseSieve extends Sieve{
    public CoarseSieve(Properties p_49795_) {
        super(p_49795_);
    }

    @Override
    public void drops(BlockPos pos, Level level) {
        genRandom(ItemRegister.DIRTY_SMALL_GOLD_DUST.get(), 0.8F, level, pos);
        genRandom(ItemRegister.DIRTY_SMALL_GLOWSTONE_DUST.get(), 0.3F, level, pos);
        genRandom(ItemRegister.DIRTY_SMALL_COPPER_DUST.get(), 1.6F, level, pos);
        genRandom(ItemRegister.DIRTY_SMALL_NETHERITE_SCRAP_DUST.get(), 0.08F, level, pos);
        genRandom(ItemRegister.DIAMOND_SEED.get(), 0.08F, level, pos);
        genRandom(ItemRegister.EMERALD_SEED.get(), 0.1F, level, pos);
        genRandom(ItemRegister.LAPIS_LAZULI_SEED.get(), 0.3F, level, pos);
        genRandom(ItemRegister.QUARTZ_SEED.get(), 0.2F, level, pos);
        genRandom(ItemRegister.AMETHYST_SEED.get(), 0.3F, level, pos);
        genRandom(ItemRegister.SILICON.get(), 0.3F, level, pos);
    }

    @Override
    public Item getItem() {
        return BlockRegister.FINE_GRAVEL_BLOCK.get().asItem();
    }

    @Override
    public Block getBaseBlock() {
        return BlockRegister.COARSE_SIEVE.get();
    }
}


