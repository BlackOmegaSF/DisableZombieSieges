package com.kleinercode.fabric;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.fabric.api.event.EventFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DisableZombieSieges implements DedicatedServerModInitializer {

    public static final String MOD_ID = "disable-zombie-sieges";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeServer() {

        //TODO make custom gamerule for sieges

        LOGGER.info("Zombie sieges are disabled in this world!");

    }

}
