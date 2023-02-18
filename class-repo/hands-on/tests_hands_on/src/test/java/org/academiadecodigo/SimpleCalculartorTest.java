package org.academiadecodigo;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class SimpleCalculartorTest {

    private SimpleCalculator systemUnderTesting;

    @Before
    public void setup(){
        systemUnderTesting = new SimpleCalculator();
    }

    @Test
    @Parameters({
            "10, 10, 20",
            "20, 22, 42",
            "100, 23, 123",
            "0, 0, 0"
    })
    public void sumTest(int n1, int n2, int expectedResult){
        // Exercise
        int actualResult = systemUnderTesting.sum(n1, n2);
        // Verification
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test( expected = IllegalArgumentException.class)
    public void sumNegativeTest(){
        systemUnderTesting.sum(-10, 0);
    }

    @After
    public void proveAPoint(){
        System.out.println("MY TESTS ARE AMAZING!!!!!!!");
        systemUnderTesting = null;
    }
}
