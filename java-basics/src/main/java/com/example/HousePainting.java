package com.example;

import org.junit.Assert;

public class HousePainting {
    private static final int MOD = 1000000007;

    public static int countWaysToPaintHouses(int n) {
        if (n % 2 != 0) {
            return 0;  // n must be even
        }

        int[][][] dp = new int[n / 2 + 1][3][3];

        // Initialize the base cases
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                if (j != k) {
                    dp[1][j][k] = 1;
                }
            }
        }

        // Fill the dp table
        for (int i = 2; i <= n / 2; i++) {
            for (int j = 0; j < 3; j++) {  // current house color
                for (int k = 0; k < 3; k++) {  // its pair house color
                    if (j == k) {
                        continue;
                    }
                    dp[i][j][k] = 0;
                    for (int pj = 0; pj < 3; pj++) {  // previous house color
                        for (int pk = 0; pk < 3; pk++) {  // its pair house previous color
                            if (pj != j && pk != k && pj != pk) {
                                dp[i][j][k] = (dp[i][j][k] + dp[i - 1][pj][pk]) % MOD;
                            }
                        }
                    }
                }
            }
        }

        // Sum up all valid ways for the last pair of houses
        int result = 0;
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                if (j != k) {
                    result = (result + dp[n / 2][j][k]) % MOD;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Assert.assertEquals(countWaysToPaintHouses(2), 6);
        Assert.assertEquals(countWaysToPaintHouses(3), 0);
        Assert.assertEquals(countWaysToPaintHouses(4), 18);
        Assert.assertEquals(countWaysToPaintHouses(5), 0);
        Assert.assertEquals(countWaysToPaintHouses(6), 54);
    }
}
