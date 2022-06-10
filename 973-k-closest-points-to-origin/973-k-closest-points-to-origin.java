class Solution {
    
    PriorityQueue<int[]> heap = new PriorityQueue<int[]>((p1,p2)-> distance(p2)-distance(p1));
    public int[][] kClosest(int[][] points, int k) {
        for(int[] p: points){
            heap.add(p);
            if(heap.size()>k)
                heap.poll();
            
        }
        
        int[][] results = new int[k][2];
        
        for(int i=0; i<k;i++){
            
            results[i]=heap.poll();
        }
        return results;
    }
    
    int distance(int p[]){
        return (p[0]*p[0] + p[1]*p[1]);
        
    }
}