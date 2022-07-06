package com.nyfaria.shulkerboat.init;

import com.nyfaria.shulkerboat.NyfsShulkerBoat;
import com.nyfaria.shulkerboat.item.ShulkerBoatItem;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemInit {

    public static List<ShulkerBoatItem> ITEMS = new ArrayList<>();

    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT = register("spruce_shulker_boat",new ShulkerBoatItem(true, Boat.Type.SPRUCE, null,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_RED = register("spruce_shulker_boat_red",new ShulkerBoatItem(true, Boat.Type.SPRUCE, DyeColor.RED,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_GREEN = register("spruce_shulker_boat_green",new ShulkerBoatItem(true, Boat.Type.SPRUCE,DyeColor.GREEN ,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_BLUE = register("spruce_shulker_boat_blue",new ShulkerBoatItem(true, Boat.Type.SPRUCE, DyeColor.BLUE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_PURPLE = register("spruce_shulker_boat_purple",new ShulkerBoatItem(true, Boat.Type.SPRUCE, DyeColor.PURPLE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_CYAN = register("spruce_shulker_boat_cyan",new ShulkerBoatItem(true, Boat.Type.SPRUCE, DyeColor.CYAN,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_BLACK = register("spruce_shulker_boat_black",new ShulkerBoatItem(true, Boat.Type.SPRUCE, DyeColor.BLACK, (new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_GRAY = register("spruce_shulker_boat_gray",new ShulkerBoatItem(true, Boat.Type.SPRUCE, DyeColor.GRAY,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_WHITE = register("spruce_shulker_boat_white",new ShulkerBoatItem(true, Boat.Type.SPRUCE, DyeColor.WHITE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_ORANGE = register("spruce_shulker_boat_orange",new ShulkerBoatItem(true, Boat.Type.SPRUCE, DyeColor.ORANGE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_MAGENTA = register("spruce_shulker_boat_magenta",new ShulkerBoatItem(true, Boat.Type.SPRUCE, DyeColor.MAGENTA,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_LIGHT_BLUE = register("spruce_shulker_boat_light_blue",new ShulkerBoatItem(true, Boat.Type.SPRUCE, DyeColor.LIGHT_BLUE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_YELLOW = register("spruce_shulker_boat_yellow",new ShulkerBoatItem(true, Boat.Type.SPRUCE, DyeColor.YELLOW,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_LIME = register("spruce_shulker_boat_lime",new ShulkerBoatItem(true, Boat.Type.SPRUCE, DyeColor.LIME,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_PINK = register("spruce_shulker_boat_pink",new ShulkerBoatItem(true, Boat.Type.SPRUCE, DyeColor.PINK,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_BROWN = register("spruce_shulker_boat_brown",new ShulkerBoatItem(true, Boat.Type.SPRUCE, DyeColor.BROWN,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem SPRUCE_SHULKER_BOAT_LIGHT_GRAY = register("spruce_shulker_boat_light_gray",new ShulkerBoatItem(true, Boat.Type.SPRUCE, DyeColor.LIGHT_GRAY,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT = register("oak_shulker_boat",new ShulkerBoatItem(true, Boat.Type.OAK, null,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_RED = register("oak_shulker_boat_red",new ShulkerBoatItem(true, Boat.Type.OAK, DyeColor.RED,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_GREEN = register("oak_shulker_boat_green",new ShulkerBoatItem(true, Boat.Type.OAK,DyeColor.GREEN ,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_BLUE = register("oak_shulker_boat_blue",new ShulkerBoatItem(true, Boat.Type.OAK, DyeColor.BLUE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_PURPLE = register("oak_shulker_boat_purple",new ShulkerBoatItem(true, Boat.Type.OAK, DyeColor.PURPLE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_CYAN = register("oak_shulker_boat_cyan",new ShulkerBoatItem(true, Boat.Type.OAK, DyeColor.CYAN,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_BLACK = register("oak_shulker_boat_black",new ShulkerBoatItem(true, Boat.Type.OAK, DyeColor.BLACK, (new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_GRAY = register("oak_shulker_boat_gray",new ShulkerBoatItem(true, Boat.Type.OAK, DyeColor.GRAY,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_WHITE = register("oak_shulker_boat_white",new ShulkerBoatItem(true, Boat.Type.OAK, DyeColor.WHITE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_ORANGE = register("oak_shulker_boat_orange",new ShulkerBoatItem(true, Boat.Type.OAK, DyeColor.ORANGE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_MAGENTA = register("oak_shulker_boat_magenta",new ShulkerBoatItem(true, Boat.Type.OAK, DyeColor.MAGENTA,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_LIGHT_BLUE = register("oak_shulker_boat_light_blue",new ShulkerBoatItem(true, Boat.Type.OAK, DyeColor.LIGHT_BLUE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_YELLOW = register("oak_shulker_boat_yellow",new ShulkerBoatItem(true, Boat.Type.OAK, DyeColor.YELLOW,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_LIME = register("oak_shulker_boat_lime",new ShulkerBoatItem(true, Boat.Type.OAK, DyeColor.LIME,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_PINK = register("oak_shulker_boat_pink",new ShulkerBoatItem(true, Boat.Type.OAK, DyeColor.PINK,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_BROWN = register("oak_shulker_boat_brown",new ShulkerBoatItem(true, Boat.Type.OAK, DyeColor.BROWN,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem OAK_SHULKER_BOAT_LIGHT_GRAY = register("oak_shulker_boat_light_gray",new ShulkerBoatItem(true, Boat.Type.OAK, DyeColor.LIGHT_GRAY,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT = register("acacia_shulker_boat",new ShulkerBoatItem(true, Boat.Type.ACACIA, null,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_RED = register("acacia_shulker_boat_red",new ShulkerBoatItem(true, Boat.Type.ACACIA, DyeColor.RED,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_GREEN = register("acacia_shulker_boat_green",new ShulkerBoatItem(true, Boat.Type.ACACIA,DyeColor.GREEN ,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_BLUE = register("acacia_shulker_boat_blue",new ShulkerBoatItem(true, Boat.Type.ACACIA, DyeColor.BLUE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_PURPLE = register("acacia_shulker_boat_purple",new ShulkerBoatItem(true, Boat.Type.ACACIA, DyeColor.PURPLE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_CYAN = register("acacia_shulker_boat_cyan",new ShulkerBoatItem(true, Boat.Type.ACACIA, DyeColor.CYAN,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_BLACK = register("acacia_shulker_boat_black",new ShulkerBoatItem(true, Boat.Type.ACACIA, DyeColor.BLACK, (new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_GRAY = register("acacia_shulker_boat_gray",new ShulkerBoatItem(true, Boat.Type.ACACIA, DyeColor.GRAY,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_WHITE = register("acacia_shulker_boat_white",new ShulkerBoatItem(true, Boat.Type.ACACIA, DyeColor.WHITE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_ORANGE = register("acacia_shulker_boat_orange",new ShulkerBoatItem(true, Boat.Type.ACACIA, DyeColor.ORANGE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_MAGENTA = register("acacia_shulker_boat_magenta",new ShulkerBoatItem(true, Boat.Type.ACACIA, DyeColor.MAGENTA,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_LIGHT_BLUE = register("acacia_shulker_boat_light_blue",new ShulkerBoatItem(true, Boat.Type.ACACIA, DyeColor.LIGHT_BLUE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_YELLOW = register("acacia_shulker_boat_yellow",new ShulkerBoatItem(true, Boat.Type.ACACIA, DyeColor.YELLOW,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_LIME = register("acacia_shulker_boat_lime",new ShulkerBoatItem(true, Boat.Type.ACACIA, DyeColor.LIME,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_PINK = register("acacia_shulker_boat_pink",new ShulkerBoatItem(true, Boat.Type.ACACIA, DyeColor.PINK,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_BROWN = register("acacia_shulker_boat_brown",new ShulkerBoatItem(true, Boat.Type.ACACIA, DyeColor.BROWN,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem ACACIA_SHULKER_BOAT_LIGHT_GRAY = register("acacia_shulker_boat_light_gray",new ShulkerBoatItem(true, Boat.Type.ACACIA, DyeColor.LIGHT_GRAY,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT = register("birch_shulker_boat",new ShulkerBoatItem(true, Boat.Type.BIRCH, null,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_RED = register("birch_shulker_boat_red",new ShulkerBoatItem(true, Boat.Type.BIRCH, DyeColor.RED,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_GREEN = register("birch_shulker_boat_green",new ShulkerBoatItem(true, Boat.Type.BIRCH,DyeColor.GREEN ,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_BLUE = register("birch_shulker_boat_blue",new ShulkerBoatItem(true, Boat.Type.BIRCH, DyeColor.BLUE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_PURPLE = register("birch_shulker_boat_purple",new ShulkerBoatItem(true, Boat.Type.BIRCH, DyeColor.PURPLE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_CYAN = register("birch_shulker_boat_cyan",new ShulkerBoatItem(true, Boat.Type.BIRCH, DyeColor.CYAN,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_BLACK = register("birch_shulker_boat_black",new ShulkerBoatItem(true, Boat.Type.BIRCH, DyeColor.BLACK, (new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_GRAY = register("birch_shulker_boat_gray",new ShulkerBoatItem(true, Boat.Type.BIRCH, DyeColor.GRAY,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_WHITE = register("birch_shulker_boat_white",new ShulkerBoatItem(true, Boat.Type.BIRCH, DyeColor.WHITE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_ORANGE = register("birch_shulker_boat_orange",new ShulkerBoatItem(true, Boat.Type.BIRCH, DyeColor.ORANGE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_MAGENTA = register("birch_shulker_boat_magenta",new ShulkerBoatItem(true, Boat.Type.BIRCH, DyeColor.MAGENTA,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_LIGHT_BLUE = register("birch_shulker_boat_light_blue",new ShulkerBoatItem(true, Boat.Type.BIRCH, DyeColor.LIGHT_BLUE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_YELLOW = register("birch_shulker_boat_yellow",new ShulkerBoatItem(true, Boat.Type.BIRCH, DyeColor.YELLOW,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_LIME = register("birch_shulker_boat_lime",new ShulkerBoatItem(true, Boat.Type.BIRCH, DyeColor.LIME,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_PINK = register("birch_shulker_boat_pink",new ShulkerBoatItem(true, Boat.Type.BIRCH, DyeColor.PINK,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_BROWN = register("birch_shulker_boat_brown",new ShulkerBoatItem(true, Boat.Type.BIRCH, DyeColor.BROWN,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem BIRCH_SHULKER_BOAT_LIGHT_GRAY = register("birch_shulker_boat_light_gray",new ShulkerBoatItem(true, Boat.Type.BIRCH, DyeColor.LIGHT_GRAY,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT = register("jungle_shulker_boat",new ShulkerBoatItem(true, Boat.Type.JUNGLE, null,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_RED = register("jungle_shulker_boat_red",new ShulkerBoatItem(true, Boat.Type.JUNGLE, DyeColor.RED,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_GREEN = register("jungle_shulker_boat_green",new ShulkerBoatItem(true, Boat.Type.JUNGLE,DyeColor.GREEN ,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_BLUE = register("jungle_shulker_boat_blue",new ShulkerBoatItem(true, Boat.Type.JUNGLE, DyeColor.BLUE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_PURPLE = register("jungle_shulker_boat_purple",new ShulkerBoatItem(true, Boat.Type.JUNGLE, DyeColor.PURPLE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_CYAN = register("jungle_shulker_boat_cyan",new ShulkerBoatItem(true, Boat.Type.JUNGLE, DyeColor.CYAN,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_BLACK = register("jungle_shulker_boat_black",new ShulkerBoatItem(true, Boat.Type.JUNGLE, DyeColor.BLACK, (new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_GRAY = register("jungle_shulker_boat_gray",new ShulkerBoatItem(true, Boat.Type.JUNGLE, DyeColor.GRAY,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_WHITE = register("jungle_shulker_boat_white",new ShulkerBoatItem(true, Boat.Type.JUNGLE, DyeColor.WHITE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_ORANGE = register("jungle_shulker_boat_orange",new ShulkerBoatItem(true, Boat.Type.JUNGLE, DyeColor.ORANGE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_MAGENTA = register("jungle_shulker_boat_magenta",new ShulkerBoatItem(true, Boat.Type.JUNGLE, DyeColor.MAGENTA,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_LIGHT_BLUE = register("jungle_shulker_boat_light_blue",new ShulkerBoatItem(true, Boat.Type.JUNGLE, DyeColor.LIGHT_BLUE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_YELLOW = register("jungle_shulker_boat_yellow",new ShulkerBoatItem(true, Boat.Type.JUNGLE, DyeColor.YELLOW,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_LIME = register("jungle_shulker_boat_lime",new ShulkerBoatItem(true, Boat.Type.JUNGLE, DyeColor.LIME,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_PINK = register("jungle_shulker_boat_pink",new ShulkerBoatItem(true, Boat.Type.JUNGLE, DyeColor.PINK,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_BROWN = register("jungle_shulker_boat_brown",new ShulkerBoatItem(true, Boat.Type.JUNGLE, DyeColor.BROWN,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem JUNGLE_SHULKER_BOAT_LIGHT_GRAY = register("jungle_shulker_boat_light_gray",new ShulkerBoatItem(true, Boat.Type.JUNGLE, DyeColor.LIGHT_GRAY,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT = register("mangrove_shulker_boat",new ShulkerBoatItem(true, Boat.Type.MANGROVE, null,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_RED = register("mangrove_shulker_boat_red",new ShulkerBoatItem(true, Boat.Type.MANGROVE, DyeColor.RED,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_GREEN = register("mangrove_shulker_boat_green",new ShulkerBoatItem(true, Boat.Type.MANGROVE,DyeColor.GREEN ,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_BLUE = register("mangrove_shulker_boat_blue",new ShulkerBoatItem(true, Boat.Type.MANGROVE, DyeColor.BLUE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_PURPLE = register("mangrove_shulker_boat_purple",new ShulkerBoatItem(true, Boat.Type.MANGROVE, DyeColor.PURPLE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_CYAN = register("mangrove_shulker_boat_cyan",new ShulkerBoatItem(true, Boat.Type.MANGROVE, DyeColor.CYAN,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_BLACK = register("mangrove_shulker_boat_black",new ShulkerBoatItem(true, Boat.Type.MANGROVE, DyeColor.BLACK, (new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_GRAY = register("mangrove_shulker_boat_gray",new ShulkerBoatItem(true, Boat.Type.MANGROVE, DyeColor.GRAY,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_WHITE = register("mangrove_shulker_boat_white",new ShulkerBoatItem(true, Boat.Type.MANGROVE, DyeColor.WHITE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_ORANGE = register("mangrove_shulker_boat_orange",new ShulkerBoatItem(true, Boat.Type.MANGROVE, DyeColor.ORANGE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_MAGENTA = register("mangrove_shulker_boat_magenta",new ShulkerBoatItem(true, Boat.Type.MANGROVE, DyeColor.MAGENTA,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_LIGHT_BLUE = register("mangrove_shulker_boat_light_blue",new ShulkerBoatItem(true, Boat.Type.MANGROVE, DyeColor.LIGHT_BLUE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_YELLOW = register("mangrove_shulker_boat_yellow",new ShulkerBoatItem(true, Boat.Type.MANGROVE, DyeColor.YELLOW,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_LIME = register("mangrove_shulker_boat_lime",new ShulkerBoatItem(true, Boat.Type.MANGROVE, DyeColor.LIME,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_PINK = register("mangrove_shulker_boat_pink",new ShulkerBoatItem(true, Boat.Type.MANGROVE, DyeColor.PINK,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_BROWN = register("mangrove_shulker_boat_brown",new ShulkerBoatItem(true, Boat.Type.MANGROVE, DyeColor.BROWN,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem MANGROVE_SHULKER_BOAT_LIGHT_GRAY = register("mangrove_shulker_boat_light_gray",new ShulkerBoatItem(true, Boat.Type.MANGROVE, DyeColor.LIGHT_GRAY,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT = register("dark_oak_shulker_boat",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, null,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_RED = register("dark_oak_shulker_boat_red",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, DyeColor.RED,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_GREEN = register("dark_oak_shulker_boat_green",new ShulkerBoatItem(true, Boat.Type.DARK_OAK,DyeColor.GREEN ,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_BLUE = register("dark_oak_shulker_boat_blue",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, DyeColor.BLUE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_PURPLE = register("dark_oak_shulker_boat_purple",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, DyeColor.PURPLE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_CYAN = register("dark_oak_shulker_boat_cyan",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, DyeColor.CYAN,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_BLACK = register("dark_oak_shulker_boat_black",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, DyeColor.BLACK, (new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_GRAY = register("dark_oak_shulker_boat_gray",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, DyeColor.GRAY,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_WHITE = register("dark_oak_shulker_boat_white",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, DyeColor.WHITE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_ORANGE = register("dark_oak_shulker_boat_orange",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, DyeColor.ORANGE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_MAGENTA = register("dark_oak_shulker_boat_magenta",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, DyeColor.MAGENTA,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_LIGHT_BLUE = register("dark_oak_shulker_boat_light_blue",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, DyeColor.LIGHT_BLUE,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_YELLOW = register("dark_oak_shulker_boat_yellow",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, DyeColor.YELLOW,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_LIME = register("dark_oak_shulker_boat_lime",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, DyeColor.LIME,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_PINK = register("dark_oak_shulker_boat_pink",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, DyeColor.PINK,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_BROWN = register("dark_oak_shulker_boat_brown",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, DyeColor.BROWN,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));
    public static final ShulkerBoatItem DARK_OAK_SHULKER_BOAT_LIGHT_GRAY = register("dark_oak_shulker_boat_light_gray",new ShulkerBoatItem(true, Boat.Type.DARK_OAK, DyeColor.LIGHT_GRAY,(new Item.Properties()).stacksTo(1).tab(NyfsShulkerBoat.ITEM_GROUP)));


    public static ShulkerBoatItem register(String name, ShulkerBoatItem item) {
        ITEMS.add(item);
        return Registry.register(Registry.ITEM, new ResourceLocation(NyfsShulkerBoat.MODID,name), item);
    }
    public static void init() {
        // NO-OP
    }
}
