class KthLargest {
PriorityQueue<Integer> pq;
   int k;
    public KthLargest(int k, int[] nums) { 
   
   pq=new PriorityQueue<>((a,b)->a-b); //asc order priority lambda expression
    for(int n:nums)//adding all elements to pq
        pq.add(n);
      this.k=k;
    }
    
    public int add(int val) {
      pq.add(val); 
      while(pq.size()>k)//till k deleting all elements from last since only kth largest element is necessary
       pq.poll();
        return pq.peek(); //returning kth largest element
    }
}
