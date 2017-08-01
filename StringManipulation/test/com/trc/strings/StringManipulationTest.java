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
        assertEquals(StringManipulation.reverseString("racecar"), "racecar");
        assertEquals(StringManipulation.reverseString("bad"), "dab");
        assertEquals(StringManipulation.reverseString(""), "");
        assertEquals(StringManipulation.reverseString("a"), "a");
    }
}
