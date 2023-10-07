package ContainsDuplicateII;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 */
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer prevIndex = map.get(nums[i]);
            if (prevIndex != null && i - prevIndex <= k)
                return true;
            map.put(nums[i], i);
        }
        return false;
    }
}