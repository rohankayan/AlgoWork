class Solution {
    public int findJudge(int n, int[][] trust) {
        
        //calculating indegree and outdegree
        
        int[] indegrees = new int[n+1];
        int[] outdegrees = new int[n+1];
        
        for(int[] edge: trust){
         indegrees[edge[1]]++;
         outdegrees[edge[0]]++;
            
        }
        
        for(int i =1; i< n+1; i++){
            
            if(indegrees[i] == n-1 && outdegrees[i]==0)
                return i;
        }
        return -1;
    }
}