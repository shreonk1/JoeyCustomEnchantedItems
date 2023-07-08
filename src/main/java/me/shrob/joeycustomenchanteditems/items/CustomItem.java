package me.shrob.joeycustomenchanteditems.items;

import com.destroystokyo.paper.event.player.PlayerLaunchProjectileEvent;
import me.shrob.joeycustomenchanteditems.JoeyCustomEnchantedItems;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockDropItemEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.CauldronLevelChangeEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.player.*;
import org.bukkit.inventory.ItemStack;

public abstract class CustomItem {

    String name;
    public ItemStack itemStack;

    public CustomItem(String name) {
        this.name = name;
        JoeyCustomEnchantedItems.customItems.put(name, this);
    }

    public void onBlockBreak(BlockBreakEvent event) {}

    public void onBlockBreakMonitor(BlockBreakEvent event) {}

    public void onInteract(PlayerInteractEvent event) {}

    public void onInteractNoCancel(PlayerInteractEvent event) {}

    public void onBlockPlace(BlockPlaceEvent event) {}

    public void onBlockPlaceHighest(BlockPlaceEvent event) {}

    public void onProjectileHit(ProjectileHitEvent event) {}

    public void onPlayerConsume(PlayerItemConsumeEvent event) {}

    public void onBucketFill(PlayerBucketFillEvent event) {}

    public void onLaunchProjectile(PlayerLaunchProjectileEvent event) {}

    public void onLaunchProjectileMonitor(PlayerLaunchProjectileEvent event) {}

    public void onLaunchProjectileLowest(PlayerLaunchProjectileEvent event) {}

    public void onPlayerBucketEmpty(PlayerBucketEmptyEvent event) {}

    public void onEntityDamage(EntityDamageEvent event) {}

    public void onEntityDamageByEntity(EntityDamageByEntityEvent event) {}

    public void onPlayerItemDamage(PlayerItemDamageEvent event) {}

    public void onCauldronBucketEmpty(CauldronLevelChangeEvent event) {}

    public void onInteractEntity(PlayerInteractEntityEvent event) {}

    public void onBlockBreakLowest(BlockBreakEvent event) {}

    public void onInventoryClick(InventoryClickEvent event) {}

    public void onFish(PlayerFishEvent event) {}

    public void onEntityDeath(EntityDeathEvent event) {}

    public void onBlockDropItem(BlockDropItemEvent event) {}

    public void onPickupXp(PlayerExpChangeEvent event) {}

    public void onCraftEvent(PrepareItemCraftEvent event) {}

    public ItemStack getItemStack() {
        return this.itemStack;
    }

    public String getName() {
        return this.name;
    }

    public abstract void onCraft(PrepareItemCraftEvent e);
}
