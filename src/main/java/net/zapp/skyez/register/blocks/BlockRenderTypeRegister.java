package net.zapp.skyez.register.blocks;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.zapp.skyez.Skyez;

@Mod.EventBusSubscriber(modid = Skyez.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class BlockRenderTypeRegister{
    @SubscribeEvent
    public static void register(FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(BlockRegister.COTTON.get(), RenderType.cutout());
    }
}