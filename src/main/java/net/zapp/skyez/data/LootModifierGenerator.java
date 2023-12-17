package net.zapp.skyez.data;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.*;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.zapp.skyez.Skyez;
import net.zapp.skyez.modifier.loot.AddItemModifier;
import net.zapp.skyez.register.items.ItemRegister;

public class LootModifierGenerator extends GlobalLootModifierProvider {
    public LootModifierGenerator(PackOutput output) {
        super(output, Skyez.MOD_ID);
    }

    @Override
    protected void start() {
        add("cotton_from_grass", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
                LootItemRandomChanceCondition.randomChance(0.3F).build()
        }, ItemRegister.COTTON_SEEDS.get()));


        add("gravel_from_cobblestone", new AddItemModifier(new LootItemCondition[] {
                LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.COBBLESTONE).build(),


        }, Items.GRAVEL));
    }
}
