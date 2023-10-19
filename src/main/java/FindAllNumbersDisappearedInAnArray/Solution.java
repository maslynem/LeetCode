package FindAllNumbersDisappearedInAnArray;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n +1];
        for (int num : nums) {
            visited[num] = true;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                result.add(i);
            }
        }
        return result;
    }
}