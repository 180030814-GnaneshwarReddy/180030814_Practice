package strings;

import java.util.Scanner;

public class String2 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter two Strings");
		String str,str1;
		Scanner in=new Scanner(System.in);
		str=in.nextLine();
		str1=in.nextLine();
		in.close();
		str=str.concat(str1);
		System.out.println(str.toLowerCase());
		in.close();
	}
}
