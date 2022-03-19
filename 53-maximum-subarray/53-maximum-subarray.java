class Solution {
    public int maxSubArray(int[] nums) {
       
        int currentSum=Integer.MIN_VALUE;
        int maxSum=Integer.MIN_VALUE;
        for(int num:nums){
            
            if(currentSum >0 ){
                currentSum += num; 
            }
            else{
                currentSum = num; 
            }
            
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}