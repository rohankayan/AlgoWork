class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        backtracking(0, new ArrayList<>(), nums, nums.length, results);
        return results;
    }
    
    void backtracking( int index , List<Integer> currSeq, int[] nums, int length, List<List<Integer>> results){
        
        if(index >= length){
            results.add(new ArrayList<>(currSeq));
            return;
        }
        
        currSeq.add(nums[index]);
        backtracking(index+1, currSeq, nums, length, results);
        currSeq.remove(currSeq.size()-1);
        backtracking(index+1, currSeq, nums, length, results);
    }
}