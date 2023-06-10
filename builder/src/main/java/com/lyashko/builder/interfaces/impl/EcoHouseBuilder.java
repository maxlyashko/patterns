package com.lyashko.builder.interfaces.impl;

import com.lyashko.builder.interfaces.HouseBuilder;
import com.lyashko.builder.model.EcoHouse;

public class EcoHouseBuilder implements HouseBuilder< EcoHouse, EcoHouseBuilder> {
    private EcoHouse ecoHouse;

    public EcoHouseBuilder() {
        this.ecoHouse = new EcoHouse();
    }

    public EcoHouseBuilder buildEcoThing() {
        ecoHouse.setEcoThing("Eco Thing");
        return this;
    }

    @Override
    public EcoHouseBuilder buildFoundation() {
        ecoHouse.setFoundation("Eco Foundation");
        return this;
    }

    @Override
    public EcoHouseBuilder buildStructure() {
        ecoHouse.setStructure("Eco Structure");
        return this;
    }

    @Override
    public EcoHouseBuilder buildRoof() {
        ecoHouse.setRoof("Eco Roof");
        return this;
    }

    @Override
    public EcoHouseBuilder buildInterior() {
        ecoHouse.setInterior("Eco Interior");
        return this;
    }

    @Override
    public EcoHouse getHouse() {
        return ecoHouse;
    }
}
