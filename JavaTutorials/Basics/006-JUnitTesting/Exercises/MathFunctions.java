/**
 * The MathFunctions class is a utility class for math operations like rounding and powers.
 * 
 * Copyright (C) 2017 Jeremy Griffith
 */
public class MathFunctions {
  
  /**
   * Implement a rounding function. It should take a double and return a rounded
   * integer to the nearest whole number.
   * 
   * Once complete. Try running the tests already created for this method.
   * 
   * precondition: none
   * postcondition: the closest integer to the double (i.e. 4.2 -> 4, 4.8 -> 5)
   */
  public static int round(double numToRound) {
    return 0;
  }
  
  /**
   * This is a generic power function. We haven't touched on looping yet,
   * so this will be a nice introduction. However, don't worry if it doesn't make
   * sense yet. This function is here to help you with unit testing. Head over
   * to the test file and write some test cases for this function.
   * 
   * i.e. assertEquals(8, MathFunctions.pow(2,3))
   * 
   * precondition: input combination shall not cause overflow - also, exponent must be >= 0
   * postcondition: a base raised to a power
   */ 
  public static int pow(int base, int exponent) {
    
    int result = 1;
    
    for (int i = 0; i < exponent; i++) {
      result *= base;
    }
    
    return result;
  }
  
}