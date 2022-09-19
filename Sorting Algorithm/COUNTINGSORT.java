import java.util.*;

public class CountingSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n+1];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        max=max+1;
        int has[]=new int[max];
        int ansArray[]=new int[n];
        for(int i=0;i<n;i++)
        {
            has[arr[i]]++;
        }
        //find the cummulative sum of all the elements in the has
        for(int i=1;i<max;i++)
        {
            has[i]=has[i-1]+has[i];
        }
        for(int i=0;i<n;i++)
        {
          int pos=--has[arr[i]];
          ansArray[pos]=arr[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(ansArray[i]+" ");
        }

    }
    
}