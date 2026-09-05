/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        //timestamp: 06:37:00 of linked list's lecture 2

        //yeh hashmap 02 wale lecture ka hai timestamp: 02:16:00
        Node head1 = new Node(-1);
        Node temp = head, temp1 = head1;
        while(temp != null){
            Node newnode = new Node(temp.val);
            temp1.next = newnode;
            temp1 = temp1.next;
            temp = temp.next;
        } 
        head1 = head1.next; // just deleting the dummy node  Node head1 = new Node(-1);
        temp = head; temp1 = head1;
        HashMap <Node, Node> map = new HashMap<>();
        while(temp != null){
            map.put(temp, temp1);
            temp1 = temp1.next;
            temp = temp.next;
        } 
        Node ta = head;
        while(ta != null){
            if(ta.random != null) map.get(ta).random = map.get(ta.random);
            else map.get(ta).random = null;
            ta = ta.next;
        }
        return head1;
    }
}








