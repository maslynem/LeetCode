package LicenseKeyFormatting;

/**
 * You are given a license key represented as a string s that consists of only alphanumeric characters and dashes. The string is separated into n + 1 groups by n dashes. You are also given an integer k.
 * <p>
 * We want to reformat the string s such that each group contains exactly k characters, except for the first group, which could be shorter than k but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.
 * <p>
 * Return the reformatted license key.
 */
class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int len = s.length();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = len - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != '-') {
                sb.append(ch);
                count++;
            }
            if (count == k) {
                sb.append('-');
                count = 0;
            }
        }
        if (!sb.isEmpty() && sb.charAt(sb.length() - 1) == '-') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.reverse().toString().toUpperCase();
    }
}
