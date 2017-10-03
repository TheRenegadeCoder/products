/**
 * A CodingTest is a special exam that knows its percentage of correct answers.
 * 
 * Copyright (C) 2017 Jeremy Griffith
 */
public class CodingTest {
  private int numberOfQuestions;
	private int numberOfCorrectAnswers;
	
	public CodingTest(int numberOfQuestions, int numberOfCorrectAnswers) throws IllegalArgumentException {
	  if (numberOfQuestions <= 0 || numberOfCorrectAnswers < 0) {
	    throw new IllegalArgumentException("You must supply valid input when creating a CodingTest");
	  }
	  this.numberOfQuestions = numberOfQuestions;
	  this.numberOfCorrectAnswers = numberOfCorrectAnswers;
	}

	public double getGradePercentage() {
	  return (this.numberOfCorrectAnswers / (double) this.numberOfQuestions) * 100;
	}
}
