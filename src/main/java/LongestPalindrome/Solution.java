package LongestPalindrome;

/**
 * Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
 * <p>
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 */
class Solution {
    public int longestPalindrome(String s) {
        int[] chArr = new int[128];

        for (char ch : s.toCharArray()) {
            chArr[ch]++;
        }
        int result = 0;
        for (int j : chArr) {
            result += j / 2 * 2;
            if (result % 2 == 0 && j % 2 == 1) {
                result++;
            }
        }

        return result;
    }
}