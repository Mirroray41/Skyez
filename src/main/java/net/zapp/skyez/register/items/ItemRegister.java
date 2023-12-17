package net.zapp.skyez.register.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tiers;
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
    public static final RegistryObject<Item> SILICON = ITEMS.register("silicon",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_BLEND = ITEMS.register("netherite_blend",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> DIRTY_SMALL_COPPER_DUST = ITEMS.register("dirty_small_copper_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_SMALL_GOLD_DUST = ITEMS.register("dirty_small_gold_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_SMALL_GLOWSTONE_DUST = ITEMS.register("dirty_small_glowstone_dust",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DIRTY_SMALL_NETHERITE_SCRAP_DUST = ITEMS.register("dirty_small_netherite_scrap_dust",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> WOODEN_SQUEEGEE = ITEMS.register("wooden_squeegee",
            () -> new Item(new Item.Properties().durability(40)));
    public static final RegistryObject<Item> STONE_SQUEEGEE = ITEMS.register("stone_squeegee",
            () -> new Item(new Item.Properties().durability(80)));
    public static final RegistryObject<Item> IRON_SQUEEGEE = ITEMS.register("iron_squeegee",
            () -> new Item(new Item.Properties().durability(160)));
    public static final RegistryObject<Item> GOLDEN_SQUEEGEE = ITEMS.register("golden_squeegee",
            () -> new Item(new Item.Properties().durability(120)));
    public static final RegistryObject<Item> DIAMOND_SQUEEGEE = ITEMS.register("diamond_squeegee",
            () -> new Item(new Item.Properties().durability(512)));
    public static final RegistryObject<Item> NETHERITE_SQUEEGEE = ITEMS.register("netherite_squeegee",
            () -> new Item(new Item.Properties().durability(1024)));

    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("wooden_hammer",
            () -> new PickaxeItem(Tiers.WOOD, 1, 1f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_HAMMER = ITEMS.register("stone_hammer",
            () -> new PickaxeItem(Tiers.STONE, 1, 1f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_HAMMER = ITEMS.register("iron_hammer",
            () -> new PickaxeItem(Tiers.IRON, 1, 1f, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_HAMMER = ITEMS.register("golden_hammer",
            () -> new PickaxeItem(Tiers.GOLD, 1, 1f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_HAMMER = ITEMS.register("diamond_hammer",
            () -> new PickaxeItem(Tiers.DIAMOND, 1, 1f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_HAMMER = ITEMS.register("netherite_hammer",
            () -> new PickaxeItem(Tiers.NETHERITE, 1, 1f, new Item.Properties()));

    public static final RegistryObject<Item> SIEVE_MESH = ITEMS.register("sieve_mesh",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COARSE_SIEVE_MESH = ITEMS.register("coarse_sieve_mesh",
            () -> new Item(new Item.Properties()));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
