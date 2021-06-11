package strings;

import java.util.Scanner;

public class String5 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter a string");
		String str,f,l;
		str=in.nextLine();
		in.close();
		int n=str.length();
		f=str.substring(0,1);
		l=str.substring(n-1,n);
		if(f.equals("x") && l.equals("x"))
		{
			System.out.println(str.substring(1,n-1));
		}
		else
		{
			System.out.println(str);
		}
		in.close();
	}
}
