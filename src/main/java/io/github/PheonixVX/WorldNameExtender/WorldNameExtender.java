package io.github.PheonixVX.WorldNameExtender;

import net.fabricmc.api.ModInitializer;

import java.util.logging.Logger;

public class WorldNameExtender implements ModInitializer {

	public static final String MOD_ID = "worldnameextender";
	public static final String VERSION = "0.0.1-SNAPSHOT";
	public static final Logger LOGGER = Logger.getLogger(MOD_ID);

	@Override
	public void onInitialize () {
		LOGGER.info("WorldNameExtender " + VERSION + " was loaded successfully!");
	}
}
