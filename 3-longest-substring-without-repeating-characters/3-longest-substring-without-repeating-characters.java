class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int startI = 0;
        int endI = 0;
        
        int currentLen = 0;
        
        int maxLen = 0;
        
        char[] char1 = s.toCharArray();
        
        Set<Character> visited = new HashSet();
        
        int len = char1.length;
        
        while(startI< len && endI < len){
            char c = char1[endI];
            
            if(!visited.contains(c)){                
                visited.add(c);
                endI++;                
            }
            else{
                visited.remove(char1[startI]);
                startI++;
            }
            
            currentLen = endI-startI;
            maxLen = Math.max(currentLen, maxLen);
        }
        
        return maxLen;
        
        //char visited 
        
        
        
        //char not visited
        
    }
}