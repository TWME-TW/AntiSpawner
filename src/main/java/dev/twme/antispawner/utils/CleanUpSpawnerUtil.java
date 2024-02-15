package dev.twme.antispawner.utils;

import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.block.TileState;

public class CleanUpSpawnerUtil {
    public static void clean(Block block) {
        BlockState blockState = block.getState();

        TileState tileState = (TileState) blockState;
        CreatureSpawner creatureSpawner = (CreatureSpawner) tileState;
        clean(creatureSpawner);
    }

    public static void clean(CreatureSpawner spawner) {

        spawner.setSpawnedType(null);
        spawner.setDelay(800);
        spawner.setMaxSpawnDelay(800);
        spawner.setMinSpawnDelay(200);
        spawner.setSpawnCount(4);
        spawner.setMaxNearbyEntities(6);
        spawner.setRequiredPlayerRange(10);
        spawner.setSpawnRange(6);
        spawner.update();
    }
}
