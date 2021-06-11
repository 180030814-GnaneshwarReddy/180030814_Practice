package strings;

import java.util.Scanner;

public class String6 
{
	public static void main(String[] args)
	{
		System.out.println("Enter two Strings");
		Scanner in=new Scanner(System.in);
		String s,s1;
		int i;
		s=in.nextLine();
		s1=in.nextLine();
		int n=s.length();
		int n1=s1.length();
		in.close();
		if(n==n1)
		{
		   for(i=0;i<n;i++)
		  {
			 System.out.print(s.charAt(i));
			 System.out.print(s1.charAt(i));
		  }
		}
		else
		{
			System.out.println("Please Enter two Strings with same length");
		}
		in.close();
	}
}
