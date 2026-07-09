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
        ListNode dummy = new ListNode(-1);
        dummy.next = head; 
        ListNode slow = dummy;
        ListNode fast = head;
        while(n>0){
            fast = fast.next;;
            n--;
        }
        ListNode temp = head;
        while(fast!=null){
            slow = temp;
            temp= temp.next;
            fast = fast.next;
        }
        slow.next = temp.next;
        return dummy.next;
    }
}
