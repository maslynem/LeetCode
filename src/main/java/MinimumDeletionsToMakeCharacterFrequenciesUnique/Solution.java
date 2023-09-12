package MinimumDeletionsToMakeCharacterFrequenciesUnique;

import java.util.Arrays;

/**
 * A string s is called good if there are no two different characters in s that have the same frequency.
 * <p>
 * Given a string s, return the minimum number of characters you need to delete to make s good.
 */
class Solution {
    public int minDeletions(String s) {
        int[] frequencies = new int[27];
        for (char c : s.toCharArray()) {
            frequencies[c-'a']++;
        }
        Arrays.sort(frequencies);
        boolean[] appears = new boolean[s.length()+1];
        int result = 0;
        for (int j = 26; j < frequencies.length && frequencies[j] != 0; j--) {
            int i = frequencies[j];
            while (i > 0 && appears[i]) {
                result++;
                i--;
            }
            if (i > 0) appears[i] = true;
        }
        return result;
    }
}