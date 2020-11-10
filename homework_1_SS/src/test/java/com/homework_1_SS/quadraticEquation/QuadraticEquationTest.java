package com.homework_1_SS.quadraticEquation;

import junit.framework.TestCase;
import org.junit.Assert;

public class QuadraticEquationTest extends TestCase {

    private QuadraticEquation quadraticEquationComplex = new QuadraticEquation(5, -14, 17);
    private QuadraticEquation quadraticEquationZero = new QuadraticEquation(6, 12, 6);
    private QuadraticEquation quadraticEquationSimple = new QuadraticEquation(1, 6, -7);

    public void testReturnDiscriminant() {
        Assert.assertEquals(-144, quadraticEquationComplex.returnDiscriminant(), 0);
        Assert.assertEquals(0, quadraticEquationZero.returnDiscriminant(), 0);
        Assert.assertEquals(64, quadraticEquationSimple.returnDiscriminant(), 0);
    }

    public void testZeroDiscriminantResult() {
        Assert.assertEquals(-1, quadraticEquationZero.zeroDiscriminantResult(), 0);
    }

    public void testFirstDiscriminantResult() {
        Assert.assertEquals(1, quadraticEquationSimple.firstDiscriminantResult(), 0);
    }

    public void testSecondDiscriminantResult() {
        Assert.assertEquals(-7, quadraticEquationSimple.secondDiscriminantResult(), 0);
    }

    public void testFirstComplexDiscriminantResult() {
        Assert.assertEquals("1.4+1.2i", quadraticEquationComplex.firstComplexDiscriminantResult().toString());
    }

    public void testSecondComplexDiscriminantResult() {
        Assert.assertEquals("1.4-1.2i", quadraticEquationComplex.secondComplexDiscriminantResult().toString());
    }
}