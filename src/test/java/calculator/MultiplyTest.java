package calculator;


import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTest {
    private Calculator calculator;

    @BeforeAll
    //runs once at start of class
    public static void testsStarting() {
       // System.out.println("Starting Tests");
    }

    @BeforeEach
    //runs before each @Test
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @AfterEach
    //runs after each @Test
    public void testComplete() {
        //System.out.println("Test Completed");
    }

    @AfterAll
    //runs at end of class
    public static void allTestsComplete() {
      //  System.out.println("All Tests Completed");
    }

    @Test//(expected = Exception.class)
    public void testMultiply(){
        assertEquals(20,calculator.multiplyBy(4,5),
                "Require regular multiplication should work");
    }

    @Test
    //@Disabled("Out of scope")
    public void testMultiplyWithZero() {
        assertEquals(0,calculator.multiplyBy(0,5),
                "Multiple with zero should be zero");
        assertEquals(0, calculator.multiplyBy(5,0),
                "Multiple with zero should be zero");
    }
}
