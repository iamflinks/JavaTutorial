package org.iamflinks.helloworld;

public abstract class TestAbstractClass {

    private String name;

    public TestAbstractClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void printName();

    // You cna have non-abstract methods
    public void print(String text) {
        System.out.println(text);
    }
}
