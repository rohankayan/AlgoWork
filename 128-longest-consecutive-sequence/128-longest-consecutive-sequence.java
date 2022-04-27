class Solution {
    public int longestConsecutive(int[] nums) {
        Map <Integer,Boolean> numberAndNotVisited = new HashMap();
        
        for(int n: nums){
            
            numberAndNotVisited.put(n,Boolean.TRUE);
            
        }
        
        int right ;
        int left;
        int currentLen ;
        int maxLen = 0;
        for(int n: nums){
            
            //Number is already visited
            if(!numberAndNotVisited.get(n))
                continue;
            
            right = n+1;
            currentLen = 1;
            left = n -1;
            
            while(numberAndNotVisited.containsKey(right)){
                
                currentLen++;
                numberAndNotVisited.put(right,Boolean.FALSE);
                right++;
                
            }
            
            while(numberAndNotVisited.containsKey(left)){
                
                currentLen++;
                numberAndNotVisited.put(left,Boolean.FALSE);
                left--;                
            }
            
            if(currentLen > maxLen)
                maxLen = currentLen;
            
        }
        
        return maxLen;
        
    }
}