class Solution {
    
    int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
    
    
    
    public int countSubIslands(int[][] grid1, int[][] grid2) {
    
        int result =0;
    for(int i =0;i< grid2.length; i++){
        for(int j = 0; j< grid2[0].length; j++){
            if(grid2[i][j] == 1 && grid1[i][j] == 1){
                result +=markAndCheckSubIsland(grid1,grid2,i,j);                
            }
        }
    }
        
        return result;
        
    }
    
     int markAndCheckSubIsland(int[][] grid1, int[][] grid2, int i, int j){
        
        if( i < 0 || j <0 || i== grid2.length || j == grid2[0].length || grid2[i][j] != 1 )
            return 1;
        if(grid2[i][j] == 1 && grid1[i][j] != 1){           
            return 0;
        }            
        
        grid2[i][j] =2;
        int result =1;
        for(int[] d : directions){        
            result *=markAndCheckSubIsland(grid1,grid2,i+d[0],j+d[1]);
        }
        
         
        return result;
        
    }
}