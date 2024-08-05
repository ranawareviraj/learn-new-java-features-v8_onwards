package com.example;

import org.junit.Assert;

public class WordGenerator {
    private static final int MOD = 1000000007;

    public static int countValidWords(int wordLen, int maxVowels) {
        if (wordLen == 0) {
            return 0;
        }

        int vowels = 5;
        int consonants = 21;

        // Initialize the dp table
        int[][][] dp = new int[wordLen + 1][maxVowels + 1][2];
        dp[0][0][0] = 1; // One way to have a word of length 0 with no vowels

        for (int i = 1; i <= wordLen; i++) {
            for (int j = 0; j <= maxVowels; j++) {
                // Ending with consonant
                dp[i][0][0] = (dp[i][0][0] + dp[i - 1][j][0] * consonants) % MOD;
                dp[i][0][0] = (dp[i][0][0] + dp[i - 1][j][1] * consonants) % MOD;

                // Ending with vowel
                if (j > 0) {
                    dp[i][j][1] = (dp[i][j][1] + dp[i - 1][j - 1][1] * vowels) % MOD;
                }
                dp[i][0][0] = (dp[i][0][0] + dp[i - 1][j][1] * consonants) % MOD;
            }
        }

        // Sum up all valid configurations of length wordLen
        int result = 0;
        for (int j = 0; j <= maxVowels; j++) {
            result = (result + dp[wordLen][j][0]) % MOD;
            result = (result + dp[wordLen][j][1]) % MOD;
        }

        return result;
    }

    public static void main(String[] args) {
        Assert.assertEquals(441, countValidWords(2, 0));
        Assert.assertEquals(676, countValidWords(2, 2));
        Assert.assertEquals(26, countValidWords(1, 1));
        Assert.assertEquals(412776, countValidWords(4, 1));
    }
}
