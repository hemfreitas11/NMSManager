package me.bkrmt.nms.v1_8_R2;

import me.bkrmt.nms.api.MethodManager;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.SkullMeta;

public class MethodHandler implements MethodManager {
    @Override
    public SkullMeta setHeadOwner(SkullMeta headMeta, OfflinePlayer player) {
        headMeta.setOwner(player.getName());
        return headMeta;
    }

    @Override
    public Player[] getOnlinePlayers() {
        return Bukkit.getOnlinePlayers().toArray(new Player[0]);
    }
}
