package dev.nnnk.jtest1;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import dev.nnnk.jtest1.cmd.*;

public class awa extends JavaPlugin {
    @Override
    public void onLoad() {
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "¡Awa tú LOADED!");
    }
    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "¡Awa tú!");

        getCommand("awa").setExecutor(new awita(this));
        getCommand("papawa").setExecutor(new awita(this));
        getCommand("dime").setExecutor(new awita(this));

    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "¡Papawa tú!");
    }
}