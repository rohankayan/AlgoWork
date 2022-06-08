class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        
        backtrack(results, new ArrayList(), 0, target, candidates,0);
        return results;
    }
    
    
    void backtrack(List<List<Integer>> results, List<Integer> currentSq, int currentSum, int target, int[] candidates, int i){
        
        if(currentSum == target){
            results.add(new ArrayList(currentSq));
            return;
        }
        
        if(currentSum > target){
            return;
        }
        
        for(int j=i;j< candidates.length;j++){
            currentSq.add(candidates[j]);            
            backtrack(results, currentSq, currentSum+candidates[j], target, candidates,j);
            currentSq.remove(currentSq.size()-1);            
        }
        
        
    }
}