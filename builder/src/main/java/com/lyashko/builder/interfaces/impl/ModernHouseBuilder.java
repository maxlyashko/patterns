package com.lyashko.builder.interfaces.impl;

import com.lyashko.builder.interfaces.HouseBuilder;
import com.lyashko.builder.model.ModernHouse;

public class ModernHouseBuilder implements HouseBuilder<ModernHouse, ModernHouseBuilder> {
    private ModernHouse modernHouse;

    public ModernHouseBuilder() {
        this.modernHouse = new ModernHouse();
    }

    public ModernHouseBuilder buildModernThing() {
        modernHouse.setModernThing("Modern Thing");
        return this;
    }

    @Override
    public ModernHouseBuilder buildFoundation() {
        modernHouse.setFoundation("Modern Foundation");
        return this;
    }

    @Override
    public ModernHouseBuilder buildStructure() {
        modernHouse.setStructure("Modern Structure");
        return this;
    }

    @Override
    public ModernHouseBuilder buildRoof() {
        modernHouse.setRoof("Modern Roof");
        return this;
    }

    @Override
    public ModernHouseBuilder buildInterior() {
        modernHouse.setInterior("Modern Interior");
        return this;
    }

    @Override
    public ModernHouse getHouse() {
        return modernHouse;
    }
}
