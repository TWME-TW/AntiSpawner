package dev.twme.antispawner;

import dev.twme.antispawner.listeners.BlockPlaceEventListener;
import dev.twme.antispawner.listeners.SpawnerSpawnEventListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiSpawner extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        registerListeners();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void registerListeners() {
        Bukkit.getServer().getPluginManager().registerEvents(new SpawnerSpawnEventListener(), this);
        Bukkit.getServer().getPluginManager().registerEvents(new BlockPlaceEventListener(), this);

    }
}
