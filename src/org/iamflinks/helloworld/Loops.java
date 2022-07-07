package org.iamflinks.helloworld;

import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        // for loop
//        for (int i=0; i<10; i++) {
//            if (i==8) {
//                continue;
//            }
//            System.out.println(i);
//            break;
//        }
//
//        // while loop
//        int index = 3;
//        while (index < 10) {
//            System.out.println(index+2);
//            index++;
//        }
//
//        // do-while loop
//        do {
//            System.out.println("Hello");
//        }while (index < 3);

//        // Get user input
//        System.out.println("Please enter you Age: ");
//        Scanner scanner = new Scanner(System.in);
//        int age = scanner.nextInt();
//        System.out.println("Please enter you name");
//        String name = scanner.next();
//        System.out.println("Your name is: " + name + " and your ange is: " + age);

        // generate a random number
        Random rand = new Random();
        float num = rand.nextFloat(1);
        System.out.println("number: " + num);
    }
}
