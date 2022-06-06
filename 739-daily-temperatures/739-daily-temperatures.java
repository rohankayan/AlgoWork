class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Pair<Integer,Integer>> stack = new Stack<>();
        int[] results = new int[temperatures.length];
        
        
        for(int i=0;i< temperatures.length;i++ ){
            int t = temperatures[i];
           while(!stack.isEmpty() && stack.peek().getKey()<t){
               Pair<Integer,Integer> temp = stack.pop();
               results[temp.getValue()]= i-temp.getValue();
           }
            stack.push(new Pair<Integer,Integer>(t,i));
        }
        
        return results;
    }
}