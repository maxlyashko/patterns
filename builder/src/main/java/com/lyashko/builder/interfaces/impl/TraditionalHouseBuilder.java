package com.lyashko.builder.interfaces.impl;

import com.lyashko.builder.interfaces.HouseBuilder;
import com.lyashko.builder.model.TraditionalHouse;

public class TraditionalHouseBuilder implements HouseBuilder<TraditionalHouse, TraditionalHouseBuilder> {
    private TraditionalHouse traditionalHouse;

    public TraditionalHouseBuilder() {
        this.traditionalHouse = new TraditionalHouse();
    }

    public TraditionalHouseBuilder buildTraditionalThing() {
        traditionalHouse.setTraditionalThing("Traditional Thing");
        return this;
    }

    @Override
    public TraditionalHouseBuilder buildFoundation() {
        traditionalHouse.setFoundation("Traditional Foundation");
        return this;
    }

    @Override
    public TraditionalHouseBuilder buildStructure() {
        traditionalHouse.setStructure("Traditional Structure");
        return this;
    }

    @Override
    public TraditionalHouseBuilder buildRoof() {
        traditionalHouse.setRoof("Traditional Roof");
        return this;
    }

    @Override
    public TraditionalHouseBuilder buildInterior() {
        traditionalHouse.setInterior("Traditional Interior");
        return this;
    }

    @Override
    public TraditionalHouse getHouse() {
        return traditionalHouse;
    }
}
