package org.ethz.day_1;

import java.util.Scanner;

public class Exercise_7 {
    public static void main(String[] args) {
        System.out.print("Write the Weight of the Package:");
        Scanner input = new Scanner(System.in);
        double weight = input.nextDouble();

        double cost;
        if (weight > 0 && weight <= 3) {
            cost = 1.5;
            System.out.println(cost);
        } else if (weight > 3 && weight <= 5) {
            cost = 2.5;
            System.out.println(cost);
        } else if (weight > 5 && weight <= 10) {
            cost = 4.2;
            System.out.println(cost);
        } else {
            System.out.println("Please insert a weight between 0 and 10");
        }
        input.close();
    }
}
