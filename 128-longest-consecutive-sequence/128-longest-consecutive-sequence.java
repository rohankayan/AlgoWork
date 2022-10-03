class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> inputSet = new HashSet<Integer>();

        for(int n:nums ){
            inputSet.add(n);
        }
        int globalLength = 0;
        for(int n:nums ){
            if(!inputSet.contains(n-1)){
                int tempLength = 1;
                while(inputSet.contains(++n)){
                    tempLength++;
                }
                globalLength = Math.max(globalLength, tempLength);
            }
        }
        return globalLength;
    }
}