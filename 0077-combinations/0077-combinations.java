class Solution {
     public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> results = new ArrayList<>();
        backtracking(1,n,k,results, new ArrayList<>());
        return results;
    }

    void backtracking(int index, int n, int k, List<List<Integer>> results, List<Integer> curr){
        if(curr.size() == k){
            results.add(new ArrayList<>(curr));            
            return;  
        }
            
        for(int i = index; i <= n; i++){
            curr.add(i);
            backtracking(i+1,n,k,results,curr);
            curr.remove(curr.size()-1);
        }
    }
}