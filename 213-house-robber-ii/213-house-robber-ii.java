class Solution {
    public int rob(int[] nums) {
        if(nums.length >1){
            int max1 = rob1(nums,0,nums.length-1);
            int max2 = rob1(nums,1,nums.length);

            return Math.max(max1,max2); 
        }
        
        return nums[0];
    }
    
    public int rob1(int[] nums, int start, int end) {   
        int maxAmountTillPrev = 0;
        int maxAmountTillPrevPrev = 0;
                
        for(int i=start; i< end;i++){
            //if he robs this house 
           
            int robAmount1 = maxAmountTillPrevPrev + nums[i];
            int localMax = Math.max(robAmount1,maxAmountTillPrev);
            maxAmountTillPrevPrev = maxAmountTillPrev;
            maxAmountTillPrev = localMax;         
           }
        
        return maxAmountTillPrev;
        
    }
}