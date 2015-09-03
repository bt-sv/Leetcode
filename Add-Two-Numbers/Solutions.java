public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) {
            return l2;
        }
        if(l2 == null) {
            return l1;
        }
        int val = l1.val + l2.val;
        int addOne = 0;
        //ListNode head = new ListNode(val);
        if(val >= 10) {
           val = val-10;
           addOne = 1;
        }
        ListNode head = new ListNode(val);
        ListNode headL1 = l1;
        ListNode headL2 = l2;
        ListNode temp = head;
        headL1 = headL1.next;
        headL2 = headL2.next;
        while(headL1!=null && headL2!=null) {
            val = headL1.val + headL2.val + addOne;
            if(val >= 10) {
                val = val-10;
                addOne = 1;
            }
            else {
                addOne = 0;
            }
            ListNode newHead = new ListNode(val);
            temp.next = newHead;
            temp = newHead;
            headL1 = headL1.next;
            headL2 = headL2.next;
        }
        while(headL1 != null) {
            val = headL1.val + addOne;
            if(val >= 10) {
                val = val-10;
                addOne = 1;
            }
            else {
                addOne = 0;
            }
            ListNode newHead = new ListNode(val);
            temp.next = newHead;
            temp = newHead;
            headL1 = headL1.next;
        }
        while(headL2 != null) {
            val = headL2.val + addOne;
            if(val >= 10) {
                val = val-10;
                addOne = 1;
            }
            else {
                addOne = 0;
            }
            ListNode newHead = new ListNode(val);
            temp.next = newHead;
            temp = newHead;
            headL2 = headL2.next;
        }
        if(addOne == 1) {
            ListNode newHead = new ListNode(addOne);
            temp.next = newHead;
            temp = newHead;
        }
        return head;
}
