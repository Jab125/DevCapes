package com.jab125.devcapes.util;

import net.minecraft.util.Identifier;

public class ModGroup {
    private String modid;
    private String author;
    private Identifier capeLoc;

    public ModGroup(String author, String modid, Identifier capeLoc) {
        this.modid = modid;
        this.author = author;
        this.capeLoc = capeLoc;
    }


    public String getAuthor() {
        return author;
    }

    public String getModid() {
        return modid;
    }

    public Identifier getCapeLoc() {
        return capeLoc;
    }
}
