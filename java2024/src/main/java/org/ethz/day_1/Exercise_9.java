package org.ethz.day_1;

import java.util.Scanner;

public class Exercise_9 {
    public static void main(String[] args) {
        System.out.print("Write an integer: ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println("The N-th Perfect Number you want to know: " + CalculatePerfectNumber(N));
        input.close();
    }

    public static int CalculatePerfectNumber(int N) {
        int counter = 0;
        int sum = 0;
        int i = 1;
        while (counter != N) {
            sum = 0;
            for (int j = 1 ; j < i ; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i) {
                counter += 1;
            }  
            i++;     
        }
        return sum;
    }
}
