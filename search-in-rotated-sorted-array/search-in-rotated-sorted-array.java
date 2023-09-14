class Solution {
   public int search(int[] nums, int target) {
        return binarySearch(nums,0, nums.length-1, target);
    }

    int binarySearch(int[] nums, int l, int r, int target){
        if(l > r)
            return -1;

        while(l <= r){
            
            int mid = (l +r)/2;

            if(nums[mid] == target)
                return mid;

            //decide which part is sorted
            //left is sorted
            if(nums[l]<= nums[mid]){
                if(nums[l] <= target && target < nums[mid]){
                    //number is on the left side 
                    r = mid -1;
                }
                else{
                    l = mid +1;
                }
            }
            else{
                //right is sorted

                if(nums[r] >= target && target > nums[mid]){
                    //number is on the right side 
                    l = mid +1;
                }
                else{
                    r = mid -1;
                }
                
            }

        }
        
        return -1;


    }
}