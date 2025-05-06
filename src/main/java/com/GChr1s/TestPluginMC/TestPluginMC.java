package com.GChr1s.TestPluginMC;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import com.GChr1s.DamageSpawn.DamageSpawn;

public class TestPluginMC extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new DamageSpawn(), this);
        getLogger().info("Plugin is now on!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin is now off.");
    }
}