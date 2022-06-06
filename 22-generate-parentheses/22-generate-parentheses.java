class Solution {
    

   
    List<String> combinations = new ArrayList<String>();
    public List<String> generateParenthesis(int n) {
        backtrack(new StringBuilder() ,  n, n);
        return combinations;
    }
    
    void backtrack(StringBuilder currSel,  int remainingOpeningBracketCount, int remainingClosingBracketCount){
        if(remainingOpeningBracketCount==0 && remainingClosingBracketCount == 0){
            combinations.add(currSel.toString());
            return;
        }
            
        if(remainingClosingBracketCount > remainingOpeningBracketCount){
            currSel.append(")");
            backtrack(currSel,  remainingOpeningBracketCount,remainingClosingBracketCount-1 );
            currSel.deleteCharAt(currSel.length()-1);
        }
        if( remainingOpeningBracketCount>0){
            currSel.append("(");
            backtrack(currSel,  remainingOpeningBracketCount-1,remainingClosingBracketCount );
            currSel.deleteCharAt(currSel.length()-1);
        }
        
        
        return;
        
        
        
    }
}