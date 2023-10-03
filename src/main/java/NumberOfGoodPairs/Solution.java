package NumberOfGoodPairs;

/**
 * Given an array of integers nums, return the number of good pairs.
 * <p>
 * A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int[] visited = new int[101];
        int goodPair = 0;
        for (int num : nums) {
            goodPair += visited[num];
            visited[num] += 1;
        }
        return goodPair;
    }
}