package NumberComplement;

/**
 * The complement of an integer is the integer you get when you flip all the 0's to 1's and all the 1's to 0's in its binary representation.
 * <p>
 * For example, The integer 5 is "101" in binary and its complement is "010" which is the integer 2.
 * Given an integer num, return its complement.
 */
class Solution {
    public int findComplement(int num) {
        int result = 0;
        for (int i = 0; i < 31; i++) {
            int bit = 1 << i;
            if (bit > num) break;
            int x = num & bit;
            if (x != 0) {
                result = result & ~bit;
            } else {
                result = result | bit;
            }
        }
        return result;
    }
}