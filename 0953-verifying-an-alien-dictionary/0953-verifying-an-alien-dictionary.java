class Solution {
     public boolean isAlienSorted(String[] words, String order) {
        char[] orderedChars = order.toCharArray();
        Map<Character,Integer> orderedMap = new HashMap<>();
        int i=1;
        for(char c:orderedChars){
            orderedMap.put(c,i++);            
        }
        
        //iterate over all the words and compare 2 words 
        
        for (int j =0;j< words.length-1;j++){
            
            String w1 = words[j];
            String w2 = words[j+1];
            int w2Length = w2.length();
            boolean firstDiff = false;
            for(int k=0;k< w1.length() && !firstDiff;k++){
                
                System.out.println("K:"+k+",w2 length:"+w2Length+",w1:"+w1);
                if(k>=w2Length){
                    return false;
                }
                
                if(w1.charAt(k) != w2.charAt(k)){
                    System.out.println(w1.charAt(k)+":"+w2.charAt(k));
                    if(orderedMap.get(w1.charAt(k))> orderedMap.get(w2.charAt(k)))
                        return false;
                    firstDiff = true;
                        
                }
                
            }
        }
        return true;
    }
}