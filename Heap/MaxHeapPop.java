import java.util.*;
public class Main
{   
    static void Heapify(List<Integer> l,int i)
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
            Heapify(l,lar);
        }
        
    }
    static int HeapPop(List<Integer> l)
    { 
        int n=l.size();
        int max=l.get(1);
        l.set(1,l.get(n-1));
        l.remove(n-1);
        Heapify(l,1);
        return max;
    }
	public static void main(String[] args) {
	    List<Integer>  l=new ArrayList<>();
	    l.add(0);
	    l.add(9);
	    l.add(8);
	    l.add(7);
	    l.add(5);
	    l.add(4);
	    l.add(3);
	    l.add(2);
		System.out.println(HeapPop(l));
		System.out.println(l);
	}
}
