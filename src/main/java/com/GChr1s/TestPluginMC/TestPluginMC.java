package com.GChr1s.TestPluginMC;

import org.bukkit.plugin.java.JavaPlugin;

public class TestPluginMC extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("플러그인 활성화됨!");
    }

    @Override
    public void onDisable() {
        getLogger().info("플러그인 비활성화됨.");
    }
}