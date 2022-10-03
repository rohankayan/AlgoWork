class Solution {
    public int maxArea(int[] height) {
        int leftIndex, rightIndex;
        leftIndex =0;
        rightIndex =height.length-1;
        int globalMax = Integer.MIN_VALUE;
        while(leftIndex<=rightIndex){
            int localMax = 0;
            
            if(height[leftIndex]<height[rightIndex]){
                localMax = height[leftIndex]*(rightIndex-leftIndex);
                leftIndex++;
            }
            else{
                localMax = height[rightIndex]*(rightIndex-leftIndex);
                rightIndex--;
            }
            globalMax = Math.max(globalMax,localMax);
        }
        
        return globalMax;

    }
}