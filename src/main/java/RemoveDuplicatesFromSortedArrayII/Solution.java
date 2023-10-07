package RemoveDuplicatesFromSortedArrayII;

/**
 * Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice. The relative order of the elements should be kept the same.
 */
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int counter = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i]) {
                nums[++k] = nums[i];
                counter = 1;
            } else if (counter != 2) {
                nums[++k] = nums[i];
                counter++;
            }
        }
        return k + 1;
    }
}