class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set visited = new HashSet();
        
        for(int n: nums){
            
            if(visited.contains(n))
                return true;
            else
                visited.add(n);
        }
        return false;
    }
}