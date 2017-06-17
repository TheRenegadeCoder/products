package com.trc.strings;

/**
 * A string manipulation class.
 * 
 * Copyright (C) 2017 Jeremy Griffith
 */
public class StringManipulation {

    public static boolean isAlphabetical(String input) {
        char prev = 0;
        for (int i = 0; i < input.length(); i++) {
            char curr = Character.toLowerCase(input.charAt(i));
            if (prev > curr) {
                return false;
            }
            prev = curr;
        }
        return true;
    }

}
