package Candy;

import java.util.Arrays;

/**
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
 * <p>
 * You are giving candies to these children subjected to the following requirements:
 * <p>
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 */
class Solution {
    public int candy(int[] ratings) {
        int[] dp = new int[ratings.length];
        Arrays.fill(dp, 1);
        int result = 0;
        for (int i = 0; i < ratings.length; i++) {
            if (dp[i] == 1) {
                dp[i] = getCandy(ratings, dp, i);
            }
            result += dp[i];
        }
        return result;
    }

    private int getCandy(int[] ratings, int[] dp, int i) {
        if (dp[i] != 1) {
            return dp[i];
        }
        dp[i] = 1;
        int currentRating = ratings[i];

        if (i - 1 >= 0 && currentRating > ratings[i - 1] && dp[i] <= dp[i - 1]) {
            dp[i] = dp[i - 1] + 1;
        }

        if (i + 1 != ratings.length && (currentRating > ratings[i + 1])) {
            if (dp[i + 1] == 1) {
                getCandy(ratings, dp, i + 1);
            }
            if (dp[i] <= dp[i + 1]) {
                dp[i] = dp[i + 1] + 1;
            }
        }
        return dp[i];
    }
}