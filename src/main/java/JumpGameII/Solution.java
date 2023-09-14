package JumpGameII;

/**
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
 * <p>
 * Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
 * <p>
 * 0 <= j <= nums[i] and
 * i + j < n
 * Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
 */
class Solution {
    public int jump(int[] nums) {

        int[] dp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int farthestJump = Math.min(i + num + 1, nums.length);
            for (int j = i + 1; j < farthestJump; j++) {
                dp[j] = dp[j] == 0 ? dp[i] + 1 : Math.min(dp[j], dp[i] + 1);
            }
        }
        return dp[nums.length - 1];
    }
}