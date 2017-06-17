package com.trc.strings;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class StringManipulationTest {

    @Test
    public void testIsAlphabetical() {
        assertTrue(StringManipulation.isAlphabetical("abcd"));
    }

}
