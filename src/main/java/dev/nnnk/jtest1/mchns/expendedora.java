package dev.nnnk.jtest1.mchns;

import dev.nnnk.jtest1.funcs.linterfaz;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;

public class expendedora implements Listener {
    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent e){
        Player player = e.getPlayer();
        Material ObjInHand = player.getInventory().getItemInMainHand().getType();
        Material ObjClkd = e.getClickedBlock().getType();
        boolean isHand = (e.getAction() == Action.RIGHT_CLICK_BLOCK && e.getHand() == EquipmentSlot.HAND);
        linterfaz guides = new linterfaz();

        if(isHand){
            if(ObjClkd == Material.BOOKSHELF){
                guides.createGui("eri nap",9);
                guides.openInventory(player);
                player.chat("Expendedora abierta.");
            }
        }
    }
}