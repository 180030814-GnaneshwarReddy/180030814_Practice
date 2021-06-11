package sec5;
import java.util.Scanner;
public class Seventeen
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=0;
		while(n > 0)   
		{  
			int rr = n % 10;  
			r =r * 10 + rr;  
			n = n/10;  
		}  
		System.out.println(r);
		sc.close();
	}
}