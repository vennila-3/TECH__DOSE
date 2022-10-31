class MyHashMap {
     int arr[];
    public MyHashMap() {
        this.arr=new int[10000001];
    }
    
    public void put(int key, int value) {
        arr[key]=value+1;
        
    }
    
    public int get(int key) {
        return arr[key]-1;
        
    }
    
    public void remove(int key) {
        arr[key]=0;
        
    }
}
