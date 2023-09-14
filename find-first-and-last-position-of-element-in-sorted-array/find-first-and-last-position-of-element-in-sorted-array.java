class Solution {
     public int[] searchRange(int[] nums, int target) {

        int firstOccurence = binarySearchWithBoundary(nums,target, true);
        int lastOccurence = binarySearchWithBoundary(nums,target, false);

        return new int[]{firstOccurence,lastOccurence};

    }


    int binarySearchWithBoundary(int[] nums, int target, boolean findFirst){
        int l =0;
        int r = nums.length-1;
        int mid =-1;
        boolean found =false;

        while(l<=r){
            mid = (l+r)/2;

            //mid is bigger
            if(nums[mid] > target){
                r = mid-1;
            }
            //mid is smaller
            if( nums[mid]< target){
                l = mid +1;
            }


            // mid is matching , them come out of loop and check the proximity
            if( nums[mid] == target){
                if(findFirst){
                    if( mid == 0 || nums[mid] != nums[mid-1] )
                        return mid;
                    else{
                        r = mid -1;
                    }
                }
                else{
                    if(mid == nums.length-1 || nums[mid] != nums[mid+1] )
                        return mid;
                    else
                        l = mid +1;
                }
            }


        }

        return -1;
    }

}