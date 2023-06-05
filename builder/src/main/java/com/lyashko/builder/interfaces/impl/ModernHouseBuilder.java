package com.lyashko.builder.interfaces.impl;

import com.lyashko.builder.interfaces.HouseBuilder;
import com.lyashko.builder.model.House;

public class ModernHouseBuilder implements HouseBuilder {
    private House house;

    public ModernHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Modern foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Modern structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Modern roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Modern interior");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
