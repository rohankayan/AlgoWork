class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> stoneWeights = new PriorityQueue(Comparator.reverseOrder());
        
        for(int s: stones){
            stoneWeights.add(s);
        }
        
        while(stoneWeights.size()>1){
            int s1 = stoneWeights.poll();
            int s2 = stoneWeights.poll();
            if(s2 != s1)
            stoneWeights.add(Math.abs(s2-s1));
                        
        }
        
        if(!stoneWeights.isEmpty())
            return stoneWeights.poll();
        
        return 0;
        
    }
}