class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a,b)-> b-a);
        
        for(int i: nums){            
            queue.add(i);           
           
        }
        
        int totalSize = queue.size();
        
        while(k>1){
            k--;
            queue.poll();
            
        }
        
        return queue.poll();
        
    }
}