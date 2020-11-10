package com.homework_1_SS.quinarySystem;

import junit.framework.TestCase;
import org.junit.Assert;

public class QuinarySystemTest extends TestCase {

    private QuinarySystem quinarySystemTo=new QuinarySystem(125);
    private QuinarySystem quinarySystemFrom=new QuinarySystem(1000);

    public void testReverseToQuinarySystem() {
        Assert.assertEquals("1000",quinarySystemTo.reverseToQuinarySystem());
    }

    public void testReverseFromQuinarySystem() {
        Assert.assertEquals(125,quinarySystemFrom.reverseFromQuinarySystem(),0);
    }
}