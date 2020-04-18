package dev.nnnk.jtest1.funcs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;

public class bai implements Listener {
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        Player playerObj = e.getPlayer();

        for (Player player : Bukkit.getOnlinePlayers()) {
            player.sendMessage(ChatColor.AQUA+"Bai "+ChatColor.GOLD+playerObj.getDisplayName());
        }
    }
}