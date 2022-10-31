class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++) //adding frequency of integers in map
        {
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a)); 
        pq.addAll(map.keySet()); //adding all keys values in hashmap to pq
        int arr[]=new int[k];
        int i=0;
        while(k!=0) //copying k elements from pq to array
        {
         arr[i++]=pq.poll();
            k--;
        }
        return arr;
    }
}
