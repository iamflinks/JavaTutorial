package org.iamflinks.helloworld;

public class Inner {
    private  int age;
    private String color;

    private class TestInnerClass {
        private String name;

        public TestInnerClass(String name) {
            this.name = name;
        }

        private void printAge() {
            System.out.println("Age: " + age);
        }
    }
}
