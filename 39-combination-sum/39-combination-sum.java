class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        LinkedList<Integer> comb = new LinkedList<Integer>();
        Arrays.sort(candidates);

        this.backtrack( comb,candidates, target, 0, results);
        return results;
    }
    
    boolean backtrack(LinkedList<Integer> combination,int[] candidates, int remain, int start, List<List<Integer>> result){
        
        
        if(remain ==0){
            result.add(new ArrayList<Integer>(combination));
            return true;
        }
        if(remain < 0){
            return true;
        }
        boolean amIdoneWithThisLoop = false;
        for(int i = start ; i< candidates.length && !amIdoneWithThisLoop; i++){
            combination.add(candidates[i]);
            //System.out.println(combination);
            amIdoneWithThisLoop = this.backtrack(combination, candidates, remain-candidates[i], i , result);
            
            combination.removeLast();
            
        }
        return false;
    }
}

// n ^ (target/smallestnumber)(saving some with pruning) + nlog(n)