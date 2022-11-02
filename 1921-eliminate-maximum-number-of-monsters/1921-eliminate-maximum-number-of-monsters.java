class Solution {
    public int eliminateMaximum2(int[] dist, int[] speed) {
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
    
     public int eliminateMaximum(int[] dist, int[] speed) {
        int tmp[] = new int[dist.length + 1];
        for (int i = 0; i < dist.length; i++) {
            int timeInMin = (dist[i] - 1) / speed[i] + 1;
            if (timeInMin > dist.length) timeInMin = dist.length;
            tmp[timeInMin]++;
        }
        
        int count = 0;
        for (int i = 0; i < tmp.length; i++) {
            count += tmp[i];
            if (count > i) return i;
        }
        
        return count;
    }
}