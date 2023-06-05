package com.lyashko.builder.interfaces;

import com.lyashko.builder.model.House;

public interface HouseBuilder {
    void buildFoundation();

    void buildStructure();

    void buildRoof();

    void buildInterior();

    House getHouse();
}
