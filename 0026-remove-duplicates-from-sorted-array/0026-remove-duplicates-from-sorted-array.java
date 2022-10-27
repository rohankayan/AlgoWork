class Solution {
     public int removeDuplicates(int[] nums) {
        int posToInsert = 1;
        int posScan = 0;
        while(posScan < nums.length-1){
            if(nums[posScan] != nums[posScan+1]){
                nums[posToInsert++] = nums[posScan+1];
            }
            posScan++;
        }
        return posToInsert;
    }
}