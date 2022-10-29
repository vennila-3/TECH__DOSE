class Solution{
    class Num{   //creating class for tracking index and data
        int data;
        int index;
        public Num(int d,int i)   
        {
          data=d;
          index=i;
        }
    }
      public int[] maxSlidingWindow(int[] nums, int k)
      {
         int l=0,r=0;
         PriorityQueue<Num> q=new PriorityQueue<>((a,b)->b.data-a.data); //ordering priority queue with greatest element at top
          int arr[]=new int[nums.length-k+1];
         while(r<nums.length)
         {
             if(r-l<k)                       //adding elements until length reaches k
             {
                 q.add(new Num(nums[r],r));
                 r++;
             }
             if(r-l==k)                     //adding the top element in pq at array once the length exceeds k
             {
              arr[l++]=q.peek().data;  
             }
             while(!q.isEmpty()&&q.peek().index<l)
                 q.poll();
             
         }
          return arr;
      }
}
