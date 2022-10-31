class Solution {
    public int arrangeCoins(int n) {

       long lower = 0;
       long upper = n;

       long mid = lower+ (upper-lower)/2;
       while(lower<=upper){
           mid = lower+ (upper-lower)/2;
           long coins = (mid *(mid+1))/2;
          if(coins > n){
               upper = mid - 1 ;
           }
           else if(coins == n) {
               return (int)mid;
           }
           else
               lower = mid+1;

       }
       return (int)upper;
    }
}