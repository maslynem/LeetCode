package PascalsTriangle;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer numRows, return the first numRows of Pascal's triangle.
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        for (int i = 0; i < numRows; i++) {
            result.add(new ArrayList<>(i + 1));
        }
        result.get(0).add(1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> currentRow = result.get(i);
            List<Integer> prevRow = result.get(i - 1);
            for (int j = 0; j < i + 1; j++) {
                int first = j - 1 >= 0 ? prevRow.get(j - 1) : 0;
                int second = j + 1 != i + 1 ? prevRow.get(j) : 0;
                currentRow.add(first + second);
            }
        }
        return result;
    }
}