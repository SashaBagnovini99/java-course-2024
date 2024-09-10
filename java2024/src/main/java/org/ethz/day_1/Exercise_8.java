package org.ethz.day_1;

import java.util.Scanner;

public class Exercise_8 {

    public static void main(String[] args) {
        System.out.print("Write an integer: ");
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println("The N-th Fibonacci Number is: " + calculateFibonacci(N));
        input.close();
    }

    public static int calculateFibonacci(int N) {
        if (N <= 1) {
            return N;
        }
        
        int fib = 1;
        int prev = 0;
        int prov;
        for (int i = 1; i < N; i++) {
            prov = fib;
            fib += prev;
            prev = prov;
        }
        return fib;
    }
}

