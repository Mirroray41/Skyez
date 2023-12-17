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
        add(ItemRegister.COTTON_BALL.get(), "Cotton Ball");
        add(ItemRegister.ACORN.get(), "Acorn");
        add(BlockRegister.FINE_GRAVEL_BLOCK.get(), "Fine Gravel");
        add(ItemRegister.FINE_GRAVEL_DUST.get(), "Fine Gravel Dust");



        add(BlockRegister.COARSE_SIEVE.get(), "Coarse Sieve");
        add(BlockRegister.SIEVE.get(), "Sieve");

        add(ItemRegister.SMALL_COPPER_DUST.get(), "Small Copper Dust");
        add(ItemRegister.SMALL_IRON_DUST.get(), "Small Iron Dust");
        add(ItemRegister.SMALL_GOLD_DUST.get(), "Small Gold Dust");
        add(ItemRegister.SMALL_GLOWSTONE_DUST.get(), "Small Glowstone Dust");
        add(ItemRegister.SMALL_REDSTONE_DUST.get(), "Small Redstone Dust");
        add(ItemRegister.SMALL_NETHERITE_SCRAP_DUST.get(), "Small Netherite Scrap Dust");

        add(ItemRegister.COPPER_DUST.get(), "Copper Dust");
        add(ItemRegister.IRON_DUST.get(), "Iron Dust");
        add(ItemRegister.GOLD_DUST.get(), "Gold Dust");
        add(ItemRegister.NETHERITE_SCRAP_DUST.get(), "Netherite Scrap Dust");

        add(ItemRegister.DIAMOND_SEED.get(), "Diamond Seed");
        add(ItemRegister.EMERALD_SEED.get(), "Emerald Seed");
        add(ItemRegister.LAPIS_LAZULI_SEED.get(), "Lapis Lazuli Seed");
        add(ItemRegister.QUARTZ_SEED.get(), "Quartz Seed");
        add(ItemRegister.AMETHYST_SEED.get(), "Amethyst Seed");

        add(ItemRegister.NETHERITE_BLEND.get(), "Netherite Blend");

        add(ItemRegister.DIRTY_SMALL_COPPER_DUST.get(), "Dirty Small Copper Dust");
        add(ItemRegister.DIRTY_SMALL_GOLD_DUST.get(), "Dirty Small Gold Dust");
        add(ItemRegister.DIRTY_SMALL_GLOWSTONE_DUST.get(), "Dirty Small Glowstone Dust");
        add(ItemRegister.DIRTY_SMALL_NETHERITE_SCRAP_DUST.get(), "Dirty Small Netherite Scrap Dust");

        add(ItemRegister.SILICON.get(), "Silicon");

        add(ItemRegister.WOODEN_SQUEEGEE.get(), "Wooden Squeegee");
        add(ItemRegister.STONE_SQUEEGEE.get(), "Stone Squeegee");
        add(ItemRegister.IRON_SQUEEGEE.get(), "Iron Squeegee");
        add(ItemRegister.GOLDEN_SQUEEGEE.get(), "Golden Squeegee");
        add(ItemRegister.DIAMOND_SQUEEGEE.get(), "Diamond Squeegee");
        add(ItemRegister.NETHERITE_SQUEEGEE.get(), "Netherite Squeegee");

        add(ItemRegister.WOODEN_HAMMER.get(), "Wooden Hammer");
        add(ItemRegister.STONE_HAMMER.get(), "Stone Hammer");
        add(ItemRegister.IRON_HAMMER.get(), "Iron Hammer");
        add(ItemRegister.GOLDEN_HAMMER.get(), "Golden Hammer");
        add(ItemRegister.DIAMOND_HAMMER.get(), "Diamond Hammer");
        add(ItemRegister.NETHERITE_HAMMER.get(), "Netherite Hammer");

        add(ItemRegister.SIEVE_MESH.get(), "Sieve Mesh");
        add(ItemRegister.COARSE_SIEVE_MESH.get(), "Coarse Sieve Mesh");

        add("itemtab.skyez_tab","Skyez");
    }
}
