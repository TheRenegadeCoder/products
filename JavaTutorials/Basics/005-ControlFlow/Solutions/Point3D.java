/**
 * The Point3D class represents a two dimensional point.
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
   * Retrieves the z value of this point.
   * 
   * @return the z field as a double
   */
  public double getZ() {
    return z;
  }
  
  /**
   * Compares two 3D points based on their coordinates.
   * 
   * In this example, you are exposed to the instanceof
   * keyword which checks if an object is an instanceof a
   * specific class. Use sparingly. 
   * 
   * Also, we briefly touch on short-circuit evaluation here.
   * When we string expressions together with &&, the first expression
   * to fail will result in failure of the entire condition. In our case,
   * it only takes the x coordinates to be different to automatically
   * jump to the else statement. We will never even check isYEqual
   * because we already know the result of the condition.
   * 
   * Also, note the several exit points. There are three return statements
   * total in this method. This can sometimes make logic confusing. Instead,
   * we might try storing the result in a variable and ultimately
   * returning that variable at the end of the method. We can actually
   * eliminate the nested if statement altogether. Just return 
   * isXEquals && isYEquals && isZEquals directly.
   * 
   * @param o an object for comparison
   * @return true if the two points share x, y, and z
   */
  @Override
  public boolean equals(Object o) {
    
    // You weren't expected to check if the object is a Point3DSolution, but it's proper
    if (o instanceof Point3D) {
      
      Point3D p = (Point3D) o;
      
      // Here we just compare this point to the input point and store the result
      boolean isXEqual = p.getX() == this.getX();
      boolean isYEqual = p.getY() == this.getY();
      boolean isZEqual = p.getZ() == this.getZ();
      
      // All conditions must be true to return true
      if (isXEqual && isYEqual && isZEqual) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
  
  /**
   * Checks that this point is within some set of bounds.
   * 
   * Like equals, this implementation was cleaned up by storing all
   * comparisons in local variables with clear names. Then we were able
   * to easily return the results.
   * 
   * These comparisons are lengthy. Imagine we are asked to expand this
   * code to accomodate 4 dimensions. We would have to recreate the comparisons
   * for the fourth point. Instead, we should pull the duplicate code out into
   * its own method:
   * 
   * public boolean checkBound(double bound, double coordinate) {
   *   return coordinate < bound && coordinate > -bound;
   * }
   * 
   * We can even make this method private and static since it doesn't really
   * have much to do with a point instance.
   */
  public boolean checkInBounds(double xBound, double yBound, double zBound) {
    
    // Check that each coordinate is within its bounds (this is a great opportunity for a helper method)
    boolean isXInBounds = this.getX() < xBound && this.getX() > -xBound;
    boolean isYInBounds = this.getY() < yBound && this.getY() > -yBound;
    boolean isZInBounds = this.getZ() < zBound && this.getZ() > -zBound;
    
    // All three coordinates need to be in bounds to return true
    return isXInBounds && isYInBounds && isZInBounds;
  }
}
