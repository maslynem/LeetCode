package MaximumLengthOfPairChain;

import java.util.Arrays;
import java.util.Comparator;

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