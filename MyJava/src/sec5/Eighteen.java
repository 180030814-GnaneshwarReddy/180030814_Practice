package sec5;
import java.util.*;
public class Eighteen 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0;
		int o=n;
		while(n > 0)   
		{  
			int rr = n % 10;  
			r =r * 10 + rr;  
			n = n/10;  
		}  
		if(r==o)
			System.out.println("Palindrome");
		else
		{
			System.out.println("Not a Palindrome");
		}
		sc.close();
	}

}