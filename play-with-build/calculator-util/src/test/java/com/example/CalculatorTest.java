package com.example;

import com.npci.Calculator;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    // Arrange
    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        // Act
        int result = calculator.add(2, 3);
        // Assert
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    public void testSubtract() {
        // Act
        int result = calculator.subtract(5, 3);
        // Assert
        assertEquals(2, result, "5 - 3 should equal 2");
    }

    @Test
    public void testMultiply() {
        // Act
        int result = calculator.multiply(4, 5);
        // Assert
        assertEquals(20, result, "4 * 5 should equal 20");
    }

    @Test
    public void testDivide() {
        // Act
        double result = calculator.divide(10, 2);
        // Assert
        assertEquals(5, result, "10 / 2 should equal 5");
    }

}
