package me.bkrmt.nms.v1_8_R1;

import me.bkrmt.nms.api.ItemMessageManager;
import me.bkrmt.nms.api.MethodManager;
import me.bkrmt.nms.api.NMS;
import me.bkrmt.nms.api.TitleManager;

public class NMSHandler implements NMS {
    private final MethodManager methodHandler;
    private final TitleManager titleHandler;
    private final ItemMessageManager itemMessageHandler;

    public NMSHandler() {
        methodHandler = new MethodHandler();
        titleHandler = new TitleHandler();
        itemMessageHandler = new ItemMessageHandler();
    }

    @Override
    public ItemMessageManager getItemMessageManager() {
        return itemMessageHandler;
    }

    @Override
    public TitleManager getTitleManager() {
        return titleHandler;
    }

    @Override
    public MethodManager getMethodManager() {
        return methodHandler;
    }
}
