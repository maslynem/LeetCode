package RotateArray;

import java.util.Arrays;

/**
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */
class Solution {
    public void rotate(int[] nums, int k) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        for (int j = 0; j < temp.length; j++) {
            nums[(j + k) % nums.length] = temp[j];
        }
    }
}