package com.lyashko.builder.model;

public class TraditionalHouse extends House {
    private String traditionalThing;

    @Override
    public String toString() {
        return super.toString() + "\n" + "Thing: " + traditionalThing;

    }

    public void setTraditionalThing(String traditionalThing) {
        this.traditionalThing = traditionalThing;
    }
}
