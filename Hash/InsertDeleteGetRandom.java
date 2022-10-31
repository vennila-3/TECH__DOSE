class RandomizedSet {
    HashMap<Integer,Integer> map;//creating an hashMap
    List<Integer> l;//creating an arraylist
    public RandomizedSet() {
        map=new HashMap<>();
        l=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(!map.containsKey(val))//if val is not already present
        {
            l.add(val);//adding into the list
            map.put(val,l.size()-1);//add into map with curr index position
            return true;
        }
        return false;//if already present
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val))//if the value is present
        {
            int index=map.get(val);//getting the index for curr value from the map
            l.set(index,l.get(l.size()-1));
            map.put(l.get(l.size()-1),index);//puuting the last element again and updating the index
            map.remove(val);//removing value from the map
            l.remove(l.size()-1);//removing last value from the list
            return true;
            
        }
        return false;
        
    }
    
    public int getRandom() {
        Random random = new  Random();//creating an object
        int ind = random.nextInt(l.size());//random index
        return l.get(ind);
    }
}
