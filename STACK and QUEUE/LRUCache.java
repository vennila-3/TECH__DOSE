
class LRUCache {
    int capacity;
    Queue<Integer> ans=new ArrayDeque<>();//creating an Deque
    Map<Integer,Integer> map=new LinkedHashMap<>();//creating an hashMap;

    public LRUCache(int capacity) {
        this.capacity=capacity;//size 
        
    }
    
    public int get(int key) {
        if(map.containsKey(key))
        {
            ans.remove(key);
            ans.offer(key);
            return map.get(key);
        }
        else
        {
            return -1;//if key value not exists;
        }
        
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key))
        {
            ans.remove(key);
            ans.offer(key);
            map.put(key,value);
        }
        else
         {
            if(ans.size()<capacity)
             {
                ans.offer(key);
             }
             else//if size greater
             {
                 map.remove(ans.poll());
                 ans.offer(key);
             }
               map.put(key,value);
         }
          
    }
}
