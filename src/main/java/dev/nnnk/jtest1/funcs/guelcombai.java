package dev.nnnk.jtest1.funcs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

// PlayerJoin event handler
public class guelcombai implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player playerObj = e.getPlayer();
        String jelou = ChatColor.AQUA+"Güelcom "+ChatColor.GOLD+playerObj.getDisplayName();

        e.setJoinMessage(jelou);
    }
    
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent e) {
        Player playerObj = e.getPlayer();
        String kbai = ChatColor.AQUA+"Bai "+ChatColor.GOLD+playerObj.getDisplayName();

        e.setQuitMessage(kbai);
    }
}