package com.example;

import org.junit.Assert;

public class SolutionNGlasses {
    private static int minNoOfGlasses(int N, int K) {
        // Edge cases
        if (K == 0) return 0;
//        if (N * (N + 1) / 2 < K) return -1; // Sum of first N natural numbers is less than K

        // Initialize dp array
        int[] dp = new int[K + 1];
        for (int i = 1; i <= K; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0;

        // Fill dp array
        for (int i = 1; i <= N; i++) {
            for (int j = K; j >= i; j--) {
                if (dp[j - i] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - i] + 1);
                }
            }
        }

        return dp[K] == Integer.MAX_VALUE ? -1 : dp[K];
    }

    public static void main(String[] args) {

        int[][] testCases = {
                {5, 8, 2},
                {4, 10, 4},
                {3, 7, -1},
                {5, 5, 1},
                {10, 0, 0},
                {1, 1, 1},
                {10, 30, 4},
                {5, 16, -1},
                {7, 17, 3},
                {6, 20, 5}
        };

        for (int[] testCase : testCases) {
            Assert.assertEquals(testCase[2], minNoOfGlasses(testCase[0], testCase[1]));
        }
    }
}

/*
def min_change(N, K):
    ans = dp(K, N, {})
    return -1 if ans == float('inf') else ans

def dp(amount, N, memo):
    if (amount, N) in memo:
        return memo[(amount, N)]

    if amount == 0:
        return 0

    if amount < 0 or N == 0:
        return float('inf')

    min_glasses = float('inf')
    for glass in range(N, 0, -1):
        num_glasses = 1 + dp(amount - glass, glass - 1, memo)
        min_glasses = min(min_glasses, num_glasses)

    memo[(amount, N)] = min_glasses
    return min_glasses

    print(min_change(5, 8)) # 2
    print(min_change(4, 10)) # 4
    print(min_change(3, 7)) # -1
    print(min_change(5, 5)) # 1
    print(min_change(10, 0)) # 0
    print(min_change(1, 1)) # 1
    print(min_change(10, 30)) # 4
    print(min_change(5, 16)) # -1
    print(min_change(7, 17)) # 3
    print(min_change(6, 20)) # 5

 */

/*
def min_change(N, K):
    # Initialize the dp array with inf
    dp = [float('inf')] * (K + 1)

    # Base case: 0 liters can be achieved with 0 glasses
    dp[0] = 0

    # Fill the dp table
    for glass in range(1, N + 1):
        for amount in range(K, glass - 1, -1):
            dp[amount] = min(dp[amount], dp[amount - glass] + 1)

    return -1 if dp[K] == float('inf') else dp[K]

# Test cases
    print(min_change(5, 8))  # 2
    print(min_change(4, 10)) # 4
    print(min_change(3, 7))  # -1
    print(min_change(5, 5))  # 1
    print(min_change(10, 0)) # 0
    print(min_change(1, 1))  # 1
    print(min_change(10, 30))# 4
    print(min_change(5, 16)) # -1
    print(min_change(7, 17)) # 3
    print(min_change(6, 20)) # 5
 */
