/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
        //YEH MERA SOLUTION
        // ListNode temp=node;
        // while(temp.next!=null){
        //     temp.val=temp.next.val;
        //     temp=temp.next;
        // }
        // while(node.next.next!=null) node=node.next;
        // node.next=null;
    }
}