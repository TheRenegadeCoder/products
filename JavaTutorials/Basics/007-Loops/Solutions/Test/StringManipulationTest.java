import junit.framework.TestCase;

/**
 * A JUnit test class for the StringManipulation utility class.
 * 
 * Copyright (C) 2017 Jeremy Griffith
 */
public class StringManipulationTest extends TestCase {
  
  public void testContains() {
    assertTrue("Test first", StringManipulation.contains("My String", 'M'));
    assertTrue("Test middle", StringManipulation.contains("My String", 'S'));
    assertTrue("Test last", StringManipulation.contains("My String", 'g'));
    assertFalse("Test zero", StringManipulation.contains("", 'z'));
    assertTrue("Test one", StringManipulation.contains("M", 'M'));
    assertTrue("Test many", StringManipulation.contains("My String", ' '));
  }
  
  public void testNotContains() {
    assertFalse("Test missing character", StringManipulation.contains("My String", 'z'));
    assertFalse("Test lowercase vs uppercase", StringManipulation.contains("", 'm'));
  }
  
  public void testPrintEveryNthChar() {
    assertEquals("Test zero", "", StringManipulation.printEveryNthChar("My String", 0));
    assertEquals("Test one", "My String", StringManipulation.printEveryNthChar("My String", 1));
    assertEquals("Test many", "ySrn", StringManipulation.printEveryNthChar("My String", 2));
  }
  
}
