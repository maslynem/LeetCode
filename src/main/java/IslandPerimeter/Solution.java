package IslandPerimeter;

/**
 * You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
 * <p>
 * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
 * <p>
 * The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island. One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.
 */
class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                perimeter += countPerimeter(grid, i, j);
            }
        }
        return perimeter;
    }

    public int countPerimeter(int[][] grid, int i, int j) {
        int count = 0;
        if (grid[i][j] == 1) {
            if (i - 1 < 0 || grid[i - 1][j] == 0) {
                count++;
            }
            if (i + 1 >= grid.length || grid[i + 1][j] == 0) {
                count++;
            }
            if (j - 1 < 0 || grid[i][j - 1] == 0) {
                count++;
            }
            if (j + 1 >= grid[i].length || grid[i][j + 1] == 0) {
                count++;
            }
        }
        return count;
    }
}