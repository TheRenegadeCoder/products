/**
 * A CodingTestSet is a collection of CodingTests with special functionalities like
 * getting the exam average or retrieving the letter grade.
 * 
 * Copyright (C) 2017 Jeremy Griffith
 */
public class CodingTestSet {
  private CodingTest tests[];
  private double aMin;
  private double bMin;
  private double cMin;
  private double dMin;
  
  public CodingTestSet(double aMin, double bMin, double cMin, double dMin, CodingTest[] tests) {
    this.aMin = aMin;
    this.bMin = bMin;
    this.cMin = cMin;
    this.dMin = dMin;
    this.tests = tests;
  }
  
  public double testAverage() {
    double sum = 0;
    for (int i = 0; i < this.tests.length; i++) {
      sum += this.tests[i].getGradePercentage();
    }
    return sum / this.tests.length;
  }
  
  public int getTestSetSize() {
    return tests.length;
  }
  
  public String getLetterGrade(int index) {
    double score = this.tests[index].getGradePercentage();
    if (score >= aMin) {
      return "A";
    } else if (score >= bMin) {
      return "B";
    } else if (score >= cMin) {
      return "C";
    } else if (score >= dMin) {
      return "D";
    } else {
      return "F";
    }
  }
}

