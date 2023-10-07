package PathWithMinimumEffort;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * You are a hiker preparing for an upcoming hike. You are given heights, a 2D array of size rows x columns, where heights[row][col] represents the height of cell (row, col). You are situated in the top-left cell, (0, 0), and you hope to travel to the bottom-right cell, (rows-1, columns-1) (i.e., 0-indexed). You can move up, down, left, or right, and you wish to find a route that requires the minimum effort.
 * <p>
 * A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.
 * <p>
 * Return the minimum effort required to travel from the top-left cell to the bottom-right cell.
 */
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int left = 0;
        int ans = 0;
        int right = (int) Math.pow(10, 6);
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (checkPath(heights, mid)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    private boolean checkPath(int[][] heights, int k) {
        int i = 0;
        int j = 0;
        boolean[][] visited = new boolean[heights.length][heights[0].length];
        visited[i][j] = true;
        Deque<Integer> stack = new ArrayDeque<>();
        addAdjacentVertex(heights, k, visited, i, j, stack);

        while (!stack.isEmpty()) {
            int pop = stack.pop();
            i = pop / 1000;
            j = pop % 1000;
            if (i == heights.length - 1 && j == heights[0].length - 1) {
                return true;
            }
            visited[i][j] = true;
            addAdjacentVertex(heights, k, visited, i, j, stack);
        }
        return i == heights.length - 1 && j == heights[i].length - 1;
    }

    private static void addAdjacentVertex(int[][] heights, int k, boolean[][] visited, int i, int j, Deque<Integer> stack) {
        if (i - 1 >= 0 && !visited[i - 1][j] && Math.abs(heights[i - 1][j] - heights[i][j]) <= k) {
            stack.push((i - 1) * 1000 + j);
        }
        if (i + 1 < heights.length && !visited[i + 1][j] && Math.abs(heights[i + 1][j] - heights[i][j]) <= k) {
            stack.push((i + 1) * 1000 + j);
        }
        if (j - 1 >= 0 && !visited[i][j - 1] && Math.abs(heights[i][j - 1] - heights[i][j]) <= k) {
            stack.push(i * 1000 + j - 1);
        }
        if (j + 1 < heights[i].length && !visited[i][j + 1] && Math.abs(heights[i][j + 1] - heights[i][j]) <= k) {
            stack.push(i * 1000 + j + 1);
        }
    }
}