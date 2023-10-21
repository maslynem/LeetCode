package ConstrainedSubsequenceSum;

import java.util.PriorityQueue;

/**
 * Given an integer array nums and an integer k, return the maximum sum of a non-empty subsequence of that array such that for every two consecutive integers in the subsequence, nums[i] and nums[j], where i < j, the condition j - i <= k is satisfied.
 * <p>
 * A subsequence of an array is obtained by deleting some number of elements (can be zero) from the array, leaving the remaining elements in their original order.
 */
class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) ->
                b[0] - a[0]
        );

        heap.add(new int[]{nums[0], 0});
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            while (i - heap.peek()[1] > k) {
                heap.remove();
            }

            int curr = Math.max(0, heap.peek()[0]) + nums[i];
            ans = Math.max(ans, curr);
            heap.add(new int[]{curr, i});
        }

        return ans;
    }
}