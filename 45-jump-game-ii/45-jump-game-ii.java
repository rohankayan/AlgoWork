class Solution {
    public int jump(int[] nums) {
        int l=0,r=0;
        
        int currentMaxR =0;
        int target = nums.length-1;
        int steps =0;
        
        while(r<target && l<=r){
            
            currentMaxR = Math.max(l+nums[l],currentMaxR );
            l++;
            if(l>r){
                 r = currentMaxR;
                steps++;
            }
               
        }
        return steps;
        
    }
}