package com.lyashko.factory.service;

import com.lyashko.factory.model.Bicycle;
import com.lyashko.factory.model.Car;
import com.lyashko.factory.model.Motorcycle;
import com.lyashko.factory.model.Vehicle;

import java.util.Scanner;

public class VehicleFactoryService {
    public Vehicle createVehicle(Scanner scanner) {
        Vehicle vehicle = null;
        boolean setType = false;
        while (!setType) {
            System.out.print("Enter the type of vehicle to create: ");
            switch (scanner.nextLine().replaceAll("\\s", "").toUpperCase()) {
                case "CAR" -> {
                    vehicle = new Car();
                    System.out.println("Car created");
                    setType = true;
                }
                case "BICYCLE" -> {
                    vehicle = new Bicycle();
                    System.out.println("Bicycle created");
                    setType = true;
                }
                case "MOTORCYCLE" -> {
                    vehicle = new Motorcycle();
                    System.out.println("Motorcycle created");
                    setType = true;
                }
                default -> System.out.println("wrong input");
            }
        }
        return vehicle;
    }
}
