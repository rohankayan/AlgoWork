class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();

        for(String s : operations){

            try{
                int score = Integer.parseInt(s);
                scores.push(score);
                continue;
            }
            catch (Exception ex){}

            switch (s){
                case "C":
                    scores.pop();
                    break;
                case "D":
                    scores.push(2 * scores.peek());
                    break;
                case "+":
                    int last = scores.pop();
                    int sum = scores.peek()+last;
                    scores.push(last);
                    scores.push(sum);
                    break;
            }


        }
        int finalScore = 0;
        for(int i: scores){
            finalScore += i; 
        }
        return finalScore;
    }
}