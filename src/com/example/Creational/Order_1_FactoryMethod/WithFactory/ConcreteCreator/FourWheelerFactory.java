package com.example.Creational.Order_1_FactoryMethod.WithFactory.ConcreteCreator;

import com.example.Creational.Order_1_FactoryMethod.WithFactory.Creator.VehicleFactory;
import com.example.Creational.Order_1_FactoryMethod.WithFactory.ConcreteProduct.FourWheeler;
import com.example.Creational.Order_1_FactoryMethod.WithFactory.Product.Vehicle;

public class FourWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new FourWheeler();
    }
}
