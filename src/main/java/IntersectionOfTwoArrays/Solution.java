package IntersectionOfTwoArrays;

import java.util.HashSet;

/**
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (Integer n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<>();
        for (Integer n : nums2) set2.add(n);
        set1.retainAll(set2);
        int [] output = new int[set1.size()];
        int idx = 0;
        for (int s : set1) output[idx++] = s;
        return output;
    }
}