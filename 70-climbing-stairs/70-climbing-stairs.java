class Solution {
    public int climbStairs(int n) {
        
        int numberOfWayToPrev = 1;
        
        int numberOfWayToPrevPrev = 0;
        
        
        for(int i=1;i<=n;i++){
            
            int temp = numberOfWayToPrev + numberOfWayToPrevPrev;
            numberOfWayToPrevPrev =numberOfWayToPrev;
            numberOfWayToPrev = temp;
            
        }
        
        return numberOfWayToPrev;
        
    }
}