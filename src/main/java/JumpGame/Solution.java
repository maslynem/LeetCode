package JumpGame;

/**
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * <p>
 * Return true if you can reach the last index, or false otherwise.
 */
class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (dp[i]) {
                int num = nums[i];
                for (int j = i + 1; j <= i + num && j < nums.length; j++) {
                    dp[j] = true;
                }
            }
        }
        return dp[nums.length - 1];
    }
}