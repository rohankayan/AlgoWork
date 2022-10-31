class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> results = new HashSet<>();

        for(int i =0 ; i< nums.length-2; i++){

            int j = i+1;
            int k = nums.length-1;
            while(j<k){
                int temp = nums[i]+nums[j]+ nums[k];
                if(temp == 0){
                    results.add( Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(temp>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return results.stream().collect(Collectors.toList());
    }
    
    
    
}