package MaximumScoreOfGoodSubarray;

import java.util.Arrays;
import java.util.Stack;

/**
 * You are given an array of integers nums (0-indexed) and an integer k.
 * <p>
 * The score of a subarray (i, j) is defined as min(nums[i], nums[i+1], ..., nums[j]) * (j - i + 1). A good subarray is a subarray where i <= k <= j.
 * <p>
 * Return the maximum possible score of a good subarray.
 */
class Solution {
    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        int[] left = new int[n];
        Arrays.fill(left, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                left[stack.pop()] = i;
            }

            stack.push(i);
        }

        int[] right = new int[n];
        Arrays.fill(right, n);
        stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] > nums[i]) {
                right[stack.pop()] = i;
            }

            stack.push(i);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (left[i] < k && right[i] > k) {
                ans = Math.max(ans, nums[i] * (right[i] - left[i] - 1));
            }
        }

        return ans;
    }
}