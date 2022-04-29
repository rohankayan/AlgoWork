class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] passengerCount =new int[1001];
        
        for(int[] t: trips){            
            passengerCount[t[1]] += t[0];
            passengerCount[t[2]] -= t[0];            
        }
        
        int currentCapacity =0;
        for(int i=0;i< 1001;i++){            
            currentCapacity += passengerCount[i];            
            if(currentCapacity> capacity)
                return false;
        }
        
        return true;
        
    }
}