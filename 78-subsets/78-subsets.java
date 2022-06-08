class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>>  results = new ArrayList<>();
        
            backTrack(results, new ArrayList<>(), nums, 0);
        
        return results;
        
    }
    
    void backTrack(List<List<Integer>>  results, List<Integer> currentSq,int[] nums, int i ){
        
       if(i> nums.length)
           return;
        results.add(new ArrayList(currentSq));
          
        for(int j=i; j<= nums.length-1;j++){
            currentSq.add(nums[j]);
            backTrack(results, currentSq, nums, j+1);
            currentSq.remove(currentSq.size()-1);
        }
           
       }
    
}