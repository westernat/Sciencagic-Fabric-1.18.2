package org.mesdag.scma.mixin.client;

import net.minecraft.client.gui.screen.TitleScreen;
import org.mesdag.scma.SCMA;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@org.spongepowered.asm.mixin.Mixin(TitleScreen.class)
public class TitleScreenMixin {
    @Inject(at = @At("HEAD"), method = "init()V")
    private void init(CallbackInfo info) {
        SCMA.LOGGER.info("This line is printed by an example mod mixin!");
    }
}
