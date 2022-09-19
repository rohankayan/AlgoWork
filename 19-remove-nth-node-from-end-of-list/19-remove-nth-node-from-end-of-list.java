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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        
        ListNode slowPointer = dummyHead;
        ListNode fastPointer = dummyHead;
        
        while(n-->=0){
            fastPointer = fastPointer.next;
        }
        
        while(fastPointer != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }
        
        slowPointer.next = slowPointer.next.next;
        
        return dummyHead.next;
        
    }
}