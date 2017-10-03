import junit.framework.TestCase;

/**
 * A JUnit test class for the CodingTest class.
 * 
 * Copyright (C) 2017 Jeremy Griffith
 */
public class QuestionTest extends TestCase {
  
    protected Answer a;
    protected Question question;
    
    protected void setUp() {
        a = new Answer("Fiesta", 1);
        Answer b = new Answer("Correr", 0);
        Answer c = new Answer("Invierno", 0);
        Answer d = new Answer("Hola", 0);
        question = new Question("Como se dice 'party' en espanol?", new Answer[]{a, b, c, d}); // UTF-8 :(
    }
  
    public void testGetSelected() {
        assertNull(question.getSelected());
        question.select('A');
        assertEquals(a, question.getSelected());
    }
}
