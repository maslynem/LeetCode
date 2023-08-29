package MaximumLengthOfPairChain;

import java.util.Arrays;
import java.util.Comparator;


/**
 * You are given an array of n pairs where pairs[i] = [lefti, righti] and lefti < righti.
 * <p>
 * A pair p2 = [c, d] follows a pair p1 = [a, b] if b < c. A chain of pairs can be formed in this fashion.
 * <p>
 * Return the length longest chain which can be formed.
 * <p>
 * You do not need to use up all the given intervals. You can select pairs in any order.
 */
public class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));
        int ans = 0;
        int last = Integer.MIN_VALUE;
        for (int[] pair : pairs) {
            if (pair[0] > last) {
                last = pair[1];
                ans++;
            }
        }
        return ans;
    }
}