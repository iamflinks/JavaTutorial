package org.iamflinks.helloworld;

import java.util.Random;
import java.util.Scanner;

public class Challenge {
    public static void main(String[] args) {
        // Getting input from the user
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Welcome to the Challenge game! Please enter your name: ");
        String userName = scanner.next();
        System.out.println("Hello " + userName);
        System.out.print("Please Enter 'Yes' to continue the GAME: ");
        String affirm = scanner.next().toUpperCase();
        while (!affirm.equals("YES")) {
            System.out.println("Oops! A wrong answer was entered. Please try again.");
            System.out.print("Please Enter 'Yes' to continue the GAME: ");
            affirm = scanner.next().toUpperCase();
        }

        for (int num=0; num<5; num++) {
            if (num==0) {
                System.out.print("Please guess a number between 1 and 10: ");
            }
            int guess = scanner.nextInt();
            int answer = rand.nextInt(10) + 1;
            if (guess == answer) {
                System.out.println("Superb! Your guess is correct");
                break;
            }
            else {
                System.out.print("Please enter a higher or lower number: ");
            }
            if (num==4){
                System.out.println("Game Over!!!");
                System.out.println("The answer is: " + answer);
                break;
            }
        }
    }
}
