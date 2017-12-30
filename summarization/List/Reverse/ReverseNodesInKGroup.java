public class ReverseNodesInKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k <= 1) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode temp = head;
        int count = 0;
        
        while(temp != null) {
            temp = temp.next;
            count = count + 1;
            if(count == k) {
                prev = reverse(prev, temp);
                count = 0;
            }
        }
        
        return dummy.next;
    }
    
    // the "before" node will not be changed.
    private ListNode reverse(ListNode prev, ListNode next) {
        ListNode before = prev.next;
        ListNode temp = before.next;
        while(temp != next) {
            ListNode tempNext = temp.next;
            temp.next = prev.next;
            prev.next = temp;
            temp = tempNext;
        }
        before.next = next;
        return before;
    }
}
