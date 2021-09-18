package me.bkrmt.nms.api;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public interface ItemMessageManager {
    void sendItemSlotChange(Player player, int slot, ItemStack stack);
}
