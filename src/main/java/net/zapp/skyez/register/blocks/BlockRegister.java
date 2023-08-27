package net.zapp.skyez.register.blocks;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GravelBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zapp.skyez.Skyez;
import net.zapp.skyez.register.blocks.custom.BlockPlacer;
import net.zapp.skyez.register.blocks.custom.CottonBlock;
import net.zapp.skyez.register.blocks.custom.Sieve;
import net.zapp.skyez.register.items.ItemRegister;

import java.util.function.Supplier;

public class BlockRegister {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Skyez.MOD_ID);

    public static final RegistryObject<Block> TEMPBLOCK = registerBlock("tempblock",
            () -> new BlockPlacer(BlockBehaviour.Properties.copy(Blocks.SLIME_BLOCK)
                    .strength(0.1f)));

    public static final RegistryObject<Block> TEMPBLOCK2 = registerBlock("tempblock2",
            () -> new Sieve(BlockBehaviour.Properties.copy(Blocks.STONE)
                    .strength(0.1f).noOcclusion()));

    public static final RegistryObject<Block> COTTON = registerBlockWithoutBlockItem("cotton",
            () -> new CottonBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion()));

    public static final RegistryObject<Block> FINE_GRAVEL_BLOCK = registerBlock("fine_gravel_block",
            () -> new GravelBlock(BlockBehaviour.Properties.copy(Blocks.GRAVEL)
                    .strength(0.1f)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ItemRegister.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
