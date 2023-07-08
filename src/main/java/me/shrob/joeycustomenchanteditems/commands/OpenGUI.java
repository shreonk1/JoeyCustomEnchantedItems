package me.shrob.joeycustomenchanteditems.commands;

import me.shrob.joeycustomenchanteditems.Utils;
import me.shrob.joeycustomenchanteditems.guis.MainGUI;
import me.shrob.joeycustomenchanteditems.guis.MineralsGUI;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class OpenGUI implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String s, @NotNull String[] args) {
        Player player = (Player) sender;

        player.sendMessage(Utils.addColour("&bOpened the &6recipes &bmenu."));
        MainGUI mainGUI = new MainGUI();
        mainGUI.createGui(player);


        return false;
    }
}
