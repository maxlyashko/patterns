package com.lyashko.builder.interfaces;

import com.lyashko.builder.model.House;

public interface HouseBuilder <T extends House> {
    HouseBuilder<T> buildFoundation();

    HouseBuilder<T> buildStructure();

    HouseBuilder<T> buildRoof();

    HouseBuilder<T> buildInterior();

    T getHouse();
}
