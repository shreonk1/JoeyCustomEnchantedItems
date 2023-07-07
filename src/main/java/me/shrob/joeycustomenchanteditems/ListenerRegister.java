package me.shrob.joeycustomenchanteditems;

import me.shrob.joeycustomenchanteditems.items.caves.EnchantedObsidian;
import me.shrob.joeycustomenchanteditems.items.minerals.*;
import me.shrob.joeycustomenchanteditems.items.wood.*;

public class ListenerRegister {
    public void registerListeners() {
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedCoal("enchantedCoal"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedCopper("enchantedCopper"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedDiamond("enchantedDiamond"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedEmerald("enchantedEmerald"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedGold("enchantedGold"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedIron("enchantedIron"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedLapis("enchantedLapis"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedNetherite("enchantedNetherite"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedRedstone("enchantedRedstone"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedAcacia("enchantedAcacia"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedBirch("enchantedBirch"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedDarkOak("enchantedDarkOak"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedJungle("enchantedJungle"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedOak("enchantedOak"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedMangrove("enchantedMangrove"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedSpruce("enchantedSpruce"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedObsidian("enchantedObsidian"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedDiamondBlock("enchantedDiamondBlock"), JoeyCustomEnchantedItems.instance);
        JoeyCustomEnchantedItems.pm.registerEvents(new EnchantedCoalBlock("enchantedCoalBlock"), JoeyCustomEnchantedItems.instance);
    }
}

