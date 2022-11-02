class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        int numOfKill = 0;
        int total = dist.length;
        int[] minReached = new int[total];

        for(int i = 0;i< total;i++){
            minReached[i] = (int)Math.ceil( dist[i]/((double)speed[i]));
        }

        Arrays.sort(minReached);

        for (int i = 0; i< total ;i++){
            if(minReached[i]-i<=0){
                return numOfKill;
            }
            numOfKill++;
        }
        return numOfKill;
    }
}