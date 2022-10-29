import java.util.*;
public class Main
{   static void Heapify(int[] arr,int i)
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
	        swap(arr,i,lar);
	        Heapify(arr,lar);
	    }
	}
	static void swap(int[] a,int i,int j)
	{
	    int temp=a[i];
	    a[i]=a[j];
	    a[j]=temp;
	}
    static void deckey(int[] a,int i,int diff)
    {
        if(diff>0)
        return;
        a[i]+=diff;
        Heapify(a,i);
    }
	public static void main(String[] args) {
	    int arr[]={0,9,8,7,6,5,4,3,2,1,0,-1};
	    deckey(arr,2,-6);
	    for(int i:arr)
		System.out.print(i+" ");
	}
}
