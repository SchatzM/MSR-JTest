package dev.nnnk.jtest1.funcs;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.Inventory;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class linterfaz implements InventoryHolder, Listener {
    private Inventory inv;
    private String iName;

    public void createGui(final String name, final int size) {
        inv = Bukkit.createInventory(this, size, name);

        initializeItems();
    }

    @Override
    public Inventory getInventory() {
        return inv;
    }

    public void initializeItems() {
        inv.addItem(createGuiItem(Material.STICK, "Palo palito", "§cCUIDAO", "§bA veces se mete donde no le llaman"));
        inv.addItem(createGuiItem(Material.BROWN_MUSHROOM, "§bAyno", "§aJajá", "§bsí."));
    }

    protected ItemStack createGuiItem(final Material material, final String name, final String... lore) {
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();
        this.iName = name;

        meta.setDisplayName(name);
        meta.setLore(Arrays.asList(lore));

        item.setItemMeta(meta);

        return item;
    }

    public void openInventory(final HumanEntity ent) {
        ent.openInventory(inv);
    }

    @EventHandler
    public void onInventoryClick(final InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        ItemStack clicked = e.getCurrentItem();
        InventoryView inventory = e.getView();

        p.sendMessage("Uno: "+inventory.getTitle());
        p.sendMessage("Dos: "+iName);

        if(inventory.getTitle().equals(iName)) {

        }

        
    }
}