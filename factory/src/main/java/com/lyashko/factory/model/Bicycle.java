package com.lyashko.factory.model;

public class Bicycle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Riding a bicycle");
    }
}
