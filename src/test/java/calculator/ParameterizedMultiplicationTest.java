package calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ParameterizedMultiplicationTest {
    private Calculator calculator;

    //create test data:
    @ParameterizedTest
    @CsvSource({
            "0,    1,   0",
            "1,    2,   2",
            "4,  5, 20",
            "1,  100, 100"
    })

     //put each set through the test:

    public void testMultiply(int first, int second, int result) {
        Calculator calculator = new Calculator();
        //System.out.println("checking that: " + first + " * " + second + " equals " + result);
        assertEquals(result, calculator.multiplyBy(first,second),"Result");
    }


}
