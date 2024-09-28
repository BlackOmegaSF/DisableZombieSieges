package com.kleinercode.fabric.mixin;

import net.minecraft.server.world.ServerWorld;
import net.minecraft.village.ZombieSiegeManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ZombieSiegeManager.class)
public class SiegeManagerSpawnMixin {

    // Makes spawn method always return 0

    @Inject(method = "spawn(Lnet/minecraft/server/world/ServerWorld;ZZ)I", at = @At("HEAD"), cancellable = true)
    private void onSiegeSpawnCheck(final ServerWorld world, final boolean spawnMonsters, final boolean spawnAnimals, final CallbackInfoReturnable<Integer> info) {
        info.setReturnValue(0);
    }
}
