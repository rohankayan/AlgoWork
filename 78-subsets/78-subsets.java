class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        dfs(0, new ArrayList(), nums, results);
        return results;
    }

    private void dfs(int i, List currSequence, int[] nums, List<List<Integer>> results){
        if(i >= nums.length){
            results.add(new ArrayList<>(currSequence));
            return;
        }
        
        currSequence.add(nums[i]);
        dfs(i+1, currSequence, nums, results);
        currSequence.remove(currSequence.size()-1);
        dfs(i+1, currSequence, nums, results);
        
    }
}