package me.bkrmt.nms.v1_13_R1;


import me.bkrmt.nms.api.SoundManager;
import org.bukkit.Sound;


public class SoundHandler implements SoundManager {
    @Override
    public Sound getClick() {
        return Sound.UI_BUTTON_CLICK;
    }

    @Override
    public Sound getExpPickup() {
        return Sound.ORB_PICKUP;
    }

    @Override
    public Sound getPling() {
        return Sound.BLOCK_NOTE_BLOCK_PLING;
    }
}
