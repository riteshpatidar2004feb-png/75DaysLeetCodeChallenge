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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head.next==null) return new int[]{-1,-1};
        int i=2;
        ListNode temp1=head,temp2=head.next;
        ArrayList<Integer> maxima=new ArrayList<>();
        while(temp2.next!=null){
            if(temp2.val>temp1.val&&temp2.val>temp2.next.val) maxima.add(i);
            if(temp2.val<temp1.val&&temp2.val<temp2.next.val) maxima.add(i);
            i++;
            temp2=temp2.next;
            temp1=temp1.next;
        }
        if(maxima.isEmpty()) return new int[]{-1,-1};
        int mindis=Integer.MAX_VALUE,maxdis=-1;
        for(int j=0;j<maxima.size()-1;j++){
            int dis=maxima.get(j+1)-maxima.get(j);
            if(dis<mindis) mindis=dis;
        }
        maxdis=maxima.get(maxima.size()-1)-maxima.get(0);
        int[] nums=new int[2];
        nums[0]=mindis;
        nums[1]=maxdis;
        if(maxdis==-1) nums[1]=-1;
        if(mindis==Integer.MAX_VALUE) nums[0]=-1;
        if(maxima.size()==1) {
            nums[0]=-1;nums[1]=-1;
        }
        return nums;
    }
}