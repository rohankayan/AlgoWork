class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        backtracking(results,new ArrayList<>(),0,0, target, candidates);
        return results;
    }
    
    void backtracking ( List<List<Integer>> results, List<Integer> currSeq, int index , int currSum , int target, int[] candidates){
       
        if(currSum == target){
            results.add(new ArrayList(currSeq));
            return;
        }
        if(currSum > target)
            return;
        
        for(int j=index;j< candidates.length;j++){
            currSeq.add(candidates[j]);
            backtracking(results,currSeq,j,currSum + candidates[j], target, candidates);
            currSeq.remove(currSeq.size()-1);
        }
    }
}
