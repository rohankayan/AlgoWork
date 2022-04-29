class MyCalendarTwo {
    
    TreeMap<Integer,Integer> timeCount = new TreeMap();
    public MyCalendarTwo() {
        
    }
    
    public boolean book(int start, int end) {
       timeCount.put(start, timeCount.getOrDefault(start,0)+1);
        timeCount.put(end, timeCount.getOrDefault(end,0)-1);
        
        int activeBooking =0;
        
        for(Map.Entry<Integer,Integer> e: timeCount.entrySet()){
            
            activeBooking += e.getValue();
            
            if(activeBooking >=3){
                timeCount.put(start, timeCount.getOrDefault(start,0)-1);
                timeCount.put(end, timeCount.getOrDefault(end,0)+1);                
                return false;                
            }
        }
        
        return true;
        
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */