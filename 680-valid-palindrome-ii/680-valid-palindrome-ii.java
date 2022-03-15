class Solution {
    
    public boolean validPalindrome(String s) {
        
        char[] c = s.toCharArray();
        return isPalindrome(0, c.length-1,  c,0);
    }
    
    private boolean isPalindrome(int l, int r, char[] c, int numOfMismatch){
        
        if(l>=r ){
            if(numOfMismatch > 1){
                return false;
            }
            else{
                //System.out.println(String.format("Ending Left: %s, Right:%s,numOfMismatch:%s ", l, r, numOfMismatch));
                return true;
            }
                
        }
        
        if(c[l] != c[r]){
            //System.out.println(String.format("Unequal Left: %s, Right:%s,numOfMismatch:%s ", l, r, numOfMismatch));
            if(numOfMismatch >= 1){
                return false;
            }
            else{
                
                return isPalindrome(l+1, r,  c, numOfMismatch+1) || isPalindrome(l, r-1,  c,numOfMismatch+1); 
            }            
            
        }
        else{
            //System.out.println(String.format("Equal Left: %s, Right:%s", l, r));
            return isPalindrome(l+1, r-1,  c,numOfMismatch) ;
        }
        
    }
}