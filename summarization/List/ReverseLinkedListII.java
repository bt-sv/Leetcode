public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null || head.next == null || m >= n) {
            return head;
        }
        
        boolean isOne = false;
        ListNode prev = new ListNode(0);
        prev.next = head;
        ListNode temp = head;
        
        if(m == 1) {
            isOne = true;
        }
        
        // make sure n is smaller than the length of list.
        int end = 1;
        while(end < n) {
            temp = temp.next;
            if(temp == null) {
                return head;
            }
            end = end + 1;
        }
        
        // traverse m and prev to the beginning of the loop.
        temp = head;
        int start = 1;
        while(start < m) {
            temp = temp.next;
            prev = prev.next;
            start = start + 1;
        }
        
        // Reverse. 
        // This is different than the ReverseLinkedList.java because prev and temp nodes are always same. 
        // What we need to change are: 
        // 1. temp.next.
        // 2. prev.next.
        // So, first we connect the temp node to the tempNext.next and make redirect tempNext.next to the prev.next.
        // Then, prev.next = tempNext.
        while(m < n) {
            ListNode tempNext = temp.next;
            temp.next = tempNext.next;
            tempNext.next = prev.next;
            prev.next = tempNext;
            m = m + 1;
        }
        
        // if m is 1, then head node will be changed.
        if(isOne) {
            return prev.next;
        }
        return head;
    }
}
