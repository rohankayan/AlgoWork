class Solution {
    public List<Integer> nums;
    public boolean makesquare(int[] matchsticks) {
        int total = 0;
        for (int match: matchsticks){
            total += match;
        }

        if(total%4 != 0)
            return false;

        int side = total/4;

        this.nums = Arrays.stream(matchsticks).boxed().collect(Collectors.toList());
        Collections.sort(this.nums, Collections.reverseOrder());
        return backtracking(side, 0, 0, 0, 0, 0, this.nums);


    }
    
    boolean backtracking ( int side, int index, int left, int right, int top , int bottom, List<Integer> matchsticks){
        
        if(left > side || right > side || top > side || bottom > side)
            return false;
        if(left == side && right == side && top == side && bottom == side && index == matchsticks.size()){
            return true;
        }
        
        boolean found = backtracking(side, index+1, left+matchsticks.get(index), right, top, bottom, matchsticks);
        if(!found)
            found =backtracking(side, index+1, left, right+matchsticks.get(index), top, bottom, matchsticks);
        if(!found)
            found =backtracking(side, index+1, left, right, top+matchsticks.get(index), bottom, matchsticks);
        if(!found)
            found =backtracking(side, index+1, left, right, top, bottom+matchsticks.get(index), matchsticks);
      
        return found;
    }
}