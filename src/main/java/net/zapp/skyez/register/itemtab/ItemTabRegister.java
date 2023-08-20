package net.zapp.skyez.register.itemtab;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.zapp.skyez.Skyez;
import net.zapp.skyez.register.items.ItemRegister;

public class ItemTabRegister {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            Skyez.MOD_ID);

    public static RegistryObject<CreativeModeTab> SKYEZ_TAB = CREATIVE_MODE_TABS.register("skyez_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ItemRegister.COTTON_SEEDS.get()))
                    .title(Component.translatable("itemtab.skyez_tab")).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}