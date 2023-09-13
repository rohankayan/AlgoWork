class Solution {
        public boolean judgePoint24(int[] cards) {
        List<Double> cardsList = new ArrayList<>();
        for( int c : cards){
            cardsList.add((double)c);
        }
        return helper(cardsList);
    }

    boolean helper(List<Double> cards){
        if(cards.size() ==1){
            if(Math.abs(cards.get(0)-24.0) < 0.1){
                return true;
            }
            else{
                return false;
            }

        }


        //Select random pairs of 2 numbers from cards

        for( int i = 0; i < cards.size();i++){
            for( int j = i+1; j < cards.size(); j ++){
                Double a = cards.get(i);
                Double b = cards.get(j);

                List<Double> getAllOptions = generateAllOptions(a,b);

                //Preparing list of remaining cards
                List<Double> remainingCards = new ArrayList<>();
                for( int k = 0 ; k < cards.size() ; k++){
                    if( k != i && k != j)
                        remainingCards.add(cards.get(k));
                }

                for( int h = 0 ; h < getAllOptions.size(); h ++){
                    remainingCards.add(getAllOptions.get(h));
                    boolean found = helper(remainingCards);
                    if(found)
                        return true;
                    remainingCards.remove(remainingCards.size()-1);
                }


            }

        }
        return false;

    }


    List<Double> generateAllOptions(Double a, Double b){
        List<Double> results = new ArrayList<>();

        results.add(a+b);
        results.add(a-b);
        results.add(b-a);
        results.add(a*b);
        if(b != 0){
            results.add(a/b);
        }

        if(a != 0){
            results.add(b/a);
        }

        return results;

    }
}