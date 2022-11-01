class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        int length = nums.length;
        dfs(results, new ArrayList(), 0, length, nums);
        return results;
        
    }
    
    
    void dfs(List<List<Integer>> results, List<Integer> curr, int i, int size,int[] nums ){
        
        
        if(i>=size){
            results.add(new ArrayList<>(curr));
            return;
        }
            
        
        
        curr.add(nums[i]);
        dfs(results, new ArrayList(curr), i+1, size, nums);
        curr.remove(curr.size()-1);
        dfs(results, curr, i+1, size, nums);
    }
    
    
}