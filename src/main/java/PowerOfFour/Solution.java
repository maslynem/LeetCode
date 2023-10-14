package PowerOfFour;

/**
 * Given an integer n, return true if it is a power of four. Otherwise, return false.
 * <p>
 * An integer n is a power of four, if there exists an integer x such that n == 4x.
 */
class Solution {
    public boolean isPowerOfFour(int n) {
        return n > 0 && Integer.bitCount(n) == 1 && (n & 0x55555555) != 0;
    }
}