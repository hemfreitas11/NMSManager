package me.bkrmt.nms.v1_14_R1;

import me.bkrmt.nms.api.MethodManager;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.SkullMeta;

public class MethodHandler implements MethodManager {
    @Override
    public SkullMeta setHeadOwner(SkullMeta headMeta, OfflinePlayer player) {
        headMeta.setOwningPlayer(Bukkit.getServer().getOfflinePlayer(player.getUniqueId()));
        return headMeta;
    }

    @Override
    public Player[] getOnlinePlayers() {
        return Bukkit.getOnlinePlayers().toArray(new Player[0]);
    }
}
