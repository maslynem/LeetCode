package TwoSum;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int digit = target - nums[i];
            if (map.containsKey(digit)) {
                return new int[]{
                        i,
                        map.get(digit)
                };
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }
}