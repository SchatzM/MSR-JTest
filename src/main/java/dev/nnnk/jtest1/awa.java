package dev.nnnk.jtest1;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.event.Listener;
import org.bukkit.Bukkit;

import dev.nnnk.jtest1.cmd.*;
import dev.nnnk.jtest1.funcs.*;

// Main class, duh.
public class awa extends JavaPlugin implements Listener {

    @Override
    public void onLoad() {
        // Log in console that we've been loaded by server.
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "¡Awa LOADED!");
    }

    @Override
    public void onEnable() {
        regEvents();

        getCommand("awa").setExecutor(new awita(this));
        getCommand("papawa").setExecutor(new awita(this));
        getCommand("dime").setExecutor(new awita(this));
        getCommand("ayno").setExecutor(new awita(this));

        // Log in console that the plugin is now enabled.
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "¡Awa ENABLED!");
    }

    @Override
    public void onDisable() {
        // Log in server console a good-bye!
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "¡Awa PAPAWA!");
    }

    // This register Event listeners
    public void regEvents() {
        PluginManager pm = Bukkit.getPluginManager();

        pm.registerEvents(new guelcom(), this);
        pm.registerEvents(new bai(), this);
    }
}