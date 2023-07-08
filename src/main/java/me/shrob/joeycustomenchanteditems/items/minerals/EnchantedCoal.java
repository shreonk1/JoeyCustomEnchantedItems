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
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.*;

public class EnchantedCoal extends CustomItem implements Listener {
    public int[] amounts;
    public EnchantedCoal(String name) {
        super(name);
        NamespacedKey key = new NamespacedKey(JoeyCustomEnchantedItems.instance, "enchanted_coal");
        this.itemStack = new ItemBuilder(Material.COAL, 1, key,Utils.addColour(Rarities.UNCOMMON.getString())).setDisplayName(Utils.addColour("&2Enchanted Coal")).addEnchants(Enchantment.LUCK, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).toItemStack();

        ShapedRecipe sr = new ShapedRecipe(key, this.itemStack);
        sr.shape(" C ", "CCC", " C ");
        sr.setIngredient('C', Material.COAL);
        Bukkit.addRecipe(sr);
    }
    @Override
    public void onCraft(PrepareItemCraftEvent e) {
        CraftingInventory inventory = e.getInventory();
        ItemStack[] matrix = inventory.getMatrix();
        int[] amounts = this.amounts;

        for(int i = 0; i < 9; i++) {
            if(amounts[i] == 32) continue;
            if(matrix[i].equals(amounts[i])) continue;
            inventory.setResult(null);
        }
    }
}
