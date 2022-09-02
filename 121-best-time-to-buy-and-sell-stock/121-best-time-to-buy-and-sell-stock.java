class Solution {
    public int maxProfit(int[] prices) {
        
        
        // if sell price is more than purchase price sell the stock and see the profit 
        // keep minimum purchase price all the time and keep updating the profit
        
        
        int minPurchasePrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;
        
        for(int p: prices){
            int tempProfit = 0;
            if(p< minPurchasePrice)
                minPurchasePrice=p;
            if(p > minPurchasePrice){
                tempProfit = p - minPurchasePrice;
                maxProfit = Math.max(maxProfit,tempProfit);
            }
                
            
        }
        
        return Math.max(maxProfit,0);
    }
}