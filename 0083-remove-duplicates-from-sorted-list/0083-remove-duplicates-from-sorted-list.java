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
        ListNode slow=head,fast=head;
        while(slow!=null&&slow.next!=null){
            fast=fast.next;
            if(slow.val==fast.val){
                slow.next=fast.next;
                fast=slow;
            }
            else slow=fast;
            if(fast.next==null){
                slow=slow.next;
                fast=slow;
            }
        }
        return head;
    }
}