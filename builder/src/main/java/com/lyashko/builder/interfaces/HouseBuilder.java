package com.lyashko.builder.interfaces;

import com.lyashko.builder.model.House;

public interface HouseBuilder <T extends House, B extends HouseBuilder<T, B>> {
    B buildFoundation();

    B buildStructure();

    B buildRoof();

    B buildInterior();

    T getHouse();
}
