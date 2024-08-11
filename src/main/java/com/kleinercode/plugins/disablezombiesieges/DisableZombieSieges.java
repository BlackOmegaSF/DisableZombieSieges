package com.kleinercode.plugins.disablezombiesieges;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

public class DisableZombieSieges extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void spawnFromSiege(CreatureSpawnEvent event) {
        if (event.getSpawnReason() == CreatureSpawnEvent.SpawnReason.VILLAGE_INVASION) { //If mob is spawned due to invasion
            event.setCancelled(true);
            //Log cancellation event to server console
            getLogger().log(Level.INFO, "Prevented invasion entity from spawning");
        }
    }

}
