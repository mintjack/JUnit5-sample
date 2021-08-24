package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Division Tests")
public class DivideTest {
    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator=new Calculator();
    }

    @DisplayName("Division of numbers >0")
    @Test
    @Tag("fast")
    public void testDivideBy(){
        assertEquals(5, calculator.divideBy(50,10),"Divide by Number greater than 0");
    }

    @Test  //because this will throw a 'divide by zero' exception
    public void testDivideByZero(){
        //assertEquals( 0,calculator.divideBy(50,0),"Divide by zero");
        assertThrows(ArithmeticException.class,() -> calculator.divideBy(50,0));
    }
}
