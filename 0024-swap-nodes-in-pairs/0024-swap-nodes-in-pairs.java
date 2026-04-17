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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode slow=head,fast=head.next;
        while(slow!=null&&fast!=null){
            int temp=slow.val;
            slow.val=fast.val;
            fast.val=temp;
            slow=fast.next;
            if(slow==null) break;
            fast=slow.next;
        }
        return head;
    }
}