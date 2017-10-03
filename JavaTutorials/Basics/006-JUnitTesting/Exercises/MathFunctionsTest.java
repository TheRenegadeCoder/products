import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * The MathFunction test class.
 * 
 * Copyright (C) 2017 Jeremy Griffith
 */
public class MathFunctionsTest {
  
  @Test
  public void testRound() {
    assertEquals(4, MathFunctions.round(4.2));   // Test lower bound
    assertEquals(5, MathFunctions.round(4.8));   // Test upper bound
    assertEquals(5, MathFunctions.round(4.5));   // Test .5 edge case
    assertEquals(5, MathFunctions.round(5));     // Test integer edge case
    assertEquals(-2, MathFunctions.round(-2.3)); // Test negative rounding
  }
  
  @Test
  public void testPow() {
    // Add a case for regular use (i.e. 2^3 = 8)
    // Add an edge case where the power is 0
    // Add an edge case where the base is 0
  }
  
}