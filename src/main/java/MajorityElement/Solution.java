package MajorityElement;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
            if (map.get(num) > n / 2) {
                return num;
            }
        }
        return -1;
    }
}