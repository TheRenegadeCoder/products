package com.trc.strings;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringManipulationTest {

    @Test
    public void testIsAlphabetical() {
        assertTrue(StringManipulation.isAlphabetical("abcd"));
        assertTrue(StringManipulation.isAlphabetical("ACdf"));
        assertFalse(StringManipulation.isAlphabetical("Fed"));
        assertTrue(StringManipulation.isAlphabetical("ab-cd"));
        assertFalse(StringManipulation.isAlphabetical("c-ab"));
    }

    @Test
    public void testReverseString() {
        assertEquals("racecar", StringManipulation.reverseString("racecar"));
        assertEquals("dab", StringManipulation.reverseString("bad"));
        assertEquals("", StringManipulation.reverseString(""));
        assertEquals("a", StringManipulation.reverseString("a"));
    }

    @Test
    public void testCapitalizeVowels() {
        assertEquals("hEllO", StringManipulation.capitalizeVowels("hello"));
        assertEquals("A", StringManipulation.capitalizeVowels("a"));
        assertEquals("b", StringManipulation.capitalizeVowels("b"));
        assertEquals("AnImAl PEOplE", StringManipulation.capitalizeVowels("Animal People"));
        assertEquals("AEIOU", StringManipulation.capitalizeVowels("aeiou"));
    }

    @Test
    public void testInsertSpacesBetweenLetters() {
        assertEquals("h e l l o", StringManipulation.insertSpacesBetweenLetters("hello"));
        assertEquals("E x t r a S p a c e", StringManipulation.insertSpacesBetweenLetters("Extra Space"));
        assertEquals("h o w d y", StringManipulation.insertSpacesBetweenLetters("    ho    wd y   "));
    }

    @Test
    public void testConvertToHex() {
        assertEquals("68656C6C6F", StringManipulation.convertToHex("hello"));
        assertEquals("", StringManipulation.convertToHex(""));
        assertEquals("0A", StringManipulation.convertToHex("\n"));
        assertEquals("20", StringManipulation.convertToHex(" "));
    }

    @Test
    public void testRemoveChar() {
        assertEquals("heo", StringManipulation.removeChar("hello", 'l'));
        assertEquals("", StringManipulation.removeChar("", 'a'));
        assertEquals("hello", StringManipulation.removeChar("hello", 't'));
        assertEquals("hello", StringManipulation.removeChar("    h e l   l o   ", ' '));
    }

    @Test
    public void testGenerateAllChars() {
        assertEquals("abcde", StringManipulation.generateAllChars('a', 'e'));
    }
}
