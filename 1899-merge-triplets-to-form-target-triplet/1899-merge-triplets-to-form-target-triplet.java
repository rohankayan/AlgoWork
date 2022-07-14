class Solution {
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        
        //
        boolean firstMatch = false, secondMatch = false, thirdMatch = false;
        for(int[] t: triplets){
            
            if(t[0] > target[0] || t[1] > target[1] || t[2] > target[2]){
                continue;
            }
            
            if(t[0] == target[0])
                firstMatch = true;
            
             if(t[1] == target[1])
                secondMatch = true;
            
             if(t[2] == target[2])
                thirdMatch = true;
            
            if(firstMatch && secondMatch && thirdMatch)
                return true;
            
        }
        
        return false;
    }
}