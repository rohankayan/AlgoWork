class Solution {
    public boolean buddyStrings(String s, String goal) {
        
        Map<Character,Integer> charCountMap = new HashMap<java.lang.Character,java.lang.Integer>();
        
      
        for(char c: s.toCharArray()){
            
           int currCount =  charCountMap.getOrDefault(c,0);
            charCountMap.put(c,++currCount);
        }
        char[] g = goal.toCharArray();
        int numOfMismatch = 0;
        
        for(int k=0;k< g.length;k++){
            
            Integer existingPos = charCountMap.get(g[k]);
            
            if(existingPos==null || existingPos==0)
                return false;
            charCountMap.put(g[k],--existingPos);
            
            if(numOfMismatch>2)
                return false;
            
            if(g[k] != s.toCharArray()[k])
                numOfMismatch++;
        }
        
        if(numOfMismatch == 2)
            return true;
        else if(charCountMap.size()< g.length)
            return true;
        else
            return false;
        
    }
}