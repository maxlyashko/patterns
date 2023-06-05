package com.lyashko.builder.service;

import com.lyashko.builder.interfaces.HouseBuilder;
import com.lyashko.builder.model.House;

public class HouseDirectorService {
    private HouseBuilder houseBuilder;

    public HouseDirectorService(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public void constructHouse() {
        houseBuilder.buildFoundation();
        houseBuilder.buildStructure();
        houseBuilder.buildRoof();
        houseBuilder.buildInterior();
    }

    public House getHouse() {
        return houseBuilder.getHouse();
    }
}
