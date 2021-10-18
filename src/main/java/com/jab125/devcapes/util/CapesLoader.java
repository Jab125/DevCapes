package com.jab125.devcapes.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jab125.devcapes.DevCapes;
import net.minecraft.util.Util;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class CapesLoader {
    public static Map PLAYERS;

    public static void load() {
        Util.getMainWorkerExecutor().execute(() -> {
            long startLoad = System.currentTimeMillis();
            Gson gson = new GsonBuilder().create();
            DevCapes.LOGGER.info("Loading capes data...");
            try {
                PLAYERS = gson.fromJson(
                        IOUtils.toString(
                                new URL(""),
                                StandardCharsets.UTF_8
                        ),
                        Map.class
                );
            } catch (IOException e) {
                DevCapes.LOGGER.warn("Failed to load capes.", e);
            }
            DevCapes.LOGGER.info("Loaded capes for {} players. (Took {}ms)", PLAYERS.size(), System.currentTimeMillis()-startLoad);
        });
    }
}