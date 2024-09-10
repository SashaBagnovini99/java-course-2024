package org.ethz.day_1;

import java.util.Random;
import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        System.out.println("Write a Number between 1 and 999:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int counter = 0;
        Random r = new Random();
        int x = r.nextInt(1000);
        while (x != number) {
            r = new Random();
            x = r.nextInt(1000);
            counter += 1;
        }
        System.out.println("The number was: " + x);
        System.out.println("And it took " + counter + " attempts to guess the right number");
        input.close();
    }
}
