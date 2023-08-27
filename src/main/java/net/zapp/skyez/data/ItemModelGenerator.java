package net.zapp.skyez.data;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.zapp.skyez.Skyez;
import net.zapp.skyez.register.items.ItemRegister;

public class ItemModelGenerator extends ItemModelProvider {
    public ItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Skyez.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        miscItem(ItemRegister.TEMPITEM);
        miscItem(ItemRegister.COTTON_SEEDS);
        miscItem(ItemRegister.COTTON_BALL);
        miscItem(ItemRegister.ACORN);
        miscItem(ItemRegister.FINE_GRAVEL_DUST);

        miscItem(ItemRegister.SMALL_COPPER_DUST);
        miscItem(ItemRegister.SMALL_IRON_DUST);
        miscItem(ItemRegister.SMALL_GOLD_DUST);
        miscItem(ItemRegister.SMALL_GLOWSTONE_DUST);
        miscItem(ItemRegister.SMALL_REDSTONE_DUST);
        miscItem(ItemRegister.SMALL_NETHERITE_SCRAP_DUST);

        miscItem(ItemRegister.COPPER_DUST);
        miscItem(ItemRegister.IRON_DUST);
        miscItem(ItemRegister.GOLD_DUST);
        miscItem(ItemRegister.NETHERITE_SCRAP_DUST);

        miscItem(ItemRegister.DIAMOND_SEED);
        miscItem(ItemRegister.EMERALD_SEED);
        miscItem(ItemRegister.LAPIS_LAZULI_SEED);
        miscItem(ItemRegister.QUARTZ_SEED);
        miscItem(ItemRegister.AMETHYST_SEED);
    }

    private ItemModelBuilder miscItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Skyez.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder toolItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Skyez.MOD_ID,"item/" + item.getId().getPath()));
    }
}
