class Solution {
    public void rotate(int[] nums, int k) {
        //[1,2,3,4,5,6,7]
        //7,6,5,4,3,2,1
         k = k%nums.length;
        
        int[] newarray = new int[nums.length];
        
        for(int i=0;i< nums.length; i++){
            
            newarray[(i+k)%nums.length] = nums[i];
        }
        
        for(int i=0;i< nums.length; i++){
            
            nums[i] = newarray[i];
        }
        
        
    }
    
   
}