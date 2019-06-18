package com.epam.gitdemo;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

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
        App replaceChar = new App();
        String newString = replaceChar.removeString("ABCD");
		assertEquals("BCD",newString);
    }
    @Test
    public void shouldAnswerWithTrue11()
    {
        App replaceChar = new App();
        String newString = replaceChar.removeString("BACD");
		assertEquals("BCD",newString);
    }
    @Test
    public void shouldAnswerWithTrue2()
    {
        App replaceChar = new App();
        String newString = replaceChar.removeString("AACD");
		assertEquals("CD",newString);
    }
    @Test
    public void shouldAnswerWithTrue3()
    {
        App replaceChar = new App();
        String newString = replaceChar.removeString("BBAA");
		assertEquals("BBAA",newString);
    }
    @Test
    public void shouldAnswerWithTrue4()
    {
        App replaceChar = new App();
        String newString = replaceChar.removeString("AABAA");
		assertEquals("BAA",newString);
    }
}
