class Solution {
   int[][] neighbours = {{0,1},{0,-1},{1,0},{-1,0}};
    int maxTime = 0;
    public int orangesRotting(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        Queue<Pair<Integer,Integer>> nodes = new LinkedList<>();
        Queue<Pair<Integer,Integer>> neighbors = new LinkedList<>();
        for(int i = 0; i<m ; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == 2){
                    nodes.add(new Pair(i,j));
                }
            }
        }

        while (!nodes.isEmpty()){            
            Pair<Integer,Integer> node = nodes.poll();
            for (int[] neibhor : neighbours){
                int newI =node.key+ neibhor[0];
                int newJ = node.value+ neibhor[1];
               
                if(newI < 0 || newI >= m || newJ <0 || newJ >=n || grid[newI][newJ] != 1)
                    continue;              
               
                grid[newI][newJ] = 2;
                neighbors.add(new Pair<>(newI,newJ));               

            }
           
            if(nodes.isEmpty() && !neighbors.isEmpty()){
                nodes = neighbors;
                neighbors = new LinkedList<>();
                maxTime++;
            }
        }

        for(int i = 0; i<m ; i++){
            for(int j = 0; j<n; j++){
                if(grid[i][j] == 1){
                    return -1;
                }
            }
        }

        return maxTime;

    }



    static class Pair<K,V>{
        K key;
        V value;

        Pair(K key, V value){
            this.key = key;
            this.value = value;
        }
        
         @Override
        public String toString() {
            return "Pair{" +
                   "key=" + key +
                   ", value=" + value +
                   '}';
        }

    }
}