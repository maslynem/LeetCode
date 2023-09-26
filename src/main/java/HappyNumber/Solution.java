package HappyNumber;

import java.util.HashSet;

/**
 * Write an algorithm to determine if a number n is happy.
 * <p>
 * A happy number is a number defined by the following process:
 * <p>
 * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 */
class Solution {
    public boolean isHappy(int n) {
        int temp = n;
        HashSet<Integer> set = new HashSet<>();
        while (temp != 1) {
            int squareOfDigits = squareOfDigits(temp);
            boolean add = set.add(squareOfDigits);
            if (!add) {
                return false;
            }
            temp = squareOfDigits;
        }
        return true;
    }

    private int squareOfDigits(int value) {
        int result = 0;
        while (value != 0) {
            int digit = value % 10;
            result += digit * digit;
            value /= 10;
        }
        return result;
    }
}