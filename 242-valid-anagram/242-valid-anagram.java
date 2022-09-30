class Solution {
    public boolean isAnagram(String s, String t) {
            char[] sChars = s.toCharArray();
            char[] tChars = t.toCharArray();
            if(sChars.length != tChars.length)
                return false;
            Map<Character,Integer> occurence = new HashMap<Character,Integer>();

            for(char c:sChars){

               int temp=  occurence.getOrDefault(c,0);
               occurence.put(c,++temp);
            }
            for(char c:tChars){
                if(occurence.containsKey(c) && occurence.get(c)>0){
                   
                       int temp=  occurence.get(c);
                       occurence.put(c,--temp);
                   
                }
                else{
                    return false;
                }
            }
            
            return true;
        }
}