package dev.twme.antispawner.listeners;

import dev.twme.antispawner.utils.CleanUpSpawnerUtil;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.SpawnerSpawnEvent;

public class SpawnerSpawnEventListener implements Listener {
    @EventHandler
    public void onSpawnerSpawnEvent(SpawnerSpawnEvent event) {
        event.setCancelled(true);
        if (event.getSpawner() == null) return;
        CleanUpSpawnerUtil.clean(event.getSpawner());
    }

}
