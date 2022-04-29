class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int currentShortestDis = Integer.MAX_VALUE;
        int index = -1;
        
        int i=0;
        for(int[] p: points){
            if(p[0]== x || p[1]==y){
                
                int dis = Math.abs(x-p[0]) + Math.abs(y-p[1]);
                
                if(dis < currentShortestDis){
                    currentShortestDis = dis;
                    index = i;
                }

            } 
            i++;
            
        }
        
        return index;
        
    }
}