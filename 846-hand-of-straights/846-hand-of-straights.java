class Solution {
     public boolean isNStraightHand(int[] hand, int groupSize) {

        
        if(hand.length%groupSize != 0)
            return  false;
        
        
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        Map<Integer, Integer> numCount = new HashMap<Integer, Integer>();


        for(int h : hand){
            int currCount = numCount.getOrDefault(h,0);
            currCount++;
            numCount.put(h,currCount);
            heap.add(h);
        }

        while(!heap.isEmpty()){
            
            Integer smallest = heap.peek();
            int currCount = numCount.get(smallest);
            if(currCount != 0){
                for (int i =0; i<groupSize;i++){
                    if(numCount.containsKey(smallest+i))
                    {
                        currCount = numCount.get(smallest+i);
                        if(currCount == 0){
                            return false;
                        }
                        numCount.put(smallest+i,--currCount);
                    }
                    else{
                        return false;
                    }
                }
            }
            
            heap.poll();
        }
        return true;

    }
}