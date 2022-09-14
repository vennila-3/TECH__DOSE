import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int f;
		while(n>0)
		{
		    f=n%10;
		    System.out.print(f+" ");
		    n=n/10;
		}
	}
}
