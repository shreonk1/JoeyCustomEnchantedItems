package me.shrob.joeycustomenchanteditems.items.wood;

import me.shrob.joeycustomenchanteditems.ItemBuilder;
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

public class EnchantedOak extends CustomItem implements Listener {
    public EnchantedOak(String name) {
        super(name);
        NamespacedKey key = NamespacedKey.minecraft("enchanted_oak_log");
        this.itemStack = new ItemBuilder(Material.OAK_LOG, 1, key, Utils.addColour(Rarities.UNCOMMON.getString())).setDisplayName(Utils.addColour("&2Enchanted Oak Log")).addEnchants(Enchantment.LUCK, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).toItemStack();

        ShapedRecipe sr = new ShapedRecipe(key, this.itemStack);
        sr.shape(" L ", "LLL", " L ");
        sr.setIngredient('L', Material.OAK_LOG);
        Bukkit.addRecipe(sr);
    }
}
