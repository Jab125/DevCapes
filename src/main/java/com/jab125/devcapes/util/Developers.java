package com.jab125.devcapes.util;

import com.jab125.devcapes.DevCapes;
import com.terraformersmc.modmenu.util.mod.fabric.FabricMod;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.metadata.Person;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.Identifier;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@SuppressWarnings("rawtypes")
public class Developers {
    private static Collection<ModGroup> devList = new ArrayList<>();


    public static String registerCapes(String modid, String author, Identifier capeLoc) {
        devList.add(new ModGroup(author, modid, capeLoc));
        return "";
    }

    public static Collection<ModGroup> getDevList() {
        return devList;
    }
}
