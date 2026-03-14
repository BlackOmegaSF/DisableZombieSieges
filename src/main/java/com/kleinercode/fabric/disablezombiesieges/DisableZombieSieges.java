package com.kleinercode.fabric.disablezombiesieges;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder;
import net.minecraft.util.Identifier;
import net.minecraft.world.rule.GameRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DisableZombieSieges implements DedicatedServerModInitializer {

    public static final String MOD_ID = "disable-zombie-sieges";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final GameRule<Boolean> ENABLE_ZOMBIE_SIEGES = GameRuleBuilder.forBoolean(true)
            .buildAndRegister(Identifier.of("kleinercode", "enableZombieSieges"));

    @Override
    public void onInitializeServer() {

        LOGGER.info("enableZombieSieges gamerule added!");

    }

}
