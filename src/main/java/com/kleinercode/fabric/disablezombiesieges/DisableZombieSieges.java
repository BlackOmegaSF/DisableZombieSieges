package com.kleinercode.fabric.disablezombiesieges;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleRegistry;
import net.minecraft.world.GameRules;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DisableZombieSieges implements DedicatedServerModInitializer {

    public static final String MOD_ID = "disable-zombie-sieges";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final GameRules.Key<GameRules.BooleanRule> ENABLE_ZOMBIE_SIEGES =
            GameRuleRegistry.register("enableZombieSieges", GameRules.Category.MOBS, GameRuleFactory.createBooleanRule(true));

    @Override
    public void onInitializeServer() {

        LOGGER.info("enableZombieSieges gamerule added!");

    }

}
