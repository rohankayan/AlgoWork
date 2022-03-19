class Solution {
    public int maxSubArray(int[] nums) {
        
        // go over each number anytime sum goes negative drop the previous sum 
        
        int maxSum = Integer.MIN_VALUE;
        int currSum = Integer.MIN_VALUE;
        
        for(int n: nums){
            if(currSum > 0){
                currSum += n;
            }
            else{
                currSum = n;
            }
            
            maxSum = Math.max(maxSum, currSum);
            
        }
        
        return maxSum;
        
    }
}