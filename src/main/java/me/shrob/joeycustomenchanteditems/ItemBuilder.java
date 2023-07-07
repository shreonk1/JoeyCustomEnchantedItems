package me.shrob.joeycustomenchanteditems;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;

public class ItemBuilder {

    ItemStack item;
    Material m;
    int amount;
    String name;
    ArrayList<String> lore = new ArrayList<>();
    NamespacedKey key;

    public ItemBuilder(Material m, int amount, NamespacedKey key, String...lore) {
        this.item = new ItemStack(m, amount);
        ItemMeta im = this.item.getItemMeta();
        im.setLore(Arrays.asList(lore));

        this.item.setItemMeta(im);
        this.amount = amount;
        this.m = m;
        this.key = key;
    }



    public ItemBuilder(ItemStack item) {
        this.item = item;
    }

    public Material getMaterial() {
        return this.m;
    }

    public NamespacedKey getKey() {
        return this.key;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getDisplayName() {
        return this.name;
    }

    public ArrayList<String> getLore() {
        return this.lore;
    }

    public ItemBuilder addItemFlag(ItemFlag flag) {
        ItemMeta im = this.item.getItemMeta();
        im.addItemFlags(flag);
        this.item.setItemMeta(im);
        return this;
    }

    public ItemBuilder setDisplayName(String name) {
        ItemMeta im = this.item.getItemMeta();
        im.setDisplayName(name);
        this.item.setItemMeta(im);
        this.name = name;
        return this;
    }

    public ItemBuilder addAttributeModifier(Attribute attribute, AttributeModifier attributeModifier) {
        ItemMeta itemMeta = this.item.getItemMeta();
        itemMeta.addAttributeModifier(attribute, attributeModifier);
        this.item.setItemMeta(itemMeta);
        return this;
    }

    public ItemStack toItemStack() {
        return this.item;
    }

    public ItemBuilder addEnchants(Enchantment ench, int level) {
        this.item.addUnsafeEnchantment(ench, level);
        return this;
    }
}
