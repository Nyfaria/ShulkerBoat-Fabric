package com.nyfaria.shulkerboat.init;

import com.nyfaria.shulkerboat.NyfsShulkerBoat;
import com.nyfaria.shulkerboat.recipes.ShulkerBoatDying;
import com.nyfaria.shulkerboat.recipes.ShulkerBoatRecipe;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SimpleRecipeSerializer;

public class RecipeInit {

    public static final RecipeSerializer<ShulkerBoatDying> SHULKER_BOAT_DYING = Registry.register(Registry.RECIPE_SERIALIZER, new ResourceLocation(NyfsShulkerBoat.MODID,"shulker_boat_dying"), new SimpleRecipeSerializer<>(ShulkerBoatDying::new));
    public static final RecipeSerializer<ShulkerBoatRecipe> SHULKER_BOAT_RECIPE = Registry.register(Registry.RECIPE_SERIALIZER,new ResourceLocation(NyfsShulkerBoat.MODID,"shulker_boat_recipe"), new ShulkerBoatRecipe.Serializer());
//    public static final RecipeType<ShulkerBoatRecipe> SHULKER_BOAT_RECIPE_TYPE = Registry.register(Registry.RECIPE_TYPE, "shulker_boat_recipe", RecipeType.Builder.create(ShulkerBoatRecipe::new).build());
    public static void init() {
        // NO-OP
    }
}
