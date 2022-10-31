class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        int sum=0,max=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+(nums[i]==0?-1:nums[i]);
            if(sum==0)
                max=Math.max(max,i+1);
            else if(map.containsKey(sum))
                max=Math.max(max,i-map.get(sum));
            else
                map.put(sum,i);
        }
        return max;
    }
}
