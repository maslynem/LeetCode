package LongestCommonPrefix;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int index = strs[0].length()-1;
        for (int j = 1; j < strs.length; j++) {
            String str = strs[j];
            if (str.length() - 1 != index) {
                index = Math.min(str.length() - 1, index);
            }
            for (int i = index; i >= 0; i--) {
                if (str.charAt(i) != strs[0].charAt(i)) {
                    index = i - 1;
                }
            }
        }
        return index >= 0 ? strs[0].substring(0, index+1) : "";
    }

    /**
     * Better solution
     */
//    public String longestCommonPrefix(String[] v) {
//        StringBuilder ans = new StringBuilder();
//        Arrays.sort(v);
//        String first = v[0];
//        String last = v[v.length-1];
//        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
//            if (first.charAt(i) != last.charAt(i)) {
//                return ans.toString();
//            }
//            ans.append(first.charAt(i));
//        }
//        return ans.toString();
//    }
}