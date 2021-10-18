package com.jab125.devcapes.mixin.client;

import com.jab125.devcapes.DevCapes;
import com.jab125.devcapes.util.CapesLoader;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractClientPlayerEntity.class)
public abstract class CapesMixin {
    @Shadow @Nullable protected abstract PlayerListEntry getPlayerListEntry();

    @Inject(method = "getCapeTexture", at = @At("RETURN"), cancellable = true)
    private void getCapeTexture_dev(CallbackInfoReturnable<Identifier> info) {
        if (CapesLoader.PLAYERS != null) {
            if (CapesLoader.PLAYERS.containsKey(this.getPlayerListEntry().getProfile().getId().toString())) {
                info.setReturnValue(new Identifier(DevCapes.MODID, "textures/cape/cape_" + CapesLoader.PLAYERS.get(this.getPlayerListEntry().getProfile().getId()) + ".png"));
            }
        }
    }
}
