class Solution {
    public boolean exist(char[][] board, String word) {
        char[] match = word.toCharArray();
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i =0;i< m;i++){
            for(int j=0;j<n;j++){
                if(backtrack(i,j,m,n,board,0,match,visited))
                    return true;
            }
        }
        return false;
    }
    
    boolean backtrack(int i, int j, int m, int n, char[][] board , int currMatchIndx, char[] match, boolean[][] visited){
        
        if(currMatchIndx == match.length){
            return true;
        }
        if(i >= m || i<0 ||j >= n || j<0 || visited[i][j] || board[i][j] != match[currMatchIndx])
            return false;
        
        //System.out.println(String.format("Outside:%s,i:%s,j:%s, match:%s, currMatchIndx:%s, visited:%s",board[i][j],i,j,currMatchIndx,match[currMatchIndx], visited[i][j]));
        
      
        visited[i][j] = true;
        
       
            
            //System.out.println(String.format("Match:%s,i:%s,j:%s, currMatchIndx:%s",board[i][j],i,j,currMatchIndx));
            boolean result =  backtrack(i+1,j,m,n,board,currMatchIndx+1,match, visited) || backtrack(i,j+1,m,n,board,currMatchIndx+1,match, visited)|| backtrack(i-1,j,m,n,board,currMatchIndx+1,match, visited)|| backtrack(i,j-1,m,n,board,currMatchIndx+1,match, visited);
       visited[i][j] = false;
        return result;
    }
}