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
}
