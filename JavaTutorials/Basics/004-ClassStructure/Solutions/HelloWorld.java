/**
 * The HelloWorldSolution class is the solution version of
 * the supplemental material for the class structure part
 * 1 course. In this exercise, the class should implement
 * hello world as well as other basic methods.
 *
 * Copyright (C) 2016 Jeremy Griffith
 */
public class HelloWorld {
  
  /**
   * The main method of the HelloWorldExercise class.
   */
  public static void main(String[] args) {
    // This is an inline comment - use these to briefly describe behavior
    System.out.println("Hello World!");
    
    // Prints the result of add(5, 7)
    double intAdd = HelloWorld.add(5, 7);
    System.out.println(intAdd);
    
    // Prints the result of add(11.0, 7.0)
    double doubleAdd = HelloWorld.add(11.0, 7.0);
    System.out.println(doubleAdd);
    
    // Prints the result of subtract(2, 3)
    double intSub = HelloWorld.subtract(2, 3);
    System.out.println(intSub);
    
    // Prints the result of subtract(6.0, 3.0)
    double doubleSub = HelloWorld.subtract(6.0, 3.0);
    System.out.println(doubleSub);
  }
  
  /**
   * An integer add method.
   * 
   * @param first the first term in addition
   * @param second the second term in addition
   * @return the sum of the inputs as a double
   */
  public static double add(int first, int second) {
    return first + second;
  }
  
  /**
   * A double add method.
   * 
   * @param first the first term in addition
   * @param second the second term in addition
   * @return the sum of the inputs as a double
   */
  public static double add(double first, double second) {
    return first + second;
  }
  
  /**
   * An integer subtract method.
   * 
   * @param first the first term in subtraction
   * @param second the second term in subtraction
   * @return the difference between the inputs as a double
   */
  public static double subtract(int first, int second) {
    return first - second;
  }
  
  /**
   * A double subtract method.
   * 
   * @param first the first term in subtraction
   * @param second the second term in subtraction
   * @return the difference between the inputs as a double
   */
  public static double subtract(double first, double second) {
    return first - second;
  }
}