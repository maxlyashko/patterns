package com.lyashko.builder.interfaces.impl;

import com.lyashko.builder.interfaces.HouseBuilder;
import com.lyashko.builder.model.ModernHouse;

public class ModernHouseBuilder implements HouseBuilder<ModernHouse> {
    private ModernHouse modernHouse;

    public ModernHouseBuilder() {
        this.modernHouse = new ModernHouse();
    }

    @Override
    public HouseBuilder<ModernHouse> buildFoundation() {
        modernHouse.setFoundation("Modern Foundation");
        return this;
    }

    @Override
    public HouseBuilder<ModernHouse> buildStructure() {
        modernHouse.setStructure("Modern Structure");
        return this;
    }

    @Override
    public HouseBuilder<ModernHouse> buildRoof() {
        modernHouse.setRoof("Modern Roof");
        return this;
    }

    @Override
    public HouseBuilder<ModernHouse> buildInterior() {
        modernHouse.setInterior("Modern Interior");
        return this;
    }

    @Override
    public ModernHouse getHouse() {
        return modernHouse;
    }
}
