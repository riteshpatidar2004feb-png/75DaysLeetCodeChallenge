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
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next==null) return head;
        if(head.next.next==null){
            int temp=head.val;
            head.val=head.next.val;
            head.next.val=temp;
            return head;
        }
        ListNode slow1=head;int i=1;
        while(i<k) {
            slow1=slow1.next;
            i++;
        }
        ListNode slow2=head,fast=head;i=1;
        while(i<=k){
            fast=fast.next;
            i++;
        }
        while(fast!=null){
            slow2=slow2.next;
            fast=fast.next;
        }
        int temp=slow1.val;
            slow1.val=slow2.val;
           slow2.val=temp;
           return head;
    }
}