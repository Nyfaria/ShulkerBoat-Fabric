package com.nyfaria.shulkerboat;

import com.nyfaria.shulkerboat.entity.ShulkerBoatEntityRenderer;
import com.nyfaria.shulkerboat.entity.ShulkerBoatModel;
import com.nyfaria.shulkerboat.init.EntityInit;
import com.nyfaria.shulkerboat.init.ItemInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NyfsShulkerBoatClient implements ClientModInitializer {
    // This logger is used to write text to the console and the log file.
    // It is considered best practice to use your mod id as the logger's name.
    // That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");
    public static final String MODID = "shulkerboat";

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(ShulkerBoatModel.LAYER_LOCATION, ShulkerBoatModel::createBodyModel);
        EntityRendererRegistry.register(EntityInit.SHULKER_BOAT, ShulkerBoatEntityRenderer::new);
    }
}
