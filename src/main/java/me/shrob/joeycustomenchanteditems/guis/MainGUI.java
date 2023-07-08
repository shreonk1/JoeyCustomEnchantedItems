package me.shrob.joeycustomenchanteditems.guis;

import me.shrob.joeycustomenchanteditems.Utils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MainGUI {
    ItemStack minerals = new ItemStack(Material.DIAMOND, 1);
    public void createGui(Player player) {
        Inventory inv = Bukkit.createInventory(null, 27, "Items and Recipes");

        ItemMeta mineralMeta = minerals.getItemMeta();
        mineralMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        mineralMeta.setDisplayName(Utils.addColour("&2&lMinerals"));
        mineralMeta.addEnchant(Enchantment.LUCK, 1, false);
        minerals.setItemMeta(mineralMeta);

        inv.setItem(10, minerals);

        player.openInventory(inv);
    }
}
