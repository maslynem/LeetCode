package LongestSubstringWithoutRepeatingCharacters;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 1;
        int first = 0;
        int second = 1;
        int[] arr = new int[128];
        arr[s.charAt(first)] += 1;
        while (second != s.length()) {
            if (arr[s.charAt(second)] == 1) {
                arr[s.charAt(first)] -= 1;
                first++;
            } else {
                count = Math.max(count, second - first + 1);
                arr[s.charAt(second)] += 1;
                second++;
            }
        }
        return count;
    }
}