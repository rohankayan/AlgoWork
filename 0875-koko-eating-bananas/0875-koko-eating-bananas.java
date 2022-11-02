class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 1;
        
        //finding upper bound 
        
        for(int p : piles){
            r = Math.max(r, p);
        }
        
        int mid = l + (r-l)/2;
        while(l<r){
            int hoursspend = 0;
            mid = l + (r-l)/2;
            for(int p: piles){
                 hoursspend += Math.ceil((double)p/mid);
            }
            
            if(hoursspend <= h){
                r = mid;
            }
            else{
                l = mid +1;
            }
            
        }
        return r;
    }
}