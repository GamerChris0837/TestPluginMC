package com.GChr1s.TestPluginMC;

import org.bukkit.plugin.java.JavaPlugin;

public class TestPluginMC extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Plugin is now on da!");
    }

    @Override
    public void onDisable() {
        getLogger().info("Plugin is now off da.");
    }
}