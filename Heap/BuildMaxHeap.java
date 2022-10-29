import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a[]={0,3,6,5,0,8,2,1,9};
	    buildheap(a,9);
	    for(int i:a)
		System.out.print(i+" ");
	}
	static void buildheap(int[] arr,int n)
	{
	    for(int i=(n/2)+1;i>0;i--)
	    heapify(arr,i);
	}
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
	        swap(arr,i,lar);
	        heapify(arr,lar);
	    }
	}
	static void swap(int[] a,int i,int j)
	{
	    int temp=a[i];
	    a[i]=a[j];
	    a[j]=temp;
	}
}
