/**
 * The Grader serves as a grade automation class.
 * 
 * Copyright (C) 2017 Jeremy Griffith
 */
public class Grader {
  public static void main(String[] args) {
    CodingTest tests[] = {
        new CodingTest(5, 2),
        new CodingTest(5, 3),
        new CodingTest(5, 4),
        new CodingTest(5, 5)
    };

    CodingTestSet morningExams = new CodingTestSet(90, 80, 65, 50, tests);

    for (int i = 0; i < morningExams.getTestSetSize(); i++) {
      String gradeMessage = String.format("Grade for test %d is %s", i, morningExams.getLetterGrade(i));
      System.out.println(gradeMessage);
    }
  }
}
