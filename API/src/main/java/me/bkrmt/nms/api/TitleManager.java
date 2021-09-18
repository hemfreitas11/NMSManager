package me.bkrmt.nms.api;

import org.bukkit.entity.Player;

public interface TitleManager {
    void sendTitle(Player player, Integer fadeIn, Integer stay, Integer fadeOut, String title, String subtitle);
}
