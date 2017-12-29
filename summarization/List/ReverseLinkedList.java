/*
public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
*/

// Reverse all the elements in the linkedlist.
// define a prev, as the next node of the node which is reversed.
// prev 1->2->3->4
// prev<-1 2->3->4
// prev<-1<-2 3->4
// prev<-1<-2<-3 4
// prev<-1<-2<-3<-4
//
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        
        ListNode prev = null;
        ListNode temp = head;
        while(temp != null) {
            ListNode tempNext = temp.next;
            temp.next = prev;
            prev = temp;
            temp = tempNext;
        }
        
        return prev;
    }
}
