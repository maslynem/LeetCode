package SearchInRotatedSortedArray;

/**
 * There is an integer array nums sorted in ascending order (with distinct values).
 * <p>
 * Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
 * <p>
 * Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            return nums[0] == target ? 0 : -1;
        }
        int k = 0;
        int first = 0;
        int last = nums.length - 1;
        while (nums[first] > nums[last]) {
            k++;
            last--;
        }
        int[] restoredNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            restoredNums[(i + k) % nums.length] = nums[i];
        }
        int left = 0;
        int right = restoredNums.length - 1;
        while (left <= right) {
            int mid = (left + right) >>> 1;
            if (restoredNums[mid] == target) {
                return (restoredNums.length + (mid - k)) % restoredNums.length;
            }
            if (restoredNums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

}