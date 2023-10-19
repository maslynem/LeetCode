package BackspaceStringCompare;

/**
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * <p>
 * Note that after backspacing an empty text, the text will continue empty.
 */
class Solution {
    public boolean backspaceCompare(String s, String t) {
        return updateString(s).equals(updateString(t));
    }


    private String updateString(String str) {
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                sb.append(ch);
            } else if (!sb.isEmpty()) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}