package com.lyashko.builder.service;

import com.lyashko.builder.interfaces.HouseBuilder;
import com.lyashko.builder.interfaces.impl.EcoHouseBuilder;
import com.lyashko.builder.interfaces.impl.ModernHouseBuilder;
import com.lyashko.builder.interfaces.impl.TraditionalHouseBuilder;
import com.lyashko.builder.model.EcoHouse;
import com.lyashko.builder.model.ModernHouse;
import com.lyashko.builder.model.TraditionalHouse;

public class HouseDirectorService {
    public static HouseBuilder<ModernHouse, ModernHouseBuilder> buildModernHouse() {
        return new ModernHouseBuilder();
    }

    public static HouseBuilder<TraditionalHouse, TraditionalHouseBuilder> buildTraditionalHouse() {
        return new TraditionalHouseBuilder();
    }

    public static HouseBuilder<EcoHouse, EcoHouseBuilder> buildEcoHouse() {
        return new EcoHouseBuilder();
    }
}
