class Solution {
      public int[][] merge(int[][] intervals) {
        //sort the intervals based on start time
          
          java.util.Arrays.sort(intervals, new java.util.Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if(a[0] == b[0])
                    return Integer.compare(a[1],b[1]);
                return Integer.compare(a[0], b[0]);
            }
        });
          
        ArrayList<List<Integer>> mergedIntervals = new ArrayList<>();

        //3 cases
        // 1. fully overlapping
        //new interval is smallest of start time of i or j , and end time is bigger of end time
        // of i or j
        int prevEndTime = -1;
        int preStartTime = Integer.MAX_VALUE;
        for(int i =0; i<intervals.length;i++){
            if(intervals[i][0] > prevEndTime){
                //there is no overlap with prev

                if( i != 0){
                    mergedIntervals.add(List.of(preStartTime,prevEndTime));
                }
                preStartTime = intervals[i][0];
                prevEndTime = intervals[i][1];
            }
            else{
                preStartTime = Math.min(preStartTime,intervals[i][0]);
                prevEndTime = Math.max(prevEndTime,intervals[i][1]);
            }


        }

        mergedIntervals.add(List.of(preStartTime,prevEndTime));

        // 2 partially overlapping

        // 3. not overlapping

        System.out.println(mergedIntervals);

        int[][] finalInterval = new int[mergedIntervals.size()][2];
        int count = 0;
        for(List<Integer> interval : mergedIntervals){
            finalInterval[count][0] = interval.get(0);
            finalInterval[count][1] = interval.get(1);
            count++;
        }
        return finalInterval;
    }
}