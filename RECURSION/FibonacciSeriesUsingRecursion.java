import java.util.*;
public class Main
{
    static int fibo(int n)
    {
        if(n==0||n==1)  //basecase
        {
         return n;
        }
      return fibo(n-1)+fibo(n-2);  //recursion logic
    }
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(fibo(n));
		
	}
  }
