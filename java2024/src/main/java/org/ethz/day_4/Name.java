package org.ethz.day_4;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Name {
    public static void main(String[] args) {
        String gender = "M";

        String filepath = "babynamesranking.txt";

        File file = new File(filepath);
        Scanner txtFile;
        try {
            txtFile = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
            return;  // Exit the program if the file is not found
        }

        Map<String, Integer> boyNames = new HashMap<>();
        Map<String, Integer> girlNames = new HashMap<>();


        while (txtFile.hasNextLine()) {
            // Split the line into components
            String line = txtFile.nextLine();
            String[] parts = line.split("\\s+");
            int rank = Integer.parseInt(parts[0]);  // First part is the ranking
            String boyName = parts[1];  // Second part is the boy's name
            String girlName = parts[3]; // Fourth part is the girl's name

            // Add names and their rankings to the maps
            boyNames.put(boyName, rank);
            girlNames.put(girlName, rank);

        }
        
        txtFile.close();
        while (gender.equals("M") || gender.equals("F")) {
            System.out.print("Enter a gender: [M], [F] or [Exit] ");
            Scanner input1 = new Scanner(System.in);
            gender = input1.next();
            

            System.out.print("Enter the Name of the Baby: ");
            Scanner input2 = new Scanner(System.in);
            String name = input2.next();
            

            // Look up the name in the appropriate map and display the ranking
            if (gender.equals("M")) {
                if (boyNames.containsKey(name)) {
                    System.out.println(name + " is ranked #" + boyNames.get(name));
                } else {
                    System.out.println(name + " is not found in the boy's ranking.");
                }
            } else if (gender.equals("F")) {
                if (girlNames.containsKey(name)) {
                    System.out.println(name + " is ranked #" + girlNames.get(name));
                } else {
                    System.out.println(name + " is not found in the girl's ranking.");
                }
            }
            input1.close();
            input2.close();
        }
        
    }
}
