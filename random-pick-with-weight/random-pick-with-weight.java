class Solution {
    
    int[] prefixSum;
    int totalSum; 
    public Solution(int[] w) {
        
        prefixSum = new int[w.length];
        totalSum = 0;
        for(int i = 0; i < w.length; i++){
            prefixSum[i] = totalSum + w[i];
            totalSum = prefixSum[i];            
        }
        
    }
    
    public int pickIndexLinear() {
        
        double probability = totalSum * Math.random();
        
        for(int i =0; i < prefixSum.length;i++){
            
            if(probability <= prefixSum[i]){
                return i;
            }
            
        }
        
        return -1;
        
    }
    
    
     public int pickIndex() {
        
        double probability = totalSum * Math.random();
        
        int l = 0; 
        int r = prefixSum.length-1;
        
         while(l< r){
             int mid = (l + r)/2;
             
             if(probability> prefixSum[mid]){
                 l = mid +1;
             }
             else{
                 r = mid;
             }
             
         }
        
        return r;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */