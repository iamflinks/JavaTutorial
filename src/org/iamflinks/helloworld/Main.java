package org.iamflinks.helloworld;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TestAbstractClass testAbstractClass = new TestAbstract("Femi");
        testAbstractClass.printName();
        testAbstractClass.print("I am " + testAbstractClass.getName());
    }
}
