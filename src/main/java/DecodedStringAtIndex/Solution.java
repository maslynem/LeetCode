package DecodedStringAtIndex;

/**
 * You are given an encoded string s. To decode the string to a tape, the encoded string is read one character at a time and the following steps are taken:
 * <p>
 * If the character read is a letter, that letter is written onto the tape.
 * If the character read is a digit d, the entire current tape is repeatedly written d - 1 more times in total.
 * Given an integer k, return the kth letter (1-indexed) in the decoded string
 */
class Solution {
    //aabaabaab
    public String decodeAtIndex(String s, int k) {
        int i;
        long size = 0;
        for (i = 0; size < k; i++) {
            char ch = s.charAt(i);
            size = Character.isDigit(ch) ? size * (ch - '0') : size + 1;
        }
        for (i--; i >= 0; i--) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                size /= ch - '0';
                k %= size;
            } else {
                if (k % size == 0) {
                    break;
                }
                size--;
            }
        }
        return Character.toString(s.charAt(i));
    }
}