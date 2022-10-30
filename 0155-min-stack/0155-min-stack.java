class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minstack;
    

    public MinStack() {
        stack = new Stack<Integer>();
        minstack = new Stack<Integer>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){          
            minstack.push(val);
        }
        else{
            int currentMin = minstack.peek();            
            if(val <= currentMin){
                minstack.push(val);
            }         
        }
        stack.push(val);
        
        //stack.forEach(s-> System.out.print(Arrays.toString(s)));
        //System.out.println();
        
    }
    
    public void pop() {
        if(!stack.isEmpty()){
            int curr = stack.pop();
            if(curr == minstack.peek()){
                minstack.pop();
            }
        }
            
    }
    
    public int top() {
        if(!stack.isEmpty()){
            return stack.peek();
             
        }           
        else{
            //System.out.println("Stack is empty");
            return -1;
        }
            
    }
    
    public int getMin() {
        if(!minstack.isEmpty())
            return minstack.peek();
        else{
            //System.out.println("Stack is empty");
            return -1;
        }
            
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */