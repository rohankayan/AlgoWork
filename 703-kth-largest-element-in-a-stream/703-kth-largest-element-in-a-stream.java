class KthLargest {

    PriorityQueue<Integer> queue = new PriorityQueue();
    int k ;
    public KthLargest(int k, int[] nums) {
           this.k = k;
            for(int n: nums){
                add(n);              
               
            }
    }
    
   
    
    public int add(int val) {
        if(queue.size()<k){
             queue.add(val);
        }
        else if(val > queue.peek()){
            queue.add(val);   
            queue.poll();
        }
       return  queue.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */