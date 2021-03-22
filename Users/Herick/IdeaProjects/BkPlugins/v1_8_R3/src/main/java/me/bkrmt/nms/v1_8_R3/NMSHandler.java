package me.bkrmt.nms.v1_8_R3;

import me.bkrmt.nms.api.*;

public class NMSHandler implements NMS {
    private final SoundManager soundHandler;
    private final ItemManager materialHandler;
    private final MethodManager methodHandler;
    private final TitleManager titleHandler;
    private final ItemMessageManager itemMessageHandler;

    public NMSHandler() {
        methodHandler = new MethodHandler();
        soundHandler = new SoundHandler();
        materialHandler = new ItemHandler();
        titleHandler = new TitleHandler();
        itemMessageHandler = new ItemMessageHandler();
    }

    @Override
    public ItemMessageManager getItemMessageManager() {
        return itemMessageHandler;
    }

    @Override
    public SoundManager getSoundManager() {
        return soundHandler;
    }

    @Override
    public TitleManager getTitleManager() {
        return titleHandler;
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
