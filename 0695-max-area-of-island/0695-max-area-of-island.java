class Solution {
   int[][] neighbors = {{-1,0},{1,0},{0,-1},{0,1}};
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int globalArea = 0;
        for(int i = 0 ; i < m ; i ++){
            for(int j = 0; j < n ; j++){

                int localArea = markAndCount(i, j, m, n, grid);
                globalArea = Math.max(globalArea,localArea);
            }
        }
        return globalArea;
    }

    private int markAndCount(int i, int j, int m, int n, int[][] grid){
        if(i<0||i>=m||j<0||j>=n|| grid[i][j] != 1){
            return 0;
        }
        grid[i][j] = 0;
        int area = 1;
        for(int[] neighbor:neighbors){
            area += markAndCount(i+neighbor[0], j+neighbor[1], m, n, grid);
        }

        return area;

    }
}