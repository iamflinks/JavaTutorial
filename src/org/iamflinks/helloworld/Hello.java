package org.iamflinks.helloworld;

public class Hello {
    public static void main(String[] args) {
//        System.out.print("No new line \n");
//        System.out.println("Hello, World!");
        int num = -5;
        System.out.println(num);

        long numLong = 23344;
        System.out.println(numLong);

        double numDouble = 13.00099;
        System.out.println(numDouble);

        float numFloat = (float) 12.999909;
        System.out.println(numFloat);

        char myChar = '\u00A9';
        System.out.println(myChar);

        String name = "iamflinks";
        System.out.println(name.toUpperCase());

        boolean myBoolean = true;
        if (myBoolean){
            System.out.println("Boolean True");
        }
    }
}
