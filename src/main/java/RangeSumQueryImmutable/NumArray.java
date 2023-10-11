package RangeSumQueryImmutable;

/**
 * Given an integer array nums, handle multiple queries of the following type:
 * <p>
 * Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
 * Implement the NumArray class:
 * <p>
 * NumArray(int[] nums) Initializes the object with the integer array nums.
 * int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 */
class NumArray {
    private final int[] nums;

    private final int[] data;


    public NumArray(int[] nums) {
        this.nums = nums;
        data = new int[nums.length+1];
        prepareData();
    }

    public int sumRange(int left, int right) {
        return data[right+1] - data[left];
    }

    private void prepareData() {
        for (int i = 0; i < nums.length; i++) {
            data[i+1] = data[i] + nums[i];
        }
    }
}