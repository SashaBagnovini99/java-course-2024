package org.ethz.day_2;
import java.util.Arrays; 

import java.util.Scanner;

public class Exercise_3 {
    public static void main(String[] args) {
        String[] cities = new String[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Write City number " + (i+1) + ": ");
            Scanner input = new Scanner(System.in);
            cities[i] = input.next();
        }

        Arrays.sort(cities);
        for (int i = 0; i < 3; i++) {
            System.out.println(cities[i]);
        }
    }
}
