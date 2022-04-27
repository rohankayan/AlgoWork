class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length+1][grid[0].length+1];
        
        for(int i = 0 ; i < grid.length; i++){
            
            for(int j = 0 ; j < grid[0].length; j++){
                
                if(i==0)
                    dp[i+1][j+1] = dp[i+1][j] + grid[i][j];
                
                else if(j==0)
                    dp[i+1][j+1] = dp[i][j+1] + grid[i][j];
                else
                    dp[i+1][j+1] = Math.min(dp[i][j+1], dp[i+1][j]) + grid[i][j];
            }
        }
        
        //System.out.println(Arrays.deepToString(dp));
        return dp[grid.length][grid[0].length];
        
    }
}