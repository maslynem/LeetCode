package RemoveDuplicateLetters;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Given a string s, remove duplicate letters so that every letter appears once and only once.
 * You must make sure your result is the smallest in lexicographical order among all possible results.
 */
class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        boolean[] visited = new boolean[26];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 'a';
            if (visited[ch]) continue;
            while (!stack.isEmpty() && stack.peek() > ch && i < lastIndex[stack.peek()]) {
                visited[stack.pop()] = false;
            }
            stack.push(ch);
            visited[ch] = true;
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append((char)(stack.pop() + 'a'));
        }
        return sb.reverse().toString();
    }
}