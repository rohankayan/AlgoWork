class Solution {
    public void moveZeroes(int[] nums) {
        int placeToInsert = 0 ;
        int scanPos = 0;
        
        while(scanPos<nums.length){
            if(nums[scanPos] != 0){
                nums[placeToInsert++] = nums[scanPos];
            }
            scanPos++;
        }
        while(placeToInsert <nums.length){
            nums[placeToInsert++] = 0;
        }
        
    }
}