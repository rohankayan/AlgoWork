class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] leftMultiplication = new int[nums.length];
        leftMultiplication[0] =1;

        for(int i = 1;i< nums.length;i++){
            leftMultiplication[i] = leftMultiplication[i-1] * nums[i-1];
        }

        int[] rightMultiplication = new int[nums.length];
        rightMultiplication[nums.length-1]=1;
        for(int i = nums.length-2;i>=0;i--){
            rightMultiplication[i] = rightMultiplication[i+1] * nums[i+1];
        }
        //System.out.println(Arrays.toString(nums));
        for(int i = 0;i< nums.length;i++){
            nums[i] = leftMultiplication[i] * rightMultiplication[i];
        }

        //System.out.println(Arrays.toString(leftMultiplication));
        //System.out.println(Arrays.toString(rightMultiplication));
        //System.out.println(Arrays.toString(nums));
        return  nums;
    }
}