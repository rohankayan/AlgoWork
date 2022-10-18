class Solution {
   int[] memoization = new int[19];
    public int numTrees(int n) {

            return helper(1, n);
    }

    public int helper(int start, int end){
        int totalNum =0;
        if(end-start <=0 )
            return 1;
        
        if(memoization[end-start] != 0)
            return memoization[end-start];

        for(int i = start;i<= end ;i++){
            totalNum += helper(start, i-1) * helper( i+1, end);
        }
        memoization[end-start] = totalNum;
        return totalNum;
    }
}