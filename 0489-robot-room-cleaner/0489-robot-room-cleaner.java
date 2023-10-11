/**
 * // This is the robot's control interface.
 * // You should not implement it, or speculate about its implementation
 * interface Robot {
 *     // Returns true if the cell in front is open and robot moves into the cell.
 *     // Returns false if the cell in front is blocked and robot stays in the current cell.
 *     public boolean move();
 *
 *     // Robot will stay in the same cell after calling turnLeft/turnRight.
 *     // Each turn will be 90 degrees.
 *     public void turnLeft();
 *     public void turnRight();
 *
 *     // Clean the current cell.
 *     public void clean();
 * }
 */

class Solution {
    
    Set<Pair<Integer,Integer>> visited = new HashSet<>();
    //0 for up , 1 for right , 2 for down and 3 for left 
    int[][] neighbors = new int[][]{{-1,0},{0,1},{1,0},{0,-1}};
    Robot robot;
    
    void moveBack(){
        robot.turnLeft();
        robot.turnLeft();
        robot.move();
        robot.turnRight();
        robot.turnRight();        
    }
    
    void backtracking(int i, int j , int direction){
        visited.add(new Pair(i,j));
        robot.clean();
        
        for(int n = 0;n < 4;n++){
         int newI = i + neighbors[(n+direction)%4][0];
         int newJ = j + neighbors[(n+direction)%4][1];
         int newD =   (n+direction)%4 ;
         if(!visited.contains(new Pair(newI,newJ))&& robot.move()){
             backtracking(newI,newJ,newD);
             //move back
             moveBack();
         }   
         robot.turnRight();  
            
        }       
        
        
    }
    
    
    public void cleanRoom(Robot robot) {
        
        this.robot = robot;
        backtracking(0,0,0);
        
        
        // keep track of visited neighbors and backtrack when all the neibhors are visited 
        
    }
}