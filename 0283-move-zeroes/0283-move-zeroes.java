class Solution {
    public void moveZeroes(int[] nums) {
         int positionToInsert = 0;
        int scanPos = 0;
        while(scanPos < nums.length){
            
            if(nums[scanPos]!= 0){
                nums[positionToInsert++] = nums[scanPos];
            }
            scanPos++;
        }
        
        while (positionToInsert < nums.length){
            nums[positionToInsert++] =0;
        }
    }
}