package com.GChr1s.DamageSpawn;

import org.bukkit.Location;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import java.util.*;
import java.util.stream.Collectors;

public class DamageSpawn implements Listener{

    private final List<EntityType> spawnableTypes = Arrays.stream(EntityType.values())
            .filter(type -> type.isSpawnable() && type.isAlive())
            .toList();

    private final Random random = new Random();

    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        if (!(event.getEntity() instanceof Player player)) return;
        Location spawnLocation = player.getLocation();

        EntityType randomType = spawnableTypes.get(random.nextInt(spawnableTypes.size()));
        player.getWorld().spawnEntity(spawnLocation, randomType);

        player.sendMessage(randomType.name() + "이 소환되었습니다!");
    }
}