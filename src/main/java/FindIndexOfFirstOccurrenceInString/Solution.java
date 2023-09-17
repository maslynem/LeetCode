package FindIndexOfFirstOccurrenceInString;

/**
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 */
class Solution {
    public int strStr(String haystack, String needle) {
//        return haystack.indexOf(needle);
        if (needle.isEmpty()) {
            return 0;
        }
        char[] source = haystack.toCharArray();
        char[] target = needle.toCharArray();

        char first = target[0];
        int max = haystack.length() - needle.length();

        for (int i = 0; i <= max; i++) {
            if (source[i] != first) {
                while (++i <= max && source[i] != first) ;
            }
            if (i <= max) {
                int j = i + 1;
                int end = j + target.length - 1;
                for (int k = 1; j < end && source[j] == target[k]; j++, k++) ;
                if (j == end) {
                    return i;
                }
            }
        }
        return -1;
    }


}