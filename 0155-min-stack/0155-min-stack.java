class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minstack;
    

    public MinStack() {
        stack = new Stack<Integer>();
        minstack = new Stack<Integer>();
    }
    
    public void push(int val) {
        int min = Math.min(val,minstack.isEmpty()? val: minstack.peek() );
        minstack.push(min);
        stack.push(val);
        
        //stack.forEach(s-> System.out.print(Arrays.toString(s)));
        //System.out.println();
        
    }
    
    public void pop() {
       stack.pop();
        minstack.pop();
            
    }
    
    public int top() {
        return stack.peek();
            
    }
    
    public int getMin() {
       return minstack.peek();
            
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