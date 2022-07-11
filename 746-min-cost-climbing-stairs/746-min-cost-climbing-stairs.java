class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int minCostToPrevStep = 0;
        int minCostToPrevPrevStep = 0;
        int costToComeToThisStep =0;
        
        for(int i=0;i<cost.length;i++){
            
            costToComeToThisStep = Math.min(minCostToPrevStep,minCostToPrevPrevStep)  + cost[i];
            minCostToPrevPrevStep = minCostToPrevStep;
            minCostToPrevStep = costToComeToThisStep;           
            
        }
        
        return Math.min(minCostToPrevPrevStep,minCostToPrevStep);
    }
}