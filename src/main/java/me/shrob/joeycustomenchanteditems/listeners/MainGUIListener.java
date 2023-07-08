package me.shrob.joeycustomenchanteditems.listeners;

import me.shrob.joeycustomenchanteditems.Utils;
import me.shrob.joeycustomenchanteditems.guis.MineralsGUI;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MainGUIListener implements Listener {

    @EventHandler
    public static void onInventoryClick(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        final ItemStack clickedItem = e.getCurrentItem();

        if(!e.getView().getTitle().equalsIgnoreCase("Items and Recipes")) return;

        if(clickedItem == null || clickedItem.getType().isAir()) return;

        if(e.getView().getTitle().equalsIgnoreCase("Items and Recipes")) {
            e.setCancelled(true);
            if(clickedItem.getItemMeta().getDisplayName().equalsIgnoreCase(Utils.addColour("&2&lMinerals"))) {
                MineralsGUI mineralsGUI = new MineralsGUI();
                mineralsGUI.createGui(player);
            }
        }

    }
}
