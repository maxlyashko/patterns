package com.lyashko.builder.interfaces.impl;

import com.lyashko.builder.interfaces.HouseBuilder;
import com.lyashko.builder.model.EcoHouse;

public class EcoHouseBuilder implements HouseBuilder<EcoHouse> {
    private EcoHouse ecoHouse;

    public EcoHouseBuilder() {
        this.ecoHouse = new EcoHouse();
    }

    @Override
    public HouseBuilder<EcoHouse> buildFoundation() {
        ecoHouse.setFoundation("Eco Foundation");
        return this;
    }

    @Override
    public HouseBuilder<EcoHouse> buildStructure() {
        ecoHouse.setStructure("Eco Structure");
        return this;
    }

    @Override
    public HouseBuilder<EcoHouse> buildRoof() {
        ecoHouse.setRoof("Eco Roof");
        return this;
    }

    @Override
    public HouseBuilder<EcoHouse> buildInterior() {
        ecoHouse.setInterior("Eco Interior");
        return this;
    }

    @Override
    public EcoHouse getHouse() {
        return ecoHouse;
    }
}
