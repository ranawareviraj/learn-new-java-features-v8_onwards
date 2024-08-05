package com.example;

public class Main {
    // Function to get the lexicographically largest possible string
    public static String helper(String word1, String word2) {
        if (word1.isEmpty() || word2.isEmpty()) {
            return word1 + word2;
        }

        if (word1.compareTo(word2) > 0) {
            return word1.charAt(0) + helper(word1.substring(1), word2);
        }

        return word2.charAt(0) + helper(word1, word2.substring(1));

    }



    public static void main(String[] args) {
        // Provide two strings
        String string1 = "lord";
        String string2 = "w";

        // Call the helper function
        String result = helper(string1, string2);

        // Print the lexicographically largest possible string
        System.out.println("The lexicographically largest possible string is: " + result);
    }
}