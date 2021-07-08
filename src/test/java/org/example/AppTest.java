package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void shouldAnswerWithFalse()
    {
        assertFalse( false );
    }

    @Test
    public void shouldAReturnSum()
    {
        App myApp = new App();
        assertEquals( myApp.testSum(8,5) , 13 );
        assertEquals( myApp.testSum(8,8) , 16 );
        assertEquals( myApp.testSum(2,5) , 7 );
    }

    @Test
    public void shouldPrintMessage()
    {
        App myApp1 = new App();
        myApp1.printMessage("lital");
    }

    @Test
    public void shouldAnswerEqualsArray()
    {
        App myApp2 = new App();
        int [] a = new int[]{5, 8, 3};
        int [] b = new int[]{5, 8, 3};
        assertArrayEquals(a,b);
    }

    @Test
    public void shouldAnswerEqualsArray2()
    {
        App myApp2 = new App();
        int [] a = new int[]{5, 8, 3};
        int [] b = new int[]{5, 8, 3};
        int [] c = new int[]{5, 8, 3, 6, 3};
        assertTrue(myApp2.testIntArray(a,b));
        assertFalse(myApp2.testIntArray(a,c));
    }

}
