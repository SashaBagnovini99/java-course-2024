package org.ethz.day_4;
import java.io.File;
import java.util.Scanner; 
import java.io.FileNotFoundException;
import java.util.Set; 


public class VowelConsonantCounter {
    public static void main(String[] args) {
        // Scanner to take the input for the file name
        System.out.print("Enter the text file name: ");
        Scanner input1 = new Scanner(System.in);

        String filepath = input1.nextLine();
        input1.close();
        
        Scanner input;
        File file = new File(filepath);
        try {
            input = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            return;  // Exit the program if the file is not found
        }
        


        Set<Character> vowels = Set.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        int vowelCount = 0;
        int consonantCount = 0;

        while (input.hasNext()) {
            String word = input.next();
            for (char ch : word.toCharArray()) {
                if (Character.isLetter(ch)) {
                    if (vowels.contains(ch)) {
                        vowelCount++;
                    } else {
                        consonantCount++;
                    }
                }
            }
        }
        System.out.println("The number of vowel is: " + vowelCount);
        System.out.println("The number of consonant is: " + consonantCount);
        input.close();
    }
}
