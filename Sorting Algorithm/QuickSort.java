import java.util.*;
class Main {
  public static void quickSort(int[] a, int low,int high){
    if(low==high){
      return;
    }
    int pivot=high,i=low-1,flag=0;
    for(int j=low;j<=high;j++){
      if(a[j]<=a[pivot]){
        i++;
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        flag=1;
      }
    }
    if(flag==1){
      quickSort(a,low,i-1);
      quickSort(a,i+1,high);
    }
  }
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    quickSort(a,0,n-1);
    for(int i=0;i<n;i++){
      System.out.print(a[i]+" ");
    }
    sc.close();
  }
}
