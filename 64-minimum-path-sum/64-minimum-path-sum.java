class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length+1][grid[0].length+1];
        
        
        for (int[] row : dp)
            Arrays.fill(row, Integer.MAX_VALUE);
        dp[0][1] =0;
        dp[1][0] =0;
        
        for(int i = 0 ; i < grid.length; i++){            
            for(int j = 0 ; j < grid[0].length; j++){                
             
                    dp[i+1][j+1] = Math.min(dp[i][j+1], dp[i+1][j]) + grid[i][j];
            }
        }
        
        
        return dp[grid.length][grid[0].length];
        
    }
}