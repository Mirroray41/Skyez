package net.zapp.skyez.data.LanguageGeneration;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import net.zapp.skyez.Skyez;
import net.zapp.skyez.register.blocks.BlockRegister;
import net.zapp.skyez.register.items.ItemRegister;

public class LanguageGeneratorEN_US extends LanguageProvider {
    public LanguageGeneratorEN_US(PackOutput output) {
        //Change the locale parameter to add different languages!
        super(output, Skyez.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add(ItemRegister.TEMPITEM.get(), "Temp Item");
        add(BlockRegister.TEMPBLOCK.get(), "Temp Block");
        add(ItemRegister.COTTON_SEEDS.get(), "Cotton Seeds");
        add(BlockRegister.COTTON.get(), "Cotton Plant");
        add("itemtab.skyez_tab","Skyez");
    }
}
