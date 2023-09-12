/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    int globalSum = 0;
    int maxDepth = 0;
    public int depthSumInverse(List<NestedInteger> nestedList) {
        helperDepth(nestedList,1);
        System.out.println(String.format("Max Depth:%s",maxDepth));
        helperSum(nestedList,1);
        return globalSum;
    }
    
    void helperDepth(List<NestedInteger> nestedList, int depth){
        for(NestedInteger nl: nestedList){
             if(nl.isInteger()){
             maxDepth = Math.max(maxDepth,depth);
            }
            else{
                 maxDepth = Math.max(maxDepth,depth);
                helperDepth(nl.getList(),depth+1);
            }
            
        }   
      
        
    }
    
    void helperSum(List<NestedInteger> nestedList, int depth){
        for(NestedInteger nl: nestedList){
             if(nl.isInteger()){
            globalSum += nl.getInteger() * (maxDepth-depth+1);
            }
            else{
                helperSum(nl.getList(),depth+1);
            }
            
        }   
      
        
    }
    
    
    
}