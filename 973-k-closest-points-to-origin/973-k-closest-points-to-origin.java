class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> heap = new PriorityQueue<int[]>((n1,n2)-> euclideanDistance(n2[0],n2[1])-euclideanDistance(n1[0],n1[1]));
        
        int index = 0;
        for(int[] point: points){
            
            heap.add(point);
            if(heap.size()>k){
                heap.poll();
            }
        }
        
        List<int[]> results = new ArrayList();
        int[][] answer = new int[k][2];
        
        while(!heap.isEmpty()){
            results.add(heap.poll());
        }
        return results.toArray(answer);
    }
    
    
    private int euclideanDistance(int x, int y){
  
    return x*x + y*y;    
    }
}