package com.nyfaria.shulkerboat.recipes;

import com.nyfaria.shulkerboat.init.ItemInit;
import com.nyfaria.shulkerboat.init.RecipeInit;
import com.nyfaria.shulkerboat.item.ShulkerBoatItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.CraftingContainer;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CustomRecipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.Level;


public class ShulkerBoatDying extends CustomRecipe {


    public ShulkerBoatDying(ResourceLocation pId) {
        super(pId);
    }



    @Override
    public boolean matches(CraftingContainer pInv, Level pLevel) {
        int i = 0;
        int j = 0;

        for(int k = 0; k < pInv.getContainerSize(); ++k) {
            ItemStack itemstack = pInv.getItem(k);
            if (!itemstack.isEmpty()) {
                if (itemstack.getItem() instanceof ShulkerBoatItem) {
                    ++i;
                } else {
                    if (!(itemstack.getItem() instanceof DyeItem)) {
                        return false;
                    }

                    ++j;
                }

                if (j > 1 || i > 1) {
                    return false;
                }
            }
        }

        return i == 1 && j == 1;
    }

    @Override
    public ItemStack assemble(CraftingContainer pInv) {
        ItemStack itemstack = ItemStack.EMPTY;
        DyeColor dyecolor = DyeColor.WHITE;

        for(int i = 0; i < pInv.getContainerSize(); ++i) {
            ItemStack itemstack1 = pInv.getItem(i);
            if (!itemstack1.isEmpty()) {
                Item item = itemstack1.getItem();
                if (item instanceof ShulkerBoatItem) {
                    itemstack = itemstack1;
                } else {
                    DyeColor tmp = ((DyeItem)itemstack1.getItem()).getDyeColor();
                    if (tmp != null) dyecolor = tmp;
                }
            }
        }
        ShulkerBoatItem item = (ShulkerBoatItem) itemstack.getItem();
        DyeColor dye = dyecolor;
        ItemStack itemstack2 = new ItemStack(ItemInit.ITEMS.stream().filter(
                item2 -> item2.getType() == item.getType() && item2.getColor() == dye).findFirst().get());

        if (itemstack.hasTag()) {
            itemstack2.setTag(itemstack.getTag().copy());
        }

        return itemstack2;
    }

    @Override
    public boolean canCraftInDimensions(int pWidth, int pHeight) {
        return true;
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return RecipeInit.SHULKER_BOAT_DYING;
    }

}

