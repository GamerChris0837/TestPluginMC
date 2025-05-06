package com.GChr1s.DamageSpawn;

import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import java.util.Random;

public class DamageSpawn implements Listener{
    private final EntityType[] spawnableTypes = {
        EntityType.ZOMBIE,
        EntityType.SKELETON,
    };

    private final Random random = new Random();

    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        if (!(event.getEntity() instanceof Player player)) return;
        Location spawnLocation = player.getLocation();

        EntityType randomType = spawnableTypes[random.nextInt(spawnableTypes.length)];
        player.getWorld().spawnEntity(spawnLocation, randomType);

        player.sendMessage(randomType.name() + "이 소환되었습니다!");
    }
}