package me.bkrmt.nms.v1_8_R1;

import me.bkrmt.nms.api.TitleManager;
import net.minecraft.server.v1_8_R1.*;
import org.bukkit.ChatColor;
import org.bukkit.craftbukkit.v1_8_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class TitleHandler implements TitleManager {
    @Override
    public void sendTitle(Player player, Integer fadeIn, Integer stay, Integer fadeOut, String title, String subtitle) {
        PlayerConnection connection = (((CraftPlayer) player).getHandle()).playerConnection;
        PacketPlayOutTitle packetPlayOutTimes = new PacketPlayOutTitle(EnumTitleAction.TIMES, null, fadeIn.intValue(), stay.intValue(), fadeOut.intValue());
        connection.sendPacket(packetPlayOutTimes);
        if (subtitle != null) {
            subtitle = subtitle.replaceAll("%player%", player.getDisplayName());
            subtitle = ChatColor.translateAlternateColorCodes('&', subtitle);
            IChatBaseComponent titleSub = ChatSerializer.a("{\"text\": \"" + subtitle + "\"}");
            PacketPlayOutTitle packetPlayOutSubTitle = new PacketPlayOutTitle(EnumTitleAction.SUBTITLE, titleSub);
            connection.sendPacket(packetPlayOutSubTitle);
        }
        if (title != null) {
            title = title.replaceAll("%player%", player.getDisplayName());
            title = ChatColor.translateAlternateColorCodes('&', title);
            IChatBaseComponent titleMain = ChatSerializer.a("{\"text\": \"" + title + "\"}");
            PacketPlayOutTitle packetPlayOutTitle = new PacketPlayOutTitle(EnumTitleAction.TITLE, titleMain);
            connection.sendPacket(packetPlayOutTitle);
        }
    }
}
