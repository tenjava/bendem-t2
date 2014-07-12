package be.bendem.bukkit.tenjava.handlers;

import be.bendem.bukkit.tenjava.TenJava;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryInteractEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.FurnaceInventory;
import org.bukkit.inventory.PlayerInventory;

/**
 * @author bendem
 */
public class FurnaceListener extends BaseListener {

    private final TenJava plugin;

    public FurnaceListener(TenJava plugin) {
        super(plugin);
        this.plugin = plugin;
    }

    @EventHandler
    public void onPutStuffInFurnace(InventoryClickEvent e) {
        if(!(e.getInventory() instanceof FurnaceInventory)) {
            return;
        }

        //e.
    }

}
