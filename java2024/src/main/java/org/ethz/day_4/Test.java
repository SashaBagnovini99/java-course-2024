package org.ethz.day_4;
import java.util.LinkedList;



public class Test {
    public static void main(String[] args) {
        int length = 500;
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            linkedList.add(i);
        }
        long startTime1 = System.nanoTime();
        for (int i = 0; i < length; i++) {

        }
        long endTime1 = System.nanoTime();
        System.out.println(endTime1 - startTime1); // Time in nanoseconds

        
        for (int i = 0; i < length; i++) {
            long startTime2 = System.nanoTime();
            linkedList.get(i);
            long endTime2 = System.nanoTime();
            
            if ((double)(endTime1 - startTime1)/(endTime2 - startTime2) < 1.0) {
                System.out.println((double) i/length); // Time in nanoseconds
                System.out.println((double) (endTime1 - startTime1)/(endTime2 - startTime2));
            }
        }
    }
}
