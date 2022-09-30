class Solution {
    public int climbStairs(int n) {
        
        int wayToReachPrevToPrevStep = 1;
        int wayToReachPrevStep = 1;
        
        for(int i=2;i<=n;i++ ){
            
            int steps = wayToReachPrevToPrevStep + wayToReachPrevStep;
            wayToReachPrevToPrevStep = wayToReachPrevStep;
            wayToReachPrevStep = steps;
        }
        
        return wayToReachPrevStep;
        
    }
}