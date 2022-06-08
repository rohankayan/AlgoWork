class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>  results = new ArrayList();
        
            backtracking(nums, new ArrayList(), 0, results);
        return results;
        
    }
    
    void backtracking(int[] nums, List<Integer> currentSubset, int first, List<List<Integer>>  results){
        
        if(currentSubset.size() > nums.length){
            return;
        }
        results.add(new ArrayList(currentSubset));
               
        
        for(int j = first; j< nums.length; j++){
             currentSubset.add(nums[j]);       
        
             backtracking(nums, currentSubset, j+1, results);
        
            currentSubset.remove(currentSubset.size()-1);
        }
        
        
        
    }
}