class Solution {
    public int rob(int[] nums) {
        
        int maxAmount = Integer.MIN_VALUE;
        
        int maxAmountTillPrev = 0;
        int maxAmountTillPrevPrev = 0;
        
        
        for(int i=0; i< nums.length;i++){
            //if he robs this house 
            
            int robAmount1 = maxAmountTillPrevPrev + nums[i];
            
            int localMax = Math.max(robAmount1,maxAmountTillPrev);
            maxAmountTillPrevPrev = maxAmountTillPrev;
            
            maxAmountTillPrev = localMax;
            
            maxAmount = Math.max(localMax,maxAmount);
                
            
        }
        
        return maxAmount;
        
    }
}