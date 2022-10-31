class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>(); //creating hashmap holding key as sum and value as count
        map.put(0,1); //initially inserting 0 and count as 1
        int sum=0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(map.containsKey(sum-k))
                count+=map.get(sum-k);
            map.put(sum,map.getOrDefault(sum,0)+1); //adding the sum and its value
        }
        return count;
    }
}
