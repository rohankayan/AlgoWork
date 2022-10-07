class Solution {
    public int lengthOfLastWord(String s) {
        int lastWordLength =0;
        char[] chars = s.toCharArray();
        boolean lastWordStarted = false;
        for(int j = chars.length-1;j>=0;j--){
            
            if(lastWordStarted == false && chars[j] != ' '){
                lastWordStarted = true;
                lastWordLength++;
            }
            else if (lastWordStarted == true ){
                if(chars[j] == ' ')
                    return lastWordLength;
                else
                    lastWordLength++;
                }
            }
        return lastWordLength;
        }
        
    
}