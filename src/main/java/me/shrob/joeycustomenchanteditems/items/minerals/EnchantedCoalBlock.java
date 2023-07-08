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
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ShapedRecipe;

public class EnchantedCoalBlock extends CustomItem implements Listener {
    public EnchantedCoalBlock(String name) {
        super(name);
        NamespacedKey key = new NamespacedKey(JoeyCustomEnchantedItems.instance, "enchanted_coal_block");
        CustomItem enchantedCoal = JoeyCustomEnchantedItems.customItems.get("enchantedCoal");
        this.itemStack = new ItemBuilder(Material.COAL_BLOCK, 1, key, Utils.addColour(Rarities.RARE.getString())).addEnchants(Enchantment.LUCK, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).setDisplayName(Utils.addColour("&9Enchanted Coal Block")).toItemStack();

        ShapedRecipe sr = new ShapedRecipe(key, this.itemStack);
        sr.shape(" C ", "CCC", " C ");
        sr.setIngredient('C', enchantedCoal.itemStack);
        Bukkit.addRecipe(sr);
    }

    @Override
    public void onCraft(PrepareItemCraftEvent e) {

    }
}
