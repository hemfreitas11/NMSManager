package me.bkrmt.nms.v1_16_R1;

import net.md_5.bungee.api.ChatColor;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ColorUtil {
    private static final Pattern hexPattern = Pattern.compile("#[a-fA-F0-9]{6}");

    public static String translateHex(String message) {
        Matcher matcher = hexPattern.matcher(message);
        while (matcher.find()) {
            String color = message.substring(matcher.start(), matcher.end());
            message = message.replace(color, ChatColor.of(color) + "");
            matcher = hexPattern.matcher(message);
        }
        return message;
    }
}
