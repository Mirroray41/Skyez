package net.zapp.skyez.data.GeneratorsRegisters;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.zapp.skyez.data.*;
import net.zapp.skyez.data.LanguageGeneration.LanguageGeneratorEN_US;

import static net.zapp.skyez.Skyez.MOD_ID;

@Mod.EventBusSubscriber(modid = MOD_ID,bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGeneratorsRegister {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(true, new RecipeGenerator(packOutput));
        generator.addProvider(true, BlockLootTableRegister.create(packOutput));
        generator.addProvider(true, new BlockStateGenerator(packOutput, existingFileHelper));
        generator.addProvider(true, new ItemModelGenerator(packOutput, existingFileHelper));
        generator.addProvider(true, new LanguageGeneratorEN_US(packOutput));
        generator.addProvider(true, new LootModifierGenerator(packOutput));
        generator.addProvider(true, new ItemTagsGenerator(packOutput, , existingFileHelper));

    }
}
