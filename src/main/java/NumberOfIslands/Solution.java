package NumberOfIslands;

class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    count++;
                    findLand(i, j, visited, grid);
                }
            }
        }
        return count;
    }

    private void findLand(int i, int j, boolean[][] visited, char[][] grid) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || visited[i][j] || grid[i][j] == '0') {
            return;
        }
        visited[i][j] = true;
        findLand(i, j + 1, visited, grid);
        findLand(i + 1, j, visited, grid);
        findLand(i - 1, j, visited, grid);
        findLand(i, j - 1, visited, grid);
    }
}