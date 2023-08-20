package net.zapp.skyez.register.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.zapp.skyez.Skyez;
import net.zapp.skyez.register.blocks.BlockRegister;

public class ItemRegister {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Skyez.MOD_ID);

    public static final RegistryObject<Item> TEMPITEM = ITEMS.register("tempitem",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COTTON_SEEDS = ITEMS.register("cotton_seeds",
            () -> new ItemNameBlockItem(BlockRegister.COTTON.get(),new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
