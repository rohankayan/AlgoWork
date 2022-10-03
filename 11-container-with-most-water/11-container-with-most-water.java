class Solution {
    public int maxArea(int[] height) {
        int leftIndex, rightIndex;
        leftIndex =0;
        rightIndex =height.length-1;
        int globalMax = Integer.MIN_VALUE;
        while(leftIndex<=rightIndex){
            int localMax = Math.min(height[leftIndex],height[rightIndex])*(rightIndex-leftIndex);
            
            if(height[leftIndex]<height[rightIndex]){
                leftIndex++;
            }
            else{
                rightIndex--;
            }
            globalMax = Math.max(globalMax,localMax);
        }
        
        return globalMax;

    }
}