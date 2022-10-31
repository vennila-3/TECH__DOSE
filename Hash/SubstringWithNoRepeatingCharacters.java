class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0,j=0;j<s.length();j++)
        {
            if(map.containsKey(s.charAt(j))&&map.get(s.charAt(j))>=i)
                i=map.get(s.charAt(j))+1;
            int curr=j-i+1;
            max=Math.max(max,curr);
            map.put(s.charAt(j),j);
        }
        return max;
    }
}
