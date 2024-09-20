package com.example.Creational.Order_1_FactoryMethod.WithoutFactory;

class Client {
    private Vehicle vehicle;

    public Client(int type) {
        switch (type) {
            case 2:
                vehicle = new TwoWheeler();
                break;
            case 3:
                vehicle = new ThreeWheeler();
                break;
            case 4:
                vehicle = new FourWheeler();
                break;
            default:
                vehicle = null;
        }
    }

    public void cleanUp() {
        if (vehicle != null) vehicle = null;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

}


public class Test {
    public static void main(String[] args) {
        Client client = new Client(4);
        Vehicle vehicle = client.getVehicle();
        if (vehicle != null) {
            vehicle.printVehicle();
        }
        client.cleanUp();
    }
}
