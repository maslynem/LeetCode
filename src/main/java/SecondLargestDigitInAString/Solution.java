package SecondLargestDigitInAString;

/**
 * Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.
 */
class Solution {
    public int secondHighest(String s) {
        int maxValue = -1;
        int secondMaxValue = -1;
        for (byte aByte : s.getBytes()) {
            char ch = (char) aByte;
            if (Character.isDigit(ch)) {
                int value = ch - '0';
                if (value > maxValue) {
                    secondMaxValue = maxValue;
                    maxValue = value;
                } else if (value > secondMaxValue && value != maxValue) {
                    secondMaxValue = value;
                }
            }
        }
        return secondMaxValue;
    }
}