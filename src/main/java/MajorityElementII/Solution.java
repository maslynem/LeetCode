package MajorityElementII;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
 */
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int countMajority = nums.length / 3;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for (int num : nums) {
            map.merge(num, 1, Integer::sum);
        }
        for (var entry : map.entrySet()) {
            if (entry.getValue() > countMajority) {
                result.add(entry.getKey());
            }
        }
        return result;
    }
}