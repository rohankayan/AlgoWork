class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        backtracking2(0, new ArrayList<>(), nums, nums.length, results);
        return results;
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
    
     void backtracking2( int index , List<Integer> currSeq, int[] nums, int length, List<List<Integer>> results){


        results.add(new ArrayList<>(currSeq));


        for(int i = index; i < length; i++){
            if(i != index && nums[i]== nums[i-1])
                continue;
            currSeq.add(nums[i]);
            backtracking2(i+1, currSeq, nums, length, results);
            currSeq.remove(currSeq.size()-1);
        }


        
    }
}