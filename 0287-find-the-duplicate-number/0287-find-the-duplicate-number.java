class Solution {
    public int findDuplicate(int[] nums) {
        int left = 1;
        int right = nums.length -1;
        int duplicate = -1;
        
        int mid =  left + (right-left)/2;
        
        while(left <= right){
            
            mid =  left + (right-left)/2;
            
            int curr = mid;
            int count =0;
            for(int n: nums){
                
                if(n<= curr){
                    count++;
                }
            }
            
            if(count > curr){
                duplicate = curr;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return duplicate;
    }
    
    
}