package com.elmakers.mine.bukkit.item;

import com.elmakers.mine.bukkit.utility.InventoryUtils;
import org.bukkit.inventory.ItemStack;

public class MagicItem implements com.elmakers.mine.bukkit.api.item.MagicItem {
    private String key;
    private ItemStack item;
    private double worth;
    
    public MagicItem(String key, ItemStack item, double worth) {
        this.key = key;
        this.item = item;
        this.worth = worth;
    }

    @Override
    public String getKey() {
        return key;
    }

    @Override
    public double getWorth() {
        return worth;
    }
    
    @Override
    public ItemStack getItemStack(int amount) {
        ItemStack newItem = InventoryUtils.getCopy(item);
        newItem.setAmount(amount);
        return newItem;
    }
}