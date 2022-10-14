class MyStack {

   Queue<Integer> pushQ ;
    Queue<Integer> popQ ;

    public MyStack() {
        pushQ = new LinkedList<>();
        popQ = new LinkedList<>();
    }

  public void push(int x) {
        pushQ.add(x);        
    }

    public int pop() {
        int size = pushQ.size();
        while(size>1){
            popQ.add(pushQ.poll());
            size--;
        }
        int top = pushQ.poll();
        Queue<Integer> tempQ = pushQ;
        pushQ = popQ;
        popQ = tempQ;
        return  top;
    }

    public int top() {
        int size = pushQ.size();
        int top = -1;
        while(size>0){
            top = pushQ.poll();
            popQ.add(top);
            size--;
        }
        
        Queue<Integer> tempQ = pushQ;
        pushQ = popQ;
        popQ = tempQ;
        return  top;
      
    }



    public boolean empty() {
        return  pushQ.isEmpty();
    }

   
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */