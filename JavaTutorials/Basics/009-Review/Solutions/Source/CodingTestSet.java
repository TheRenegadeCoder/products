/**
 * A CodingTestSet is a collection of CodingTests with special functionalities
 * like getting the exam average or retrieving the letter grade.
 * 
 * Copyright (C) 2017 Jeremy Griffith
 */
public class CodingTestSet {

    /**
     * An array of tests.
     */
    private CodingTest tests[];

    /**
     * The minimum grade required to receive an A.
     */
    private double aMin;

    /**
     * The minimum grade required to receive a B.
     */
    private double bMin;

    /**
     * The minimum grade required to receive a C.
     */
    private double cMin;

    /**
     * The minimum grade required to receive a D.
     */
    private double dMin;

    /**
     * The CodingTestSet constructor.
     * 
     * @param aMin the minimum percentage needed to get an A (0% - 100%)
     * @param bMin the minimum percentage needed to get a B (0% - A%)
     * @param cMin the minimum percentage needed to get a C (0% - B%)
     * @param dMin the minimum percentage needed to get a D (0% - C%)
     * @param numOfTests the number of tests this set will contain
     */
    public CodingTestSet(double aMin, double bMin, double cMin, double dMin, int numOfTests) {
        this.aMin = aMin;
        this.bMin = bMin;
        this.cMin = cMin;
        this.dMin = dMin;
        this.tests = new CodingTest[numOfTests];
    }

    /**
     * Inserts a test in the test set at a specified index.
     * 
     * @param i the index of the insert
     * @param test the test to be inserted
     */
    public void insertTest(int i, CodingTest test) {
        tests[i] = test;
    }

    /**
     * Calculates the average across the test set.
     * 
     * @return the average as a percentage
     */
    public double testAverage() {
        double sum = 0;
        for (int i = 0; i < this.tests.length; i++) {
            sum += this.tests[i].getGradePercentage();
        }
        return sum / this.tests.length;
    }

    /**
     * Gets the number of tests submitted.
     * 
     * @return the size of the test array
     */
    public int getTestSetSize() {
        return tests.length;
    }

    /**
     * Returns the letter grade based on predefined cutoff values.
     * 
     * @param index the index of the test in question
     * @return the letter grade for the test
     */
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
