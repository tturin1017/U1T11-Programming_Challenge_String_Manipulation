package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest{

    @Test
    void testPerformOperationAddition(){
        Calculator calculator = new Calculator("TI84");
        int n1 = 10;
        int n2 = -5;
        double expectedOutput = 5;
        double studentOutput = calculator.performOperation("+", n1, n2);
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testPerformOperationSubtraction(){
        Calculator calculator = new Calculator("TI84");
        int n1 = 5;
        int n2 = 1;
        double expectedOutput = 4;
        double studentOutput = calculator.performOperation("-", n1, n2);
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testPerformOperationMultiplication(){
        Calculator calculator = new Calculator("TI84");
        int n1 = 2;
        int n2 = -8;
        double expectedOutput = -16;
        double studentOutput = calculator.performOperation("*", n1, n2);
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testPerformOperationDivision(){
        Calculator calculator = new Calculator("TI84");
        int n1 = 4;
        int n2 = 2;
        double expectedOutput = 2;
        double studentOutput = calculator.performOperation("/", n1, n2);
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testPerformOperationNone(){
        Calculator calculator = new Calculator("TI84");
        int n1 = 4;
        int n2 = 2;
        double expectedOutput = 0;
        double studentOutput = calculator.performOperation("?", n1, n2);
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testDivisibleByTrue(){
        Calculator calculator = new Calculator("TI84");
        int n1 = 4;
        int n2 = 2;
        boolean expectedOutput = true;
        boolean studentOutput = calculator.divisibleBy(n1, n2);
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testDivisibleByFalse(){
        Calculator calculator = new Calculator("TI84");
        int n1 = 2;
        int n2 = 3;
        boolean expectedOutput = false;
        boolean studentOutput = calculator.divisibleBy(n1, n2);
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testCoordinatePair(){
        Calculator calculator = new Calculator("TI84");
        int n1 = 2;
        int n2 = 3;
        String expectedOutput = "(2,3)";
        String studentOutput = calculator.coordinatePair(n1, n2);
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testAbsoluteValue(){
        Calculator calculator = new Calculator("TI84");
        int n1 = 2;
        int n2 = 3;
        int expectedOutput = 1;
        int studentOutput = calculator.absoluteValue(n1, n2);
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testAverage(){
        Calculator calculator = new Calculator("TI84");
        int n1 = 5;
        int n2 = 8;
        double expectedOutput = 6.5;
        double studentOutput = calculator.average(n1, n2);
        assertEquals(expectedOutput, studentOutput);
    }


    @Test
    void testInfo(){
        Calculator calculator = new Calculator("TI84");
        String expectedOutput = "This calculator is a model "+calculator.calcModel+" where "+calculator.calcModel+" should be filled in with the value stored in the calcModel instance variable.";
        String studentOutput = calculator.info();
        assertEquals(expectedOutput,studentOutput);
    }
    
}


