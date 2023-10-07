package TheKWeakestRowsInMatrix;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
 * <p>
 * A row i is weaker than a row j if one of the following is true:
 * <p>
 * The number of soldiers in row i is less than the number of soldiers in row j.
 * Both rows have the same number of soldiers and i < j.
 * Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
 */
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] result = new int[k];
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt((int[] o) -> o[1]).thenComparingInt(o -> o[0]));
        for (int i = 0; i < mat.length; i++) {
            int[] row = mat[i];
            priorityQueue.add(new int[]{i, countSoldiers(row)});
        }
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.poll()[0];
        }
        return result;
    }


    private int countSoldiers(int[] row) {
        int start = 0;
        int end = row.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (row[mid] < 1) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}