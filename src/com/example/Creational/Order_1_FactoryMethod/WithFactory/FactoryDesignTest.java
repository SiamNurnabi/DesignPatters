package com.example.Creational.Order_1_FactoryMethod.WithFactory;

import com.example.Creational.Order_1_FactoryMethod.WithFactory.ConcreteCreator.FourWheelerFactory;
import com.example.Creational.Order_1_FactoryMethod.WithFactory.ConcreteCreator.TwoWheelerFactory;
import com.example.Creational.Order_1_FactoryMethod.WithFactory.Creator.VehicleFactory;

public class FactoryDesignTest {
    public static void main(String[] args) {
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client client = new Client(twoWheelerFactory);
        client.getVehicle().printVehicle();

        VehicleFactory fourWheelerFactory = new FourWheelerFactory();
        client = new Client(fourWheelerFactory);
        client.getVehicle().printVehicle();
    }
}
