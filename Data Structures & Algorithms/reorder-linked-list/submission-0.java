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
        List<ListNode> li = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null){
            li.add(temp);
            temp = temp.next;
        }
        int l = 0, r = li.size()-1;
        while(l<r){
            li.get(l).next = li.get(r);
            l++;
            if(l>=r){
                break;
            }
            li.get(r).next = li.get(l);
            r--;
        }
        li.get(l).next = null;

    }
}
