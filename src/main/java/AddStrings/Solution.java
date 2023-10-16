package AddStrings;

/**
 * Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
 * <p>
 * You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
 */

class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb =new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int ch1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int ch2 = j >= 0 ? num2.charAt(j--) - '0' : 0;
            int result = (ch1 + ch2 + carry) % 10;
            carry = (ch1 + ch2 + carry) / 10;
            sb.append(result);
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}