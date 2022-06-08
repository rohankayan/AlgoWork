class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>>  results = new ArrayList<>();
        
        dfs(results, new ArrayList<>(), nums, 0);
        
        return results;
        
    }
    
    void dfs(List<List<Integer>>  results, List<Integer> currentSq,int[] nums, int i ){
        
       if(i>= nums.length)
       {
           results.add(new ArrayList(currentSq));
           return;
       }
           
        currentSq.add(nums[i]);
        dfs(results, currentSq, nums, i+1);
        currentSq.remove(currentSq.size()-1);
        dfs(results, currentSq, nums, i+1);
          
       
           
       }
    
}