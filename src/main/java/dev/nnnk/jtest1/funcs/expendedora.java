package dev.nnnk.jtest1.funcs;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class expendedora implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e){
            Player player = e.getPlayer();
            Material mat = player.getInventory().getItemInMainHand().getType();
            
            if(e.getAction() == Action.RIGHT_CLICK_BLOCK){
                    if(mat == Material.STICK){
                            player.chat("L'he dao con er palo");
                    }
            }
    }
}