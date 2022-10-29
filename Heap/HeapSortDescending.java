import java.util.*;
public class Main
{
    static void heapify(int[] arr,int i)
	{
	    int lar=i;
	    int l=2*i;
	    int r=2*i+1;
	    if(l<arr.length&&arr[l]>arr[lar])
	    lar=l;
	    if(r<arr.length&&arr[r]>arr[lar])
	    lar=r;
	    if(lar!=i)
	    {
	       int t=arr[i];
	       arr[i]=arr[lar];
	       arr[lar]=t;
	        heapify(arr,lar);
	    }
	}
    static void PopHeapify(List<Integer> l,int i)
    {
        int lar=i;
        int L=2*i;
        int R=2*i+1;
        if(L<l.size()&&l.get(i)<l.get(L))
        lar=L;
        if(R<l.size()&&l.get(lar)<l.get(R))
        lar=R;
        if(lar!=i)
        {
            Collections.swap(l,i,lar);
            PopHeapify(l,lar);
        }
        
    }
    static int HeapPop(List<Integer> l)
    { 
        int n=l.size();
        int max=l.get(1);
        l.set(1,l.get(n-1));
        l.remove(n-1);
        PopHeapify(l,1);
        return max;
    }
    static void buildheap(int[] arr,int n)
	{
	    for(int i=(n/2)+1;i>0;i--)
	    heapify(arr,i);
	}
	public static void main(String[] args) {
	  int arr[]={0,9,6,-1,3,4,2,1}; //given Array
	  buildheap(arr,8);  //apply buildheap to build maxheap
	    List<Integer>  l=new ArrayList<>();
	     List<Integer> res=new ArrayList<>();
	    for(int i:arr)
	    l.add(i);
	    for(int i=1;i<arr.length;i++)
	    {
	        int max=HeapPop(l); //using heappop algorithm to pop maxelement and store in list
	        res.add(max);
	    }
	
		System.out.println(res);
	}
}
