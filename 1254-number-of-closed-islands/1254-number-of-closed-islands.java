class Solution {
    
   int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    int m = 0;
    int n = 0;

    public int closedIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int result = 0;

        int[] iBorders = {0, m - 1};
        int[] jBorders = {0, n - 1};

        for (int i : iBorders) {
            for (int j = 0; j < n; j++) {

                fill(grid, i, j);
            }
        }

        for (int j : jBorders) {
            for (int i = 0; i < m; i++) {

                fill(grid, i, j);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (grid[i][j] == 0) {
                    result++;
                    fill(grid, i, j);
                }
            }
        }

        return result;
    }


    private void fill(int[][] g, int i, int j) {

        if (i < 0 || j < 0 || i >= m || j >= n) {
            return;
        }
        if (g[i][j] == 1) {
            return;
        }
        g[i][j] = 1;

        for (int[] d : directions) {
            fill(g, i + d[0], j + d[1]);
        }

    }
    
    
}