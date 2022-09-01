class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        //sort the interval 

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // find if endValues are overlapping , that means we need to remove the one which is longer 
        
        int result = 0;
        int prevEnd = Integer.MIN_VALUE;
        
        for (int[] i : intervals){
            int start = i[0];
            int end = i[1];
            
            
            
            if(start >= prevEnd){
                prevEnd = end;
            }
            else{
                result++;
                prevEnd = Math.min(prevEnd,end);
            }
        }
        return result;
    }
}