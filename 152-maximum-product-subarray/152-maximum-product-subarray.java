class Solution {
    int maxProduct;
    int minProduct;
    
    public int maxProduct(int[] nums) {
        
        maxProduct = nums[0];
        
        minProduct = nums[0];
        
        int ans = nums[0];
        
        for(int i =1; i<  nums.length ; i++){
            
            //System.out.println("Before swap MaxProduct:"+ maxProduct +",minProduct:"+ minProduct +",num:"+nums[i]);
            if(nums[i] < 0){                
                swap(maxProduct,minProduct);
            }
            
            //System.out.println("MaxProduct:"+ maxProduct +",minProduct:"+ minProduct +",num:"+nums[i]);
            
            maxProduct = Math.max(maxProduct*nums[i],nums[i] );
            minProduct = Math.min(minProduct*nums[i],nums[i] );
            
            
            ans = Math.max(maxProduct, ans);
            
            
        }
        
        return ans;
        
    }
    
    
    private void swap(int max, int min){        
        minProduct = max;
        maxProduct = min;
        
    }
}