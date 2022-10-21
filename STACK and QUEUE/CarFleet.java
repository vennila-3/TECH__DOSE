class Solution {
    public int carFleet(int target, int[] p, int[] speed) {
        int n=speed.length;
        Stack<Double> st=new Stack<>();
        Map<Integer,Double> map=new TreeMap<>();
        for(int i=0;i<p.length;i++)
        {
            map.put(p[i],((double)(target-p[i])/speed[i]));
            
        }
        Arrays.sort(p);//sorting the array
        st.push(map.get(p[n-1]));
        for(int i=n-2;i>=0;
        {
            if(st.peek()<map.get(p[i]))
            {
                st.push(map.get(p[i]));
            }
        }
        return st.size();returning the size
        
    }
}
