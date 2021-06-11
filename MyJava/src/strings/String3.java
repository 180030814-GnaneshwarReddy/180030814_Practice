package strings;

import java.util.Scanner;

public class String3 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String str;
		str=in.nextLine();
		in.close();
		int n=str.length();
		String f=str.substring(0,2);
		for(int i=0;i<n;i++)
		{
			System.out.print(f);
		}
		in.close();
	}
}
