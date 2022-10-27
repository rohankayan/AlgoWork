class Solution {
     public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length-1;
        
        
        int numOfBoats = 0;
        
        while(left<=right){
            
            //System.out.println(String.format("left: %d, right:%d", left,right));
            
            if(left == right){
                numOfBoats++;
                break;
            }
            else if(people[right] + people[left] > limit){
                numOfBoats++;
                right--;
            }
            else {
                left++;
                right--;
                numOfBoats++;
            }
        }
        return  numOfBoats;
    }
}