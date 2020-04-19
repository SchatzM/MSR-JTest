package dev.nnnk.jtest1.funcs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;

// PlayerQuit event handler
public class bai implements Listener {
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        Player playerObj = e.getPlayer();
        String kbai = ChatColor.AQUA+"Bai "+ChatColor.GOLD+playerObj.getDisplayName();

        // for (Player player : Bukkit.getOnlinePlayers()) {
        //     player.sendMessage(kbai);
        // }
        e.setQuitMessage(kbai);
    }
}