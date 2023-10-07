package BuildArray;

import java.util.Arrays;

/**
 * You are given three integers n, m and k. Consider the following algorithm to find the maximum element of an array of positive integers:
 * <p>
 * You should build the array arr which has the following properties:
 * <p>
 * arr has exactly n integers.
 * 1 <= arr[i] <= m where (0 <= i < n).
 * After applying the mentioned algorithm to arr, the value search_cost is equal to k.
 * Return the number of ways to build the array arr under the mentioned conditions. As the answer may grow large, the answer must be computed modulo 109 + 7.
 */
class Solution {
    int[][][] memo;
    int MOD = (int) 1e9 + 7;
    int n;
    int m;

    public int numOfArrays(int n, int m, int k) {
        memo = new int[n][m + 1][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                Arrays.fill(memo[i][j], -1);
            }
        }

        this.n = n;
        this.m = m;
        return dp(0, 0, k);
    }

    public int dp(int i, int maxSoFar, int remain) {
        if (i == n) {
            if (remain == 0) {
                return 1;
            }

            return 0;
        }

        if (remain < 0) {
            return 0;
        }

        if (memo[i][maxSoFar][remain] != -1) {
            return memo[i][maxSoFar][remain];
        }

        int ans = 0;
        for (int num = 1; num <= maxSoFar; num++) {
            ans = (ans + dp(i + 1, maxSoFar, remain)) % MOD;
        }

        for (int num = maxSoFar + 1; num <= m; num++) {
            ans = (ans + dp(i + 1, num, remain - 1)) % MOD;
        }

        memo[i][maxSoFar][remain] = ans;
        return ans;
    }
}