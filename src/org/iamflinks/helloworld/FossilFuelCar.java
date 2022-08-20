package org.iamflinks.helloworld;

public class FossilFuelCar implements CarInterface {
    private String Name;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public FossilFuelCar(String name) {
        Name = name;
    }

    @Override
    public void start() {
        System.out.println("Fossil Fuel Car Starting!!!...");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " is moving at " + speed + "mph");
    }
}
