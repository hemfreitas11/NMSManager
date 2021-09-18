package me.bkrmt.nms.v1_16_R1;

import me.bkrmt.nms.api.ItemMessageManager;
import me.bkrmt.nms.api.MethodManager;
import me.bkrmt.nms.api.NMS;
import me.bkrmt.nms.api.TitleManager;

public class NMSHandler implements NMS {
    private final MethodManager methodHandler;

    public NMSHandler() {
        methodHandler = new MethodHandler();
    }

    @Override
    public ItemMessageManager getItemMessageManager() {
        return null;
    }

    @Override
    public TitleManager getTitleManager() {
        return null;
    }

    @Override
    public MethodManager getMethodManager() {
        return methodHandler;
    }
}
