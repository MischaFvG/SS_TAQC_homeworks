package com.homework_1_SS.complexNumbers;

import junit.framework.TestCase;
import org.junit.Assert;

public class ComplexMathTest extends TestCase {

    private ComplexNumber complexNumber1 = new ComplexNumber(-2, 1);
    private ComplexNumber complexNumber2 = new ComplexNumber(1, -1);

    public void testSum() {
        Assert.assertEquals("-1.0-0.0i", ComplexMath.sum(complexNumber1, complexNumber2).toString());
    }

    public void testSubtract() {
        Assert.assertEquals("-3.0+2.0i", ComplexMath.subtract(complexNumber1, complexNumber2).toString());
    }

    public void testMultiply() {
        Assert.assertEquals("-1.0+3.0i", ComplexMath.multiply(complexNumber1, complexNumber2).toString());
    }

    public void testDivide() {
        Assert.assertEquals("-1.5-0.5i", ComplexMath.divide(complexNumber1, complexNumber2).toString());
    }
}