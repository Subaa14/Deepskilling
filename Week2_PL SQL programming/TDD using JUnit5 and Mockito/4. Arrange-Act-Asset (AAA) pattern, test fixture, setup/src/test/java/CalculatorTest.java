package test.java;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;

    // Setup - runs before each test
    @Before
    public void setUp() {
        System.out.println("Setting up Calculator...");
        calculator = new Calculator(); // Arrange
    }

    // Teardown - runs after each test
    @After
    public void tearDown() {
        System.out.println("Tearing down...");
        calculator = null;
    }

    @Test
    public void testAdd() {
        // Act
        int result = calculator.add(5, 3);

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testMultiply() {
        // Act
        int result = calculator.multiply(4, 2);

        // Assert
        assertEquals(8, result);
    }
}
