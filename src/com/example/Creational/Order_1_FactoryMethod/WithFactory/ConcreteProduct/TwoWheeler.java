package com.example.Creational.Order_1_FactoryMethod.WithFactory.ConcreteProduct;

import com.example.Creational.Order_1_FactoryMethod.WithFactory.Product.Vehicle;

public class TwoWheeler extends Vehicle {
    @Override
    public void printVehicle() {
        System.out.println("This is a Two Wheeler");
    }
}
