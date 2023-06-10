package com.lyashko.builder.model;

public class EcoHouse extends House {
    private String ecoThing;

    @Override
    public String toString() {
        return super.toString() + "\n" + "Thing: " + ecoThing;
    }

    public void setEcoThing(String ecoThing) {
        this.ecoThing = ecoThing;
    }
}
