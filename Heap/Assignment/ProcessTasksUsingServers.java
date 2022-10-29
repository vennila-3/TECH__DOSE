class Solution {
    public int[] assignTasks(int[] ser, int[] task) {
        PriorityQueue<int[]> free=new PriorityQueue<>((a,b)->a[0]!=b[0]?a[0]-b[0]:a[1]-b[1]); //ordering based on weight and index
        PriorityQueue<int[]> used=new PriorityQueue<>((a,b)->a[2]!=b[2]?a[2]-b[2]:(a[0]!=b[0]?a[0]-b[0]:a[1]-b[1])); //ordering based on count and then weight
        int n=ser.length;
        int m=task.length;
        for(int i=0;i<n;i++)
            free.add(new int[]{ser[i],i,0}); //adding all servers with initial usetime as 0 in free pq
        int res[]=new int[m]; //creating result array to store the server index
        int ind=0;
        for(int i=0;i<m;i++)
        {
            int time=task[i];
            while(!used.isEmpty()&&used.peek()[2]<=i)
                free.add(used.poll());
            if(free.isEmpty()) //condition for i there is no free servers
            {
               int curr[]=used.poll();
                res[ind++]=curr[1];
                curr[2]+=time;
                used.add(curr);
            }
            else    //if there if free server available
            {
                int curr[]=free.poll();
                res[ind++]=curr[1];
                curr[2]=i+time;
                used.add(curr);
            }
        }
        return res;
    }
}
