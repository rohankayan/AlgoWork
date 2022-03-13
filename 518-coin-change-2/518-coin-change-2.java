class Solution {
    int numberOfWays = 0;
    public int changeBacktrace(int amount, int[] coins) {
        
        backtrace(coins, 0, amount);
        return numberOfWays;
    }
    
    private void backtrace(int[] coins, int index, int remaining){
        
        if(remaining < 0)
            return ;
        if(remaining ==0)
            numberOfWays++;
        
        for(int i = index; i< coins.length; i++){
            
            backtrace(coins, i, remaining-coins[i]);
        }
    }
    
     public int change(int amount, int[] coins) {
       int[] dp = new int[amount+1];
       dp[0]=1;
       for(int coin:coins){           
           for(int x=coin; x< amount+1;x++){
               dp[x] = dp[x] + dp[x-coin];
           }
       }  
      return dp[amount];       
       
    }
}