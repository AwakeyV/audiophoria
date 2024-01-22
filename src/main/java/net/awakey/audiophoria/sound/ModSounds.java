package net.awakey.audiophoria.sound;

import net.awakey.audiophoria.Audiophoria;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent VIOLENT = registerSoundEvent("violent");
    public static final SoundEvent DIFFERENCES = registerSoundEvent("differences");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Audiophoria.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }
    public static void registerSounds() {
        Audiophoria.LOGGER.info("Registering sounds for " + Audiophoria.MOD_ID);
    }
}
