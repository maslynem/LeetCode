package MonotonicArray;

/**
 * An array is monotonic if it is either monotone increasing or monotone decreasing.
 * <p>
 * An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
 * <p>
 * Given an integer array nums, return true if the given array is monotonic, or false otherwise.
 */
class Solution {
    public boolean isMonotonic(int[] nums) {
        if (nums.length == 1) return true;
        Boolean increase = null;
        for (int i = 1; i < nums.length; i++) {
            int prev = nums[i-1];
            int cur = nums[i];
            if (prev == cur) continue;
            if (increase == null && prev < cur) {
                increase = true;
            } else if (increase == null) {
                increase = false;
            }
            if ((prev < cur && !increase) || (prev > cur && increase)) {
                return false;
            }
        }
        return true;
    }
}