class Solution {
   
    
     public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
         Arrays.sort(candidates);
        backtracking(candidates, target ,new ArrayList<>(),results,0);
         return results;
    }

    void backtracking(int[] candidates, int target, List<Integer> curr,List<List<Integer>> results,int index ){
        if(target == 0){
            results.add(new ArrayList<>(curr));
            return;
        }
        if(target < 0){
            return;
        }
        
        for(int i = index;i < candidates.length;i++){
            if (i > index && candidates[i] == candidates[i - 1])
                continue;
            curr.add(candidates[i]);
            backtracking(candidates, target - candidates[i],curr,results,i+1);
            curr.remove(curr.size()-1);
        }
    }
}