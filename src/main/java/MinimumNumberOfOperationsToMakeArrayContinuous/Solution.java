package MinimumNumberOfOperationsToMakeArrayContinuous;

import java.util.Arrays;
import java.util.HashSet;

/**
 * You are given an integer array nums. In one operation, you can replace any element in nums with any integer.
 * <p>
 * nums is considered continuous if both of the following conditions are fulfilled:
 * <p>
 * All elements in nums are unique.
 * The difference between the maximum element and the minimum element in nums equals nums.length - 1.
 * For example, nums = [4, 2, 5, 3] is continuous, but nums = [1, 2, 3, 5, 6] is not continuous.
 * <p>
 * Return the minimum number of operations to make nums continuous.
 */
class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int ans = n;

        HashSet<Integer> unique = new HashSet<>();
        for (int num : nums) {
            unique.add(num);
        }

        int[] newNums = new int[unique.size()];
        int index = 0;

        for (int num : unique) {
            newNums[index++] = num;
        }

        Arrays.sort(newNums);

        int j = 0;
        for (int i = 0; i < newNums.length; i++) {
            while (j < newNums.length && newNums[j] < newNums[i] + n) {
                j++;
            }

            int count = j - i;
            ans = Math.min(ans, n - count);
        }

        return ans;
    }
}