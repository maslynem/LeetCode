package IsSubsequence;

/**
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * <p>
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 */
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        int n = t.length();
        int m = s.length();
        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        if (m < 1) {
            return true;
        }
        if (n > m) {
            return false;
        }
        while (i < n) {
            if (tCharArray[i] == sCharArray[j]) {
                j++;
            }
            i++;

            if (j == m)
                return true;
        }

        return false;
    }
}