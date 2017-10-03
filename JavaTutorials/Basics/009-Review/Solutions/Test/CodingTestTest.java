import junit.framework.TestCase;

/**
 * A JUnit test class for the CodingTest class.
 * 
 * Copyright (C) 2017 Jeremy Griffith
 */
public class CodingTestTest extends TestCase {
  
    protected CodingTest codingTest;
    
    protected void setUp() {
        Answer a = new Answer("Fiesta", 1);
        Answer b = new Answer("Correr", 0);
        Answer c = new Answer("Invierno", 0);
        Answer d = new Answer("Hola", 0);
        Question one = new Question("Como se dice 'party' en espanol?", new Answer[]{a, b, c, d}); // UTF-8 :(
        codingTest = new CodingTest(new Question[]{one});
    }
  
    public void testGetGradePercentage() {
        codingTest.getQuestions()[0].select('A');
        assertEquals(100.0, codingTest.getGradePercentage());
        assertFalse(50.0 == codingTest.getGradePercentage());
    }
}
