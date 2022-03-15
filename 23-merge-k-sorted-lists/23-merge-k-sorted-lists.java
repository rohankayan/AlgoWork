/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>((a,b)-> a.val -b.val);
        if(lists.length == 0)
            return null;
        
        for(ListNode l : lists)
            if(l != null)
                pq.add(l);
        ListNode dummyHead = new ListNode(-1);
        ListNode curr = dummyHead;
        while(!pq.isEmpty()){
            ListNode t = pq.poll();
            curr.next = t;
            if(t.next != null){
                pq.add(t.next);
                t.next = null;
            }           
            
            curr = t;            
        }
        
        return dummyHead.next;
    }
}