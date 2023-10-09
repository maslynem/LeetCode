package WordPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a pattern and a string s, find if s follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 */
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        Map<Character, String> map = new HashMap<>();
        if (pattern.length() != words.length) return false;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            Character ch = pattern.charAt(i);

            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(word)) {
                    return false;
                }
            } else {
                if (map.containsValue(word)) {
                    return false;
                }
                map.put(ch, word);
            }
        }
        return true;
    }
}