package ReverseWordsInStringIII;

/**
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 */
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        for (String string : s.split(" ")) {
            String reversed = new StringBuilder(string).reverse().toString();
            sb.append(reversed).append(" ");
        }
        return sb.toString().trim();
    }
}