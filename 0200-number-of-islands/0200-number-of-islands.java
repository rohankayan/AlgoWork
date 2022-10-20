class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int numOfIsland = 0;
        // 0 = water , 1 = land
        
        for(int i = 0; i < m ; i++){
            
            for (int j = 0 ; j < n ; j++){
                
                if(grid[i][j] == '1'){
                    numOfIsland++;
                    bfs(grid, i, j , m ,n);
                }
                
                
            }
        }
        
        return numOfIsland;
        
    }
    
    private void bfs(char[][] grid , int startI , int startJ, int m , int n){
        
        if(startI < 0 || startJ < 0 || startI >= m || startJ >= n ){
            return;
        }
        
        if(grid[startI][startJ] != '1')
            return;
        
        grid[startI][startJ] = '0';
        
        bfs(grid, startI+1, startJ , m ,n);
        bfs(grid, startI-1, startJ , m ,n);
        bfs(grid, startI, startJ+1 , m ,n);
        bfs(grid, startI, startJ-1 , m ,n);
    }
}