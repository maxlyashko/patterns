package com.lyashko.builder.interfaces.impl;

import com.lyashko.builder.interfaces.HouseBuilder;
import com.lyashko.builder.model.TraditionalHouse;

public class TraditionalHouseBuilder implements HouseBuilder<TraditionalHouse> {
    private TraditionalHouse traditionalHouse;

    public TraditionalHouseBuilder() {
        this.traditionalHouse = new TraditionalHouse();
    }

    @Override
    public HouseBuilder<TraditionalHouse> buildFoundation() {
        traditionalHouse.setFoundation("Traditional Foundation");
        return this;
    }

    @Override
    public HouseBuilder<TraditionalHouse> buildStructure() {
        traditionalHouse.setStructure("Traditional Structure");
        return this;
    }

    @Override
    public HouseBuilder<TraditionalHouse> buildRoof() {
        traditionalHouse.setRoof("Traditional Roof");
        return this;
    }

    @Override
    public HouseBuilder<TraditionalHouse> buildInterior() {
        traditionalHouse.setInterior("Traditional Interior");
        return this;
    }

    @Override
    public TraditionalHouse getHouse() {
        return traditionalHouse;
    }
}
