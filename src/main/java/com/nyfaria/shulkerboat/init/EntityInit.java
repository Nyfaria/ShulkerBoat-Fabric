package com.nyfaria.shulkerboat.init;

import com.nyfaria.shulkerboat.entity.ShulkerBoatEntity;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import static com.nyfaria.shulkerboat.NyfsShulkerBoat.MODID;

public class EntityInit {
    public static final EntityType<ShulkerBoatEntity> SHULKER_BOAT = Registry.register(Registry.ENTITY_TYPE,new ResourceLocation(MODID,"shulker_boat"), FabricEntityTypeBuilder.<ShulkerBoatEntity>create(MobCategory.MISC,ShulkerBoatEntity::new).dimensions(EntityDimensions.fixed(1.375F, 0.5625F)).build());

    public static void init() {
        // NO-OP
    }
}
