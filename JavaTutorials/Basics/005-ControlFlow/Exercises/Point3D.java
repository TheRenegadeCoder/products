/**
 * The Point3D class represents a three dimensional point.
 *
 * Copyright (C) 2017 Jeremy Griffith
 */
public class Point3D {
  
  // The x value of the point
  private double x;
  
  // The y value of the point
  private double y;
  
  // The z value of the point
  private double z;
  
  /**
   * The class constructor.
   */
  public Point3D(double x, double y, double z) {
    this.x = x;
    this.y = y;
    this.z = z;
  }
  
  /**
   * Retreives the x value of this point.
   */
  public double getX() {
    return x;
  }
  
  /**
   * Retrieves the y value of this point.
   */
  public double getY() {
    return y;
  }
  
  /**
   * Retrieves the z value of this point.
   */
  public double getZ() {
    return z;
  }
  
  /**
   * Write a method which returns true if two points are equal.
   * 
   * Hint: You'll need to remember casting to complete this.
   * 
   * In the future we will talk about inheritance. For now, just know that
   * in order to use the equals method to compare two objects, you'll
   * need to override the default behavior. You can assume o is a Point3DExercise.
   * However, it's not safe to assume this normally.
   * 
   * What would we want to compare to make sure we had two equal points?
   * How would we organize those requirements using control flow?
   */
  @Override
  public boolean equals(Object o) {
    return false;
  }
  
  /**
   * Write a method which checks if this point is out of bounds.
   * 
   * Assume xBound is +/-
   * Assume the bounds are strict
   */
  public boolean checkInBounds(double xBound, double yBound, double zBound) {
    return false;
  }
}
