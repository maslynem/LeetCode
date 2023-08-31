package SearchInsertPosition;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (right + left) >>> 1;
            int midVal = nums[mid];

            if (midVal < target)
                left = mid + 1;
            else if (midVal > target)
                right = mid - 1;
            else
                return mid;
        }
        return left;
    }

}