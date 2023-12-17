package net.zapp.skyez.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.zapp.skyez.Skyez;
import net.zapp.skyez.register.items.ItemRegister;
import net.zapp.skyez.register.tags.ItemTagRegister;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ItemTagsGenerator extends ItemTagsProvider {


    public ItemTagsGenerator(PackOutput p_275204_, CompletableFuture<HolderLookup.Provider> p_275194_, CompletableFuture<TagLookup<Item>> p_275207_, CompletableFuture<TagLookup<Block>> p_275634_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275204_, p_275194_, p_275207_, p_275634_, Skyez.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        tag(ItemTagRegister.HAMMER)
                .add(ItemRegister.WOODEN_HAMMER.get())
                .add(ItemRegister.STONE_HAMMER.get())
                .add(ItemRegister.IRON_HAMMER.get())
                .add(ItemRegister.GOLDEN_HAMMER.get())
                .add(ItemRegister.DIAMOND_HAMMER.get())
                .add(ItemRegister.NETHERITE_HAMMER.get());
    }
}