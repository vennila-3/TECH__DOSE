import java.util.*;
public class Main
{   
    static void inckey(int[] a,int i,int diff)
    {
        if(diff<0)
        return;
        a[i]+=diff;
        while(i>1)
        {
        if(a[i/2]<a[i])
           {
             int t=a[i/2];
             a[i/2]=a[i];
             a[i]=t;
           }
           i=i/2;
        }
    }
	public static void main(String[] args) {
	    int arr[]={0,9,8,7,6,5,4,3,2,1,0,-1};
	    inckey(arr,5,5);
	    for(int i:arr)
		System.out.print(i+" ");
	}
}
