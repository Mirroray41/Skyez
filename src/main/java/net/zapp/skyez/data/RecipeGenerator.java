package net.zapp.skyez.data;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.zapp.skyez.Skyez;
import net.zapp.skyez.register.blocks.BlockRegister;
import net.zapp.skyez.register.items.ItemRegister;

import javax.annotation.Nullable;
import java.util.function.Consumer;

public class RecipeGenerator extends RecipeProvider implements IConditionBuilder {
    public RecipeGenerator(PackOutput output) {
        super(output);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {

        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ItemRegister.TEMPITEM.get(), RecipeCategory.MISC,
                BlockRegister.TEMPBLOCK.get());

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.STRING, 4)
                 .requires(ItemRegister.COTTON_BALL.get(), 3)
                 .unlockedBy("has_cotton", inventoryTrigger(ItemPredicate.Builder.item()
                         .of(ItemRegister.COTTON_BALL.get()).build()))
                 .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegister.FINE_GRAVEL_DUST.get(), 4)
                .requires(BlockRegister.FINE_GRAVEL_BLOCK.get())
                .unlockedBy("has_fine_gravel", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockRegister.FINE_GRAVEL_BLOCK.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, BlockRegister.FINE_GRAVEL_BLOCK.get())
                .requires(ItemRegister.FINE_GRAVEL_DUST.get(), 4)
                .unlockedBy("has_fine_gravel", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(BlockRegister.FINE_GRAVEL_BLOCK.get()).build()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegister.SMALL_COPPER_DUST.get(), 9).requires(ItemRegister.COPPER_DUST.get())
                .unlockedBy("has_copper_dust", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegister.COPPER_DUST.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegister.SMALL_IRON_DUST.get(), 9).requires(ItemRegister.IRON_DUST.get())
                .unlockedBy("has_iron_dust", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegister.IRON_DUST.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegister.SMALL_GOLD_DUST.get(), 9).requires(ItemRegister.GOLD_DUST.get())
                .unlockedBy("has_gold_dust", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegister.GOLD_DUST.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegister.SMALL_GLOWSTONE_DUST.get(), 9).requires(Items.GLOWSTONE_DUST)
                .unlockedBy("has_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(Items.GLOWSTONE_DUST).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegister.SMALL_REDSTONE_DUST.get(), 9).requires(Items.REDSTONE)
                .unlockedBy("has_redstone", inventoryTrigger(ItemPredicate.Builder.item().of(Items.REDSTONE).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegister.SMALL_NETHERITE_SCRAP_DUST.get(), 9).requires(ItemRegister.NETHERITE_SCRAP_DUST.get())
                .unlockedBy("has_netherite_scrap_dust", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegister.NETHERITE_SCRAP_DUST.get()).build()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegister.COPPER_DUST.get()).requires(ItemRegister.SMALL_COPPER_DUST.get(), 9)
                .unlockedBy("has_small_copper_dust", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegister.SMALL_COPPER_DUST.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegister.IRON_DUST.get()).requires(ItemRegister.SMALL_IRON_DUST.get(), 9)
                .unlockedBy("has_small_iron_dust", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegister.SMALL_IRON_DUST.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegister.GOLD_DUST.get()).requires(ItemRegister.SMALL_GOLD_DUST.get(), 9)
                .unlockedBy("has_small_gold_dust", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegister.SMALL_GOLD_DUST.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.GLOWSTONE_DUST).requires(ItemRegister.SMALL_GLOWSTONE_DUST.get(), 9)
                .unlockedBy("has_small_glowstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegister.SMALL_GLOWSTONE_DUST.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.REDSTONE).requires(ItemRegister.SMALL_REDSTONE_DUST.get(), 9)
                .unlockedBy("has_small_redstone_dust", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegister.SMALL_REDSTONE_DUST.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegister.NETHERITE_SCRAP_DUST.get()).requires(ItemRegister.SMALL_NETHERITE_SCRAP_DUST.get(), 9)
                .unlockedBy("has_small_netherite_scrap_dust", inventoryTrigger(ItemPredicate.Builder.item().of(ItemRegister.SMALL_NETHERITE_SCRAP_DUST.get()).build()))
                .save(consumer);
    }





    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_249580_, RecipeCategory p_251203_, ItemLike p_251689_, RecipeCategory p_251376_, ItemLike p_248771_) {
        nineBlockStorageRecipes(p_249580_, p_251203_, p_251689_, p_251376_, p_248771_, getSimpleRecipeName(p_248771_), (String)null, getSimpleRecipeName(p_251689_), (String)null);
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_250423_, RecipeCategory p_250083_, ItemLike p_250042_,
                                                  RecipeCategory p_248977_, ItemLike p_251911_, String p_250475_, @Nullable String p_248641_,
                                                  String p_252237_, @Nullable String p_250414_) {
        ShapelessRecipeBuilder.shapeless(p_250083_, p_250042_, 9).requires(p_251911_).group(p_250414_).unlockedBy(getHasName(p_251911_), has(p_251911_))
                .save(p_250423_, new ResourceLocation(Skyez.MOD_ID, p_252237_));
        ShapedRecipeBuilder.shaped(p_248977_, p_251911_).define('#', p_250042_).pattern("###").pattern("###").pattern("###").group(p_248641_)
                .unlockedBy(getHasName(p_250042_), has(p_250042_)).save(p_250423_, new ResourceLocation(Skyez.MOD_ID, p_250475_));
    }
}
