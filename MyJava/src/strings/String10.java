package strings;

import java.util.Scanner;

public class String10 
{
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
		String str;
		System.out.println("Enter a string");
		str=in.nextLine();
		in.close();
        int n=str.length();
        if(n%2==0)
        	System.out.println(str.substring(0,n/2));
        else
        	System.out.println("null");
        in.close();
	}

}
