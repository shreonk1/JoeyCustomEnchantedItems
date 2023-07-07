package me.shrob.joeycustomenchanteditems.items.caves;

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

public class EnchantedObsidian extends CustomItem implements Listener {
    public EnchantedObsidian(String name) {
        super(name);
        NamespacedKey key = new NamespacedKey(JoeyCustomEnchantedItems.instance, "enchanted_obsidian");
        this.itemStack = new ItemBuilder(Material.OBSIDIAN, 1, key, Utils.addColour(Rarities.RARE.getString())).addEnchants(Enchantment.LUCK, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).setDisplayName(Utils.addColour("&9Enchanted Obsidian")).toItemStack();

        ShapedRecipe sr = new ShapedRecipe(key, this.itemStack);
        sr.shape(" O ", "OOO", " O ");
        sr.setIngredient('O', Material.OBSIDIAN);
        Bukkit.addRecipe(sr);
    }
}
