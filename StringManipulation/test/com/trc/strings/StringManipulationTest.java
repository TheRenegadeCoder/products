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
    }
}
