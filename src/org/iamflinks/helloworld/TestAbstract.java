package org.iamflinks.helloworld;

public class TestAbstract extends TestAbstractClass {

    public TestAbstract(String name) {
        super(name);
    }

    // You cannot extend more than one abstract class
    @Override
    public void printName() {
        System.out.println(this.getName());
    }
}
