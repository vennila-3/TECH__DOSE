import java.util.*;
public class Main
{   static int findGCD(int a,int b)
{
    if(b==0)
    return a;
    else
    return findGCD(b,a%b);
}
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int gcd=findGCD(a,b);
	    int lcm=Math.abs(a*b)/gcd;
		System.out.println("LCM = "+lcm);
		
	}
}
