public class Main
{
	public static void main(String[] args) {
   int a[]={5,2,7,3,1};
   //selection sorting 
   int minIndex,i,j;
   for(i=0;i<5-1;i++)
   {  minIndex=i;
      for(j=i+1;j<5;j++)
      { //selecting
        if(a[minIndex]>a[j])
        minIndex=j;
      }
      //swapping
      int temp=a[minIndex];
      a[minIndex]=a[i];
      a[i]=temp;
   }
  for(i=0;i<5;i++)
  System.out.print(a[i]+" ");
	}
}
