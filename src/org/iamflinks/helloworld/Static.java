package org.iamflinks.helloworld;

public class Static {
    public static String name;
    public int age;
    public String skinColor;

    public Static(int age, String skinColor) {
        this.age = age;
        this.skinColor = skinColor;
    }

    public static void printDetail() {
        System.out.println("Printing Class details...");
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Static.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }
}
