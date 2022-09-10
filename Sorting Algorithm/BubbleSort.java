public class Main
{
	public static void main(String[] args) {
   int a[]={5,2,7,3,1},n=5;
   boolean isswapped=false;
   //Bubble sorting 
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
   
  for(int i=0;i<n;i++)
  System.out.print(a[i]+" ");
	}
}
