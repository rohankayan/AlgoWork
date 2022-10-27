class Solution {
    public int removeDuplicates(int[] nums) {
        int positionForUnique = 0;
        int currentScanIndex = 1;
        
        while(currentScanIndex < nums.length){
            if(nums[currentScanIndex] != nums[positionForUnique]){
                nums[++positionForUnique] = nums[currentScanIndex];
            }
            currentScanIndex++;
        }
        return positionForUnique+1;
    }
}