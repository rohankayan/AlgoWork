class MyStack {

   Queue<Integer> pushQ ;
    Queue<Integer> popQ ;

    public MyStack() {
        pushQ = new LinkedList<>();
        popQ = new LinkedList<>();
    }

  public void push(int x) {
        pushQ.add(x);
        while(!popQ.isEmpty()){
            pushQ.add(popQ.poll());
        }
        Queue<Integer> tempQ = pushQ;
        pushQ = popQ;
        popQ = tempQ;
    }

    public int pop() {
        return popQ.poll();
    }

    public int top() {

        return popQ.peek();
    }



    public boolean empty() {
        return  popQ.isEmpty();
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