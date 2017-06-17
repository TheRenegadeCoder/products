package com.trc.strings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringManipulationTest {

    @Test
    public void testIsAlphabetical() {
        assertTrue(StringManipulation.isAlphabetical("abcd"));
        assertTrue(StringManipulation.isAlphabetical("ACdf"));
        assertFalse(StringManipulation.isAlphabetical("Fed"));
    }

}
