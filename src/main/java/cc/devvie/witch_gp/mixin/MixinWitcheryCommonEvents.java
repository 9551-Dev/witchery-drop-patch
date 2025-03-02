package cc.devvie.witch_gp.mixin;

import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.msrandom.witchery.common.CommonEvents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CommonEvents.class)
public class MixinWitcheryCommonEvents {
    @Inject(
            method="onPlayerDrops",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraftforge/event/entity/player/PlayerDropsEvent;getDrops()Ljava/util/List;",
                    ordinal = 0),
            remap = false,
            cancellable = true
    )
    private static void onPlayerDrops(PlayerDropsEvent event, CallbackInfo ci) {
        ci.cancel();
    }
}