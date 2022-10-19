class Solution {
    boolean[][] visited;
    int perimeter =0;
    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        visited = new boolean[m][n];

        for(int i = 0; i < m; i++){

            for(int j = 0; j<n; j++){

                if(visited[i][j])
                    continue;

                if (grid[i][j] == 1){
                    visited[i][j] = true;
                    
                    if(i-1 < 0  ){                        
                        perimeter++;
                    }
                    else{
                        if(grid[i-1][j]==0)
                             perimeter++;
                    }
                    if(i+1 ==m)
                        {                        
                        perimeter++;
                    }
                    else{
                        if(grid[i+1][j]==0)
                            perimeter++;
                    }
                    
                    if(j-1 <0 ){                        
                        perimeter++;
                    }
                    else{
                        if(grid[i][j-1]==0)
                            perimeter++;
                    }
                    if(j+1 == n){
                        perimeter++;
                    }
                    else{
                        if(grid[i][j+1]==0)
                            perimeter++;
                    }
                    
                }
            }
        }
        return perimeter;
    }
}