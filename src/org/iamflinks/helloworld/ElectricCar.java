package org.iamflinks.helloworld;

public class ElectricCar implements CarInterface, TestInterface {
    public String Name;

    public ElectricCar(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public void start() {
        System.out.println("Electric car started");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName() + " is moving at " + speed + "mphs");
    }

    @Override
    public void printName() {
        System.out.println("Name: " + this.Name);
    }
}
