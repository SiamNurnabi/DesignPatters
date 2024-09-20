package com.example.Creational.Order_1_FactoryMethod.WithFactory.ConcreteCreator;

import com.example.Creational.Order_1_FactoryMethod.WithFactory.Creator.VehicleFactory;
import com.example.Creational.Order_1_FactoryMethod.WithFactory.ConcreteProduct.TwoWheeler;
import com.example.Creational.Order_1_FactoryMethod.WithFactory.Product.Vehicle;

public class TwoWheelerFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new TwoWheeler();
    }
}
