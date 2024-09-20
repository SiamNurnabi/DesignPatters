package com.example.Creational.Order_1_FactoryMethod.WithFactory.Creator;


import com.example.Creational.Order_1_FactoryMethod.WithFactory.Product.Vehicle;

// This is the creator
public interface VehicleFactory {
    Vehicle createVehicle();
}
