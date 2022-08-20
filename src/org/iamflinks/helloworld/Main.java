package org.iamflinks.helloworld;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarInterface carInterface = new ElectricCar("Tesla");
        carInterface.start();
        carInterface.move(85);

        TestInterface testCarInterface = new ElectricCar("Prius");
        testCarInterface.printName();

        CarInterface fossilCarInterface = new FossilFuelCar("Ford F150");
        fossilCarInterface.start();
        fossilCarInterface.move(76);
    }
}
