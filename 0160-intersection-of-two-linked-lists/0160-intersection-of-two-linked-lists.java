/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sz1=0,sz2=0;
        ListNode temp=headA;
        while(temp!=null){
            temp=temp.next;
            sz1++;
        }
        temp=headB;
        while(temp!=null){
            temp=temp.next;
            sz2++;
        }
        int skipA=0, skipB=0,intersectVal=0;
        //Listnode temp1=headA,temp2=headB;
        if(sz1>sz2) {
            skipA=sz1-sz2;
            int i=0;
            while(i<(sz1-sz2)) {
                headA=headA.next;i++;
                }
            while(headA!=null&&headB!=null){
                if(headA==headB) {
                    intersectVal=headA.val;
                    return headA;
                }
                headA=headA.next;
                headB=headB.next;
                skipA++;skipB++;
            }
        }
        else {
            skipB=sz2-sz1;
            int i=0;
            while(i<(sz2-sz1)) {
                headB=headB.next;
                i++;
            }
            while(headA!=null&&headB!=null){
                if(headA==headB) {
                    intersectVal=headA.val;
                    return headA;
                }
                headA=headA.next;
                headB=headB.next;
                skipA++;skipB++;
        }
    }
    return null;
}
}