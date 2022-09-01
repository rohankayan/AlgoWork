class Solution {
    public int search(int[] nums, int target) {
        
        
        //left index , right index and mid 
        
        //if left index element is smaller than mid element left side is sorted otherwise right side is sorted 
        //take the sorted size
        
        int leftI = 0;
        int rightI = nums.length-1;
        
        
        
        while(leftI <= rightI){
            System.out.println("leftI:"+leftI+",rightI:"+rightI);
            int midI = (rightI+leftI)/2;
            
            if(nums[midI]== target){
                return midI;
            }
            else if(nums[leftI] <= nums[midI] ){
                //left side it sorted 
                if(target<nums[midI] && target>= nums[leftI])
                    rightI = midI-1;
                else
                    leftI = midI+1;
            }
            else{
                //right side is sorted
                
                if(target>nums[midI] && target<= nums[rightI])
                   
                    leftI = midI+1;
                else
                    rightI = midI -1;
                
            }
            
        }
        return -1;
    }
}