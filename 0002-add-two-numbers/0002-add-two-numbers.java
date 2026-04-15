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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=null,temp=null;
        ListNode temp1=l1,temp2=l2;
        int carry=0;
        while(temp1!=null&&temp2!=null){
            int sum=temp1.val+temp2.val+carry;
            if(sum>9){
                carry=1;
                sum=sum%10;
            }
            else carry=0;
        temp1=temp1.next;temp2=temp2.next;
         ListNode newnode =new  ListNode(sum);
         newnode.next=null;
         if(l3==null) l3=temp=newnode;
         else{
            temp.next=newnode;
            temp=newnode;
         }
        }
        if(temp2==null){
            while(temp1!=null){
                int sum=temp1.val+carry;
                if(sum>9){
                carry=1;
                sum=sum%10;
            }
            else carry=0;
         ListNode newnode =new  ListNode(sum);
         newnode.next=null;
         if(l3==null) l3=temp=newnode;
         else{
            temp.next=newnode;
            temp=newnode;
         }
         temp1=temp1.next;
        }
            }
        else if(temp1==null){
            while(temp2!=null){
                int sum=temp2.val+carry;
                if(sum>9){
                carry=1;
                sum=sum%10;
            }
            else carry=0;
         ListNode newnode =new  ListNode(sum);
         newnode.next=null;
         if(l3==null) l3=temp=newnode;
         else{
            temp.next=newnode;
            temp=newnode;
         }
         temp2=temp2.next;
        }
            }
        if(carry==1){
            ListNode newnode =new  ListNode(1);
         newnode.next=null;
         if(l3==null) l3=temp=newnode;
         else{
            temp.next=newnode;
            temp=newnode;
         }
        }
        return l3;
    }
}