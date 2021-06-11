package strings;

import java.util.Scanner;

public class String11 
{
	public static void main(String[] args) 
	{
		String s;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		s=in.nextLine();
		in.close();
	    int n=s.length();
	    System.out.println(s.substring(1,n-1));
	}
}
