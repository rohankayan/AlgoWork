class Solution {
    public int rob(int[] nums) {
        
        int maxTillPrevHouse =0;
        int maxTillPrevToPrevHouse =0;
        
        int max = Integer.MIN_VALUE;
        for(int n: nums){
            
            max = Math.max(maxTillPrevToPrevHouse+n,maxTillPrevHouse);
            maxTillPrevToPrevHouse = maxTillPrevHouse;
            maxTillPrevHouse = max;
            
            
        }
        
        return max;
        
    }
}