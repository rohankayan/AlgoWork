class Solution {
    
    int[][] directions = {{1,0},{0,1},{-1,0},{0,-1}};
    int INF = Integer.MAX_VALUE;
    
    public void wallsAndGates(int[][] rooms) {
        
        for(int i=0;i< rooms.length;i++){
            for(int j=0;j< rooms[0].length;j++){
                
                if(rooms[i][j]==0){                    
                    for(int [] d: directions){                
                        markDistance(rooms, i+d[0], j+d[1], 1);
                    }
                }
            }
        }
        
    }
    
    private void markDistance(int[][] rooms, int i , int j, int distance){
        
        if(i<0 || j< 0|| i== rooms.length || j== rooms[0].length || rooms[i][j] == -1)
            return;
        
        if(rooms[i][j] > distance ){
            
            rooms[i][j] = distance;
            //System.out.println(String.format("i:%d,j:%d,distance:%d", i, j, distance));
            for(int [] d: directions){                
                markDistance(rooms, i+d[0], j+d[1], distance+1);
             }            
        }          
        
        return;
        
    }
}