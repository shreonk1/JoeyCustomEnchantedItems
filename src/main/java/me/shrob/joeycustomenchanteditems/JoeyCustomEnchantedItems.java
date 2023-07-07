package me.shrob.joeycustomenchanteditems;

import it.unimi.dsi.fastutil.Hash;
import me.shrob.joeycustomenchanteditems.items.CustomItem;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;

public final class JoeyCustomEnchantedItems extends JavaPlugin {

    public static JoeyCustomEnchantedItems instance;
    public static RecipeRegister rr = new RecipeRegister();
    public static HashMap<String, CustomItem> customItems = new HashMap<>();
    public static PluginManager pm = Bukkit.getPluginManager();
    @Override

    public void onEnable() {
        instance = this;
        rr.registerRecipes();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
