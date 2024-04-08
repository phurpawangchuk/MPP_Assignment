package Assignment5.prob2;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Vehicle bus   = VechicleFactory.getVehicle("Bus");
        bus.startEngine();

        Vehicle car   = VechicleFactory.getVehicle("Car");
        car.startEngine();

        Vehicle ecar  = VechicleFactory.getVehicle("ElectricCar");
        ecar.startEngine();

        Vehicle truck = VechicleFactory.getVehicle("Truck");
        truck.startEngine();
    }
}
