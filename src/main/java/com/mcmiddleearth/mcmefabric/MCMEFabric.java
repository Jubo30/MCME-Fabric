package com.mcmiddleearth.mcmefabric;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class MCMEFabric implements ModInitializer{
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	private static String ModID = "mcmefabric";
	public static final Logger LOGGER = LoggerFactory.getLogger(ModID);

	@Override
	public void onInitialize() {
		//PortingLibObjLoader.loadModel(null,null);
		LOGGER.info("Hello Fabric world!");
	}

	public static String getModID(){return ModID;}
}
