package com.kleinercode.fabric.disablezombiesieges;

import net.fabricmc.api.DedicatedServerModInitializer;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleBuilder;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.gamerules.GameRule;
import net.minecraft.world.level.gamerules.GameRuleCategory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DisableZombieSieges implements DedicatedServerModInitializer {

    public static final String MOD_ID = "disable-zombie-sieges";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Identifier GAMERULE_IDENTIFIER = Identifier.fromNamespaceAndPath("minecraft", "enable_zombie_sieges");

    public static final GameRule<Boolean> ENABLE_ZOMBIE_SIEGES = GameRuleBuilder.forBoolean(true)
            .category(GameRuleCategory.MISC)
            .buildAndRegister(GAMERULE_IDENTIFIER);

    @Override
    public void onInitializeServer() {

        LOGGER.info("enable_zombie_sieges gamerule added!");

    }

}
