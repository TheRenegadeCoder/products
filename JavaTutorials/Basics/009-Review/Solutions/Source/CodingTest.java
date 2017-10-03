/**
 * A CodingTest is a special exam that knows its percentage of correct answers.
 *
 * Copyright (C) 2017 Jeremy Griffith
 */
public class CodingTest {

    /**
     * An array of questions.
     */
    private final Question[] questions;

    /**
     * The CodingTest constructor.
     *
     * @param questions an array of questions.
     */
    public CodingTest(final Question[] questions) {
        this.questions = questions;
    }

    /**
     * CodingTest copy constructor.
     * 
     * @param test another coding test
     */
    public CodingTest(final CodingTest test) {
        this.questions = new Question[test.questions.length];
        for (int i = 0; i < this.questions.length; i++) {
            this.questions[i] = new Question(test.questions[i]);
        }
    }

    /**
     * Question array getter.
     * 
     * @return the question array
     */
    public Question[] getQuestions() {
        return this.questions;
    }

    /**
     * Overrides the base toString method.
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.questions.length; i++) {
            builder.append(questions[i].toString());
        }
        return builder.toString();
    }

    /**
     * Gets the score on this test.
     *
     * @return score as percentage
     */
    public double getGradePercentage() {
        int totalCorrect = 0;
        for (int i = 0; i < questions.length; i++) {
            final Answer selected = questions[i].getSelected();
            if (selected.isCorrect()) {
                totalCorrect++;
            }
        }
        return (totalCorrect / questions.length) * 100;
    }
}
