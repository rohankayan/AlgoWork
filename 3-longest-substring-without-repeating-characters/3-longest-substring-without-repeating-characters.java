class Solution {
    public int lengthOfLongestSubstring(String s) {
        
         int maxLength = 0;

        int startIndex = 0;
        int endIndex =0;

        HashSet<Character> visited = new HashSet<>();
        int len = s.length();
        while(startIndex < len && endIndex < len){

            char temp = s.charAt(endIndex);

            if(!visited.contains(temp)){

                visited.add(temp);
                endIndex++;
            }
            else{
                visited.remove(s.charAt(startIndex));
                startIndex++;
            }

            int currLen = endIndex-startIndex;

            maxLength = Math.max(currLen,maxLength);
        }

        return maxLength;
       
    }
}