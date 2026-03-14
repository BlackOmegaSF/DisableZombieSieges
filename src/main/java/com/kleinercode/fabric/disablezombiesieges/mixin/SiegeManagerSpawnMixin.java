package com.kleinercode.fabric.disablezombiesieges.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static com.kleinercode.fabric.disablezombiesieges.DisableZombieSieges.ENABLE_ZOMBIE_SIEGES;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.ai.village.VillageSiege;

@Mixin(VillageSiege.class)
public class SiegeManagerSpawnMixin {

    // Makes spawn method always return 0

    @Inject(method = "tryToSetupSiege(Lnet/minecraft/server/level/ServerLevel;)Z", at = @At("HEAD"), cancellable = true)
    private void onSiegeSpawnCheck(ServerLevel world, CallbackInfoReturnable<Boolean> cir) {
        if (!world.getGameRules().get(ENABLE_ZOMBIE_SIEGES)) {
            cir.setReturnValue(false);
        }
    }
}
