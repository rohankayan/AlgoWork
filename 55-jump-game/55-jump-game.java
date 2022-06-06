public class Solution {
   
    public boolean canJump(int[] nums) {
        int target = nums.length-1;
        
        for(int j = target-1; j>=0;j--){
            
            if(nums[j]>=target-j){
                target = j;
            }
            
        }
        
        return target==0;
    }
}