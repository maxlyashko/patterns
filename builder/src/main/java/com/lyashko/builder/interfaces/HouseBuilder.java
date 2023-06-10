package com.lyashko.builder.interfaces;

import com.lyashko.builder.model.House;

public interface HouseBuilder <H extends House> {
    HouseBuilder<H> buildFoundation();

    HouseBuilder<H> buildStructure();

    HouseBuilder<H> buildRoof();

    HouseBuilder<H> buildInterior();

    H getHouse();
}
