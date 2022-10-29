class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> map=new HashMap<>();
       
        for(int i=0;i<s.length();i++)//storing frequency of characters in hashmap
        {
            char ch=s.charAt(i);
          map.put(ch,map.getOrDefault(ch,0)+1); //updating the count of frequency if that character is already present in map
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a)); //creating pq and sorting in desc order based on condition
        pq.addAll(map.keySet()); //adding all the keys of hashmap to pq
         StringBuilder res=new StringBuilder();
        while(!pq.isEmpty())
        {
            char c=pq.poll();
            int count=map.get(c);
            while(count!=0)
            {
              res.append(c);  //appending the character its freq times.
                count--;
            }
        }
        return res.toString();
    }
}
