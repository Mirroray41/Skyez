package net.zapp.skyez;

import com.mojang.logging.LogUtils;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.zapp.skyez.register.blocks.BlockRegister;
import net.zapp.skyez.register.items.ItemRegister;
import net.zapp.skyez.register.itemtab.ItemTabRegister;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Skyez.MOD_ID)
public class Skyez {
    public static final String MOD_ID = "skyez";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Skyez() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegister.register(modEventBus);
        BlockRegister.register(modEventBus);
        ItemTabRegister.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTab() == ItemTabRegister.SKYEZ_TAB.get()) {
            event.accept(ItemRegister.COTTON_SEEDS);
            event.accept(ItemRegister.COTTON_BALL);
            event.accept(ItemRegister.ACORN);
            event.accept(ItemRegister.FINE_GRAVEL_DUST);
            event.accept(BlockRegister.FINE_GRAVEL_BLOCK);

            event.accept(ItemRegister.SMALL_COPPER_DUST);
            event.accept(ItemRegister.SMALL_IRON_DUST);
            event.accept(ItemRegister.SMALL_GOLD_DUST);
            event.accept(ItemRegister.SMALL_GLOWSTONE_DUST);
            event.accept(ItemRegister.SMALL_REDSTONE_DUST);
            event.accept(ItemRegister.SMALL_NETHERITE_SCRAP_DUST);

            event.accept(ItemRegister.COPPER_DUST);
            event.accept(ItemRegister.IRON_DUST);
            event.accept(ItemRegister.GOLD_DUST);
            event.accept(ItemRegister.NETHERITE_SCRAP_DUST);

            event.accept(ItemRegister.DIAMOND_SEED);
            event.accept(ItemRegister.EMERALD_SEED);
            event.accept(ItemRegister.LAPIS_LAZULI_SEED);
            event.accept(ItemRegister.QUARTZ_SEED);
            event.accept(ItemRegister.AMETHYST_SEED);

            event.accept(ItemRegister.NETHERITE_BLEND);

            event.accept(ItemRegister.DIRTY_SMALL_COPPER_DUST);
            event.accept(ItemRegister.DIRTY_SMALL_GOLD_DUST);
            event.accept(ItemRegister.DIRTY_SMALL_GLOWSTONE_DUST);
            event.accept(ItemRegister.DIRTY_SMALL_NETHERITE_SCRAP_DUST);

            event.accept(ItemRegister.STONE_SQUEEGEE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {


        }
    }
}