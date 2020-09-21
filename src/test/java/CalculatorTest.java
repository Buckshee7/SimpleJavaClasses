import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator(2, 7);
    }

    @Test
    public void addFunctionTest(){
        assertEquals(9, calculator.addFunction());
    }

    @Test
    public void  subtractFunctionTest(){
        assertEquals(-5, calculator.subtractFunction());
    }

    @Test
    public void  multiplyFunctionTest(){
        assertEquals(14, calculator.multiplyFunction());
    }

    @Test
    public void  divideFunctionTest(){
        calculator = new Calculator(7.0, 2.0);
        assertEquals(3.5, calculator.divideFunction(), 0.01);
    }

}