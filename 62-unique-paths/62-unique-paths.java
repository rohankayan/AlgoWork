class Solution {
    public int uniquePaths(int m, int n) {
        
        int[][] numOfPaths = new int[m][n];
        
        numOfPaths[0][0] =1;
        
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n ;j++){
                
                int count = 0;
                if(i>0){
                    count += numOfPaths[i-1][j];
                }
                if(j>0){
                    count += numOfPaths[i][j-1];
                }
                //System.out.println(String.format("i = %d, j =%d, count=%d ", i, j, count));
                numOfPaths[i][j] += count;
            }
            
            
        }
        
        return numOfPaths[m-1][n-1];
        
    }
}