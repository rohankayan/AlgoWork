class Solution {
    public void setZeroes(int[][] matrix) {
        
        
        
        boolean isFirstColZero = false; 
        boolean isFirstRowZero = false; 
        
        int numOfCol = matrix[0].length;
        int numOfRow = matrix.length;
        
        for(int r = 0; r< numOfRow; r++){
            
            if(matrix[r][0]==0)
                isFirstColZero = true;
        }
        
        for(int c=0;c< numOfCol ; c++){
            if(matrix[0][c]==0){
                isFirstRowZero = true;
            }
        }
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                
                if(matrix[i][j]==0){
                    
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
            
        }
        
        for(int i=1;i< matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                
                if(matrix[0][j]==0){
                    
                    matrix[i][j]=0;
                    
                }
                
                if(matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
            
        }
        
        if(isFirstColZero){
            
            for(int r = 0; r< numOfRow; r++){
            
            matrix[r][0]=0;
                
        }
        }
        
        
        if(isFirstRowZero){
            for(int c=0;c< numOfCol ; c++){
            matrix[0][c]=0;
        }
            
        }
    }
}