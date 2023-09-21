package MinimumOperationsToReduceXToZero;

import java.util.Arrays;

/**
 * You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost or the rightmost element from the array nums and subtract its value from x. Note that this modifies the array for future operations.
 * <p>
 * Return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1.
 */
class Solution {
    public int minOperations(int[] nums, int x) {
        int target = Arrays.stream(nums).sum() - x;
        if (target == 0) {
            return nums.length;
        }
        int left = 0;
        int right = 0;
        int sum = 0;
        int count = Integer.MAX_VALUE;
        while (right < nums.length) {
            sum += nums[right];

            while (left < right && sum > target) {
                sum -= nums[left++];
            }

            if (sum == target) {
                count = Math.min(count, nums.length - (right-left+1));
            }
            right++;
        }
        return count == Integer.MAX_VALUE ? -1 : count;
    }
}