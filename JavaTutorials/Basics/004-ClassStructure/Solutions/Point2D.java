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
   * 
   * @return the x field as a double
   */
  public double getX() {
    return x;
  }
  
  /**
   * Retrieves the y value of this point.
   * 
   * @return the y field as a double
   */
  public double getY() {
    return y;
  }
  
  /**
   * Computes the distance between this point and the input point.
   * 
   * Formual: d = sqrt( (x2 - x1)^2 + (y2 - y1)^2 )
   * 
   * @param point the end point for the distance formula
   * @return the distance between two points as a double
   */
  public double distanceTo(Point2D point) {
    
    // Compute x portion of the equation
    double diffX = Math.pow(point.getX() - this.getX(), 2);
    
    // Compute y portion of the equation
    double diffY = Math.pow(point.getY() - this.getY(), 2);
    
    // Compute sum
    double sum = diffX + diffY;
    
    // Complete distance calculation
    double distance = Math.sqrt(sum);
    
    return distance;
  }
  
  /**
   * Translates this point by the input deltas.
   * 
   * @param deltaX the change in the x value of this point
   * @param deltaY the change in the y value of this point
   */
  public void translate(double deltaX, double deltaY) {
    this.x = this.x + deltaX; // aka: this.x += deltaX
    this.y = this.y + deltaY; // aka: this.y += deltaY
  }
  
  /**
   * Computes the area of a triangle from three points using
   * the shoelace formula.
   * 
   * Formula: 1/2 | (xa - xc)(yb - ya) - (xa - xb)(yc - ya) |
   * 
   * @param p1 a point of a triangle
   * @param p2 a point of a triangle
   * @return the area of a triangle as a double
   */
  public double area(Point2D p1, Point2D p2) {
    
    // Computes the first multiplication expression within the absolute value
    double leftExp = (this.getX() - p2.getX()) * (p1.getY() - this.getY());
    
    // Computes the second multiplication expression within the absolute value
    double rightExp = (this.getX() - p1.getX()) * (p2.getY() - this.getY());
    
    // Computes the difference between the two expressions and takes the absolute value
    double absDiff = Math.abs(leftExp - rightExp);
    
    // Multiplies the result by one half to compute the area
    double area = 0.5 * absDiff;
    
    return area;
  }
}