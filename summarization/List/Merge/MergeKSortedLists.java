public class MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0) {
            return null;
        }
        
        // Using Priority Queue which makes this question much easier.
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(new Comparator<ListNode>(){
            @Override
            public int compare(ListNode l1, ListNode l2) {
                return l1.val - l2.val;
            }
        });
        
        ListNode dummy = new ListNode(0);
        for(int i=0; i<lists.length; i++) {
            if(lists[i] != null) {
                queue.offer(lists[i]);
            }
        }
        
        ListNode temp = dummy;
        while(!queue.isEmpty()) {
            ListNode node = queue.poll();
            temp.next = node;
            temp = node;
            
            if(node.next != null) {
                queue.offer(node.next);
            }
        }
        
        return dummy.next;
    }
}
