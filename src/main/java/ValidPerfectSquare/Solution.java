package ValidPerfectSquare;

/**
 * Given a positive integer num, return true if num is a perfect square or false otherwise.
 * <p>
 * A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.
 * <p>
 * You must not use any built-in library function, such as sqrt.
 */
class Solution {
    public boolean isPerfectSquare(int num) {
        int left = 1;
        int right = num;
        while (left <= right) {
            int mod = left + (right - left) / 2;
            long temp = (long) mod * mod;
            if (temp == num) {
                return true;
            } else if (temp > num) {
                right = mod - 1;
            } else {
                left = mod + 1;
            }
        }
        return false;
    }
}