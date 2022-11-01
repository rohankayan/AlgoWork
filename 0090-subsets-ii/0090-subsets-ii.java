class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> results = new HashSet<>();
            Arrays.sort(nums);
        backtracking(0, new ArrayList<>(), nums, nums.length, results);
        return new ArrayList<>(results);
    }

    void backtracking( int index , List<Integer> currSeq, int[] nums, int length, Set<List<Integer>> results){

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