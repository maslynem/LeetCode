package IsomorphicStrings;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 */

class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] sCharsCount = new int[256];
        int[] tCharsCount = new int[256];

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();
        for (int i = 0; i < sCharArray.length; i++) {
            char chS = sCharArray[i];
            char chT = tCharArray[i];

            if (sCharsCount[chS] != tCharsCount[chT]) {
                return false;
            }
            sCharsCount[chS] = i + 1;
            tCharsCount[chT] = i + 1;
        }
        return true;
    }
}