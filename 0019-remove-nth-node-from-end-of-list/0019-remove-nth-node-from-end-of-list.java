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
        // if(head.next==null) return null;
        // if(head.next.next==null&&n==1) {
        //     head.next=null;
        //     return head;
        // }
        // if(head.next.next==null&&n==2) {
        //     head=head.next;
        //     return head;
        // }
        // if(head.next.next.next==null){
        //     if(n==3) head=head.next;
        //     if(n==2) head.next=head.next.next;
        //     if(n==1) head.next.next=null;
        //     return head;
        // }
        ListNode temp=head;
        int i=0,sz=0;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }
        if(sz==n) return head.next;
        ListNode temp1=head;
        n=sz-n;
        while(i<(n-1)) {
            temp1=temp1.next;
            i++;
        }
        if(temp1.next.next==null) temp1.next=null;
        else{
            temp1.next=temp1.next.next;
        }
        
        return head;
    }
}