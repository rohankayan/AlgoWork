class StockSpanner {

    LinkedList<Integer> priceDiff; 
    int maxPrice; int lastPrice;
    public StockSpanner() {
        priceDiff = new LinkedList<Integer>();
        maxPrice = Integer.MIN_VALUE;
        
        
    }
    
    Stack<int[]> stack = new Stack<>();
    public int next(int price) {
        int res = 1;
        while (!stack.isEmpty() && stack.peek()[0] <= price)
            res += stack.pop()[1];
        stack.push(new int[]{price, res});
        return res;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */