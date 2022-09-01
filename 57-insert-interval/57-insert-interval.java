class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        
        
        List<int[]> result = new ArrayList<int[]>();
        // if newIntervale is null 
        
        //Keep the merged range interval as new interval 
        
        for(int[] interval : intervals ){
            
            
            if(newInterval == null || interval[1]< newInterval[0]){
                result.add(interval);
            }
            else if(newInterval[1]< interval[0]){
                
                result.add(newInterval);
                result.add(interval);
                newInterval = null;
            }
            else {
                newInterval[0] = Math.min(newInterval[0],interval[0] );
                newInterval[1] = Math.max(newInterval[1],interval[1] );
                
            }
                
                
            }
        
        if(newInterval != null){
            result.add(newInterval);
        }
        
        return result.toArray(new int[result.size()][2]);
        }
    
}