package com.example.Creational.Order_1_FactoryMethod.WithFactory;

import com.example.Creational.Order_1_FactoryMethod.WithFactory.Creator.VehicleFactory;
import com.example.Creational.Order_1_FactoryMethod.WithFactory.Product.Vehicle;

public class Client {
    private Vehicle vehicle;

    public Client(VehicleFactory factory) {
        vehicle = factory.createVehicle();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
