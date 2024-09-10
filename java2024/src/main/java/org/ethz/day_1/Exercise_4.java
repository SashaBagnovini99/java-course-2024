package org.ethz.day_1;
import java.util.Scanner;

public class Exercise_4 {
    
    public static void main(String[] args) {
        System.out.println("Radius of the Circle:");
        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();

        double pi = 3.14;

        double Area = radius * radius * pi;
        double Circumference = radius * 2 * pi;

        System.out.println("The Area of the Circle with Radius " + radius + " is: " + Area);
        System.out.println("The Circumference of the Circle with Radius " + radius + " is: " + Circumference);
        input.close();
    }
}
