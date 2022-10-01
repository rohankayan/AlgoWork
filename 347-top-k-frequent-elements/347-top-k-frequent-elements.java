class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // map of frequency

        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int n: nums){
            int count = freqMap.getOrDefault(n,0);
            freqMap.put(n,++count);
        }

        // heap with k element based on frequency
        PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>((a,b)-> a.getValue()-b.getValue());
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()){
            heap.add(entry);
            if(heap.size()>k)
                heap.poll();
        }
        int[] result = new int[k];
        int i=0;
        while(heap.size()>0){
            result[i++]=heap.poll().getKey();
        }
        
        return result;
        
    }
}