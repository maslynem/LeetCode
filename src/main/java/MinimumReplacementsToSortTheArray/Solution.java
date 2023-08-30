package MinimumReplacementsToSortTheArray;

/**
 * You are given a 0-indexed integer array nums. In one operation you can replace any element of the array with any two elements that sum to it.
 * <p>
 * For example, consider nums = [5,6,7]. In one operation, we can replace nums[1] with 2 and 4 and convert nums to [5,2,4,7].
 * Return the minimum number of operations to make an array that is sorted in non-decreasing order.
 */
public class Solution {

    public long minimumReplacement(int[] nums) {
        int n = nums.length;
        long answer = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] <= nums[i + 1]) {
                continue;
            }
            //  long numElements = (long)(nums[i] + nums[i + 1] - 1) / (long)nums[i + 1];
            long numsElement;
            if (nums[i] % nums[i + 1] == 0) {
                numsElement = nums[i] / nums[i + 1];
            } else {
                numsElement = nums[i] / nums[i + 1] + 1L;
            }
            answer += numsElement - 1;
            nums[i] = nums[i] / (int) numsElement;
        }
        return answer;
    }

}
