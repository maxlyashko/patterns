package com.lyashko.builder;

import com.lyashko.builder.interfaces.HouseBuilder;
import com.lyashko.builder.interfaces.impl.EcoHouseBuilder;
import com.lyashko.builder.interfaces.impl.ModernHouseBuilder;
import com.lyashko.builder.interfaces.impl.TraditionalHouseBuilder;
import com.lyashko.builder.model.House;
import com.lyashko.builder.service.HouseDirectorService;

public class Main {
    public static void main(String[] args) {
        HouseBuilder modernHouseBuilder = new ModernHouseBuilder();
        HouseDirectorService modernHouseDirector = new HouseDirectorService(modernHouseBuilder);
        modernHouseDirector.constructHouse();
        House modernHouse = modernHouseDirector.getHouse();
        System.out.println("Modern House:");
        System.out.println(modernHouse);

        HouseBuilder traditionalHouseBuilder = new TraditionalHouseBuilder();
        HouseDirectorService traditionalHouseDirector = new HouseDirectorService(traditionalHouseBuilder);
        traditionalHouseDirector.constructHouse();
        House traditionalHouse = traditionalHouseDirector.getHouse();
        System.out.println("\nTraditional House:");
        System.out.println(traditionalHouse);

        HouseBuilder ecoHouseBuilder = new EcoHouseBuilder();
        HouseDirectorService ecoHouseDirector = new HouseDirectorService(ecoHouseBuilder);
        ecoHouseDirector.constructHouse();
        House ecoHouse = ecoHouseDirector.getHouse();
        System.out.println("\nEco House:");
        System.out.println(ecoHouse);
    }
}
