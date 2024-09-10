package org.ethz.day_1;

import java.util.Scanner;

public class Exercise_5 {
    /* Write a program that reads an integer from the console and multiplies all the digits in the integer and outputs the result. */
    public static void main(String[] args) {
        System.out.println("Write an Input:");
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        
        int prov;
        int mult = 1;
        while (number > 0) {
            prov = number % 10;
            mult *= prov;
            number /= 10;
        }
        System.out.println(mult);
        input.close();
    }
}
