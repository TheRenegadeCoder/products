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

    /**
     * The capitalizeVowels method is used to capitalize all of the vowels in an
     * input string.
     * 
     * @param input a string to be modified
     * @return a string with all of the vowels capitalized
     */
    public static String capitalizeVowels(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char curr = Character.toUpperCase(input.charAt(i));
            if (curr == 65 || curr == 69 || curr == 73 || curr == 79 || curr == 85) {
                sb.append(curr);
            } else {
                sb.append(input.charAt(i));
            }
        }
        return sb.toString();
    }

    /**
     * The insertSpacesBetweenLetters method adds spaces in between letters. In
     * addition, the method trims leading and trailing whitespace as well as
     * extraneous space in the middle.
     * 
     * @param input a string to be modified
     * @return a string with spaces between every letter
     */
    public static String insertSpacesBetweenLetters(String input) {
        StringBuilder sb = new StringBuilder();
        int charCount = 0;
        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (curr != 32) {
                charCount++;
                sb.append(curr);
                if (i < input.length() - 1) {
                    sb.append(' ');
                }
            }
        }
        // Performs some cleanup for trailing spaces
        if (charCount * 2 == sb.length()) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /**
     * The convertToHex method takes a string and converts each character to hex
     * before assembling a complete hex string. Assumes ASCII such that each
     * character is represented by two hex values.
     * 
     * @param input a string to be modified
     * @return a string as a hex version of the input
     */
    public static String convertToHex(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            String hexString = String.format("%02X", (int) curr);
            sb.append(hexString);
        }
        return sb.toString();
    }

    /**
     * The removeChar methods takes a string and removes all instances of a
     * particular character.
     * 
     * @param input a string to be modified
     * @param toRemove a character to remove from the input string
     * @return a string with all instances of a particular character removed
     */
    public static String removeChar(String input, char toRemove) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char curr = input.charAt(i);
            if (curr != toRemove) {
                sb.append(curr);
            }
        }
        return sb.toString();
    }

    /**
     * The generateAllChars method takes two characters and generates a string
     * from all the characters in between inclusively. The string will be in
     * ASCII order.
     * 
     * @param start the first character defining the range of characters
     * @param end the last character defining the range of characters
     * @return a string containing all characters from start to end
     */
    public static String generateAllChars(char start, char end) {
        // Special case where the end is before the start
        if (start > end) {
            char temp = start;
            start = end;
            end = temp;
        }

        // The generation algorithm
        StringBuilder sb = new StringBuilder();
        for (char curr = start; curr <= end; curr++) {
            sb.append(curr);
        }
        return sb.toString();
    }

    /**
     * The containsSubSequence method accepts two strings where the first string
     * is searched for the second string in the same order.
     * 
     * @param input a string under search
     * @param subsequence the sequence to search for
     * @return true if the input string contains the subsequence string
     */
    public static boolean containsSubSequence(String input, String subsequence) {
        // Special case where the subsequence is larger than the input
        if (subsequence.length() > input.length()) {
            return false;
        }

        // Traverse both strings
        int j = 0;
        for (int i = 0; i < input.length() && j < subsequence.length() - 1; i++) {
            if (input.charAt(i) == subsequence.charAt(j)) {
                j++;
            }
        }

        // Final check
        if (j == subsequence.length() - 1) {
            return true;
        } else {
            return false;
        }
    }
}
