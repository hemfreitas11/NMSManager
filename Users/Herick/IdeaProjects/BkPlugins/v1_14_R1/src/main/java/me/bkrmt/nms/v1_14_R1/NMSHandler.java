package me.bkrmt.nms.v1_14_R1;

import me.bkrmt.nms.api.*;

public class NMSHandler implements NMS {
    private final SoundManager soundHandler;
    private final ItemManager materialHandler;
    private final MethodManager methodHandler;

    public NMSHandler() {
        methodHandler = new MethodHandler();
        soundHandler = new SoundHandler();
        materialHandler = new ItemHandler();
    }

    @Override
    public ItemMessageManager getItemMessageManager() {
        return null;
    }

    @Override
    public SoundManager getSoundManager() {
        return soundHandler;
    }

    @Override
    public TitleManager getTitleManager() {
        return null;
    }

    @Override
    public MethodManager getMethodManager() {
        return methodHandler;
    }

    @Override
    public ItemManager getItemManager() {
        return materialHandler;
    }
}
