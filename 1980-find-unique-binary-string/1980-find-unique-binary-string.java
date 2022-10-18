class Solution {
    Set<String> missing = new HashSet<>();
    boolean found = false;
    public String findDifferentBinaryString(String[] nums) {
        Set<String> numset = Set.of(nums);
        backtracking(new StringBuffer(),0, numset, numset.size());
        return missing.stream().findAny().orElse(null);
    }

    private void backtracking(StringBuffer curr , int index, Set<String> nums, int length ){
        if(index> length || found)
            return ;

        //reached till end
        if(index == length){
            if(!nums.contains(curr.toString()) ){
                found = true;
                missing.add(curr.toString());
            }
                
        }

        backtracking(new StringBuffer(curr).append("1"),index+1, nums, length);
        backtracking(new StringBuffer(curr).append("0"),index+1, nums, length);
    }
}