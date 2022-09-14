import java.util.*;
public class Frequency
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int al[]=new int[26];
		for(int i=0;i<s.length();i++)
		al[s.charAt(i)-'a']++;
		
		
		for(int i=0;i<s.length();i++)
		System.out.println(s.charAt(i)+"-"+al[s.charAt(i)-'a']);
	}
}
