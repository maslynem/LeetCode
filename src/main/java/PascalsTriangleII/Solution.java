package PascalsTriangleII;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.
 * <p>
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        int[][] triangle = new int[rowIndex+1][rowIndex+1];
        for (int i = 0; i < rowIndex+1; i++) {
            triangle[i][0] = 1;
            triangle[i][i] = 1;
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rowIndex+1; i++) {
            list.add(getNumber(triangle, rowIndex, i));
        }
        return list;
    }

    private int getNumber(int[][] triangle, int row, int i) {
        if (i < 0 || i > row) return 0;
        if (triangle[row][i] == 0) {
            triangle[row][i] = getNumber(triangle, row -1, i - 1) + getNumber(triangle, row-1, i);
            return triangle[row][i];
        }
        return triangle[row][i];
    }

}