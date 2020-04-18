package dev.nnnk.jtest1.funcs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;

public class guelcom implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player playerObj = e.getPlayer();

        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage(ChatColor.AQUA+"Güelcom "+ChatColor.GOLD+playerObj.getDisplayName());
        }
    }
}