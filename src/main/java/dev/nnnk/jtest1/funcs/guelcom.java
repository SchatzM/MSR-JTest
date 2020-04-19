package dev.nnnk.jtest1.funcs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;

// PlayerJoin event handler
public class guelcom implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player playerObj = e.getPlayer();
        String jelou = ChatColor.AQUA+"Güelcom "+ChatColor.GOLD+playerObj.getDisplayName();

        // for (Player player : Bukkit.getOnlinePlayers()) {
        //     player.sendMessage(jelou);
        // }
        e.setJoinMessage(jelou);
    }
}