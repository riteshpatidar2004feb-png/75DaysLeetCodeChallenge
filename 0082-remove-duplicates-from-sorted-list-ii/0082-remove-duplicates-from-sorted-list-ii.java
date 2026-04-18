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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null) return head;
        while(head!=null&&head.next!=null&&head.val==head.next.val){
            ListNode head1=head;
                while(head!=null&&head1.val==head.val){
                    head=head.next;
                }
            }
           if(head==null||head.next==null) return head;
        ListNode temp=head,i=head,j=head.next;
        while(i!=null&&j!=null){
            if(i.val!=j.val){
                if(temp!=null&&j!=null&&j.next!=null&&j.val!=j.next.val) temp=temp.next;
                i=j;
                j=i.next;
            }
            else if(i.val==j.val){
                while(j!=null&&j.val==i.val){
                    j=j.next;
                }
                temp.next=j;
            }
        }
        return head;
    }
}