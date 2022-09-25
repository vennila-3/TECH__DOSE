import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int m=sc.nextInt();
	    int n=sc.nextInt();
		int a[]=new int[m];
		int b[]=new int[n];
		for(int i=0;i<m;i++)
		a[i]=sc.nextInt();
		for(int j=0;j<n;j++)
		b[j]=sc.nextInt();
		for(int i=n-1;i>=0;i--)
		{  int last=a[m-1],j;
		  for(j=m-2;j>=0&&a[j]>b[i];j--)
		  a[j+1]=a[j];
		  if(j!=m-2 || last>b[i])
		  {a[j+1]=b[i];
		   b[i]=last;
		  }
		  
		}
	for(int i:a)
	System.out.print(i+ " ");
	for(int i:b)
	System.out.print(i+ " ");
	}
}

