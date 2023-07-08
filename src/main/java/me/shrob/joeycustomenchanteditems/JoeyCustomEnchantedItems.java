package me.shrob.joeycustomenchanteditems;

import it.unimi.dsi.fastutil.Hash;
import me.shrob.joeycustomenchanteditems.commands.OpenGUI;
import me.shrob.joeycustomenchanteditems.items.CustomItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Item;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.HashMap;
import java.util.logging.Logger;

public final class JoeyCustomEnchantedItems extends JavaPlugin {

    public static JoeyCustomEnchantedItems instance;
    public static RecipeRegister rr = new RecipeRegister();
    public static ListenerRegister lr = new ListenerRegister();
    public static HashMap<String, CustomItem> customItems = new HashMap<>();
    public static PluginManager pm = Bukkit.getPluginManager();
    public static Logger log = Bukkit.getLogger();
    public static ItemStack backArrow = new ItemStack(Material.ARROW, 1);
    public static ItemStack closeBarrier = new ItemStack(Material.BARRIER, 1);

    @Override

    public void onEnable() {
        instance = this;
        rr.registerRecipes();
        lr.registerListeners();

        ItemMeta arrowMeta = backArrow.getItemMeta();
        arrowMeta.addEnchant(Enchantment.LUCK, 1, false);
        arrowMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        arrowMeta.setDisplayName(Utils.addColour("&b&lPrevious Page"));
        backArrow.setItemMeta(arrowMeta);

        ItemMeta barrierMeta = closeBarrier.getItemMeta();
        barrierMeta.addEnchant(Enchantment.LUCK, 1, false);
        barrierMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        barrierMeta.setDisplayName(Utils.addColour("&c&lClose"));


        getCommand("recipes").setExecutor(new OpenGUI());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
