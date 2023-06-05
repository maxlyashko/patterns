package com.lyashko.factory;

import com.lyashko.factory.model.Vehicle;
import com.lyashko.factory.service.VehicleFactoryService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VehicleFactoryService factory = new VehicleFactoryService();
        Scanner scanner = new Scanner(System.in);
        Vehicle vehicle = factory.createVehicle(scanner);
        vehicle.drive();
    }
}
