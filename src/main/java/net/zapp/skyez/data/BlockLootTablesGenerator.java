package net.zapp.skyez.data;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.registries.RegistryObject;
import net.zapp.skyez.register.blocks.BlockRegister;
import net.zapp.skyez.register.items.ItemRegister;

import java.util.Set;

public class BlockLootTablesGenerator extends BlockLootSubProvider {
    public BlockLootTablesGenerator() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(BlockRegister.TEMPBLOCK.get());
        dropSelf(BlockRegister.COTTON.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockRegister.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }

    protected LootTable.Builder createGrassDrops(Block block, Item drop, float chance, int bonus) {
        return createShearsDispatchTable(block, this.applyExplosionDecay(block, LootItem.lootTableItem(drop).when(LootItemRandomChanceCondition.randomChance(chance)).apply(ApplyBonusCount.addUniformBonusCount(Enchantments.BLOCK_FORTUNE, bonus))));
    }
}
