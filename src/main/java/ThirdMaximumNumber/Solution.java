package ThirdMaximumNumber;

/**
 * Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
 */

class Solution {
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for (int n : nums) {
            if (n > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = n;
            } else if (n < firstMax && n > secondMax) {
                thirdMax = secondMax;
                secondMax = n;
            } else if (n < secondMax && n > thirdMax) {
                thirdMax = n;
            }
        }

        return thirdMax == Long.MIN_VALUE ? (int)firstMax : (int)thirdMax;

    }
}