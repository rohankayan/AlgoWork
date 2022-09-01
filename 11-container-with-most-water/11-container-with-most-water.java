class Solution {
    public int maxArea(int[] height) {
        
         int leftIndex = 0;
        int rightIndex = height.length-1;
        int maxVol = Integer.MIN_VALUE;

        while(leftIndex< rightIndex){
            int currentVol = Math.min(height[leftIndex], height[rightIndex]) * (rightIndex-leftIndex);
            
            if(height[leftIndex]< height[rightIndex]){
                leftIndex++;
            }
            else{
                rightIndex--;
            }
            
            maxVol = Math.max(currentVol,maxVol);
            
        }
        
        return  maxVol;
        
        
        
        
    }
}