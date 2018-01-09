public class SwapNodesInPairs {
    // 2 ways. First, use firstHead and secondHead to traverse the list.
	public ListNode swapPairs2(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode firstHead = head;
        ListNode secondHead = head.next;
        
        while(firstHead != null && secondHead != null) {
            temp.next = secondHead;
            temp = temp.next;
            ListNode tempF = secondHead.next;
            
            temp.next = firstHead;
            temp = temp.next;

            if(tempF != null) {
            	firstHead = tempF;
                ListNode tempS = firstHead.next;
                
                if(tempS == null) {
                	temp.next = firstHead;
                	break;
                }
                else {
                	secondHead = tempS;
                }
            }
            else {
            	temp.next = null;
            	break;
            }
        }
        
        return dummy.next;
    }
    
    // More concise.
	public ListNode swapPairs2(ListNode head) {
    	if(head == null || head.next == null) {
			return head;
		}
		
		ListNode dummy = new ListNode(0);                                
		dummy.next = head;
		ListNode prev = dummy;
		ListNode temp = head;
		
		while(temp != null && temp.next != null) {
			ListNode after = temp.next.next;
			prev.next = temp.next;
			temp.next = after;
			prev = prev.next;
			prev.next = temp;
			prev = temp;
			temp = after;
		}
        
		return dummy.next;
	}
}
