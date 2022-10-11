

 class WordDictionary {
    TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {

        TrieNode curr = root;

        for(char c: word.toCharArray()){
            TrieNode temp = curr.children.getOrDefault(c, new TrieNode());
            curr.children.put(c,temp);
            curr = temp;
        }
        curr.isEnd = true;

    }
     
     public boolean search(String word) {
        return search(word,0,root);
    }

    public boolean search(String word, int index, TrieNode root) {
        TrieNode curr = root;

        for(int i=index;i<word.toCharArray().length;i++){
            char c = word.toCharArray()[i];
            if(c == '.'){
                //dfs
                for(TrieNode node: curr.children.values()){
                    if(search(word,i+1,node)){
                        return true;
                    }
                }
                return false;

            }
            else{
                TrieNode temp = curr.children.get(c);
                if(temp == null)
                    return false;
                curr = temp;
            }

        }
        return curr.isEnd;
    }



    class TrieNode{
        Map<Character,TrieNode> children = new HashMap<>();
        boolean isEnd = false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */