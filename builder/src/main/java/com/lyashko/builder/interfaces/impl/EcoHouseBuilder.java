package com.lyashko.builder.interfaces.impl;

import com.lyashko.builder.interfaces.HouseBuilder;
import com.lyashko.builder.model.House;

public class EcoHouseBuilder implements HouseBuilder {
    private House house;

    public EcoHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Eco foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Eco structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Eco roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Eco interior");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
