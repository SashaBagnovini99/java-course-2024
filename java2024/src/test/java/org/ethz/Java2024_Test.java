package org.ethz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


import org.ethz.day_1.Exercise_8;
import org.ethz.day_1.Exercise_9;


public class Java2024_Test {

    @Test
    public void testFibonacciForSmallNumbers() {
        // Test for N = 0
        assertEquals(0, Exercise_8.calculateFibonacci(0));
        
        // Test for N = 1
        assertEquals(1, Exercise_8.calculateFibonacci(1));
        
        // Test for N = 2
        assertEquals(1, Exercise_8.calculateFibonacci(2));
        
        // Test for N = 3
        assertEquals(2, Exercise_8.calculateFibonacci(3));
        
        // Test for N = 4
        assertEquals(3, Exercise_8.calculateFibonacci(4));
        
        // Test for N = 5
        assertEquals(5, Exercise_8.calculateFibonacci(5));
    }

    @Test
    public void testFibonacciForLargerNumbers() {
        // Test for N = 10
        assertEquals(55, Exercise_8.calculateFibonacci(10));
        
        // Test for N = 15
        assertEquals(610, Exercise_8.calculateFibonacci(15));
        
        // Test for N = 20
        assertEquals(6765, Exercise_8.calculateFibonacci(20));
    }

    @Test
    public void testPerfectNumber() {
        // Test for N = 1
        assertEquals(6, Exercise_9.CalculatePerfectNumber(1));
        
        // Test for N = 2
        assertEquals(28, Exercise_9.CalculatePerfectNumber(2));
        
        // Test for N = 3
        assertEquals(496, Exercise_9.CalculatePerfectNumber(3));
        
        // Test for N = 4
        assertEquals(8128, Exercise_9.CalculatePerfectNumber(4));
    }
}
