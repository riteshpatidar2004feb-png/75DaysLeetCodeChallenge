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
    public int[] nextLargerNodes(ListNode head) {
        if(head.next==null) return new int[]{0};
        int n=0,i=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        int[] answer=new int[n];
        ListNode slow=head,fast=head.next;
        while(slow!=null&&slow.next!=null){
            if(slow.val<fast.val){
                answer[i]=fast.val;
                slow=slow.next;
                fast=slow.next;
                i++;
            }
            else{
                fast=fast.next;
            }
            if(slow.next==null&&fast==null&&answer[i]==0){
                break;
            }
            if(fast==null&&answer[i]==0){
                slow=slow.next;
                fast=slow.next;
                i++;
            }
        }
        return answer;
    }
}