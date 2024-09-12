package org.ethz.day_2;
import java.util.Arrays; 

import java.util.Scanner;

public class Exercise_6 {
    public static void main(String[] args) {
        System.out.print("Password: ");
        Scanner input = new Scanner(System.in);
        String password = input.next();
        input.close();

        if (password.length() <= 8) {
            System.out.println("Password NOT valid");
        } else if (password.contains(".")) {
            System.out.println("Password NOT valid");
        } else {
            int counter = 0;
            for (char c : password) {
                if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
                    counter += 1;
                    if (counter == 2) {
                        System.out.println("Password is valid");
                        break;
                    }
                }
            }
            System.out.println("Password NOT valid");
        }
    }
    
    
}
