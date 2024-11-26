package org.example;
import org.junit.Assert;
import org.junit.Test;
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd(){
        Assert.assertEquals(8,calculator.add(5,3));
    }
    @Test
    public void testSub(){
        Assert.assertEquals(2,calculator.subtract(5,3));
    }
    @Test
    public void testMultiply(){
        Assert.assertEquals(15,calculator.multiplication(5,3));
    }
    @Test
    public void testDivide(){
        Assert.assertEquals(1,calculator.Division(5,3));
    }
}
