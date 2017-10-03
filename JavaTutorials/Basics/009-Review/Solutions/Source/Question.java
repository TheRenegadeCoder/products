/**
 * A question class.
 *
 * Copyright (C) 2017 Jeremy Griffith
 */
public class Question {

    /**
     * The text for this question.
     */
    private final String text;

    /**
     * The available answers for this question.
     */
    private final Answer[] answers;

    /**
     * The Question constructor.
     *
     * @param text the text for this question
     * @param answers an array of question answers
     */
    public Question(final String text, final Answer[] answers) {
        this.text = text;
        this.answers = answers;
    }

    public Question(Question question) {
      this.text = question.text;
      this.answers = new Answer[question.answers.length];
      for (int i = 0; i < this.answers.length; i++) {
        this.answers[i] = new Answer(question.answers[i]);
      }
    }

    /**
     * Overrides the base toString method.
     */
    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(text);
        builder.append("\n");
        for (int i = 0; i < this.answers.length; i++) {
            builder.append(answers[i].toString());
            builder.append("\n");
        }
        return builder.toString();
    }

    /**
     * Gets the selected answer.
     *
     * @return the first selected answer
     */
    public Answer getSelected() {
        for (int i = 0; i < answers.length; i++) {
            if (answers[i].isSelected()) {
                return answers[i];
            }
        }
        return null;
    }

    /**
     * Selects an answer.
     *
     * @param answer a character representing a choice
     */
    public void select(final char answer) {
        switch (answer) {
        case 'A':
            answers[0].select();
            break;
        case 'B':
            answers[1].select();
            break;
        case 'C':
            answers[2].select();
            break;
        case 'D':
            answers[3].select();
            break;
        }
    }
}
