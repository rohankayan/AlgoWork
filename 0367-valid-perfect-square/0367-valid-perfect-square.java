class Solution {
    public boolean isPerfectSquare(int num) {
        if(num ==1 )
            return true;
        long lower = 1;
        long upper = num;
        long mid = lower + (upper-lower)/2;
        while(lower<=upper){
            mid = lower + (upper-lower)/2;
            long curr = mid* mid;
            if(num == curr)
                return true;
            if(curr > num){
                upper = mid -1;
            }
            else{
                lower = mid +1;
            }
        }
        return false;
    }
}