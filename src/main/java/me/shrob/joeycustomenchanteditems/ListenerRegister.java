package me.shrob.joeycustomenchanteditems;

import me.shrob.joeycustomenchanteditems.items.caves.EnchantedObsidian;
import me.shrob.joeycustomenchanteditems.items.minerals.*;
import me.shrob.joeycustomenchanteditems.items.wood.*;
import me.shrob.joeycustomenchanteditems.listeners.MainGUIListener;
import me.shrob.joeycustomenchanteditems.listeners.onCraftListener;

public class ListenerRegister {
    public void registerListeners() {
        JoeyCustomEnchantedItems.pm.registerEvents(new onCraftListener(), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new MainGUIListener(), JoeyCustomEnchantedItems.instance);
    }
}

