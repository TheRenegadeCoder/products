/**
 * The Point2D class represents a two dimensional point.
 *
 * Copyright (C) 2017 Jeremy Griffith
 */
public class Point2D {
  
  // The x value of the point
  private double x;
  
  // The y value of the point
  private double y;
  
  /**
   * The class constructor.
   */
  public Point2D(double x, double y) {
    this.x = x;
    this.y = y;
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
   * Write a method which computes the distance between this
   * point and another point.
   */
  public double distanceTo(Point2D point) {
    return 0;
  }
  
  /**
   * Write a method which moves this point by some
   * x and some y.
   * 
   * Note: void means the function doesn't return anything.
   */
  public void translate(double deltaX, double deltaY) {
    
  }
  
  /**
   * Write a method which computes the area of the polygon created
   * by this point and two additional points - aka a triangle.
   * 
   * Hint: Use the shoelace formula and the Java Math library.
   */
  public double area(Point2D p1, Point2D p2) {
    return 0;
  }
}