class Solution {
    
    PriorityQueue<Integer> heap = new PriorityQueue<Integer>((a,b)-> b-a);
    public int lastStoneWeight(int[] stones) {
        for(int s: stones){
            heap.add(s);
        }
        
        while(heap.size()>1){
            
            int stone1 = heap.poll();
            int stone2 = heap.poll();
            
            if(stone1 != stone2)
                heap.add(Math.abs(stone1-stone2));
        }
        
        if(heap.size()==1)
            return heap.poll();
        else
            return 0;
        }
}