package com.chromanyan.architectbypass.mixin;

import com.aizistral.enigmaticlegacy.handlers.SuperpositionHandler;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = SuperpositionHandler.class, remap = false)
public class MixinArchitectFavorsAll {
    @Inject(method = "isTheBlessedOne", at = @At("HEAD"), cancellable = true)
    private static void overrideBlessedStatus(Player player, CallbackInfoReturnable<Boolean> cir) {
        // sorry Aizistral, but I'm not treating you like a god just to use a minecraft item.
        cir.setReturnValue(true);
    }
}
