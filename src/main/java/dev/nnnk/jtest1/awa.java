package dev.nnnk.jtest1;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.Bukkit;

import dev.nnnk.jtest1.cmd.*;

public class awa extends JavaPlugin implements Listener{
    @Override
    public void onLoad() {
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "¡Awa tú LOADED!");
    }
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "¡Awa tú!");

        getCommand("awa").setExecutor(new awita(this));
        getCommand("papawa").setExecutor(new awita(this));
        getCommand("dime").setExecutor(new awita(this));
        getCommand("ayno").setExecutor(new awita(this));

    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "¡Papawa tú!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player playerObj = e.getPlayer();

        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage(ChatColor.AQUA+"Güelcom "+ChatColor.GOLD+playerObj.getDisplayName());
        }
    }
}