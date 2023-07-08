package me.shrob.joeycustomenchanteditems.items.minerals;

import me.shrob.joeycustomenchanteditems.ItemBuilder;
import me.shrob.joeycustomenchanteditems.Rarities;
import me.shrob.joeycustomenchanteditems.Utils;
import me.shrob.joeycustomenchanteditems.items.CustomItem;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ShapedRecipe;

public class EnchantedRedstone extends CustomItem implements Listener {

    public EnchantedRedstone(String name) {
        super(name);
        NamespacedKey key = NamespacedKey.minecraft("enchanted_redstone_dust");
        this.itemStack = new ItemBuilder(Material.REDSTONE, 1, key, Utils.addColour(Rarities.UNCOMMON.getString())).setDisplayName(Utils.addColour("&2Enchanted Redstone")).addEnchants(Enchantment.LUCK, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).toItemStack();

        ShapedRecipe sr = new ShapedRecipe(key, this.itemStack);
        sr.shape(" R ", "RRR", " R ");
        sr.setIngredient('R', Material.REDSTONE);
        Bukkit.addRecipe(sr);
    }

    @Override
    public void onCraft(PrepareItemCraftEvent e) {

    }
}
