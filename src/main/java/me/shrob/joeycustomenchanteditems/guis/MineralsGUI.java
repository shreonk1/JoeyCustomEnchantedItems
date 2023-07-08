package me.shrob.joeycustomenchanteditems.guis;

import me.shrob.joeycustomenchanteditems.JoeyCustomEnchantedItems;
import me.shrob.joeycustomenchanteditems.items.CustomItem;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class MineralsGUI {
    CustomItem enchantedCoal = JoeyCustomEnchantedItems.customItems.get("enchantedCoal");
    CustomItem enchantedCoalBlock = JoeyCustomEnchantedItems.customItems.get("enchantedCoalBlock");
    CustomItem enchantedCopper = JoeyCustomEnchantedItems.customItems.get("enchantedCopper");
    CustomItem enchantedCopperBlock = JoeyCustomEnchantedItems.customItems.get("enchantedCopperBlock");
    CustomItem enchantedDiamond = JoeyCustomEnchantedItems.customItems.get("enchantedDiamond");
    CustomItem enchantedDiamondBlock = JoeyCustomEnchantedItems.customItems.get("enchantedDiamondBlock");
    CustomItem enchantedEmerald = JoeyCustomEnchantedItems.customItems.get("enchantedEmerald");
    CustomItem enchantedEmeraldBlock = JoeyCustomEnchantedItems.customItems.get("enchantedEmeraldBlock");
    CustomItem enchantedGold = JoeyCustomEnchantedItems.customItems.get("enchantedGold");
    CustomItem enchantedGoldBlock = JoeyCustomEnchantedItems.customItems.get("enchantedGoldBlock");
    CustomItem enchantedIron = JoeyCustomEnchantedItems.customItems.get("enchantedIron");
    CustomItem enchantedIronBlock = JoeyCustomEnchantedItems.customItems.get("enchantedIronBlock");
    CustomItem enchantedLapis = JoeyCustomEnchantedItems.customItems.get("enchantedLapis");
    CustomItem enchantedLapisBlock = JoeyCustomEnchantedItems.customItems.get("enchantedLapisBlock");
    CustomItem enchantedNetherite = JoeyCustomEnchantedItems.customItems.get("enchantedNetherite");
    CustomItem enchantedNetheriteBlock = JoeyCustomEnchantedItems.customItems.get("enchantedNetheriteBlock");
    CustomItem enchantedRedstone = JoeyCustomEnchantedItems.customItems.get("enchantedRedstone");
    CustomItem enchantedRedstoneBlock = JoeyCustomEnchantedItems.customItems.get("enchantedRedstoneBlock");

    public void createGui(Player player) {
        Inventory inv = Bukkit.createInventory(null, 27, "Minerals");




        inv.setItem(0, enchantedCoal.itemStack);
        inv.setItem(1, enchantedCoalBlock.itemStack);
        inv.setItem(2, enchantedCopper.itemStack);
        inv.setItem(3, enchantedCopperBlock.itemStack);
        inv.setItem(4, enchantedDiamond.itemStack);
        inv.setItem(5, enchantedDiamondBlock.itemStack);
        inv.setItem(6, enchantedEmerald.itemStack);
        inv.setItem(7, enchantedEmeraldBlock.itemStack);
        inv.setItem(8, enchantedGold.itemStack);
        inv.setItem(9, enchantedGoldBlock.itemStack);
        inv.setItem(10, enchantedIron.itemStack);
        inv.setItem(11, enchantedIronBlock.itemStack);
        inv.setItem(12, enchantedLapis.itemStack);
        inv.setItem(13, enchantedLapisBlock.itemStack);
        inv.setItem(14, enchantedNetherite.itemStack);
        inv.setItem(15, enchantedNetheriteBlock.itemStack);
        inv.setItem(16, enchantedRedstone.itemStack);
        inv.setItem(17, enchantedRedstoneBlock.itemStack);
        inv.setItem(18, JoeyCustomEnchantedItems.closeBarrier);
        inv.setItem(26, JoeyCustomEnchantedItems.backArrow);
        player.openInventory(inv);
    }
}
