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
        ListNode dummy = new ListNode(-1, head);
        ListNode left = dummy, right = head;

        while(n-- >0){
            right = right.next;
        }
        while(right!=null){
            left = left.next;
            right = right.next;
        }
        left.next = left.next.next;
        return dummy .next;
    }
}

// NOTE:  
// If your last line is return head;, the program simply looks at where the head variable is pointing, 
//sees the [5], and returns it. It doesn't know that node was supposed to be "deleted" from the main chain.
// Why return dummy.next; is bulletproof
// The dummy node acts as a permanent, safe anchor that sits exactly one spot before the real start of your list.
