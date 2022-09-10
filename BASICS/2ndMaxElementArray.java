import java.util.*;
public class Main
{
	public static void main(String[] args) {
   Scanner sc=new Scanner (System.in);
   int n=sc.nextInt(); 
   int a[]=new int[n];
   for(int i=0;i<n;i++)
   a[i]=sc.nextInt();
   boolean isswapped=false;
   //Bubble sorting algorithm
  for(int i=n-1;i>0;i--)
  {  isswapped=false;
     for(int j=0;j<n-1;j++)
     {
        if(a[j]>a[j+1])
        {
          int temp=a[j];
          a[j]=a[j+1];
          a[j+1]=temp;
          isswapped=true;
        }
     }
     if(isswapped==false)
     break;
  }
   
  
  System.out.print(a[1]);
	}
