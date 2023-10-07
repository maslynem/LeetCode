package Sqrtx;

/**
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 * <p>
 * You must not use any built-in exponent function or operator.
 * <p>
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 */
class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        while (left < right) {
            int mid = left + (right - left) / 2;
            long root = (long) mid * mid;
            if (root < x) {
                long nextRoot = ((long) (mid + 1)) * (mid + 1);
                if (nextRoot > x) {
                    return mid;
                }
                left = mid + 1;
            } else if (root > x) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return left;
    }
}