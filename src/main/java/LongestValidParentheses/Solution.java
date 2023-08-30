package LongestValidParentheses;

import java.util.*;

/**
 * Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses
 * substring.
 */
public class Solution {
    public int longestValidParentheses(String s) {
        int n = s.length();
        boolean[] dp = new boolean[n];
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (!stack.isEmpty()) {
                Integer pop = stack.pop();
                dp[pop] = true;
                dp[i] = true;
            }
        }
        int result = Integer.MIN_VALUE;
        int counter = 0;
        for (int i = 0; i < n; i++) {
            if (dp[i]) {
                counter++;
            } else {
                result = Math.max(result, counter);
                counter = 0;
            }
        }
        result = Math.max(result, counter);
        return result;
    }
}
