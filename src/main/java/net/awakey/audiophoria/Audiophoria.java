package net.awakey.audiophoria;

import net.awakey.audiophoria.item.ModItemGroups;
import net.awakey.audiophoria.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Audiophoria implements ModInitializer {

	public static final String MOD_ID = "audiophoria";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModSounds.registerSounds();
		ModItemGroups.registerItemGroups();

		LOGGER.info("Hello Fabric world!");
	}
}