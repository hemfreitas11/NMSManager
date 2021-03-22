package me.bkrmt.nms.v1_14_R1;

import me.bkrmt.nms.api.ItemMessageManager;
import net.minecraft.server.v1_14_R1.PacketPlayOutSetSlot;
import org.bukkit.craftbukkit.v1_14_R1.entity.CraftPlayer;
import org.bukkit.craftbukkit.v1_14_R1.inventory.CraftItemStack;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class ItemMessageHandler implements ItemMessageManager {
    @Override
    public void sendItemSlotChange(Player player, int slot, ItemStack stack) {
        CraftPlayer craftPlayer = (CraftPlayer) player;
        PacketPlayOutSetSlot packet = new PacketPlayOutSetSlot(0, slot + 36, CraftItemStack.asNMSCopy(stack));
        craftPlayer.getHandle().playerConnection.sendPacket(packet);
    }
}
