package org.iamflinks.helloworld;

public class Main {
    public static void main(String[] args) {
        Static.name = "Femi";
        Static testClass = new Static(25, "Black");
        System.out.println("testClass Name: " + testClass.getName());

        Static newClass = new Static(32, "White");
        System.out.println("newClass Name: " + newClass.getName());
        Static.printDetail();
    }
}
