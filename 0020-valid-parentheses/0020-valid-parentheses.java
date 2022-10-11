class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char c: s.toCharArray()){
            
            switch (c){
                case '}':
                    
                    if(stack.size()==0 || stack.pop() != '{')
                        return false;
                    break;
                case ']':
                    
                    if(stack.size()==0 || stack.pop() != '[')
                        return false;
                    break;
                case ')':
                    
                    if(stack.size()==0 || stack.pop() != '(')
                        return false;
                    break;
                default:
                    stack.push(c);
            }
            
        }
        return stack.empty();

    }
}