package me.bkrmt.nms.v1_8_R2;

import me.bkrmt.nms.api.ItemManager;
import org.bukkit.Material;
import org.bukkit.SkullType;
import org.bukkit.inventory.ItemStack;

public class ItemHandler implements ItemManager {
    @Override
    public Material getWritableBook() {
        return Material.BOOK_AND_QUILL;
    }

    @Override
    public ItemStack getCyanDye() {
        return new ItemStack(Material.INK_SACK, 1, (short) 6);
    }

    @Override
    public ItemStack getRedDye() {
        return new ItemStack(Material.INK_SACK, 1, (short) 1);
    }

    @Override
    public Material getEnderEye() {
        return Material.EYE_OF_ENDER;
    }

    @Override
    public Material getExpBottle() {
        return Material.EXP_BOTTLE;
    }

    @Override
    public Material getSign() {
        return Material.SIGN;
    }

    @Override
    public Material getBed() {
        return Material.BED;
    }

    @Override
    public Material getIronBars() {
        return Material.IRON_FENCE;
    }

    @Override
    public Material getRails() {
        return Material.RAILS;
    }

    @Override
    public Material getPearl() {
        return Material.ENDER_PEARL;
    }

    @Override
    public ItemStack getWhitePane() {
        return new ItemStack(Material.THIN_GLASS);
    }

    @Override
    public ItemStack getHead() {
        return new ItemStack(Material.SKULL_ITEM, 1, (short) SkullType.PLAYER.ordinal());
    }

    @Override
    public ItemStack getGreenPane() {
        return new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 5);
    }

    @Override
    public ItemStack getRedPane() {
        return new ItemStack(Material.STAINED_GLASS_PANE, 1, (short) 14);
    }

}
