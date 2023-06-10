package com.lyashko.builder.model;

public class ModernHouse extends House {
    private String modernThing;

    @Override
    public String toString() {
        return super.toString() + "\n" + "Thing: " + modernThing;
    }

    public void setModernThing(String modernThing) {
        this.modernThing = modernThing;
    }
}
