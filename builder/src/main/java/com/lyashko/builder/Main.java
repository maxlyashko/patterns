package com.lyashko.builder;

import com.lyashko.builder.model.EcoHouse;
import com.lyashko.builder.model.ModernHouse;
import com.lyashko.builder.model.TraditionalHouse;
import com.lyashko.builder.service.HouseDirectorService;

public class Main {
    public static void main(String[] args) {
        ModernHouse modernHouse = HouseDirectorService.buildModernHouse()
                .buildFoundation()
                .buildStructure()
                .buildRoof()
                .buildInterior()
                .buildModernThing()
                .getHouse();
        System.out.println("Modern House:");
        System.out.println(modernHouse);

        TraditionalHouse traditionalHouse = HouseDirectorService.buildTraditionalHouse()
                .buildFoundation()
                .buildStructure()
                .buildRoof()
                .buildInterior()
                .buildTraditionalThing()
                .getHouse();
        System.out.println("\nTraditional House:");
        System.out.println(traditionalHouse);

        EcoHouse ecoHouse = HouseDirectorService.buildEcoHouse()
                .buildFoundation()
                .buildStructure()
                .buildRoof()
                .buildInterior()
                .buildEcoThing()
                .getHouse();
        System.out.println("\nEco House:");
        System.out.println(ecoHouse);
    }
}
