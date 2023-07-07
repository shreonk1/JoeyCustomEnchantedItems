package me.shrob.joeycustomenchanteditems.items.wood;

import me.shrob.joeycustomenchanteditems.ItemBuilder;
import me.shrob.joeycustomenchanteditems.JoeyCustomEnchantedItems;
import me.shrob.joeycustomenchanteditems.Rarities;
import me.shrob.joeycustomenchanteditems.Utils;
import me.shrob.joeycustomenchanteditems.items.CustomItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ShapedRecipe;

public class EnchantedJungle extends CustomItem implements Listener {
    public EnchantedJungle(String name) {
        super(name);
        NamespacedKey key = new NamespacedKey(JoeyCustomEnchantedItems.instance, "enchanted_jungle_log");
        this.itemStack = new ItemBuilder(Material.JUNGLE_LOG, 1, key, Utils.addColour(Rarities.UNCOMMON.getString())).addEnchants(Enchantment.LUCK, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).setDisplayName(Utils.addColour("&2")).toItemStack();

        ShapedRecipe sr = new ShapedRecipe(key, this.itemStack);
        sr.shape(" J ", "JJJ", " J ");
        sr.setIngredient('J', Material.JUNGLE_LOG);
        Bukkit.addRecipe(sr);
    }
}
