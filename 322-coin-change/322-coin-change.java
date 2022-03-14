class Solution {
    int numOfCoins = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {     
      return  backtrack(coins,amount, new int[amount]);
    
        
        
    }
    
    
    private int backtrack(int[] coins,  int remaining , int[] count ){
        
        if(remaining < 0 ){
            return -1 ;
        }
        
        if( remaining == 0){            
            return 0;
        }
        if(count[remaining -1] !=0) return count[remaining -1];
        
        int min = Integer.MAX_VALUE;
      for(int coin: coins){
          
          int temp = backtrack(coins,remaining-coin, count);
          if (temp >=0 && temp < min)
            min = temp +1;
          
      }
      count[remaining -1] = min == Integer.MAX_VALUE ? -1 : min;
      return count[remaining -1]; 
        
        
    }
}