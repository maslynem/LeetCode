package NumberOfSegmentsInString;

/**
 * Given a string s, return the number of segments in the string.
 * <p>
 * A segment is defined to be a contiguous sequence of non-space characters.
 */
class Solution {
    public int countSegments(String s) {
        char prev = ' ';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && prev == ' ') {
                count++;
            }
            prev = s.charAt(i);
        }

        return count;

    }
}