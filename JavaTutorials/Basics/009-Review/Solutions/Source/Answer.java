/**
 * The answer class.
 *
 * Copyright (C) 2017 Jeremy Griffith
 */
public class Answer {

    /**
     * The text for this answer.
     */
    private final String text;

    /**
     * Determines if this answer is selected.
     */
    private boolean isSelected;

    /**
     * Determines if this is the correct answer.
     */
    private final int isCorrect;

    /**
     * The Answer constructor.
     *
     * @param text the text for this Answer.
     * @param isCorrect the correct indicator for this Answer.
     */
    public Answer(final String text, final int isCorrect) {
        this.text = text;
        this.isCorrect = isCorrect;
        this.isSelected = false;
    }

    public Answer(Answer answer) {
        this.text = answer.text;
        this.isCorrect = answer.isCorrect;
        this.isSelected = answer.isSelected;
    }

    /**
     * Overrides the base toString method.
     */
    @Override
    public String toString() {
        return text;
    }

    /**
     * Determines if this answer is selected.
     *
     * @return true if this answer is selected
     */
    public boolean isSelected() {
        return this.isSelected;
    }

    /**
     * Determines if this answer is correct.
     *
     * @return true if this answer is correct
     */
    public boolean isCorrect() {
        if (isCorrect == 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * An action that allows a user to select this answer.
     */
    public void select() {
        this.isSelected = true;
    }
}
