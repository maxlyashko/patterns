package com.lyashko.builder.interfaces.impl;

import com.lyashko.builder.interfaces.HouseBuilder;
import com.lyashko.builder.model.House;

public class TraditionalHouseBuilder implements HouseBuilder {
    private House house;

    public TraditionalHouseBuilder( ) {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Traditional foundation");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Traditional structure");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Traditional roof");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Traditional interior");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
