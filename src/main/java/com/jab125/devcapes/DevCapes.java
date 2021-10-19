package com.jab125.devcapes;

import com.jab125.devcapes.util.Developers;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DevCapes implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MODID = "devcapes";
	public static final Logger LOGGER = LogManager.getLogger("modid");

	@Override
	public void onInitialize() {

		Developers.registerCapes(MODID, "Jab125", new Identifier(MODID, "/cape/" + MODID + "/cape_australia.png"));
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
	}
}
