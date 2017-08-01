package com.trc.strings;

/**
 * A string manipulation class.
 * 
 * This class serves as a potential solution for the String Manipulation
 * problem.
 * 
 * Copyright (C) 2017 Jeremy Griffith
 */
public class StringManipulation {

    /**
     * The isAlphabetical method is used to determine if the characters in a
     * string are in alphabetical order. Characters are case insensitive and
     * symbols are ignored.
     * 
     * @param input a string under test
     * @return true if the string is in alphabetical order
     */
    public static boolean isAlphabetical(String input) {
        char prev = 0;
        for (int i = 0; i < input.length(); i++) {
            char curr = Character.toLowerCase(input.charAt(i));
            if (Character.isLetter(prev) && Character.isLetter(curr)) {
                if (prev > curr) {
                    return false;
                }
            }

            if (Character.isLetter(curr)) {
                prev = curr;
            }
        }
        return true;
    }

    /**
     * The reverseString method is used to reverse an input string.
     * 
     * @param input a string to be reversed
     * @return the resulting string in reverse order
     */
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

}
