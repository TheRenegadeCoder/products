import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * The Grader serves as a grade automation class.
 *
 * Copyright (C) 2017 Jeremy Griffith
 */
public class Grader {

    /**
     * The grader's copy of the rubric.
     */
    private CodingTest rubric;

    /**
     * The grader's set of tests.
     */
    private CodingTestSet tests;

    /**
     * Reads in a rubric from a path and generates a template exam from it.
     *
     * @param pathToRubric a path to the rubric file
     * @param numOfQuestions the number of questions in the rubric file
     * @return a template CodingTest
     */
    public void readRubric(final String pathToRubric) {
        // A try-with-resources block for IO
        try (BufferedReader br = new BufferedReader(new FileReader(pathToRubric))) {

            String line = br.readLine();
            int numOfQuestions = Integer.parseInt(line);

            int j = 0;
            final Question[] questions = new Question[numOfQuestions];
            // Loop over every question in the rubric
            while (j < numOfQuestions && (line = br.readLine()) != null) {
                final String[] parts = line.split(";");
                if (parts.length == 4) {
                    this.tests = new CodingTestSet(Double.parseDouble(parts[0]), Double.parseDouble(parts[1]),
                            Double.parseDouble(parts[2]), Double.parseDouble(parts[3]), numOfQuestions);
                } else if (parts.length != 5) {
                    System.out.println("Syntax Error: " + line);
                } else {
                    final Answer[] answers = new Answer[4];
                    // Loop over all of the answers for this question
                    for (int i = 1; i < parts.length; i++) {
                        final String[] answer = parts[i].split(":");
                        answers[i - 1] = new Answer(answer[0], Integer.parseInt(answer[1]));
                    }
                    final Question q = new Question(parts[0], answers);
                    questions[j] = q;
                    j++;
                }
            }
            this.rubric = new CodingTest(questions);
        } catch (final IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Reads a completed test and converts it to a coding test.
     * 
     * @param pathToTest a path to a test file as a String
     * @return a CodingTest
     */
    public CodingTest readCompletedTest(final String pathToTest) {
        CodingTest test = new CodingTest(rubric);
        try (BufferedReader br = new BufferedReader(new FileReader(pathToTest))) {
            String line;
            int i = 0;
            while (i < rubric.getQuestions().length && (line = br.readLine()) != null) {
                test.getQuestions()[i].select(line.charAt(0));
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return test;
    }

    /**
     * Grades a set of real tests.
     * 
     * @param pathsToTests an array of paths as Strings
     */
    public void gradeTests(final String[] pathsToTests) {
        for (int i = 0; i < pathsToTests.length; i++) {
            CodingTest test = this.readCompletedTest(pathsToTests[i]);
            this.tests.insertTest(i, test);
            System.out.println(pathsToTests[i] + ": " + this.tests.getLetterGrade(i));
        }
    }

    /**
     * The primary drop in method for the program.
     *
     * @param args a set of command line arguments
     */
    public static void main(final String[] args) {

        if (args.length >= 2) {
            Grader grader = new Grader();
            grader.readRubric(args[0]);
            String[] pathsToTests = Arrays.copyOfRange(args, 1, args.length);
            grader.gradeTests(pathsToTests);
        } else {
            String err = "Try: Grader [/absolute/path/to/rubric] [/absolute/path/to/test_1] ... [/absolute/path/to/test_n]";
            System.out.println(err);
        }
    }
}
