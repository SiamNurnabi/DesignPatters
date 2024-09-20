package com.example.Creational.Order_1_FactoryMethod.WithFactory.ConcreteProduct;

import com.example.Creational.Order_1_FactoryMethod.WithFactory.Product.Vehicle;

public class FourWheeler extends Vehicle {
    @Override
    public void printVehicle() {
        System.out.println("This is a Four Wheeler");
    }
}
