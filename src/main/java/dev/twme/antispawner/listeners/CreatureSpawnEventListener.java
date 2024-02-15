package dev.twme.antispawner.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class CreatureSpawnEventListener implements Listener {
    @EventHandler
    public void onCreatureSpawnEvent(CreatureSpawnEvent event) {
        event.setCancelled(true);
    }
}
