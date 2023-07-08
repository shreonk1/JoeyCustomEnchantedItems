package me.shrob.joeycustomenchanteditems.items.minerals;

import com.sun.tools.javac.util.Names;
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

import java.awt.*;

public class EnchantedCopperBlock extends CustomItem implements Listener {
    public EnchantedCopperBlock(String name) {
        super(name);
        NamespacedKey key = new NamespacedKey(JoeyCustomEnchantedItems.instance, "enchanted_copper_block");
        CustomItem enchantedCopper = JoeyCustomEnchantedItems.customItems.get("enchantedCopper");
        this.itemStack = new ItemBuilder(Material.COPPER_BLOCK, 1, key, Utils.addColour(Rarities.RARE.getString())).addEnchants(Enchantment.LUCK, 1).addItemFlag(ItemFlag.HIDE_ENCHANTS).setDisplayName(Utils.addColour("&9Enchanted Copper Block")).toItemStack();

        ShapedRecipe sr = new ShapedRecipe(key, this.itemStack);
        sr.shape(" C ", "CCC", " C ");
        sr.setIngredient('C', enchantedCopper.itemStack);
        Bukkit.addRecipe(sr);
    }
}
