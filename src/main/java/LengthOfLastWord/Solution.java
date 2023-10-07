package LengthOfLastWord;

/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * <p>
 * A word is a maximal substring consisting of non-space characters only.
 */
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int counter = 0;
        for (; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                break;
            }
        }
        for (; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                return counter;
            }
            counter++;
        }
        return counter;
    }
}