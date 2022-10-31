class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
          map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int arr[]=new int[k];
       int i=0;
        while(i<k)
        { 
            int max=findmax(map);
           arr[i]=max;
            map.remove(max);
            i++;
       }
     return arr;   
    }
    int findmax(HashMap<Integer,Integer> map)
    {
        int max=0,val=-1;
        for(int i:map.keySet())
        {
            if(max<map.get(i))
            {
                max=map.get(i);
                val=i;
            }
        }
        return val;
    }
}
