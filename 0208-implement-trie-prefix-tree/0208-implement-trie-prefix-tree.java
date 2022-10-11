public class Trie {
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        
        TrieNode curr = root;
        
        for(char c: word.toCharArray()){
            TrieNode temp = curr.children.getOrDefault(c, new TrieNode());
            curr.children.put(c,temp);
            curr = temp;
        }
        curr.isEnd = true;

    }

    public boolean search(String word) {
        TrieNode curr = root;

        for(char c: word.toCharArray()){
            TrieNode temp = curr.children.get(c);
            if(temp == null)
                return false;
            curr = temp;
        }
        return curr.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode curr = root;

        for(char c: prefix.toCharArray()){
            TrieNode temp = curr.children.get(c);
            if(temp == null)
                return false;
            curr = temp;
        }
        return true;
    }
    
    class TrieNode{
        Map<Character,TrieNode> children = new HashMap<>();
        boolean isEnd = false;
    }
}


/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */