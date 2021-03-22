package me.bkrmt.nms.v1_8_R3;


import me.bkrmt.nms.api.SoundManager;
import org.bukkit.Sound;

public class SoundHandler implements SoundManager {
    @Override
    public Sound getClick() {
        return Sound.CLICK;
    }

    @Override
    public Sound getPling() {
        return Sound.NOTE_PLING;
    }
}
