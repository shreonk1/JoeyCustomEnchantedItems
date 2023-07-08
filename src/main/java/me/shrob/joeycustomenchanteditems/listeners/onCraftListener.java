package me.shrob.joeycustomenchanteditems.listeners;

import me.shrob.joeycustomenchanteditems.JoeyCustomEnchantedItems;
import me.shrob.joeycustomenchanteditems.items.CustomItem;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;

import java.util.Map;

public class onCraftListener implements Listener {

    @EventHandler
    public void onCraft(PrepareItemCraftEvent event) {
        for(Map.Entry<String, CustomItem> entry : JoeyCustomEnchantedItems.customItems.entrySet()) {
            entry.getValue().onCraft(event);
        }
    }
}
