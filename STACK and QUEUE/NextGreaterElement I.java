class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<Integer>();
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        int res[]=new int[nums1.length];
        int ind=0;
        for(int val:nums2)
        {
            while(!stack.isEmpty()&&stack.peek()<val)
            {
                map.put(stack.pop(),val);
            }
            stack.push(val);
        
        for(int val:nums1)
        {
            if(map.containsKey(val)==true)
            {
                res[ind++]=map.get(val);
            }
            else
            {
                res[ind++]=-1;
            }
        }
        return res;
        
    }
}
