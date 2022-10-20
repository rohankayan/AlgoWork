class Solution {
    int numOfIsland = 0;   
    int[][] neighbors ={{0,-1},{0,1},{-1,0},{1,0}};
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] =='1'){
                    numOfIsland++;
                    dfs(i,j,m,n,grid);
                }
            }
        }
        return numOfIsland;
    }

    void dfs(int i, int j, int m, int n, char[][] grid){
        if(i<0 || i >= m || j<0 || j >=n || grid[i][j] !='1'){
            return;
        }
        grid[i][j] ='2';
        
        for(int[] ng:neighbors){
            dfs(i+ng[0],j+ng[1],m,n,grid);
        }
    }
}