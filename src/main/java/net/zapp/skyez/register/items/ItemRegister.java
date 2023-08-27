package net.zapp.skyez.register.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.level.block.Blocks;
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

    public static final RegistryObject<Item> ACORN = ITEMS.register("acorn",
            () -> new ItemNameBlockItem(Blocks.OAK_SAPLING,new Item.Properties()));

    public static final RegistryObject<Item> COTTON_SEEDS = ITEMS.register("cotton_seeds",
            () -> new ItemNameBlockItem(BlockRegister.COTTON.get(),new Item.Properties()));

    public static final RegistryObject<Item> COTTON_BALL = ITEMS.register("cotton_ball",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FINE_GRAVEL_DUST = ITEMS.register("fine_gravel_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SMALL_COPPER_DUST = ITEMS.register("small_copper_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_IRON_DUST = ITEMS.register("small_iron_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_GOLD_DUST = ITEMS.register("small_gold_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_GLOWSTONE_DUST = ITEMS.register("small_glowstone_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_REDSTONE_DUST = ITEMS.register("small_redstone_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SMALL_NETHERITE_SCRAP_DUST = ITEMS.register("small_netherite_scrap_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COPPER_DUST = ITEMS.register("copper_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> IRON_DUST = ITEMS.register("iron_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLD_DUST = ITEMS.register("gold_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_SCRAP_DUST = ITEMS.register("netherite_scrap_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_SEED = ITEMS.register("diamond_seed",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_SEED = ITEMS.register("emerald_seed",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LAPIS_LAZULI_SEED = ITEMS.register("lapis_lazuli_seed",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> QUARTZ_SEED = ITEMS.register("quartz_seed",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_SEED = ITEMS.register("amethyst_seed",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
