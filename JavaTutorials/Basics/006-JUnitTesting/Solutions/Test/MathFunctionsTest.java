import junit.framework.TestCase;

/**
 * The MathFunction test class.
 * 
 * Copyright (C) 2017 Jeremy Griffith
 */
public class MathFunctionsTest extends TestCase {
  
  public void testRound() {
    assertEquals(4, MathFunctions.round(4.2));   // Test lower bound
    assertEquals(5, MathFunctions.round(4.8));   // Test upper bound
    assertEquals(5, MathFunctions.round(4.5));   // Test .5 edge case
    assertEquals(5, MathFunctions.round(5));     // Test integer edge case
    assertEquals(-2, MathFunctions.round(-2.3)); // Test negative rounding
  }
  
  public void testPow() {
    assertEquals(8, MathFunctions.pow(2, 3));      // Add a case for regular use (i.e. 2^3 = 8)
    assertEquals(1, MathFunctions.pow(2, 0));      // Add an edge case where the power is 0
    assertEquals(0, MathFunctions.pow(0, 5));      // Add an edge case where the base is 0
    assertEquals(1, MathFunctions.pow(0, 0));      // Add an edge case where both inputs are 0
    assertEquals(-8, MathFunctions.pow(-2, 3));    // Add a case where the base is negative
  }
  
}