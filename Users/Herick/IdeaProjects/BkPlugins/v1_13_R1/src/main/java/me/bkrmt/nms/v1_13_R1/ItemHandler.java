package me.bkrmt.nms.v1_13_R1;

import me.bkrmt.nms.api.ItemManager;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class ItemHandler implements ItemManager {
    @Override
    public Material getWritableBook() {
        return Material.WRITABLE_BOOK;
    }

    @Override
    public ItemStack getCyanDye() {
        return new ItemStack(Material.ROSE_RED);
    }

    @Override
    public ItemStack getRedDye() {
        return new ItemStack(Material.CYAN_DYE);
    }

    @Override
    public Material getEnderEye() {
        return Material.ENDER_EYE;
    }

    @Override
    public Material getExpBottle() {
        return Material.EXPERIENCE_BOTTLE;
    }

    @Override
    public Material getSign() {
        return Material.SIGN;
    }

    @Override
    public Material getBed() {
        return Material.RED_BED;
    }

    @Override
    public Material getIronBars() {
        return Material.IRON_BARS;
    }

    @Override
    public Material getRails() {
        return Material.RAIL;
    }

    @Override
    public Material getPearl() {
        return Material.ENDER_PEARL;
    }

    @Override
    public ItemStack getWhitePane() {
        return new ItemStack(Material.GLASS_PANE);
    }

    @Override
    public ItemStack getHead() {
        return new ItemStack(Material.PLAYER_HEAD);
    }

    @Override
    public ItemStack getGreenPane() {
        return new ItemStack(Material.GREEN_STAINED_GLASS_PANE);
    }

    @Override
    public ItemStack getRedPane() {
        return new ItemStack(Material.RED_STAINED_GLASS_PANE);
    }


}
