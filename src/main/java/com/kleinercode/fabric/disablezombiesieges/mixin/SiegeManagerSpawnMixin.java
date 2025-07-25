package com.kleinercode.fabric.disablezombiesieges.mixin;

import net.minecraft.server.world.ServerWorld;
import net.minecraft.village.ZombieSiegeManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static com.kleinercode.fabric.disablezombiesieges.DisableZombieSieges.ENABLE_ZOMBIE_SIEGES;

@Mixin(ZombieSiegeManager.class)
public class SiegeManagerSpawnMixin {

    // Makes spawn method always return 0

    @Inject(method = "spawn(Lnet/minecraft/server/world/ServerWorld;)Z", at = @At("HEAD"), cancellable = true)
    private void onSiegeSpawnCheck(ServerWorld world, CallbackInfoReturnable<Boolean> cir) {
        if (!world.getGameRules().getBoolean(ENABLE_ZOMBIE_SIEGES)) {
            cir.setReturnValue(false);
        }
    }
}
