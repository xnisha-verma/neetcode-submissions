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
    public void reorderList(ListNode head) {
        if(head==null) return;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode temp = slow.next;
        ListNode prev = slow.next = null;
        while(temp!=null){
            ListNode cur = temp.next;
            temp.next = prev;
            prev = temp;
            temp = cur;
        }
        ListNode first = head;
        temp = prev;
        while(temp!=null){
            ListNode tmp1 = first.next;
            ListNode tmp2 = temp.next;
            first.next = temp;
            temp.next = tmp1;
            first = tmp1;
            temp = tmp2;
        }



        // List<ListNode> li = new ArrayList<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     li.add(temp);
        //     temp = temp.next;
        // }
        // int l = 0, r = li.size()-1;
        // while(l<r){
        //     li.get(l).next = li.get(r);
        //     l++;
        //     if(l>=r){
        //         break;
        //     }
        //     li.get(r).next = li.get(l);
        //     r--;
        // }
        // li.get(l).next = null;

    }
}
