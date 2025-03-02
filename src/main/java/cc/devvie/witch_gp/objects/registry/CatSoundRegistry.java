package cc.devvie.witch_gp.objects.registry;

import net.minecraft.init.SoundEvents;
import net.minecraft.util.SoundEvent;

import java.util.ArrayList;

public class CatSoundRegistry {
    public ArrayList<SoundEvent> list = new ArrayList<>();

    public CatSoundRegistry() {
        list.add(SoundEvents.ENTITY_CAT_PURR);
        list.add(SoundEvents.ENTITY_CAT_PURREOW);
    }
}
