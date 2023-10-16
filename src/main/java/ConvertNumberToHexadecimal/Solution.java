package ConvertNumberToHexadecimal;

/**
 * Given an integer num, return a string representing its hexadecimal representation. For negative integers, two’s complement method is used.
 * <p>
 * All the letters in the answer string should be lowercase characters, and there should not be any leading zeros in the answer except for the zero itself.
 * <p>
 * Note: You are not allowed to use any built-in library method to directly solve this problem.
 */
class Solution {
    public String toHex(int num) {
        char[] hexArr = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(hexArr[num & 15]);
            num  = (num >>> 4);
        }
        return sb.reverse().toString();
    }
}