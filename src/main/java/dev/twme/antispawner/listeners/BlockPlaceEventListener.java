package dev.twme.antispawner.listeners;

import dev.twme.antispawner.utils.CleanUpSpawnerUtil;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;


public class BlockPlaceEventListener implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onBlockPlaceEvent(BlockPlaceEvent event) {

        if (event.getBlock().getType() == Material.SPAWNER) {
            // Block block = event.getBlock().getLocation().getBlock();
            // block.setType(Material.SPAWNER);
            CleanUpSpawnerUtil.clean(event.getBlock());
        }
    }
}
