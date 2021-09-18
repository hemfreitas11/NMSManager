package me.bkrmt.nms.api;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.meta.SkullMeta;

public interface MethodManager {
    SkullMeta setHeadOwner(SkullMeta headMeta, OfflinePlayer player);

    Player[] getOnlinePlayers();
}
