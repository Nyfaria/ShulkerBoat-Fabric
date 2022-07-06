package com.nyfaria.shulkerboat;

import com.nyfaria.shulkerboat.init.EntityInit;
import com.nyfaria.shulkerboat.init.ItemInit;
import com.nyfaria.shulkerboat.init.RecipeInit;
import com.nyfaria.shulkerboat.init.TagInit;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NyfsShulkerBoat implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");
	public static final String MODID = "shulkerboat";
	public static final CreativeModeTab ITEM_GROUP = FabricItemGroupBuilder.build(
			new ResourceLocation(MODID,"group"),()->new ItemStack(ItemInit.OAK_SHULKER_BOAT));
	@Override
	public void onInitialize() {
		ItemInit.init();
		EntityInit.init();
		RecipeInit.init();
		TagInit.init();
	}
}
