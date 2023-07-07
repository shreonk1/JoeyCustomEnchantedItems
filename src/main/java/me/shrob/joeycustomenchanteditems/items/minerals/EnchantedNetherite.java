package me.shrob.joeycustomenchanteditems.items.minerals;

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
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class EnchantedNetherite extends CustomItem implements Listener {

    public EnchantedNetherite(String name) {
        super(name);
        NamespacedKey key = NamespacedKey.minecraft("enchanted_netherite_ingot");
        this.itemStack = new ItemBuilder(Material.NETHERITE_INGOT, 1, key, Utils.addColour(Rarities.UNCOMMON.getString())).setDisplayName(Utils.addColour("&2Enchanted Netherite")).addEnchants(Enchantment.LUCK, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).toItemStack();

        ShapedRecipe sr = new ShapedRecipe(key, this.itemStack);
        sr.shape(" N ", "NNN", " N ");
        sr.setIngredient('N', Material.NETHERITE_INGOT);
        Bukkit.addRecipe(sr);
    }
}
