package BinaryWatch;

import java.util.ArrayList;
import java.util.List;

/**
 * A binary watch has 4 LEDs on the top to represent the hours (0-11), and 6 LEDs on the bottom to represent the minutes (0-59). Each LED represents a zero or one, with the least significant bit on the right.
 * Given an integer turnedOn which represents the number of LEDs that are currently on (ignoring the PM), return all possible times the watch could represent. You may return the answer in any order.
 */
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                if (Integer.bitCount(i) + Integer.bitCount(j) == turnedOn) {
                    result.add(String.format("%d:%02d", i, j));
                }
            }
        }
        return result;
    }
}