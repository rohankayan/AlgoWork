/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
     Map<Node,Node> node1Map = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node == null)
            return null;
        return dfs(node);
    }

    private Node dfs(Node oldNode){
        if(node1Map.containsKey(oldNode))
            return node1Map.get(oldNode);
        Node newNode =  new Node(oldNode.val);
        node1Map.put(oldNode,newNode);

        for (Node oldChild: oldNode.neighbors){           
            newNode.neighbors.add(dfs(oldChild));            
        }
        return newNode;
    }
}