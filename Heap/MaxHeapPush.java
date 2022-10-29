import java.util.*;
public class Main
{   
    static int[] heapush(int[] arr,int val)
    {
        arr=Arrays.copyOf(arr,arr.length+1);
        arr[arr.length-1]=val;
        int i=arr.length-1;
        while(i>1)
        {
           if(arr[i/2]<arr[i])
           {
             int t=arr[i/2];
             arr[i/2]=arr[i];
             arr[i]=t;
           }
           i=i/2;
        }
        return arr;
    }
	public static void main(String[] args) {
	    int arr[]={0,20,9,8,7,6,5,4,3};
	    arr=heapush(arr,12);
	    for(int i:arr)
		System.out.print(i+" ");
	}
}
