class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b)->a.val-b.val);
        for(int i=0;i<lists.length;i++)//adding all list values in pq based on priority condition(asc)
        {
            ListNode node=lists[i];
            while(node!=null)
            {
               pq.add(node);   //adding all values in list to pq
                node=node.next;
            }
        }
        ListNode res=new ListNode();
        ListNode curr=res;
        while(!pq.isEmpty())
        {
          curr.next=pq.poll();  //removing each element and converting into single list
          curr=curr.next;
        }
        curr.next=null;
        return res.next;
    }
}
